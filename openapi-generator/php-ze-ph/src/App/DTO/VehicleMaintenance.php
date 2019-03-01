<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 */
class VehicleMaintenance
{
    /**
     * ID of the vehicle.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * @DTA\Data(field="j1939", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VehicleMaintenanceJ1939::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\VehicleMaintenanceJ1939::class})
     * @var \App\DTO\VehicleMaintenanceJ1939
     */
    public $j1939;
    /**
     * @DTA\Data(field="passenger", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VehicleMaintenancePassenger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\VehicleMaintenancePassenger::class})
     * @var \App\DTO\VehicleMaintenancePassenger
     */
    public $passenger;
}
