-module(openapi_vehicle_maintenance_passenger).

-include("openapi.hrl").

-export([openapi_vehicle_maintenance_passenger/0]).

-export([openapi_vehicle_maintenance_passenger/1]).

-export_type([openapi_vehicle_maintenance_passenger/0]).

-type openapi_vehicle_maintenance_passenger() ::
  [ {'checkEngineLight', openapi_vehicle_maintenance_passenger_check_engine_light:openapi_vehicle_maintenance_passenger_check_engine_light() }
  | {'diagnosticTroubleCodes', list(openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes:openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes()) }
  ].


openapi_vehicle_maintenance_passenger() ->
    openapi_vehicle_maintenance_passenger([]).

openapi_vehicle_maintenance_passenger(Fields) ->
  Default = [ {'checkEngineLight', openapi_vehicle_maintenance_passenger_check_engine_light:openapi_vehicle_maintenance_passenger_check_engine_light() }
            , {'diagnosticTroubleCodes', list(openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes:openapi_vehicle_maintenance_passenger_diagnostic_trouble_codes()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

