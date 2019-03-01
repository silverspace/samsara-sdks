<?php
/**
 * DriverDailyLogResponseDays
 */
namespace app\Models;

/**
 * DriverDailyLogResponseDays
 */
class DriverDailyLogResponseDays {

    /** @var int $certifiedAtMs Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.*/
    private $certifiedAtMs;

    /** @var int $endMs End of the HOS day, specified in milliseconds UNIX time.*/
    private $endMs;

    /** @var int $startMs End of the HOS day, specified in milliseconds UNIX time.*/
    private $startMs;

    /** @var object $trailerIds List of trailer ID&#39;s associated with the driver for the day.*/
    private $trailerIds;

    /** @var double $activeHours Hours spent on duty or driving, rounded to two decimal places.*/
    private $activeHours;

    /** @var double $distanceMiles Distance driven in miles, rounded to two decimal places.*/
    private $distanceMiles;

    /** @var int $activeMs Milliseconds spent on duty or driving.*/
    private $activeMs;

    /** @var bool $certified Whether this HOS day chart was certified by the driver.*/
    private $certified;

    /** @var object $vehicleIds List of vehicle ID&#39;s associated with the driver for the day.*/
    private $vehicleIds;

}