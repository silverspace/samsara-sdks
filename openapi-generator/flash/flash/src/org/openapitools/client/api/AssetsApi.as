package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.AssetReeferResponse;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Object;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class AssetsApi extends OpenApi {
    /**
    * Constructor for the AssetsApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function AssetsApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_all_asset_current_locations: String = "get_all_asset_current_locations";
        public static const event_get_all_assets: String = "get_all_assets";
        public static const event_get_asset_location: String = "get_asset_location";
        public static const event_get_asset_reefer: String = "get_asset_reefer";


    /*
     * Returns InlineResponse2001 
     */
    public function get_all_asset_current_locations (accessToken: String, groupId: Number): String {
        // create path and map variables
        var path: String = "/fleet/assets/locations".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_all_asset_current_locations";

        token.returnType = InlineResponse2001;
        return requestId;

    }

    /*
     * Returns InlineResponse200 
     */
    public function get_all_assets (accessToken: String, groupId: Number): String {
        // create path and map variables
        var path: String = "/fleet/assets".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_all_assets";

        token.returnType = InlineResponse200;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_asset_location (accessToken: String, assetId: Number, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/assets/{asset_id}/locations".replace(/{format}/g,"xml").replace("{" + "asset_id" + "}", getApiInvoker().escapeString(assetId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);
if("null" != String(startMs))
            queryParams["startMs"] = toPathValue(startMs);
if("null" != String(endMs))
            queryParams["endMs"] = toPathValue(endMs);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_asset_location";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns AssetReeferResponse 
     */
    public function get_asset_reefer (accessToken: String, assetId: Number, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/assets/{asset_id}/reefer".replace(/{format}/g,"xml").replace("{" + "asset_id" + "}", getApiInvoker().escapeString(assetId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);
if("null" != String(startMs))
            queryParams["startMs"] = toPathValue(startMs);
if("null" != String(endMs))
            queryParams["endMs"] = toPathValue(endMs);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_asset_reefer";

        token.returnType = AssetReeferResponse;
        return requestId;

    }
}
}
