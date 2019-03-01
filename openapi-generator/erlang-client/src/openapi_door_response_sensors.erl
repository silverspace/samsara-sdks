-module(openapi_door_response_sensors).

-export([encode/1]).

-export_type([openapi_door_response_sensors/0]).

-type openapi_door_response_sensors() ::
    #{ 'doorClosed' => boolean(),
       'name' => binary(),
       'id' => integer()
     }.

encode(#{ 'doorClosed' := DoorClosed,
          'name' := Name,
          'id' := Id
        }) ->
    #{ 'doorClosed' => DoorClosed,
       'name' => Name,
       'id' => Id
     }.
