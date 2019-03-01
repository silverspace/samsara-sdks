-module(openapi_aux_input).

-include("openapi.hrl").

-export([openapi_aux_input/0]).

-export([openapi_aux_input/1]).

-export_type([openapi_aux_input/0]).

-type openapi_aux_input() ::
  [ {'timeMs', map() }
  | {'value', boolean() }
  ].


openapi_aux_input() ->
    openapi_aux_input([]).

openapi_aux_input(Fields) ->
  Default = [ {'timeMs', map() }
            , {'value', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

