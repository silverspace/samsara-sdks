-module(openapi_humidity_response_sensors).

-include("openapi.hrl").

-export([openapi_humidity_response_sensors/0]).

-export([openapi_humidity_response_sensors/1]).

-export_type([openapi_humidity_response_sensors/0]).

-type openapi_humidity_response_sensors() ::
  [ {'name', binary() }
  | {'humidity', integer() }
  | {'id', integer() }
  ].


openapi_humidity_response_sensors() ->
    openapi_humidity_response_sensors([]).

openapi_humidity_response_sensors(Fields) ->
  Default = [ {'name', binary() }
            , {'humidity', integer() }
            , {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

