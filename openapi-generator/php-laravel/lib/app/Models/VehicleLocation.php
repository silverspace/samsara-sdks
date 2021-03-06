<?php
/**
 * VehicleLocation
 */
namespace app\Models;

/**
 * VehicleLocation
 */
class VehicleLocation {

    /** @var double $heading Heading in degrees.*/
    private $heading;

    /** @var int $id ID of the vehicle.*/
    private $id;

    /** @var double $latitude Latitude in decimal degrees.*/
    private $latitude;

    /** @var string $location Text representation of nearest identifiable location to (latitude, longitude) coordinates.*/
    private $location;

    /** @var double $longitude Longitude in decimal degrees.*/
    private $longitude;

    /** @var string $name Name of the vehicle.*/
    private $name;

    /** @var int $odometerMeters The number of meters reported by the odometer.*/
    private $odometerMeters;

    /** @var bool $onTrip Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.*/
    private $onTrip;

    /** @var double $speed Speed in miles per hour.*/
    private $speed;

    /** @var int $time The time the reported location was logged, reported as a UNIX timestamp in milliseconds.*/
    private $time;

    /** @var string $vin Vehicle Identification Number (VIN) of the vehicle.*/
    private $vin;

}
