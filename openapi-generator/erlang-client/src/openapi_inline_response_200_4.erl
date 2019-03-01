-module(openapi_inline_response_200_4).

-export([encode/1]).

-export_type([openapi_inline_response_200_4/0]).

-type openapi_inline_response_200_4() ::
    #{ 'vehicles' => list()
     }.

encode(#{ 'vehicles' := Vehicles
        }) ->
    #{ 'vehicles' => Vehicles
     }.
