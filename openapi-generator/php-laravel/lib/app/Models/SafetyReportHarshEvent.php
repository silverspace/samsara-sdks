<?php
/**
 * SafetyReportHarshEvent
 */
namespace app\Models;

/**
 * SafetyReportHarshEvent
 */
class SafetyReportHarshEvent {

    /** @var string $harshEventType Type of the harsh event*/
    private $harshEventType;

    /** @var int $timestampMs Timestamp that the harsh event occurred in Unix milliseconds since epoch*/
    private $timestampMs;

    /** @var int $vehicleId Vehicle associated with the harsh event*/
    private $vehicleId;

}
