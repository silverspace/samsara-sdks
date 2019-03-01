-module(openapi_sensor).

-include("openapi.hrl").

-export([openapi_sensor/0]).

-export([openapi_sensor/1]).

-export_type([openapi_sensor/0]).

-type openapi_sensor() ::
  [ {'id', integer() }
  | {'macAddress', binary() }
  | {'name', binary() }
  ].


openapi_sensor() ->
    openapi_sensor([]).

openapi_sensor(Fields) ->
  Default = [ {'id', integer() }
            , {'macAddress', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

