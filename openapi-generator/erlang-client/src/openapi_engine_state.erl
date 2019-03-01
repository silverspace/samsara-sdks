-module(openapi_engine_state).

-export([encode/1]).

-export_type([openapi_engine_state/0]).

-type openapi_engine_state() ::
    #{ 'timeMs' := maps:map(),
       'value' := binary()
     }.

encode(#{ 'timeMs' := TimeMs,
          'value' := Value
        }) ->
    #{ 'timeMs' => TimeMs,
       'value' => Value
     }.
