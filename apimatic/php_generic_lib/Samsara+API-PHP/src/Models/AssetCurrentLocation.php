<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 *Current location of an asset
 */
class AssetCurrentLocation implements JsonSerializable
{
    /**
     * The latitude of the location in degrees.
     * @var double|null $latitude public property
     */
    public $latitude;

    /**
     * The best effort (street,city,state) for the latitude and longitude.
     * @var string|null $location public property
     */
    public $location;

    /**
     * The longitude of the location in degrees.
     * @var double|null $longitude public property
     */
    public $longitude;

    /**
     * The speed calculated from GPS that the asset was traveling at in miles per hour.
     * @var double|null $speedMilesPerHour public property
     */
    public $speedMilesPerHour;

    /**
     * Time in Unix milliseconds since epoch when the asset was at the location.
     * @var double|null $timeMs public property
     */
    public $timeMs;

    /**
     * Constructor to set initial or default values of member properties
     * @param double $latitude          Initialization value for $this->latitude
     * @param string $location          Initialization value for $this->location
     * @param double $longitude         Initialization value for $this->longitude
     * @param double $speedMilesPerHour Initialization value for $this->speedMilesPerHour
     * @param double $timeMs            Initialization value for $this->timeMs
     */
    public function __construct()
    {
        if (5 == func_num_args()) {
            $this->latitude          = func_get_arg(0);
            $this->location          = func_get_arg(1);
            $this->longitude         = func_get_arg(2);
            $this->speedMilesPerHour = func_get_arg(3);
            $this->timeMs            = func_get_arg(4);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['latitude']          = $this->latitude;
        $json['location']          = $this->location;
        $json['longitude']         = $this->longitude;
        $json['speedMilesPerHour'] = $this->speedMilesPerHour;
        $json['timeMs']            = $this->timeMs;

        return $json;
    }
}
