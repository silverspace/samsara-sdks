-module(openapi_vehicle_maintenance_j1939).

-include("openapi.hrl").

-export([openapi_vehicle_maintenance_j1939/0]).

-export([openapi_vehicle_maintenance_j1939/1]).

-export_type([openapi_vehicle_maintenance_j1939/0]).

-type openapi_vehicle_maintenance_j1939() ::
  [ {'checkEngineLight', openapi_vehicle_maintenance_j1939_check_engine_light:openapi_vehicle_maintenance_j1939_check_engine_light() }
  | {'diagnosticTroubleCodes', list(openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes:openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes()) }
  ].


openapi_vehicle_maintenance_j1939() ->
    openapi_vehicle_maintenance_j1939([]).

openapi_vehicle_maintenance_j1939(Fields) ->
  Default = [ {'checkEngineLight', openapi_vehicle_maintenance_j1939_check_engine_light:openapi_vehicle_maintenance_j1939_check_engine_light() }
            , {'diagnosticTroubleCodes', list(openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes:openapi_vehicle_maintenance_j1939_diagnostic_trouble_codes()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

