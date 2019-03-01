<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * J1939 based data. Null if no data is available.
 */
class VehicleMaintenanceJ1939
{
    /**
     * @DTA\Data(field="checkEngineLight", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VehicleMaintenanceJ1939CheckEngineLight::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\VehicleMaintenanceJ1939CheckEngineLight::class})
     * @var \App\DTO\VehicleMaintenanceJ1939CheckEngineLight
     */
    public $check_engine_light;
    /**
     * J1939 DTCs.
     * @DTA\Data(field="diagnosticTroubleCodes", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\VehicleMaintenanceJ1939DiagnosticTroubleCodes::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\VehicleMaintenanceJ1939DiagnosticTroubleCodes::class}}
     * }})
     * @var \App\DTO\VehicleMaintenanceJ1939DiagnosticTroubleCodes[]
     */
    public $diagnostic_trouble_codes;
}
