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
class Addresses implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var \SamsaraAPILib\Models\Addresses1[] $addresses public property
     */
    public $addresses;

    /**
     * Constructor to set initial or default values of member properties
     * @param array $addresses Initialization value for $this->addresses
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->addresses = func_get_arg(0);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['addresses'] = $this->addresses;

        return $json;
    }
}