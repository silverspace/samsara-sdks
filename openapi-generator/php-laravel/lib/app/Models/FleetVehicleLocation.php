<?php
/**
 * FleetVehicleLocation
 */
namespace app\Models;

/**
 * FleetVehicleLocation
 */
class FleetVehicleLocation {

    /** @var double $latitude The latitude of the location in degrees.*/
    private $latitude;

    /** @var string $location The best effort (street,city,state) for the latitude and longitude.*/
    private $location;

    /** @var double $longitude The longitude of the location in degrees.*/
    private $longitude;

    /** @var double $speedMilesPerHour The speed calculated from GPS that the asset was traveling at in miles per hour.*/
    private $speedMilesPerHour;

    /** @var int $timeMs Time in Unix milliseconds since epoch when the asset was at the location.*/
    private $timeMs;

}
