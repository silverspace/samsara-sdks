<?php
/**
 * SensorHistoryResponseResults
 */
namespace app\Models;

/**
 * SensorHistoryResponseResults
 */
class SensorHistoryResponseResults {

    /** @var int[] $series List of datapoints, one for each requested (sensor, field) pair.*/
    private $series;

    /** @var int $timeMs Timestamp in UNIX milliseconds.*/
    private $timeMs;

}
