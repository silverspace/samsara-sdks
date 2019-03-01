package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.DataInputHistoryResponse;
import org.openapitools.server.api.model.InlineObject17;
import org.openapitools.server.api.model.InlineObject18;
import org.openapitools.server.api.model.InlineResponse2006;
import org.openapitools.server.api.model.InlineResponse2007;
import org.openapitools.server.api.model.MachineHistoryResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class IndustrialApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(IndustrialApiVerticle.class); 
    
    final static String GETALLDATAINPUTS_SERVICE_ID = "GetAllDataInputs";
    final static String GETDATAINPUT_SERVICE_ID = "GetDataInput";
    final static String GET_MACHINES_SERVICE_ID = "get_machines";
    final static String GET_MACHINES_HISTORY_SERVICE_ID = "get_machines_history";
    
    final IndustrialApi service;

    public IndustrialApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.IndustrialApiImpl");
            service = (IndustrialApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("IndustrialApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for GetAllDataInputs
        vertx.eventBus().<JsonObject> consumer(GETALLDATAINPUTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetAllDataInputs";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String groupIdParam = message.body().getString("group_id");
                Long groupId = (groupIdParam == null) ? null : Json.mapper.readValue(groupIdParam, Long.class);
                String startMsParam = message.body().getString("startMs");
                Long startMs = (startMsParam == null) ? null : Json.mapper.readValue(startMsParam, Long.class);
                String endMsParam = message.body().getString("endMs");
                Long endMs = (endMsParam == null) ? null : Json.mapper.readValue(endMsParam, Long.class);
                service.getAllDataInputs(accessToken, groupId, startMs, endMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetAllDataInputs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetAllDataInputs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetDataInput
        vertx.eventBus().<JsonObject> consumer(GETDATAINPUT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetDataInput";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String dataInputIdParam = message.body().getString("data_input_id");
                if(dataInputIdParam == null) {
                    manageError(message, new MainApiException(400, "data_input_id is required"), serviceId);
                    return;
                }
                Long dataInputId = Json.mapper.readValue(dataInputIdParam, Long.class);
                String startMsParam = message.body().getString("startMs");
                Long startMs = (startMsParam == null) ? null : Json.mapper.readValue(startMsParam, Long.class);
                String endMsParam = message.body().getString("endMs");
                Long endMs = (endMsParam == null) ? null : Json.mapper.readValue(endMsParam, Long.class);
                service.getDataInput(accessToken, dataInputId, startMs, endMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetDataInput");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetDataInput", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_machines
        vertx.eventBus().<JsonObject> consumer(GET_MACHINES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_machines";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject groupParamParam = message.body().getJsonObject("groupParam");
                if (groupParamParam == null) {
                    manageError(message, new MainApiException(400, "groupParam is required"), serviceId);
                    return;
                }
                InlineObject18 groupParam = Json.mapper.readValue(groupParamParam.encode(), InlineObject18.class);
                service.getMachines(accessToken, groupParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_machines");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_machines", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_machines_history
        vertx.eventBus().<JsonObject> consumer(GET_MACHINES_HISTORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_machines_history";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject historyParamParam = message.body().getJsonObject("historyParam");
                if (historyParamParam == null) {
                    manageError(message, new MainApiException(400, "historyParam is required"), serviceId);
                    return;
                }
                InlineObject17 historyParam = Json.mapper.readValue(historyParamParam.encode(), InlineObject17.class);
                service.getMachinesHistory(accessToken, historyParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_machines_history");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_machines_history", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
