package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.Driver
import org.openapitools.model.DriverForCreate
import org.openapitools.model.InlineObject4

import java.util.*;

@Mixin(ApiUtils)
class DriversApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

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

}
