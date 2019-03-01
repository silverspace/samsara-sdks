-module(openapi_data_input_history_response).

-export([encode/1]).

-export_type([openapi_data_input_history_response/0]).

-type openapi_data_input_history_response() ::
    #{ 'id' => integer(),
       'name' := binary(),
       'points' => list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'points' := Points
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'points' => Points
     }.
