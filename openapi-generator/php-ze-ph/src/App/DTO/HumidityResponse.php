<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Contains the current humidity of a sensor.
 */
class HumidityResponse
{
    /**
     * @DTA\Data(field="groupId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * @DTA\Data(field="sensors", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\HumidityResponseSensors::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\HumidityResponseSensors::class}}
     * }})
     * @var \App\DTO\HumidityResponseSensors[]
     */
    public $sensors;
}
