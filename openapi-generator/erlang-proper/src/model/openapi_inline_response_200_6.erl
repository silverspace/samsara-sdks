-module(openapi_inline_response_200_6).

-include("openapi.hrl").

-export([openapi_inline_response_200_6/0]).

-export([openapi_inline_response_200_6/1]).

-export_type([openapi_inline_response_200_6/0]).

-type openapi_inline_response_200_6() ::
  [ {'dataInputs', list(openapi_data_input_history_response:openapi_data_input_history_response()) }
  ].


openapi_inline_response_200_6() ->
    openapi_inline_response_200_6([]).

openapi_inline_response_200_6(Fields) ->
  Default = [ {'dataInputs', list(openapi_data_input_history_response:openapi_data_input_history_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

