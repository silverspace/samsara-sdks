<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetReeferResponseReeferStatsFuelPercentage
{
    /**
     * Fuel percentage of the reefer.
     * @DTA\Data(field="fuelPercentage", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $fuel_percentage;
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @DTA\Data(field="changedAtMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $changed_at_ms;
}
