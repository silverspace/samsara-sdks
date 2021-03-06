<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 *The geofence that defines this address and its bounds. This can either be a circle, or a polygon -
 * only one key should be provided, depending on the geofence type.
 */
class AddressGeofence implements JsonSerializable
{
    /**
     * Information about a circular geofence. This field is only populated if the geofence is a circle.
     * @var \SamsaraAPILib\Models\Circle|null $circle public property
     */
    public $circle;

    /**
     * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
     * @var \SamsaraAPILib\Models\Polygon|null $polygon public property
     */
    public $polygon;

    /**
     * Constructor to set initial or default values of member properties
     * @param Circle  $circle  Initialization value for $this->circle
     * @param Polygon $polygon Initialization value for $this->polygon
     */
    public function __construct()
    {
        if (2 == func_num_args()) {
            $this->circle  = func_get_arg(0);
            $this->polygon = func_get_arg(1);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['circle']  = $this->circle;
        $json['polygon'] = $this->polygon;

        return $json;
    }
}
