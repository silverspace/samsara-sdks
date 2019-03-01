-module(openapi_trip_response_trips).

-export([encode/1]).

-export_type([openapi_trip_response_trips/0]).

-type openapi_trip_response_trips() ::
    #{ 'endOdometer' => integer(),
       'distanceMeters' => integer(),
       'endMs' => integer(),
       'startMs' => integer(),
       'fuelConsumedMl' => integer(),
       'startAddress' => binary(),
       'startCoordinates' => openapi_trip_response_start_coordinates:openapi_trip_response_start_coordinates(),
       'endCoordinates' => openapi_trip_response_end_coordinates:openapi_trip_response_end_coordinates(),
       'startOdometer' => integer(),
       'driverId' => integer(),
       'startLocation' => binary(),
       'tollMeters' => integer(),
       'endAddress' => binary(),
       'endLocation' => binary()
     }.

encode(#{ 'endOdometer' := EndOdometer,
          'distanceMeters' := DistanceMeters,
          'endMs' := EndMs,
          'startMs' := StartMs,
          'fuelConsumedMl' := FuelConsumedMl,
          'startAddress' := StartAddress,
          'startCoordinates' := StartCoordinates,
          'endCoordinates' := EndCoordinates,
          'startOdometer' := StartOdometer,
          'driverId' := DriverId,
          'startLocation' := StartLocation,
          'tollMeters' := TollMeters,
          'endAddress' := EndAddress,
          'endLocation' := EndLocation
        }) ->
    #{ 'endOdometer' => EndOdometer,
       'distanceMeters' => DistanceMeters,
       'endMs' => EndMs,
       'startMs' => StartMs,
       'fuelConsumedMl' => FuelConsumedMl,
       'startAddress' => StartAddress,
       'startCoordinates' => StartCoordinates,
       'endCoordinates' => EndCoordinates,
       'startOdometer' => StartOdometer,
       'driverId' => DriverId,
       'startLocation' => StartLocation,
       'tollMeters' => TollMeters,
       'endAddress' => EndAddress,
       'endLocation' => EndLocation
     }.
