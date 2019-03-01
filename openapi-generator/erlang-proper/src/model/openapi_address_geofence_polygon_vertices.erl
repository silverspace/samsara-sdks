-module(openapi_address_geofence_polygon_vertices).

-include("openapi.hrl").

-export([openapi_address_geofence_polygon_vertices/0]).

-export([openapi_address_geofence_polygon_vertices/1]).

-export_type([openapi_address_geofence_polygon_vertices/0]).

-type openapi_address_geofence_polygon_vertices() ::
  [ {'latitude', float() }
  | {'longitude', float() }
  ].


openapi_address_geofence_polygon_vertices() ->
    openapi_address_geofence_polygon_vertices([]).

openapi_address_geofence_polygon_vertices(Fields) ->
  Default = [ {'latitude', float() }
            , {'longitude', float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

