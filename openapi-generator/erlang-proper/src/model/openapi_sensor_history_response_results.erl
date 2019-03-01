-module(openapi_sensor_history_response_results).

-include("openapi.hrl").

-export([openapi_sensor_history_response_results/0]).

-export([openapi_sensor_history_response_results/1]).

-export_type([openapi_sensor_history_response_results/0]).

-type openapi_sensor_history_response_results() ::
  [ {'series', list(integer()) }
  | {'timeMs', integer() }
  ].


openapi_sensor_history_response_results() ->
    openapi_sensor_history_response_results([]).

openapi_sensor_history_response_results(Fields) ->
  Default = [ {'series', list(integer()) }
            , {'timeMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

