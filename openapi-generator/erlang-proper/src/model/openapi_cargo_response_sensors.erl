-module(openapi_cargo_response_sensors).

-include("openapi.hrl").

-export([openapi_cargo_response_sensors/0]).

-export([openapi_cargo_response_sensors/1]).

-export_type([openapi_cargo_response_sensors/0]).

-type openapi_cargo_response_sensors() ::
  [ {'cargoEmpty', boolean() }
  | {'name', binary() }
  | {'id', integer() }
  ].


openapi_cargo_response_sensors() ->
    openapi_cargo_response_sensors([]).

openapi_cargo_response_sensors(Fields) ->
  Default = [ {'cargoEmpty', boolean() }
            , {'name', binary() }
            , {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

