-module(openapi_temperature_response).

-export([encode/1]).

-export_type([openapi_temperature_response/0]).

-type openapi_temperature_response() ::
    #{ 'groupId' => integer(),
       'sensors' => list()
     }.

encode(#{ 'groupId' := GroupId,
          'sensors' := Sensors
        }) ->
    #{ 'groupId' => GroupId,
       'sensors' => Sensors
     }.
