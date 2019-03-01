-module(openapi_sensor).

-export([encode/1]).

-export_type([openapi_sensor/0]).

-type openapi_sensor() ::
    #{ 'id' := integer(),
       'macAddress' => binary(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'macAddress' := MacAddress,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'macAddress' => MacAddress,
       'name' => Name
     }.
