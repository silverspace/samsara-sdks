-module(openapi_asset_reefer_response_reefer_stats).

-export([encode/1]).

-export_type([openapi_asset_reefer_response_reefer_stats/0]).

-type openapi_asset_reefer_response_reefer_stats() ::
    #{ 'fuelPercentage' => list(),
       'powerStatus' => list(),
       'engineHours' => list(),
       'setPoint' => list(),
       'returnAirTemp' => list(),
       'alarms' => list()
     }.

encode(#{ 'fuelPercentage' := FuelPercentage,
          'powerStatus' := PowerStatus,
          'engineHours' := EngineHours,
          'setPoint' := SetPoint,
          'returnAirTemp' := ReturnAirTemp,
          'alarms' := Alarms
        }) ->
    #{ 'fuelPercentage' => FuelPercentage,
       'powerStatus' => PowerStatus,
       'engineHours' => EngineHours,
       'setPoint' => SetPoint,
       'returnAirTemp' => ReturnAirTemp,
       'alarms' => Alarms
     }.
