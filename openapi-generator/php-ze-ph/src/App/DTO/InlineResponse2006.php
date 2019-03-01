<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineResponse2006
{
    /**
     * @DTA\Data(field="dataInputs", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\DataInputHistoryResponse::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\DataInputHistoryResponse::class}}
     * }})
     * @var \App\DTO\DataInputHistoryResponse[]
     */
    public $data_inputs;
}
