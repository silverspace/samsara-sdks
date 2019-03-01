<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 */
class EngineState
{
    /**
     * Timestamp in Unix epoch milliseconds.
     * @DTA\Data(field="timeMs")
     * @DTA\Validator(name="Type", options={"type":"object"})
     * @var object
     */
    public $time_ms;
    /**
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $value;
}
