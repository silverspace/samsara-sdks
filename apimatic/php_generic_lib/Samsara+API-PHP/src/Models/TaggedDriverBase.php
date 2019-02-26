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
class TaggedDriverBase implements JsonSerializable
{
    /**
     * The ID of the Driver being tagged.
     * @required
     * @var integer $id public property
     */
    public $id;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $id Initialization value for $this->id
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->id = func_get_arg(0);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['id'] = $this->id;

        return $json;
    }
}
