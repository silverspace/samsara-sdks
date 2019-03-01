package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CargoResponse;
import org.openapitools.server.api.model.DoorResponse;
import org.openapitools.server.api.model.HumidityResponse;
import org.openapitools.server.api.model.InlineObject19;
import org.openapitools.server.api.model.InlineObject20;
import org.openapitools.server.api.model.InlineObject21;
import org.openapitools.server.api.model.InlineObject22;
import org.openapitools.server.api.model.InlineObject23;
import org.openapitools.server.api.model.InlineObject24;
import org.openapitools.server.api.model.InlineResponse2008;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SensorHistoryResponse;
import org.openapitools.server.api.model.TemperatureResponse;

import java.util.List;
import java.util.Map;

public class SensorsApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(SensorsApiVerticle.class); 
    
    final static String GET_SENSORS_SERVICE_ID = "get_sensors";
    final static String GET_SENSORS_CARGO_SERVICE_ID = "get_sensors_cargo";
    final static String GET_SENSORS_DOOR_SERVICE_ID = "get_sensors_door";
    final static String GET_SENSORS_HISTORY_SERVICE_ID = "get_sensors_history";
    final static String GET_SENSORS_HUMIDITY_SERVICE_ID = "get_sensors_humidity";
    final static String GET_SENSORS_TEMPERATURE_SERVICE_ID = "get_sensors_temperature";
    
    final SensorsApi service;

    public SensorsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.SensorsApiImpl");
            service = (SensorsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("SensorsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for get_sensors
        vertx.eventBus().<JsonObject> consumer(GET_SENSORS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_sensors";
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
                InlineObject23 groupParam = Json.mapper.readValue(groupParamParam.encode(), InlineObject23.class);
                service.getSensors(accessToken, groupParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_sensors");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_sensors", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_sensors_cargo
        vertx.eventBus().<JsonObject> consumer(GET_SENSORS_CARGO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_sensors_cargo";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject sensorParamParam = message.body().getJsonObject("sensorParam");
                if (sensorParamParam == null) {
                    manageError(message, new MainApiException(400, "sensorParam is required"), serviceId);
                    return;
                }
                InlineObject19 sensorParam = Json.mapper.readValue(sensorParamParam.encode(), InlineObject19.class);
                service.getSensorsCargo(accessToken, sensorParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_sensors_cargo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_sensors_cargo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_sensors_door
        vertx.eventBus().<JsonObject> consumer(GET_SENSORS_DOOR_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_sensors_door";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject sensorParamParam = message.body().getJsonObject("sensorParam");
                if (sensorParamParam == null) {
                    manageError(message, new MainApiException(400, "sensorParam is required"), serviceId);
                    return;
                }
                InlineObject20 sensorParam = Json.mapper.readValue(sensorParamParam.encode(), InlineObject20.class);
                service.getSensorsDoor(accessToken, sensorParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_sensors_door");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_sensors_door", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_sensors_history
        vertx.eventBus().<JsonObject> consumer(GET_SENSORS_HISTORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_sensors_history";
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
                InlineObject21 historyParam = Json.mapper.readValue(historyParamParam.encode(), InlineObject21.class);
                service.getSensorsHistory(accessToken, historyParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_sensors_history");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_sensors_history", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_sensors_humidity
        vertx.eventBus().<JsonObject> consumer(GET_SENSORS_HUMIDITY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_sensors_humidity";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject sensorParamParam = message.body().getJsonObject("sensorParam");
                if (sensorParamParam == null) {
                    manageError(message, new MainApiException(400, "sensorParam is required"), serviceId);
                    return;
                }
                InlineObject22 sensorParam = Json.mapper.readValue(sensorParamParam.encode(), InlineObject22.class);
                service.getSensorsHumidity(accessToken, sensorParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_sensors_humidity");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_sensors_humidity", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_sensors_temperature
        vertx.eventBus().<JsonObject> consumer(GET_SENSORS_TEMPERATURE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_sensors_temperature";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject sensorParamParam = message.body().getJsonObject("sensorParam");
                if (sensorParamParam == null) {
                    manageError(message, new MainApiException(400, "sensorParam is required"), serviceId);
                    return;
                }
                InlineObject24 sensorParam = Json.mapper.readValue(sensorParamParam.encode(), InlineObject24.class);
                service.getSensorsTemperature(accessToken, sensorParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_sensors_temperature");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_sensors_temperature", e);
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
