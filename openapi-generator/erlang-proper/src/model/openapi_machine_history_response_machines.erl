-module(openapi_machine_history_response_machines).

-include("openapi.hrl").

-export([openapi_machine_history_response_machines/0]).

-export([openapi_machine_history_response_machines/1]).

-export_type([openapi_machine_history_response_machines/0]).

-type openapi_machine_history_response_machines() ::
  [ {'name', binary() }
  | {'id', integer() }
  | {'vibrations', list(openapi_machine_history_response_vibrations:openapi_machine_history_response_vibrations()) }
  ].


openapi_machine_history_response_machines() ->
    openapi_machine_history_response_machines([]).

openapi_machine_history_response_machines(Fields) ->
  Default = [ {'name', binary() }
            , {'id', integer() }
            , {'vibrations', list(openapi_machine_history_response_vibrations:openapi_machine_history_response_vibrations()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

