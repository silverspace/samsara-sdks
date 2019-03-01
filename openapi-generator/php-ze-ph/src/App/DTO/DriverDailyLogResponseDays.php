<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DriverDailyLogResponseDays
{
    /**
     * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
     * @DTA\Data(field="certifiedAtMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $certified_at_ms;
    /**
     * End of the HOS day, specified in milliseconds UNIX time.
     * @DTA\Data(field="endMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $end_ms;
    /**
     * End of the HOS day, specified in milliseconds UNIX time.
     * @DTA\Data(field="startMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $start_ms;
    /**
     * List of trailer ID&#39;s associated with the driver for the day.
     * @DTA\Data(field="trailerIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":object::class})
     * @DTA\Validator(name="Dictionary", options={"type":object::class})
     * @var object
     */
    public $trailer_ids;
    /**
     * Hours spent on duty or driving, rounded to two decimal places.
     * @DTA\Data(field="activeHours", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $active_hours;
    /**
     * Distance driven in miles, rounded to two decimal places.
     * @DTA\Data(field="distanceMiles", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $distance_miles;
    /**
     * Milliseconds spent on duty or driving.
     * @DTA\Data(field="activeMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $active_ms;
    /**
     * Whether this HOS day chart was certified by the driver.
     * @DTA\Data(field="certified", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $certified;
    /**
     * List of vehicle ID&#39;s associated with the driver for the day.
     * @DTA\Data(field="vehicleIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":object::class})
     * @DTA\Validator(name="Dictionary", options={"type":object::class})
     * @var object
     */
    public $vehicle_ids;
}
