-module(openapi_vehicle).

-export([encode/1]).

-export_type([openapi_vehicle/0]).

-type openapi_vehicle() ::
    #{ 'engineHours' => integer(),
       'fuelLevelPercent' => float(),
       'id' := integer(),
       'name' => binary(),
       'note' => binary(),
       'odometerMeters' => integer(),
       'vin' => binary()
     }.

encode(#{ 'engineHours' := EngineHours,
          'fuelLevelPercent' := FuelLevelPercent,
          'id' := Id,
          'name' := Name,
          'note' := Note,
          'odometerMeters' := OdometerMeters,
          'vin' := Vin
        }) ->
    #{ 'engineHours' => EngineHours,
       'fuelLevelPercent' => FuelLevelPercent,
       'id' => Id,
       'name' => Name,
       'note' => Note,
       'odometerMeters' => OdometerMeters,
       'vin' => Vin
     }.
