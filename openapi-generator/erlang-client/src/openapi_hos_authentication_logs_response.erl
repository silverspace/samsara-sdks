-module(openapi_hos_authentication_logs_response).

-export([encode/1]).

-export_type([openapi_hos_authentication_logs_response/0]).

-type openapi_hos_authentication_logs_response() ::
    #{ 'authenticationLogs' => list()
     }.

encode(#{ 'authenticationLogs' := AuthenticationLogs
        }) ->
    #{ 'authenticationLogs' => AuthenticationLogs
     }.
