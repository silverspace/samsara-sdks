-module(openapi_hos_logs_response).

-include("openapi.hrl").

-export([openapi_hos_logs_response/0]).

-export([openapi_hos_logs_response/1]).

-export_type([openapi_hos_logs_response/0]).

-type openapi_hos_logs_response() ::
  [ {'logs', list(openapi_hos_logs_response_logs:openapi_hos_logs_response_logs()) }
  ].


openapi_hos_logs_response() ->
    openapi_hos_logs_response([]).

openapi_hos_logs_response(Fields) ->
  Default = [ {'logs', list(openapi_hos_logs_response_logs:openapi_hos_logs_response_logs()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

