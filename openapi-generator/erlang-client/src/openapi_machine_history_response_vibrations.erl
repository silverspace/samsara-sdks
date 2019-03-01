-module(openapi_machine_history_response_vibrations).

-export([encode/1]).

-export_type([openapi_machine_history_response_vibrations/0]).

-type openapi_machine_history_response_vibrations() ::
    #{ 'X' => float(),
       'Y' => float(),
       'Z' => float(),
       'time' => integer()
     }.

encode(#{ 'X' := X,
          'Y' := Y,
          'Z' := Z,
          'time' := Time
        }) ->
    #{ 'X' => X,
       'Y' => Y,
       'Z' => Z,
       'time' => Time
     }.
