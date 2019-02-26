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
class GetAllAssetsResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @var \SamsaraAPILib\Models\Asset[]|null $assets public property
     */
    public $assets;

    /**
     * Constructor to set initial or default values of member properties
     * @param array $assets Initialization value for $this->assets
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->assets = func_get_arg(0);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['assets'] = $this->assets;

        return $json;
    }
}