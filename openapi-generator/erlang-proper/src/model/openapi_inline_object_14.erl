-module(openapi_inline_object_14).

-include("openapi.hrl").

-export([openapi_inline_object_14/0]).

-export([openapi_inline_object_14/1]).

-export_type([openapi_inline_object_14/0]).

-type openapi_inline_object_14() ::
  [ {'groupId', integer() }
  | {'vehicles', list(openapi_vehicle:openapi_vehicle()) }
  ].


openapi_inline_object_14() ->
    openapi_inline_object_14([]).

openapi_inline_object_14(Fields) ->
  Default = [ {'groupId', integer() }
            , {'vehicles', list(openapi_vehicle:openapi_vehicle()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

