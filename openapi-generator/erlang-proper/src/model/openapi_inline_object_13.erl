-module(openapi_inline_object_13).

-include("openapi.hrl").

-export([openapi_inline_object_13/0]).

-export([openapi_inline_object_13/1]).

-export_type([openapi_inline_object_13/0]).

-type openapi_inline_object_13() ::
  [ {'groupId', integer() }
  ].


openapi_inline_object_13() ->
    openapi_inline_object_13([]).

openapi_inline_object_13(Fields) ->
  Default = [ {'groupId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

