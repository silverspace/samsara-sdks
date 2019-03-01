-module(openapi_drivers_api).

-export([create_driver/3, create_driver/4,
         deactivate_driver/3, deactivate_driver/4,
         get_all_deactivated_drivers/2, get_all_deactivated_drivers/3,
         get_deactivated_driver_by_id/3, get_deactivated_driver_by_id/4,
         get_driver_by_id/3, get_driver_by_id/4,
         reactivate_driver_by_id/4, reactivate_driver_by_id/5]).

-define(BASE_URL, "/v1").

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


