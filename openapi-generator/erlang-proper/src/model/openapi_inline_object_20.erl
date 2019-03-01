-module(openapi_inline_object_20).

-include("openapi.hrl").

-export([openapi_inline_object_20/0]).

-export([openapi_inline_object_20/1]).

-export_type([openapi_inline_object_20/0]).

-type openapi_inline_object_20() ::
  [ {'groupId', integer() }
  | {'sensors', list(integer()) }
  ].


openapi_inline_object_20() ->
    openapi_inline_object_20([]).

openapi_inline_object_20(Fields) ->
  Default = [ {'groupId', integer() }
            , {'sensors', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

