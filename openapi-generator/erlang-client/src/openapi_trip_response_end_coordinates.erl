-module(openapi_trip_response_end_coordinates).

-export([encode/1]).

-export_type([openapi_trip_response_end_coordinates/0]).

-type openapi_trip_response_end_coordinates() ::
    #{ 'latitude' => float(),
       'longitude' => float()
     }.

encode(#{ 'latitude' := Latitude,
          'longitude' := Longitude
        }) ->
    #{ 'latitude' => Latitude,
       'longitude' => Longitude
     }.
