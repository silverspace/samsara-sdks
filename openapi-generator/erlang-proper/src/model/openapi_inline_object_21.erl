-module(openapi_inline_object_21).

-include("openapi.hrl").

-export([openapi_inline_object_21/0]).

-export([openapi_inline_object_21/1]).

-export_type([openapi_inline_object_21/0]).

-type openapi_inline_object_21() ::
  [ {'endMs', integer() }
  | {'fillMissing', binary() }
  | {'groupId', integer() }
  | {'series', list(openapi__sensors_history_series:openapi__sensors_history_series()) }
  | {'startMs', integer() }
  | {'stepMs', integer() }
  ].


openapi_inline_object_21() ->
    openapi_inline_object_21([]).

openapi_inline_object_21(Fields) ->
  Default = [ {'endMs', integer() }
            , {'fillMissing', elements([<<"withNull">>, <<"withPrevious">>]) }
            , {'groupId', integer() }
            , {'series', list(openapi__sensors_history_series:openapi__sensors_history_series()) }
            , {'startMs', integer() }
            , {'stepMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

