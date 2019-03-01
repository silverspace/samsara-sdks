-module(openapi_inline_object_18).

-export([encode/1]).

-export_type([openapi_inline_object_18/0]).

-type openapi_inline_object_18() ::
    #{ 'groupId' := integer()
     }.

encode(#{ 'groupId' := GroupId
        }) ->
    #{ 'groupId' => GroupId
     }.
