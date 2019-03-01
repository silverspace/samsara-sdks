-module(openapi_inline_object_3).

-export([encode/1]).

-export_type([openapi_inline_object_3/0]).

-type openapi_inline_object_3() ::
    #{ 'groupId' := integer()
     }.

encode(#{ 'groupId' := GroupId
        }) ->
    #{ 'groupId' => GroupId
     }.
