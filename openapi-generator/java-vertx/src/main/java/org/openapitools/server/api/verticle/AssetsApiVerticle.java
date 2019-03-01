package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AssetReeferResponse;
import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.model.InlineResponse2001;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class AssetsApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(AssetsApiVerticle.class); 
    
    final static String GETALLASSETCURRENTLOCATIONS_SERVICE_ID = "GetAllAssetCurrentLocations";
    final static String GETALLASSETS_SERVICE_ID = "GetAllAssets";
    final static String GETASSETLOCATION_SERVICE_ID = "GetAssetLocation";
    final static String GETASSETREEFER_SERVICE_ID = "GetAssetReefer";
    
    final AssetsApi service;

    public AssetsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AssetsApiImpl");
            service = (AssetsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AssetsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for GetAllAssetCurrentLocations
        vertx.eventBus().<JsonObject> consumer(GETALLASSETCURRENTLOCATIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetAllAssetCurrentLocations";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String groupIdParam = message.body().getString("group_id");
                Long groupId = (groupIdParam == null) ? null : Json.mapper.readValue(groupIdParam, Long.class);
                service.getAllAssetCurrentLocations(accessToken, groupId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetAllAssetCurrentLocations");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetAllAssetCurrentLocations", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetAllAssets
        vertx.eventBus().<JsonObject> consumer(GETALLASSETS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetAllAssets";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String groupIdParam = message.body().getString("group_id");
                Long groupId = (groupIdParam == null) ? null : Json.mapper.readValue(groupIdParam, Long.class);
                service.getAllAssets(accessToken, groupId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetAllAssets");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetAllAssets", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetAssetLocation
        vertx.eventBus().<JsonObject> consumer(GETASSETLOCATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetAssetLocation";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String assetIdParam = message.body().getString("asset_id");
                if(assetIdParam == null) {
                    manageError(message, new MainApiException(400, "asset_id is required"), serviceId);
                    return;
                }
                Long assetId = Json.mapper.readValue(assetIdParam, Long.class);
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
                service.getAssetLocation(accessToken, assetId, startMs, endMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetAssetLocation");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetAssetLocation", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetAssetReefer
        vertx.eventBus().<JsonObject> consumer(GETASSETREEFER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetAssetReefer";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String assetIdParam = message.body().getString("asset_id");
                if(assetIdParam == null) {
                    manageError(message, new MainApiException(400, "asset_id is required"), serviceId);
                    return;
                }
                Long assetId = Json.mapper.readValue(assetIdParam, Long.class);
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
                service.getAssetReefer(accessToken, assetId, startMs, endMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetAssetReefer");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetAssetReefer", e);
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
