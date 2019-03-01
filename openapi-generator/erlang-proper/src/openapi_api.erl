-module(openapi_api).

-export([ delete_user_by_id/2
        , get_user_by_id/2
        , list_user_roles/1
        , list_users/1
        ]).

-define(BASE_URL, "/v1").

%% @doc /users/{userId:[0-9]+}
%% Remove a user from the organization.
-spec delete_user_by_id(binary(), integer()) ->
  openapi_utils:response().
delete_user_by_id(AccessToken, UserId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/users/", UserId, ""],
  QueryString = [<<"access_token=">>, AccessToken, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc /users/{userId:[0-9]+}
%% Get a user.
-spec get_user_by_id(binary(), integer()) ->
  openapi_utils:response().
get_user_by_id(AccessToken, UserId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/users/", UserId, ""],
  QueryString = [<<"access_token=">>, AccessToken, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc /user_roles
%% Get all roles in the organization.
-spec list_user_roles(binary()) ->
  openapi_utils:response().
list_user_roles(AccessToken) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/user_roles"],
  QueryString = [<<"access_token=">>, AccessToken, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc /users
%% List all users in the organization.
-spec list_users(binary()) ->
  openapi_utils:response().
list_users(AccessToken) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/users"],
  QueryString = [<<"access_token=">>, AccessToken, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

