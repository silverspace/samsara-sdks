-module(openapi_inline_object_11).

-export([encode/1]).

-export_type([openapi_inline_object_11/0]).

-type openapi_inline_object_11() ::
    #{ 'groupId' := integer()
     }.

encode(#{ 'groupId' := GroupId
        }) ->
    #{ 'groupId' => GroupId
     }.
