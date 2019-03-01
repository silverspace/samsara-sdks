-module(openapi_temperature_response).

-include("openapi.hrl").

-export([openapi_temperature_response/0]).

-export([openapi_temperature_response/1]).

-export_type([openapi_temperature_response/0]).

-type openapi_temperature_response() ::
  [ {'groupId', integer() }
  | {'sensors', list(openapi_temperature_response_sensors:openapi_temperature_response_sensors()) }
  ].


openapi_temperature_response() ->
    openapi_temperature_response([]).

openapi_temperature_response(Fields) ->
  Default = [ {'groupId', integer() }
            , {'sensors', list(openapi_temperature_response_sensors:openapi_temperature_response_sensors()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

