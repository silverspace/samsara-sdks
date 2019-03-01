-module(openapi_fleet_vehicle_response_vehicle_info).

-include("openapi.hrl").

-export([openapi_fleet_vehicle_response_vehicle_info/0]).

-export([openapi_fleet_vehicle_response_vehicle_info/1]).

-export_type([openapi_fleet_vehicle_response_vehicle_info/0]).

-type openapi_fleet_vehicle_response_vehicle_info() ::
  [ {'year', integer() }
  | {'model', binary() }
  | {'vin', binary() }
  | {'make', binary() }
  ].


openapi_fleet_vehicle_response_vehicle_info() ->
    openapi_fleet_vehicle_response_vehicle_info([]).

openapi_fleet_vehicle_response_vehicle_info(Fields) ->
  Default = [ {'year', integer() }
            , {'model', binary() }
            , {'vin', binary() }
            , {'make', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

