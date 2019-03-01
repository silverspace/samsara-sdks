-module(openapi_inline_object_13).

-export([encode/1]).

-export_type([openapi_inline_object_13/0]).

-type openapi_inline_object_13() ::
    #{ 'groupId' := integer()
     }.

encode(#{ 'groupId' := GroupId
        }) ->
    #{ 'groupId' => GroupId
     }.
