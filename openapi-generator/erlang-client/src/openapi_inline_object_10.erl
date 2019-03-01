-module(openapi_inline_object_10).

-export([encode/1]).

-export_type([openapi_inline_object_10/0]).

-type openapi_inline_object_10() ::
    #{ 'groupId' := integer()
     }.

encode(#{ 'groupId' := GroupId
        }) ->
    #{ 'groupId' => GroupId
     }.
