<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 * @todo Write general description for this model
 */
class Driver1 implements JsonSerializable
{
    /**
     * The amount of remaining cycle time (in ms).
     * @var integer|null $cycleRemaining public property
     */
    public $cycleRemaining;

    /**
     * The amount of cycle time (in ms) available tomorrow.
     * @var integer|null $cycleTomorrow public property
     */
    public $cycleTomorrow;

    /**
     * ID of the driver.
     * @var integer|null $driverId public property
     */
    public $driverId;

    /**
     * Name of the driver.
     * @var string|null $driverName public property
     */
    public $driverName;

    /**
     * The amount of driving time in violation in this cycle (in ms).
     * @var integer|null $drivingInViolationCycle public property
     */
    public $drivingInViolationCycle;

    /**
     * The amount of driving time in violation today (in ms).
     * @var integer|null $drivingInViolationToday public property
     */
    public $drivingInViolationToday;

    /**
     * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`,
     * `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     * @var string|null $dutyStatus public property
     */
    public $dutyStatus;

    /**
     * The amount of remaining shift drive time (in ms).
     * @var integer|null $shiftDriveRemaining public property
     */
    public $shiftDriveRemaining;

    /**
     * The amount of remaining shift time (in ms).
     * @var integer|null $shiftRemaining public property
     */
    public $shiftRemaining;

    /**
     * The amount of time (in ms) that the driver has been in the current `dutyStatus`.
     * @var integer|null $timeInCurrentStatus public property
     */
    public $timeInCurrentStatus;

    /**
     * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
     * @var integer|null $timeUntilBreak public property
     */
    public $timeUntilBreak;

    /**
     * Name of the vehicle.
     * @var string|null $vehicleName public property
     */
    public $vehicleName;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $cycleRemaining          Initialization value for $this->cycleRemaining
     * @param integer $cycleTomorrow           Initialization value for $this->cycleTomorrow
     * @param integer $driverId                Initialization value for $this->driverId
     * @param string  $driverName              Initialization value for $this->driverName
     * @param integer $drivingInViolationCycle Initialization value for $this->drivingInViolationCycle
     * @param integer $drivingInViolationToday Initialization value for $this->drivingInViolationToday
     * @param string  $dutyStatus              Initialization value for $this->dutyStatus
     * @param integer $shiftDriveRemaining     Initialization value for $this->shiftDriveRemaining
     * @param integer $shiftRemaining          Initialization value for $this->shiftRemaining
     * @param integer $timeInCurrentStatus     Initialization value for $this->timeInCurrentStatus
     * @param integer $timeUntilBreak          Initialization value for $this->timeUntilBreak
     * @param string  $vehicleName             Initialization value for $this->vehicleName
     */
    public function __construct()
    {
        if (12 == func_num_args()) {
            $this->cycleRemaining          = func_get_arg(0);
            $this->cycleTomorrow           = func_get_arg(1);
            $this->driverId                = func_get_arg(2);
            $this->driverName              = func_get_arg(3);
            $this->drivingInViolationCycle = func_get_arg(4);
            $this->drivingInViolationToday = func_get_arg(5);
            $this->dutyStatus              = func_get_arg(6);
            $this->shiftDriveRemaining     = func_get_arg(7);
            $this->shiftRemaining          = func_get_arg(8);
            $this->timeInCurrentStatus     = func_get_arg(9);
            $this->timeUntilBreak          = func_get_arg(10);
            $this->vehicleName             = func_get_arg(11);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['cycleRemaining']          = $this->cycleRemaining;
        $json['cycleTomorrow']           = $this->cycleTomorrow;
        $json['driverId']                = $this->driverId;
        $json['driverName']              = $this->driverName;
        $json['drivingInViolationCycle'] = $this->drivingInViolationCycle;
        $json['drivingInViolationToday'] = $this->drivingInViolationToday;
        $json['dutyStatus']              = $this->dutyStatus;
        $json['shiftDriveRemaining']     = $this->shiftDriveRemaining;
        $json['shiftRemaining']          = $this->shiftRemaining;
        $json['timeInCurrentStatus']     = $this->timeInCurrentStatus;
        $json['timeUntilBreak']          = $this->timeUntilBreak;
        $json['vehicleName']             = $this->vehicleName;

        return $json;
    }
}