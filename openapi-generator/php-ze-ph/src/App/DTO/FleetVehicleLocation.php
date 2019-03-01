<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Contains the location and speed of a vehicle at a particular time
 */
class FleetVehicleLocation
{
    /**
     * The latitude of the location in degrees.
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $latitude;
    /**
     * The best effort (street,city,state) for the latitude and longitude.
     * @DTA\Data(field="location", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $location;
    /**
     * The longitude of the location in degrees.
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $longitude;
    /**
     * The speed calculated from GPS that the asset was traveling at in miles per hour.
     * @DTA\Data(field="speedMilesPerHour", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $speed_miles_per_hour;
    /**
     * Time in Unix milliseconds since epoch when the asset was at the location.
     * @DTA\Data(field="timeMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $time_ms;
}
