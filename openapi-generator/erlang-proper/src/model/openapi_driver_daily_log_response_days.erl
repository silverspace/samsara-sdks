-module(openapi_driver_daily_log_response_days).

-include("openapi.hrl").

-export([openapi_driver_daily_log_response_days/0]).

-export([openapi_driver_daily_log_response_days/1]).

-export_type([openapi_driver_daily_log_response_days/0]).

-type openapi_driver_daily_log_response_days() ::
  [ {'certifiedAtMs', integer() }
  | {'endMs', integer() }
  | {'startMs', integer() }
  | {'trailerIds', map() }
  | {'activeHours', float() }
  | {'distanceMiles', float() }
  | {'activeMs', integer() }
  | {'certified', boolean() }
  | {'vehicleIds', map() }
  ].


openapi_driver_daily_log_response_days() ->
    openapi_driver_daily_log_response_days([]).

openapi_driver_daily_log_response_days(Fields) ->
  Default = [ {'certifiedAtMs', integer() }
            , {'endMs', integer() }
            , {'startMs', integer() }
            , {'trailerIds', map() }
            , {'activeHours', float() }
            , {'distanceMiles', float() }
            , {'activeMs', integer() }
            , {'certified', boolean() }
            , {'vehicleIds', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

