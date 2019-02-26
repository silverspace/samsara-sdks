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
class FuelPercentage implements JsonSerializable
{
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @var integer|null $changedAtMs public property
     */
    public $changedAtMs;

    /**
     * Fuel percentage of the reefer.
     * @var integer|null $fuelPercentage public property
     */
    public $fuelPercentage;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $changedAtMs    Initialization value for $this->changedAtMs
     * @param integer $fuelPercentage Initialization value for $this->fuelPercentage
     */
    public function __construct()
    {
        if (2 == func_num_args()) {
            $this->changedAtMs    = func_get_arg(0);
            $this->fuelPercentage = func_get_arg(1);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['changedAtMs']    = $this->changedAtMs;
        $json['fuelPercentage'] = $this->fuelPercentage;

        return $json;
    }
}
