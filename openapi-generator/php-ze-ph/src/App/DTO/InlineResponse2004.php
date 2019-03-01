<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineResponse2004
{
    /**
     * @DTA\Data(field="vehicles", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\VehicleMaintenance::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\VehicleMaintenance::class}}
     * }})
     * @var \App\DTO\VehicleMaintenance[]
     */
    public $vehicles;
}
