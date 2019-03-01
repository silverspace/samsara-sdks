-module(openapi_inline_object_20).

-export([encode/1]).

-export_type([openapi_inline_object_20/0]).

-type openapi_inline_object_20() ::
    #{ 'groupId' := integer(),
       'sensors' := list()
     }.

encode(#{ 'groupId' := GroupId,
          'sensors' := Sensors
        }) ->
    #{ 'groupId' => GroupId,
       'sensors' => Sensors
     }.
