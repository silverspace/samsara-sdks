<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A vehicle object as returned for fleet/vehicle
 */
class FleetVehicleResponse
{
    /**
     * @DTA\Data(field="externalIds", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var map[string,string]
     */
    public $external_ids;
    /**
     * Harsh event detection setting.
     * @DTA\Data(field="harshAccelSetting", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $harsh_accel_setting;
    /**
     * ID of the vehicle.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * Name of the vehicle.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * @DTA\Data(field="vehicleInfo", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FleetVehicleResponseVehicleInfo::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\FleetVehicleResponseVehicleInfo::class})
     * @var \App\DTO\FleetVehicleResponseVehicleInfo
     */
    public $vehicle_info;
}
