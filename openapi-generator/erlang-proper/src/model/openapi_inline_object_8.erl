-module(openapi_inline_object_8).

-include("openapi.hrl").

-export([openapi_inline_object_8/0]).

-export([openapi_inline_object_8/1]).

-export_type([openapi_inline_object_8/0]).

-type openapi_inline_object_8() ::
  [ {'driverId', integer() }
  | {'endMs', integer() }
  | {'groupId', integer() }
  | {'startMs', integer() }
  ].


openapi_inline_object_8() ->
    openapi_inline_object_8([]).

openapi_inline_object_8(Fields) ->
  Default = [ {'driverId', integer() }
            , {'endMs', integer() }
            , {'groupId', integer() }
            , {'startMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

