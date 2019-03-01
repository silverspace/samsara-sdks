-module(openapi_fleet_vehicle_location).

-export([encode/1]).

-export_type([openapi_fleet_vehicle_location/0]).

-type openapi_fleet_vehicle_location() ::
    #{ 'latitude' => float(),
       'location' => binary(),
       'longitude' => float(),
       'speedMilesPerHour' => float(),
       'timeMs' => integer()
     }.

encode(#{ 'latitude' := Latitude,
          'location' := Location,
          'longitude' := Longitude,
          'speedMilesPerHour' := SpeedMilesPerHour,
          'timeMs' := TimeMs
        }) ->
    #{ 'latitude' => Latitude,
       'location' => Location,
       'longitude' => Longitude,
       'speedMilesPerHour' => SpeedMilesPerHour,
       'timeMs' => TimeMs
     }.
