<?php
/**
 * TemperatureResponseSensors
 */
namespace app\Models;

/**
 * TemperatureResponseSensors
 */
class TemperatureResponseSensors {

    /** @var int $probeTemperature Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.*/
    private $probeTemperature;

    /** @var string $name Name of the sensor.*/
    private $name;

    /** @var int $id ID of the sensor.*/
    private $id;

    /** @var int $ambientTemperature Currently reported ambient temperature in millidegrees celsius.*/
    private $ambientTemperature;

}
