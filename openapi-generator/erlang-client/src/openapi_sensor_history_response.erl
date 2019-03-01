-module(openapi_sensor_history_response).

-export([encode/1]).

-export_type([openapi_sensor_history_response/0]).

-type openapi_sensor_history_response() ::
    #{ 'results' => list()
     }.

encode(#{ 'results' := Results
        }) ->
    #{ 'results' => Results
     }.
