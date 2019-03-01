-module(openapi_vehicle_maintenance_j1939).

-export([encode/1]).

-export_type([openapi_vehicle_maintenance_j1939/0]).

-type openapi_vehicle_maintenance_j1939() ::
    #{ 'checkEngineLight' => openapi_vehicle_maintenance_j1939_check_engine_light:openapi_vehicle_maintenance_j1939_check_engine_light(),
       'diagnosticTroubleCodes' => list()
     }.

encode(#{ 'checkEngineLight' := CheckEngineLight,
          'diagnosticTroubleCodes' := DiagnosticTroubleCodes
        }) ->
    #{ 'checkEngineLight' => CheckEngineLight,
       'diagnosticTroubleCodes' => DiagnosticTroubleCodes
     }.
