-module(openapi_hos_logs_response).

-export([encode/1]).

-export_type([openapi_hos_logs_response/0]).

-type openapi_hos_logs_response() ::
    #{ 'logs' => list()
     }.

encode(#{ 'logs' := Logs
        }) ->
    #{ 'logs' => Logs
     }.
