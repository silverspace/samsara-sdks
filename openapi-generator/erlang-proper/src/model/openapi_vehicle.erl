-module(openapi_vehicle).

-include("openapi.hrl").

-export([openapi_vehicle/0]).

-export([openapi_vehicle/1]).

-export_type([openapi_vehicle/0]).

-type openapi_vehicle() ::
  [ {'engineHours', integer() }
  | {'fuelLevelPercent', float() }
  | {'id', integer() }
  | {'name', binary() }
  | {'note', binary() }
  | {'odometerMeters', integer() }
  | {'vin', binary() }
  ].


openapi_vehicle() ->
    openapi_vehicle([]).

openapi_vehicle(Fields) ->
  Default = [ {'engineHours', integer() }
            , {'fuelLevelPercent', float() }
            , {'id', integer() }
            , {'name', binary() }
            , {'note', binary() }
            , {'odometerMeters', integer() }
            , {'vin', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

