<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class HosLogsSummaryResponseDrivers
{
    /**
     * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
     * @DTA\Data(field="timeUntilBreak", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $time_until_break;
    /**
     * Name of the vehicle.
     * @DTA\Data(field="vehicleName", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $vehicle_name;
    /**
     * The amount of driving time in violation today (in ms).
     * @DTA\Data(field="drivingInViolationToday", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driving_in_violation_today;
    /**
     * ID of the driver.
     * @DTA\Data(field="driverId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * The amount of remaining cycle time (in ms).
     * @DTA\Data(field="cycleRemaining", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $cycle_remaining;
    /**
     * Name of the driver.
     * @DTA\Data(field="driverName", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $driver_name;
    /**
     * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
     * @DTA\Data(field="dutyStatus", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $duty_status;
    /**
     * The amount of cycle time (in ms) available tomorrow.
     * @DTA\Data(field="cycleTomorrow", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $cycle_tomorrow;
    /**
     * The amount of remaining shift drive time (in ms).
     * @DTA\Data(field="shiftDriveRemaining", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $shift_drive_remaining;
    /**
     * The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
     * @DTA\Data(field="timeInCurrentStatus", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $time_in_current_status;
    /**
     * The amount of driving time in violation in this cycle (in ms).
     * @DTA\Data(field="drivingInViolationCycle", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driving_in_violation_cycle;
    /**
     * The amount of remaining shift time (in ms).
     * @DTA\Data(field="shiftRemaining", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $shift_remaining;
}
