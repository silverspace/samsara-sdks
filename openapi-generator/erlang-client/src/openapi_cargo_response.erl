-module(openapi_cargo_response).

-export([encode/1]).

-export_type([openapi_cargo_response/0]).

-type openapi_cargo_response() ::
    #{ 'groupId' => integer(),
       'sensors' => list()
     }.

encode(#{ 'groupId' := GroupId,
          'sensors' := Sensors
        }) ->
    #{ 'groupId' => GroupId,
       'sensors' => Sensors
     }.
