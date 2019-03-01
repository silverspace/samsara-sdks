package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.CargoResponse
import org.openapitools.model.DoorResponse
import org.openapitools.model.HumidityResponse
import org.openapitools.model.InlineObject19
import org.openapitools.model.InlineObject20
import org.openapitools.model.InlineObject21
import org.openapitools.model.InlineObject22
import org.openapitools.model.InlineObject23
import org.openapitools.model.InlineObject24
import org.openapitools.model.InlineResponse2008
import org.openapitools.model.SensorHistoryResponse
import org.openapitools.model.TemperatureResponse

import java.util.*;

@Mixin(ApiUtils)
class SensorsApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

    def getSensors ( String accessToken, InlineObject23 groupParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/sensors/list"

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
                    InlineResponse2008.class )

    }

    def getSensorsCargo ( String accessToken, InlineObject19 sensorParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/sensors/cargo"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        // verify required params are set
        if (sensorParam == null) {
            throw new RuntimeException("missing required params sensorParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    CargoResponse.class )

    }

    def getSensorsDoor ( String accessToken, InlineObject20 sensorParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/sensors/door"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        // verify required params are set
        if (sensorParam == null) {
            throw new RuntimeException("missing required params sensorParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DoorResponse.class )

    }

    def getSensorsHistory ( String accessToken, InlineObject21 historyParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/sensors/history"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        // verify required params are set
        if (historyParam == null) {
            throw new RuntimeException("missing required params historyParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    SensorHistoryResponse.class )

    }

    def getSensorsHumidity ( String accessToken, InlineObject22 sensorParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/sensors/humidity"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        // verify required params are set
        if (sensorParam == null) {
            throw new RuntimeException("missing required params sensorParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    HumidityResponse.class )

    }

    def getSensorsTemperature ( String accessToken, InlineObject24 sensorParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/sensors/temperature"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        // verify required params are set
        if (sensorParam == null) {
            throw new RuntimeException("missing required params sensorParam")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemperatureResponse.class )

    }

}
