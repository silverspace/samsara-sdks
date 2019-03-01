<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Digital value of an aux input.
 */
class AuxInput
{
    /**
     * Timestamp in Unix epoch milliseconds.
     * @DTA\Data(field="timeMs")
     * @DTA\Validator(name="Type", options={"type":"object"})
     * @var object
     */
    public $time_ms;
    /**
     * Boolean representing the digital value of the aux input.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $value;
}
