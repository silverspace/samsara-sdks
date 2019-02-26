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
class Sensor4 implements JsonSerializable
{
    /**
     * Currently reported ambient temperature in millidegrees celsius.
     * @var integer|null $ambientTemperature public property
     */
    public $ambientTemperature;

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
     * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this
     * parameter will not be reported.
     * @var integer|null $probeTemperature public property
     */
    public $probeTemperature;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $ambientTemperature Initialization value for $this->ambientTemperature
     * @param integer $id                 Initialization value for $this->id
     * @param string  $name               Initialization value for $this->name
     * @param integer $probeTemperature   Initialization value for $this->probeTemperature
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->ambientTemperature = func_get_arg(0);
            $this->id                 = func_get_arg(1);
            $this->name               = func_get_arg(2);
            $this->probeTemperature   = func_get_arg(3);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['ambientTemperature'] = $this->ambientTemperature;
        $json['id']                 = $this->id;
        $json['name']               = $this->name;
        $json['probeTemperature']   = $this->probeTemperature;

        return $json;
    }
}
