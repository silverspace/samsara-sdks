-module(openapi_dispatch_job).

-export([encode/1]).

-export_type([openapi_dispatch_job/0]).

-type openapi_dispatch_job() ::
    #{ 'destination_address' => binary(),
       'destination_address_id' => integer(),
       'destination_lat' => float(),
       'destination_lng' => float(),
       'destination_name' => binary(),
       'notes' => binary(),
       'scheduled_arrival_time_ms' := integer(),
       'scheduled_departure_time_ms' => integer(),
       'arrived_at_ms' => integer(),
       'completed_at_ms' => integer(),
       'dispatch_route_id' := integer(),
       'driver_id' => integer(),
       'en_route_at_ms' => integer(),
       'estimated_arrival_ms' => integer(),
       'fleet_viewer_url' => binary(),
       'group_id' := integer(),
       'id' := integer(),
       'job_state' := openapi_job_status:openapi_job_status(),
       'skipped_at_ms' => integer(),
       'vehicle_id' => integer()
     }.

encode(#{ 'destination_address' := DestinationAddress,
          'destination_address_id' := DestinationAddressId,
          'destination_lat' := DestinationLat,
          'destination_lng' := DestinationLng,
          'destination_name' := DestinationName,
          'notes' := Notes,
          'scheduled_arrival_time_ms' := ScheduledArrivalTimeMs,
          'scheduled_departure_time_ms' := ScheduledDepartureTimeMs,
          'arrived_at_ms' := ArrivedAtMs,
          'completed_at_ms' := CompletedAtMs,
          'dispatch_route_id' := DispatchRouteId,
          'driver_id' := DriverId,
          'en_route_at_ms' := EnRouteAtMs,
          'estimated_arrival_ms' := EstimatedArrivalMs,
          'fleet_viewer_url' := FleetViewerUrl,
          'group_id' := GroupId,
          'id' := Id,
          'job_state' := JobState,
          'skipped_at_ms' := SkippedAtMs,
          'vehicle_id' := VehicleId
        }) ->
    #{ 'destination_address' => DestinationAddress,
       'destination_address_id' => DestinationAddressId,
       'destination_lat' => DestinationLat,
       'destination_lng' => DestinationLng,
       'destination_name' => DestinationName,
       'notes' => Notes,
       'scheduled_arrival_time_ms' => ScheduledArrivalTimeMs,
       'scheduled_departure_time_ms' => ScheduledDepartureTimeMs,
       'arrived_at_ms' => ArrivedAtMs,
       'completed_at_ms' => CompletedAtMs,
       'dispatch_route_id' => DispatchRouteId,
       'driver_id' => DriverId,
       'en_route_at_ms' => EnRouteAtMs,
       'estimated_arrival_ms' => EstimatedArrivalMs,
       'fleet_viewer_url' => FleetViewerUrl,
       'group_id' => GroupId,
       'id' => Id,
       'job_state' => JobState,
       'skipped_at_ms' => SkippedAtMs,
       'vehicle_id' => VehicleId
     }.
