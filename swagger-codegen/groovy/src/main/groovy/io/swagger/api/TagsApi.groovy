package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.InlineResponse2009
import io.swagger.model.Tag
import io.swagger.model.TagCreate
import io.swagger.model.TagModify
import io.swagger.model.TagUpdate

import java.util.*;

@Mixin(ApiUtils)
class TagsApi {
    String basePath = "https://api.samsara.com/v1"
    String versionPath = "/api/v1"

    def createTag ( String accessToken, TagCreate tagCreateParams, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (tagCreateParams == null) {
            throw new RuntimeException("missing required params tagCreateParams")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Tag.class )
                    
    }
    def deleteTagById ( String accessToken, Long tagId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/tags/{tag_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (tagId == null) {
            throw new RuntimeException("missing required params tagId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getAllTags ( String accessToken, Long groupId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/tags"

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
                    InlineResponse2009.class )
                    
    }
    def getTagById ( String accessToken, Long tagId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/tags/{tag_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (tagId == null) {
            throw new RuntimeException("missing required params tagId")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Tag.class )
                    
    }
    def modifyTagById ( String accessToken, Long tagId, TagModify tagModifyParams, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/tags/{tag_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (tagId == null) {
            throw new RuntimeException("missing required params tagId")
        }
        // verify required params are set
        if (tagModifyParams == null) {
            throw new RuntimeException("missing required params tagModifyParams")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PATCH", "",
                    Tag.class )
                    
    }
    def updateTagById ( String accessToken, Long tagId, TagUpdate updateTagParams, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/tags/{tag_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (tagId == null) {
            throw new RuntimeException("missing required params tagId")
        }
        // verify required params are set
        if (updateTagParams == null) {
            throw new RuntimeException("missing required params updateTagParams")
        }

        if (!"null".equals(String.valueOf(accessToken)))
            queryParams.put("access_token", String.valueOf(accessToken))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    Tag.class )
                    
    }
}
