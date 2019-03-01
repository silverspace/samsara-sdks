-module(openapi_sensor_history_response_results).

-export([encode/1]).

-export_type([openapi_sensor_history_response_results/0]).

-type openapi_sensor_history_response_results() ::
    #{ 'series' => list(),
       'timeMs' => integer()
     }.

encode(#{ 'series' := Series,
          'timeMs' := TimeMs
        }) ->
    #{ 'series' => Series,
       'timeMs' => TimeMs
     }.
