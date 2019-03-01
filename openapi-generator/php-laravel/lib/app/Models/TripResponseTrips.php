<?php
/**
 * TripResponseTrips
 */
namespace app\Models;

/**
 * TripResponseTrips
 */
class TripResponseTrips {

    /** @var int $endOdometer Odometer reading at the end of the trip.*/
    private $endOdometer;

    /** @var int $distanceMeters Length of the trip in meters.*/
    private $distanceMeters;

    /** @var int $endMs End of the trip in UNIX milliseconds.*/
    private $endMs;

    /** @var int $startMs Beginning of the trip in UNIX milliseconds.*/
    private $startMs;

    /** @var int $fuelConsumedMl Amount in milliliters of fuel consumed on this trip.*/
    private $fuelConsumedMl;

    /** @var string $startAddress Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.*/
    private $startAddress;

    /** @var \app\Models\TripResponseStartCoordinates $startCoordinates */
    private $startCoordinates;

    /** @var \app\Models\TripResponseEndCoordinates $endCoordinates */
    private $endCoordinates;

    /** @var int $startOdometer Odometer reading at the beginning of the trip.*/
    private $startOdometer;

    /** @var int $driverId ID of the driver.*/
    private $driverId;

    /** @var string $startLocation Geocoded street address of start (latitude, longitude) coordinates.*/
    private $startLocation;

    /** @var int $tollMeters Length in meters trip spent on toll roads.*/
    private $tollMeters;

    /** @var string $endAddress Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.*/
    private $endAddress;

    /** @var string $endLocation Geocoded street address of start (latitude, longitude) coordinates.*/
    private $endLocation;

}
