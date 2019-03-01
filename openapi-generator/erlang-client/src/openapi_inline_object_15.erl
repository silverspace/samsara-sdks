-module(openapi_inline_object_15).

-export([encode/1]).

-export_type([openapi_inline_object_15/0]).

-type openapi_inline_object_15() ::
    #{ 'endMs' := integer(),
       'groupId' := integer(),
       'startMs' := integer(),
       'vehicleId' := integer()
     }.

encode(#{ 'endMs' := EndMs,
          'groupId' := GroupId,
          'startMs' := StartMs,
          'vehicleId' := VehicleId
        }) ->
    #{ 'endMs' => EndMs,
       'groupId' => GroupId,
       'startMs' => StartMs,
       'vehicleId' => VehicleId
     }.
