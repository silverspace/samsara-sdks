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
class DocumentBase implements JsonSerializable
{
    /**
     * ID of the Samsara dispatch job for which the document is submitted
     * @var integer|null $dispatchJobId public property
     */
    public $dispatchJobId;

    /**
     * Notes submitted with this document.
     * @var string|null $notes public property
     */
    public $notes;

    /**
     * Constructor to set initial or default values of member properties
     * @param integer $dispatchJobId Initialization value for $this->dispatchJobId
     * @param string  $notes         Initialization value for $this->notes
     */
    public function __construct()
    {
        if (2 == func_num_args()) {
            $this->dispatchJobId = func_get_arg(0);
            $this->notes         = func_get_arg(1);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['dispatchJobId'] = $this->dispatchJobId;
        $json['notes']         = $this->notes;

        return $json;
    }
}
