-module(openapi_inline_object_2).

-include("openapi.hrl").

-export([openapi_inline_object_2/0]).

-export([openapi_inline_object_2/1]).

-export_type([openapi_inline_object_2/0]).

-type openapi_inline_object_2() ::
  [ {'address', binary() }
  | {'groupId', integer() }
  | {'name', binary() }
  | {'radius', integer() }
  ].


openapi_inline_object_2() ->
    openapi_inline_object_2([]).

openapi_inline_object_2(Fields) ->
  Default = [ {'address', binary() }
            , {'groupId', integer() }
            , {'name', binary() }
            , {'radius', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

