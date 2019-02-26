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
class PhotoValue implements JsonSerializable
{
    /**
     * Photo URL for a JPG image
     * @var string|null $url public property
     */
    public $url;

    /**
     * Constructor to set initial or default values of member properties
     * @param string $url Initialization value for $this->url
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->url = func_get_arg(0);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['url'] = $this->url;

        return $json;
    }
}