-module(openapi_hos_authentication_logs_response).

-include("openapi.hrl").

-export([openapi_hos_authentication_logs_response/0]).

-export([openapi_hos_authentication_logs_response/1]).

-export_type([openapi_hos_authentication_logs_response/0]).

-type openapi_hos_authentication_logs_response() ::
  [ {'authenticationLogs', list(openapi_hos_authentication_logs_response_authentication_logs:openapi_hos_authentication_logs_response_authentication_logs()) }
  ].


openapi_hos_authentication_logs_response() ->
    openapi_hos_authentication_logs_response([]).

openapi_hos_authentication_logs_response(Fields) ->
  Default = [ {'authenticationLogs', list(openapi_hos_authentication_logs_response_authentication_logs:openapi_hos_authentication_logs_response_authentication_logs()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

