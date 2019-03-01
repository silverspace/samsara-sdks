-module(openapi_vehicle_harsh_event_response).

-include("openapi.hrl").

-export([openapi_vehicle_harsh_event_response/0]).

-export([openapi_vehicle_harsh_event_response/1]).

-export_type([openapi_vehicle_harsh_event_response/0]).

-type openapi_vehicle_harsh_event_response() ::
  [ {'downloadForwardVideoUrl', binary() }
  | {'downloadInwardVideoUrl', binary() }
  | {'downloadTrackedInwardVideoUrl', binary() }
  | {'harshEventType', binary() }
  | {'incidentReportUrl', binary() }
  | {'isDistracted', boolean() }
  | {'location', openapi_vehicle_harsh_event_response_location:openapi_vehicle_harsh_event_response_location() }
  ].


openapi_vehicle_harsh_event_response() ->
    openapi_vehicle_harsh_event_response([]).

openapi_vehicle_harsh_event_response(Fields) ->
  Default = [ {'downloadForwardVideoUrl', binary() }
            , {'downloadInwardVideoUrl', binary() }
            , {'downloadTrackedInwardVideoUrl', binary() }
            , {'harshEventType', binary() }
            , {'incidentReportUrl', binary() }
            , {'isDistracted', boolean() }
            , {'location', openapi_vehicle_harsh_event_response_location:openapi_vehicle_harsh_event_response_location() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

