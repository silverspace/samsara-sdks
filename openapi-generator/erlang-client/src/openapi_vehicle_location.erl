-module(openapi_vehicle_location).

-export([encode/1]).

-export_type([openapi_vehicle_location/0]).

-type openapi_vehicle_location() ::
    #{ 'heading' => float(),
       'id' := integer(),
       'latitude' => float(),
       'location' => binary(),
       'longitude' => float(),
       'name' => binary(),
       'odometerMeters' => integer(),
       'onTrip' => boolean(),
       'speed' => float(),
       'time' => integer(),
       'vin' => binary()
     }.

encode(#{ 'heading' := Heading,
          'id' := Id,
          'latitude' := Latitude,
          'location' := Location,
          'longitude' := Longitude,
          'name' := Name,
          'odometerMeters' := OdometerMeters,
          'onTrip' := OnTrip,
          'speed' := Speed,
          'time' := Time,
          'vin' := Vin
        }) ->
    #{ 'heading' => Heading,
       'id' => Id,
       'latitude' => Latitude,
       'location' => Location,
       'longitude' => Longitude,
       'name' => Name,
       'odometerMeters' => OdometerMeters,
       'onTrip' => OnTrip,
       'speed' => Speed,
       'time' => Time,
       'vin' => Vin
     }.
