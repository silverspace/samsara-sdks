package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.AllRouteJobUpdates
import org.openapitools.model.DispatchRoute
import org.openapitools.model.DispatchRouteCreate
import org.openapitools.model.DispatchRouteHistory

import java.util.*;

@Mixin(ApiUtils)
class RoutesApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

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

}
