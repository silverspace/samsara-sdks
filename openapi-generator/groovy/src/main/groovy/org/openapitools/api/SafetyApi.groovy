package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.DriverSafetyScoreResponse
import org.openapitools.model.VehicleHarshEventResponse
import org.openapitools.model.VehicleSafetyScoreResponse

import java.util.*;

@Mixin(ApiUtils)
class SafetyApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

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

}
