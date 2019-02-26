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
class TripsParam implements JsonSerializable
{
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @required
     * @var integer $endMs public property
     */
    public $endMs;

    /**
     * Group ID to query.
     * @required
     * @var integer $groupId public property
     */
    public $groupId;

    /**
     * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with
     * respect to startMs and endMs
     * @required
     * @var integer $startMs public property
     */
    public $startMs;

    /**
     * Vehicle ID to query.
     * @required
     * @var integer $vehicleId public property
     */
    public $vehicleId;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $endMs     Initialization value for $this->endMs
     * @param integer $groupId   Initialization value for $this->groupId
     * @param integer $startMs   Initialization value for $this->startMs
     * @param integer $vehicleId Initialization value for $this->vehicleId
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->endMs     = func_get_arg(0);
            $this->groupId   = func_get_arg(1);
            $this->startMs   = func_get_arg(2);
            $this->vehicleId = func_get_arg(3);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['endMs']     = $this->endMs;
        $json['groupId']   = $this->groupId;
        $json['startMs']   = $this->startMs;
        $json['vehicleId'] = $this->vehicleId;

        return $json;
    }
}
