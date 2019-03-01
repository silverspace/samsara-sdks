-module(openapi_tagged_sensor_base).

-export([encode/1]).

-export_type([openapi_tagged_sensor_base/0]).

-type openapi_tagged_sensor_base() ::
    #{ 'id' := integer()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
