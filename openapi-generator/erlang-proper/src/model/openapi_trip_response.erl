-module(openapi_trip_response).

-include("openapi.hrl").

-export([openapi_trip_response/0]).

-export([openapi_trip_response/1]).

-export_type([openapi_trip_response/0]).

-type openapi_trip_response() ::
  [ {'trips', list(openapi_trip_response_trips:openapi_trip_response_trips()) }
  ].


openapi_trip_response() ->
    openapi_trip_response([]).

openapi_trip_response(Fields) ->
  Default = [ {'trips', list(openapi_trip_response_trips:openapi_trip_response_trips()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

