<?php
/**
 * DriverSafetyScoreResponse
 */
namespace app\Models;

/**
 * DriverSafetyScoreResponse
 */
class DriverSafetyScoreResponse {

    /** @var int $crashCount Crash event count*/
    private $crashCount;

    /** @var int $driverId Driver ID*/
    private $driverId;

    /** @var int $harshAccelCount Harsh acceleration event count*/
    private $harshAccelCount;

    /** @var int $harshBrakingCount Harsh braking event count*/
    private $harshBrakingCount;

    /** @var \app\Models\SafetyReportHarshEvent[] $harshEvents */
    private $harshEvents;

    /** @var int $harshTurningCount Harsh turning event count*/
    private $harshTurningCount;

    /** @var int $safetyScore Safety Score*/
    private $safetyScore;

    /** @var string $safetyScoreRank Safety Score Rank*/
    private $safetyScoreRank;

    /** @var int $timeOverSpeedLimitMs Amount of time driven over the speed limit in milliseconds*/
    private $timeOverSpeedLimitMs;

    /** @var int $totalDistanceDrivenMeters Total distance driven in meters*/
    private $totalDistanceDrivenMeters;

    /** @var int $totalHarshEventCount Total harsh event count*/
    private $totalHarshEventCount;

    /** @var int $totalTimeDrivenMs Amount of time driven in milliseconds*/
    private $totalTimeDrivenMs;

}
