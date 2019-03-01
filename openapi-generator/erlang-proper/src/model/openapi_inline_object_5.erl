-module(openapi_inline_object_5).

-include("openapi.hrl").

-export([openapi_inline_object_5/0]).

-export([openapi_inline_object_5/1]).

-export_type([openapi_inline_object_5/0]).

-type openapi_inline_object_5() ::
  [ {'endMs', integer() }
  | {'orgId', integer() }
  | {'startMs', integer() }
  ].


openapi_inline_object_5() ->
    openapi_inline_object_5([]).

openapi_inline_object_5(Fields) ->
  Default = [ {'endMs', integer() }
            , {'orgId', integer() }
            , {'startMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

