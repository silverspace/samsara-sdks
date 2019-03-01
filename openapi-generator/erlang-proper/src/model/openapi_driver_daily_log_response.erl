-module(openapi_driver_daily_log_response).

-include("openapi.hrl").

-export([openapi_driver_daily_log_response/0]).

-export([openapi_driver_daily_log_response/1]).

-export_type([openapi_driver_daily_log_response/0]).

-type openapi_driver_daily_log_response() ::
  [ {'days', list(openapi_driver_daily_log_response_days:openapi_driver_daily_log_response_days()) }
  ].


openapi_driver_daily_log_response() ->
    openapi_driver_daily_log_response([]).

openapi_driver_daily_log_response(Fields) ->
  Default = [ {'days', list(openapi_driver_daily_log_response_days:openapi_driver_daily_log_response_days()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

