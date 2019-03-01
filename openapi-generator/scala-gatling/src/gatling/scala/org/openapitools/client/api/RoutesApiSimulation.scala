package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class RoutesApiSimulation extends Simulation {

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
    val createDispatchRoutePerSecond = config.getDouble("performance.operationsPerSecond.createDispatchRoute") * rateMultiplier * instanceMultiplier
    val createDriverDispatchRoutePerSecond = config.getDouble("performance.operationsPerSecond.createDriverDispatchRoute") * rateMultiplier * instanceMultiplier
    val createVehicleDispatchRoutePerSecond = config.getDouble("performance.operationsPerSecond.createVehicleDispatchRoute") * rateMultiplier * instanceMultiplier
    val deleteDispatchRouteByIdPerSecond = config.getDouble("performance.operationsPerSecond.deleteDispatchRouteById") * rateMultiplier * instanceMultiplier
    val fetchAllDispatchRoutesPerSecond = config.getDouble("performance.operationsPerSecond.fetchAllDispatchRoutes") * rateMultiplier * instanceMultiplier
    val fetchAllRouteJobUpdatesPerSecond = config.getDouble("performance.operationsPerSecond.fetchAllRouteJobUpdates") * rateMultiplier * instanceMultiplier
    val getDispatchRouteByIdPerSecond = config.getDouble("performance.operationsPerSecond.getDispatchRouteById") * rateMultiplier * instanceMultiplier
    val getDispatchRouteHistoryPerSecond = config.getDouble("performance.operationsPerSecond.getDispatchRouteHistory") * rateMultiplier * instanceMultiplier
    val getDispatchRoutesByDriverIdPerSecond = config.getDouble("performance.operationsPerSecond.getDispatchRoutesByDriverId") * rateMultiplier * instanceMultiplier
    val getDispatchRoutesByVehicleIdPerSecond = config.getDouble("performance.operationsPerSecond.getDispatchRoutesByVehicleId") * rateMultiplier * instanceMultiplier
    val updateDispatchRouteByIdPerSecond = config.getDouble("performance.operationsPerSecond.updateDispatchRouteById") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val createDispatchRouteQUERYFeeder = csv(userDataDirectory + File.separator + "createDispatchRoute-queryParams.csv").random
    val createDriverDispatchRouteQUERYFeeder = csv(userDataDirectory + File.separator + "createDriverDispatchRoute-queryParams.csv").random
    val createDriverDispatchRoutePATHFeeder = csv(userDataDirectory + File.separator + "createDriverDispatchRoute-pathParams.csv").random
    val createVehicleDispatchRouteQUERYFeeder = csv(userDataDirectory + File.separator + "createVehicleDispatchRoute-queryParams.csv").random
    val createVehicleDispatchRoutePATHFeeder = csv(userDataDirectory + File.separator + "createVehicleDispatchRoute-pathParams.csv").random
    val deleteDispatchRouteByIdQUERYFeeder = csv(userDataDirectory + File.separator + "deleteDispatchRouteById-queryParams.csv").random
    val deleteDispatchRouteByIdPATHFeeder = csv(userDataDirectory + File.separator + "deleteDispatchRouteById-pathParams.csv").random
    val fetchAllDispatchRoutesQUERYFeeder = csv(userDataDirectory + File.separator + "fetchAllDispatchRoutes-queryParams.csv").random
    val fetchAllRouteJobUpdatesQUERYFeeder = csv(userDataDirectory + File.separator + "fetchAllRouteJobUpdates-queryParams.csv").random
    val getDispatchRouteByIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDispatchRouteById-queryParams.csv").random
    val getDispatchRouteByIdPATHFeeder = csv(userDataDirectory + File.separator + "getDispatchRouteById-pathParams.csv").random
    val getDispatchRouteHistoryQUERYFeeder = csv(userDataDirectory + File.separator + "getDispatchRouteHistory-queryParams.csv").random
    val getDispatchRouteHistoryPATHFeeder = csv(userDataDirectory + File.separator + "getDispatchRouteHistory-pathParams.csv").random
    val getDispatchRoutesByDriverIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDispatchRoutesByDriverId-queryParams.csv").random
    val getDispatchRoutesByDriverIdPATHFeeder = csv(userDataDirectory + File.separator + "getDispatchRoutesByDriverId-pathParams.csv").random
    val getDispatchRoutesByVehicleIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDispatchRoutesByVehicleId-queryParams.csv").random
    val getDispatchRoutesByVehicleIdPATHFeeder = csv(userDataDirectory + File.separator + "getDispatchRoutesByVehicleId-pathParams.csv").random
    val updateDispatchRouteByIdQUERYFeeder = csv(userDataDirectory + File.separator + "updateDispatchRouteById-queryParams.csv").random
    val updateDispatchRouteByIdPATHFeeder = csv(userDataDirectory + File.separator + "updateDispatchRouteById-pathParams.csv").random

    // Setup all scenarios

    
    val scncreateDispatchRoute = scenario("createDispatchRouteSimulation")
        .feed(createDispatchRouteQUERYFeeder)
        .exec(http("createDispatchRoute")
        .httpRequest("POST","/fleet/dispatch/routes")
        .queryParam("access_token","${access_token}")
)

    // Run scncreateDispatchRoute with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateDispatchRoute.inject(
        rampUsersPerSec(1) to(createDispatchRoutePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createDispatchRoutePerSecond) during(durationSeconds),
        rampUsersPerSec(createDispatchRoutePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateDriverDispatchRoute = scenario("createDriverDispatchRouteSimulation")
        .feed(createDriverDispatchRouteQUERYFeeder)
        .feed(createDriverDispatchRoutePATHFeeder)
        .exec(http("createDriverDispatchRoute")
        .httpRequest("POST","/fleet/drivers/${driver_id}/dispatch/routes")
        .queryParam("access_token","${access_token}")
)

    // Run scncreateDriverDispatchRoute with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateDriverDispatchRoute.inject(
        rampUsersPerSec(1) to(createDriverDispatchRoutePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createDriverDispatchRoutePerSecond) during(durationSeconds),
        rampUsersPerSec(createDriverDispatchRoutePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateVehicleDispatchRoute = scenario("createVehicleDispatchRouteSimulation")
        .feed(createVehicleDispatchRouteQUERYFeeder)
        .feed(createVehicleDispatchRoutePATHFeeder)
        .exec(http("createVehicleDispatchRoute")
        .httpRequest("POST","/fleet/vehicles/${vehicle_id}/dispatch/routes")
        .queryParam("access_token","${access_token}")
)

    // Run scncreateVehicleDispatchRoute with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateVehicleDispatchRoute.inject(
        rampUsersPerSec(1) to(createVehicleDispatchRoutePerSecond) during(rampUpSeconds),
        constantUsersPerSec(createVehicleDispatchRoutePerSecond) during(durationSeconds),
        rampUsersPerSec(createVehicleDispatchRoutePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteDispatchRouteById = scenario("deleteDispatchRouteByIdSimulation")
        .feed(deleteDispatchRouteByIdQUERYFeeder)
        .feed(deleteDispatchRouteByIdPATHFeeder)
        .exec(http("deleteDispatchRouteById")
        .httpRequest("DELETE","/fleet/dispatch/routes/${route_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scndeleteDispatchRouteById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteDispatchRouteById.inject(
        rampUsersPerSec(1) to(deleteDispatchRouteByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteDispatchRouteByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteDispatchRouteByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfetchAllDispatchRoutes = scenario("fetchAllDispatchRoutesSimulation")
        .feed(fetchAllDispatchRoutesQUERYFeeder)
        .exec(http("fetchAllDispatchRoutes")
        .httpRequest("GET","/fleet/dispatch/routes")
        .queryParam("duration","${duration}")
        .queryParam("access_token","${access_token}")
        .queryParam("end_time","${end_time}")
        .queryParam("group_id","${group_id}")
)

    // Run scnfetchAllDispatchRoutes with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfetchAllDispatchRoutes.inject(
        rampUsersPerSec(1) to(fetchAllDispatchRoutesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(fetchAllDispatchRoutesPerSecond) during(durationSeconds),
        rampUsersPerSec(fetchAllDispatchRoutesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfetchAllRouteJobUpdates = scenario("fetchAllRouteJobUpdatesSimulation")
        .feed(fetchAllRouteJobUpdatesQUERYFeeder)
        .exec(http("fetchAllRouteJobUpdates")
        .httpRequest("GET","/fleet/dispatch/routes/job_updates")
        .queryParam("access_token","${access_token}")
        .queryParam("include","${include}")
        .queryParam("sequence_id","${sequence_id}")
        .queryParam("group_id","${group_id}")
)

    // Run scnfetchAllRouteJobUpdates with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfetchAllRouteJobUpdates.inject(
        rampUsersPerSec(1) to(fetchAllRouteJobUpdatesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(fetchAllRouteJobUpdatesPerSecond) during(durationSeconds),
        rampUsersPerSec(fetchAllRouteJobUpdatesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetDispatchRouteById = scenario("getDispatchRouteByIdSimulation")
        .feed(getDispatchRouteByIdQUERYFeeder)
        .feed(getDispatchRouteByIdPATHFeeder)
        .exec(http("getDispatchRouteById")
        .httpRequest("GET","/fleet/dispatch/routes/${route_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scngetDispatchRouteById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDispatchRouteById.inject(
        rampUsersPerSec(1) to(getDispatchRouteByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDispatchRouteByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getDispatchRouteByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetDispatchRouteHistory = scenario("getDispatchRouteHistorySimulation")
        .feed(getDispatchRouteHistoryQUERYFeeder)
        .feed(getDispatchRouteHistoryPATHFeeder)
        .exec(http("getDispatchRouteHistory")
        .httpRequest("GET","/fleet/dispatch/routes/${route_id}/history")
        .queryParam("access_token","${access_token}")
        .queryParam("start_time","${start_time}")
        .queryParam("end_time","${end_time}")
)

    // Run scngetDispatchRouteHistory with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDispatchRouteHistory.inject(
        rampUsersPerSec(1) to(getDispatchRouteHistoryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDispatchRouteHistoryPerSecond) during(durationSeconds),
        rampUsersPerSec(getDispatchRouteHistoryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetDispatchRoutesByDriverId = scenario("getDispatchRoutesByDriverIdSimulation")
        .feed(getDispatchRoutesByDriverIdQUERYFeeder)
        .feed(getDispatchRoutesByDriverIdPATHFeeder)
        .exec(http("getDispatchRoutesByDriverId")
        .httpRequest("GET","/fleet/drivers/${driver_id}/dispatch/routes")
        .queryParam("duration","${duration}")
        .queryParam("access_token","${access_token}")
        .queryParam("end_time","${end_time}")
)

    // Run scngetDispatchRoutesByDriverId with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDispatchRoutesByDriverId.inject(
        rampUsersPerSec(1) to(getDispatchRoutesByDriverIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDispatchRoutesByDriverIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getDispatchRoutesByDriverIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetDispatchRoutesByVehicleId = scenario("getDispatchRoutesByVehicleIdSimulation")
        .feed(getDispatchRoutesByVehicleIdQUERYFeeder)
        .feed(getDispatchRoutesByVehicleIdPATHFeeder)
        .exec(http("getDispatchRoutesByVehicleId")
        .httpRequest("GET","/fleet/vehicles/${vehicle_id}/dispatch/routes")
        .queryParam("duration","${duration}")
        .queryParam("access_token","${access_token}")
        .queryParam("end_time","${end_time}")
)

    // Run scngetDispatchRoutesByVehicleId with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDispatchRoutesByVehicleId.inject(
        rampUsersPerSec(1) to(getDispatchRoutesByVehicleIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDispatchRoutesByVehicleIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getDispatchRoutesByVehicleIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateDispatchRouteById = scenario("updateDispatchRouteByIdSimulation")
        .feed(updateDispatchRouteByIdQUERYFeeder)
        .feed(updateDispatchRouteByIdPATHFeeder)
        .exec(http("updateDispatchRouteById")
        .httpRequest("PUT","/fleet/dispatch/routes/${route_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scnupdateDispatchRouteById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateDispatchRouteById.inject(
        rampUsersPerSec(1) to(updateDispatchRouteByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateDispatchRouteByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(updateDispatchRouteByIdPerSecond) to(1) during(rampDownSeconds)
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
