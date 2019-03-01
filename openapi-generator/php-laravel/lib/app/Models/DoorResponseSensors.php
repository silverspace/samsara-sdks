<?php
/**
 * DoorResponseSensors
 */
namespace app\Models;

/**
 * DoorResponseSensors
 */
class DoorResponseSensors {

    /** @var bool $doorClosed Flag indicating whether the current door is closed or open.*/
    private $doorClosed;

    /** @var string $name Name of the sensor.*/
    private $name;

    /** @var int $id ID of the sensor.*/
    private $id;

}
