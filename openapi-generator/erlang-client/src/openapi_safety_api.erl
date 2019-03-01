-module(openapi_safety_api).

-export([get_driver_safety_score/5, get_driver_safety_score/6,
         get_vehicle_harsh_event/4, get_vehicle_harsh_event/5,
         get_vehicle_safety_score/5, get_vehicle_safety_score/6]).

-define(BASE_URL, "/v1").

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


