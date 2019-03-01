<?php
/**
 * FleetVehicleResponse
 */
namespace app\Models;

/**
 * FleetVehicleResponse
 */
class FleetVehicleResponse {

    /** @var map[string,string] $externalIds */
    private $externalIds;

    /** @var string $harshAccelSetting Harsh event detection setting.*/
    private $harshAccelSetting;

    /** @var int $id ID of the vehicle.*/
    private $id;

    /** @var string $name Name of the vehicle.*/
    private $name;

    /** @var \app\Models\FleetVehicleResponseVehicleInfo $vehicleInfo */
    private $vehicleInfo;

}
