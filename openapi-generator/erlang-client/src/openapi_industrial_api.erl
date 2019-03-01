-module(openapi_industrial_api).

-export([get_all_data_inputs/2, get_all_data_inputs/3,
         get_data_input/3, get_data_input/4,
         get_machines/3, get_machines/4,
         get_machines_history/3, get_machines_history/4]).

-define(BASE_URL, "/v1").

%% @doc /industrial/data
%% Fetch all of the data inputs for a group.
-spec get_all_data_inputs(ctx:ctx(), binary()) -> {ok, openapi_inline_response_200_6:openapi_inline_response_200_6(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_data_inputs(Ctx, AccessToken) ->
    get_all_data_inputs(Ctx, AccessToken, #{}).

-spec get_all_data_inputs(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_inline_response_200_6:openapi_inline_response_200_6(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_data_inputs(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/industrial/data"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['group_id', 'startMs', 'endMs'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /industrial/data/{data_input_id:[0-9]+}
%% Fetch datapoints from a given data input.
-spec get_data_input(ctx:ctx(), binary(), integer()) -> {ok, openapi_data_input_history_response:openapi_data_input_history_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_data_input(Ctx, AccessToken, DataInputId) ->
    get_data_input(Ctx, AccessToken, DataInputId, #{}).

-spec get_data_input(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, openapi_data_input_history_response:openapi_data_input_history_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_data_input(Ctx, AccessToken, DataInputId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/industrial/data/", DataInputId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['startMs', 'endMs'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /machines/list
%% Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
-spec get_machines(ctx:ctx(), binary(), openapi_inline_object_18:openapi_inline_object_18()) -> {ok, openapi_inline_response_200_7:openapi_inline_response_200_7(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_machines(Ctx, AccessToken, GroupParam) ->
    get_machines(Ctx, AccessToken, GroupParam, #{}).

-spec get_machines(ctx:ctx(), binary(), openapi_inline_object_18:openapi_inline_object_18(), maps:map()) -> {ok, openapi_inline_response_200_7:openapi_inline_response_200_7(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_machines(Ctx, AccessToken, GroupParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/machines/list"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = GroupParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /machines/history
%% Get historical data for machine objects. This method returns a set of historical data for all machines in a group
-spec get_machines_history(ctx:ctx(), binary(), openapi_inline_object_17:openapi_inline_object_17()) -> {ok, openapi_machine_history_response:openapi_machine_history_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_machines_history(Ctx, AccessToken, HistoryParam) ->
    get_machines_history(Ctx, AccessToken, HistoryParam, #{}).

-spec get_machines_history(ctx:ctx(), binary(), openapi_inline_object_17:openapi_inline_object_17(), maps:map()) -> {ok, openapi_machine_history_response:openapi_machine_history_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_machines_history(Ctx, AccessToken, HistoryParam, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/machines/history"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = HistoryParam,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


