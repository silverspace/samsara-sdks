-module(openapi_inline_object_15).

-include("openapi.hrl").

-export([openapi_inline_object_15/0]).

-export([openapi_inline_object_15/1]).

-export_type([openapi_inline_object_15/0]).

-type openapi_inline_object_15() ::
  [ {'endMs', integer() }
  | {'groupId', integer() }
  | {'startMs', integer() }
  | {'vehicleId', integer() }
  ].


openapi_inline_object_15() ->
    openapi_inline_object_15([]).

openapi_inline_object_15(Fields) ->
  Default = [ {'endMs', integer() }
            , {'groupId', integer() }
            , {'startMs', integer() }
            , {'vehicleId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

