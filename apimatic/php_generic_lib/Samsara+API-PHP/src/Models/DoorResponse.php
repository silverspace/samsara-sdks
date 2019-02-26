<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 *Contains the current door status of a sensor.
 */
class DoorResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @var integer|null $groupId public property
     */
    public $groupId;

    /**
     * @todo Write general description for this property
     * @var \SamsaraAPILib\Models\Sensor1[]|null $sensors public property
     */
    public $sensors;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $groupId Initialization value for $this->groupId
     * @param array   $sensors Initialization value for $this->sensors
     */
    public function __construct()
    {
        if (2 == func_num_args()) {
            $this->groupId = func_get_arg(0);
            $this->sensors = func_get_arg(1);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['groupId'] = $this->groupId;
        $json['sensors'] = $this->sensors;

        return $json;
    }
}
