package samsara.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import samsara.client.model.DriverSafetyScoreResponse;
import samsara.client.model.ErrorResponse;
import samsara.client.model.VehicleHarshEventResponse;
import samsara.client.model.VehicleSafetyScoreResponse;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class SafetyApi extends SwaggerApi {
    /**
    * Constructor for the SafetyApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function SafetyApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_driver_safety_score: String = "get_driver_safety_score";
        public static const event_get_vehicle_harsh_event: String = "get_vehicle_harsh_event";
        public static const event_get_vehicle_safety_score: String = "get_vehicle_safety_score";


    /*
     * Returns DriverSafetyScoreResponse 
     */
    public function get_driver_safety_score (driverId: Number, accessToken: String, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driverId}/safety/score".replace(/{format}/g,"xml").replace("{" + "driverId" + "}", getApiInvoker().escapeString(driverId));

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
        token.completionEventType = "get_driver_safety_score";

        token.returnType = DriverSafetyScoreResponse;
        return requestId;

    }

    /*
     * Returns VehicleHarshEventResponse 
     */
    public function get_vehicle_harsh_event (vehicleId: Number, accessToken: String, timestamp: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicleId}/safety/harsh_event".replace(/{format}/g,"xml").replace("{" + "vehicleId" + "}", getApiInvoker().escapeString(vehicleId));

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
if("null" != String(timestamp))
            queryParams["timestamp"] = toPathValue(timestamp);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_vehicle_harsh_event";

        token.returnType = VehicleHarshEventResponse;
        return requestId;

    }

    /*
     * Returns VehicleSafetyScoreResponse 
     */
    public function get_vehicle_safety_score (vehicleId: Number, accessToken: String, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicleId}/safety/score".replace(/{format}/g,"xml").replace("{" + "vehicleId" + "}", getApiInvoker().escapeString(vehicleId));

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
        token.completionEventType = "get_vehicle_safety_score";

        token.returnType = VehicleSafetyScoreResponse;
        return requestId;

    }
}
}
