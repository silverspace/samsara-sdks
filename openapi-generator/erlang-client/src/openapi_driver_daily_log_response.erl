-module(openapi_driver_daily_log_response).

-export([encode/1]).

-export_type([openapi_driver_daily_log_response/0]).

-type openapi_driver_daily_log_response() ::
    #{ 'days' => list()
     }.

encode(#{ 'days' := Days
        }) ->
    #{ 'days' => Days
     }.
