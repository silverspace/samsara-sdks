-module(openapi_humidity_response_sensors).

-export([encode/1]).

-export_type([openapi_humidity_response_sensors/0]).

-type openapi_humidity_response_sensors() ::
    #{ 'name' => binary(),
       'humidity' => integer(),
       'id' => integer()
     }.

encode(#{ 'name' := Name,
          'humidity' := Humidity,
          'id' := Id
        }) ->
    #{ 'name' => Name,
       'humidity' => Humidity,
       'id' => Id
     }.
