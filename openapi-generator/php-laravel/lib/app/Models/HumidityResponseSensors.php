<?php
/**
 * HumidityResponseSensors
 */
namespace app\Models;

/**
 * HumidityResponseSensors
 */
class HumidityResponseSensors {

    /** @var string $name Name of the sensor.*/
    private $name;

    /** @var int $humidity Currently reported relative humidity in percent, from 0-100.*/
    private $humidity;

    /** @var int $id ID of the sensor.*/
    private $id;

}
