-module(openapi_hos_logs_summary_response).

-export([encode/1]).

-export_type([openapi_hos_logs_summary_response/0]).

-type openapi_hos_logs_summary_response() ::
    #{ 'drivers' => list()
     }.

encode(#{ 'drivers' := Drivers
        }) ->
    #{ 'drivers' => Drivers
     }.
