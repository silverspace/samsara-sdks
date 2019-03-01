-module(openapi_inline_object_2).

-export([encode/1]).

-export_type([openapi_inline_object_2/0]).

-type openapi_inline_object_2() ::
    #{ 'address' := binary(),
       'groupId' := integer(),
       'name' := binary(),
       'radius' := integer()
     }.

encode(#{ 'address' := Address,
          'groupId' := GroupId,
          'name' := Name,
          'radius' := Radius
        }) ->
    #{ 'address' => Address,
       'groupId' => GroupId,
       'name' => Name,
       'radius' => Radius
     }.
