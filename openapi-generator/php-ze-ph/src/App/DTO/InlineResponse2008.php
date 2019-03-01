<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineResponse2008
{
    /**
     * @DTA\Data(field="sensors", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\Sensor::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\Sensor::class}}
     * }})
     * @var \App\DTO\Sensor[]
     */
    public $sensors;
}
