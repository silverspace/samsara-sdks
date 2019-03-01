-module(openapi_address_geofence_polygon).

-include("openapi.hrl").

-export([openapi_address_geofence_polygon/0]).

-export([openapi_address_geofence_polygon/1]).

-export_type([openapi_address_geofence_polygon/0]).

-type openapi_address_geofence_polygon() ::
  [ {'vertices', list(openapi_address_geofence_polygon_vertices:openapi_address_geofence_polygon_vertices()) }
  ].


openapi_address_geofence_polygon() ->
    openapi_address_geofence_polygon([]).

openapi_address_geofence_polygon(Fields) ->
  Default = [ {'vertices', list(openapi_address_geofence_polygon_vertices:openapi_address_geofence_polygon_vertices()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

