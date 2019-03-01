package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.CargoResponse;
import org.openapitools.client.model.DoorResponse;
import org.openapitools.client.model.HumidityResponse;
import org.openapitools.client.model.InlineObject19;
import org.openapitools.client.model.InlineObject20;
import org.openapitools.client.model.InlineObject21;
import org.openapitools.client.model.InlineObject22;
import org.openapitools.client.model.InlineObject23;
import org.openapitools.client.model.InlineObject24;
import org.openapitools.client.model.InlineResponse2008;
import org.openapitools.client.model.SensorHistoryResponse;
import org.openapitools.client.model.TemperatureResponse;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class SensorsApi extends OpenApi {
    /**
    * Constructor for the SensorsApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function SensorsApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_sensors: String = "get_sensors";
        public static const event_get_sensors_cargo: String = "get_sensors_cargo";
        public static const event_get_sensors_door: String = "get_sensors_door";
        public static const event_get_sensors_history: String = "get_sensors_history";
        public static const event_get_sensors_humidity: String = "get_sensors_humidity";
        public static const event_get_sensors_temperature: String = "get_sensors_temperature";


    /*
     * Returns InlineResponse2008 
     */
    public function get_sensors (accessToken: String, groupParam: InlineObject23): String {
        // create path and map variables
        var path: String = "/sensors/list".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, groupParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_sensors";

        token.returnType = InlineResponse2008;
        return requestId;

    }

    /*
     * Returns CargoResponse 
     */
    public function get_sensors_cargo (accessToken: String, sensorParam: InlineObject19): String {
        // create path and map variables
        var path: String = "/sensors/cargo".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, sensorParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_sensors_cargo";

        token.returnType = CargoResponse;
        return requestId;

    }

    /*
     * Returns DoorResponse 
     */
    public function get_sensors_door (accessToken: String, sensorParam: InlineObject20): String {
        // create path and map variables
        var path: String = "/sensors/door".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, sensorParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_sensors_door";

        token.returnType = DoorResponse;
        return requestId;

    }

    /*
     * Returns SensorHistoryResponse 
     */
    public function get_sensors_history (accessToken: String, historyParam: InlineObject21): String {
        // create path and map variables
        var path: String = "/sensors/history".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, historyParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_sensors_history";

        token.returnType = SensorHistoryResponse;
        return requestId;

    }

    /*
     * Returns HumidityResponse 
     */
    public function get_sensors_humidity (accessToken: String, sensorParam: InlineObject22): String {
        // create path and map variables
        var path: String = "/sensors/humidity".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, sensorParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_sensors_humidity";

        token.returnType = HumidityResponse;
        return requestId;

    }

    /*
     * Returns TemperatureResponse 
     */
    public function get_sensors_temperature (accessToken: String, sensorParam: InlineObject24): String {
        // create path and map variables
        var path: String = "/sensors/temperature".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, sensorParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_sensors_temperature";

        token.returnType = TemperatureResponse;
        return requestId;

    }
}
}
