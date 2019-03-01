<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * J1939 check engine lights.
 */
class VehicleMaintenanceJ1939CheckEngineLight
{
    /**
     * @DTA\Data(field="protectIsOn", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $protect_is_on;
    /**
     * @DTA\Data(field="stopIsOn", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $stop_is_on;
    /**
     * @DTA\Data(field="warningIsOn", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $warning_is_on;
    /**
     * @DTA\Data(field="emissionsIsOn", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $emissions_is_on;
}
