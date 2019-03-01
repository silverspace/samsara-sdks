-module(openapi_inline_response_200).

-include("openapi.hrl").

-export([openapi_inline_response_200/0]).

-export([openapi_inline_response_200/1]).

-export_type([openapi_inline_response_200/0]).

-type openapi_inline_response_200() ::
  [ {'assets', list(openapi_asset:openapi_asset()) }
  ].


openapi_inline_response_200() ->
    openapi_inline_response_200([]).

openapi_inline_response_200(Fields) ->
  Default = [ {'assets', list(openapi_asset:openapi_asset()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

