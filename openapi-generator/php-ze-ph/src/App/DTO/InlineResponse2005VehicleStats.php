<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineResponse2005VehicleStats
{
    /**
     * @DTA\Data(field="engineState", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\EngineState::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\EngineState::class}}
     * }})
     * @var \App\DTO\EngineState[]
     */
    public $engine_state;
    /**
     * @DTA\Data(field="auxInput2", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuxInputSeries::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\AuxInputSeries::class})
     * @var \App\DTO\AuxInputSeries
     */
    public $aux_input2;
    /**
     * ID of the vehicle.
     * @DTA\Data(field="vehicleId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $vehicle_id;
    /**
     * @DTA\Data(field="auxInput1", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuxInputSeries::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\AuxInputSeries::class})
     * @var \App\DTO\AuxInputSeries
     */
    public $aux_input1;
}
