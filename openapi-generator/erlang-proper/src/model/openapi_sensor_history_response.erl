-module(openapi_sensor_history_response).

-include("openapi.hrl").

-export([openapi_sensor_history_response/0]).

-export([openapi_sensor_history_response/1]).

-export_type([openapi_sensor_history_response/0]).

-type openapi_sensor_history_response() ::
  [ {'results', list(openapi_sensor_history_response_results:openapi_sensor_history_response_results()) }
  ].


openapi_sensor_history_response() ->
    openapi_sensor_history_response([]).

openapi_sensor_history_response(Fields) ->
  Default = [ {'results', list(openapi_sensor_history_response_results:openapi_sensor_history_response_results()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

