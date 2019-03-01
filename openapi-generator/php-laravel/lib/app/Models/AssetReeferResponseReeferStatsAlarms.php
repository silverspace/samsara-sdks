<?php
/**
 * AssetReeferResponseReeferStatsAlarms
 */
namespace app\Models;

/**
 * AssetReeferResponseReeferStatsAlarms
 */
class AssetReeferResponseReeferStatsAlarms {

    /** @var int $severity Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action*/
    private $severity;

    /** @var string $operatorAction Recommended operator action*/
    private $operatorAction;

    /** @var string $description Description of the alarm*/
    private $description;

    /** @var int $alarmCode ID of the alarm*/
    private $alarmCode;

}
