<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MachineHistoryResponseMachines
{
    /**
     * Machine name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * Machine ID
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
     * @DTA\Data(field="vibrations", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\MachineHistoryResponseVibrations::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\MachineHistoryResponseVibrations::class}}
     * }})
     * @var \App\DTO\MachineHistoryResponseVibrations[]
     */
    public $vibrations;
}
