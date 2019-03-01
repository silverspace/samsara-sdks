<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VehicleHarshEventResponseLocation
{
    /**
     * Address of location where the harsh event occurred
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $address;
    /**
     * Latitude of location where the harsh event occurred
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $latitude;
    /**
     * Longitude of location where the harsh event occurred
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $longitude;
}
