package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class DriversApiSimulation extends Simulation {

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
    val createDriverPerSecond = config.getDouble("performance.operationsPerSecond.createDriver") * rateMultiplier * instanceMultiplier
    val deactivateDriverPerSecond = config.getDouble("performance.operationsPerSecond.deactivateDriver") * rateMultiplier * instanceMultiplier
    val getAllDeactivatedDriversPerSecond = config.getDouble("performance.operationsPerSecond.getAllDeactivatedDrivers") * rateMultiplier * instanceMultiplier
    val getDeactivatedDriverByIdPerSecond = config.getDouble("performance.operationsPerSecond.getDeactivatedDriverById") * rateMultiplier * instanceMultiplier
    val getDriverByIdPerSecond = config.getDouble("performance.operationsPerSecond.getDriverById") * rateMultiplier * instanceMultiplier
    val reactivateDriverByIdPerSecond = config.getDouble("performance.operationsPerSecond.reactivateDriverById") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val createDriverQUERYFeeder = csv(userDataDirectory + File.separator + "createDriver-queryParams.csv").random
    val deactivateDriverQUERYFeeder = csv(userDataDirectory + File.separator + "deactivateDriver-queryParams.csv").random
    val deactivateDriverPATHFeeder = csv(userDataDirectory + File.separator + "deactivateDriver-pathParams.csv").random
    val getAllDeactivatedDriversQUERYFeeder = csv(userDataDirectory + File.separator + "getAllDeactivatedDrivers-queryParams.csv").random
    val getDeactivatedDriverByIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDeactivatedDriverById-queryParams.csv").random
    val getDeactivatedDriverByIdPATHFeeder = csv(userDataDirectory + File.separator + "getDeactivatedDriverById-pathParams.csv").random
    val getDriverByIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDriverById-queryParams.csv").random
    val getDriverByIdPATHFeeder = csv(userDataDirectory + File.separator + "getDriverById-pathParams.csv").random
    val reactivateDriverByIdQUERYFeeder = csv(userDataDirectory + File.separator + "reactivateDriverById-queryParams.csv").random
    val reactivateDriverByIdPATHFeeder = csv(userDataDirectory + File.separator + "reactivateDriverById-pathParams.csv").random

    // Setup all scenarios

    
    val scncreateDriver = scenario("createDriverSimulation")
        .feed(createDriverQUERYFeeder)
        .exec(http("createDriver")
        .httpRequest("POST","/fleet/drivers/create")
        .queryParam("access_token","${access_token}")
)

    // Run scncreateDriver with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateDriver.inject(
        rampUsersPerSec(1) to(createDriverPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createDriverPerSecond) during(durationSeconds),
        rampUsersPerSec(createDriverPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeactivateDriver = scenario("deactivateDriverSimulation")
        .feed(deactivateDriverQUERYFeeder)
        .feed(deactivateDriverPATHFeeder)
        .exec(http("deactivateDriver")
        .httpRequest("DELETE","/fleet/drivers/${driver_id_or_external_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scndeactivateDriver with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeactivateDriver.inject(
        rampUsersPerSec(1) to(deactivateDriverPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deactivateDriverPerSecond) during(durationSeconds),
        rampUsersPerSec(deactivateDriverPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAllDeactivatedDrivers = scenario("getAllDeactivatedDriversSimulation")
        .feed(getAllDeactivatedDriversQUERYFeeder)
        .exec(http("getAllDeactivatedDrivers")
        .httpRequest("GET","/fleet/drivers/inactive")
        .queryParam("access_token","${access_token}")
        .queryParam("group_id","${group_id}")
)

    // Run scngetAllDeactivatedDrivers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAllDeactivatedDrivers.inject(
        rampUsersPerSec(1) to(getAllDeactivatedDriversPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAllDeactivatedDriversPerSecond) during(durationSeconds),
        rampUsersPerSec(getAllDeactivatedDriversPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetDeactivatedDriverById = scenario("getDeactivatedDriverByIdSimulation")
        .feed(getDeactivatedDriverByIdQUERYFeeder)
        .feed(getDeactivatedDriverByIdPATHFeeder)
        .exec(http("getDeactivatedDriverById")
        .httpRequest("GET","/fleet/drivers/inactive/${driver_id_or_external_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scngetDeactivatedDriverById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDeactivatedDriverById.inject(
        rampUsersPerSec(1) to(getDeactivatedDriverByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDeactivatedDriverByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getDeactivatedDriverByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetDriverById = scenario("getDriverByIdSimulation")
        .feed(getDriverByIdQUERYFeeder)
        .feed(getDriverByIdPATHFeeder)
        .exec(http("getDriverById")
        .httpRequest("GET","/fleet/drivers/${driver_id_or_external_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scngetDriverById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDriverById.inject(
        rampUsersPerSec(1) to(getDriverByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDriverByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getDriverByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnreactivateDriverById = scenario("reactivateDriverByIdSimulation")
        .feed(reactivateDriverByIdQUERYFeeder)
        .feed(reactivateDriverByIdPATHFeeder)
        .exec(http("reactivateDriverById")
        .httpRequest("PUT","/fleet/drivers/inactive/${driver_id_or_external_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scnreactivateDriverById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnreactivateDriverById.inject(
        rampUsersPerSec(1) to(reactivateDriverByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(reactivateDriverByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(reactivateDriverByIdPerSecond) to(1) during(rampDownSeconds)
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
