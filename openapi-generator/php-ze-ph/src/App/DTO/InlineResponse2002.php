<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineResponse2002
{
    /**
     * @DTA\Data(field="pagination", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Pagination::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\Pagination::class})
     * @var \App\DTO\Pagination
     */
    public $pagination;
    /**
     * Group ID to query.
     * @DTA\Data(field="groupId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * @DTA\Data(field="vehicles", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\Vehicle::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\Vehicle::class}}
     * }})
     * @var \App\DTO\Vehicle[]
     */
    public $vehicles;
}
