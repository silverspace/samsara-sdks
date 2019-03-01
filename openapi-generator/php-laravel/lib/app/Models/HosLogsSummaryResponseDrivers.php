<?php
/**
 * HosLogsSummaryResponseDrivers
 */
namespace app\Models;

/**
 * HosLogsSummaryResponseDrivers
 */
class HosLogsSummaryResponseDrivers {

    /** @var int $timeUntilBreak The amount of time (in ms) remaining until the driver cannot drive without a rest break.*/
    private $timeUntilBreak;

    /** @var string $vehicleName Name of the vehicle.*/
    private $vehicleName;

    /** @var int $drivingInViolationToday The amount of driving time in violation today (in ms).*/
    private $drivingInViolationToday;

    /** @var int $driverId ID of the driver.*/
    private $driverId;

    /** @var int $cycleRemaining The amount of remaining cycle time (in ms).*/
    private $cycleRemaining;

    /** @var string $driverName Name of the driver.*/
    private $driverName;

    /** @var string $dutyStatus The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.*/
    private $dutyStatus;

    /** @var int $cycleTomorrow The amount of cycle time (in ms) available tomorrow.*/
    private $cycleTomorrow;

    /** @var int $shiftDriveRemaining The amount of remaining shift drive time (in ms).*/
    private $shiftDriveRemaining;

    /** @var int $timeInCurrentStatus The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.*/
    private $timeInCurrentStatus;

    /** @var int $drivingInViolationCycle The amount of driving time in violation in this cycle (in ms).*/
    private $drivingInViolationCycle;

    /** @var int $shiftRemaining The amount of remaining shift time (in ms).*/
    private $shiftRemaining;

}
