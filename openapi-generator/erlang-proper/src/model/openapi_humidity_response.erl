-module(openapi_humidity_response).

-include("openapi.hrl").

-export([openapi_humidity_response/0]).

-export([openapi_humidity_response/1]).

-export_type([openapi_humidity_response/0]).

-type openapi_humidity_response() ::
  [ {'groupId', integer() }
  | {'sensors', list(openapi_humidity_response_sensors:openapi_humidity_response_sensors()) }
  ].


openapi_humidity_response() ->
    openapi_humidity_response([]).

openapi_humidity_response(Fields) ->
  Default = [ {'groupId', integer() }
            , {'sensors', list(openapi_humidity_response_sensors:openapi_humidity_response_sensors()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

