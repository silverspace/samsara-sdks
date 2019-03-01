<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * List of harsh events
 */
class SafetyReportHarshEvent
{
    /**
     * Type of the harsh event
     * @DTA\Data(field="harshEventType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $harsh_event_type;
    /**
     * Timestamp that the harsh event occurred in Unix milliseconds since epoch
     * @DTA\Data(field="timestampMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $timestamp_ms;
    /**
     * Vehicle associated with the harsh event
     * @DTA\Data(field="vehicleId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $vehicle_id;
}
