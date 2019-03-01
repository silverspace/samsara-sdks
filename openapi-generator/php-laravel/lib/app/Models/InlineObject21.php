<?php
/**
 * InlineObject21
 */
namespace app\Models;

/**
 * InlineObject21
 */
class InlineObject21 {

    /** @var int $endMs End of the time range, specified in milliseconds UNIX time.*/
    private $endMs;

    /** @var string $fillMissing */
    private $fillMissing;

    /** @var int $groupId Group ID to query.*/
    private $groupId;

    /** @var \app\Models\SensorsHistorySeries[] $series */
    private $series;

    /** @var int $startMs Beginning of the time range, specified in milliseconds UNIX time.*/
    private $startMs;

    /** @var int $stepMs Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.*/
    private $stepMs;

}
