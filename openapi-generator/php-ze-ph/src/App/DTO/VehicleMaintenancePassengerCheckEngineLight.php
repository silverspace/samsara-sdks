<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Passenger vehicle check engine light.
 */
class VehicleMaintenancePassengerCheckEngineLight
{
    /**
     * @DTA\Data(field="isOn", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $is_on;
}
