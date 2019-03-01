-module(openapi_dispatch_job_create).

-export([encode/1]).

-export_type([openapi_dispatch_job_create/0]).

-type openapi_dispatch_job_create() ::
    #{ 'destination_address' => binary(),
       'destination_address_id' => integer(),
       'destination_lat' => float(),
       'destination_lng' => float(),
       'destination_name' => binary(),
       'notes' => binary(),
       'scheduled_arrival_time_ms' := integer(),
       'scheduled_departure_time_ms' => integer()
     }.

encode(#{ 'destination_address' := DestinationAddress,
          'destination_address_id' := DestinationAddressId,
          'destination_lat' := DestinationLat,
          'destination_lng' := DestinationLng,
          'destination_name' := DestinationName,
          'notes' := Notes,
          'scheduled_arrival_time_ms' := ScheduledArrivalTimeMs,
          'scheduled_departure_time_ms' := ScheduledDepartureTimeMs
        }) ->
    #{ 'destination_address' => DestinationAddress,
       'destination_address_id' => DestinationAddressId,
       'destination_lat' => DestinationLat,
       'destination_lng' => DestinationLng,
       'destination_name' => DestinationName,
       'notes' => Notes,
       'scheduled_arrival_time_ms' => ScheduledArrivalTimeMs,
       'scheduled_departure_time_ms' => ScheduledDepartureTimeMs
     }.
