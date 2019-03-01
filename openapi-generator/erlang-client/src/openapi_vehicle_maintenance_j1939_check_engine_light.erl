-module(openapi_vehicle_maintenance_j1939_check_engine_light).

-export([encode/1]).

-export_type([openapi_vehicle_maintenance_j1939_check_engine_light/0]).

-type openapi_vehicle_maintenance_j1939_check_engine_light() ::
    #{ 'protectIsOn' => boolean(),
       'stopIsOn' => boolean(),
       'warningIsOn' => boolean(),
       'emissionsIsOn' => boolean()
     }.

encode(#{ 'protectIsOn' := ProtectIsOn,
          'stopIsOn' := StopIsOn,
          'warningIsOn' := WarningIsOn,
          'emissionsIsOn' := EmissionsIsOn
        }) ->
    #{ 'protectIsOn' => ProtectIsOn,
       'stopIsOn' => StopIsOn,
       'warningIsOn' => WarningIsOn,
       'emissionsIsOn' => EmissionsIsOn
     }.
