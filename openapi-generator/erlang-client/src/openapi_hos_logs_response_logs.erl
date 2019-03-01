-module(openapi_hos_logs_response_logs).

-export([encode/1]).

-export_type([openapi_hos_logs_response_logs/0]).

-type openapi_hos_logs_response_logs() ::
    #{ 'locLng' => float(),
       'logStartMs' => integer(),
       'driverId' => integer(),
       'statusType' => binary(),
       'locCity' => binary(),
       'groupId' => integer(),
       'locName' => binary(),
       'locLat' => float(),
       'remark' => binary(),
       'locState' => binary(),
       'vehicleId' => integer(),
       'codriverIds' => list()
     }.

encode(#{ 'locLng' := LocLng,
          'logStartMs' := LogStartMs,
          'driverId' := DriverId,
          'statusType' := StatusType,
          'locCity' := LocCity,
          'groupId' := GroupId,
          'locName' := LocName,
          'locLat' := LocLat,
          'remark' := Remark,
          'locState' := LocState,
          'vehicleId' := VehicleId,
          'codriverIds' := CodriverIds
        }) ->
    #{ 'locLng' => LocLng,
       'logStartMs' => LogStartMs,
       'driverId' => DriverId,
       'statusType' => StatusType,
       'locCity' => LocCity,
       'groupId' => GroupId,
       'locName' => LocName,
       'locLat' => LocLat,
       'remark' => Remark,
       'locState' => LocState,
       'vehicleId' => VehicleId,
       'codriverIds' => CodriverIds
     }.
