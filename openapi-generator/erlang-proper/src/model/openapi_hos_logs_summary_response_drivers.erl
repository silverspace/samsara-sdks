-module(openapi_hos_logs_summary_response_drivers).

-include("openapi.hrl").

-export([openapi_hos_logs_summary_response_drivers/0]).

-export([openapi_hos_logs_summary_response_drivers/1]).

-export_type([openapi_hos_logs_summary_response_drivers/0]).

-type openapi_hos_logs_summary_response_drivers() ::
  [ {'timeUntilBreak', integer() }
  | {'vehicleName', binary() }
  | {'drivingInViolationToday', integer() }
  | {'driverId', integer() }
  | {'cycleRemaining', integer() }
  | {'driverName', binary() }
  | {'dutyStatus', binary() }
  | {'cycleTomorrow', integer() }
  | {'shiftDriveRemaining', integer() }
  | {'timeInCurrentStatus', integer() }
  | {'drivingInViolationCycle', integer() }
  | {'shiftRemaining', integer() }
  ].


openapi_hos_logs_summary_response_drivers() ->
    openapi_hos_logs_summary_response_drivers([]).

openapi_hos_logs_summary_response_drivers(Fields) ->
  Default = [ {'timeUntilBreak', integer() }
            , {'vehicleName', binary() }
            , {'drivingInViolationToday', integer() }
            , {'driverId', integer() }
            , {'cycleRemaining', integer() }
            , {'driverName', binary() }
            , {'dutyStatus', binary() }
            , {'cycleTomorrow', integer() }
            , {'shiftDriveRemaining', integer() }
            , {'timeInCurrentStatus', integer() }
            , {'drivingInViolationCycle', integer() }
            , {'shiftRemaining', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

