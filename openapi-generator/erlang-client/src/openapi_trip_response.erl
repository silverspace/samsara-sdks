-module(openapi_trip_response).

-export([encode/1]).

-export_type([openapi_trip_response/0]).

-type openapi_trip_response() ::
    #{ 'trips' => list()
     }.

encode(#{ 'trips' := Trips
        }) ->
    #{ 'trips' => Trips
     }.
