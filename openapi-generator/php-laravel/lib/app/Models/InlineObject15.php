<?php
/**
 * InlineObject15
 */
namespace app\Models;

/**
 * InlineObject15
 */
class InlineObject15 {

    /** @var int $endMs End of the time range, specified in milliseconds UNIX time.*/
    private $endMs;

    /** @var int $groupId Group ID to query.*/
    private $groupId;

    /** @var int $startMs Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs*/
    private $startMs;

    /** @var int $vehicleId Vehicle ID to query.*/
    private $vehicleId;

}
