-module(openapi_inline_response_200_9).

-include("openapi.hrl").

-export([openapi_inline_response_200_9/0]).

-export([openapi_inline_response_200_9/1]).

-export_type([openapi_inline_response_200_9/0]).

-type openapi_inline_response_200_9() ::
  [ {'tags', list(openapi_tag:openapi_tag()) }
  ].


openapi_inline_response_200_9() ->
    openapi_inline_response_200_9([]).

openapi_inline_response_200_9(Fields) ->
  Default = [ {'tags', list(openapi_tag:openapi_tag()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

