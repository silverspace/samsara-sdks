-module(openapi_address_geofence).

-include("openapi.hrl").

-export([openapi_address_geofence/0]).

-export([openapi_address_geofence/1]).

-export_type([openapi_address_geofence/0]).

-type openapi_address_geofence() ::
  [ {'circle', openapi_address_geofence_circle:openapi_address_geofence_circle() }
  | {'polygon', openapi_address_geofence_polygon:openapi_address_geofence_polygon() }
  ].


openapi_address_geofence() ->
    openapi_address_geofence([]).

openapi_address_geofence(Fields) ->
  Default = [ {'circle', openapi_address_geofence_circle:openapi_address_geofence_circle() }
            , {'polygon', openapi_address_geofence_polygon:openapi_address_geofence_polygon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

