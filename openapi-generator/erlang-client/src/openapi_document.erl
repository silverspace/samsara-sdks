-module(openapi_document).

-export([encode/1]).

-export_type([openapi_document/0]).

-type openapi_document() ::
    #{ 'dispatchJobId' => integer(),
       'notes' => binary(),
       'documentType' := binary(),
       'driverCreatedAtMs' := integer(),
       'driverId' := integer(),
       'fields' := list(),
       'vehicleId' => integer()
     }.

encode(#{ 'dispatchJobId' := DispatchJobId,
          'notes' := Notes,
          'documentType' := DocumentType,
          'driverCreatedAtMs' := DriverCreatedAtMs,
          'driverId' := DriverId,
          'fields' := Fields,
          'vehicleId' := VehicleId
        }) ->
    #{ 'dispatchJobId' => DispatchJobId,
       'notes' => Notes,
       'documentType' => DocumentType,
       'driverCreatedAtMs' => DriverCreatedAtMs,
       'driverId' => DriverId,
       'fields' => Fields,
       'vehicleId' => VehicleId
     }.
