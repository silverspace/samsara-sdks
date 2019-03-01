<?php
/**
 * VehicleMaintenance
 */
namespace app\Models;

/**
 * VehicleMaintenance
 */
class VehicleMaintenance {

    /** @var int $id ID of the vehicle.*/
    private $id;

    /** @var \app\Models\VehicleMaintenanceJ1939 $j1939 */
    private $j1939;

    /** @var \app\Models\VehicleMaintenancePassenger $passenger */
    private $passenger;

}
