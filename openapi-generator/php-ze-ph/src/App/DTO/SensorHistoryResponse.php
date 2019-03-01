<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 */
class SensorHistoryResponse
{
    /**
     * @DTA\Data(field="results", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\SensorHistoryResponseResults::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\SensorHistoryResponseResults::class}}
     * }})
     * @var \App\DTO\SensorHistoryResponseResults[]
     */
    public $results;
}
