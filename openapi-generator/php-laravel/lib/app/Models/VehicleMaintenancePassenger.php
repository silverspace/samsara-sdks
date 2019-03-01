<?php
/**
 * VehicleMaintenancePassenger
 */
namespace app\Models;

/**
 * VehicleMaintenancePassenger
 */
class VehicleMaintenancePassenger {

    /** @var \app\Models\VehicleMaintenancePassengerCheckEngineLight $checkEngineLight */
    private $checkEngineLight;

    /** @var \app\Models\VehicleMaintenancePassengerDiagnosticTroubleCodes[] $diagnosticTroubleCodes Passenger vehicle DTCs.*/
    private $diagnosticTroubleCodes;

}
