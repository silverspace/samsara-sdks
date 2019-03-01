<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DriversSummaryResponseSummaries
{
    /**
     * ID of the driver.
     * @DTA\Data(field="driverId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * Distance driven in miles, rounded to two decimal places.
     * @DTA\Data(field="distanceMiles", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $distance_miles;
    /**
     * Duration in milliseconds that driver was driving during the requested time range
     * @DTA\Data(field="driveMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $drive_ms;
    /**
     * Duration in milliseconds that driver was on duty or driving during the requested time range
     * @DTA\Data(field="activeMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $active_ms;
    /**
     * Username of the driver.
     * @DTA\Data(field="driverUsername", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $driver_username;
    /**
     * Group of the driver.
     * @DTA\Data(field="groupId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * Name of the driver.
     * @DTA\Data(field="driverName", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $driver_name;
    /**
     * Duration in milliseconds that driver was on duty during the requested time range
     * @DTA\Data(field="onDutyMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $on_duty_ms;
}
