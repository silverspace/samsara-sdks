-module(openapi_hos_logs_summary_response).

-include("openapi.hrl").

-export([openapi_hos_logs_summary_response/0]).

-export([openapi_hos_logs_summary_response/1]).

-export_type([openapi_hos_logs_summary_response/0]).

-type openapi_hos_logs_summary_response() ::
  [ {'drivers', list(openapi_hos_logs_summary_response_drivers:openapi_hos_logs_summary_response_drivers()) }
  ].


openapi_hos_logs_summary_response() ->
    openapi_hos_logs_summary_response([]).

openapi_hos_logs_summary_response(Fields) ->
  Default = [ {'drivers', list(openapi_hos_logs_summary_response_drivers:openapi_hos_logs_summary_response_drivers()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

