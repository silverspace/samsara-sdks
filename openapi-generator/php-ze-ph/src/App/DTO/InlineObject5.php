<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject5
{
    /**
     * End time (ms) of queried time period.
     * @DTA\Data(field="endMs")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $end_ms;
    /**
     * Org ID to query.
     * @DTA\Data(field="orgId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $org_id;
    /**
     * Start time (ms) of queried time period.
     * @DTA\Data(field="startMs")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $start_ms;
}
