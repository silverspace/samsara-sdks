-module(openapi_inline_object_23).

-include("openapi.hrl").

-export([openapi_inline_object_23/0]).

-export([openapi_inline_object_23/1]).

-export_type([openapi_inline_object_23/0]).

-type openapi_inline_object_23() ::
  [ {'groupId', integer() }
  ].


openapi_inline_object_23() ->
    openapi_inline_object_23([]).

openapi_inline_object_23(Fields) ->
  Default = [ {'groupId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

