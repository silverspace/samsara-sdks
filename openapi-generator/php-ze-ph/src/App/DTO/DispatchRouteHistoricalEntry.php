<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DispatchRouteHistoricalEntry
{
    /**
     * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
     * @DTA\Data(field="changed_at_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $changed_at_ms;
    /**
     * @DTA\Data(field="route", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DispatchRoute::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\DispatchRoute::class})
     * @var \App\DTO\DispatchRoute
     */
    public $route;
}
