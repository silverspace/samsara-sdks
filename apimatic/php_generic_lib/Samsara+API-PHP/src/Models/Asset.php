<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 *Basic information of an asset
 */
class Asset implements JsonSerializable
{
    /**
     * Serial number of the host asset
     * @var string|null $assetSerialNumber public property
     */
    public $assetSerialNumber;

    /**
     * The cable connected to the asset
     * @var \SamsaraAPILib\Models\Cable[]|null $cable public property
     */
    public $cable;

    /**
     * Engine hours
     * @var integer|null $engineHours public property
     */
    public $engineHours;

    /**
     * Asset ID
     * @required
     * @var integer $id public property
     */
    public $id;

    /**
     * Asset name
     * @var string|null $name public property
     */
    public $name;

    /**
     * Constructor to set initial or default values of member properties
     * @param string  $assetSerialNumber Initialization value for $this->assetSerialNumber
     * @param array   $cable             Initialization value for $this->cable
     * @param integer $engineHours       Initialization value for $this->engineHours
     * @param integer $id                Initialization value for $this->id
     * @param string  $name              Initialization value for $this->name
     */
    public function __construct()
    {
        if (5 == func_num_args()) {
            $this->assetSerialNumber = func_get_arg(0);
            $this->cable             = func_get_arg(1);
            $this->engineHours       = func_get_arg(2);
            $this->id                = func_get_arg(3);
            $this->name              = func_get_arg(4);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['assetSerialNumber'] = $this->assetSerialNumber;
        $json['cable']             = $this->cable;
        $json['engineHours']       = $this->engineHours;
        $json['id']                = $this->id;
        $json['name']              = $this->name;

        return $json;
    }
}
