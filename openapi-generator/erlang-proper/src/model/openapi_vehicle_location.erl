-module(openapi_vehicle_location).

-include("openapi.hrl").

-export([openapi_vehicle_location/0]).

-export([openapi_vehicle_location/1]).

-export_type([openapi_vehicle_location/0]).

-type openapi_vehicle_location() ::
  [ {'heading', float() }
  | {'id', integer() }
  | {'latitude', float() }
  | {'location', binary() }
  | {'longitude', float() }
  | {'name', binary() }
  | {'odometerMeters', integer() }
  | {'onTrip', boolean() }
  | {'speed', float() }
  | {'time', integer() }
  | {'vin', binary() }
  ].


openapi_vehicle_location() ->
    openapi_vehicle_location([]).

openapi_vehicle_location(Fields) ->
  Default = [ {'heading', float() }
            , {'id', integer() }
            , {'latitude', float() }
            , {'location', binary() }
            , {'longitude', float() }
            , {'name', binary() }
            , {'odometerMeters', integer() }
            , {'onTrip', boolean() }
            , {'speed', float() }
            , {'time', integer() }
            , {'vin', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

