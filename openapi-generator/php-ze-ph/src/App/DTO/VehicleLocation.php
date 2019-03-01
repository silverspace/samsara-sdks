<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 */
class VehicleLocation
{
    /**
     * Heading in degrees.
     * @DTA\Data(field="heading", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $heading;
    /**
     * ID of the vehicle.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * Latitude in decimal degrees.
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $latitude;
    /**
     * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
     * @DTA\Data(field="location", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $location;
    /**
     * Longitude in decimal degrees.
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $longitude;
    /**
     * Name of the vehicle.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * The number of meters reported by the odometer.
     * @DTA\Data(field="odometerMeters", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $odometer_meters;
    /**
     * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
     * @DTA\Data(field="onTrip", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $on_trip;
    /**
     * Speed in miles per hour.
     * @DTA\Data(field="speed", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $speed;
    /**
     * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
     * @DTA\Data(field="time", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $time;
    /**
     * Vehicle Identification Number (VIN) of the vehicle.
     * @DTA\Data(field="vin", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $vin;
}
