-module(openapi_aux_input_series).

-export([encode/1]).

-export_type([openapi_aux_input_series/0]).

-type openapi_aux_input_series() ::
    #{ 'name' := binary(),
       'values' := list()
     }.

encode(#{ 'name' := Name,
          'values' := Values
        }) ->
    #{ 'name' => Name,
       'values' => Values
     }.
