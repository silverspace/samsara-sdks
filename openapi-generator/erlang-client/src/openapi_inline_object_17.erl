-module(openapi_inline_object_17).

-export([encode/1]).

-export_type([openapi_inline_object_17/0]).

-type openapi_inline_object_17() ::
    #{ 'endMs' := integer(),
       'groupId' := integer(),
       'startMs' := integer()
     }.

encode(#{ 'endMs' := EndMs,
          'groupId' := GroupId,
          'startMs' := StartMs
        }) ->
    #{ 'endMs' => EndMs,
       'groupId' => GroupId,
       'startMs' => StartMs
     }.
