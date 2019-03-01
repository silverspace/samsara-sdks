package samsara.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import samsara.client.model.ErrorResponse;
import samsara.client.model.InlineResponse2009;
import samsara.client.model.Tag;
import samsara.client.model.TagCreate;
import samsara.client.model.TagModify;
import samsara.client.model.TagUpdate;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class TagsApi extends SwaggerApi {
    /**
    * Constructor for the TagsApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function TagsApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_create_tag: String = "create_tag";
        public static const event_delete_tag_by_id: String = "delete_tag_by_id";
        public static const event_get_all_tags: String = "get_all_tags";
        public static const event_get_tag_by_id: String = "get_tag_by_id";
        public static const event_modify_tag_by_id: String = "modify_tag_by_id";
        public static const event_update_tag_by_id: String = "update_tag_by_id";


    /*
     * Returns Tag 
     */
    public function create_tag (accessToken: String, tagCreateParams: TagCreate): String {
        // create path and map variables
        var path: String = "/tags".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, tagCreateParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_tag";

        token.returnType = Tag;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_tag_by_id (accessToken: String, tagId: Number): String {
        // create path and map variables
        var path: String = "/tags/{tag_id}".replace(/{format}/g,"xml").replace("{" + "tag_id" + "}", getApiInvoker().escapeString(tagId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_tag_by_id";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns InlineResponse2009 
     */
    public function get_all_tags (accessToken: String, groupId: Number): String {
        // create path and map variables
        var path: String = "/tags".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);
if("null" != String(groupId))
            queryParams["group_id"] = toPathValue(groupId);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_all_tags";

        token.returnType = InlineResponse2009;
        return requestId;

    }

    /*
     * Returns Tag 
     */
    public function get_tag_by_id (accessToken: String, tagId: Number): String {
        // create path and map variables
        var path: String = "/tags/{tag_id}".replace(/{format}/g,"xml").replace("{" + "tag_id" + "}", getApiInvoker().escapeString(tagId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_tag_by_id";

        token.returnType = Tag;
        return requestId;

    }

    /*
     * Returns Tag 
     */
    public function modify_tag_by_id (accessToken: String, tagId: Number, tagModifyParams: TagModify): String {
        // create path and map variables
        var path: String = "/tags/{tag_id}".replace(/{format}/g,"xml").replace("{" + "tag_id" + "}", getApiInvoker().escapeString(tagId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, tagModifyParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "modify_tag_by_id";

        token.returnType = Tag;
        return requestId;

    }

    /*
     * Returns Tag 
     */
    public function update_tag_by_id (accessToken: String, tagId: Number, updateTagParams: TagUpdate): String {
        // create path and map variables
        var path: String = "/tags/{tag_id}".replace(/{format}/g,"xml").replace("{" + "tag_id" + "}", getApiInvoker().escapeString(tagId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, updateTagParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_tag_by_id";

        token.returnType = Tag;
        return requestId;

    }
}
}
