<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class HosLogsResponse
{
    /**
     * @DTA\Data(field="logs", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\HosLogsResponseLogs::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\HosLogsResponseLogs::class}}
     * }})
     * @var \App\DTO\HosLogsResponseLogs[]
     */
    public $logs;
}
