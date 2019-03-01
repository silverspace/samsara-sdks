-module(openapi_cargo_response).

-include("openapi.hrl").

-export([openapi_cargo_response/0]).

-export([openapi_cargo_response/1]).

-export_type([openapi_cargo_response/0]).

-type openapi_cargo_response() ::
  [ {'groupId', integer() }
  | {'sensors', list(openapi_cargo_response_sensors:openapi_cargo_response_sensors()) }
  ].


openapi_cargo_response() ->
    openapi_cargo_response([]).

openapi_cargo_response(Fields) ->
  Default = [ {'groupId', integer() }
            , {'sensors', list(openapi_cargo_response_sensors:openapi_cargo_response_sensors()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

