-module(openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes).

-include("openapi.hrl").

-export([openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes/0]).

-export([openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes/1]).

-export_type([openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes/0]).

-type openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes() ::
  [ {'dtcShortCode', binary() }
  | {'dtcId', integer() }
  | {'dtcDescription', binary() }
  ].


openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes() ->
    openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes([]).

openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes(Fields) ->
  Default = [ {'dtcShortCode', binary() }
            , {'dtcId', integer() }
            , {'dtcDescription', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

