-module(openapi_inline_object_21).

-export([encode/1]).

-export_type([openapi_inline_object_21/0]).

-type openapi_inline_object_21() ::
    #{ 'endMs' := integer(),
       'fillMissing' => binary(),
       'groupId' := integer(),
       'series' := list(),
       'startMs' := integer(),
       'stepMs' := integer()
     }.

encode(#{ 'endMs' := EndMs,
          'fillMissing' := FillMissing,
          'groupId' := GroupId,
          'series' := Series,
          'startMs' := StartMs,
          'stepMs' := StepMs
        }) ->
    #{ 'endMs' => EndMs,
       'fillMissing' => FillMissing,
       'groupId' => GroupId,
       'series' => Series,
       'startMs' => StartMs,
       'stepMs' => StepMs
     }.
