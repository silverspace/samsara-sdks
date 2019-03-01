-module(openapi_inline_object_4).

-include("openapi.hrl").

-export([openapi_inline_object_4/0]).

-export([openapi_inline_object_4/1]).

-export_type([openapi_inline_object_4/0]).

-type openapi_inline_object_4() ::
  [ {'reactivate', boolean() }
  ].


openapi_inline_object_4() ->
    openapi_inline_object_4([]).

openapi_inline_object_4(Fields) ->
  Default = [ {'reactivate', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

