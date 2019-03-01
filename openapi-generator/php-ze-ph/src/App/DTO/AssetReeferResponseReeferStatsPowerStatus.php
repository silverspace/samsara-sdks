<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetReeferResponseReeferStatsPowerStatus
{
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @DTA\Data(field="changedAtMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $changed_at_ms;
    /**
     * Power status of the reefer.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $status;
}
