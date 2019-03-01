-module(openapi_trip_response_start_coordinates).

-include("openapi.hrl").

-export([openapi_trip_response_start_coordinates/0]).

-export([openapi_trip_response_start_coordinates/1]).

-export_type([openapi_trip_response_start_coordinates/0]).

-type openapi_trip_response_start_coordinates() ::
  [ {'latitude', float() }
  | {'longitude', float() }
  ].


openapi_trip_response_start_coordinates() ->
    openapi_trip_response_start_coordinates([]).

openapi_trip_response_start_coordinates(Fields) ->
  Default = [ {'latitude', float() }
            , {'longitude', float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

