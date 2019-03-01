-module(openapi_inline_object_14).

-export([encode/1]).

-export_type([openapi_inline_object_14/0]).

-type openapi_inline_object_14() ::
    #{ 'groupId' := integer(),
       'vehicles' := list()
     }.

encode(#{ 'groupId' := GroupId,
          'vehicles' := Vehicles
        }) ->
    #{ 'groupId' => GroupId,
       'vehicles' => Vehicles
     }.
