-module(openapi_address_geofence).

-export([encode/1]).

-export_type([openapi_address_geofence/0]).

-type openapi_address_geofence() ::
    #{ 'circle' => openapi_address_geofence_circle:openapi_address_geofence_circle(),
       'polygon' => openapi_address_geofence_polygon:openapi_address_geofence_polygon()
     }.

encode(#{ 'circle' := Circle,
          'polygon' := Polygon
        }) ->
    #{ 'circle' => Circle,
       'polygon' => Polygon
     }.
