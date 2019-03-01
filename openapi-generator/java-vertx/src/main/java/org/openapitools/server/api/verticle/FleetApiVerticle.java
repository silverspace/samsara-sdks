package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Address;
import org.openapitools.server.api.model.AllRouteJobUpdates;
import org.openapitools.server.api.model.AssetReeferResponse;
import org.openapitools.server.api.model.Contact;
import org.openapitools.server.api.model.DispatchRoute;
import org.openapitools.server.api.model.DispatchRouteCreate;
import org.openapitools.server.api.model.DispatchRouteHistory;
import org.openapitools.server.api.model.Document;
import org.openapitools.server.api.model.DocumentCreate;
import org.openapitools.server.api.model.DocumentType;
import org.openapitools.server.api.model.Driver;
import org.openapitools.server.api.model.DriverDailyLogResponse;
import org.openapitools.server.api.model.DriverForCreate;
import org.openapitools.server.api.model.DriverSafetyScoreResponse;
import org.openapitools.server.api.model.DriversResponse;
import org.openapitools.server.api.model.DriversSummaryResponse;
import org.openapitools.server.api.model.DvirBase;
import org.openapitools.server.api.model.DvirListResponse;
import org.openapitools.server.api.model.FleetVehicleLocation;
import org.openapitools.server.api.model.FleetVehicleResponse;
import org.openapitools.server.api.model.HosAuthenticationLogsResponse;
import org.openapitools.server.api.model.HosLogsResponse;
import org.openapitools.server.api.model.HosLogsSummaryResponse;
import org.openapitools.server.api.model.InlineObject;
import org.openapitools.server.api.model.InlineObject1;
import org.openapitools.server.api.model.InlineObject10;
import org.openapitools.server.api.model.InlineObject11;
import org.openapitools.server.api.model.InlineObject12;
import org.openapitools.server.api.model.InlineObject13;
import org.openapitools.server.api.model.InlineObject14;
import org.openapitools.server.api.model.InlineObject15;
import org.openapitools.server.api.model.InlineObject16;
import org.openapitools.server.api.model.InlineObject2;
import org.openapitools.server.api.model.InlineObject3;
import org.openapitools.server.api.model.InlineObject4;
import org.openapitools.server.api.model.InlineObject5;
import org.openapitools.server.api.model.InlineObject6;
import org.openapitools.server.api.model.InlineObject7;
import org.openapitools.server.api.model.InlineObject8;
import org.openapitools.server.api.model.InlineObject9;
import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.model.InlineResponse2001;
import org.openapitools.server.api.model.InlineResponse2002;
import org.openapitools.server.api.model.InlineResponse2003;
import org.openapitools.server.api.model.InlineResponse2004;
import org.openapitools.server.api.model.InlineResponse2005;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TripResponse;
import org.openapitools.server.api.model.VehicleHarshEventResponse;
import org.openapitools.server.api.model.VehicleSafetyScoreResponse;

import java.util.List;
import java.util.Map;

public class FleetApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(FleetApiVerticle.class); 
    
    final static String ADD_FLEET_ADDRESS_SERVICE_ID = "add_fleet_address";
    final static String ADDORGANIZATIONADDRESSES_SERVICE_ID = "AddOrganizationAddresses";
    final static String CREATEDISPATCHROUTE_SERVICE_ID = "createDispatchRoute";
    final static String CREATEDRIVER_SERVICE_ID = "createDriver";
    final static String CREATEDRIVERDISPATCHROUTE_SERVICE_ID = "createDriverDispatchRoute";
    final static String CREATEDRIVERDOCUMENT_SERVICE_ID = "createDriverDocument";
    final static String CREATE_DVIR_SERVICE_ID = "create_dvir";
    final static String CREATEVEHICLEDISPATCHROUTE_SERVICE_ID = "createVehicleDispatchRoute";
    final static String DEACTIVATEDRIVER_SERVICE_ID = "deactivateDriver";
    final static String DELETEDISPATCHROUTEBYID_SERVICE_ID = "deleteDispatchRouteById";
    final static String DELETEORGANIZATIONADDRESS_SERVICE_ID = "DeleteOrganizationAddress";
    final static String FETCHALLDISPATCHROUTES_SERVICE_ID = "fetchAllDispatchRoutes";
    final static String FETCHALLROUTEJOBUPDATES_SERVICE_ID = "fetchAllRouteJobUpdates";
    final static String GETALLASSETCURRENTLOCATIONS_SERVICE_ID = "GetAllAssetCurrentLocations";
    final static String GETALLASSETS_SERVICE_ID = "GetAllAssets";
    final static String GETALLDEACTIVATEDDRIVERS_SERVICE_ID = "getAllDeactivatedDrivers";
    final static String GETASSETLOCATION_SERVICE_ID = "GetAssetLocation";
    final static String GETASSETREEFER_SERVICE_ID = "GetAssetReefer";
    final static String GETDEACTIVATEDDRIVERBYID_SERVICE_ID = "getDeactivatedDriverById";
    final static String GETDISPATCHROUTEBYID_SERVICE_ID = "getDispatchRouteById";
    final static String GETDISPATCHROUTEHISTORY_SERVICE_ID = "getDispatchRouteHistory";
    final static String GETDISPATCHROUTESBYDRIVERID_SERVICE_ID = "getDispatchRoutesByDriverId";
    final static String GETDISPATCHROUTESBYVEHICLEID_SERVICE_ID = "getDispatchRoutesByVehicleId";
    final static String GETDRIVERBYID_SERVICE_ID = "getDriverById";
    final static String GETDRIVERDOCUMENTTYPESBYORGID_SERVICE_ID = "getDriverDocumentTypesByOrgId";
    final static String GETDRIVERDOCUMENTSBYORGID_SERVICE_ID = "getDriverDocumentsByOrgId";
    final static String GETDRIVERSAFETYSCORE_SERVICE_ID = "GetDriverSafetyScore";
    final static String GET_DVIRS_SERVICE_ID = "get_dvirs";
    final static String GET_FLEET_DRIVERS_SERVICE_ID = "get_fleet_drivers";
    final static String GET_FLEET_DRIVERS_HOS_DAILY_LOGS_SERVICE_ID = "get_fleet_drivers_hos_daily_logs";
    final static String GET_FLEET_DRIVERS_SUMMARY_SERVICE_ID = "get_fleet_drivers_summary";
    final static String GET_FLEET_HOS_AUTHENTICATION_LOGS_SERVICE_ID = "get_fleet_hos_authentication_logs";
    final static String GET_FLEET_HOS_LOGS_SERVICE_ID = "get_fleet_hos_logs";
    final static String GET_FLEET_HOS_LOGS_SUMMARY_SERVICE_ID = "get_fleet_hos_logs_summary";
    final static String GET_FLEET_LOCATIONS_SERVICE_ID = "get_fleet_locations";
    final static String GET_FLEET_MAINTENANCE_LIST_SERVICE_ID = "get_fleet_maintenance_list";
    final static String GET_FLEET_TRIPS_SERVICE_ID = "get_fleet_trips";
    final static String GETFLEETVEHICLE_SERVICE_ID = "getFleetVehicle";
    final static String GETORGANIZATIONADDRESS_SERVICE_ID = "GetOrganizationAddress";
    final static String GETORGANIZATIONADDRESSES_SERVICE_ID = "GetOrganizationAddresses";
    final static String GETORGANIZATIONCONTACT_SERVICE_ID = "GetOrganizationContact";
    final static String GETVEHICLEHARSHEVENT_SERVICE_ID = "GetVehicleHarshEvent";
    final static String GETVEHICLELOCATIONS_SERVICE_ID = "getVehicleLocations";
    final static String GETVEHICLESAFETYSCORE_SERVICE_ID = "GetVehicleSafetyScore";
    final static String GETVEHICLESTATS_SERVICE_ID = "GetVehicleStats";
    final static String GETVEHICLESLOCATIONS_SERVICE_ID = "getVehiclesLocations";
    final static String LISTCONTACTS_SERVICE_ID = "ListContacts";
    final static String LIST_FLEET_SERVICE_ID = "list_fleet";
    final static String PATCHFLEETVEHICLE_SERVICE_ID = "patchFleetVehicle";
    final static String REACTIVATEDRIVERBYID_SERVICE_ID = "reactivateDriverById";
    final static String UPDATEDISPATCHROUTEBYID_SERVICE_ID = "updateDispatchRouteById";
    final static String UPDATEORGANIZATIONADDRESS_SERVICE_ID = "UpdateOrganizationAddress";
    final static String UPDATE_VEHICLES_SERVICE_ID = "update_vehicles";
    
    final FleetApi service;

    public FleetApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.FleetApiImpl");
            service = (FleetApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("FleetApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for add_fleet_address
        vertx.eventBus().<JsonObject> consumer(ADD_FLEET_ADDRESS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "add_fleet_address";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject addressParamParam = message.body().getJsonObject("addressParam");
                if (addressParamParam == null) {
                    manageError(message, new MainApiException(400, "addressParam is required"), serviceId);
                    return;
                }
                InlineObject2 addressParam = Json.mapper.readValue(addressParamParam.encode(), InlineObject2.class);
                service.addFleetAddress(accessToken, addressParam, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "add_fleet_address");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("add_fleet_address", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for AddOrganizationAddresses
        vertx.eventBus().<JsonObject> consumer(ADDORGANIZATIONADDRESSES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "AddOrganizationAddresses";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject addressesParam = message.body().getJsonObject("addresses");
                if (addressesParam == null) {
                    manageError(message, new MainApiException(400, "addresses is required"), serviceId);
                    return;
                }
                InlineObject addresses = Json.mapper.readValue(addressesParam.encode(), InlineObject.class);
                service.addOrganizationAddresses(accessToken, addresses, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "AddOrganizationAddresses");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("AddOrganizationAddresses", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
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
        
        //Consumer for createDriverDocument
        vertx.eventBus().<JsonObject> consumer(CREATEDRIVERDOCUMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createDriverDocument";
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
                JsonObject createDocumentParamsParam = message.body().getJsonObject("createDocumentParams");
                if (createDocumentParamsParam == null) {
                    manageError(message, new MainApiException(400, "createDocumentParams is required"), serviceId);
                    return;
                }
                DocumentCreate createDocumentParams = Json.mapper.readValue(createDocumentParamsParam.encode(), DocumentCreate.class);
                service.createDriverDocument(accessToken, driverId, createDocumentParams, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createDriverDocument");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createDriverDocument", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for create_dvir
        vertx.eventBus().<JsonObject> consumer(CREATE_DVIR_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create_dvir";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject createDvirParamParam = message.body().getJsonObject("createDvirParam");
                if (createDvirParamParam == null) {
                    manageError(message, new MainApiException(400, "createDvirParam is required"), serviceId);
                    return;
                }
                InlineObject12 createDvirParam = Json.mapper.readValue(createDvirParamParam.encode(), InlineObject12.class);
                service.createDvir(accessToken, createDvirParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "create_dvir");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create_dvir", e);
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
        
        //Consumer for DeleteOrganizationAddress
        vertx.eventBus().<JsonObject> consumer(DELETEORGANIZATIONADDRESS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "DeleteOrganizationAddress";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String addressIdParam = message.body().getString("addressId");
                if(addressIdParam == null) {
                    manageError(message, new MainApiException(400, "addressId is required"), serviceId);
                    return;
                }
                Long addressId = Json.mapper.readValue(addressIdParam, Long.class);
                service.deleteOrganizationAddress(accessToken, addressId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "DeleteOrganizationAddress");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("DeleteOrganizationAddress", e);
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
        
        //Consumer for getDriverDocumentTypesByOrgId
        vertx.eventBus().<JsonObject> consumer(GETDRIVERDOCUMENTTYPESBYORGID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getDriverDocumentTypesByOrgId";
                service.getDriverDocumentTypesByOrgId(result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getDriverDocumentTypesByOrgId");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getDriverDocumentTypesByOrgId", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getDriverDocumentsByOrgId
        vertx.eventBus().<JsonObject> consumer(GETDRIVERDOCUMENTSBYORGID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getDriverDocumentsByOrgId";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String endMsParam = message.body().getString("endMs");
                Long endMs = (endMsParam == null) ? null : Json.mapper.readValue(endMsParam, Long.class);
                String durationMsParam = message.body().getString("durationMs");
                Long durationMs = (durationMsParam == null) ? null : Json.mapper.readValue(durationMsParam, Long.class);
                service.getDriverDocumentsByOrgId(accessToken, endMs, durationMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getDriverDocumentsByOrgId");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getDriverDocumentsByOrgId", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
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
        
        //Consumer for get_dvirs
        vertx.eventBus().<JsonObject> consumer(GET_DVIRS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_dvirs";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String endMsParam = message.body().getString("end_ms");
                if(endMsParam == null) {
                    manageError(message, new MainApiException(400, "end_ms is required"), serviceId);
                    return;
                }
                Integer endMs = Json.mapper.readValue(endMsParam, Integer.class);
                String durationMsParam = message.body().getString("duration_ms");
                if(durationMsParam == null) {
                    manageError(message, new MainApiException(400, "duration_ms is required"), serviceId);
                    return;
                }
                Integer durationMs = Json.mapper.readValue(durationMsParam, Integer.class);
                String groupIdParam = message.body().getString("group_id");
                Integer groupId = (groupIdParam == null) ? null : Json.mapper.readValue(groupIdParam, Integer.class);
                service.getDvirs(accessToken, endMs, durationMs, groupId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_dvirs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_dvirs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_drivers
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_DRIVERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_drivers";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject groupDriversParamParam = message.body().getJsonObject("groupDriversParam");
                if (groupDriversParamParam == null) {
                    manageError(message, new MainApiException(400, "groupDriversParam is required"), serviceId);
                    return;
                }
                InlineObject3 groupDriversParam = Json.mapper.readValue(groupDriversParamParam.encode(), InlineObject3.class);
                service.getFleetDrivers(accessToken, groupDriversParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_drivers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_drivers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_drivers_hos_daily_logs
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_DRIVERS_HOS_DAILY_LOGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_drivers_hos_daily_logs";
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
                JsonObject hosLogsParamParam = message.body().getJsonObject("hosLogsParam");
                if (hosLogsParamParam == null) {
                    manageError(message, new MainApiException(400, "hosLogsParam is required"), serviceId);
                    return;
                }
                InlineObject6 hosLogsParam = Json.mapper.readValue(hosLogsParamParam.encode(), InlineObject6.class);
                service.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_drivers_hos_daily_logs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_drivers_hos_daily_logs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_drivers_summary
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_DRIVERS_SUMMARY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_drivers_summary";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject driversSummaryParamParam = message.body().getJsonObject("driversSummaryParam");
                if (driversSummaryParamParam == null) {
                    manageError(message, new MainApiException(400, "driversSummaryParam is required"), serviceId);
                    return;
                }
                InlineObject5 driversSummaryParam = Json.mapper.readValue(driversSummaryParamParam.encode(), InlineObject5.class);
                String snapToDayBoundsParam = message.body().getString("snap_to_day_bounds");
                Boolean snapToDayBounds = (snapToDayBoundsParam == null) ? null : Json.mapper.readValue(snapToDayBoundsParam, Boolean.class);
                service.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_drivers_summary");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_drivers_summary", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_hos_authentication_logs
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_HOS_AUTHENTICATION_LOGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_hos_authentication_logs";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject hosAuthenticationLogsParamParam = message.body().getJsonObject("hosAuthenticationLogsParam");
                if (hosAuthenticationLogsParamParam == null) {
                    manageError(message, new MainApiException(400, "hosAuthenticationLogsParam is required"), serviceId);
                    return;
                }
                InlineObject7 hosAuthenticationLogsParam = Json.mapper.readValue(hosAuthenticationLogsParamParam.encode(), InlineObject7.class);
                service.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_hos_authentication_logs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_hos_authentication_logs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_hos_logs
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_HOS_LOGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_hos_logs";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject hosLogsParamParam = message.body().getJsonObject("hosLogsParam");
                if (hosLogsParamParam == null) {
                    manageError(message, new MainApiException(400, "hosLogsParam is required"), serviceId);
                    return;
                }
                InlineObject8 hosLogsParam = Json.mapper.readValue(hosLogsParamParam.encode(), InlineObject8.class);
                service.getFleetHosLogs(accessToken, hosLogsParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_hos_logs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_hos_logs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_hos_logs_summary
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_HOS_LOGS_SUMMARY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_hos_logs_summary";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject hosLogsParamParam = message.body().getJsonObject("hosLogsParam");
                if (hosLogsParamParam == null) {
                    manageError(message, new MainApiException(400, "hosLogsParam is required"), serviceId);
                    return;
                }
                InlineObject9 hosLogsParam = Json.mapper.readValue(hosLogsParamParam.encode(), InlineObject9.class);
                service.getFleetHosLogsSummary(accessToken, hosLogsParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_hos_logs_summary");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_hos_logs_summary", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_locations
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_LOCATIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_locations";
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
                InlineObject11 groupParam = Json.mapper.readValue(groupParamParam.encode(), InlineObject11.class);
                service.getFleetLocations(accessToken, groupParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_locations");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_locations", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_maintenance_list
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_MAINTENANCE_LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_maintenance_list";
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
                InlineObject13 groupParam = Json.mapper.readValue(groupParamParam.encode(), InlineObject13.class);
                service.getFleetMaintenanceList(accessToken, groupParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_maintenance_list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_maintenance_list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_fleet_trips
        vertx.eventBus().<JsonObject> consumer(GET_FLEET_TRIPS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_fleet_trips";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject tripsParamParam = message.body().getJsonObject("tripsParam");
                if (tripsParamParam == null) {
                    manageError(message, new MainApiException(400, "tripsParam is required"), serviceId);
                    return;
                }
                InlineObject15 tripsParam = Json.mapper.readValue(tripsParamParam.encode(), InlineObject15.class);
                service.getFleetTrips(accessToken, tripsParam, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_fleet_trips");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_fleet_trips", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getFleetVehicle
        vertx.eventBus().<JsonObject> consumer(GETFLEETVEHICLE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFleetVehicle";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String vehicleIdOrExternalIdParam = message.body().getString("vehicle_id_or_external_id");
                if(vehicleIdOrExternalIdParam == null) {
                    manageError(message, new MainApiException(400, "vehicle_id_or_external_id is required"), serviceId);
                    return;
                }
                String vehicleIdOrExternalId = vehicleIdOrExternalIdParam;
                service.getFleetVehicle(accessToken, vehicleIdOrExternalId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFleetVehicle");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFleetVehicle", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetOrganizationAddress
        vertx.eventBus().<JsonObject> consumer(GETORGANIZATIONADDRESS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetOrganizationAddress";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String addressIdParam = message.body().getString("addressId");
                if(addressIdParam == null) {
                    manageError(message, new MainApiException(400, "addressId is required"), serviceId);
                    return;
                }
                Long addressId = Json.mapper.readValue(addressIdParam, Long.class);
                service.getOrganizationAddress(accessToken, addressId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetOrganizationAddress");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetOrganizationAddress", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetOrganizationAddresses
        vertx.eventBus().<JsonObject> consumer(GETORGANIZATIONADDRESSES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetOrganizationAddresses";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                service.getOrganizationAddresses(accessToken, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetOrganizationAddresses");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetOrganizationAddresses", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetOrganizationContact
        vertx.eventBus().<JsonObject> consumer(GETORGANIZATIONCONTACT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetOrganizationContact";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String contactIdParam = message.body().getString("contact_id");
                if(contactIdParam == null) {
                    manageError(message, new MainApiException(400, "contact_id is required"), serviceId);
                    return;
                }
                Long contactId = Json.mapper.readValue(contactIdParam, Long.class);
                service.getOrganizationContact(accessToken, contactId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetOrganizationContact");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetOrganizationContact", e);
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
        
        //Consumer for getVehicleLocations
        vertx.eventBus().<JsonObject> consumer(GETVEHICLELOCATIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getVehicleLocations";
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
                service.getVehicleLocations(accessToken, vehicleId, startMs, endMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getVehicleLocations");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getVehicleLocations", e);
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
        
        //Consumer for GetVehicleStats
        vertx.eventBus().<JsonObject> consumer(GETVEHICLESTATS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetVehicleStats";
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
                Integer startMs = Json.mapper.readValue(startMsParam, Integer.class);
                String endMsParam = message.body().getString("endMs");
                if(endMsParam == null) {
                    manageError(message, new MainApiException(400, "endMs is required"), serviceId);
                    return;
                }
                Integer endMs = Json.mapper.readValue(endMsParam, Integer.class);
                String seriesParam = message.body().getString("series");
                String series = (seriesParam == null) ? null : seriesParam;
                String tagIdsParam = message.body().getString("tagIds");
                String tagIds = (tagIdsParam == null) ? null : tagIdsParam;
                String startingAfterParam = message.body().getString("startingAfter");
                String startingAfter = (startingAfterParam == null) ? null : startingAfterParam;
                String endingBeforeParam = message.body().getString("endingBefore");
                String endingBefore = (endingBeforeParam == null) ? null : endingBeforeParam;
                String limitParam = message.body().getString("limit");
                Long limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Long.class);
                service.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetVehicleStats");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetVehicleStats", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getVehiclesLocations
        vertx.eventBus().<JsonObject> consumer(GETVEHICLESLOCATIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getVehiclesLocations";
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
                Integer startMs = Json.mapper.readValue(startMsParam, Integer.class);
                String endMsParam = message.body().getString("endMs");
                if(endMsParam == null) {
                    manageError(message, new MainApiException(400, "endMs is required"), serviceId);
                    return;
                }
                Integer endMs = Json.mapper.readValue(endMsParam, Integer.class);
                service.getVehiclesLocations(accessToken, startMs, endMs, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getVehiclesLocations");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getVehiclesLocations", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for ListContacts
        vertx.eventBus().<JsonObject> consumer(LISTCONTACTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "ListContacts";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                service.listContacts(accessToken, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "ListContacts");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("ListContacts", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for list_fleet
        vertx.eventBus().<JsonObject> consumer(LIST_FLEET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "list_fleet";
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
                InlineObject10 groupParam = Json.mapper.readValue(groupParamParam.encode(), InlineObject10.class);
                String startingAfterParam = message.body().getString("startingAfter");
                String startingAfter = (startingAfterParam == null) ? null : startingAfterParam;
                String endingBeforeParam = message.body().getString("endingBefore");
                String endingBefore = (endingBeforeParam == null) ? null : endingBeforeParam;
                String limitParam = message.body().getString("limit");
                Long limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Long.class);
                service.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "list_fleet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("list_fleet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for patchFleetVehicle
        vertx.eventBus().<JsonObject> consumer(PATCHFLEETVEHICLE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "patchFleetVehicle";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String vehicleIdOrExternalIdParam = message.body().getString("vehicle_id_or_external_id");
                if(vehicleIdOrExternalIdParam == null) {
                    manageError(message, new MainApiException(400, "vehicle_id_or_external_id is required"), serviceId);
                    return;
                }
                String vehicleIdOrExternalId = vehicleIdOrExternalIdParam;
                JsonObject dataParam = message.body().getJsonObject("data");
                if (dataParam == null) {
                    manageError(message, new MainApiException(400, "data is required"), serviceId);
                    return;
                }
                InlineObject16 data = Json.mapper.readValue(dataParam.encode(), InlineObject16.class);
                service.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "patchFleetVehicle");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("patchFleetVehicle", e);
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
        
        //Consumer for UpdateOrganizationAddress
        vertx.eventBus().<JsonObject> consumer(UPDATEORGANIZATIONADDRESS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "UpdateOrganizationAddress";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String addressIdParam = message.body().getString("addressId");
                if(addressIdParam == null) {
                    manageError(message, new MainApiException(400, "addressId is required"), serviceId);
                    return;
                }
                Long addressId = Json.mapper.readValue(addressIdParam, Long.class);
                JsonObject addressParam = message.body().getJsonObject("address");
                if (addressParam == null) {
                    manageError(message, new MainApiException(400, "address is required"), serviceId);
                    return;
                }
                InlineObject1 address = Json.mapper.readValue(addressParam.encode(), InlineObject1.class);
                service.updateOrganizationAddress(accessToken, addressId, address, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "UpdateOrganizationAddress");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("UpdateOrganizationAddress", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_vehicles
        vertx.eventBus().<JsonObject> consumer(UPDATE_VEHICLES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_vehicles";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject vehicleUpdateParamParam = message.body().getJsonObject("vehicleUpdateParam");
                if (vehicleUpdateParamParam == null) {
                    manageError(message, new MainApiException(400, "vehicleUpdateParam is required"), serviceId);
                    return;
                }
                InlineObject14 vehicleUpdateParam = Json.mapper.readValue(vehicleUpdateParamParam.encode(), InlineObject14.class);
                service.updateVehicles(accessToken, vehicleUpdateParam, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update_vehicles");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_vehicles", e);
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
