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
class Log implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @var array|null $codriverIds public property
     */
    public $codriverIds;

    /**
     * ID of the driver.
     * @var integer|null $driverId public property
     */
    public $driverId;

    /**
     * ID of the group.
     * @var integer|null $groupId public property
     */
    public $groupId;

    /**
     * City in which the log was recorded.
     * @var string|null $locCity public property
     */
    public $locCity;

    /**
     * Latitude at which the log was recorded.
     * @var double|null $locLat public property
     */
    public $locLat;

    /**
     * Longitude at which the log was recorded.
     * @var double|null $locLng public property
     */
    public $locLng;

    /**
     * Name of location at which the log was recorded.
     * @var string|null $locName public property
     */
    public $locName;

    /**
     * State in which the log was recorded.
     * @var string|null $locState public property
     */
    public $locState;

    /**
     * The time at which the log/HOS status started in UNIX milliseconds.
     * @var integer|null $logStartMs public property
     */
    public $logStartMs;

    /**
     * Remark associated with the log entry.
     * @var string|null $remark public property
     */
    public $remark;

    /**
     * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`,
     * `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     * @var string|null $statusType public property
     */
    public $statusType;

    /**
     * ID of the vehicle.
     * @var integer|null $vehicleId public property
     */
    public $vehicleId;

    /**
     * Constructor to set initial or default values of member properties
     * @param array   $codriverIds Initialization value for $this->codriverIds
     * @param integer $driverId    Initialization value for $this->driverId
     * @param integer $groupId     Initialization value for $this->groupId
     * @param string  $locCity     Initialization value for $this->locCity
     * @param double  $locLat      Initialization value for $this->locLat
     * @param double  $locLng      Initialization value for $this->locLng
     * @param string  $locName     Initialization value for $this->locName
     * @param string  $locState    Initialization value for $this->locState
     * @param integer $logStartMs  Initialization value for $this->logStartMs
     * @param string  $remark      Initialization value for $this->remark
     * @param string  $statusType  Initialization value for $this->statusType
     * @param integer $vehicleId   Initialization value for $this->vehicleId
     */
    public function __construct()
    {
        if (12 == func_num_args()) {
            $this->codriverIds = func_get_arg(0);
            $this->driverId    = func_get_arg(1);
            $this->groupId     = func_get_arg(2);
            $this->locCity     = func_get_arg(3);
            $this->locLat      = func_get_arg(4);
            $this->locLng      = func_get_arg(5);
            $this->locName     = func_get_arg(6);
            $this->locState    = func_get_arg(7);
            $this->logStartMs  = func_get_arg(8);
            $this->remark      = func_get_arg(9);
            $this->statusType  = func_get_arg(10);
            $this->vehicleId   = func_get_arg(11);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['codriverIds'] = $this->codriverIds;
        $json['driverId']    = $this->driverId;
        $json['groupId']     = $this->groupId;
        $json['locCity']     = $this->locCity;
        $json['locLat']      = $this->locLat;
        $json['locLng']      = $this->locLng;
        $json['locName']     = $this->locName;
        $json['locState']    = $this->locState;
        $json['logStartMs']  = $this->logStartMs;
        $json['remark']      = $this->remark;
        $json['statusType']  = $this->statusType;
        $json['vehicleId']   = $this->vehicleId;

        return $json;
    }
}
