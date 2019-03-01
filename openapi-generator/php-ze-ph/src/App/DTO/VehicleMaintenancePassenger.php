<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Passenger vehicle data. Null if no data is available.
 */
class VehicleMaintenancePassenger
{
    /**
     * @DTA\Data(field="checkEngineLight", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VehicleMaintenancePassengerCheckEngineLight::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\VehicleMaintenancePassengerCheckEngineLight::class})
     * @var \App\DTO\VehicleMaintenancePassengerCheckEngineLight
     */
    public $check_engine_light;
    /**
     * Passenger vehicle DTCs.
     * @DTA\Data(field="diagnosticTroubleCodes", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\VehicleMaintenancePassengerDiagnosticTroubleCodes::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\VehicleMaintenancePassengerDiagnosticTroubleCodes::class}}
     * }})
     * @var \App\DTO\VehicleMaintenancePassengerDiagnosticTroubleCodes[]
     */
    public $diagnostic_trouble_codes;
}
