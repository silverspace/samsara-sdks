package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class UsersApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://api.samsara.com/v1")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val deleteUserByIdPerSecond = config.getDouble("performance.operationsPerSecond.deleteUserById") * rateMultiplier * instanceMultiplier
    val getUserByIdPerSecond = config.getDouble("performance.operationsPerSecond.getUserById") * rateMultiplier * instanceMultiplier
    val listUserRolesPerSecond = config.getDouble("performance.operationsPerSecond.listUserRoles") * rateMultiplier * instanceMultiplier
    val listUsersPerSecond = config.getDouble("performance.operationsPerSecond.listUsers") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deleteUserByIdQUERYFeeder = csv(userDataDirectory + File.separator + "deleteUserById-queryParams.csv").random
    val deleteUserByIdPATHFeeder = csv(userDataDirectory + File.separator + "deleteUserById-pathParams.csv").random
    val getUserByIdQUERYFeeder = csv(userDataDirectory + File.separator + "getUserById-queryParams.csv").random
    val getUserByIdPATHFeeder = csv(userDataDirectory + File.separator + "getUserById-pathParams.csv").random
    val listUserRolesQUERYFeeder = csv(userDataDirectory + File.separator + "listUserRoles-queryParams.csv").random
    val list_usersQUERYFeeder = csv(userDataDirectory + File.separator + "listUsers-queryParams.csv").random

    // Setup all scenarios

    
    val scndeleteUserById = scenario("deleteUserByIdSimulation")
        .feed(deleteUserByIdQUERYFeeder)
        .feed(deleteUserByIdPATHFeeder)
        .exec(http("deleteUserById")
        .httpRequest("DELETE","/users/${userId}")
        .queryParam("access_token","${access_token}")
)

    // Run scndeleteUserById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteUserById.inject(
        rampUsersPerSec(1) to(deleteUserByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteUserByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteUserByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetUserById = scenario("getUserByIdSimulation")
        .feed(getUserByIdQUERYFeeder)
        .feed(getUserByIdPATHFeeder)
        .exec(http("getUserById")
        .httpRequest("GET","/users/${userId}")
        .queryParam("access_token","${access_token}")
)

    // Run scngetUserById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetUserById.inject(
        rampUsersPerSec(1) to(getUserByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getUserByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getUserByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistUserRoles = scenario("listUserRolesSimulation")
        .feed(listUserRolesQUERYFeeder)
        .exec(http("listUserRoles")
        .httpRequest("GET","/user_roles")
        .queryParam("access_token","${access_token}")
)

    // Run scnlistUserRoles with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistUserRoles.inject(
        rampUsersPerSec(1) to(listUserRolesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listUserRolesPerSecond) during(durationSeconds),
        rampUsersPerSec(listUserRolesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistUsers = scenario("listUsersSimulation")
        .feed(list_usersQUERYFeeder)
        .exec(http("listUsers")
        .httpRequest("GET","/users")
        .queryParam("access_token","${access_token}")
)

    // Run scnlistUsers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistUsers.inject(
        rampUsersPerSec(1) to(listUsersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listUsersPerSecond) during(durationSeconds),
        rampUsersPerSec(listUsersPerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
