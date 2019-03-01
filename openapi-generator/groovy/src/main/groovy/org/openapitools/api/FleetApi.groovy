package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.Address
import org.openapitools.model.AllRouteJobUpdates
import org.openapitools.model.AssetReeferResponse
import org.openapitools.model.Contact
import org.openapitools.model.DispatchRoute
import org.openapitools.model.DispatchRouteCreate
import org.openapitools.model.DispatchRouteHistory
import org.openapitools.model.Document
import org.openapitools.model.DocumentCreate
import org.openapitools.model.DocumentType
import org.openapitools.model.Driver
import org.openapitools.model.DriverDailyLogResponse
import org.openapitools.model.DriverForCreate
import org.openapitools.model.DriverSafetyScoreResponse
import org.openapitools.model.DriversResponse
import org.openapitools.model.DriversSummaryResponse
import org.openapitools.model.DvirBase
import org.openapitools.model.DvirListResponse
import org.openapitools.model.FleetVehicleLocation
import org.openapitools.model.FleetVehicleResponse
import org.openapitools.model.HosAuthenticationLogsResponse
import org.openapitools.model.HosLogsResponse
import org.openapitools.model.HosLogsSummaryResponse
import org.openapitools.model.InlineObject
import org.openapitools.model.InlineObject1
import org.openapitools.model.InlineObject10
import org.openapitools.model.InlineObject11
import org.openapitools.model.InlineObject12
import org.openapitools.model.InlineObject13
import org.openapitools.model.InlineObject14
import org.openapitools.model.InlineObject15
import org.openapitools.model.InlineObject16
import org.openapitools.model.InlineObject2
import org.openapitools.model.InlineObject3
import org.openapitools.model.InlineObject4
import org.openapitools.model.InlineObject5
import org.openapitools.model.InlineObject6
import org.openapitools.model.InlineObject7
import org.openapitools.model.InlineObject8
import org.openapitools.model.InlineObject9
import org.openapitools.model.InlineResponse200
import org.openapitools.model.InlineResponse2001
import org.openapitools.model.InlineResponse2002
import org.openapitools.model.InlineResponse2003
import org.openapitools.model.InlineResponse2004
import org.openapitools.model.InlineResponse2005
import org.openapitools.model.TripResponse
import org.openapitools.model.VehicleHarshEventResponse
import org.openapitools.model.VehicleSafetyScoreResponse

import java.util.*;

@Mixin(ApiUtils)
class FleetApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

    def addFleetAddress ( String accessToken, InlineObject2 addressParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def addOrganizationAddresses ( String accessToken, InlineObject addresses, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Document.class )

    }

    def createDvir ( String accessToken, InlineObject12 createDvirParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    DispatchRoute.class )

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Object.class )

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    DispatchRoute.class )

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    DispatchRoute.class )

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Driver.class )

    }

    def getDriverDocumentTypesByOrgId ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/fleet/drivers/document_types"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    DocumentType.class )

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Document.class )

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DvirListResponse.class )

    }

    def getFleetDrivers ( String accessToken, InlineObject3 groupDriversParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DriversResponse.class )

    }

    def getFleetDriversHosDailyLogs ( String accessToken, Long driverId, InlineObject6 hosLogsParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DriverDailyLogResponse.class )

    }

    def getFleetDriversSummary ( String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DriversSummaryResponse.class )

    }

    def getFleetHosAuthenticationLogs ( String accessToken, InlineObject7 hosAuthenticationLogsParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    HosAuthenticationLogsResponse.class )

    }

    def getFleetHosLogs ( String accessToken, InlineObject8 hosLogsParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    HosLogsResponse.class )

    }

    def getFleetHosLogsSummary ( String accessToken, InlineObject9 hosLogsParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    HosLogsSummaryResponse.class )

    }

    def getFleetLocations ( String accessToken, InlineObject11 groupParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse2003.class )

    }

    def getFleetMaintenanceList ( String accessToken, InlineObject13 groupParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse2004.class )

    }

    def getFleetTrips ( String accessToken, InlineObject15 tripsParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    FleetVehicleLocation.class )

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Object.class )

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Contact.class )

    }

    def listFleet ( String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse2002.class )

    }

    def patchFleetVehicle ( String accessToken, String vehicleIdOrExternalId, InlineObject16 data, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    FleetVehicleResponse.class )

    }

    def reactivateDriverById ( String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Driver.class )

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    DispatchRoute.class )

    }

    def updateOrganizationAddress ( String accessToken, Long addressId, InlineObject1 address, Closure onSuccess, Closure onFailure)  {
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

        // verify required params are set
        if (address == null) {
            throw new RuntimeException("missing required params address")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    null )

    }

    def updateVehicles ( String accessToken, InlineObject14 vehicleUpdateParam, Closure onSuccess, Closure onFailure)  {
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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

}
