-module(openapi_asset_current_location).

-export([encode/1]).

-export_type([openapi_asset_current_location/0]).

-type openapi_asset_current_location() ::
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
