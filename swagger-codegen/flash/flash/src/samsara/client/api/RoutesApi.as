package samsara.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import samsara.client.model.AllRouteJobUpdates;
import samsara.client.model.DispatchRoute;
import samsara.client.model.DispatchRouteCreate;
import samsara.client.model.DispatchRouteHistory;
import samsara.client.model.DispatchRoutes;
import samsara.client.model.ErrorResponse;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class RoutesApi extends SwaggerApi {
    /**
    * Constructor for the RoutesApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function RoutesApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_create_dispatch_route: String = "create_dispatch_route";
        public static const event_create_driver_dispatch_route: String = "create_driver_dispatch_route";
        public static const event_create_vehicle_dispatch_route: String = "create_vehicle_dispatch_route";
        public static const event_delete_dispatch_route_by_id: String = "delete_dispatch_route_by_id";
        public static const event_fetch_all_dispatch_routes: String = "fetch_all_dispatch_routes";
        public static const event_fetch_all_route_job_updates: String = "fetch_all_route_job_updates";
        public static const event_get_dispatch_route_by_id: String = "get_dispatch_route_by_id";
        public static const event_get_dispatch_route_history: String = "get_dispatch_route_history";
        public static const event_get_dispatch_routes_by_driver_id: String = "get_dispatch_routes_by_driver_id";
        public static const event_get_dispatch_routes_by_vehicle_id: String = "get_dispatch_routes_by_vehicle_id";
        public static const event_update_dispatch_route_by_id: String = "update_dispatch_route_by_id";


    /*
     * Returns DispatchRoute 
     */
    public function create_dispatch_route (accessToken: String, createDispatchRouteParams: DispatchRouteCreate): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDispatchRouteParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_dispatch_route";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function create_driver_dispatch_route (accessToken: String, driverId: Number, createDispatchRouteParams: DispatchRouteCreate): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id}/dispatch/routes".replace(/{format}/g,"xml").replace("{" + "driver_id" + "}", getApiInvoker().escapeString(driverId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDispatchRouteParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_driver_dispatch_route";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function create_vehicle_dispatch_route (accessToken: String, vehicleId: Number, createDispatchRouteParams: DispatchRouteCreate): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replace(/{format}/g,"xml").replace("{" + "vehicle_id" + "}", getApiInvoker().escapeString(vehicleId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDispatchRouteParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_vehicle_dispatch_route";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_dispatch_route_by_id (accessToken: String, routeId: Number): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/{route_id}".replace(/{format}/g,"xml").replace("{" + "route_id" + "}", getApiInvoker().escapeString(routeId));

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
        token.completionEventType = "delete_dispatch_route_by_id";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns DispatchRoutes 
     */
    public function fetch_all_dispatch_routes (accessToken: String, groupId: Number, endTime: Number, duration: Number): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes".replace(/{format}/g,"xml");

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
if("null" != String(groupId))
            queryParams["group_id"] = toPathValue(groupId);
if("null" != String(endTime))
            queryParams["end_time"] = toPathValue(endTime);
if("null" != String(duration))
            queryParams["duration"] = toPathValue(duration);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "fetch_all_dispatch_routes";

        token.returnType = DispatchRoutes;
        return requestId;

    }

    /*
     * Returns AllRouteJobUpdates 
     */
    public function fetch_all_route_job_updates (accessToken: String, groupId: Number, sequenceId: String, include: String): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/job_updates".replace(/{format}/g,"xml");

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
if("null" != String(groupId))
            queryParams["group_id"] = toPathValue(groupId);
if("null" != String(sequenceId))
            queryParams["sequence_id"] = toPathValue(sequenceId);
if("null" != String(include))
            queryParams["include"] = toPathValue(include);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "fetch_all_route_job_updates";

        token.returnType = AllRouteJobUpdates;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function get_dispatch_route_by_id (accessToken: String, routeId: Number): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/{route_id}".replace(/{format}/g,"xml").replace("{" + "route_id" + "}", getApiInvoker().escapeString(routeId));

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
        token.completionEventType = "get_dispatch_route_by_id";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns DispatchRouteHistory 
     */
    public function get_dispatch_route_history (accessToken: String, routeId: Number, startTime: Number, endTime: Number): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/{route_id}/history".replace(/{format}/g,"xml").replace("{" + "route_id" + "}", getApiInvoker().escapeString(routeId));

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
if("null" != String(startTime))
            queryParams["start_time"] = toPathValue(startTime);
if("null" != String(endTime))
            queryParams["end_time"] = toPathValue(endTime);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dispatch_route_history";

        token.returnType = DispatchRouteHistory;
        return requestId;

    }

    /*
     * Returns DispatchRoutes 
     */
    public function get_dispatch_routes_by_driver_id (accessToken: String, driverId: Number, endTime: Number, duration: Number): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id}/dispatch/routes".replace(/{format}/g,"xml").replace("{" + "driver_id" + "}", getApiInvoker().escapeString(driverId));

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
if("null" != String(endTime))
            queryParams["end_time"] = toPathValue(endTime);
if("null" != String(duration))
            queryParams["duration"] = toPathValue(duration);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dispatch_routes_by_driver_id";

        token.returnType = DispatchRoutes;
        return requestId;

    }

    /*
     * Returns DispatchRoutes 
     */
    public function get_dispatch_routes_by_vehicle_id (accessToken: String, vehicleId: Number, endTime: Number, duration: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replace(/{format}/g,"xml").replace("{" + "vehicle_id" + "}", getApiInvoker().escapeString(vehicleId));

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
if("null" != String(endTime))
            queryParams["end_time"] = toPathValue(endTime);
if("null" != String(duration))
            queryParams["duration"] = toPathValue(duration);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dispatch_routes_by_vehicle_id";

        token.returnType = DispatchRoutes;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function update_dispatch_route_by_id (accessToken: String, routeId: Number, updateDispatchRouteParams: DispatchRoute): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/{route_id}".replace(/{format}/g,"xml").replace("{" + "route_id" + "}", getApiInvoker().escapeString(routeId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, updateDispatchRouteParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_dispatch_route_by_id";

        token.returnType = DispatchRoute;
        return requestId;

    }
}
}
