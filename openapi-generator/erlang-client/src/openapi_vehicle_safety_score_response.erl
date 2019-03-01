-module(openapi_vehicle_safety_score_response).

-export([encode/1]).

-export_type([openapi_vehicle_safety_score_response/0]).

-type openapi_vehicle_safety_score_response() ::
    #{ 'crashCount' => integer(),
       'harshAccelCount' => integer(),
       'harshBrakingCount' => integer(),
       'harshEvents' => list(),
       'harshTurningCount' => integer(),
       'safetyScore' => integer(),
       'safetyScoreRank' => binary(),
       'timeOverSpeedLimitMs' => integer(),
       'totalDistanceDrivenMeters' => integer(),
       'totalHarshEventCount' => integer(),
       'totalTimeDrivenMs' => integer(),
       'vehicleId' => integer()
     }.

encode(#{ 'crashCount' := CrashCount,
          'harshAccelCount' := HarshAccelCount,
          'harshBrakingCount' := HarshBrakingCount,
          'harshEvents' := HarshEvents,
          'harshTurningCount' := HarshTurningCount,
          'safetyScore' := SafetyScore,
          'safetyScoreRank' := SafetyScoreRank,
          'timeOverSpeedLimitMs' := TimeOverSpeedLimitMs,
          'totalDistanceDrivenMeters' := TotalDistanceDrivenMeters,
          'totalHarshEventCount' := TotalHarshEventCount,
          'totalTimeDrivenMs' := TotalTimeDrivenMs,
          'vehicleId' := VehicleId
        }) ->
    #{ 'crashCount' => CrashCount,
       'harshAccelCount' => HarshAccelCount,
       'harshBrakingCount' => HarshBrakingCount,
       'harshEvents' => HarshEvents,
       'harshTurningCount' => HarshTurningCount,
       'safetyScore' => SafetyScore,
       'safetyScoreRank' => SafetyScoreRank,
       'timeOverSpeedLimitMs' => TimeOverSpeedLimitMs,
       'totalDistanceDrivenMeters' => TotalDistanceDrivenMeters,
       'totalHarshEventCount' => TotalHarshEventCount,
       'totalTimeDrivenMs' => TotalTimeDrivenMs,
       'vehicleId' => VehicleId
     }.
