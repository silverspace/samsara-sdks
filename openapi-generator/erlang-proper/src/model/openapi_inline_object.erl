-module(openapi_inline_object).

-include("openapi.hrl").

-export([openapi_inline_object/0]).

-export([openapi_inline_object/1]).

-export_type([openapi_inline_object/0]).

-type openapi_inline_object() ::
  [ {'addresses', list(openapi__addresses_addresses:openapi__addresses_addresses()) }
  ].


openapi_inline_object() ->
    openapi_inline_object([]).

openapi_inline_object(Fields) ->
  Default = [ {'addresses', list(openapi__addresses_addresses:openapi__addresses_addresses()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

