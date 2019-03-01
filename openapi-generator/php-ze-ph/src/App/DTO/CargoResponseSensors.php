<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CargoResponseSensors
{
    /**
     * Flag indicating whether the current cargo is empty or loaded.
     * @DTA\Data(field="cargoEmpty", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $cargo_empty;
    /**
     * Name of the sensor.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * ID of the sensor.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
}
