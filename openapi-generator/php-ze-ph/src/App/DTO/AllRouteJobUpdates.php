<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AllRouteJobUpdates
{
    /**
     * @DTA\Data(field="job_updates", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\JobUpdateObject::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\JobUpdateObject::class}}
     * }})
     * @var \App\DTO\JobUpdateObject[]
     */
    public $job_updates;
    /**
     * Sequence ID of the last update returned in the response
     * @DTA\Data(field="sequence_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $sequence_id;
}
