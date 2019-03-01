<?php
/**
 * MachineHistoryResponseMachines
 */
namespace app\Models;

/**
 * MachineHistoryResponseMachines
 */
class MachineHistoryResponseMachines {

    /** @var string $name Machine name*/
    private $name;

    /** @var int $id Machine ID*/
    private $id;

    /** @var \app\Models\MachineHistoryResponseVibrations[] $vibrations List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s*/
    private $vibrations;

}
