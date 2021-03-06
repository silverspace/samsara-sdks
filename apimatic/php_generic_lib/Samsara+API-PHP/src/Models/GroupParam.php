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
class GroupParam implements JsonSerializable
{
    /**
     * Group ID to query.
     * @required
     * @var integer $groupId public property
     */
    public $groupId;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $groupId Initialization value for $this->groupId
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->groupId = func_get_arg(0);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['groupId'] = $this->groupId;

        return $json;
    }
}
