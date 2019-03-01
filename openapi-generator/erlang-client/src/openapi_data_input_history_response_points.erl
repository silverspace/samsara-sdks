-module(openapi_data_input_history_response_points).

-export([encode/1]).

-export_type([openapi_data_input_history_response_points/0]).

-type openapi_data_input_history_response_points() ::
    #{ 'value' => float(),
       'timeMs' => integer()
     }.

encode(#{ 'value' := Value,
          'timeMs' := TimeMs
        }) ->
    #{ 'value' => Value,
       'timeMs' => TimeMs
     }.
