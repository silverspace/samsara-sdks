<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A vehicle object.
 */
class Vehicle
{
    /**
     * Total engine hours for the vehicle.
     * @DTA\Data(field="engineHours", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $engine_hours;
    /**
     * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
     * @DTA\Data(field="fuelLevelPercent", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $fuel_level_percent;
    /**
     * ID of the vehicle.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * Name of the vehicle.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * @DTA\Data(field="note", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $note;
    /**
     * The number of meters reported by the odometer.
     * @DTA\Data(field="odometerMeters", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $odometer_meters;
    /**
     * Vehicle Identification Number.
     * @DTA\Data(field="vin", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $vin;
}
