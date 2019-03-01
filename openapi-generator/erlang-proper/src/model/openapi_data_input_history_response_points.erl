-module(openapi_data_input_history_response_points).

-include("openapi.hrl").

-export([openapi_data_input_history_response_points/0]).

-export([openapi_data_input_history_response_points/1]).

-export_type([openapi_data_input_history_response_points/0]).

-type openapi_data_input_history_response_points() ::
  [ {'value', float() }
  | {'timeMs', integer() }
  ].


openapi_data_input_history_response_points() ->
    openapi_data_input_history_response_points([]).

openapi_data_input_history_response_points(Fields) ->
  Default = [ {'value', float() }
            , {'timeMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

