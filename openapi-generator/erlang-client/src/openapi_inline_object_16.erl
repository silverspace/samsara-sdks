-module(openapi_inline_object_16).

-export([encode/1]).

-export_type([openapi_inline_object_16/0]).

-type openapi_inline_object_16() ::
    #{ 'externalIds' => maps:map(),
       'harsh_accel_setting' => integer(),
       'name' => binary()
     }.

encode(#{ 'externalIds' := ExternalIds,
          'harsh_accel_setting' := HarshAccelSetting,
          'name' := Name
        }) ->
    #{ 'externalIds' => ExternalIds,
       'harsh_accel_setting' => HarshAccelSetting,
       'name' => Name
     }.
