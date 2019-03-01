-module(openapi_address_geofence_circle).

-export([encode/1]).

-export_type([openapi_address_geofence_circle/0]).

-type openapi_address_geofence_circle() ::
    #{ 'latitude' => float(),
       'radiusMeters' => integer(),
       'longitude' => float()
     }.

encode(#{ 'latitude' := Latitude,
          'radiusMeters' := RadiusMeters,
          'longitude' := Longitude
        }) ->
    #{ 'latitude' => Latitude,
       'radiusMeters' => RadiusMeters,
       'longitude' => Longitude
     }.
