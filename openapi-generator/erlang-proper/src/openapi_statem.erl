-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("openapi_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% delete_user_by_id
%%==============================================================================

delete_user_by_id(AccessToken, UserId) ->
  openapi_api:delete_user_by_id(AccessToken, UserId).

delete_user_by_id_args(_S) ->
  [binary(), integer()].

%%==============================================================================
%% get_user_by_id
%%==============================================================================

get_user_by_id(AccessToken, UserId) ->
  openapi_api:get_user_by_id(AccessToken, UserId).

get_user_by_id_args(_S) ->
  [binary(), integer()].

%%==============================================================================
%% list_user_roles
%%==============================================================================

list_user_roles(AccessToken) ->
  openapi_api:list_user_roles(AccessToken).

list_user_roles_args(_S) ->
  [binary()].

%%==============================================================================
%% list_users
%%==============================================================================

list_users(AccessToken) ->
  openapi_api:list_users(AccessToken).

list_users_args(_S) ->
  [binary()].

