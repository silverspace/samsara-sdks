package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class SafetyApiSimulation extends Simulation {

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
    val getDriverSafetyScorePerSecond = config.getDouble("performance.operationsPerSecond.getDriverSafetyScore") * rateMultiplier * instanceMultiplier
    val getVehicleHarshEventPerSecond = config.getDouble("performance.operationsPerSecond.getVehicleHarshEvent") * rateMultiplier * instanceMultiplier
    val getVehicleSafetyScorePerSecond = config.getDouble("performance.operationsPerSecond.getVehicleSafetyScore") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val GetDriverSafetyScoreQUERYFeeder = csv(userDataDirectory + File.separator + "getDriverSafetyScore-queryParams.csv").random
    val GetDriverSafetyScorePATHFeeder = csv(userDataDirectory + File.separator + "getDriverSafetyScore-pathParams.csv").random
    val GetVehicleHarshEventQUERYFeeder = csv(userDataDirectory + File.separator + "getVehicleHarshEvent-queryParams.csv").random
    val GetVehicleHarshEventPATHFeeder = csv(userDataDirectory + File.separator + "getVehicleHarshEvent-pathParams.csv").random
    val GetVehicleSafetyScoreQUERYFeeder = csv(userDataDirectory + File.separator + "getVehicleSafetyScore-queryParams.csv").random
    val GetVehicleSafetyScorePATHFeeder = csv(userDataDirectory + File.separator + "getVehicleSafetyScore-pathParams.csv").random

    // Setup all scenarios

    
    val scngetDriverSafetyScore = scenario("getDriverSafetyScoreSimulation")
        .feed(GetDriverSafetyScoreQUERYFeeder)
        .feed(GetDriverSafetyScorePATHFeeder)
        .exec(http("getDriverSafetyScore")
        .httpRequest("GET","/fleet/drivers/${driverId}/safety/score")
        .queryParam("access_token","${access_token}")
        .queryParam("startMs","${startMs}")
        .queryParam("endMs","${endMs}")
)

    // Run scngetDriverSafetyScore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDriverSafetyScore.inject(
        rampUsersPerSec(1) to(getDriverSafetyScorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDriverSafetyScorePerSecond) during(durationSeconds),
        rampUsersPerSec(getDriverSafetyScorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetVehicleHarshEvent = scenario("getVehicleHarshEventSimulation")
        .feed(GetVehicleHarshEventQUERYFeeder)
        .feed(GetVehicleHarshEventPATHFeeder)
        .exec(http("getVehicleHarshEvent")
        .httpRequest("GET","/fleet/vehicles/${vehicleId}/safety/harsh_event")
        .queryParam("access_token","${access_token}")
        .queryParam("timestamp","${timestamp}")
)

    // Run scngetVehicleHarshEvent with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetVehicleHarshEvent.inject(
        rampUsersPerSec(1) to(getVehicleHarshEventPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getVehicleHarshEventPerSecond) during(durationSeconds),
        rampUsersPerSec(getVehicleHarshEventPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetVehicleSafetyScore = scenario("getVehicleSafetyScoreSimulation")
        .feed(GetVehicleSafetyScoreQUERYFeeder)
        .feed(GetVehicleSafetyScorePATHFeeder)
        .exec(http("getVehicleSafetyScore")
        .httpRequest("GET","/fleet/vehicles/${vehicleId}/safety/score")
        .queryParam("access_token","${access_token}")
        .queryParam("startMs","${startMs}")
        .queryParam("endMs","${endMs}")
)

    // Run scngetVehicleSafetyScore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetVehicleSafetyScore.inject(
        rampUsersPerSec(1) to(getVehicleSafetyScorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getVehicleSafetyScorePerSecond) during(durationSeconds),
        rampUsersPerSec(getVehicleSafetyScorePerSecond) to(1) during(rampDownSeconds)
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
