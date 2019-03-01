-module(openapi_vehicle_harsh_event_response_location).

-export([encode/1]).

-export_type([openapi_vehicle_harsh_event_response_location/0]).

-type openapi_vehicle_harsh_event_response_location() ::
    #{ 'address' => binary(),
       'latitude' => binary(),
       'longitude' => binary()
     }.

encode(#{ 'address' := Address,
          'latitude' := Latitude,
          'longitude' := Longitude
        }) ->
    #{ 'address' => Address,
       'latitude' => Latitude,
       'longitude' => Longitude
     }.
