-module(openapi_safety_report_harsh_event).

-include("openapi.hrl").

-export([openapi_safety_report_harsh_event/0]).

-export([openapi_safety_report_harsh_event/1]).

-export_type([openapi_safety_report_harsh_event/0]).

-type openapi_safety_report_harsh_event() ::
  [ {'harshEventType', binary() }
  | {'timestampMs', integer() }
  | {'vehicleId', integer() }
  ].


openapi_safety_report_harsh_event() ->
    openapi_safety_report_harsh_event([]).

openapi_safety_report_harsh_event(Fields) ->
  Default = [ {'harshEventType', binary() }
            , {'timestampMs', integer() }
            , {'vehicleId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

