-module(openapi_inline_object_24).

-include("openapi.hrl").

-export([openapi_inline_object_24/0]).

-export([openapi_inline_object_24/1]).

-export_type([openapi_inline_object_24/0]).

-type openapi_inline_object_24() ::
  [ {'groupId', integer() }
  | {'sensors', list(integer()) }
  ].


openapi_inline_object_24() ->
    openapi_inline_object_24([]).

openapi_inline_object_24(Fields) ->
  Default = [ {'groupId', integer() }
            , {'sensors', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

