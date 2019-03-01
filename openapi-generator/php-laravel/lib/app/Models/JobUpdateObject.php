<?php
/**
 * JobUpdateObject
 */
namespace app\Models;

/**
 * JobUpdateObject
 */
class JobUpdateObject {

    /** @var int $changedAtMs Timestamp that this event was updated, represented as Unix milliseconds since epoch.*/
    private $changedAtMs;

    /** @var int $jobId ID of the Samsara job.*/
    private $jobId;

    /** @var \app\Models\JobStatus $jobState */
    private $jobState;

    /** @var \app\Models\PrevJobStatus $prevJobState */
    private $prevJobState;

    /** @var \app\Models\DispatchRoute $route */
    private $route;

    /** @var int $routeId ID of the Samsara dispatch route.*/
    private $routeId;

}
