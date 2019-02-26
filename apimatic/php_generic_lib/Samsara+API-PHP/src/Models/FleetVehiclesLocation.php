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
class FleetVehiclesLocation implements JsonSerializable
{
    /**
     * ID of the vehicle.
     * @var integer|null $id public property
     */
    public $id;

    /**
     * @todo Write general description for this property
     * @var \SamsaraAPILib\Models\FleetVehicleLocation[]|null $locations public property
     */
    public $locations;

    /**
     * Name of the vehicle.
     * @var string|null $name public property
     */
    public $name;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $id        Initialization value for $this->id
     * @param array   $locations Initialization value for $this->locations
     * @param string  $name      Initialization value for $this->name
     */
    public function __construct()
    {
        if (3 == func_num_args()) {
            $this->id        = func_get_arg(0);
            $this->locations = func_get_arg(1);
            $this->name      = func_get_arg(2);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['id']        = $this->id;
        $json['locations'] = $this->locations;
        $json['name']      = $this->name;

        return $json;
    }
}