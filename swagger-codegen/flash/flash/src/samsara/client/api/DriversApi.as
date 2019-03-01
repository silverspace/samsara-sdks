package samsara.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import samsara.client.model.CurrentDriver;
import samsara.client.model.Driver;
import samsara.client.model.DriverForCreate;
import samsara.client.model.ErrorResponse;
import samsara.client.model.ReactivateDriverParam;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class DriversApi extends SwaggerApi {
    /**
    * Constructor for the DriversApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function DriversApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_create_driver: String = "create_driver";
        public static const event_deactivate_driver: String = "deactivate_driver";
        public static const event_get_all_deactivated_drivers: String = "get_all_deactivated_drivers";
        public static const event_get_deactivated_driver_by_id: String = "get_deactivated_driver_by_id";
        public static const event_get_driver_by_id: String = "get_driver_by_id";
        public static const event_reactivate_driver_by_id: String = "reactivate_driver_by_id";


    /*
     * Returns Driver 
     */
    public function create_driver (accessToken: String, createDriverParam: DriverForCreate): String {
        // create path and map variables
        var path: String = "/fleet/drivers/create".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDriverParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_driver";

        token.returnType = Driver;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function deactivate_driver (accessToken: String, driverIdOrExternalId: String): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "driver_id_or_external_id" + "}", getApiInvoker().escapeString(driverIdOrExternalId));

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
        token.completionEventType = "deactivate_driver";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_all_deactivated_drivers (accessToken: String, groupId: Number): String {
        // create path and map variables
        var path: String = "/fleet/drivers/inactive".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_all_deactivated_drivers";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Driver 
     */
    public function get_deactivated_driver_by_id (accessToken: String, driverIdOrExternalId: String): String {
        // create path and map variables
        var path: String = "/fleet/drivers/inactive/{driver_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "driver_id_or_external_id" + "}", getApiInvoker().escapeString(driverIdOrExternalId));

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
        token.completionEventType = "get_deactivated_driver_by_id";

        token.returnType = Driver;
        return requestId;

    }

    /*
     * Returns CurrentDriver 
     */
    public function get_driver_by_id (accessToken: String, driverIdOrExternalId: String): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "driver_id_or_external_id" + "}", getApiInvoker().escapeString(driverIdOrExternalId));

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
        token.completionEventType = "get_driver_by_id";

        token.returnType = CurrentDriver;
        return requestId;

    }

    /*
     * Returns CurrentDriver 
     */
    public function reactivate_driver_by_id (accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: ReactivateDriverParam): String {
        // create path and map variables
        var path: String = "/fleet/drivers/inactive/{driver_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "driver_id_or_external_id" + "}", getApiInvoker().escapeString(driverIdOrExternalId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, reactivateDriverParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "reactivate_driver_by_id";

        token.returnType = CurrentDriver;
        return requestId;

    }
}
}
