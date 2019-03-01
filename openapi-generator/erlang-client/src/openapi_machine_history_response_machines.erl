-module(openapi_machine_history_response_machines).

-export([encode/1]).

-export_type([openapi_machine_history_response_machines/0]).

-type openapi_machine_history_response_machines() ::
    #{ 'name' => binary(),
       'id' => integer(),
       'vibrations' => list()
     }.

encode(#{ 'name' := Name,
          'id' := Id,
          'vibrations' := Vibrations
        }) ->
    #{ 'name' => Name,
       'id' => Id,
       'vibrations' => Vibrations
     }.
