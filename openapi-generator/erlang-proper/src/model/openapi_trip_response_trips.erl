-module(openapi_trip_response_trips).

-include("openapi.hrl").

-export([openapi_trip_response_trips/0]).

-export([openapi_trip_response_trips/1]).

-export_type([openapi_trip_response_trips/0]).

-type openapi_trip_response_trips() ::
  [ {'endOdometer', integer() }
  | {'distanceMeters', integer() }
  | {'endMs', integer() }
  | {'startMs', integer() }
  | {'fuelConsumedMl', integer() }
  | {'startAddress', binary() }
  | {'startCoordinates', openapi_trip_response_start_coordinates:openapi_trip_response_start_coordinates() }
  | {'endCoordinates', openapi_trip_response_end_coordinates:openapi_trip_response_end_coordinates() }
  | {'startOdometer', integer() }
  | {'driverId', integer() }
  | {'startLocation', binary() }
  | {'tollMeters', integer() }
  | {'endAddress', binary() }
  | {'endLocation', binary() }
  ].


openapi_trip_response_trips() ->
    openapi_trip_response_trips([]).

openapi_trip_response_trips(Fields) ->
  Default = [ {'endOdometer', integer() }
            , {'distanceMeters', integer() }
            , {'endMs', integer() }
            , {'startMs', integer() }
            , {'fuelConsumedMl', integer() }
            , {'startAddress', binary() }
            , {'startCoordinates', openapi_trip_response_start_coordinates:openapi_trip_response_start_coordinates() }
            , {'endCoordinates', openapi_trip_response_end_coordinates:openapi_trip_response_end_coordinates() }
            , {'startOdometer', integer() }
            , {'driverId', integer() }
            , {'startLocation', binary() }
            , {'tollMeters', integer() }
            , {'endAddress', binary() }
            , {'endLocation', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

