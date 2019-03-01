-module(openapi_engine_state).

-include("openapi.hrl").

-export([openapi_engine_state/0]).

-export([openapi_engine_state/1]).

-export_type([openapi_engine_state/0]).

-type openapi_engine_state() ::
  [ {'timeMs', map() }
  | {'value', binary() }
  ].


openapi_engine_state() ->
    openapi_engine_state([]).

openapi_engine_state(Fields) ->
  Default = [ {'timeMs', map() }
            , {'value', elements([<<"Running">>, <<"Off">>, <<"Idle">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

