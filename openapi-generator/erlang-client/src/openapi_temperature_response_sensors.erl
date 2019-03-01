-module(openapi_temperature_response_sensors).

-export([encode/1]).

-export_type([openapi_temperature_response_sensors/0]).

-type openapi_temperature_response_sensors() ::
    #{ 'probeTemperature' => integer(),
       'name' => binary(),
       'id' => integer(),
       'ambientTemperature' => integer()
     }.

encode(#{ 'probeTemperature' := ProbeTemperature,
          'name' := Name,
          'id' := Id,
          'ambientTemperature' := AmbientTemperature
        }) ->
    #{ 'probeTemperature' => ProbeTemperature,
       'name' => Name,
       'id' => Id,
       'ambientTemperature' => AmbientTemperature
     }.
