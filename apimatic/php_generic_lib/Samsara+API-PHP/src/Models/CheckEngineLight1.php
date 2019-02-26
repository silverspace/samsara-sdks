<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 *Passenger vehicle check engine light.
 */
class CheckEngineLight1 implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @var bool|null $isOn public property
     */
    public $isOn;

    /**
     * Constructor to set initial or default values of member properties
     * @param bool $isOn Initialization value for $this->isOn
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->isOn = func_get_arg(0);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['isOn'] = $this->isOn;

        return $json;
    }
}