-module(openapi_machine_history_response).

-export([encode/1]).

-export_type([openapi_machine_history_response/0]).

-type openapi_machine_history_response() ::
    #{ 'machines' => list()
     }.

encode(#{ 'machines' := Machines
        }) ->
    #{ 'machines' => Machines
     }.
