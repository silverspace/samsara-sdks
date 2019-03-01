-module(openapi_inline_response_200_8).

-export([encode/1]).

-export_type([openapi_inline_response_200_8/0]).

-type openapi_inline_response_200_8() ::
    #{ 'sensors' => list()
     }.

encode(#{ 'sensors' := Sensors
        }) ->
    #{ 'sensors' => Sensors
     }.
