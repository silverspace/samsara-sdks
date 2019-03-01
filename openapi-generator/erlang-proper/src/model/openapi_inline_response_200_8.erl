-module(openapi_inline_response_200_8).

-include("openapi.hrl").

-export([openapi_inline_response_200_8/0]).

-export([openapi_inline_response_200_8/1]).

-export_type([openapi_inline_response_200_8/0]).

-type openapi_inline_response_200_8() ::
  [ {'sensors', list(openapi_sensor:openapi_sensor()) }
  ].


openapi_inline_response_200_8() ->
    openapi_inline_response_200_8([]).

openapi_inline_response_200_8(Fields) ->
  Default = [ {'sensors', list(openapi_sensor:openapi_sensor()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

