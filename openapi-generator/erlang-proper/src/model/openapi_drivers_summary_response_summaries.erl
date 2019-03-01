-module(openapi_drivers_summary_response_summaries).

-include("openapi.hrl").

-export([openapi_drivers_summary_response_summaries/0]).

-export([openapi_drivers_summary_response_summaries/1]).

-export_type([openapi_drivers_summary_response_summaries/0]).

-type openapi_drivers_summary_response_summaries() ::
  [ {'driverId', integer() }
  | {'distanceMiles', float() }
  | {'driveMs', integer() }
  | {'activeMs', integer() }
  | {'driverUsername', binary() }
  | {'groupId', integer() }
  | {'driverName', binary() }
  | {'onDutyMs', integer() }
  ].


openapi_drivers_summary_response_summaries() ->
    openapi_drivers_summary_response_summaries([]).

openapi_drivers_summary_response_summaries(Fields) ->
  Default = [ {'driverId', integer() }
            , {'distanceMiles', float() }
            , {'driveMs', integer() }
            , {'activeMs', integer() }
            , {'driverUsername', binary() }
            , {'groupId', integer() }
            , {'driverName', binary() }
            , {'onDutyMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

