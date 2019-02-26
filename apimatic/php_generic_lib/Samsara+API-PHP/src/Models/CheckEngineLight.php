<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 *J1939 check engine lights.
 */
class CheckEngineLight implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @var bool|null $emissionsIsOn public property
     */
    public $emissionsIsOn;

    /**
     * @todo Write general description for this property
     * @var bool|null $protectIsOn public property
     */
    public $protectIsOn;

    /**
     * @todo Write general description for this property
     * @var bool|null $stopIsOn public property
     */
    public $stopIsOn;

    /**
     * @todo Write general description for this property
     * @var bool|null $warningIsOn public property
     */
    public $warningIsOn;

    /**
     * Constructor to set initial or default values of member properties
     * @param bool $emissionsIsOn Initialization value for $this->emissionsIsOn
     * @param bool $protectIsOn   Initialization value for $this->protectIsOn
     * @param bool $stopIsOn      Initialization value for $this->stopIsOn
     * @param bool $warningIsOn   Initialization value for $this->warningIsOn
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->emissionsIsOn = func_get_arg(0);
            $this->protectIsOn   = func_get_arg(1);
            $this->stopIsOn      = func_get_arg(2);
            $this->warningIsOn   = func_get_arg(3);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['emissionsIsOn'] = $this->emissionsIsOn;
        $json['protectIsOn']   = $this->protectIsOn;
        $json['stopIsOn']      = $this->stopIsOn;
        $json['warningIsOn']   = $this->warningIsOn;

        return $json;
    }
}
