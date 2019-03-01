-module(openapi_routes_api).

-export([create_dispatch_route/3, create_dispatch_route/4,
         create_driver_dispatch_route/4, create_driver_dispatch_route/5,
         create_vehicle_dispatch_route/4, create_vehicle_dispatch_route/5,
         delete_dispatch_route_by_id/3, delete_dispatch_route_by_id/4,
         fetch_all_dispatch_routes/2, fetch_all_dispatch_routes/3,
         fetch_all_route_job_updates/2, fetch_all_route_job_updates/3,
         get_dispatch_route_by_id/3, get_dispatch_route_by_id/4,
         get_dispatch_route_history/3, get_dispatch_route_history/4,
         get_dispatch_routes_by_driver_id/3, get_dispatch_routes_by_driver_id/4,
         get_dispatch_routes_by_vehicle_id/3, get_dispatch_routes_by_vehicle_id/4,
         update_dispatch_route_by_id/4, update_dispatch_route_by_id/5]).

-define(BASE_URL, "/v1").

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


