-module(openapi_inline_object_9).

-export([encode/1]).

-export_type([openapi_inline_object_9/0]).

-type openapi_inline_object_9() ::
    #{ 'groupId' := integer()
     }.

encode(#{ 'groupId' := GroupId
        }) ->
    #{ 'groupId' => GroupId
     }.
