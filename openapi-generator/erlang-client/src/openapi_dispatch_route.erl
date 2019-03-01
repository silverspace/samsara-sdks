-module(openapi_dispatch_route).

-export([encode/1]).

-export_type([openapi_dispatch_route/0]).

-type openapi_dispatch_route() ::
    #{ 'actual_end_ms' => integer(),
       'actual_start_ms' => integer(),
       'driver_id' => integer(),
       'group_id' => integer(),
       'name' := binary(),
       'scheduled_end_ms' := integer(),
       'scheduled_meters' => integer(),
       'scheduled_start_ms' := integer(),
       'start_location_address' => binary(),
       'start_location_address_id' => integer(),
       'start_location_lat' => float(),
       'start_location_lng' => float(),
       'start_location_name' => binary(),
       'trailer_id' => integer(),
       'vehicle_id' => integer(),
       'dispatch_jobs' := list(),
       'id' := integer()
     }.

encode(#{ 'actual_end_ms' := ActualEndMs,
          'actual_start_ms' := ActualStartMs,
          'driver_id' := DriverId,
          'group_id' := GroupId,
          'name' := Name,
          'scheduled_end_ms' := ScheduledEndMs,
          'scheduled_meters' := ScheduledMeters,
          'scheduled_start_ms' := ScheduledStartMs,
          'start_location_address' := StartLocationAddress,
          'start_location_address_id' := StartLocationAddressId,
          'start_location_lat' := StartLocationLat,
          'start_location_lng' := StartLocationLng,
          'start_location_name' := StartLocationName,
          'trailer_id' := TrailerId,
          'vehicle_id' := VehicleId,
          'dispatch_jobs' := DispatchJobs,
          'id' := Id
        }) ->
    #{ 'actual_end_ms' => ActualEndMs,
       'actual_start_ms' => ActualStartMs,
       'driver_id' => DriverId,
       'group_id' => GroupId,
       'name' => Name,
       'scheduled_end_ms' => ScheduledEndMs,
       'scheduled_meters' => ScheduledMeters,
       'scheduled_start_ms' => ScheduledStartMs,
       'start_location_address' => StartLocationAddress,
       'start_location_address_id' => StartLocationAddressId,
       'start_location_lat' => StartLocationLat,
       'start_location_lng' => StartLocationLng,
       'start_location_name' => StartLocationName,
       'trailer_id' => TrailerId,
       'vehicle_id' => VehicleId,
       'dispatch_jobs' => DispatchJobs,
       'id' => Id
     }.
