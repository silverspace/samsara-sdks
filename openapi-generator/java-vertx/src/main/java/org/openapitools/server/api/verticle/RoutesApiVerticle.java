package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AllRouteJobUpdates;
import org.openapitools.server.api.model.DispatchRoute;
import org.openapitools.server.api.model.DispatchRouteCreate;
import org.openapitools.server.api.model.DispatchRouteHistory;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class RoutesApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(RoutesApiVerticle.class); 
    
    final static String CREATEDISPATCHROUTE_SERVICE_ID = "createDispatchRoute";
    final static String CREATEDRIVERDISPATCHROUTE_SERVICE_ID = "createDriverDispatchRoute";
    final static String CREATEVEHICLEDISPATCHROUTE_SERVICE_ID = "createVehicleDispatchRoute";
    final static String DELETEDISPATCHROUTEBYID_SERVICE_ID = "deleteDispatchRouteById";
    final static String FETCHALLDISPATCHROUTES_SERVICE_ID = "fetchAllDispatchRoutes";
    final static String FETCHALLROUTEJOBUPDATES_SERVICE_ID = "fetchAllRouteJobUpdates";
    final static String GETDISPATCHROUTEBYID_SERVICE_ID = "getDispatchRouteById";
    final static String GETDISPATCHROUTEHISTORY_SERVICE_ID = "getDispatchRouteHistory";
    final static String GETDISPATCHROUTESBYDRIVERID_SERVICE_ID = "getDispatchRoutesByDriverId";
    final static String GETDISPATCHROUTESBYVEHICLEID_SERVICE_ID = "getDispatchRoutesByVehicleId";
    final static String UPDATEDISPATCHROUTEBYID_SERVICE_ID = "updateDispatchRouteById";
    
    final RoutesApi service;

    public RoutesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.RoutesApiImpl");
            service = (RoutesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("RoutesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createDispatchRoute
        vertx.eventBus().<JsonObject> consumer(CREATEDISPATCHROUTE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createDispatchRoute";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject createDispatchRouteParamsParam = message.body().getJsonObject("createDispatchRouteParams");
                if (createDispatchRouteParamsParam == null) {
                    manageError(message, new MainApiException(400, "createDispatchRouteParams is required"), serviceId);
                    return;
                }
                DispatchRouteCreate createDispatchRouteParams = Json.mapper.readValue(createDispatchRouteParamsParam.encode(), DispatchRouteCreate.class);
                service.createDispatchRoute(accessToken, createDispatchRouteParams, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createDispatchRoute");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createDispatchRoute", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createDriverDispatchRoute
        vertx.eventBus().<JsonObject> consumer(CREATEDRIVERDISPATCHROUTE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createDriverDispatchRoute";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String driverIdParam = message.body().getString("driver_id");
                if(driverIdParam == null) {
                    manageError(message, new MainApiException(400, "driver_id is required"), serviceId);
                    return;
                }
                Long driverId = Json.mapper.readValue(driverIdParam, Long.class);
                JsonObject createDispatchRouteParamsParam = message.body().getJsonObject("createDispatchRouteParams");
                if (createDispatchRouteParamsParam == null) {
                    manageError(message, new MainApiException(400, "createDispatchRouteParams is required"), serviceId);
                    return;
                }
                DispatchRouteCreate createDispatchRouteParams = Json.mapper.readValue(createDispatchRouteParamsParam.encode(), DispatchRouteCreate.class);
                service.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createDriverDispatchRoute");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createDriverDispatchRoute", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createVehicleDispatchRoute
        vertx.eventBus().<JsonObject> consumer(CREATEVEHICLEDISPATCHROUTE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createVehicleDispatchRoute";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String vehicleIdParam = message.body().getString("vehicle_id");
                if(vehicleIdParam == null) {
                    manageError(message, new MainApiException(400, "vehicle_id is required"), serviceId);
                    return;
                }
                Long vehicleId = Json.mapper.readValue(vehicleIdParam, Long.class);
                JsonObject createDispatchRouteParamsParam = message.body().getJsonObject("createDispatchRouteParams");
                if (createDispatchRouteParamsParam == null) {
                    manageError(message, new MainApiException(400, "createDispatchRouteParams is required"), serviceId);
                    return;
                }
                DispatchRouteCreate createDispatchRouteParams = Json.mapper.readValue(createDispatchRouteParamsParam.encode(), DispatchRouteCreate.class);
                service.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createVehicleDispatchRoute");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createVehicleDispatchRoute", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteDispatchRouteById
        vertx.eventBus().<JsonObject> consumer(DELETEDISPATCHROUTEBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteDispatchRouteById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String routeIdParam = message.body().getString("route_id");
                if(routeIdParam == null) {
                    manageError(message, new MainApiException(400, "route_id is required"), serviceId);
                    return;
                }
                Long routeId = Json.mapper.readValue(routeIdParam, Long.class);
                service.deleteDispatchRouteById(accessToken, routeId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteDispatchRouteById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteDispatchRouteById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for fetchAllDispatchRoutes
        vertx.eventBus().<JsonObject> consumer(FETCHALLDISPATCHROUTES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "fetchAllDispatchRoutes";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String groupIdParam = message.body().getString("group_id");
                Long groupId = (groupIdParam == null) ? null : Json.mapper.readValue(groupIdParam, Long.class);
                String endTimeParam = message.body().getString("end_time");
                Long endTime = (endTimeParam == null) ? null : Json.mapper.readValue(endTimeParam, Long.class);
                String durationParam = message.body().getString("duration");
                Long duration = (durationParam == null) ? null : Json.mapper.readValue(durationParam, Long.class);
                service.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "fetchAllDispatchRoutes");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("fetchAllDispatchRoutes", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for fetchAllRouteJobUpdates
        vertx.eventBus().<JsonObject> consumer(FETCHALLROUTEJOBUPDATES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "fetchAllRouteJobUpdates";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String groupIdParam = message.body().getString("group_id");
                Long groupId = (groupIdParam == null) ? null : Json.mapper.readValue(groupIdParam, Long.class);
                String sequenceIdParam = message.body().getString("sequence_id");
                String sequenceId = (sequenceIdParam == null) ? null : sequenceIdParam;
                String includeParam = message.body().getString("include");
                String include = (includeParam == null) ? null : includeParam;
                service.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "fetchAllRouteJobUpdates");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("fetchAllRouteJobUpdates", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getDispatchRouteById
        vertx.eventBus().<JsonObject> consumer(GETDISPATCHROUTEBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getDispatchRouteById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String routeIdParam = message.body().getString("route_id");
                if(routeIdParam == null) {
                    manageError(message, new MainApiException(400, "route_id is required"), serviceId);
                    return;
                }
                Long routeId = Json.mapper.readValue(routeIdParam, Long.class);
                service.getDispatchRouteById(accessToken, routeId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getDispatchRouteById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getDispatchRouteById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getDispatchRouteHistory
        vertx.eventBus().<JsonObject> consumer(GETDISPATCHROUTEHISTORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getDispatchRouteHistory";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String routeIdParam = message.body().getString("route_id");
                if(routeIdParam == null) {
                    manageError(message, new MainApiException(400, "route_id is required"), serviceId);
                    return;
                }
                Long routeId = Json.mapper.readValue(routeIdParam, Long.class);
                String startTimeParam = message.body().getString("start_time");
                Long startTime = (startTimeParam == null) ? null : Json.mapper.readValue(startTimeParam, Long.class);
                String endTimeParam = message.body().getString("end_time");
                Long endTime = (endTimeParam == null) ? null : Json.mapper.readValue(endTimeParam, Long.class);
                service.getDispatchRouteHistory(accessToken, routeId, startTime, endTime, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getDispatchRouteHistory");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getDispatchRouteHistory", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getDispatchRoutesByDriverId
        vertx.eventBus().<JsonObject> consumer(GETDISPATCHROUTESBYDRIVERID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getDispatchRoutesByDriverId";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String driverIdParam = message.body().getString("driver_id");
                if(driverIdParam == null) {
                    manageError(message, new MainApiException(400, "driver_id is required"), serviceId);
                    return;
                }
                Long driverId = Json.mapper.readValue(driverIdParam, Long.class);
                String endTimeParam = message.body().getString("end_time");
                Long endTime = (endTimeParam == null) ? null : Json.mapper.readValue(endTimeParam, Long.class);
                String durationParam = message.body().getString("duration");
                Long duration = (durationParam == null) ? null : Json.mapper.readValue(durationParam, Long.class);
                service.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getDispatchRoutesByDriverId");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getDispatchRoutesByDriverId", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getDispatchRoutesByVehicleId
        vertx.eventBus().<JsonObject> consumer(GETDISPATCHROUTESBYVEHICLEID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getDispatchRoutesByVehicleId";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String vehicleIdParam = message.body().getString("vehicle_id");
                if(vehicleIdParam == null) {
                    manageError(message, new MainApiException(400, "vehicle_id is required"), serviceId);
                    return;
                }
                Long vehicleId = Json.mapper.readValue(vehicleIdParam, Long.class);
                String endTimeParam = message.body().getString("end_time");
                Long endTime = (endTimeParam == null) ? null : Json.mapper.readValue(endTimeParam, Long.class);
                String durationParam = message.body().getString("duration");
                Long duration = (durationParam == null) ? null : Json.mapper.readValue(durationParam, Long.class);
                service.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getDispatchRoutesByVehicleId");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getDispatchRoutesByVehicleId", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateDispatchRouteById
        vertx.eventBus().<JsonObject> consumer(UPDATEDISPATCHROUTEBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateDispatchRouteById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String routeIdParam = message.body().getString("route_id");
                if(routeIdParam == null) {
                    manageError(message, new MainApiException(400, "route_id is required"), serviceId);
                    return;
                }
                Long routeId = Json.mapper.readValue(routeIdParam, Long.class);
                JsonObject updateDispatchRouteParamsParam = message.body().getJsonObject("updateDispatchRouteParams");
                if (updateDispatchRouteParamsParam == null) {
                    manageError(message, new MainApiException(400, "updateDispatchRouteParams is required"), serviceId);
                    return;
                }
                DispatchRoute updateDispatchRouteParams = Json.mapper.readValue(updateDispatchRouteParamsParam.encode(), DispatchRoute.class);
                service.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateDispatchRouteById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateDispatchRouteById", e);
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
