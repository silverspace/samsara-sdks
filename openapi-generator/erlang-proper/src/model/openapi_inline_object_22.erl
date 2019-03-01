-module(openapi_inline_object_22).

-include("openapi.hrl").

-export([openapi_inline_object_22/0]).

-export([openapi_inline_object_22/1]).

-export_type([openapi_inline_object_22/0]).

-type openapi_inline_object_22() ::
  [ {'groupId', integer() }
  | {'sensors', list(integer()) }
  ].


openapi_inline_object_22() ->
    openapi_inline_object_22([]).

openapi_inline_object_22(Fields) ->
  Default = [ {'groupId', integer() }
            , {'sensors', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

