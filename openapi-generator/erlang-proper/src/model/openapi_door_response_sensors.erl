-module(openapi_door_response_sensors).

-include("openapi.hrl").

-export([openapi_door_response_sensors/0]).

-export([openapi_door_response_sensors/1]).

-export_type([openapi_door_response_sensors/0]).

-type openapi_door_response_sensors() ::
  [ {'doorClosed', boolean() }
  | {'name', binary() }
  | {'id', integer() }
  ].


openapi_door_response_sensors() ->
    openapi_door_response_sensors([]).

openapi_door_response_sensors(Fields) ->
  Default = [ {'doorClosed', boolean() }
            , {'name', binary() }
            , {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

