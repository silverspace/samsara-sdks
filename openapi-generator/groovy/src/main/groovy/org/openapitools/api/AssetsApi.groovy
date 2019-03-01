package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.AssetReeferResponse
import org.openapitools.model.InlineResponse200
import org.openapitools.model.InlineResponse2001

import java.util.*;

@Mixin(ApiUtils)
class AssetsApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

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

}
