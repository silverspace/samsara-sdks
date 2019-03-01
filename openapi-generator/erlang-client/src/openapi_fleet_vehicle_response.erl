-module(openapi_fleet_vehicle_response).

-export([encode/1]).

-export_type([openapi_fleet_vehicle_response/0]).

-type openapi_fleet_vehicle_response() ::
    #{ 'externalIds' => maps:map(),
       'harshAccelSetting' => binary(),
       'id' := integer(),
       'name' := binary(),
       'vehicleInfo' => openapi_fleet_vehicle_response_vehicle_info:openapi_fleet_vehicle_response_vehicle_info()
     }.

encode(#{ 'externalIds' := ExternalIds,
          'harshAccelSetting' := HarshAccelSetting,
          'id' := Id,
          'name' := Name,
          'vehicleInfo' := VehicleInfo
        }) ->
    #{ 'externalIds' => ExternalIds,
       'harshAccelSetting' => HarshAccelSetting,
       'id' => Id,
       'name' => Name,
       'vehicleInfo' => VehicleInfo
     }.
