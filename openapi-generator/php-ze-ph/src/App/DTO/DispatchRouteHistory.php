<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DispatchRouteHistory
{
    /**
     * History of the route&#39;s state changes.
     * @DTA\Data(field="history", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\DispatchRouteHistoricalEntry::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\DispatchRouteHistoricalEntry::class}}
     * }})
     * @var \App\DTO\DispatchRouteHistoricalEntry[]
     */
    public $history;
}
