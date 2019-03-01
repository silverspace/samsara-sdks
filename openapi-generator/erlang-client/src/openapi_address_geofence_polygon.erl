-module(openapi_address_geofence_polygon).

-export([encode/1]).

-export_type([openapi_address_geofence_polygon/0]).

-type openapi_address_geofence_polygon() ::
    #{ 'vertices' => list()
     }.

encode(#{ 'vertices' := Vertices
        }) ->
    #{ 'vertices' => Vertices
     }.
