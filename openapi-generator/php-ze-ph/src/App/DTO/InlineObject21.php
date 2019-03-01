<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject21
{
    /**
     * End of the time range, specified in milliseconds UNIX time.
     * @DTA\Data(field="endMs")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $end_ms;
    /**
     * @DTA\Data(field="fillMissing", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $fill_missing;
    /**
     * Group ID to query.
     * @DTA\Data(field="groupId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * @DTA\Data(field="series")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\SensorsHistorySeries::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\SensorsHistorySeries::class}}
     * }})
     * @var \App\DTO\SensorsHistorySeries[]
     */
    public $series;
    /**
     * Beginning of the time range, specified in milliseconds UNIX time.
     * @DTA\Data(field="startMs")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $start_ms;
    /**
     * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
     * @DTA\Data(field="stepMs")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $step_ms;
}
