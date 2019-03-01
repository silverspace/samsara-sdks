-module(openapi_address_geofence_polygon_vertices).

-export([encode/1]).

-export_type([openapi_address_geofence_polygon_vertices/0]).

-type openapi_address_geofence_polygon_vertices() ::
    #{ 'latitude' => float(),
       'longitude' => float()
     }.

encode(#{ 'latitude' := Latitude,
          'longitude' := Longitude
        }) ->
    #{ 'latitude' => Latitude,
       'longitude' => Longitude
     }.
