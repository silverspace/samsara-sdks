-module(openapi_fleet_api).

-export([add_fleet_address/3, add_fleet_address/4,
         add_organization_addresses/3, add_organization_addresses/4,
         create_dispatch_route/3, create_dispatch_route/4,
         create_driver/3, create_driver/4,
         create_driver_dispatch_route/4, create_driver_dispatch_route/5,
         create_driver_document/4, create_driver_document/5,
         create_dvir/3, create_dvir/4,
         create_vehicle_dispatch_route/4, create_vehicle_dispatch_route/5,
         deactivate_driver/3, deactivate_driver/4,
         delete_dispatch_route_by_id/3, delete_dispatch_route_by_id/4,
         delete_organization_address/3, delete_organization_address/4,
         fetch_all_dispatch_routes/2, fetch_all_dispatch_routes/3,
         fetch_all_route_job_updates/2, fetch_all_route_job_updates/3,
         get_all_asset_current_locations/2, get_all_asset_current_locations/3,
         get_all_assets/2, get_all_assets/3,
         get_all_deactivated_drivers/2, get_all_deactivated_drivers/3,
         get_asset_location/5, get_asset_location/6,
         get_asset_reefer/5, get_asset_reefer/6,
         get_deactivated_driver_by_id/3, get_deactivated_driver_by_id/4,
         get_dispatch_route_by_id/3, get_dispatch_route_by_id/4,
         get_dispatch_route_history/3, get_dispatch_route_history/4,
         get_dispatch_routes_by_driver_id/3, get_dispatch_routes_by_driver_id/4,
         get_dispatch_routes_by_vehicle_id/3, get_dispatch_routes_by_vehicle_id/4,
         get_driver_by_id/3, get_driver_by_id/4,
         get_driver_document_types_by_org_id/1, get_driver_document_types_by_org_id/2,
         get_driver_documents_by_org_id/2, get_driver_documents_by_org_id/3,
         get_driver_safety_score/5, get_driver_safety_score/6,
         get_dvirs/4, get_dvirs/5,
         get_fleet_drivers/3, get_fleet_drivers/4,
         get_fleet_drivers_hos_daily_logs/4, get_fleet_drivers_hos_daily_logs/5,
         get_fleet_drivers_summary/3, get_fleet_drivers_summary/4,
         get_fleet_hos_authentication_logs/3, get_fleet_hos_authentication_logs/4,
         get_fleet_hos_logs/3, get_fleet_hos_logs/4,
         get_fleet_hos_logs_summary/3, get_fleet_hos_logs_summary/4,
         get_fleet_locations/3, get_fleet_locations/4,
         get_fleet_maintenance_list/3, get_fleet_maintenance_list/4,
         get_fleet_trips/3, get_fleet_trips/4,
         get_fleet_vehicle/3, get_fleet_vehicle/4,
         get_organization_address/3, get_organization_address/4,
         get_organization_addresses/2, get_organization_addresses/3,
         get_organization_contact/3, get_organization_contact/4,
         get_vehicle_harsh_event/4, get_vehicle_harsh_event/5,
         get_vehicle_locations/5, get_vehicle_locations/6,
         get_vehicle_safety_score/5, get_vehicle_safety_score/6,
         get_vehicle_stats/4, get_vehicle_stats/5,
         get_vehicles_locations/4, get_vehicles_locations/5,
         list_contacts/2, list_contacts/3,
         list_fleet/3, list_fleet/4,
         patch_fleet_vehicle/4, patch_fleet_vehicle/5,
         reactivate_driver_by_id/4, reactivate_driver_by_id/5,
         update_dispatch_route_by_id/4, update_dispatch_route_by_id/5,
         update_organization_address/4, update_organization_address/5,
         update_vehicles/3, update_vehicles/4]).

-define(BASE_URL, "/v1").

%% @doc /fleet/add_address
%% This method adds an address book entry to the specified group.
-spec add_fleet_address(ctx:ctx(), binary(), openapi_inline_object_2:openapi_inline_object_2()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_fleet_address(Ctx, AccessToken, AddressParam) ->
    add_fleet_address(Ctx, AccessToken, AddressParam, #{}).

-spec add_fleet_address(ctx:ctx(), binary(), openapi_inline_object_2:openapi_inline_object_2(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_fleet_address(Ctx, AccessToken, AddressParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/add_address"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = AddressParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /addresses
%% Add one or more addresses to the organization
-spec add_organization_addresses(ctx:ctx(), binary(), openapi_inline_object:openapi_inline_object()) -> {ok, [openapi_address:openapi_address()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_organization_addresses(Ctx, AccessToken, Addresses) ->
    add_organization_addresses(Ctx, AccessToken, Addresses, #{}).

-spec add_organization_addresses(ctx:ctx(), binary(), openapi_inline_object:openapi_inline_object(), maps:map()) -> {ok, [openapi_address:openapi_address()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
add_organization_addresses(Ctx, AccessToken, Addresses, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/addresses"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = Addresses,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/dispatch/routes
%% Create a new dispatch route.
-spec create_dispatch_route(ctx:ctx(), binary(), openapi_dispatch_route_create:openapi_dispatch_route_create()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_dispatch_route(Ctx, AccessToken, CreateDispatchRouteParams) ->
    create_dispatch_route(Ctx, AccessToken, CreateDispatchRouteParams, #{}).

-spec create_dispatch_route(ctx:ctx(), binary(), openapi_dispatch_route_create:openapi_dispatch_route_create(), maps:map()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_dispatch_route(Ctx, AccessToken, CreateDispatchRouteParams, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/dispatch/routes"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = CreateDispatchRouteParams,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/create
%% Create a new driver.
-spec create_driver(ctx:ctx(), binary(), openapi_driver_for_create:openapi_driver_for_create()) -> {ok, openapi_driver:openapi_driver(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_driver(Ctx, AccessToken, CreateDriverParam) ->
    create_driver(Ctx, AccessToken, CreateDriverParam, #{}).

-spec create_driver(ctx:ctx(), binary(), openapi_driver_for_create:openapi_driver_for_create(), maps:map()) -> {ok, openapi_driver:openapi_driver(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_driver(Ctx, AccessToken, CreateDriverParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/drivers/create"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = CreateDriverParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
%% Create a new dispatch route for the driver with driver_id.
-spec create_driver_dispatch_route(ctx:ctx(), binary(), integer(), openapi_dispatch_route_create:openapi_dispatch_route_create()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_driver_dispatch_route(Ctx, AccessToken, DriverId, CreateDispatchRouteParams) ->
    create_driver_dispatch_route(Ctx, AccessToken, DriverId, CreateDispatchRouteParams, #{}).

-spec create_driver_dispatch_route(ctx:ctx(), binary(), integer(), openapi_dispatch_route_create:openapi_dispatch_route_create(), maps:map()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_driver_dispatch_route(Ctx, AccessToken, DriverId, CreateDispatchRouteParams, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/drivers/", DriverId, "/dispatch/routes"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = CreateDispatchRouteParams,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/{driver_id:[0-9]+}/documents
%% Create a driver document for the given driver.
-spec create_driver_document(ctx:ctx(), binary(), integer(), openapi_document_create:openapi_document_create()) -> {ok, openapi_document:openapi_document(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_driver_document(Ctx, AccessToken, DriverId, CreateDocumentParams) ->
    create_driver_document(Ctx, AccessToken, DriverId, CreateDocumentParams, #{}).

-spec create_driver_document(ctx:ctx(), binary(), integer(), openapi_document_create:openapi_document_create(), maps:map()) -> {ok, openapi_document:openapi_document(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_driver_document(Ctx, AccessToken, DriverId, CreateDocumentParams, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/drivers/", DriverId, "/documents"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = CreateDocumentParams,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/maintenance/dvirs
%% Create a new dvir, marking a vehicle or trailer safe or unsafe.
-spec create_dvir(ctx:ctx(), binary(), openapi_inline_object_12:openapi_inline_object_12()) -> {ok, openapi_dvir_base:openapi_dvir_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_dvir(Ctx, AccessToken, CreateDvirParam) ->
    create_dvir(Ctx, AccessToken, CreateDvirParam, #{}).

-spec create_dvir(ctx:ctx(), binary(), openapi_inline_object_12:openapi_inline_object_12(), maps:map()) -> {ok, openapi_dvir_base:openapi_dvir_base(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_dvir(Ctx, AccessToken, CreateDvirParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/maintenance/dvirs"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = CreateDvirParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
%% Create a new dispatch route for the vehicle with vehicle_id.
-spec create_vehicle_dispatch_route(ctx:ctx(), binary(), integer(), openapi_dispatch_route_create:openapi_dispatch_route_create()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_vehicle_dispatch_route(Ctx, AccessToken, VehicleId, CreateDispatchRouteParams) ->
    create_vehicle_dispatch_route(Ctx, AccessToken, VehicleId, CreateDispatchRouteParams, #{}).

-spec create_vehicle_dispatch_route(ctx:ctx(), binary(), integer(), openapi_dispatch_route_create:openapi_dispatch_route_create(), maps:map()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_vehicle_dispatch_route(Ctx, AccessToken, VehicleId, CreateDispatchRouteParams, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/vehicles/", VehicleId, "/dispatch/routes"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = CreateDispatchRouteParams,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
%% Deactivate a driver with the given id.
-spec deactivate_driver(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
deactivate_driver(Ctx, AccessToken, DriverIdOrExternalId) ->
    deactivate_driver(Ctx, AccessToken, DriverIdOrExternalId, #{}).

-spec deactivate_driver(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
deactivate_driver(Ctx, AccessToken, DriverIdOrExternalId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/fleet/drivers/", DriverIdOrExternalId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/dispatch/routes/{route_id:[0-9]+}/
%% Delete a dispatch route and its associated jobs.
-spec delete_dispatch_route_by_id(ctx:ctx(), binary(), integer()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_dispatch_route_by_id(Ctx, AccessToken, RouteId) ->
    delete_dispatch_route_by_id(Ctx, AccessToken, RouteId, #{}).

-spec delete_dispatch_route_by_id(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_dispatch_route_by_id(Ctx, AccessToken, RouteId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/fleet/dispatch/routes/", RouteId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /addresses/{addressId}
%% Delete an address.
-spec delete_organization_address(ctx:ctx(), binary(), integer()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_organization_address(Ctx, AccessToken, AddressId) ->
    delete_organization_address(Ctx, AccessToken, AddressId, #{}).

-spec delete_organization_address(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_organization_address(Ctx, AccessToken, AddressId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/addresses/", AddressId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/dispatch/routes
%% Fetch all of the dispatch routes for the group.
-spec fetch_all_dispatch_routes(ctx:ctx(), binary()) -> {ok, [openapi_dispatch_route:openapi_dispatch_route()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
fetch_all_dispatch_routes(Ctx, AccessToken) ->
    fetch_all_dispatch_routes(Ctx, AccessToken, #{}).

-spec fetch_all_dispatch_routes(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_dispatch_route:openapi_dispatch_route()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
fetch_all_dispatch_routes(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/dispatch/routes"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['group_id', 'end_time', 'duration'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/dispatch/routes/job_updates
%% Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
-spec fetch_all_route_job_updates(ctx:ctx(), binary()) -> {ok, openapi_all_route_job_updates:openapi_all_route_job_updates(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
fetch_all_route_job_updates(Ctx, AccessToken) ->
    fetch_all_route_job_updates(Ctx, AccessToken, #{}).

-spec fetch_all_route_job_updates(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_all_route_job_updates:openapi_all_route_job_updates(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
fetch_all_route_job_updates(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/dispatch/routes/job_updates"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['group_id', 'sequence_id', 'include'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/assets/locations
%% Fetch current locations of all assets for the group.
-spec get_all_asset_current_locations(ctx:ctx(), binary()) -> {ok, openapi_inline_response_200_1:openapi_inline_response_200_1(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_asset_current_locations(Ctx, AccessToken) ->
    get_all_asset_current_locations(Ctx, AccessToken, #{}).

-spec get_all_asset_current_locations(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_inline_response_200_1:openapi_inline_response_200_1(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_asset_current_locations(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/assets/locations"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['group_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/assets
%% Fetch all of the assets for the group.
-spec get_all_assets(ctx:ctx(), binary()) -> {ok, openapi_inline_response_200:openapi_inline_response_200(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_assets(Ctx, AccessToken) ->
    get_all_assets(Ctx, AccessToken, #{}).

-spec get_all_assets(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_inline_response_200:openapi_inline_response_200(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_assets(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/assets"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['group_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/inactive
%% Fetch all deactivated drivers for the group.
-spec get_all_deactivated_drivers(ctx:ctx(), binary()) -> {ok, [openapi_driver:openapi_driver()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_deactivated_drivers(Ctx, AccessToken) ->
    get_all_deactivated_drivers(Ctx, AccessToken, #{}).

-spec get_all_deactivated_drivers(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_driver:openapi_driver()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_deactivated_drivers(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/drivers/inactive"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['group_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/assets/{assetId:[0-9]+}/locations
%% Fetch the historical locations for the asset.
-spec get_asset_location(ctx:ctx(), binary(), integer(), integer(), integer()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_asset_location(Ctx, AccessToken, AssetId, StartMs, EndMs) ->
    get_asset_location(Ctx, AccessToken, AssetId, StartMs, EndMs, #{}).

-spec get_asset_location(ctx:ctx(), binary(), integer(), integer(), integer(), maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_asset_location(Ctx, AccessToken, AssetId, StartMs, EndMs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/assets/", AssetId, "/locations"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"startMs">>, StartMs}, {<<"endMs">>, EndMs}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/assets/{assetId:[0-9]+}/reefer
%% Fetch the reefer-specific stats of an asset.
-spec get_asset_reefer(ctx:ctx(), binary(), integer(), integer(), integer()) -> {ok, openapi_asset_reefer_response:openapi_asset_reefer_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_asset_reefer(Ctx, AccessToken, AssetId, StartMs, EndMs) ->
    get_asset_reefer(Ctx, AccessToken, AssetId, StartMs, EndMs, #{}).

-spec get_asset_reefer(ctx:ctx(), binary(), integer(), integer(), integer(), maps:map()) -> {ok, openapi_asset_reefer_response:openapi_asset_reefer_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_asset_reefer(Ctx, AccessToken, AssetId, StartMs, EndMs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/assets/", AssetId, "/reefer"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"startMs">>, StartMs}, {<<"endMs">>, EndMs}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
%% Fetch deactivated driver by id.
-spec get_deactivated_driver_by_id(ctx:ctx(), binary(), binary()) -> {ok, openapi_driver:openapi_driver(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_deactivated_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId) ->
    get_deactivated_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId, #{}).

-spec get_deactivated_driver_by_id(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_driver:openapi_driver(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_deactivated_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/drivers/inactive/", DriverIdOrExternalId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/dispatch/routes/{route_id:[0-9]+}
%% Fetch a dispatch route by id.
-spec get_dispatch_route_by_id(ctx:ctx(), binary(), integer()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dispatch_route_by_id(Ctx, AccessToken, RouteId) ->
    get_dispatch_route_by_id(Ctx, AccessToken, RouteId, #{}).

-spec get_dispatch_route_by_id(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dispatch_route_by_id(Ctx, AccessToken, RouteId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/dispatch/routes/", RouteId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/dispatch/routes/{route_id:[0-9]+}/history
%% Fetch the history of a dispatch route.
-spec get_dispatch_route_history(ctx:ctx(), binary(), integer()) -> {ok, openapi_dispatch_route_history:openapi_dispatch_route_history(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dispatch_route_history(Ctx, AccessToken, RouteId) ->
    get_dispatch_route_history(Ctx, AccessToken, RouteId, #{}).

-spec get_dispatch_route_history(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, openapi_dispatch_route_history:openapi_dispatch_route_history(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dispatch_route_history(Ctx, AccessToken, RouteId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/dispatch/routes/", RouteId, "/history"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['start_time', 'end_time'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
%% Fetch all of the dispatch routes for a given driver.
-spec get_dispatch_routes_by_driver_id(ctx:ctx(), binary(), integer()) -> {ok, [openapi_dispatch_route:openapi_dispatch_route()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dispatch_routes_by_driver_id(Ctx, AccessToken, DriverId) ->
    get_dispatch_routes_by_driver_id(Ctx, AccessToken, DriverId, #{}).

-spec get_dispatch_routes_by_driver_id(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, [openapi_dispatch_route:openapi_dispatch_route()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dispatch_routes_by_driver_id(Ctx, AccessToken, DriverId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/drivers/", DriverId, "/dispatch/routes"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['end_time', 'duration'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
%% Fetch all of the dispatch routes for a given vehicle.
-spec get_dispatch_routes_by_vehicle_id(ctx:ctx(), binary(), integer()) -> {ok, [openapi_dispatch_route:openapi_dispatch_route()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dispatch_routes_by_vehicle_id(Ctx, AccessToken, VehicleId) ->
    get_dispatch_routes_by_vehicle_id(Ctx, AccessToken, VehicleId, #{}).

-spec get_dispatch_routes_by_vehicle_id(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, [openapi_dispatch_route:openapi_dispatch_route()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dispatch_routes_by_vehicle_id(Ctx, AccessToken, VehicleId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/vehicles/", VehicleId, "/dispatch/routes"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['end_time', 'duration'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
%% Fetch driver by id.
-spec get_driver_by_id(ctx:ctx(), binary(), binary()) -> {ok, openapi_driver:openapi_driver(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId) ->
    get_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId, #{}).

-spec get_driver_by_id(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_driver:openapi_driver(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/drivers/", DriverIdOrExternalId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/document_types
%% Fetch all of the document types.
-spec get_driver_document_types_by_org_id(ctx:ctx()) -> {ok, [openapi_document_type:openapi_document_type()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_driver_document_types_by_org_id(Ctx) ->
    get_driver_document_types_by_org_id(Ctx, #{}).

-spec get_driver_document_types_by_org_id(ctx:ctx(), maps:map()) -> {ok, [openapi_document_type:openapi_document_type()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_driver_document_types_by_org_id(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/drivers/document_types"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/documents
%% Fetch all of the documents.
-spec get_driver_documents_by_org_id(ctx:ctx(), binary()) -> {ok, [openapi_document:openapi_document()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_driver_documents_by_org_id(Ctx, AccessToken) ->
    get_driver_documents_by_org_id(Ctx, AccessToken, #{}).

-spec get_driver_documents_by_org_id(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_document:openapi_document()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_driver_documents_by_org_id(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/drivers/documents"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['endMs', 'durationMs'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/{driverId:[0-9]+}/safety/score
%% Fetch the safety score for the driver.
-spec get_driver_safety_score(ctx:ctx(), integer(), binary(), integer(), integer()) -> {ok, openapi_driver_safety_score_response:openapi_driver_safety_score_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_driver_safety_score(Ctx, DriverId, AccessToken, StartMs, EndMs) ->
    get_driver_safety_score(Ctx, DriverId, AccessToken, StartMs, EndMs, #{}).

-spec get_driver_safety_score(ctx:ctx(), integer(), binary(), integer(), integer(), maps:map()) -> {ok, openapi_driver_safety_score_response:openapi_driver_safety_score_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_driver_safety_score(Ctx, DriverId, AccessToken, StartMs, EndMs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/drivers/", DriverId, "/safety/score"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"startMs">>, StartMs}, {<<"endMs">>, EndMs}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/maintenance/dvirs
%% Get DVIRs for the org within provided time constraints
-spec get_dvirs(ctx:ctx(), binary(), integer(), integer()) -> {ok, openapi_dvir_list_response:openapi_dvir_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dvirs(Ctx, AccessToken, EndMs, DurationMs) ->
    get_dvirs(Ctx, AccessToken, EndMs, DurationMs, #{}).

-spec get_dvirs(ctx:ctx(), binary(), integer(), integer(), maps:map()) -> {ok, openapi_dvir_list_response:openapi_dvir_list_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_dvirs(Ctx, AccessToken, EndMs, DurationMs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/maintenance/dvirs"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"end_ms">>, EndMs}, {<<"duration_ms">>, DurationMs}])++openapi_utils:optional_params(['group_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers
%% Get all the drivers for the specified group.
-spec get_fleet_drivers(ctx:ctx(), binary(), openapi_inline_object_3:openapi_inline_object_3()) -> {ok, openapi_drivers_response:openapi_drivers_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_drivers(Ctx, AccessToken, GroupDriversParam) ->
    get_fleet_drivers(Ctx, AccessToken, GroupDriversParam, #{}).

-spec get_fleet_drivers(ctx:ctx(), binary(), openapi_inline_object_3:openapi_inline_object_3(), maps:map()) -> {ok, openapi_drivers_response:openapi_drivers_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_drivers(Ctx, AccessToken, GroupDriversParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/drivers"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = GroupDriversParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
%% Get summarized daily HOS charts for a specified driver.
-spec get_fleet_drivers_hos_daily_logs(ctx:ctx(), binary(), integer(), openapi_inline_object_6:openapi_inline_object_6()) -> {ok, openapi_driver_daily_log_response:openapi_driver_daily_log_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_drivers_hos_daily_logs(Ctx, AccessToken, DriverId, HosLogsParam) ->
    get_fleet_drivers_hos_daily_logs(Ctx, AccessToken, DriverId, HosLogsParam, #{}).

-spec get_fleet_drivers_hos_daily_logs(ctx:ctx(), binary(), integer(), openapi_inline_object_6:openapi_inline_object_6(), maps:map()) -> {ok, openapi_driver_daily_log_response:openapi_driver_daily_log_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_drivers_hos_daily_logs(Ctx, AccessToken, DriverId, HosLogsParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/drivers/", DriverId, "/hos_daily_logs"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = HosLogsParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/summary
%% Get the distance and time each driver in an organization has driven in a given time period.
-spec get_fleet_drivers_summary(ctx:ctx(), binary(), openapi_inline_object_5:openapi_inline_object_5()) -> {ok, openapi_drivers_summary_response:openapi_drivers_summary_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_drivers_summary(Ctx, AccessToken, DriversSummaryParam) ->
    get_fleet_drivers_summary(Ctx, AccessToken, DriversSummaryParam, #{}).

-spec get_fleet_drivers_summary(ctx:ctx(), binary(), openapi_inline_object_5:openapi_inline_object_5(), maps:map()) -> {ok, openapi_drivers_summary_response:openapi_drivers_summary_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_drivers_summary(Ctx, AccessToken, DriversSummaryParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/drivers/summary"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['snap_to_day_bounds'], _OptionalParams),
    Headers = [],
    Body1 = DriversSummaryParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/hos_authentication_logs
%% Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
-spec get_fleet_hos_authentication_logs(ctx:ctx(), binary(), openapi_inline_object_7:openapi_inline_object_7()) -> {ok, openapi_hos_authentication_logs_response:openapi_hos_authentication_logs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_hos_authentication_logs(Ctx, AccessToken, HosAuthenticationLogsParam) ->
    get_fleet_hos_authentication_logs(Ctx, AccessToken, HosAuthenticationLogsParam, #{}).

-spec get_fleet_hos_authentication_logs(ctx:ctx(), binary(), openapi_inline_object_7:openapi_inline_object_7(), maps:map()) -> {ok, openapi_hos_authentication_logs_response:openapi_hos_authentication_logs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_hos_authentication_logs(Ctx, AccessToken, HosAuthenticationLogsParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/hos_authentication_logs"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = HosAuthenticationLogsParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/hos_logs
%% Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
-spec get_fleet_hos_logs(ctx:ctx(), binary(), openapi_inline_object_8:openapi_inline_object_8()) -> {ok, openapi_hos_logs_response:openapi_hos_logs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_hos_logs(Ctx, AccessToken, HosLogsParam) ->
    get_fleet_hos_logs(Ctx, AccessToken, HosLogsParam, #{}).

-spec get_fleet_hos_logs(ctx:ctx(), binary(), openapi_inline_object_8:openapi_inline_object_8(), maps:map()) -> {ok, openapi_hos_logs_response:openapi_hos_logs_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_hos_logs(Ctx, AccessToken, HosLogsParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/hos_logs"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = HosLogsParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/hos_logs_summary
%% Get the current HOS status for all drivers in the group.
-spec get_fleet_hos_logs_summary(ctx:ctx(), binary(), openapi_inline_object_9:openapi_inline_object_9()) -> {ok, openapi_hos_logs_summary_response:openapi_hos_logs_summary_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_hos_logs_summary(Ctx, AccessToken, HosLogsParam) ->
    get_fleet_hos_logs_summary(Ctx, AccessToken, HosLogsParam, #{}).

-spec get_fleet_hos_logs_summary(ctx:ctx(), binary(), openapi_inline_object_9:openapi_inline_object_9(), maps:map()) -> {ok, openapi_hos_logs_summary_response:openapi_hos_logs_summary_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_hos_logs_summary(Ctx, AccessToken, HosLogsParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/hos_logs_summary"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = HosLogsParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/locations
%% Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
-spec get_fleet_locations(ctx:ctx(), binary(), openapi_inline_object_11:openapi_inline_object_11()) -> {ok, openapi_inline_response_200_3:openapi_inline_response_200_3(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_locations(Ctx, AccessToken, GroupParam) ->
    get_fleet_locations(Ctx, AccessToken, GroupParam, #{}).

-spec get_fleet_locations(ctx:ctx(), binary(), openapi_inline_object_11:openapi_inline_object_11(), maps:map()) -> {ok, openapi_inline_response_200_3:openapi_inline_response_200_3(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_locations(Ctx, AccessToken, GroupParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/locations"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = GroupParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/maintenance/list
%% Get list of the vehicles with any engine faults or check light data.
-spec get_fleet_maintenance_list(ctx:ctx(), binary(), openapi_inline_object_13:openapi_inline_object_13()) -> {ok, openapi_inline_response_200_4:openapi_inline_response_200_4(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_maintenance_list(Ctx, AccessToken, GroupParam) ->
    get_fleet_maintenance_list(Ctx, AccessToken, GroupParam, #{}).

-spec get_fleet_maintenance_list(ctx:ctx(), binary(), openapi_inline_object_13:openapi_inline_object_13(), maps:map()) -> {ok, openapi_inline_response_200_4:openapi_inline_response_200_4(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_maintenance_list(Ctx, AccessToken, GroupParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/maintenance/list"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = GroupParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/trips
%% Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
-spec get_fleet_trips(ctx:ctx(), binary(), openapi_inline_object_15:openapi_inline_object_15()) -> {ok, openapi_trip_response:openapi_trip_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_trips(Ctx, AccessToken, TripsParam) ->
    get_fleet_trips(Ctx, AccessToken, TripsParam, #{}).

-spec get_fleet_trips(ctx:ctx(), binary(), openapi_inline_object_15:openapi_inline_object_15(), maps:map()) -> {ok, openapi_trip_response:openapi_trip_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_trips(Ctx, AccessToken, TripsParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/trips"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = TripsParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
%% Gets a specific vehicle.
-spec get_fleet_vehicle(ctx:ctx(), binary(), binary()) -> {ok, openapi_fleet_vehicle_response:openapi_fleet_vehicle_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_vehicle(Ctx, AccessToken, VehicleIdOrExternalId) ->
    get_fleet_vehicle(Ctx, AccessToken, VehicleIdOrExternalId, #{}).

-spec get_fleet_vehicle(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_fleet_vehicle_response:openapi_fleet_vehicle_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_fleet_vehicle(Ctx, AccessToken, VehicleIdOrExternalId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/vehicles/", VehicleIdOrExternalId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /addresses/{addressId}
%% Fetch an address by its id.
-spec get_organization_address(ctx:ctx(), binary(), integer()) -> {ok, openapi_address:openapi_address(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_organization_address(Ctx, AccessToken, AddressId) ->
    get_organization_address(Ctx, AccessToken, AddressId, #{}).

-spec get_organization_address(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, openapi_address:openapi_address(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_organization_address(Ctx, AccessToken, AddressId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/addresses/", AddressId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /addresses
%% Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
-spec get_organization_addresses(ctx:ctx(), binary()) -> {ok, [openapi_address:openapi_address()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_organization_addresses(Ctx, AccessToken) ->
    get_organization_addresses(Ctx, AccessToken, #{}).

-spec get_organization_addresses(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_address:openapi_address()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_organization_addresses(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/addresses"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /contacts/{contact_id}
%% Fetch a contact by its id.
-spec get_organization_contact(ctx:ctx(), binary(), integer()) -> {ok, openapi_contact:openapi_contact(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_organization_contact(Ctx, AccessToken, ContactId) ->
    get_organization_contact(Ctx, AccessToken, ContactId, #{}).

-spec get_organization_contact(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, openapi_contact:openapi_contact(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_organization_contact(Ctx, AccessToken, ContactId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/contacts/", ContactId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
%% Fetch harsh event details for a vehicle.
-spec get_vehicle_harsh_event(ctx:ctx(), integer(), binary(), integer()) -> {ok, openapi_vehicle_harsh_event_response:openapi_vehicle_harsh_event_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicle_harsh_event(Ctx, VehicleId, AccessToken, Timestamp) ->
    get_vehicle_harsh_event(Ctx, VehicleId, AccessToken, Timestamp, #{}).

-spec get_vehicle_harsh_event(ctx:ctx(), integer(), binary(), integer(), maps:map()) -> {ok, openapi_vehicle_harsh_event_response:openapi_vehicle_harsh_event_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicle_harsh_event(Ctx, VehicleId, AccessToken, Timestamp, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/vehicles/", VehicleId, "/safety/harsh_event"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"timestamp">>, Timestamp}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/{vehicle_id:[0-9]+}/locations
%% Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
-spec get_vehicle_locations(ctx:ctx(), binary(), integer(), integer(), integer()) -> {ok, [openapi_fleet_vehicle_location:openapi_fleet_vehicle_location()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicle_locations(Ctx, AccessToken, VehicleId, StartMs, EndMs) ->
    get_vehicle_locations(Ctx, AccessToken, VehicleId, StartMs, EndMs, #{}).

-spec get_vehicle_locations(ctx:ctx(), binary(), integer(), integer(), integer(), maps:map()) -> {ok, [openapi_fleet_vehicle_location:openapi_fleet_vehicle_location()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicle_locations(Ctx, AccessToken, VehicleId, StartMs, EndMs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/vehicles/", VehicleId, "/locations"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"startMs">>, StartMs}, {<<"endMs">>, EndMs}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
%% Fetch the safety score for the vehicle.
-spec get_vehicle_safety_score(ctx:ctx(), integer(), binary(), integer(), integer()) -> {ok, openapi_vehicle_safety_score_response:openapi_vehicle_safety_score_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicle_safety_score(Ctx, VehicleId, AccessToken, StartMs, EndMs) ->
    get_vehicle_safety_score(Ctx, VehicleId, AccessToken, StartMs, EndMs, #{}).

-spec get_vehicle_safety_score(ctx:ctx(), integer(), binary(), integer(), integer(), maps:map()) -> {ok, openapi_vehicle_safety_score_response:openapi_vehicle_safety_score_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicle_safety_score(Ctx, VehicleId, AccessToken, StartMs, EndMs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/vehicles/", VehicleId, "/safety/score"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"startMs">>, StartMs}, {<<"endMs">>, EndMs}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/stats
%% Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
-spec get_vehicle_stats(ctx:ctx(), binary(), integer(), integer()) -> {ok, openapi_inline_response_200_5:openapi_inline_response_200_5(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicle_stats(Ctx, AccessToken, StartMs, EndMs) ->
    get_vehicle_stats(Ctx, AccessToken, StartMs, EndMs, #{}).

-spec get_vehicle_stats(ctx:ctx(), binary(), integer(), integer(), maps:map()) -> {ok, openapi_inline_response_200_5:openapi_inline_response_200_5(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicle_stats(Ctx, AccessToken, StartMs, EndMs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/vehicles/stats"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"startMs">>, StartMs}, {<<"endMs">>, EndMs}])++openapi_utils:optional_params(['series', 'tagIds', 'startingAfter', 'endingBefore', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/locations
%% Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
-spec get_vehicles_locations(ctx:ctx(), binary(), integer(), integer()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicles_locations(Ctx, AccessToken, StartMs, EndMs) ->
    get_vehicles_locations(Ctx, AccessToken, StartMs, EndMs, #{}).

-spec get_vehicles_locations(ctx:ctx(), binary(), integer(), integer(), maps:map()) -> {ok, [maps:map()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_vehicles_locations(Ctx, AccessToken, StartMs, EndMs, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/fleet/vehicles/locations"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}, {<<"startMs">>, StartMs}, {<<"endMs">>, EndMs}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /contacts
%% Fetch all contacts for the organization.
-spec list_contacts(ctx:ctx(), binary()) -> {ok, [openapi_contact:openapi_contact()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_contacts(Ctx, AccessToken) ->
    list_contacts(Ctx, AccessToken, #{}).

-spec list_contacts(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_contact:openapi_contact()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_contacts(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/contacts"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/list
%% Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
-spec list_fleet(ctx:ctx(), binary(), openapi_inline_object_10:openapi_inline_object_10()) -> {ok, openapi_inline_response_200_2:openapi_inline_response_200_2(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fleet(Ctx, AccessToken, GroupParam) ->
    list_fleet(Ctx, AccessToken, GroupParam, #{}).

-spec list_fleet(ctx:ctx(), binary(), openapi_inline_object_10:openapi_inline_object_10(), maps:map()) -> {ok, openapi_inline_response_200_2:openapi_inline_response_200_2(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_fleet(Ctx, AccessToken, GroupParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/list"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['startingAfter', 'endingBefore', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = GroupParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
%% Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
-spec patch_fleet_vehicle(ctx:ctx(), binary(), binary(), openapi_inline_object_16:openapi_inline_object_16()) -> {ok, openapi_fleet_vehicle_response:openapi_fleet_vehicle_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
patch_fleet_vehicle(Ctx, AccessToken, VehicleIdOrExternalId, Data) ->
    patch_fleet_vehicle(Ctx, AccessToken, VehicleIdOrExternalId, Data, #{}).

-spec patch_fleet_vehicle(ctx:ctx(), binary(), binary(), openapi_inline_object_16:openapi_inline_object_16(), maps:map()) -> {ok, openapi_fleet_vehicle_response:openapi_fleet_vehicle_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
patch_fleet_vehicle(Ctx, AccessToken, VehicleIdOrExternalId, Data, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = ["/fleet/vehicles/", VehicleIdOrExternalId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = Data,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>, <<"application/merge-patch+json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
%% Reactivate the inactive driver having id.
-spec reactivate_driver_by_id(ctx:ctx(), binary(), binary(), openapi_inline_object_4:openapi_inline_object_4()) -> {ok, openapi_driver:openapi_driver(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reactivate_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId, ReactivateDriverParam) ->
    reactivate_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId, ReactivateDriverParam, #{}).

-spec reactivate_driver_by_id(ctx:ctx(), binary(), binary(), openapi_inline_object_4:openapi_inline_object_4(), maps:map()) -> {ok, openapi_driver:openapi_driver(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
reactivate_driver_by_id(Ctx, AccessToken, DriverIdOrExternalId, ReactivateDriverParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = put,
    Path = ["/fleet/drivers/inactive/", DriverIdOrExternalId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = ReactivateDriverParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/dispatch/routes/{route_id:[0-9]+}/
%% Update a dispatch route and its associated jobs.
-spec update_dispatch_route_by_id(ctx:ctx(), binary(), integer(), openapi_dispatch_route:openapi_dispatch_route()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_dispatch_route_by_id(Ctx, AccessToken, RouteId, UpdateDispatchRouteParams) ->
    update_dispatch_route_by_id(Ctx, AccessToken, RouteId, UpdateDispatchRouteParams, #{}).

-spec update_dispatch_route_by_id(ctx:ctx(), binary(), integer(), openapi_dispatch_route:openapi_dispatch_route(), maps:map()) -> {ok, openapi_dispatch_route:openapi_dispatch_route(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_dispatch_route_by_id(Ctx, AccessToken, RouteId, UpdateDispatchRouteParams, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = put,
    Path = ["/fleet/dispatch/routes/", RouteId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = UpdateDispatchRouteParams,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /addresses/{addressId}
%% Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
-spec update_organization_address(ctx:ctx(), binary(), integer(), openapi_inline_object_1:openapi_inline_object_1()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_organization_address(Ctx, AccessToken, AddressId, Address) ->
    update_organization_address(Ctx, AccessToken, AddressId, Address, #{}).

-spec update_organization_address(ctx:ctx(), binary(), integer(), openapi_inline_object_1:openapi_inline_object_1(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_organization_address(Ctx, AccessToken, AddressId, Address, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = ["/addresses/", AddressId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = Address,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /fleet/set_data
%% This method enables the mutation of metadata for vehicles in the Samsara Cloud.
-spec update_vehicles(ctx:ctx(), binary(), openapi_inline_object_14:openapi_inline_object_14()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_vehicles(Ctx, AccessToken, VehicleUpdateParam) ->
    update_vehicles(Ctx, AccessToken, VehicleUpdateParam, #{}).

-spec update_vehicles(ctx:ctx(), binary(), openapi_inline_object_14:openapi_inline_object_14(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_vehicles(Ctx, AccessToken, VehicleUpdateParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/fleet/set_data"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = VehicleUpdateParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


