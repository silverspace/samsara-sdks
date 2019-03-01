<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetReeferResponseReeferStatsEngineHours
{
    /**
     * Engine hours of the reefer.
     * @DTA\Data(field="engineHours", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $engine_hours;
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @DTA\Data(field="changedAtMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $changed_at_ms;
}
