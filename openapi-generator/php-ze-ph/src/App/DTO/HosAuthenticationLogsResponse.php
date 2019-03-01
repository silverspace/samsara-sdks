<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class HosAuthenticationLogsResponse
{
    /**
     * @DTA\Data(field="authenticationLogs", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\HosAuthenticationLogsResponseAuthenticationLogs::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\HosAuthenticationLogsResponseAuthenticationLogs::class}}
     * }})
     * @var \App\DTO\HosAuthenticationLogsResponseAuthenticationLogs[]
     */
    public $authentication_logs;
}
