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
class DriversResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @var \SamsaraAPILib\Models\Driver[]|null $drivers public property
     */
    public $drivers;

    /**
     * Constructor to set initial or default values of member properties
     * @param array $drivers Initialization value for $this->drivers
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->drivers = func_get_arg(0);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['drivers'] = $this->drivers;

        return $json;
    }
}
