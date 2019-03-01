-module(openapi_driver_daily_log_response_days).

-export([encode/1]).

-export_type([openapi_driver_daily_log_response_days/0]).

-type openapi_driver_daily_log_response_days() ::
    #{ 'certifiedAtMs' => integer(),
       'endMs' => integer(),
       'startMs' => integer(),
       'trailerIds' => maps:map(),
       'activeHours' => float(),
       'distanceMiles' => float(),
       'activeMs' => integer(),
       'certified' => boolean(),
       'vehicleIds' => maps:map()
     }.

encode(#{ 'certifiedAtMs' := CertifiedAtMs,
          'endMs' := EndMs,
          'startMs' := StartMs,
          'trailerIds' := TrailerIds,
          'activeHours' := ActiveHours,
          'distanceMiles' := DistanceMiles,
          'activeMs' := ActiveMs,
          'certified' := Certified,
          'vehicleIds' := VehicleIds
        }) ->
    #{ 'certifiedAtMs' => CertifiedAtMs,
       'endMs' => EndMs,
       'startMs' => StartMs,
       'trailerIds' => TrailerIds,
       'activeHours' => ActiveHours,
       'distanceMiles' => DistanceMiles,
       'activeMs' => ActiveMs,
       'certified' => Certified,
       'vehicleIds' => VehicleIds
     }.
