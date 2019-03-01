-module(openapi_inline_object_19).

-include("openapi.hrl").

-export([openapi_inline_object_19/0]).

-export([openapi_inline_object_19/1]).

-export_type([openapi_inline_object_19/0]).

-type openapi_inline_object_19() ::
  [ {'groupId', integer() }
  | {'sensors', list(integer()) }
  ].


openapi_inline_object_19() ->
    openapi_inline_object_19([]).

openapi_inline_object_19(Fields) ->
  Default = [ {'groupId', integer() }
            , {'sensors', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

