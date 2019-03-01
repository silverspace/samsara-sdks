<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Safety score details for a driver
 */
class DriverSafetyScoreResponse
{
    /**
     * Crash event count
     * @DTA\Data(field="crashCount", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $crash_count;
    /**
     * Driver ID
     * @DTA\Data(field="driverId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * Harsh acceleration event count
     * @DTA\Data(field="harshAccelCount", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $harsh_accel_count;
    /**
     * Harsh braking event count
     * @DTA\Data(field="harshBrakingCount", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $harsh_braking_count;
    /**
     * @DTA\Data(field="harshEvents", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\SafetyReportHarshEvent::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\SafetyReportHarshEvent::class}}
     * }})
     * @var \App\DTO\SafetyReportHarshEvent[]
     */
    public $harsh_events;
    /**
     * Harsh turning event count
     * @DTA\Data(field="harshTurningCount", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $harsh_turning_count;
    /**
     * Safety Score
     * @DTA\Data(field="safetyScore", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $safety_score;
    /**
     * Safety Score Rank
     * @DTA\Data(field="safetyScoreRank", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $safety_score_rank;
    /**
     * Amount of time driven over the speed limit in milliseconds
     * @DTA\Data(field="timeOverSpeedLimitMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $time_over_speed_limit_ms;
    /**
     * Total distance driven in meters
     * @DTA\Data(field="totalDistanceDrivenMeters", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $total_distance_driven_meters;
    /**
     * Total harsh event count
     * @DTA\Data(field="totalHarshEventCount", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $total_harsh_event_count;
    /**
     * Amount of time driven in milliseconds
     * @DTA\Data(field="totalTimeDrivenMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $total_time_driven_ms;
}
