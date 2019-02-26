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
class AddressParam implements JsonSerializable
{
    /**
     * The address of the entry to add, as it would be recognized if provided to maps.google.com.
     * @required
     * @var string $address public property
     */
    public $address;

    /**
     * Group ID to query.
     * @required
     * @var integer $groupId public property
     */
    public $groupId;

    /**
     * Name of the location to add to the address book.
     * @required
     * @var string $name public property
     */
    public $name;

    /**
     * Radius in meters of the address (used for matching vehicle trip stops to this location).
     * @required
     * @var integer $radius public property
     */
    public $radius;

    /**
     * Constructor to set initial or default values of member properties
     * @param string  $address Initialization value for $this->address
     * @param integer $groupId Initialization value for $this->groupId
     * @param string  $name    Initialization value for $this->name
     * @param integer $radius  Initialization value for $this->radius
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->address = func_get_arg(0);
            $this->groupId = func_get_arg(1);
            $this->name    = func_get_arg(2);
            $this->radius  = func_get_arg(3);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['address'] = $this->address;
        $json['groupId'] = $this->groupId;
        $json['name']    = $this->name;
        $json['radius']  = $this->radius;

        return $json;
    }
}
