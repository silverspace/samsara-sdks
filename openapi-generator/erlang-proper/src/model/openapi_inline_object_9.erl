-module(openapi_inline_object_9).

-include("openapi.hrl").

-export([openapi_inline_object_9/0]).

-export([openapi_inline_object_9/1]).

-export_type([openapi_inline_object_9/0]).

-type openapi_inline_object_9() ::
  [ {'groupId', integer() }
  ].


openapi_inline_object_9() ->
    openapi_inline_object_9([]).

openapi_inline_object_9(Fields) ->
  Default = [ {'groupId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

