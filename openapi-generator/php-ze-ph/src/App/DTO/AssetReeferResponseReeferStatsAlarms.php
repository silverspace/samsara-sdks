<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetReeferResponseReeferStatsAlarms
{
    /**
     * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
     * @DTA\Data(field="severity", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $severity;
    /**
     * Recommended operator action
     * @DTA\Data(field="operatorAction", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $operator_action;
    /**
     * Description of the alarm
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $description;
    /**
     * ID of the alarm
     * @DTA\Data(field="alarmCode", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $alarm_code;
}
