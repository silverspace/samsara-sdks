package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Address
import io.swagger.model.AddressParam
import io.swagger.model.Addresses
import io.swagger.model.AllRouteJobUpdates
import io.swagger.model.AssetLocationResponse
import io.swagger.model.AssetReeferResponse
import io.swagger.model.Contact
import io.swagger.model.CreateDvirParam
import io.swagger.model.CurrentDriver
import io.swagger.model.Data
import io.swagger.model.DispatchRoute
import io.swagger.model.DispatchRouteCreate
import io.swagger.model.DispatchRouteHistory
import io.swagger.model.DispatchRoutes
import io.swagger.model.Document
import io.swagger.model.DocumentCreate
import io.swagger.model.DocumentTypes
import io.swagger.model.Documents
import io.swagger.model.Driver
import io.swagger.model.DriverDailyLogResponse
import io.swagger.model.DriverForCreate
import io.swagger.model.DriverSafetyScoreResponse
import io.swagger.model.DriversResponse
import io.swagger.model.DriversSummaryParam
import io.swagger.model.DriversSummaryResponse
import io.swagger.model.DvirBase
import io.swagger.model.DvirListResponse
import io.swagger.model.FleetVehicleLocations
import io.swagger.model.FleetVehicleResponse
import io.swagger.model.FleetVehiclesLocations
import io.swagger.model.GroupDriversParam
import io.swagger.model.GroupParam
import io.swagger.model.HosAuthenticationLogsParam
import io.swagger.model.HosAuthenticationLogsResponse
import io.swagger.model.HosLogsParam
import io.swagger.model.HosLogsParam1
import io.swagger.model.HosLogsParam2
import io.swagger.model.HosLogsResponse
import io.swagger.model.HosLogsSummaryResponse
import io.swagger.model.InlineResponse200
import io.swagger.model.InlineResponse2001
import io.swagger.model.InlineResponse2002
import io.swagger.model.InlineResponse2003
import io.swagger.model.InlineResponse2004
import io.swagger.model.InlineResponse2005
import io.swagger.model.ReactivateDriverParam
import io.swagger.model.TripResponse
import io.swagger.model.TripsParam
import io.swagger.model.VehicleHarshEventResponse
import io.swagger.model.VehicleSafetyScoreResponse
import io.swagger.model.VehicleUpdateParam

import java.util.*;

@Mixin(ApiUtils)
class FleetApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

    def addFleetAddress ( String accessToken, AddressParam addressParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/add_address"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (addressParam == null) {
            throw new RuntimeException("missing required params addressParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def addOrganizationAddresses ( String accessToken, Addresses addresses, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/addresses"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (addresses == null) {
            throw new RuntimeException("missing required params addresses")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "array",
                    Address.class )
                    
    }
    def createDispatchRoute ( String accessToken, DispatchRouteCreate createDispatchRouteParams, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/dispatch/routes"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (createDispatchRouteParams == null) {
            throw new RuntimeException("missing required params createDispatchRouteParams")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DispatchRoute.class )
                    
    }
    def createDriver ( String accessToken, DriverForCreate createDriverParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/create"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (createDriverParam == null) {
            throw new RuntimeException("missing required params createDriverParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Driver.class )
                    
    }
    def createDriverDispatchRoute ( String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/{driver_id}/dispatch/routes"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driverId == null) {
            throw new RuntimeException("missing required params driverId")
        }
        // verify required params are set
        if (createDispatchRouteParams == null) {
            throw new RuntimeException("missing required params createDispatchRouteParams")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DispatchRoute.class )
                    
    }
    def createDriverDocument ( String accessToken, Long driverId, DocumentCreate createDocumentParams, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/{driver_id}/documents"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driverId == null) {
            throw new RuntimeException("missing required params driverId")
        }
        // verify required params are set
        if (createDocumentParams == null) {
            throw new RuntimeException("missing required params createDocumentParams")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Document.class )
                    
    }
    def createDvir ( String accessToken, CreateDvirParam createDvirParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/maintenance/dvirs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (createDvirParam == null) {
            throw new RuntimeException("missing required params createDvirParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DvirBase.class )
                    
    }
    def createVehicleDispatchRoute ( String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/{vehicle_id}/dispatch/routes"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (vehicleId == null) {
            throw new RuntimeException("missing required params vehicleId")
        }
        // verify required params are set
        if (createDispatchRouteParams == null) {
            throw new RuntimeException("missing required params createDispatchRouteParams")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DispatchRoute.class )
                    
    }
    def deactivateDriver ( String accessToken, String driverIdOrExternalId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/{driver_id_or_external_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driverIdOrExternalId == null) {
            throw new RuntimeException("missing required params driverIdOrExternalId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteDispatchRouteById ( String accessToken, Long routeId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/dispatch/routes/{route_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (routeId == null) {
            throw new RuntimeException("missing required params routeId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteOrganizationAddress ( String accessToken, Long addressId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/addresses/{addressId}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (addressId == null) {
            throw new RuntimeException("missing required params addressId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def fetchAllDispatchRoutes ( String accessToken, Long groupId, Long endTime, Long duration, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/dispatch/routes"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(groupId)))
            queryParams.put("group_id", String.valueOf(groupId))
if (!"null".equals(String.valueOf(endTime)))
            queryParams.put("end_time", String.valueOf(endTime))
if (!"null".equals(String.valueOf(duration)))
            queryParams.put("duration", String.valueOf(duration))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DispatchRoutes.class )
                    
    }
    def fetchAllRouteJobUpdates ( String accessToken, Long groupId, String sequenceId, String include, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/dispatch/routes/job_updates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(groupId)))
            queryParams.put("group_id", String.valueOf(groupId))
if (!"null".equals(String.valueOf(sequenceId)))
            queryParams.put("sequence_id", String.valueOf(sequenceId))
if (!"null".equals(String.valueOf(include)))
            queryParams.put("include", String.valueOf(include))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AllRouteJobUpdates.class )
                    
    }
    def getAllAssetCurrentLocations ( String accessToken, Long groupId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/assets/locations"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(groupId)))
            queryParams.put("group_id", String.valueOf(groupId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InlineResponse2001.class )
                    
    }
    def getAllAssets ( String accessToken, Long groupId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/assets"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(groupId)))
            queryParams.put("group_id", String.valueOf(groupId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InlineResponse200.class )
                    
    }
    def getAllDeactivatedDrivers ( String accessToken, Long groupId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/inactive"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(groupId)))
            queryParams.put("group_id", String.valueOf(groupId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Driver.class )
                    
    }
    def getAssetLocation ( String accessToken, Long assetId, Long startMs, Long endMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/assets/{asset_id}/locations"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (assetId == null) {
            throw new RuntimeException("missing required params assetId")
        }
        // verify required params are set
        if (startMs == null) {
            throw new RuntimeException("missing required params startMs")
        }
        // verify required params are set
        if (endMs == null) {
            throw new RuntimeException("missing required params endMs")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startMs)))
            queryParams.put("startMs", String.valueOf(startMs))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AssetLocationResponse.class )
                    
    }
    def getAssetReefer ( String accessToken, Long assetId, Long startMs, Long endMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/assets/{asset_id}/reefer"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (assetId == null) {
            throw new RuntimeException("missing required params assetId")
        }
        // verify required params are set
        if (startMs == null) {
            throw new RuntimeException("missing required params startMs")
        }
        // verify required params are set
        if (endMs == null) {
            throw new RuntimeException("missing required params endMs")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startMs)))
            queryParams.put("startMs", String.valueOf(startMs))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AssetReeferResponse.class )
                    
    }
    def getDeactivatedDriverById ( String accessToken, String driverIdOrExternalId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/inactive/{driver_id_or_external_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driverIdOrExternalId == null) {
            throw new RuntimeException("missing required params driverIdOrExternalId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Driver.class )
                    
    }
    def getDispatchRouteById ( String accessToken, Long routeId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/dispatch/routes/{route_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (routeId == null) {
            throw new RuntimeException("missing required params routeId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DispatchRoute.class )
                    
    }
    def getDispatchRouteHistory ( String accessToken, Long routeId, Long startTime, Long endTime, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/dispatch/routes/{route_id}/history"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (routeId == null) {
            throw new RuntimeException("missing required params routeId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startTime)))
            queryParams.put("start_time", String.valueOf(startTime))
if (!"null".equals(String.valueOf(endTime)))
            queryParams.put("end_time", String.valueOf(endTime))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DispatchRouteHistory.class )
                    
    }
    def getDispatchRoutesByDriverId ( String accessToken, Long driverId, Long endTime, Long duration, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/{driver_id}/dispatch/routes"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driverId == null) {
            throw new RuntimeException("missing required params driverId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(endTime)))
            queryParams.put("end_time", String.valueOf(endTime))
if (!"null".equals(String.valueOf(duration)))
            queryParams.put("duration", String.valueOf(duration))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DispatchRoutes.class )
                    
    }
    def getDispatchRoutesByVehicleId ( String accessToken, Long vehicleId, Long endTime, Long duration, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/{vehicle_id}/dispatch/routes"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (vehicleId == null) {
            throw new RuntimeException("missing required params vehicleId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(endTime)))
            queryParams.put("end_time", String.valueOf(endTime))
if (!"null".equals(String.valueOf(duration)))
            queryParams.put("duration", String.valueOf(duration))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DispatchRoutes.class )
                    
    }
    def getDriverById ( String accessToken, String driverIdOrExternalId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/{driver_id_or_external_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driverIdOrExternalId == null) {
            throw new RuntimeException("missing required params driverIdOrExternalId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CurrentDriver.class )
                    
    }
    def getDriverDocumentTypesByOrgId ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/document_types"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DocumentTypes.class )
                    
    }
    def getDriverDocumentsByOrgId ( String accessToken, Long endMs, Long durationMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/documents"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))
if (!"null".equals(String.valueOf(durationMs)))
            queryParams.put("durationMs", String.valueOf(durationMs))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Documents.class )
                    
    }
    def getDriverSafetyScore ( Long driverId, String accessToken, Long startMs, Long endMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/{driverId}/safety/score"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (driverId == null) {
            throw new RuntimeException("missing required params driverId")
        }
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (startMs == null) {
            throw new RuntimeException("missing required params startMs")
        }
        // verify required params are set
        if (endMs == null) {
            throw new RuntimeException("missing required params endMs")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startMs)))
            queryParams.put("startMs", String.valueOf(startMs))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DriverSafetyScoreResponse.class )
                    
    }
    def getDvirs ( String accessToken, Integer endMs, Integer durationMs, Integer groupId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/maintenance/dvirs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (endMs == null) {
            throw new RuntimeException("missing required params endMs")
        }
        // verify required params are set
        if (durationMs == null) {
            throw new RuntimeException("missing required params durationMs")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("end_ms", String.valueOf(endMs))
if (!"null".equals(String.valueOf(durationMs)))
            queryParams.put("duration_ms", String.valueOf(durationMs))
if (!"null".equals(String.valueOf(groupId)))
            queryParams.put("group_id", String.valueOf(groupId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DvirListResponse.class )
                    
    }
    def getFleetDrivers ( String accessToken, GroupDriversParam groupDriversParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (groupDriversParam == null) {
            throw new RuntimeException("missing required params groupDriversParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DriversResponse.class )
                    
    }
    def getFleetDriversHosDailyLogs ( String accessToken, Long driverId, HosLogsParam hosLogsParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/{driver_id}/hos_daily_logs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driverId == null) {
            throw new RuntimeException("missing required params driverId")
        }
        // verify required params are set
        if (hosLogsParam == null) {
            throw new RuntimeException("missing required params hosLogsParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DriverDailyLogResponse.class )
                    
    }
    def getFleetDriversSummary ( String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/summary"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driversSummaryParam == null) {
            throw new RuntimeException("missing required params driversSummaryParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(snapToDayBounds)))
            queryParams.put("snap_to_day_bounds", String.valueOf(snapToDayBounds))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DriversSummaryResponse.class )
                    
    }
    def getFleetHosAuthenticationLogs ( String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/hos_authentication_logs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (hosAuthenticationLogsParam == null) {
            throw new RuntimeException("missing required params hosAuthenticationLogsParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    HosAuthenticationLogsResponse.class )
                    
    }
    def getFleetHosLogs ( String accessToken, HosLogsParam1 hosLogsParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/hos_logs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (hosLogsParam == null) {
            throw new RuntimeException("missing required params hosLogsParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    HosLogsResponse.class )
                    
    }
    def getFleetHosLogsSummary ( String accessToken, HosLogsParam2 hosLogsParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/hos_logs_summary"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (hosLogsParam == null) {
            throw new RuntimeException("missing required params hosLogsParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    HosLogsSummaryResponse.class )
                    
    }
    def getFleetLocations ( String accessToken, GroupParam groupParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/locations"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (groupParam == null) {
            throw new RuntimeException("missing required params groupParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse2003.class )
                    
    }
    def getFleetMaintenanceList ( String accessToken, GroupParam groupParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/maintenance/list"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (groupParam == null) {
            throw new RuntimeException("missing required params groupParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse2004.class )
                    
    }
    def getFleetTrips ( String accessToken, TripsParam tripsParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/trips"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (tripsParam == null) {
            throw new RuntimeException("missing required params tripsParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TripResponse.class )
                    
    }
    def getFleetVehicle ( String accessToken, String vehicleIdOrExternalId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/{vehicle_id_or_external_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (vehicleIdOrExternalId == null) {
            throw new RuntimeException("missing required params vehicleIdOrExternalId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    FleetVehicleResponse.class )
                    
    }
    def getOrganizationAddress ( String accessToken, Long addressId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/addresses/{addressId}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (addressId == null) {
            throw new RuntimeException("missing required params addressId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Address.class )
                    
    }
    def getOrganizationAddresses ( String accessToken, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/addresses"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Address.class )
                    
    }
    def getOrganizationContact ( String accessToken, Long contactId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/contacts/{contact_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (contactId == null) {
            throw new RuntimeException("missing required params contactId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Contact.class )
                    
    }
    def getVehicleHarshEvent ( Long vehicleId, String accessToken, Long timestamp, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/{vehicleId}/safety/harsh_event"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (vehicleId == null) {
            throw new RuntimeException("missing required params vehicleId")
        }
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (timestamp == null) {
            throw new RuntimeException("missing required params timestamp")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(timestamp)))
            queryParams.put("timestamp", String.valueOf(timestamp))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    VehicleHarshEventResponse.class )
                    
    }
    def getVehicleLocations ( String accessToken, Long vehicleId, Long startMs, Long endMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/{vehicle_id}/locations"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (vehicleId == null) {
            throw new RuntimeException("missing required params vehicleId")
        }
        // verify required params are set
        if (startMs == null) {
            throw new RuntimeException("missing required params startMs")
        }
        // verify required params are set
        if (endMs == null) {
            throw new RuntimeException("missing required params endMs")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startMs)))
            queryParams.put("startMs", String.valueOf(startMs))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    FleetVehicleLocations.class )
                    
    }
    def getVehicleSafetyScore ( Long vehicleId, String accessToken, Long startMs, Long endMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/{vehicleId}/safety/score"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (vehicleId == null) {
            throw new RuntimeException("missing required params vehicleId")
        }
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (startMs == null) {
            throw new RuntimeException("missing required params startMs")
        }
        // verify required params are set
        if (endMs == null) {
            throw new RuntimeException("missing required params endMs")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startMs)))
            queryParams.put("startMs", String.valueOf(startMs))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    VehicleSafetyScoreResponse.class )
                    
    }
    def getVehicleStats ( String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/stats"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (startMs == null) {
            throw new RuntimeException("missing required params startMs")
        }
        // verify required params are set
        if (endMs == null) {
            throw new RuntimeException("missing required params endMs")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startMs)))
            queryParams.put("startMs", String.valueOf(startMs))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))
if (!"null".equals(String.valueOf(series)))
            queryParams.put("series", String.valueOf(series))
if (!"null".equals(String.valueOf(tagIds)))
            queryParams.put("tagIds", String.valueOf(tagIds))
if (!"null".equals(String.valueOf(startingAfter)))
            queryParams.put("startingAfter", String.valueOf(startingAfter))
if (!"null".equals(String.valueOf(endingBefore)))
            queryParams.put("endingBefore", String.valueOf(endingBefore))
if (!"null".equals(String.valueOf(limit)))
            queryParams.put("limit", String.valueOf(limit))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InlineResponse2005.class )
                    
    }
    def getVehiclesLocations ( String accessToken, Integer startMs, Integer endMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/locations"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (startMs == null) {
            throw new RuntimeException("missing required params startMs")
        }
        // verify required params are set
        if (endMs == null) {
            throw new RuntimeException("missing required params endMs")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startMs)))
            queryParams.put("startMs", String.valueOf(startMs))
if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    FleetVehiclesLocations.class )
                    
    }
    def listContacts ( String accessToken, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/contacts"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Contact.class )
                    
    }
    def listFleet ( String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/list"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (groupParam == null) {
            throw new RuntimeException("missing required params groupParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))
if (!"null".equals(String.valueOf(startingAfter)))
            queryParams.put("startingAfter", String.valueOf(startingAfter))
if (!"null".equals(String.valueOf(endingBefore)))
            queryParams.put("endingBefore", String.valueOf(endingBefore))
if (!"null".equals(String.valueOf(limit)))
            queryParams.put("limit", String.valueOf(limit))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse2002.class )
                    
    }
    def patchFleetVehicle ( String accessToken, String vehicleIdOrExternalId, Data data, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/vehicles/{vehicle_id_or_external_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (vehicleIdOrExternalId == null) {
            throw new RuntimeException("missing required params vehicleIdOrExternalId")
        }
        // verify required params are set
        if (data == null) {
            throw new RuntimeException("missing required params data")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    FleetVehicleResponse.class )
                    
    }
    def reactivateDriverById ( String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/inactive/{driver_id_or_external_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (driverIdOrExternalId == null) {
            throw new RuntimeException("missing required params driverIdOrExternalId")
        }
        // verify required params are set
        if (reactivateDriverParam == null) {
            throw new RuntimeException("missing required params reactivateDriverParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    CurrentDriver.class )
                    
    }
    def updateDispatchRouteById ( String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/dispatch/routes/{route_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (routeId == null) {
            throw new RuntimeException("missing required params routeId")
        }
        // verify required params are set
        if (updateDispatchRouteParams == null) {
            throw new RuntimeException("missing required params updateDispatchRouteParams")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    DispatchRoute.class )
                    
    }
    def updateOrganizationAddress ( String accessToken, Address address, Long addressId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/addresses/{addressId}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (address == null) {
            throw new RuntimeException("missing required params address")
        }
        // verify required params are set
        if (addressId == null) {
            throw new RuntimeException("missing required params addressId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    null )
                    
    }
    def updateVehicles ( String accessToken, VehicleUpdateParam vehicleUpdateParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/set_data"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (vehicleUpdateParam == null) {
            throw new RuntimeException("missing required params vehicleUpdateParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
