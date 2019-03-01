-module(openapi_inline_object_6).

-export([encode/1]).

-export_type([openapi_inline_object_6/0]).

-type openapi_inline_object_6() ::
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
