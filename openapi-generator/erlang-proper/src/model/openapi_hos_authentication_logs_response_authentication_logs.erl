-module(openapi_hos_authentication_logs_response_authentication_logs).

-include("openapi.hrl").

-export([openapi_hos_authentication_logs_response_authentication_logs/0]).

-export([openapi_hos_authentication_logs_response_authentication_logs/1]).

-export_type([openapi_hos_authentication_logs_response_authentication_logs/0]).

-type openapi_hos_authentication_logs_response_authentication_logs() ::
  [ {'actionType', binary() }
  | {'address', binary() }
  | {'city', binary() }
  | {'happenedAtMs', integer() }
  | {'addressName', binary() }
  | {'state', binary() }
  ].


openapi_hos_authentication_logs_response_authentication_logs() ->
    openapi_hos_authentication_logs_response_authentication_logs([]).

openapi_hos_authentication_logs_response_authentication_logs(Fields) ->
  Default = [ {'actionType', binary() }
            , {'address', binary() }
            , {'city', binary() }
            , {'happenedAtMs', integer() }
            , {'addressName', binary() }
            , {'state', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

