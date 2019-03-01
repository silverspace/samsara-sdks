-module(openapi_door_response).

-export([encode/1]).

-export_type([openapi_door_response/0]).

-type openapi_door_response() ::
    #{ 'groupId' => integer(),
       'sensors' => list()
     }.

encode(#{ 'groupId' := GroupId,
          'sensors' := Sensors
        }) ->
    #{ 'groupId' => GroupId,
       'sensors' => Sensors
     }.
