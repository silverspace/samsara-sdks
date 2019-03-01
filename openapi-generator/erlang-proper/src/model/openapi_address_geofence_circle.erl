-module(openapi_address_geofence_circle).

-include("openapi.hrl").

-export([openapi_address_geofence_circle/0]).

-export([openapi_address_geofence_circle/1]).

-export_type([openapi_address_geofence_circle/0]).

-type openapi_address_geofence_circle() ::
  [ {'latitude', float() }
  | {'radiusMeters', integer() }
  | {'longitude', float() }
  ].


openapi_address_geofence_circle() ->
    openapi_address_geofence_circle([]).

openapi_address_geofence_circle(Fields) ->
  Default = [ {'latitude', float() }
            , {'radiusMeters', integer() }
            , {'longitude', float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

