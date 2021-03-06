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
class Sensor2 implements JsonSerializable
{
    /**
     * Currently reported relative humidity in percent, from 0-100.
     * @var integer|null $humidity public property
     */
    public $humidity;

    /**
     * ID of the sensor.
     * @var integer|null $id public property
     */
    public $id;

    /**
     * Name of the sensor.
     * @var string|null $name public property
     */
    public $name;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $humidity Initialization value for $this->humidity
     * @param integer $id       Initialization value for $this->id
     * @param string  $name     Initialization value for $this->name
     */
    public function __construct()
    {
        if (3 == func_num_args()) {
            $this->humidity = func_get_arg(0);
            $this->id       = func_get_arg(1);
            $this->name     = func_get_arg(2);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['humidity'] = $this->humidity;
        $json['id']       = $this->id;
        $json['name']     = $this->name;

        return $json;
    }
}
