package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CargoResponse
import io.swagger.model.DoorResponse
import io.swagger.model.GroupParam
import io.swagger.model.HistoryParam1
import io.swagger.model.HumidityResponse
import io.swagger.model.InlineResponse2008
import io.swagger.model.SensorHistoryResponse
import io.swagger.model.SensorParam
import io.swagger.model.TemperatureResponse

import java.util.*;

@Mixin(ApiUtils)
class SensorsApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

    def getSensors ( String accessToken, GroupParam groupParam, Closure onSuccess, Closure onFailure)  {
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse2008.class )
                    
    }
    def getSensorsCargo ( String accessToken, SensorParam sensorParam, Closure onSuccess, Closure onFailure)  {
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    CargoResponse.class )
                    
    }
    def getSensorsDoor ( String accessToken, SensorParam sensorParam, Closure onSuccess, Closure onFailure)  {
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DoorResponse.class )
                    
    }
    def getSensorsHistory ( String accessToken, HistoryParam1 historyParam, Closure onSuccess, Closure onFailure)  {
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    SensorHistoryResponse.class )
                    
    }
    def getSensorsHumidity ( String accessToken, SensorParam sensorParam, Closure onSuccess, Closure onFailure)  {
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    HumidityResponse.class )
                    
    }
    def getSensorsTemperature ( String accessToken, SensorParam sensorParam, Closure onSuccess, Closure onFailure)  {
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemperatureResponse.class )
                    
    }
}
