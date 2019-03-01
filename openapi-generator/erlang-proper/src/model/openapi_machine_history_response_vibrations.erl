-module(openapi_machine_history_response_vibrations).

-include("openapi.hrl").

-export([openapi_machine_history_response_vibrations/0]).

-export([openapi_machine_history_response_vibrations/1]).

-export_type([openapi_machine_history_response_vibrations/0]).

-type openapi_machine_history_response_vibrations() ::
  [ {'X', float() }
  | {'Y', float() }
  | {'Z', float() }
  | {'time', integer() }
  ].


openapi_machine_history_response_vibrations() ->
    openapi_machine_history_response_vibrations([]).

openapi_machine_history_response_vibrations(Fields) ->
  Default = [ {'X', float() }
            , {'Y', float() }
            , {'Z', float() }
            , {'time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

