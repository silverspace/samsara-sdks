-module(openapi_temperature_response_sensors).

-include("openapi.hrl").

-export([openapi_temperature_response_sensors/0]).

-export([openapi_temperature_response_sensors/1]).

-export_type([openapi_temperature_response_sensors/0]).

-type openapi_temperature_response_sensors() ::
  [ {'probeTemperature', integer() }
  | {'name', binary() }
  | {'id', integer() }
  | {'ambientTemperature', integer() }
  ].


openapi_temperature_response_sensors() ->
    openapi_temperature_response_sensors([]).

openapi_temperature_response_sensors(Fields) ->
  Default = [ {'probeTemperature', integer() }
            , {'name', binary() }
            , {'id', integer() }
            , {'ambientTemperature', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

