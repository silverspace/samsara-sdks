-module(openapi_door_response).

-include("openapi.hrl").

-export([openapi_door_response/0]).

-export([openapi_door_response/1]).

-export_type([openapi_door_response/0]).

-type openapi_door_response() ::
  [ {'groupId', integer() }
  | {'sensors', list(openapi_door_response_sensors:openapi_door_response_sensors()) }
  ].


openapi_door_response() ->
    openapi_door_response([]).

openapi_door_response(Fields) ->
  Default = [ {'groupId', integer() }
            , {'sensors', list(openapi_door_response_sensors:openapi_door_response_sensors()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

