-module(openapi_inline_object_22).

-export([encode/1]).

-export_type([openapi_inline_object_22/0]).

-type openapi_inline_object_22() ::
    #{ 'groupId' := integer(),
       'sensors' := list()
     }.

encode(#{ 'groupId' := GroupId,
          'sensors' := Sensors
        }) ->
    #{ 'groupId' => GroupId,
       'sensors' => Sensors
     }.
