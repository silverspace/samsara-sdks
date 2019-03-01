<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Contains the results for a machine history request
 */
class MachineHistoryResponse
{
    /**
     * @DTA\Data(field="machines", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\MachineHistoryResponseMachines::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\MachineHistoryResponseMachines::class}}
     * }})
     * @var \App\DTO\MachineHistoryResponseMachines[]
     */
    public $machines;
}
