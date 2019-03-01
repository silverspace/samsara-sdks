<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Sensor ID and field to query.
 */
class SensorsHistorySeries
{
    /**
     * Field to query.
     * @DTA\Data(field="field")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $field;
    /**
     * Sensor ID to query.
     * @DTA\Data(field="widgetId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $widget_id;
}
