-module(openapi_tags_api).

-export([create_tag/3, create_tag/4,
         delete_tag_by_id/3, delete_tag_by_id/4,
         get_all_tags/2, get_all_tags/3,
         get_tag_by_id/3, get_tag_by_id/4,
         modify_tag_by_id/4, modify_tag_by_id/5,
         update_tag_by_id/4, update_tag_by_id/5]).

-define(BASE_URL, "/v1").

%% @doc /tags
%% Create a new tag for the group.
-spec create_tag(ctx:ctx(), binary(), openapi_tag_create:openapi_tag_create()) -> {ok, openapi_tag:openapi_tag(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_tag(Ctx, AccessToken, TagCreateParams) ->
    create_tag(Ctx, AccessToken, TagCreateParams, #{}).

-spec create_tag(ctx:ctx(), binary(), openapi_tag_create:openapi_tag_create(), maps:map()) -> {ok, openapi_tag:openapi_tag(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
create_tag(Ctx, AccessToken, TagCreateParams, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/tags"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = TagCreateParams,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /tags/{tag_id:[0-9]+}
%% Permanently deletes a tag.
-spec delete_tag_by_id(ctx:ctx(), binary(), integer()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_tag_by_id(Ctx, AccessToken, TagId) ->
    delete_tag_by_id(Ctx, AccessToken, TagId, #{}).

-spec delete_tag_by_id(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_tag_by_id(Ctx, AccessToken, TagId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/tags/", TagId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /tags
%% Fetch all of the tags for a group.
-spec get_all_tags(ctx:ctx(), binary()) -> {ok, openapi_inline_response_200_9:openapi_inline_response_200_9(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_tags(Ctx, AccessToken) ->
    get_all_tags(Ctx, AccessToken, #{}).

-spec get_all_tags(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_inline_response_200_9:openapi_inline_response_200_9(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_all_tags(Ctx, AccessToken, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/tags"],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params(['group_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /tags/{tag_id:[0-9]+}
%% Fetch a tag by id.
-spec get_tag_by_id(ctx:ctx(), binary(), integer()) -> {ok, openapi_tag:openapi_tag(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_tag_by_id(Ctx, AccessToken, TagId) ->
    get_tag_by_id(Ctx, AccessToken, TagId, #{}).

-spec get_tag_by_id(ctx:ctx(), binary(), integer(), maps:map()) -> {ok, openapi_tag:openapi_tag(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_tag_by_id(Ctx, AccessToken, TagId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/tags/", TagId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /tags/{tag_id:[0-9]+}
%% Add or delete specific members from a tag, or modify the name of a tag.
-spec modify_tag_by_id(ctx:ctx(), binary(), integer(), openapi_tag_modify:openapi_tag_modify()) -> {ok, openapi_tag:openapi_tag(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_tag_by_id(Ctx, AccessToken, TagId, TagModifyParams) ->
    modify_tag_by_id(Ctx, AccessToken, TagId, TagModifyParams, #{}).

-spec modify_tag_by_id(ctx:ctx(), binary(), integer(), openapi_tag_modify:openapi_tag_modify(), maps:map()) -> {ok, openapi_tag:openapi_tag(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
modify_tag_by_id(Ctx, AccessToken, TagId, TagModifyParams, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = ["/tags/", TagId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = TagModifyParams,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc /tags/{tag_id:[0-9]+}
%% Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
-spec update_tag_by_id(ctx:ctx(), binary(), integer(), openapi_tag_update:openapi_tag_update()) -> {ok, openapi_tag:openapi_tag(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_tag_by_id(Ctx, AccessToken, TagId, UpdateTagParams) ->
    update_tag_by_id(Ctx, AccessToken, TagId, UpdateTagParams, #{}).

-spec update_tag_by_id(ctx:ctx(), binary(), integer(), openapi_tag_update:openapi_tag_update(), maps:map()) -> {ok, openapi_tag:openapi_tag(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
update_tag_by_id(Ctx, AccessToken, TagId, UpdateTagParams, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = put,
    Path = ["/tags/", TagId, ""],
    QS = lists:flatten([{<<"access_token">>, AccessToken}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = UpdateTagParams,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


