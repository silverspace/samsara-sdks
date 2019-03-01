package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Driver;
import org.openapitools.server.api.model.DriverForCreate;
import org.openapitools.server.api.model.InlineObject4;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class DriversApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(DriversApiVerticle.class); 
    
    final static String CREATEDRIVER_SERVICE_ID = "createDriver";
    final static String DEACTIVATEDRIVER_SERVICE_ID = "deactivateDriver";
    final static String GETALLDEACTIVATEDDRIVERS_SERVICE_ID = "getAllDeactivatedDrivers";
    final static String GETDEACTIVATEDDRIVERBYID_SERVICE_ID = "getDeactivatedDriverById";
    final static String GETDRIVERBYID_SERVICE_ID = "getDriverById";
    final static String REACTIVATEDRIVERBYID_SERVICE_ID = "reactivateDriverById";
    
    final DriversApi service;

    public DriversApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.DriversApiImpl");
            service = (DriversApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("DriversApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createDriver
        vertx.eventBus().<JsonObject> consumer(CREATEDRIVER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createDriver";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject createDriverParamParam = message.body().getJsonObject("createDriverParam");
                if (createDriverParamParam == null) {
                    manageError(message, new MainApiException(400, "createDriverParam is required"), serviceId);
                    return;
                }
                DriverForCreate createDriverParam = Json.mapper.readValue(createDriverParamParam.encode(), DriverForCreate.class);
                service.createDriver(accessToken, createDriverParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createDriver");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createDriver", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deactivateDriver
        vertx.eventBus().<JsonObject> consumer(DEACTIVATEDRIVER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deactivateDriver";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String driverIdOrExternalIdParam = message.body().getString("driver_id_or_external_id");
                if(driverIdOrExternalIdParam == null) {
                    manageError(message, new MainApiException(400, "driver_id_or_external_id is required"), serviceId);
                    return;
                }
                String driverIdOrExternalId = driverIdOrExternalIdParam;
                service.deactivateDriver(accessToken, driverIdOrExternalId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deactivateDriver");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deactivateDriver", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAllDeactivatedDrivers
        vertx.eventBus().<JsonObject> consumer(GETALLDEACTIVATEDDRIVERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAllDeactivatedDrivers";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String groupIdParam = message.body().getString("group_id");
                Long groupId = (groupIdParam == null) ? null : Json.mapper.readValue(groupIdParam, Long.class);
                service.getAllDeactivatedDrivers(accessToken, groupId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAllDeactivatedDrivers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAllDeactivatedDrivers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getDeactivatedDriverById
        vertx.eventBus().<JsonObject> consumer(GETDEACTIVATEDDRIVERBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getDeactivatedDriverById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String driverIdOrExternalIdParam = message.body().getString("driver_id_or_external_id");
                if(driverIdOrExternalIdParam == null) {
                    manageError(message, new MainApiException(400, "driver_id_or_external_id is required"), serviceId);
                    return;
                }
                String driverIdOrExternalId = driverIdOrExternalIdParam;
                service.getDeactivatedDriverById(accessToken, driverIdOrExternalId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getDeactivatedDriverById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getDeactivatedDriverById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getDriverById
        vertx.eventBus().<JsonObject> consumer(GETDRIVERBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getDriverById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String driverIdOrExternalIdParam = message.body().getString("driver_id_or_external_id");
                if(driverIdOrExternalIdParam == null) {
                    manageError(message, new MainApiException(400, "driver_id_or_external_id is required"), serviceId);
                    return;
                }
                String driverIdOrExternalId = driverIdOrExternalIdParam;
                service.getDriverById(accessToken, driverIdOrExternalId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getDriverById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getDriverById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for reactivateDriverById
        vertx.eventBus().<JsonObject> consumer(REACTIVATEDRIVERBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "reactivateDriverById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String driverIdOrExternalIdParam = message.body().getString("driver_id_or_external_id");
                if(driverIdOrExternalIdParam == null) {
                    manageError(message, new MainApiException(400, "driver_id_or_external_id is required"), serviceId);
                    return;
                }
                String driverIdOrExternalId = driverIdOrExternalIdParam;
                JsonObject reactivateDriverParamParam = message.body().getJsonObject("reactivateDriverParam");
                if (reactivateDriverParamParam == null) {
                    manageError(message, new MainApiException(400, "reactivateDriverParam is required"), serviceId);
                    return;
                }
                InlineObject4 reactivateDriverParam = Json.mapper.readValue(reactivateDriverParamParam.encode(), InlineObject4.class);
                service.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "reactivateDriverById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("reactivateDriverById", e);
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
