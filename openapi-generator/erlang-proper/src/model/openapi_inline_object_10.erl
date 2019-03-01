-module(openapi_inline_object_10).

-include("openapi.hrl").

-export([openapi_inline_object_10/0]).

-export([openapi_inline_object_10/1]).

-export_type([openapi_inline_object_10/0]).

-type openapi_inline_object_10() ::
  [ {'groupId', integer() }
  ].


openapi_inline_object_10() ->
    openapi_inline_object_10([]).

openapi_inline_object_10(Fields) ->
  Default = [ {'groupId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

