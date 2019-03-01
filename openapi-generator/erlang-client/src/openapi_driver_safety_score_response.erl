-module(openapi_driver_safety_score_response).

-export([encode/1]).

-export_type([openapi_driver_safety_score_response/0]).

-type openapi_driver_safety_score_response() ::
    #{ 'crashCount' => integer(),
       'driverId' => integer(),
       'harshAccelCount' => integer(),
       'harshBrakingCount' => integer(),
       'harshEvents' => list(),
       'harshTurningCount' => integer(),
       'safetyScore' => integer(),
       'safetyScoreRank' => binary(),
       'timeOverSpeedLimitMs' => integer(),
       'totalDistanceDrivenMeters' => integer(),
       'totalHarshEventCount' => integer(),
       'totalTimeDrivenMs' => integer()
     }.

encode(#{ 'crashCount' := CrashCount,
          'driverId' := DriverId,
          'harshAccelCount' := HarshAccelCount,
          'harshBrakingCount' := HarshBrakingCount,
          'harshEvents' := HarshEvents,
          'harshTurningCount' := HarshTurningCount,
          'safetyScore' := SafetyScore,
          'safetyScoreRank' := SafetyScoreRank,
          'timeOverSpeedLimitMs' := TimeOverSpeedLimitMs,
          'totalDistanceDrivenMeters' := TotalDistanceDrivenMeters,
          'totalHarshEventCount' := TotalHarshEventCount,
          'totalTimeDrivenMs' := TotalTimeDrivenMs
        }) ->
    #{ 'crashCount' => CrashCount,
       'driverId' => DriverId,
       'harshAccelCount' => HarshAccelCount,
       'harshBrakingCount' => HarshBrakingCount,
       'harshEvents' => HarshEvents,
       'harshTurningCount' => HarshTurningCount,
       'safetyScore' => SafetyScore,
       'safetyScoreRank' => SafetyScoreRank,
       'timeOverSpeedLimitMs' => TimeOverSpeedLimitMs,
       'totalDistanceDrivenMeters' => TotalDistanceDrivenMeters,
       'totalHarshEventCount' => TotalHarshEventCount,
       'totalTimeDrivenMs' => TotalTimeDrivenMs
     }.
