<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VehicleMaintenanceJ1939DiagnosticTroubleCodes
{
    /**
     * @DTA\Data(field="spnDescription", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $spn_description;
    /**
     * @DTA\Data(field="fmiText", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $fmi_text;
    /**
     * @DTA\Data(field="spnId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $spn_id;
    /**
     * @DTA\Data(field="occurrenceCount", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $occurrence_count;
    /**
     * @DTA\Data(field="txId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $tx_id;
    /**
     * @DTA\Data(field="fmiId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $fmi_id;
}
