-module(openapi_drivers_response).

-export([encode/1]).

-export_type([openapi_drivers_response/0]).

-type openapi_drivers_response() ::
    #{ 'drivers' => list()
     }.

encode(#{ 'drivers' := Drivers
        }) ->
    #{ 'drivers' => Drivers
     }.
