package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.AllRouteJobUpdates;
import org.openapitools.client.model.AssetReeferResponse;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.DispatchRoute;
import org.openapitools.client.model.DispatchRouteCreate;
import org.openapitools.client.model.DispatchRouteHistory;
import org.openapitools.client.model.Document;
import org.openapitools.client.model.DocumentCreate;
import org.openapitools.client.model.DocumentType;
import org.openapitools.client.model.Driver;
import org.openapitools.client.model.DriverDailyLogResponse;
import org.openapitools.client.model.DriverForCreate;
import org.openapitools.client.model.DriverSafetyScoreResponse;
import org.openapitools.client.model.DriversResponse;
import org.openapitools.client.model.DriversSummaryResponse;
import org.openapitools.client.model.DvirBase;
import org.openapitools.client.model.DvirListResponse;
import org.openapitools.client.model.FleetVehicleLocation;
import org.openapitools.client.model.FleetVehicleResponse;
import org.openapitools.client.model.HosAuthenticationLogsResponse;
import org.openapitools.client.model.HosLogsResponse;
import org.openapitools.client.model.HosLogsSummaryResponse;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineObject1;
import org.openapitools.client.model.InlineObject10;
import org.openapitools.client.model.InlineObject11;
import org.openapitools.client.model.InlineObject12;
import org.openapitools.client.model.InlineObject13;
import org.openapitools.client.model.InlineObject14;
import org.openapitools.client.model.InlineObject15;
import org.openapitools.client.model.InlineObject16;
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineObject4;
import org.openapitools.client.model.InlineObject5;
import org.openapitools.client.model.InlineObject6;
import org.openapitools.client.model.InlineObject7;
import org.openapitools.client.model.InlineObject8;
import org.openapitools.client.model.InlineObject9;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.InlineResponse2002;
import org.openapitools.client.model.InlineResponse2003;
import org.openapitools.client.model.InlineResponse2004;
import org.openapitools.client.model.InlineResponse2005;
import org.openapitools.client.model.Object;
import org.openapitools.client.model.TripResponse;
import org.openapitools.client.model.VehicleHarshEventResponse;
import org.openapitools.client.model.VehicleSafetyScoreResponse;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class FleetApi extends OpenApi {
    /**
    * Constructor for the FleetApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function FleetApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_add_fleet_address: String = "add_fleet_address";
        public static const event_add_organization_addresses: String = "add_organization_addresses";
        public static const event_create_dispatch_route: String = "create_dispatch_route";
        public static const event_create_driver: String = "create_driver";
        public static const event_create_driver_dispatch_route: String = "create_driver_dispatch_route";
        public static const event_create_driver_document: String = "create_driver_document";
        public static const event_create_dvir: String = "create_dvir";
        public static const event_create_vehicle_dispatch_route: String = "create_vehicle_dispatch_route";
        public static const event_deactivate_driver: String = "deactivate_driver";
        public static const event_delete_dispatch_route_by_id: String = "delete_dispatch_route_by_id";
        public static const event_delete_organization_address: String = "delete_organization_address";
        public static const event_fetch_all_dispatch_routes: String = "fetch_all_dispatch_routes";
        public static const event_fetch_all_route_job_updates: String = "fetch_all_route_job_updates";
        public static const event_get_all_asset_current_locations: String = "get_all_asset_current_locations";
        public static const event_get_all_assets: String = "get_all_assets";
        public static const event_get_all_deactivated_drivers: String = "get_all_deactivated_drivers";
        public static const event_get_asset_location: String = "get_asset_location";
        public static const event_get_asset_reefer: String = "get_asset_reefer";
        public static const event_get_deactivated_driver_by_id: String = "get_deactivated_driver_by_id";
        public static const event_get_dispatch_route_by_id: String = "get_dispatch_route_by_id";
        public static const event_get_dispatch_route_history: String = "get_dispatch_route_history";
        public static const event_get_dispatch_routes_by_driver_id: String = "get_dispatch_routes_by_driver_id";
        public static const event_get_dispatch_routes_by_vehicle_id: String = "get_dispatch_routes_by_vehicle_id";
        public static const event_get_driver_by_id: String = "get_driver_by_id";
        public static const event_get_driver_document_types_by_org_id: String = "get_driver_document_types_by_org_id";
        public static const event_get_driver_documents_by_org_id: String = "get_driver_documents_by_org_id";
        public static const event_get_driver_safety_score: String = "get_driver_safety_score";
        public static const event_get_dvirs: String = "get_dvirs";
        public static const event_get_fleet_drivers: String = "get_fleet_drivers";
        public static const event_get_fleet_drivers_hos_daily_logs: String = "get_fleet_drivers_hos_daily_logs";
        public static const event_get_fleet_drivers_summary: String = "get_fleet_drivers_summary";
        public static const event_get_fleet_hos_authentication_logs: String = "get_fleet_hos_authentication_logs";
        public static const event_get_fleet_hos_logs: String = "get_fleet_hos_logs";
        public static const event_get_fleet_hos_logs_summary: String = "get_fleet_hos_logs_summary";
        public static const event_get_fleet_locations: String = "get_fleet_locations";
        public static const event_get_fleet_maintenance_list: String = "get_fleet_maintenance_list";
        public static const event_get_fleet_trips: String = "get_fleet_trips";
        public static const event_get_fleet_vehicle: String = "get_fleet_vehicle";
        public static const event_get_organization_address: String = "get_organization_address";
        public static const event_get_organization_addresses: String = "get_organization_addresses";
        public static const event_get_organization_contact: String = "get_organization_contact";
        public static const event_get_vehicle_harsh_event: String = "get_vehicle_harsh_event";
        public static const event_get_vehicle_locations: String = "get_vehicle_locations";
        public static const event_get_vehicle_safety_score: String = "get_vehicle_safety_score";
        public static const event_get_vehicle_stats: String = "get_vehicle_stats";
        public static const event_get_vehicles_locations: String = "get_vehicles_locations";
        public static const event_list_contacts: String = "list_contacts";
        public static const event_list_fleet: String = "list_fleet";
        public static const event_patch_fleet_vehicle: String = "patch_fleet_vehicle";
        public static const event_reactivate_driver_by_id: String = "reactivate_driver_by_id";
        public static const event_update_dispatch_route_by_id: String = "update_dispatch_route_by_id";
        public static const event_update_organization_address: String = "update_organization_address";
        public static const event_update_vehicles: String = "update_vehicles";


    /*
     * Returns void 
     */
    public function add_fleet_address (accessToken: String, addressParam: InlineObject2): String {
        // create path and map variables
        var path: String = "/fleet/add_address".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, addressParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "add_fleet_address";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function add_organization_addresses (accessToken: String, addresses: InlineObject): String {
        // create path and map variables
        var path: String = "/addresses".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, addresses, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "add_organization_addresses";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function create_dispatch_route (accessToken: String, createDispatchRouteParams: DispatchRouteCreate): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDispatchRouteParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_dispatch_route";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns Driver 
     */
    public function create_driver (accessToken: String, createDriverParam: DriverForCreate): String {
        // create path and map variables
        var path: String = "/fleet/drivers/create".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDriverParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_driver";

        token.returnType = Driver;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function create_driver_dispatch_route (accessToken: String, driverId: Number, createDispatchRouteParams: DispatchRouteCreate): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id}/dispatch/routes".replace(/{format}/g,"xml").replace("{" + "driver_id" + "}", getApiInvoker().escapeString(driverId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDispatchRouteParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_driver_dispatch_route";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns Document 
     */
    public function create_driver_document (accessToken: String, driverId: Number, createDocumentParams: DocumentCreate): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id}/documents".replace(/{format}/g,"xml").replace("{" + "driver_id" + "}", getApiInvoker().escapeString(driverId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDocumentParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_driver_document";

        token.returnType = Document;
        return requestId;

    }

    /*
     * Returns DvirBase 
     */
    public function create_dvir (accessToken: String, createDvirParam: InlineObject12): String {
        // create path and map variables
        var path: String = "/fleet/maintenance/dvirs".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDvirParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_dvir";

        token.returnType = DvirBase;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function create_vehicle_dispatch_route (accessToken: String, vehicleId: Number, createDispatchRouteParams: DispatchRouteCreate): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replace(/{format}/g,"xml").replace("{" + "vehicle_id" + "}", getApiInvoker().escapeString(vehicleId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, createDispatchRouteParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_vehicle_dispatch_route";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function deactivate_driver (accessToken: String, driverIdOrExternalId: String): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "driver_id_or_external_id" + "}", getApiInvoker().escapeString(driverIdOrExternalId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "deactivate_driver";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_dispatch_route_by_id (accessToken: String, routeId: Number): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/{route_id}".replace(/{format}/g,"xml").replace("{" + "route_id" + "}", getApiInvoker().escapeString(routeId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_dispatch_route_by_id";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_organization_address (accessToken: String, addressId: Number): String {
        // create path and map variables
        var path: String = "/addresses/{addressId}".replace(/{format}/g,"xml").replace("{" + "addressId" + "}", getApiInvoker().escapeString(addressId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_organization_address";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function fetch_all_dispatch_routes (accessToken: String, groupId: Number, endTime: Number, duration: Number): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes".replace(/{format}/g,"xml");

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
if("null" != String(endTime))
            queryParams["end_time"] = toPathValue(endTime);
if("null" != String(duration))
            queryParams["duration"] = toPathValue(duration);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "fetch_all_dispatch_routes";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns AllRouteJobUpdates 
     */
    public function fetch_all_route_job_updates (accessToken: String, groupId: Number, sequenceId: String, include: String): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/job_updates".replace(/{format}/g,"xml");

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
if("null" != String(sequenceId))
            queryParams["sequence_id"] = toPathValue(sequenceId);
if("null" != String(include))
            queryParams["include"] = toPathValue(include);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "fetch_all_route_job_updates";

        token.returnType = AllRouteJobUpdates;
        return requestId;

    }

    /*
     * Returns InlineResponse2001 
     */
    public function get_all_asset_current_locations (accessToken: String, groupId: Number): String {
        // create path and map variables
        var path: String = "/fleet/assets/locations".replace(/{format}/g,"xml");

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
if("null" != String(groupId))
            queryParams["group_id"] = toPathValue(groupId);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_all_asset_current_locations";

        token.returnType = InlineResponse2001;
        return requestId;

    }

    /*
     * Returns InlineResponse200 
     */
    public function get_all_assets (accessToken: String, groupId: Number): String {
        // create path and map variables
        var path: String = "/fleet/assets".replace(/{format}/g,"xml");

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
if("null" != String(groupId))
            queryParams["group_id"] = toPathValue(groupId);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_all_assets";

        token.returnType = InlineResponse200;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_all_deactivated_drivers (accessToken: String, groupId: Number): String {
        // create path and map variables
        var path: String = "/fleet/drivers/inactive".replace(/{format}/g,"xml");

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
if("null" != String(groupId))
            queryParams["group_id"] = toPathValue(groupId);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_all_deactivated_drivers";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_asset_location (accessToken: String, assetId: Number, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/assets/{asset_id}/locations".replace(/{format}/g,"xml").replace("{" + "asset_id" + "}", getApiInvoker().escapeString(assetId));

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
        token.completionEventType = "get_asset_location";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns AssetReeferResponse 
     */
    public function get_asset_reefer (accessToken: String, assetId: Number, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/assets/{asset_id}/reefer".replace(/{format}/g,"xml").replace("{" + "asset_id" + "}", getApiInvoker().escapeString(assetId));

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
        token.completionEventType = "get_asset_reefer";

        token.returnType = AssetReeferResponse;
        return requestId;

    }

    /*
     * Returns Driver 
     */
    public function get_deactivated_driver_by_id (accessToken: String, driverIdOrExternalId: String): String {
        // create path and map variables
        var path: String = "/fleet/drivers/inactive/{driver_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "driver_id_or_external_id" + "}", getApiInvoker().escapeString(driverIdOrExternalId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_deactivated_driver_by_id";

        token.returnType = Driver;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function get_dispatch_route_by_id (accessToken: String, routeId: Number): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/{route_id}".replace(/{format}/g,"xml").replace("{" + "route_id" + "}", getApiInvoker().escapeString(routeId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dispatch_route_by_id";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns DispatchRouteHistory 
     */
    public function get_dispatch_route_history (accessToken: String, routeId: Number, startTime: Number, endTime: Number): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/{route_id}/history".replace(/{format}/g,"xml").replace("{" + "route_id" + "}", getApiInvoker().escapeString(routeId));

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
if("null" != String(startTime))
            queryParams["start_time"] = toPathValue(startTime);
if("null" != String(endTime))
            queryParams["end_time"] = toPathValue(endTime);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dispatch_route_history";

        token.returnType = DispatchRouteHistory;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_dispatch_routes_by_driver_id (accessToken: String, driverId: Number, endTime: Number, duration: Number): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id}/dispatch/routes".replace(/{format}/g,"xml").replace("{" + "driver_id" + "}", getApiInvoker().escapeString(driverId));

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
if("null" != String(endTime))
            queryParams["end_time"] = toPathValue(endTime);
if("null" != String(duration))
            queryParams["duration"] = toPathValue(duration);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dispatch_routes_by_driver_id";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_dispatch_routes_by_vehicle_id (accessToken: String, vehicleId: Number, endTime: Number, duration: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replace(/{format}/g,"xml").replace("{" + "vehicle_id" + "}", getApiInvoker().escapeString(vehicleId));

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
if("null" != String(endTime))
            queryParams["end_time"] = toPathValue(endTime);
if("null" != String(duration))
            queryParams["duration"] = toPathValue(duration);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dispatch_routes_by_vehicle_id";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Driver 
     */
    public function get_driver_by_id (accessToken: String, driverIdOrExternalId: String): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "driver_id_or_external_id" + "}", getApiInvoker().escapeString(driverIdOrExternalId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_driver_by_id";

        token.returnType = Driver;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_driver_document_types_by_org_id (): String {
        // create path and map variables
        var path: String = "/fleet/drivers/document_types".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_driver_document_types_by_org_id";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_driver_documents_by_org_id (accessToken: String, endMs: Number, durationMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/drivers/documents".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);
if("null" != String(endMs))
            queryParams["endMs"] = toPathValue(endMs);
if("null" != String(durationMs))
            queryParams["durationMs"] = toPathValue(durationMs);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_driver_documents_by_org_id";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns DriverSafetyScoreResponse 
     */
    public function get_driver_safety_score (driverId: Number, accessToken: String, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driverId}/safety/score".replace(/{format}/g,"xml").replace("{" + "driverId" + "}", getApiInvoker().escapeString(driverId));

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
        token.completionEventType = "get_driver_safety_score";

        token.returnType = DriverSafetyScoreResponse;
        return requestId;

    }

    /*
     * Returns DvirListResponse 
     */
    public function get_dvirs (accessToken: String, endMs: Number, durationMs: Number, groupId: Number): String {
        // create path and map variables
        var path: String = "/fleet/maintenance/dvirs".replace(/{format}/g,"xml");

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
if("null" != String(endMs))
            queryParams["end_ms"] = toPathValue(endMs);
if("null" != String(durationMs))
            queryParams["duration_ms"] = toPathValue(durationMs);
if("null" != String(groupId))
            queryParams["group_id"] = toPathValue(groupId);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dvirs";

        token.returnType = DvirListResponse;
        return requestId;

    }

    /*
     * Returns DriversResponse 
     */
    public function get_fleet_drivers (accessToken: String, groupDriversParam: InlineObject3): String {
        // create path and map variables
        var path: String = "/fleet/drivers".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, groupDriversParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_fleet_drivers";

        token.returnType = DriversResponse;
        return requestId;

    }

    /*
     * Returns DriverDailyLogResponse 
     */
    public function get_fleet_drivers_hos_daily_logs (accessToken: String, driverId: Number, hosLogsParam: InlineObject6): String {
        // create path and map variables
        var path: String = "/fleet/drivers/{driver_id}/hos_daily_logs".replace(/{format}/g,"xml").replace("{" + "driver_id" + "}", getApiInvoker().escapeString(driverId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, hosLogsParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_fleet_drivers_hos_daily_logs";

        token.returnType = DriverDailyLogResponse;
        return requestId;

    }

    /*
     * Returns DriversSummaryResponse 
     */
    public function get_fleet_drivers_summary (accessToken: String, driversSummaryParam: InlineObject5, snapToDayBounds: Boolean): String {
        // create path and map variables
        var path: String = "/fleet/drivers/summary".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);
if("null" != String(snapToDayBounds))
            queryParams["snap_to_day_bounds"] = toPathValue(snapToDayBounds);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, driversSummaryParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_fleet_drivers_summary";

        token.returnType = DriversSummaryResponse;
        return requestId;

    }

    /*
     * Returns HosAuthenticationLogsResponse 
     */
    public function get_fleet_hos_authentication_logs (accessToken: String, hosAuthenticationLogsParam: InlineObject7): String {
        // create path and map variables
        var path: String = "/fleet/hos_authentication_logs".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, hosAuthenticationLogsParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_fleet_hos_authentication_logs";

        token.returnType = HosAuthenticationLogsResponse;
        return requestId;

    }

    /*
     * Returns HosLogsResponse 
     */
    public function get_fleet_hos_logs (accessToken: String, hosLogsParam: InlineObject8): String {
        // create path and map variables
        var path: String = "/fleet/hos_logs".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, hosLogsParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_fleet_hos_logs";

        token.returnType = HosLogsResponse;
        return requestId;

    }

    /*
     * Returns HosLogsSummaryResponse 
     */
    public function get_fleet_hos_logs_summary (accessToken: String, hosLogsParam: InlineObject9): String {
        // create path and map variables
        var path: String = "/fleet/hos_logs_summary".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, hosLogsParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_fleet_hos_logs_summary";

        token.returnType = HosLogsSummaryResponse;
        return requestId;

    }

    /*
     * Returns InlineResponse2003 
     */
    public function get_fleet_locations (accessToken: String, groupParam: InlineObject11): String {
        // create path and map variables
        var path: String = "/fleet/locations".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_fleet_locations";

        token.returnType = InlineResponse2003;
        return requestId;

    }

    /*
     * Returns InlineResponse2004 
     */
    public function get_fleet_maintenance_list (accessToken: String, groupParam: InlineObject13): String {
        // create path and map variables
        var path: String = "/fleet/maintenance/list".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_fleet_maintenance_list";

        token.returnType = InlineResponse2004;
        return requestId;

    }

    /*
     * Returns TripResponse 
     */
    public function get_fleet_trips (accessToken: String, tripsParam: InlineObject15): String {
        // create path and map variables
        var path: String = "/fleet/trips".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, tripsParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_fleet_trips";

        token.returnType = TripResponse;
        return requestId;

    }

    /*
     * Returns FleetVehicleResponse 
     */
    public function get_fleet_vehicle (accessToken: String, vehicleIdOrExternalId: String): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicle_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "vehicle_id_or_external_id" + "}", getApiInvoker().escapeString(vehicleIdOrExternalId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_fleet_vehicle";

        token.returnType = FleetVehicleResponse;
        return requestId;

    }

    /*
     * Returns Address 
     */
    public function get_organization_address (accessToken: String, addressId: Number): String {
        // create path and map variables
        var path: String = "/addresses/{addressId}".replace(/{format}/g,"xml").replace("{" + "addressId" + "}", getApiInvoker().escapeString(addressId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_organization_address";

        token.returnType = Address;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_organization_addresses (accessToken: String): String {
        // create path and map variables
        var path: String = "/addresses".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_organization_addresses";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Contact 
     */
    public function get_organization_contact (accessToken: String, contactId: Number): String {
        // create path and map variables
        var path: String = "/contacts/{contact_id}".replace(/{format}/g,"xml").replace("{" + "contact_id" + "}", getApiInvoker().escapeString(contactId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_organization_contact";

        token.returnType = Contact;
        return requestId;

    }

    /*
     * Returns VehicleHarshEventResponse 
     */
    public function get_vehicle_harsh_event (vehicleId: Number, accessToken: String, timestamp: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicleId}/safety/harsh_event".replace(/{format}/g,"xml").replace("{" + "vehicleId" + "}", getApiInvoker().escapeString(vehicleId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);
if("null" != String(timestamp))
            queryParams["timestamp"] = toPathValue(timestamp);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_vehicle_harsh_event";

        token.returnType = VehicleHarshEventResponse;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_vehicle_locations (accessToken: String, vehicleId: Number, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicle_id}/locations".replace(/{format}/g,"xml").replace("{" + "vehicle_id" + "}", getApiInvoker().escapeString(vehicleId));

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
        token.completionEventType = "get_vehicle_locations";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns VehicleSafetyScoreResponse 
     */
    public function get_vehicle_safety_score (vehicleId: Number, accessToken: String, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicleId}/safety/score".replace(/{format}/g,"xml").replace("{" + "vehicleId" + "}", getApiInvoker().escapeString(vehicleId));

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
        token.completionEventType = "get_vehicle_safety_score";

        token.returnType = VehicleSafetyScoreResponse;
        return requestId;

    }

    /*
     * Returns InlineResponse2005 
     */
    public function get_vehicle_stats (accessToken: String, startMs: Number, endMs: Number, series: String, tagIds: String, startingAfter: String, endingBefore: String, limit: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/stats".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
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
) {
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
if("null" != String(series))
            queryParams["series"] = toPathValue(series);
if("null" != String(tagIds))
            queryParams["tagIds"] = toPathValue(tagIds);
if("null" != String(startingAfter))
            queryParams["startingAfter"] = toPathValue(startingAfter);
if("null" != String(endingBefore))
            queryParams["endingBefore"] = toPathValue(endingBefore);
if("null" != String(limit))
            queryParams["limit"] = toPathValue(limit);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_vehicle_stats";

        token.returnType = InlineResponse2005;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_vehicles_locations (accessToken: String, startMs: Number, endMs: Number): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/locations".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);
if("null" != String(startMs))
            queryParams["startMs"] = toPathValue(startMs);
if("null" != String(endMs))
            queryParams["endMs"] = toPathValue(endMs);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_vehicles_locations";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function list_contacts (accessToken: String): String {
        // create path and map variables
        var path: String = "/contacts".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "list_contacts";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns InlineResponse2002 
     */
    public function list_fleet (accessToken: String, groupParam: InlineObject10, startingAfter: String, endingBefore: String, limit: Number): String {
        // create path and map variables
        var path: String = "/fleet/list".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);
if("null" != String(startingAfter))
            queryParams["startingAfter"] = toPathValue(startingAfter);
if("null" != String(endingBefore))
            queryParams["endingBefore"] = toPathValue(endingBefore);
if("null" != String(limit))
            queryParams["limit"] = toPathValue(limit);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, groupParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "list_fleet";

        token.returnType = InlineResponse2002;
        return requestId;

    }

    /*
     * Returns FleetVehicleResponse 
     */
    public function patch_fleet_vehicle (accessToken: String, vehicleIdOrExternalId: String, data: InlineObject16): String {
        // create path and map variables
        var path: String = "/fleet/vehicles/{vehicle_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "vehicle_id_or_external_id" + "}", getApiInvoker().escapeString(vehicleIdOrExternalId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, data, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch_fleet_vehicle";

        token.returnType = FleetVehicleResponse;
        return requestId;

    }

    /*
     * Returns Driver 
     */
    public function reactivate_driver_by_id (accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: InlineObject4): String {
        // create path and map variables
        var path: String = "/fleet/drivers/inactive/{driver_id_or_external_id}".replace(/{format}/g,"xml").replace("{" + "driver_id_or_external_id" + "}", getApiInvoker().escapeString(driverIdOrExternalId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, reactivateDriverParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "reactivate_driver_by_id";

        token.returnType = Driver;
        return requestId;

    }

    /*
     * Returns DispatchRoute 
     */
    public function update_dispatch_route_by_id (accessToken: String, routeId: Number, updateDispatchRouteParams: DispatchRoute): String {
        // create path and map variables
        var path: String = "/fleet/dispatch/routes/{route_id}".replace(/{format}/g,"xml").replace("{" + "route_id" + "}", getApiInvoker().escapeString(routeId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, updateDispatchRouteParams, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_dispatch_route_by_id";

        token.returnType = DispatchRoute;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function update_organization_address (accessToken: String, addressId: Number, address: InlineObject1): String {
        // create path and map variables
        var path: String = "/addresses/{addressId}".replace(/{format}/g,"xml").replace("{" + "addressId" + "}", getApiInvoker().escapeString(addressId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        if("null" != String(accessToken))
            queryParams["access_token"] = toPathValue(accessToken);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, address, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_organization_address";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function update_vehicles (accessToken: String, vehicleUpdateParam: InlineObject14): String {
        // create path and map variables
        var path: String = "/fleet/set_data".replace(/{format}/g,"xml");

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, vehicleUpdateParam, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_vehicles";

        token.returnType = null ;
        return requestId;

    }
}
}
