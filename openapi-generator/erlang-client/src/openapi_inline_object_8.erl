-module(openapi_inline_object_8).

-export([encode/1]).

-export_type([openapi_inline_object_8/0]).

-type openapi_inline_object_8() ::
    #{ 'driverId' := integer(),
       'endMs' := integer(),
       'groupId' := integer(),
       'startMs' := integer()
     }.

encode(#{ 'driverId' := DriverId,
          'endMs' := EndMs,
          'groupId' := GroupId,
          'startMs' := StartMs
        }) ->
    #{ 'driverId' => DriverId,
       'endMs' => EndMs,
       'groupId' => GroupId,
       'startMs' => StartMs
     }.
