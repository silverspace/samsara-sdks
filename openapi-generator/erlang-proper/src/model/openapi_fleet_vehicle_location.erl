-module(openapi_fleet_vehicle_location).

-include("openapi.hrl").

-export([openapi_fleet_vehicle_location/0]).

-export([openapi_fleet_vehicle_location/1]).

-export_type([openapi_fleet_vehicle_location/0]).

-type openapi_fleet_vehicle_location() ::
  [ {'latitude', float() }
  | {'location', binary() }
  | {'longitude', float() }
  | {'speedMilesPerHour', float() }
  | {'timeMs', integer() }
  ].


openapi_fleet_vehicle_location() ->
    openapi_fleet_vehicle_location([]).

openapi_fleet_vehicle_location(Fields) ->
  Default = [ {'latitude', float() }
            , {'location', binary() }
            , {'longitude', float() }
            , {'speedMilesPerHour', float() }
            , {'timeMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

