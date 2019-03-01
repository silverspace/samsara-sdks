package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DataInputHistoryResponse;
import org.openapitools.server.api.model.InlineObject17;
import org.openapitools.server.api.model.InlineObject18;
import org.openapitools.server.api.model.InlineResponse2006;
import org.openapitools.server.api.model.InlineResponse2007;
import org.openapitools.server.api.model.MachineHistoryResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface IndustrialApi  {
    //GetAllDataInputs
    void getAllDataInputs(String accessToken, Long groupId, Long startMs, Long endMs, Handler<AsyncResult<InlineResponse2006>> handler);
    
    //GetDataInput
    void getDataInput(String accessToken, Long dataInputId, Long startMs, Long endMs, Handler<AsyncResult<DataInputHistoryResponse>> handler);
    
    //get_machines
    void getMachines(String accessToken, InlineObject18 groupParam, Handler<AsyncResult<InlineResponse2007>> handler);
    
    //get_machines_history
    void getMachinesHistory(String accessToken, InlineObject17 historyParam, Handler<AsyncResult<MachineHistoryResponse>> handler);
    
}
