package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.DriverSafetyScoreResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.VehicleHarshEventResponse;
import org.openapitools.server.api.model.VehicleSafetyScoreResponse;

import java.util.List;
import java.util.Map;

public class SafetyApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(SafetyApiVerticle.class); 
    
    final static String GETDRIVERSAFETYSCORE_SERVICE_ID = "GetDriverSafetyScore";
    final static String GETVEHICLEHARSHEVENT_SERVICE_ID = "GetVehicleHarshEvent";
    final static String GETVEHICLESAFETYSCORE_SERVICE_ID = "GetVehicleSafetyScore";
    
    final SafetyApi service;

    public SafetyApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.SafetyApiImpl");
            service = (SafetyApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("SafetyApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for GetDriverSafetyScore
        vertx.eventBus().<JsonObject> consumer(GETDRIVERSAFETYSCORE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetDriverSafetyScore";
                String driverIdParam = message.body().getString("driverId");
                if(driverIdParam == null) {
                    manageError(message, new MainApiException(400, "driverId is required"), serviceId);
                    return;
                }
                Long driverId = Json.mapper.readValue(driverIdParam, Long.class);
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String startMsParam = message.body().getString("startMs");
                if(startMsParam == null) {
                    manageError(message, new MainApiException(400, "startMs is required"), serviceId);
                    return;
                }
                Long startMs = Json.mapper.readValue(startMsParam, Long.class);
                String endMsParam = message.body().getString("endMs");
                if(endMsParam == null) {
                    manageError(message, new MainApiException(400, "endMs is required"), serviceId);
                    return;
                }
                Long endMs = Json.mapper.readValue(endMsParam, Long.class);
                service.getDriverSafetyScore(driverId, accessToken, startMs, endMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetDriverSafetyScore");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetDriverSafetyScore", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetVehicleHarshEvent
        vertx.eventBus().<JsonObject> consumer(GETVEHICLEHARSHEVENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetVehicleHarshEvent";
                String vehicleIdParam = message.body().getString("vehicleId");
                if(vehicleIdParam == null) {
                    manageError(message, new MainApiException(400, "vehicleId is required"), serviceId);
                    return;
                }
                Long vehicleId = Json.mapper.readValue(vehicleIdParam, Long.class);
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String timestampParam = message.body().getString("timestamp");
                if(timestampParam == null) {
                    manageError(message, new MainApiException(400, "timestamp is required"), serviceId);
                    return;
                }
                Long timestamp = Json.mapper.readValue(timestampParam, Long.class);
                service.getVehicleHarshEvent(vehicleId, accessToken, timestamp, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetVehicleHarshEvent");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetVehicleHarshEvent", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetVehicleSafetyScore
        vertx.eventBus().<JsonObject> consumer(GETVEHICLESAFETYSCORE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetVehicleSafetyScore";
                String vehicleIdParam = message.body().getString("vehicleId");
                if(vehicleIdParam == null) {
                    manageError(message, new MainApiException(400, "vehicleId is required"), serviceId);
                    return;
                }
                Long vehicleId = Json.mapper.readValue(vehicleIdParam, Long.class);
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String startMsParam = message.body().getString("startMs");
                if(startMsParam == null) {
                    manageError(message, new MainApiException(400, "startMs is required"), serviceId);
                    return;
                }
                Long startMs = Json.mapper.readValue(startMsParam, Long.class);
                String endMsParam = message.body().getString("endMs");
                if(endMsParam == null) {
                    manageError(message, new MainApiException(400, "endMs is required"), serviceId);
                    return;
                }
                Long endMs = Json.mapper.readValue(endMsParam, Long.class);
                service.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetVehicleSafetyScore");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetVehicleSafetyScore", e);
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
