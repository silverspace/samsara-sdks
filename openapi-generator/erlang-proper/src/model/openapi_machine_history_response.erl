-module(openapi_machine_history_response).

-include("openapi.hrl").

-export([openapi_machine_history_response/0]).

-export([openapi_machine_history_response/1]).

-export_type([openapi_machine_history_response/0]).

-type openapi_machine_history_response() ::
  [ {'machines', list(openapi_machine_history_response_machines:openapi_machine_history_response_machines()) }
  ].


openapi_machine_history_response() ->
    openapi_machine_history_response([]).

openapi_machine_history_response(Fields) ->
  Default = [ {'machines', list(openapi_machine_history_response_machines:openapi_machine_history_response_machines()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

