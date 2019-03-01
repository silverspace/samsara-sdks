package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.DataInputHistoryResponse
import org.openapitools.model.InlineObject17
import org.openapitools.model.InlineObject18
import org.openapitools.model.InlineResponse2006
import org.openapitools.model.InlineResponse2007
import org.openapitools.model.MachineHistoryResponse

import java.util.*;

@Mixin(ApiUtils)
class IndustrialApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

    def getAllDataInputs ( String accessToken, Long groupId, Long startMs, Long endMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/industrial/data"

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

        if (!"null".equals(String.valueOf(startMs)))
            queryParams.put("startMs", String.valueOf(startMs))

        if (!"null".equals(String.valueOf(endMs)))
            queryParams.put("endMs", String.valueOf(endMs))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InlineResponse2006.class )

    }

    def getDataInput ( String accessToken, Long dataInputId, Long startMs, Long endMs, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/industrial/data/{data_input_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }

        // verify required params are set
        if (dataInputId == null) {
            throw new RuntimeException("missing required params dataInputId")
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
                    DataInputHistoryResponse.class )

    }

    def getMachines ( String accessToken, InlineObject18 groupParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/machines/list"

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
                    InlineResponse2007.class )

    }

    def getMachinesHistory ( String accessToken, InlineObject17 historyParam, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/machines/history"

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
                    MachineHistoryResponse.class )

    }

}
