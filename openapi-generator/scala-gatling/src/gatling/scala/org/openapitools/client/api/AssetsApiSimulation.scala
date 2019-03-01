package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class AssetsApiSimulation extends Simulation {

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
    val getAllAssetCurrentLocationsPerSecond = config.getDouble("performance.operationsPerSecond.getAllAssetCurrentLocations") * rateMultiplier * instanceMultiplier
    val getAllAssetsPerSecond = config.getDouble("performance.operationsPerSecond.getAllAssets") * rateMultiplier * instanceMultiplier
    val getAssetLocationPerSecond = config.getDouble("performance.operationsPerSecond.getAssetLocation") * rateMultiplier * instanceMultiplier
    val getAssetReeferPerSecond = config.getDouble("performance.operationsPerSecond.getAssetReefer") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val GetAllAssetCurrentLocationsQUERYFeeder = csv(userDataDirectory + File.separator + "getAllAssetCurrentLocations-queryParams.csv").random
    val GetAllAssetsQUERYFeeder = csv(userDataDirectory + File.separator + "getAllAssets-queryParams.csv").random
    val GetAssetLocationQUERYFeeder = csv(userDataDirectory + File.separator + "getAssetLocation-queryParams.csv").random
    val GetAssetLocationPATHFeeder = csv(userDataDirectory + File.separator + "getAssetLocation-pathParams.csv").random
    val GetAssetReeferQUERYFeeder = csv(userDataDirectory + File.separator + "getAssetReefer-queryParams.csv").random
    val GetAssetReeferPATHFeeder = csv(userDataDirectory + File.separator + "getAssetReefer-pathParams.csv").random

    // Setup all scenarios

    
    val scngetAllAssetCurrentLocations = scenario("getAllAssetCurrentLocationsSimulation")
        .feed(GetAllAssetCurrentLocationsQUERYFeeder)
        .exec(http("getAllAssetCurrentLocations")
        .httpRequest("GET","/fleet/assets/locations")
        .queryParam("access_token","${access_token}")
        .queryParam("group_id","${group_id}")
)

    // Run scngetAllAssetCurrentLocations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAllAssetCurrentLocations.inject(
        rampUsersPerSec(1) to(getAllAssetCurrentLocationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAllAssetCurrentLocationsPerSecond) during(durationSeconds),
        rampUsersPerSec(getAllAssetCurrentLocationsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAllAssets = scenario("getAllAssetsSimulation")
        .feed(GetAllAssetsQUERYFeeder)
        .exec(http("getAllAssets")
        .httpRequest("GET","/fleet/assets")
        .queryParam("access_token","${access_token}")
        .queryParam("group_id","${group_id}")
)

    // Run scngetAllAssets with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAllAssets.inject(
        rampUsersPerSec(1) to(getAllAssetsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAllAssetsPerSecond) during(durationSeconds),
        rampUsersPerSec(getAllAssetsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAssetLocation = scenario("getAssetLocationSimulation")
        .feed(GetAssetLocationQUERYFeeder)
        .feed(GetAssetLocationPATHFeeder)
        .exec(http("getAssetLocation")
        .httpRequest("GET","/fleet/assets/${asset_id}/locations")
        .queryParam("access_token","${access_token}")
        .queryParam("startMs","${startMs}")
        .queryParam("endMs","${endMs}")
)

    // Run scngetAssetLocation with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAssetLocation.inject(
        rampUsersPerSec(1) to(getAssetLocationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAssetLocationPerSecond) during(durationSeconds),
        rampUsersPerSec(getAssetLocationPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAssetReefer = scenario("getAssetReeferSimulation")
        .feed(GetAssetReeferQUERYFeeder)
        .feed(GetAssetReeferPATHFeeder)
        .exec(http("getAssetReefer")
        .httpRequest("GET","/fleet/assets/${asset_id}/reefer")
        .queryParam("access_token","${access_token}")
        .queryParam("startMs","${startMs}")
        .queryParam("endMs","${endMs}")
)

    // Run scngetAssetReefer with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAssetReefer.inject(
        rampUsersPerSec(1) to(getAssetReeferPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAssetReeferPerSecond) during(durationSeconds),
        rampUsersPerSec(getAssetReeferPerSecond) to(1) during(rampDownSeconds)
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
