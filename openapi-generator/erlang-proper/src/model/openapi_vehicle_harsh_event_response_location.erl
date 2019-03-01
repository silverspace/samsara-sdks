-module(openapi_vehicle_harsh_event_response_location).

-include("openapi.hrl").

-export([openapi_vehicle_harsh_event_response_location/0]).

-export([openapi_vehicle_harsh_event_response_location/1]).

-export_type([openapi_vehicle_harsh_event_response_location/0]).

-type openapi_vehicle_harsh_event_response_location() ::
  [ {'address', binary() }
  | {'latitude', binary() }
  | {'longitude', binary() }
  ].


openapi_vehicle_harsh_event_response_location() ->
    openapi_vehicle_harsh_event_response_location([]).

openapi_vehicle_harsh_event_response_location(Fields) ->
  Default = [ {'address', binary() }
            , {'latitude', binary() }
            , {'longitude', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

