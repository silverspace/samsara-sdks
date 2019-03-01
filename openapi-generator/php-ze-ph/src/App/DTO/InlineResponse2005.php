<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineResponse2005
{
    /**
     * @DTA\Data(field="pagination", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Pagination::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\Pagination::class})
     * @var \App\DTO\Pagination
     */
    public $pagination;
    /**
     * @DTA\Data(field="vehicleStats")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\InlineResponse2005VehicleStats::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\InlineResponse2005VehicleStats::class}}
     * }})
     * @var \App\DTO\InlineResponse2005VehicleStats[]
     */
    public $vehicle_stats;
}
