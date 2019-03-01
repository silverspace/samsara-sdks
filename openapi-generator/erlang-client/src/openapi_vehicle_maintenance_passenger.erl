-module(openapi_vehicle_maintenance_passenger).

-export([encode/1]).

-export_type([openapi_vehicle_maintenance_passenger/0]).

-type openapi_vehicle_maintenance_passenger() ::
    #{ 'checkEngineLight' => openapi_vehicle_maintenance_passenger_check_engine_light:openapi_vehicle_maintenance_passenger_check_engine_light(),
       'diagnosticTroubleCodes' => list()
     }.

encode(#{ 'checkEngineLight' := CheckEngineLight,
          'diagnosticTroubleCodes' := DiagnosticTroubleCodes
        }) ->
    #{ 'checkEngineLight' => CheckEngineLight,
       'diagnosticTroubleCodes' => DiagnosticTroubleCodes
     }.
