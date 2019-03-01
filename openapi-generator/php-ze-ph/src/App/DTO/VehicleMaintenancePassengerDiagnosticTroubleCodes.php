<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VehicleMaintenancePassengerDiagnosticTroubleCodes
{
    /**
     * @DTA\Data(field="dtcShortCode", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $dtc_short_code;
    /**
     * @DTA\Data(field="dtcId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $dtc_id;
    /**
     * @DTA\Data(field="dtcDescription", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $dtc_description;
}
