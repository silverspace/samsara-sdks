-module(openapi_humidity_response).

-export([encode/1]).

-export_type([openapi_humidity_response/0]).

-type openapi_humidity_response() ::
    #{ 'groupId' => integer(),
       'sensors' => list()
     }.

encode(#{ 'groupId' := GroupId,
          'sensors' := Sensors
        }) ->
    #{ 'groupId' => GroupId,
       'sensors' => Sensors
     }.
