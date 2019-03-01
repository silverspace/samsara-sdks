-module(openapi_job_status).

-export([encode/1]).

-export_type([openapi_job_status/0]).

-type openapi_job_status() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
