-module(openapi_inline_object_18).

-include("openapi.hrl").

-export([openapi_inline_object_18/0]).

-export([openapi_inline_object_18/1]).

-export_type([openapi_inline_object_18/0]).

-type openapi_inline_object_18() ::
  [ {'groupId', integer() }
  ].


openapi_inline_object_18() ->
    openapi_inline_object_18([]).

openapi_inline_object_18(Fields) ->
  Default = [ {'groupId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

