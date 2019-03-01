<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TripResponseTrips
{
    /**
     * Odometer reading at the end of the trip.
     * @DTA\Data(field="endOdometer", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $end_odometer;
    /**
     * Length of the trip in meters.
     * @DTA\Data(field="distanceMeters", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $distance_meters;
    /**
     * End of the trip in UNIX milliseconds.
     * @DTA\Data(field="endMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $end_ms;
    /**
     * Beginning of the trip in UNIX milliseconds.
     * @DTA\Data(field="startMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $start_ms;
    /**
     * Amount in milliliters of fuel consumed on this trip.
     * @DTA\Data(field="fuelConsumedMl", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $fuel_consumed_ml;
    /**
     * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
     * @DTA\Data(field="startAddress", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $start_address;
    /**
     * @DTA\Data(field="startCoordinates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TripResponseStartCoordinates::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\TripResponseStartCoordinates::class})
     * @var \App\DTO\TripResponseStartCoordinates
     */
    public $start_coordinates;
    /**
     * @DTA\Data(field="endCoordinates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TripResponseEndCoordinates::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\TripResponseEndCoordinates::class})
     * @var \App\DTO\TripResponseEndCoordinates
     */
    public $end_coordinates;
    /**
     * Odometer reading at the beginning of the trip.
     * @DTA\Data(field="startOdometer", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $start_odometer;
    /**
     * ID of the driver.
     * @DTA\Data(field="driverId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * Geocoded street address of start (latitude, longitude) coordinates.
     * @DTA\Data(field="startLocation", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $start_location;
    /**
     * Length in meters trip spent on toll roads.
     * @DTA\Data(field="tollMeters", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $toll_meters;
    /**
     * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
     * @DTA\Data(field="endAddress", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $end_address;
    /**
     * Geocoded street address of start (latitude, longitude) coordinates.
     * @DTA\Data(field="endLocation", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $end_location;
}
