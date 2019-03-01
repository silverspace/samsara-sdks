-module(openapi_inline_object_7).

-include("openapi.hrl").

-export([openapi_inline_object_7/0]).

-export([openapi_inline_object_7/1]).

-export_type([openapi_inline_object_7/0]).

-type openapi_inline_object_7() ::
  [ {'driverId', integer() }
  | {'endMs', integer() }
  | {'groupId', integer() }
  | {'startMs', integer() }
  ].


openapi_inline_object_7() ->
    openapi_inline_object_7([]).

openapi_inline_object_7(Fields) ->
  Default = [ {'driverId', integer() }
            , {'endMs', integer() }
            , {'groupId', integer() }
            , {'startMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

