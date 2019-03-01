package samsara.client.api {

import io.swagger.common.ApiInvoker;
import io.swagger.exception.ApiErrorCodes;
import io.swagger.exception.ApiError;
import io.swagger.common.ApiUserCredentials;
import io.swagger.event.Response;
import io.swagger.common.SwaggerApi;
import samsara.client.model.Address;
import samsara.client.model.AddressParam;
import samsara.client.model.Addresses;
import samsara.client.model.AllRouteJobUpdates;
import samsara.client.model.AssetLocationResponse;
import samsara.client.model.AssetReeferResponse;
import samsara.client.model.Contact;
import samsara.client.model.CreateDvirParam;
import samsara.client.model.CurrentDriver;
import samsara.client.model.Data;
import samsara.client.model.DispatchRoute;
import samsara.client.model.DispatchRouteCreate;
import samsara.client.model.DispatchRouteHistory;
import samsara.client.model.DispatchRoutes;
import samsara.client.model.Document;
import samsara.client.model.DocumentCreate;
import samsara.client.model.DocumentTypes;
import samsara.client.model.Documents;
import samsara.client.model.Driver;
import samsara.client.model.DriverDailyLogResponse;
import samsara.client.model.DriverForCreate;
import samsara.client.model.DriverSafetyScoreResponse;
import samsara.client.model.DriversResponse;
import samsara.client.model.DriversSummaryParam;
import samsara.client.model.DriversSummaryResponse;
import samsara.client.model.DvirBase;
import samsara.client.model.DvirListResponse;
import samsara.client.model.ErrorResponse;
import samsara.client.model.FleetVehicleLocations;
import samsara.client.model.FleetVehicleResponse;
import samsara.client.model.FleetVehiclesLocations;
import samsara.client.model.GroupDriversParam;
import samsara.client.model.GroupParam;
import samsara.client.model.HosAuthenticationLogsParam;
import samsara.client.model.HosAuthenticationLogsResponse;
import samsara.client.model.HosLogsParam;
import samsara.client.model.HosLogsParam1;
import samsara.client.model.HosLogsParam2;
import samsara.client.model.HosLogsResponse;
import samsara.client.model.HosLogsSummaryResponse;
import samsara.client.model.InlineResponse200;
import samsara.client.model.InlineResponse2001;
import samsara.client.model.InlineResponse2002;
import samsara.client.model.InlineResponse2003;
import samsara.client.model.InlineResponse2004;
import samsara.client.model.InlineResponse2005;
import samsara.client.model.ReactivateDriverParam;
import samsara.client.model.TripResponse;
import samsara.client.model.TripsParam;
import samsara.client.model.VehicleHarshEventResponse;
import samsara.client.model.VehicleSafetyScoreResponse;
import samsara.client.model.VehicleUpdateParam;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class FleetApi extends SwaggerApi {
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
    public function add_fleet_address (accessToken: String, addressParam: AddressParam): String {
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
    public function add_organization_addresses (accessToken: String, addresses: Addresses): String {
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
    public function create_dvir (accessToken: String, createDvirParam: CreateDvirParam): String {
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
     * Returns DispatchRoutes 
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

        token.returnType = DispatchRoutes;
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
     * Returns AssetLocationResponse 
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

        token.returnType = AssetLocationResponse;
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
     * Returns DispatchRoutes 
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

        token.returnType = DispatchRoutes;
        return requestId;

    }

    /*
     * Returns DispatchRoutes 
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

        token.returnType = DispatchRoutes;
        return requestId;

    }

    /*
     * Returns CurrentDriver 
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

        token.returnType = CurrentDriver;
        return requestId;

    }

    /*
     * Returns DocumentTypes 
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

        token.returnType = DocumentTypes;
        return requestId;

    }

    /*
     * Returns Documents 
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

        token.returnType = Documents;
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
    public function get_fleet_drivers (accessToken: String, groupDriversParam: GroupDriversParam): String {
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
    public function get_fleet_drivers_hos_daily_logs (accessToken: String, driverId: Number, hosLogsParam: HosLogsParam): String {
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
    public function get_fleet_drivers_summary (accessToken: String, driversSummaryParam: DriversSummaryParam, snapToDayBounds: Boolean): String {
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
    public function get_fleet_hos_authentication_logs (accessToken: String, hosAuthenticationLogsParam: HosAuthenticationLogsParam): String {
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
    public function get_fleet_hos_logs (accessToken: String, hosLogsParam: HosLogsParam1): String {
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
    public function get_fleet_hos_logs_summary (accessToken: String, hosLogsParam: HosLogsParam2): String {
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
    public function get_fleet_locations (accessToken: String, groupParam: GroupParam): String {
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
    public function get_fleet_maintenance_list (accessToken: String, groupParam: GroupParam): String {
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
    public function get_fleet_trips (accessToken: String, tripsParam: TripsParam): String {
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
     * Returns FleetVehicleLocations 
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

        token.returnType = FleetVehicleLocations;
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
     * Returns FleetVehiclesLocations 
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

        token.returnType = FleetVehiclesLocations;
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
    public function list_fleet (accessToken: String, groupParam: GroupParam, startingAfter: String, endingBefore: String, limit: Number): String {
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
    public function patch_fleet_vehicle (accessToken: String, vehicleIdOrExternalId: String, data: Data): String {
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
     * Returns CurrentDriver 
     */
    public function reactivate_driver_by_id (accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: ReactivateDriverParam): String {
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

        token.returnType = CurrentDriver;
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
    public function update_organization_address (accessToken: String, address: Address, addressId: Number): String {
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
    public function update_vehicles (accessToken: String, vehicleUpdateParam: VehicleUpdateParam): String {
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
