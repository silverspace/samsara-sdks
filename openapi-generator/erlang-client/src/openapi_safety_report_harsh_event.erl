-module(openapi_safety_report_harsh_event).

-export([encode/1]).

-export_type([openapi_safety_report_harsh_event/0]).

-type openapi_safety_report_harsh_event() ::
    #{ 'harshEventType' => binary(),
       'timestampMs' => integer(),
       'vehicleId' => integer()
     }.

encode(#{ 'harshEventType' := HarshEventType,
          'timestampMs' := TimestampMs,
          'vehicleId' := VehicleId
        }) ->
    #{ 'harshEventType' => HarshEventType,
       'timestampMs' => TimestampMs,
       'vehicleId' => VehicleId
     }.
