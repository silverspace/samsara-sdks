<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class JobUpdateObject
{
    /**
     * Timestamp that this event was updated, represented as Unix milliseconds since epoch.
     * @DTA\Data(field="changed_at_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $changed_at_ms;
    /**
     * ID of the Samsara job.
     * @DTA\Data(field="job_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $job_id;
    /**
     * @DTA\Data(field="job_state", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\JobStatus::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\JobStatus::class})
     * @var \App\DTO\JobStatus
     */
    public $job_state;
    /**
     * @DTA\Data(field="prev_job_state", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PrevJobStatus::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\PrevJobStatus::class})
     * @var \App\DTO\PrevJobStatus
     */
    public $prev_job_state;
    /**
     * @DTA\Data(field="route", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DispatchRoute::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\DispatchRoute::class})
     * @var \App\DTO\DispatchRoute
     */
    public $route;
    /**
     * ID of the Samsara dispatch route.
     * @DTA\Data(field="route_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $route_id;
}
