-module(openapi_assets_api).

-export([get_all_asset_current_locations/2, get_all_asset_current_locations/3,
         get_all_assets/2, get_all_assets/3,
         get_asset_location/5, get_asset_location/6,
         get_asset_reefer/5, get_asset_reefer/6]).

-define(BASE_URL, "/v1").

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


