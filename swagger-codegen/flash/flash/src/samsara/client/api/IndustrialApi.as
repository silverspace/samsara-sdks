package samsara.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import samsara.client.model.DataInputHistoryResponse;
import samsara.client.model.ErrorResponse;
import samsara.client.model.GroupParam;
import samsara.client.model.HistoryParam;
import samsara.client.model.InlineResponse2006;
import samsara.client.model.InlineResponse2007;
import samsara.client.model.MachineHistoryResponse;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class IndustrialApi extends SwaggerApi {
    /**
    * Constructor for the IndustrialApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function IndustrialApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_all_data_inputs: String = "get_all_data_inputs";
        public static const event_get_data_input: String = "get_data_input";
        public static const event_get_machines: String = "get_machines";
        public static const event_get_machines_history: String = "get_machines_history";


    /*
     * Returns InlineResponse2006 
     */
    public function get_all_data_inputs (accessToken: String, groupId: Number, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/industrial/data".replace(/{format}/g,"xml");

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
if("null" != String(startMs))
            queryParams["startMs"] = toPathValue(startMs);
if("null" != String(endMs))
            queryParams["endMs"] = toPathValue(endMs);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_all_data_inputs";

        token.returnType = InlineResponse2006;
        return requestId;

    }

    /*
     * Returns DataInputHistoryResponse 
     */
    public function get_data_input (accessToken: String, dataInputId: Number, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/industrial/data/{data_input_id}".replace(/{format}/g,"xml").replace("{" + "data_input_id" + "}", getApiInvoker().escapeString(dataInputId));

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
        token.completionEventType = "get_data_input";

        token.returnType = DataInputHistoryResponse;
        return requestId;

    }

    /*
     * Returns InlineResponse2007 
     */
    public function get_machines (accessToken: String, groupParam: GroupParam): String {
        // create path and map variables
        var path: String = "/machines/list".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_machines";

        token.returnType = InlineResponse2007;
        return requestId;

    }

    /*
     * Returns MachineHistoryResponse 
     */
    public function get_machines_history (accessToken: String, historyParam: HistoryParam): String {
        // create path and map variables
        var path: String = "/machines/history".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_machines_history";

        token.returnType = MachineHistoryResponse;
        return requestId;

    }
}
}
