<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TemperatureResponseSensors
{
    /**
     * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
     * @DTA\Data(field="probeTemperature", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $probe_temperature;
    /**
     * Name of the sensor.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * ID of the sensor.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * Currently reported ambient temperature in millidegrees celsius.
     * @DTA\Data(field="ambientTemperature", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $ambient_temperature;
}
