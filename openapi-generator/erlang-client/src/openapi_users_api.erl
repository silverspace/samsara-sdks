-module(openapi_users_api).

-export([delete_user_by_id/3, delete_user_by_id/4,
         get_user_by_id/3, get_user_by_id/4,
         list_user_roles/2, list_user_roles/3,
         list_users/2, list_users/3]).

-define(BASE_URL, "/v1").

%% @doc /users/{userId:[0-9]+}
%% Remove a user from the organization.
-spec delete_user_by_id(ctx:ctx(), binary(), integer()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_user_by_id(Ctx, AccessToken, UserId) ->
    delete_user_by_id(Ctx, AccessToken, UserId, #{}).

-spec delete_user_by_id(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_user_by_id(Ctx, AccessToken, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/users/", UserId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /users/{userId:[0-9]+}
%% Get a user.
-spec get_user_by_id(ctx:ctx(), binary(), integer()) -> {ok, openapi_user:openapi_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user_by_id(Ctx, AccessToken, UserId) ->
    get_user_by_id(Ctx, AccessToken, UserId, #{}).

-spec get_user_by_id(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, openapi_user:openapi_user(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_user_by_id(Ctx, AccessToken, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/users/", UserId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /user_roles
%% Get all roles in the organization.
-spec list_user_roles(ctx:ctx(), binary()) -> {ok, [openapi_user_role:openapi_user_role()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_user_roles(Ctx, AccessToken) ->
    list_user_roles(Ctx, AccessToken, #{}).

-spec list_user_roles(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_user_role:openapi_user_role()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_user_roles(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/user_roles"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /users
%% List all users in the organization.
-spec list_users(ctx:ctx(), binary()) -> {ok, [openapi_user:openapi_user()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_users(Ctx, AccessToken) ->
    list_users(Ctx, AccessToken, #{}).

-spec list_users(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_user:openapi_user()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
list_users(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/users"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


