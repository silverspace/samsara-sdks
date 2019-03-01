<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject14
{
    /**
     * Group ID to query.
     * @DTA\Data(field="groupId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * @DTA\Data(field="vehicles")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\Vehicle::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\Vehicle::class}}
     * }})
     * @var \App\DTO\Vehicle[]
     */
    public $vehicles;
}
