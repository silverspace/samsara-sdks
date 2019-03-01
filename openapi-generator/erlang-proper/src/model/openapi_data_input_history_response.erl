-module(openapi_data_input_history_response).

-include("openapi.hrl").

-export([openapi_data_input_history_response/0]).

-export([openapi_data_input_history_response/1]).

-export_type([openapi_data_input_history_response/0]).

-type openapi_data_input_history_response() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'points', list(openapi_data_input_history_response_points:openapi_data_input_history_response_points()) }
  ].


openapi_data_input_history_response() ->
    openapi_data_input_history_response([]).

openapi_data_input_history_response(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'points', list(openapi_data_input_history_response_points:openapi_data_input_history_response_points()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

