<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 *Safety score details for a driver
 */
class DriverSafetyScoreResponse implements JsonSerializable
{
    /**
     * Crash event count
     * @var integer|null $crashCount public property
     */
    public $crashCount;

    /**
     * Driver ID
     * @var integer|null $driverId public property
     */
    public $driverId;

    /**
     * Harsh acceleration event count
     * @var integer|null $harshAccelCount public property
     */
    public $harshAccelCount;

    /**
     * Harsh braking event count
     * @var integer|null $harshBrakingCount public property
     */
    public $harshBrakingCount;

    /**
     * @todo Write general description for this property
     * @var \SamsaraAPILib\Models\SafetyReportHarshEvent[]|null $harshEvents public property
     */
    public $harshEvents;

    /**
     * Harsh turning event count
     * @var integer|null $harshTurningCount public property
     */
    public $harshTurningCount;

    /**
     * Safety Score
     * @var integer|null $safetyScore public property
     */
    public $safetyScore;

    /**
     * Safety Score Rank
     * @var string|null $safetyScoreRank public property
     */
    public $safetyScoreRank;

    /**
     * Amount of time driven over the speed limit in milliseconds
     * @var integer|null $timeOverSpeedLimitMs public property
     */
    public $timeOverSpeedLimitMs;

    /**
     * Total distance driven in meters
     * @var integer|null $totalDistanceDrivenMeters public property
     */
    public $totalDistanceDrivenMeters;

    /**
     * Total harsh event count
     * @var integer|null $totalHarshEventCount public property
     */
    public $totalHarshEventCount;

    /**
     * Amount of time driven in milliseconds
     * @var integer|null $totalTimeDrivenMs public property
     */
    public $totalTimeDrivenMs;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $crashCount                Initialization value for $this->crashCount
     * @param integer $driverId                  Initialization value for $this->driverId
     * @param integer $harshAccelCount           Initialization value for $this->harshAccelCount
     * @param integer $harshBrakingCount         Initialization value for $this->harshBrakingCount
     * @param array   $harshEvents               Initialization value for $this->harshEvents
     * @param integer $harshTurningCount         Initialization value for $this->harshTurningCount
     * @param integer $safetyScore               Initialization value for $this->safetyScore
     * @param string  $safetyScoreRank           Initialization value for $this->safetyScoreRank
     * @param integer $timeOverSpeedLimitMs      Initialization value for $this->timeOverSpeedLimitMs
     * @param integer $totalDistanceDrivenMeters Initialization value for $this->totalDistanceDrivenMeters
     * @param integer $totalHarshEventCount      Initialization value for $this->totalHarshEventCount
     * @param integer $totalTimeDrivenMs         Initialization value for $this->totalTimeDrivenMs
     */
    public function __construct()
    {
        if (12 == func_num_args()) {
            $this->crashCount                = func_get_arg(0);
            $this->driverId                  = func_get_arg(1);
            $this->harshAccelCount           = func_get_arg(2);
            $this->harshBrakingCount         = func_get_arg(3);
            $this->harshEvents               = func_get_arg(4);
            $this->harshTurningCount         = func_get_arg(5);
            $this->safetyScore               = func_get_arg(6);
            $this->safetyScoreRank           = func_get_arg(7);
            $this->timeOverSpeedLimitMs      = func_get_arg(8);
            $this->totalDistanceDrivenMeters = func_get_arg(9);
            $this->totalHarshEventCount      = func_get_arg(10);
            $this->totalTimeDrivenMs         = func_get_arg(11);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['crashCount']                = $this->crashCount;
        $json['driverId']                  = $this->driverId;
        $json['harshAccelCount']           = $this->harshAccelCount;
        $json['harshBrakingCount']         = $this->harshBrakingCount;
        $json['harshEvents']               = $this->harshEvents;
        $json['harshTurningCount']         = $this->harshTurningCount;
        $json['safetyScore']               = $this->safetyScore;
        $json['safetyScoreRank']           = $this->safetyScoreRank;
        $json['timeOverSpeedLimitMs']      = $this->timeOverSpeedLimitMs;
        $json['totalDistanceDrivenMeters'] = $this->totalDistanceDrivenMeters;
        $json['totalHarshEventCount']      = $this->totalHarshEventCount;
        $json['totalTimeDrivenMs']         = $this->totalTimeDrivenMs;

        return $json;
    }
}
