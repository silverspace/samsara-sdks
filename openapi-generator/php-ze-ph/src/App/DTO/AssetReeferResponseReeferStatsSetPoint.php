<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetReeferResponseReeferStatsSetPoint
{
    /**
     * Set point temperature in millidegree Celsius.
     * @DTA\Data(field="tempInMilliC", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $temp_in_milli_c;
    /**
     * Timestamp in Unix milliseconds since epoch.
     * @DTA\Data(field="changedAtMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $changed_at_ms;
}
