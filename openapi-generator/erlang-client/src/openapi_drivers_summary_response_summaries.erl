-module(openapi_drivers_summary_response_summaries).

-export([encode/1]).

-export_type([openapi_drivers_summary_response_summaries/0]).

-type openapi_drivers_summary_response_summaries() ::
    #{ 'driverId' => integer(),
       'distanceMiles' => float(),
       'driveMs' => integer(),
       'activeMs' => integer(),
       'driverUsername' => binary(),
       'groupId' => integer(),
       'driverName' => binary(),
       'onDutyMs' => integer()
     }.

encode(#{ 'driverId' := DriverId,
          'distanceMiles' := DistanceMiles,
          'driveMs' := DriveMs,
          'activeMs' := ActiveMs,
          'driverUsername' := DriverUsername,
          'groupId' := GroupId,
          'driverName' := DriverName,
          'onDutyMs' := OnDutyMs
        }) ->
    #{ 'driverId' => DriverId,
       'distanceMiles' => DistanceMiles,
       'driveMs' => DriveMs,
       'activeMs' => ActiveMs,
       'driverUsername' => DriverUsername,
       'groupId' => GroupId,
       'driverName' => DriverName,
       'onDutyMs' => OnDutyMs
     }.
