-module(openapi_vehicle_safety_score_response).

-include("openapi.hrl").

-export([openapi_vehicle_safety_score_response/0]).

-export([openapi_vehicle_safety_score_response/1]).

-export_type([openapi_vehicle_safety_score_response/0]).

-type openapi_vehicle_safety_score_response() ::
  [ {'crashCount', integer() }
  | {'harshAccelCount', integer() }
  | {'harshBrakingCount', integer() }
  | {'harshEvents', list(openapi_safety_report_harsh_event:openapi_safety_report_harsh_event()) }
  | {'harshTurningCount', integer() }
  | {'safetyScore', integer() }
  | {'safetyScoreRank', binary() }
  | {'timeOverSpeedLimitMs', integer() }
  | {'totalDistanceDrivenMeters', integer() }
  | {'totalHarshEventCount', integer() }
  | {'totalTimeDrivenMs', integer() }
  | {'vehicleId', integer() }
  ].


openapi_vehicle_safety_score_response() ->
    openapi_vehicle_safety_score_response([]).

openapi_vehicle_safety_score_response(Fields) ->
  Default = [ {'crashCount', integer() }
            , {'harshAccelCount', integer() }
            , {'harshBrakingCount', integer() }
            , {'harshEvents', list(openapi_safety_report_harsh_event:openapi_safety_report_harsh_event()) }
            , {'harshTurningCount', integer() }
            , {'safetyScore', integer() }
            , {'safetyScoreRank', binary() }
            , {'timeOverSpeedLimitMs', integer() }
            , {'totalDistanceDrivenMeters', integer() }
            , {'totalHarshEventCount', integer() }
            , {'totalTimeDrivenMs', integer() }
            , {'vehicleId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

