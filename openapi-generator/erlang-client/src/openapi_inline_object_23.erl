-module(openapi_inline_object_23).

-export([encode/1]).

-export_type([openapi_inline_object_23/0]).

-type openapi_inline_object_23() ::
    #{ 'groupId' := integer()
     }.

encode(#{ 'groupId' := GroupId
        }) ->
    #{ 'groupId' => GroupId
     }.
