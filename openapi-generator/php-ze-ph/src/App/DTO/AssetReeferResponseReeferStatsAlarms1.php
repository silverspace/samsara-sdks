<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetReeferResponseReeferStatsAlarms1
{
    /**
     * @DTA\Data(field="alarms", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetReeferResponseReeferStatsAlarms::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetReeferResponseReeferStatsAlarms::class}}
     * }})
     * @var \App\DTO\AssetReeferResponseReeferStatsAlarms[]
     */
    public $alarms;
    /**
     * Timestamp when the alarms were reported, in Unix milliseconds since epoch
     * @DTA\Data(field="changedAtMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $changed_at_ms;
}
