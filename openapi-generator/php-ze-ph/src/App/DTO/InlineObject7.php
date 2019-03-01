<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject7
{
    /**
     * Driver ID to query.
     * @DTA\Data(field="driverId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @DTA\Data(field="endMs")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $end_ms;
    /**
     * Group ID to query.
     * @DTA\Data(field="groupId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     * @DTA\Data(field="startMs")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $start_ms;
}
