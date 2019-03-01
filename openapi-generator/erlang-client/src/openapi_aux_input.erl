-module(openapi_aux_input).

-export([encode/1]).

-export_type([openapi_aux_input/0]).

-type openapi_aux_input() ::
    #{ 'timeMs' := maps:map(),
       'value' := boolean()
     }.

encode(#{ 'timeMs' := TimeMs,
          'value' := Value
        }) ->
    #{ 'timeMs' => TimeMs,
       'value' => Value
     }.
