<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SensorHistoryResponseResults
{
    /**
     * List of datapoints, one for each requested (sensor, field) pair.
     * @DTA\Data(field="series", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"int"}}
     * }})
     * @var int[]
     */
    public $series;
    /**
     * Timestamp in UNIX milliseconds.
     * @DTA\Data(field="timeMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $time_ms;
}
