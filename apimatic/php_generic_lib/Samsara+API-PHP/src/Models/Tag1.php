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
class Tag1 implements JsonSerializable
{
    /**
     * The ID of this tag.
     * @required
     * @var integer $id public property
     */
    public $id;

    /**
     * Name of this tag.
     * @required
     * @var string $name public property
     */
    public $name;

    /**
     * The ID of this tag.
     * @var integer|null $parentTagId public property
     */
    public $parentTagId;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $id          Initialization value for $this->id
     * @param string  $name        Initialization value for $this->name
     * @param integer $parentTagId Initialization value for $this->parentTagId
     */
    public function __construct()
    {
        if (3 == func_num_args()) {
            $this->id          = func_get_arg(0);
            $this->name        = func_get_arg(1);
            $this->parentTagId = func_get_arg(2);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['id']          = $this->id;
        $json['name']        = $this->name;
        $json['parentTagId'] = $this->parentTagId;

        return $json;
    }
}
