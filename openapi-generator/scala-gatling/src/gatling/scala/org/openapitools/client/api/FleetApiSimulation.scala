package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class FleetApiSimulation extends Simulation {

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
    val addFleetAddressPerSecond = config.getDouble("performance.operationsPerSecond.addFleetAddress") * rateMultiplier * instanceMultiplier
    val addOrganizationAddressesPerSecond = config.getDouble("performance.operationsPerSecond.addOrganizationAddresses") * rateMultiplier * instanceMultiplier
    val createDispatchRoutePerSecond = config.getDouble("performance.operationsPerSecond.createDispatchRoute") * rateMultiplier * instanceMultiplier
    val createDriverPerSecond = config.getDouble("performance.operationsPerSecond.createDriver") * rateMultiplier * instanceMultiplier
    val createDriverDispatchRoutePerSecond = config.getDouble("performance.operationsPerSecond.createDriverDispatchRoute") * rateMultiplier * instanceMultiplier
    val createDriverDocumentPerSecond = config.getDouble("performance.operationsPerSecond.createDriverDocument") * rateMultiplier * instanceMultiplier
    val createDvirPerSecond = config.getDouble("performance.operationsPerSecond.createDvir") * rateMultiplier * instanceMultiplier
    val createVehicleDispatchRoutePerSecond = config.getDouble("performance.operationsPerSecond.createVehicleDispatchRoute") * rateMultiplier * instanceMultiplier
    val deactivateDriverPerSecond = config.getDouble("performance.operationsPerSecond.deactivateDriver") * rateMultiplier * instanceMultiplier
    val deleteDispatchRouteByIdPerSecond = config.getDouble("performance.operationsPerSecond.deleteDispatchRouteById") * rateMultiplier * instanceMultiplier
    val deleteOrganizationAddressPerSecond = config.getDouble("performance.operationsPerSecond.deleteOrganizationAddress") * rateMultiplier * instanceMultiplier
    val fetchAllDispatchRoutesPerSecond = config.getDouble("performance.operationsPerSecond.fetchAllDispatchRoutes") * rateMultiplier * instanceMultiplier
    val fetchAllRouteJobUpdatesPerSecond = config.getDouble("performance.operationsPerSecond.fetchAllRouteJobUpdates") * rateMultiplier * instanceMultiplier
    val getAllAssetCurrentLocationsPerSecond = config.getDouble("performance.operationsPerSecond.getAllAssetCurrentLocations") * rateMultiplier * instanceMultiplier
    val getAllAssetsPerSecond = config.getDouble("performance.operationsPerSecond.getAllAssets") * rateMultiplier * instanceMultiplier
    val getAllDeactivatedDriversPerSecond = config.getDouble("performance.operationsPerSecond.getAllDeactivatedDrivers") * rateMultiplier * instanceMultiplier
    val getAssetLocationPerSecond = config.getDouble("performance.operationsPerSecond.getAssetLocation") * rateMultiplier * instanceMultiplier
    val getAssetReeferPerSecond = config.getDouble("performance.operationsPerSecond.getAssetReefer") * rateMultiplier * instanceMultiplier
    val getDeactivatedDriverByIdPerSecond = config.getDouble("performance.operationsPerSecond.getDeactivatedDriverById") * rateMultiplier * instanceMultiplier
    val getDispatchRouteByIdPerSecond = config.getDouble("performance.operationsPerSecond.getDispatchRouteById") * rateMultiplier * instanceMultiplier
    val getDispatchRouteHistoryPerSecond = config.getDouble("performance.operationsPerSecond.getDispatchRouteHistory") * rateMultiplier * instanceMultiplier
    val getDispatchRoutesByDriverIdPerSecond = config.getDouble("performance.operationsPerSecond.getDispatchRoutesByDriverId") * rateMultiplier * instanceMultiplier
    val getDispatchRoutesByVehicleIdPerSecond = config.getDouble("performance.operationsPerSecond.getDispatchRoutesByVehicleId") * rateMultiplier * instanceMultiplier
    val getDriverByIdPerSecond = config.getDouble("performance.operationsPerSecond.getDriverById") * rateMultiplier * instanceMultiplier
    val getDriverDocumentTypesByOrgIdPerSecond = config.getDouble("performance.operationsPerSecond.getDriverDocumentTypesByOrgId") * rateMultiplier * instanceMultiplier
    val getDriverDocumentsByOrgIdPerSecond = config.getDouble("performance.operationsPerSecond.getDriverDocumentsByOrgId") * rateMultiplier * instanceMultiplier
    val getDriverSafetyScorePerSecond = config.getDouble("performance.operationsPerSecond.getDriverSafetyScore") * rateMultiplier * instanceMultiplier
    val getDvirsPerSecond = config.getDouble("performance.operationsPerSecond.getDvirs") * rateMultiplier * instanceMultiplier
    val getFleetDriversPerSecond = config.getDouble("performance.operationsPerSecond.getFleetDrivers") * rateMultiplier * instanceMultiplier
    val getFleetDriversHosDailyLogsPerSecond = config.getDouble("performance.operationsPerSecond.getFleetDriversHosDailyLogs") * rateMultiplier * instanceMultiplier
    val getFleetDriversSummaryPerSecond = config.getDouble("performance.operationsPerSecond.getFleetDriversSummary") * rateMultiplier * instanceMultiplier
    val getFleetHosAuthenticationLogsPerSecond = config.getDouble("performance.operationsPerSecond.getFleetHosAuthenticationLogs") * rateMultiplier * instanceMultiplier
    val getFleetHosLogsPerSecond = config.getDouble("performance.operationsPerSecond.getFleetHosLogs") * rateMultiplier * instanceMultiplier
    val getFleetHosLogsSummaryPerSecond = config.getDouble("performance.operationsPerSecond.getFleetHosLogsSummary") * rateMultiplier * instanceMultiplier
    val getFleetLocationsPerSecond = config.getDouble("performance.operationsPerSecond.getFleetLocations") * rateMultiplier * instanceMultiplier
    val getFleetMaintenanceListPerSecond = config.getDouble("performance.operationsPerSecond.getFleetMaintenanceList") * rateMultiplier * instanceMultiplier
    val getFleetTripsPerSecond = config.getDouble("performance.operationsPerSecond.getFleetTrips") * rateMultiplier * instanceMultiplier
    val getFleetVehiclePerSecond = config.getDouble("performance.operationsPerSecond.getFleetVehicle") * rateMultiplier * instanceMultiplier
    val getOrganizationAddressPerSecond = config.getDouble("performance.operationsPerSecond.getOrganizationAddress") * rateMultiplier * instanceMultiplier
    val getOrganizationAddressesPerSecond = config.getDouble("performance.operationsPerSecond.getOrganizationAddresses") * rateMultiplier * instanceMultiplier
    val getOrganizationContactPerSecond = config.getDouble("performance.operationsPerSecond.getOrganizationContact") * rateMultiplier * instanceMultiplier
    val getVehicleHarshEventPerSecond = config.getDouble("performance.operationsPerSecond.getVehicleHarshEvent") * rateMultiplier * instanceMultiplier
    val getVehicleLocationsPerSecond = config.getDouble("performance.operationsPerSecond.getVehicleLocations") * rateMultiplier * instanceMultiplier
    val getVehicleSafetyScorePerSecond = config.getDouble("performance.operationsPerSecond.getVehicleSafetyScore") * rateMultiplier * instanceMultiplier
    val getVehicleStatsPerSecond = config.getDouble("performance.operationsPerSecond.getVehicleStats") * rateMultiplier * instanceMultiplier
    val getVehiclesLocationsPerSecond = config.getDouble("performance.operationsPerSecond.getVehiclesLocations") * rateMultiplier * instanceMultiplier
    val listContactsPerSecond = config.getDouble("performance.operationsPerSecond.listContacts") * rateMultiplier * instanceMultiplier
    val listFleetPerSecond = config.getDouble("performance.operationsPerSecond.listFleet") * rateMultiplier * instanceMultiplier
    val patchFleetVehiclePerSecond = config.getDouble("performance.operationsPerSecond.patchFleetVehicle") * rateMultiplier * instanceMultiplier
    val reactivateDriverByIdPerSecond = config.getDouble("performance.operationsPerSecond.reactivateDriverById") * rateMultiplier * instanceMultiplier
    val updateDispatchRouteByIdPerSecond = config.getDouble("performance.operationsPerSecond.updateDispatchRouteById") * rateMultiplier * instanceMultiplier
    val updateOrganizationAddressPerSecond = config.getDouble("performance.operationsPerSecond.updateOrganizationAddress") * rateMultiplier * instanceMultiplier
    val updateVehiclesPerSecond = config.getDouble("performance.operationsPerSecond.updateVehicles") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val add_fleet_addressQUERYFeeder = csv(userDataDirectory + File.separator + "addFleetAddress-queryParams.csv").random
    val AddOrganizationAddressesQUERYFeeder = csv(userDataDirectory + File.separator + "addOrganizationAddresses-queryParams.csv").random
    val createDispatchRouteQUERYFeeder = csv(userDataDirectory + File.separator + "createDispatchRoute-queryParams.csv").random
    val createDriverQUERYFeeder = csv(userDataDirectory + File.separator + "createDriver-queryParams.csv").random
    val createDriverDispatchRouteQUERYFeeder = csv(userDataDirectory + File.separator + "createDriverDispatchRoute-queryParams.csv").random
    val createDriverDispatchRoutePATHFeeder = csv(userDataDirectory + File.separator + "createDriverDispatchRoute-pathParams.csv").random
    val createDriverDocumentQUERYFeeder = csv(userDataDirectory + File.separator + "createDriverDocument-queryParams.csv").random
    val createDriverDocumentPATHFeeder = csv(userDataDirectory + File.separator + "createDriverDocument-pathParams.csv").random
    val create_dvirQUERYFeeder = csv(userDataDirectory + File.separator + "createDvir-queryParams.csv").random
    val createVehicleDispatchRouteQUERYFeeder = csv(userDataDirectory + File.separator + "createVehicleDispatchRoute-queryParams.csv").random
    val createVehicleDispatchRoutePATHFeeder = csv(userDataDirectory + File.separator + "createVehicleDispatchRoute-pathParams.csv").random
    val deactivateDriverQUERYFeeder = csv(userDataDirectory + File.separator + "deactivateDriver-queryParams.csv").random
    val deactivateDriverPATHFeeder = csv(userDataDirectory + File.separator + "deactivateDriver-pathParams.csv").random
    val deleteDispatchRouteByIdQUERYFeeder = csv(userDataDirectory + File.separator + "deleteDispatchRouteById-queryParams.csv").random
    val deleteDispatchRouteByIdPATHFeeder = csv(userDataDirectory + File.separator + "deleteDispatchRouteById-pathParams.csv").random
    val DeleteOrganizationAddressQUERYFeeder = csv(userDataDirectory + File.separator + "deleteOrganizationAddress-queryParams.csv").random
    val DeleteOrganizationAddressPATHFeeder = csv(userDataDirectory + File.separator + "deleteOrganizationAddress-pathParams.csv").random
    val fetchAllDispatchRoutesQUERYFeeder = csv(userDataDirectory + File.separator + "fetchAllDispatchRoutes-queryParams.csv").random
    val fetchAllRouteJobUpdatesQUERYFeeder = csv(userDataDirectory + File.separator + "fetchAllRouteJobUpdates-queryParams.csv").random
    val GetAllAssetCurrentLocationsQUERYFeeder = csv(userDataDirectory + File.separator + "getAllAssetCurrentLocations-queryParams.csv").random
    val GetAllAssetsQUERYFeeder = csv(userDataDirectory + File.separator + "getAllAssets-queryParams.csv").random
    val getAllDeactivatedDriversQUERYFeeder = csv(userDataDirectory + File.separator + "getAllDeactivatedDrivers-queryParams.csv").random
    val GetAssetLocationQUERYFeeder = csv(userDataDirectory + File.separator + "getAssetLocation-queryParams.csv").random
    val GetAssetLocationPATHFeeder = csv(userDataDirectory + File.separator + "getAssetLocation-pathParams.csv").random
    val GetAssetReeferQUERYFeeder = csv(userDataDirectory + File.separator + "getAssetReefer-queryParams.csv").random
    val GetAssetReeferPATHFeeder = csv(userDataDirectory + File.separator + "getAssetReefer-pathParams.csv").random
    val getDeactivatedDriverByIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDeactivatedDriverById-queryParams.csv").random
    val getDeactivatedDriverByIdPATHFeeder = csv(userDataDirectory + File.separator + "getDeactivatedDriverById-pathParams.csv").random
    val getDispatchRouteByIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDispatchRouteById-queryParams.csv").random
    val getDispatchRouteByIdPATHFeeder = csv(userDataDirectory + File.separator + "getDispatchRouteById-pathParams.csv").random
    val getDispatchRouteHistoryQUERYFeeder = csv(userDataDirectory + File.separator + "getDispatchRouteHistory-queryParams.csv").random
    val getDispatchRouteHistoryPATHFeeder = csv(userDataDirectory + File.separator + "getDispatchRouteHistory-pathParams.csv").random
    val getDispatchRoutesByDriverIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDispatchRoutesByDriverId-queryParams.csv").random
    val getDispatchRoutesByDriverIdPATHFeeder = csv(userDataDirectory + File.separator + "getDispatchRoutesByDriverId-pathParams.csv").random
    val getDispatchRoutesByVehicleIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDispatchRoutesByVehicleId-queryParams.csv").random
    val getDispatchRoutesByVehicleIdPATHFeeder = csv(userDataDirectory + File.separator + "getDispatchRoutesByVehicleId-pathParams.csv").random
    val getDriverByIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDriverById-queryParams.csv").random
    val getDriverByIdPATHFeeder = csv(userDataDirectory + File.separator + "getDriverById-pathParams.csv").random
    val getDriverDocumentsByOrgIdQUERYFeeder = csv(userDataDirectory + File.separator + "getDriverDocumentsByOrgId-queryParams.csv").random
    val GetDriverSafetyScoreQUERYFeeder = csv(userDataDirectory + File.separator + "getDriverSafetyScore-queryParams.csv").random
    val GetDriverSafetyScorePATHFeeder = csv(userDataDirectory + File.separator + "getDriverSafetyScore-pathParams.csv").random
    val get_dvirsQUERYFeeder = csv(userDataDirectory + File.separator + "getDvirs-queryParams.csv").random
    val get_fleet_driversQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetDrivers-queryParams.csv").random
    val get_fleet_drivers_hos_daily_logsQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetDriversHosDailyLogs-queryParams.csv").random
    val get_fleet_drivers_hos_daily_logsPATHFeeder = csv(userDataDirectory + File.separator + "getFleetDriversHosDailyLogs-pathParams.csv").random
    val get_fleet_drivers_summaryQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetDriversSummary-queryParams.csv").random
    val get_fleet_hos_authentication_logsQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetHosAuthenticationLogs-queryParams.csv").random
    val get_fleet_hos_logsQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetHosLogs-queryParams.csv").random
    val get_fleet_hos_logs_summaryQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetHosLogsSummary-queryParams.csv").random
    val get_fleet_locationsQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetLocations-queryParams.csv").random
    val get_fleet_maintenance_listQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetMaintenanceList-queryParams.csv").random
    val get_fleet_tripsQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetTrips-queryParams.csv").random
    val getFleetVehicleQUERYFeeder = csv(userDataDirectory + File.separator + "getFleetVehicle-queryParams.csv").random
    val getFleetVehiclePATHFeeder = csv(userDataDirectory + File.separator + "getFleetVehicle-pathParams.csv").random
    val GetOrganizationAddressQUERYFeeder = csv(userDataDirectory + File.separator + "getOrganizationAddress-queryParams.csv").random
    val GetOrganizationAddressPATHFeeder = csv(userDataDirectory + File.separator + "getOrganizationAddress-pathParams.csv").random
    val GetOrganizationAddressesQUERYFeeder = csv(userDataDirectory + File.separator + "getOrganizationAddresses-queryParams.csv").random
    val GetOrganizationContactQUERYFeeder = csv(userDataDirectory + File.separator + "getOrganizationContact-queryParams.csv").random
    val GetOrganizationContactPATHFeeder = csv(userDataDirectory + File.separator + "getOrganizationContact-pathParams.csv").random
    val GetVehicleHarshEventQUERYFeeder = csv(userDataDirectory + File.separator + "getVehicleHarshEvent-queryParams.csv").random
    val GetVehicleHarshEventPATHFeeder = csv(userDataDirectory + File.separator + "getVehicleHarshEvent-pathParams.csv").random
    val getVehicleLocationsQUERYFeeder = csv(userDataDirectory + File.separator + "getVehicleLocations-queryParams.csv").random
    val getVehicleLocationsPATHFeeder = csv(userDataDirectory + File.separator + "getVehicleLocations-pathParams.csv").random
    val GetVehicleSafetyScoreQUERYFeeder = csv(userDataDirectory + File.separator + "getVehicleSafetyScore-queryParams.csv").random
    val GetVehicleSafetyScorePATHFeeder = csv(userDataDirectory + File.separator + "getVehicleSafetyScore-pathParams.csv").random
    val GetVehicleStatsQUERYFeeder = csv(userDataDirectory + File.separator + "getVehicleStats-queryParams.csv").random
    val getVehiclesLocationsQUERYFeeder = csv(userDataDirectory + File.separator + "getVehiclesLocations-queryParams.csv").random
    val ListContactsQUERYFeeder = csv(userDataDirectory + File.separator + "listContacts-queryParams.csv").random
    val list_fleetQUERYFeeder = csv(userDataDirectory + File.separator + "listFleet-queryParams.csv").random
    val patchFleetVehicleQUERYFeeder = csv(userDataDirectory + File.separator + "patchFleetVehicle-queryParams.csv").random
    val patchFleetVehiclePATHFeeder = csv(userDataDirectory + File.separator + "patchFleetVehicle-pathParams.csv").random
    val reactivateDriverByIdQUERYFeeder = csv(userDataDirectory + File.separator + "reactivateDriverById-queryParams.csv").random
    val reactivateDriverByIdPATHFeeder = csv(userDataDirectory + File.separator + "reactivateDriverById-pathParams.csv").random
    val updateDispatchRouteByIdQUERYFeeder = csv(userDataDirectory + File.separator + "updateDispatchRouteById-queryParams.csv").random
    val updateDispatchRouteByIdPATHFeeder = csv(userDataDirectory + File.separator + "updateDispatchRouteById-pathParams.csv").random
    val UpdateOrganizationAddressQUERYFeeder = csv(userDataDirectory + File.separator + "updateOrganizationAddress-queryParams.csv").random
    val UpdateOrganizationAddressPATHFeeder = csv(userDataDirectory + File.separator + "updateOrganizationAddress-pathParams.csv").random
    val update_vehiclesQUERYFeeder = csv(userDataDirectory + File.separator + "updateVehicles-queryParams.csv").random

    // Setup all scenarios

    
    val scnaddFleetAddress = scenario("addFleetAddressSimulation")
        .feed(add_fleet_addressQUERYFeeder)
        .exec(http("addFleetAddress")
        .httpRequest("POST","/fleet/add_address")
        .queryParam("access_token","${access_token}")
)

    // Run scnaddFleetAddress with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaddFleetAddress.inject(
        rampUsersPerSec(1) to(addFleetAddressPerSecond) during(rampUpSeconds),
        constantUsersPerSec(addFleetAddressPerSecond) during(durationSeconds),
        rampUsersPerSec(addFleetAddressPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnaddOrganizationAddresses = scenario("addOrganizationAddressesSimulation")
        .feed(AddOrganizationAddressesQUERYFeeder)
        .exec(http("addOrganizationAddresses")
        .httpRequest("POST","/addresses")
        .queryParam("access_token","${access_token}")
)

    // Run scnaddOrganizationAddresses with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnaddOrganizationAddresses.inject(
        rampUsersPerSec(1) to(addOrganizationAddressesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(addOrganizationAddressesPerSecond) during(durationSeconds),
        rampUsersPerSec(addOrganizationAddressesPerSecond) to(1) during(rampDownSeconds)
    )

    
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

    
    val scncreateDriverDocument = scenario("createDriverDocumentSimulation")
        .feed(createDriverDocumentQUERYFeeder)
        .feed(createDriverDocumentPATHFeeder)
        .exec(http("createDriverDocument")
        .httpRequest("POST","/fleet/drivers/${driver_id}/documents")
        .queryParam("access_token","${access_token}")
)

    // Run scncreateDriverDocument with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateDriverDocument.inject(
        rampUsersPerSec(1) to(createDriverDocumentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createDriverDocumentPerSecond) during(durationSeconds),
        rampUsersPerSec(createDriverDocumentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncreateDvir = scenario("createDvirSimulation")
        .feed(create_dvirQUERYFeeder)
        .exec(http("createDvir")
        .httpRequest("POST","/fleet/maintenance/dvirs")
        .queryParam("access_token","${access_token}")
)

    // Run scncreateDvir with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateDvir.inject(
        rampUsersPerSec(1) to(createDvirPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createDvirPerSecond) during(durationSeconds),
        rampUsersPerSec(createDvirPerSecond) to(1) during(rampDownSeconds)
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

    
    val scndeleteOrganizationAddress = scenario("deleteOrganizationAddressSimulation")
        .feed(DeleteOrganizationAddressQUERYFeeder)
        .feed(DeleteOrganizationAddressPATHFeeder)
        .exec(http("deleteOrganizationAddress")
        .httpRequest("DELETE","/addresses/${addressId}")
        .queryParam("access_token","${access_token}")
)

    // Run scndeleteOrganizationAddress with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteOrganizationAddress.inject(
        rampUsersPerSec(1) to(deleteOrganizationAddressPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteOrganizationAddressPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteOrganizationAddressPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetDriverDocumentTypesByOrgId = scenario("getDriverDocumentTypesByOrgIdSimulation")
        .exec(http("getDriverDocumentTypesByOrgId")
        .httpRequest("GET","/fleet/drivers/document_types")
)

    // Run scngetDriverDocumentTypesByOrgId with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDriverDocumentTypesByOrgId.inject(
        rampUsersPerSec(1) to(getDriverDocumentTypesByOrgIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDriverDocumentTypesByOrgIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getDriverDocumentTypesByOrgIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetDriverDocumentsByOrgId = scenario("getDriverDocumentsByOrgIdSimulation")
        .feed(getDriverDocumentsByOrgIdQUERYFeeder)
        .exec(http("getDriverDocumentsByOrgId")
        .httpRequest("GET","/fleet/drivers/documents")
        .queryParam("access_token","${access_token}")
        .queryParam("endMs","${endMs}")
        .queryParam("durationMs","${durationMs}")
)

    // Run scngetDriverDocumentsByOrgId with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDriverDocumentsByOrgId.inject(
        rampUsersPerSec(1) to(getDriverDocumentsByOrgIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDriverDocumentsByOrgIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getDriverDocumentsByOrgIdPerSecond) to(1) during(rampDownSeconds)
    )

    
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

    
    val scngetDvirs = scenario("getDvirsSimulation")
        .feed(get_dvirsQUERYFeeder)
        .exec(http("getDvirs")
        .httpRequest("GET","/fleet/maintenance/dvirs")
        .queryParam("access_token","${access_token}")
        .queryParam("end_ms","${end_ms}")
        .queryParam("duration_ms","${duration_ms}")
        .queryParam("group_id","${group_id}")
)

    // Run scngetDvirs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDvirs.inject(
        rampUsersPerSec(1) to(getDvirsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDvirsPerSecond) during(durationSeconds),
        rampUsersPerSec(getDvirsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetDrivers = scenario("getFleetDriversSimulation")
        .feed(get_fleet_driversQUERYFeeder)
        .exec(http("getFleetDrivers")
        .httpRequest("POST","/fleet/drivers")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetDrivers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetDrivers.inject(
        rampUsersPerSec(1) to(getFleetDriversPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetDriversPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetDriversPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetDriversHosDailyLogs = scenario("getFleetDriversHosDailyLogsSimulation")
        .feed(get_fleet_drivers_hos_daily_logsQUERYFeeder)
        .feed(get_fleet_drivers_hos_daily_logsPATHFeeder)
        .exec(http("getFleetDriversHosDailyLogs")
        .httpRequest("POST","/fleet/drivers/${driver_id}/hos_daily_logs")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetDriversHosDailyLogs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetDriversHosDailyLogs.inject(
        rampUsersPerSec(1) to(getFleetDriversHosDailyLogsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetDriversHosDailyLogsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetDriversHosDailyLogsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetDriversSummary = scenario("getFleetDriversSummarySimulation")
        .feed(get_fleet_drivers_summaryQUERYFeeder)
        .exec(http("getFleetDriversSummary")
        .httpRequest("POST","/fleet/drivers/summary")
        .queryParam("access_token","${access_token}")
        .queryParam("snap_to_day_bounds","${snap_to_day_bounds}")
)

    // Run scngetFleetDriversSummary with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetDriversSummary.inject(
        rampUsersPerSec(1) to(getFleetDriversSummaryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetDriversSummaryPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetDriversSummaryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetHosAuthenticationLogs = scenario("getFleetHosAuthenticationLogsSimulation")
        .feed(get_fleet_hos_authentication_logsQUERYFeeder)
        .exec(http("getFleetHosAuthenticationLogs")
        .httpRequest("POST","/fleet/hos_authentication_logs")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetHosAuthenticationLogs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetHosAuthenticationLogs.inject(
        rampUsersPerSec(1) to(getFleetHosAuthenticationLogsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetHosAuthenticationLogsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetHosAuthenticationLogsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetHosLogs = scenario("getFleetHosLogsSimulation")
        .feed(get_fleet_hos_logsQUERYFeeder)
        .exec(http("getFleetHosLogs")
        .httpRequest("POST","/fleet/hos_logs")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetHosLogs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetHosLogs.inject(
        rampUsersPerSec(1) to(getFleetHosLogsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetHosLogsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetHosLogsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetHosLogsSummary = scenario("getFleetHosLogsSummarySimulation")
        .feed(get_fleet_hos_logs_summaryQUERYFeeder)
        .exec(http("getFleetHosLogsSummary")
        .httpRequest("POST","/fleet/hos_logs_summary")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetHosLogsSummary with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetHosLogsSummary.inject(
        rampUsersPerSec(1) to(getFleetHosLogsSummaryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetHosLogsSummaryPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetHosLogsSummaryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetLocations = scenario("getFleetLocationsSimulation")
        .feed(get_fleet_locationsQUERYFeeder)
        .exec(http("getFleetLocations")
        .httpRequest("POST","/fleet/locations")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetLocations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetLocations.inject(
        rampUsersPerSec(1) to(getFleetLocationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetLocationsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetLocationsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetMaintenanceList = scenario("getFleetMaintenanceListSimulation")
        .feed(get_fleet_maintenance_listQUERYFeeder)
        .exec(http("getFleetMaintenanceList")
        .httpRequest("POST","/fleet/maintenance/list")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetMaintenanceList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetMaintenanceList.inject(
        rampUsersPerSec(1) to(getFleetMaintenanceListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetMaintenanceListPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetMaintenanceListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetTrips = scenario("getFleetTripsSimulation")
        .feed(get_fleet_tripsQUERYFeeder)
        .exec(http("getFleetTrips")
        .httpRequest("POST","/fleet/trips")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetTrips with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetTrips.inject(
        rampUsersPerSec(1) to(getFleetTripsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetTripsPerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetTripsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetFleetVehicle = scenario("getFleetVehicleSimulation")
        .feed(getFleetVehicleQUERYFeeder)
        .feed(getFleetVehiclePATHFeeder)
        .exec(http("getFleetVehicle")
        .httpRequest("GET","/fleet/vehicles/${vehicle_id_or_external_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scngetFleetVehicle with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetFleetVehicle.inject(
        rampUsersPerSec(1) to(getFleetVehiclePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getFleetVehiclePerSecond) during(durationSeconds),
        rampUsersPerSec(getFleetVehiclePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOrganizationAddress = scenario("getOrganizationAddressSimulation")
        .feed(GetOrganizationAddressQUERYFeeder)
        .feed(GetOrganizationAddressPATHFeeder)
        .exec(http("getOrganizationAddress")
        .httpRequest("GET","/addresses/${addressId}")
        .queryParam("access_token","${access_token}")
)

    // Run scngetOrganizationAddress with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrganizationAddress.inject(
        rampUsersPerSec(1) to(getOrganizationAddressPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrganizationAddressPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrganizationAddressPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOrganizationAddresses = scenario("getOrganizationAddressesSimulation")
        .feed(GetOrganizationAddressesQUERYFeeder)
        .exec(http("getOrganizationAddresses")
        .httpRequest("GET","/addresses")
        .queryParam("access_token","${access_token}")
)

    // Run scngetOrganizationAddresses with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrganizationAddresses.inject(
        rampUsersPerSec(1) to(getOrganizationAddressesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrganizationAddressesPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrganizationAddressesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetOrganizationContact = scenario("getOrganizationContactSimulation")
        .feed(GetOrganizationContactQUERYFeeder)
        .feed(GetOrganizationContactPATHFeeder)
        .exec(http("getOrganizationContact")
        .httpRequest("GET","/contacts/${contact_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scngetOrganizationContact with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetOrganizationContact.inject(
        rampUsersPerSec(1) to(getOrganizationContactPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getOrganizationContactPerSecond) during(durationSeconds),
        rampUsersPerSec(getOrganizationContactPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetVehicleLocations = scenario("getVehicleLocationsSimulation")
        .feed(getVehicleLocationsQUERYFeeder)
        .feed(getVehicleLocationsPATHFeeder)
        .exec(http("getVehicleLocations")
        .httpRequest("GET","/fleet/vehicles/${vehicle_id}/locations")
        .queryParam("access_token","${access_token}")
        .queryParam("startMs","${startMs}")
        .queryParam("endMs","${endMs}")
)

    // Run scngetVehicleLocations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetVehicleLocations.inject(
        rampUsersPerSec(1) to(getVehicleLocationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getVehicleLocationsPerSecond) during(durationSeconds),
        rampUsersPerSec(getVehicleLocationsPerSecond) to(1) during(rampDownSeconds)
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

    
    val scngetVehicleStats = scenario("getVehicleStatsSimulation")
        .feed(GetVehicleStatsQUERYFeeder)
        .exec(http("getVehicleStats")
        .httpRequest("GET","/fleet/vehicles/stats")
        .queryParam("series","${series}")
        .queryParam("access_token","${access_token}")
        .queryParam("endMs","${endMs}")
        .queryParam("endingBefore","${endingBefore}")
        .queryParam("startMs","${startMs}")
        .queryParam("limit","${limit}")
        .queryParam("startingAfter","${startingAfter}")
        .queryParam("tagIds","${tagIds}")
)

    // Run scngetVehicleStats with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetVehicleStats.inject(
        rampUsersPerSec(1) to(getVehicleStatsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getVehicleStatsPerSecond) during(durationSeconds),
        rampUsersPerSec(getVehicleStatsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetVehiclesLocations = scenario("getVehiclesLocationsSimulation")
        .feed(getVehiclesLocationsQUERYFeeder)
        .exec(http("getVehiclesLocations")
        .httpRequest("GET","/fleet/vehicles/locations")
        .queryParam("startMs","${startMs}")
        .queryParam("access_token","${access_token}")
        .queryParam("endMs","${endMs}")
)

    // Run scngetVehiclesLocations with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetVehiclesLocations.inject(
        rampUsersPerSec(1) to(getVehiclesLocationsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getVehiclesLocationsPerSecond) during(durationSeconds),
        rampUsersPerSec(getVehiclesLocationsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistContacts = scenario("listContactsSimulation")
        .feed(ListContactsQUERYFeeder)
        .exec(http("listContacts")
        .httpRequest("GET","/contacts")
        .queryParam("access_token","${access_token}")
)

    // Run scnlistContacts with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistContacts.inject(
        rampUsersPerSec(1) to(listContactsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listContactsPerSecond) during(durationSeconds),
        rampUsersPerSec(listContactsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistFleet = scenario("listFleetSimulation")
        .feed(list_fleetQUERYFeeder)
        .exec(http("listFleet")
        .httpRequest("POST","/fleet/list")
        .queryParam("access_token","${access_token}")
        .queryParam("endingBefore","${endingBefore}")
        .queryParam("limit","${limit}")
        .queryParam("startingAfter","${startingAfter}")
)

    // Run scnlistFleet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistFleet.inject(
        rampUsersPerSec(1) to(listFleetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listFleetPerSecond) during(durationSeconds),
        rampUsersPerSec(listFleetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpatchFleetVehicle = scenario("patchFleetVehicleSimulation")
        .feed(patchFleetVehicleQUERYFeeder)
        .feed(patchFleetVehiclePATHFeeder)
        .exec(http("patchFleetVehicle")
        .httpRequest("PATCH","/fleet/vehicles/${vehicle_id_or_external_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scnpatchFleetVehicle with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpatchFleetVehicle.inject(
        rampUsersPerSec(1) to(patchFleetVehiclePerSecond) during(rampUpSeconds),
        constantUsersPerSec(patchFleetVehiclePerSecond) during(durationSeconds),
        rampUsersPerSec(patchFleetVehiclePerSecond) to(1) during(rampDownSeconds)
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

    
    val scnupdateOrganizationAddress = scenario("updateOrganizationAddressSimulation")
        .feed(UpdateOrganizationAddressQUERYFeeder)
        .feed(UpdateOrganizationAddressPATHFeeder)
        .exec(http("updateOrganizationAddress")
        .httpRequest("PATCH","/addresses/${addressId}")
        .queryParam("access_token","${access_token}")
)

    // Run scnupdateOrganizationAddress with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateOrganizationAddress.inject(
        rampUsersPerSec(1) to(updateOrganizationAddressPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateOrganizationAddressPerSecond) during(durationSeconds),
        rampUsersPerSec(updateOrganizationAddressPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateVehicles = scenario("updateVehiclesSimulation")
        .feed(update_vehiclesQUERYFeeder)
        .exec(http("updateVehicles")
        .httpRequest("POST","/fleet/set_data")
        .queryParam("access_token","${access_token}")
)

    // Run scnupdateVehicles with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateVehicles.inject(
        rampUsersPerSec(1) to(updateVehiclesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateVehiclesPerSecond) during(durationSeconds),
        rampUsersPerSec(updateVehiclesPerSecond) to(1) during(rampDownSeconds)
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
