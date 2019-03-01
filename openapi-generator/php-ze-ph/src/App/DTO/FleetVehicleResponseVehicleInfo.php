<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class FleetVehicleResponseVehicleInfo
{
    /**
     * Year of the vehicle.
     * @DTA\Data(field="year", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $year;
    /**
     * Model of the Vehicle.
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $model;
    /**
     * Vehicle Identification Number.
     * @DTA\Data(field="vin", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $vin;
    /**
     * Make of the vehicle.
     * @DTA\Data(field="make", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $make;
}
