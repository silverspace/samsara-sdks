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
class Day implements JsonSerializable
{
    /**
     * Hours spent on duty or driving, rounded to two decimal places.
     * @var double|null $activeHours public property
     */
    public $activeHours;

    /**
     * Milliseconds spent on duty or driving.
     * @var integer|null $activeMs public property
     */
    public $activeMs;

    /**
     * Whether this HOS day chart was certified by the driver.
     * @var bool|null $certified public property
     */
    public $certified;

    /**
     * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
     * @var integer|null $certifiedAtMs public property
     */
    public $certifiedAtMs;

    /**
     * Distance driven in miles, rounded to two decimal places.
     * @var double|null $distanceMiles public property
     */
    public $distanceMiles;

    /**
     * End of the HOS day, specified in milliseconds UNIX time.
     * @var integer|null $endMs public property
     */
    public $endMs;

    /**
     * End of the HOS day, specified in milliseconds UNIX time.
     * @var integer|null $startMs public property
     */
    public $startMs;

    /**
     * List of trailer ID's associated with the driver for the day.
     * @var object|null $trailerIds public property
     */
    public $trailerIds;

    /**
     * List of vehicle ID's associated with the driver for the day.
     * @var object|null $vehicleIds public property
     */
    public $vehicleIds;

    /**
     * Constructor to set initial or default values of member properties
     * @param double  $activeHours   Initialization value for $this->activeHours
     * @param integer $activeMs      Initialization value for $this->activeMs
     * @param bool    $certified     Initialization value for $this->certified
     * @param integer $certifiedAtMs Initialization value for $this->certifiedAtMs
     * @param double  $distanceMiles Initialization value for $this->distanceMiles
     * @param integer $endMs         Initialization value for $this->endMs
     * @param integer $startMs       Initialization value for $this->startMs
     * @param object  $trailerIds    Initialization value for $this->trailerIds
     * @param object  $vehicleIds    Initialization value for $this->vehicleIds
     */
    public function __construct()
    {
        if (9 == func_num_args()) {
            $this->activeHours   = func_get_arg(0);
            $this->activeMs      = func_get_arg(1);
            $this->certified     = func_get_arg(2);
            $this->certifiedAtMs = func_get_arg(3);
            $this->distanceMiles = func_get_arg(4);
            $this->endMs         = func_get_arg(5);
            $this->startMs       = func_get_arg(6);
            $this->trailerIds    = func_get_arg(7);
            $this->vehicleIds    = func_get_arg(8);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['activeHours']   = $this->activeHours;
        $json['activeMs']      = $this->activeMs;
        $json['certified']     = $this->certified;
        $json['certifiedAtMs'] = $this->certifiedAtMs;
        $json['distanceMiles'] = $this->distanceMiles;
        $json['endMs']         = $this->endMs;
        $json['startMs']       = $this->startMs;
        $json['trailerIds']    = $this->trailerIds;
        $json['vehicleIds']    = $this->vehicleIds;

        return $json;
    }
}