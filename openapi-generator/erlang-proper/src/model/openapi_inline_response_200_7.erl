-module(openapi_inline_response_200_7).

-include("openapi.hrl").

-export([openapi_inline_response_200_7/0]).

-export([openapi_inline_response_200_7/1]).

-export_type([openapi_inline_response_200_7/0]).

-type openapi_inline_response_200_7() ::
  [ {'machines', list(openapi_machine:openapi_machine()) }
  ].


openapi_inline_response_200_7() ->
    openapi_inline_response_200_7([]).

openapi_inline_response_200_7(Fields) ->
  Default = [ {'machines', list(openapi_machine:openapi_machine()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

