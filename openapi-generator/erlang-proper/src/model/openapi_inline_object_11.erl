-module(openapi_inline_object_11).

-include("openapi.hrl").

-export([openapi_inline_object_11/0]).

-export([openapi_inline_object_11/1]).

-export_type([openapi_inline_object_11/0]).

-type openapi_inline_object_11() ::
  [ {'groupId', integer() }
  ].


openapi_inline_object_11() ->
    openapi_inline_object_11([]).

openapi_inline_object_11(Fields) ->
  Default = [ {'groupId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

