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
class Pagination implements JsonSerializable
{
    /**
     * Cursor identifier representing the last element in the response. This value should be used in
     * conjunction with a subsequent request's 'starting_after' query parameter.
     * @required
     * @var string $endCursor public property
     */
    public $endCursor;

    /**
     * True if there are more pages of results after this response.
     * @required
     * @var bool $hasNextPage public property
     */
    public $hasNextPage;

    /**
     * True if there are more pages of results before this response.
     * @required
     * @var bool $hasPrevPage public property
     */
    public $hasPrevPage;

    /**
     * Cursor identifier representing the first element in the response. This value should be used in
     * conjunction with a subsequent request's 'ending_before' query parameter.
     * @required
     * @var string $startCursor public property
     */
    public $startCursor;

    /**
     * Constructor to set initial or default values of member properties
     * @param string $endCursor   Initialization value for $this->endCursor
     * @param bool   $hasNextPage Initialization value for $this->hasNextPage
     * @param bool   $hasPrevPage Initialization value for $this->hasPrevPage
     * @param string $startCursor Initialization value for $this->startCursor
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->endCursor   = func_get_arg(0);
            $this->hasNextPage = func_get_arg(1);
            $this->hasPrevPage = func_get_arg(2);
            $this->startCursor = func_get_arg(3);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['endCursor']   = $this->endCursor;
        $json['hasNextPage'] = $this->hasNextPage;
        $json['hasPrevPage'] = $this->hasPrevPage;
        $json['startCursor'] = $this->startCursor;

        return $json;
    }
}
