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
class DriverDailyLogResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @var \SamsaraAPILib\Models\Day[]|null $days public property
     */
    public $days;

    /**
     * Constructor to set initial or default values of member properties
     * @param array $days Initialization value for $this->days
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->days = func_get_arg(0);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['days'] = $this->days;

        return $json;
    }
}