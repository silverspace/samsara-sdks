-module(openapi_sensors_api).

-export([get_sensors/3, get_sensors/4,
         get_sensors_cargo/3, get_sensors_cargo/4,
         get_sensors_door/3, get_sensors_door/4,
         get_sensors_history/3, get_sensors_history/4,
         get_sensors_humidity/3, get_sensors_humidity/4,
         get_sensors_temperature/3, get_sensors_temperature/4]).

-define(BASE_URL, "/v1").

%% @doc /sensors/list
%% Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
-spec get_sensors(ctx:ctx(), binary(), openapi_inline_object_23:openapi_inline_object_23()) -> {ok, openapi_inline_response_200_8:openapi_inline_response_200_8(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors(Ctx, AccessToken, GroupParam) ->
    get_sensors(Ctx, AccessToken, GroupParam, #{}).

-spec get_sensors(ctx:ctx(), binary(), openapi_inline_object_23:openapi_inline_object_23(), maps:map()) -> {ok, openapi_inline_response_200_8:openapi_inline_response_200_8(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors(Ctx, AccessToken, GroupParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/sensors/list"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = GroupParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /sensors/cargo
%% Get cargo monitor status (empty / full) for requested sensors.
-spec get_sensors_cargo(ctx:ctx(), binary(), openapi_inline_object_19:openapi_inline_object_19()) -> {ok, openapi_cargo_response:openapi_cargo_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_cargo(Ctx, AccessToken, SensorParam) ->
    get_sensors_cargo(Ctx, AccessToken, SensorParam, #{}).

-spec get_sensors_cargo(ctx:ctx(), binary(), openapi_inline_object_19:openapi_inline_object_19(), maps:map()) -> {ok, openapi_cargo_response:openapi_cargo_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_cargo(Ctx, AccessToken, SensorParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/sensors/cargo"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = SensorParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /sensors/door
%% Get door monitor status (closed / open) for requested sensors.
-spec get_sensors_door(ctx:ctx(), binary(), openapi_inline_object_20:openapi_inline_object_20()) -> {ok, openapi_door_response:openapi_door_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_door(Ctx, AccessToken, SensorParam) ->
    get_sensors_door(Ctx, AccessToken, SensorParam, #{}).

-spec get_sensors_door(ctx:ctx(), binary(), openapi_inline_object_20:openapi_inline_object_20(), maps:map()) -> {ok, openapi_door_response:openapi_door_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_door(Ctx, AccessToken, SensorParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/sensors/door"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = SensorParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /sensors/history
%% Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
-spec get_sensors_history(ctx:ctx(), binary(), openapi_inline_object_21:openapi_inline_object_21()) -> {ok, openapi_sensor_history_response:openapi_sensor_history_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_history(Ctx, AccessToken, HistoryParam) ->
    get_sensors_history(Ctx, AccessToken, HistoryParam, #{}).

-spec get_sensors_history(ctx:ctx(), binary(), openapi_inline_object_21:openapi_inline_object_21(), maps:map()) -> {ok, openapi_sensor_history_response:openapi_sensor_history_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_history(Ctx, AccessToken, HistoryParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/sensors/history"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = HistoryParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /sensors/humidity
%% Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
-spec get_sensors_humidity(ctx:ctx(), binary(), openapi_inline_object_22:openapi_inline_object_22()) -> {ok, openapi_humidity_response:openapi_humidity_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_humidity(Ctx, AccessToken, SensorParam) ->
    get_sensors_humidity(Ctx, AccessToken, SensorParam, #{}).

-spec get_sensors_humidity(ctx:ctx(), binary(), openapi_inline_object_22:openapi_inline_object_22(), maps:map()) -> {ok, openapi_humidity_response:openapi_humidity_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_humidity(Ctx, AccessToken, SensorParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/sensors/humidity"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = SensorParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /sensors/temperature
%% Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
-spec get_sensors_temperature(ctx:ctx(), binary(), openapi_inline_object_24:openapi_inline_object_24()) -> {ok, openapi_temperature_response:openapi_temperature_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_temperature(Ctx, AccessToken, SensorParam) ->
    get_sensors_temperature(Ctx, AccessToken, SensorParam, #{}).

-spec get_sensors_temperature(ctx:ctx(), binary(), openapi_inline_object_24:openapi_inline_object_24(), maps:map()) -> {ok, openapi_temperature_response:openapi_temperature_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_sensors_temperature(Ctx, AccessToken, SensorParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/sensors/temperature"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = SensorParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


