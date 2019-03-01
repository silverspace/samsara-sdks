-module(openapi_hos_logs_summary_response_drivers).

-export([encode/1]).

-export_type([openapi_hos_logs_summary_response_drivers/0]).

-type openapi_hos_logs_summary_response_drivers() ::
    #{ 'timeUntilBreak' => integer(),
       'vehicleName' => binary(),
       'drivingInViolationToday' => integer(),
       'driverId' => integer(),
       'cycleRemaining' => integer(),
       'driverName' => binary(),
       'dutyStatus' => binary(),
       'cycleTomorrow' => integer(),
       'shiftDriveRemaining' => integer(),
       'timeInCurrentStatus' => integer(),
       'drivingInViolationCycle' => integer(),
       'shiftRemaining' => integer()
     }.

encode(#{ 'timeUntilBreak' := TimeUntilBreak,
          'vehicleName' := VehicleName,
          'drivingInViolationToday' := DrivingInViolationToday,
          'driverId' := DriverId,
          'cycleRemaining' := CycleRemaining,
          'driverName' := DriverName,
          'dutyStatus' := DutyStatus,
          'cycleTomorrow' := CycleTomorrow,
          'shiftDriveRemaining' := ShiftDriveRemaining,
          'timeInCurrentStatus' := TimeInCurrentStatus,
          'drivingInViolationCycle' := DrivingInViolationCycle,
          'shiftRemaining' := ShiftRemaining
        }) ->
    #{ 'timeUntilBreak' => TimeUntilBreak,
       'vehicleName' => VehicleName,
       'drivingInViolationToday' => DrivingInViolationToday,
       'driverId' => DriverId,
       'cycleRemaining' => CycleRemaining,
       'driverName' => DriverName,
       'dutyStatus' => DutyStatus,
       'cycleTomorrow' => CycleTomorrow,
       'shiftDriveRemaining' => ShiftDriveRemaining,
       'timeInCurrentStatus' => TimeInCurrentStatus,
       'drivingInViolationCycle' => DrivingInViolationCycle,
       'shiftRemaining' => ShiftRemaining
     }.
