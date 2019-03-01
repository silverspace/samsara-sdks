-module(openapi_inline_object_17).

-include("openapi.hrl").

-export([openapi_inline_object_17/0]).

-export([openapi_inline_object_17/1]).

-export_type([openapi_inline_object_17/0]).

-type openapi_inline_object_17() ::
  [ {'endMs', integer() }
  | {'groupId', integer() }
  | {'startMs', integer() }
  ].


openapi_inline_object_17() ->
    openapi_inline_object_17([]).

openapi_inline_object_17(Fields) ->
  Default = [ {'endMs', integer() }
            , {'groupId', integer() }
            , {'startMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

