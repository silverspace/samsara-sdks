<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetReeferResponseReeferStats
{
    /**
     * Fuel percentage of the reefer
     * @DTA\Data(field="fuelPercentage", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetReeferResponseReeferStatsFuelPercentage::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetReeferResponseReeferStatsFuelPercentage::class}}
     * }})
     * @var \App\DTO\AssetReeferResponseReeferStatsFuelPercentage[]
     */
    public $fuel_percentage;
    /**
     * Power status of the reefer
     * @DTA\Data(field="powerStatus", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetReeferResponseReeferStatsPowerStatus::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetReeferResponseReeferStatsPowerStatus::class}}
     * }})
     * @var \App\DTO\AssetReeferResponseReeferStatsPowerStatus[]
     */
    public $power_status;
    /**
     * Engine hours of the reefer
     * @DTA\Data(field="engineHours", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetReeferResponseReeferStatsEngineHours::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetReeferResponseReeferStatsEngineHours::class}}
     * }})
     * @var \App\DTO\AssetReeferResponseReeferStatsEngineHours[]
     */
    public $engine_hours;
    /**
     * Set point temperature of the reefer
     * @DTA\Data(field="setPoint", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetReeferResponseReeferStatsSetPoint::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetReeferResponseReeferStatsSetPoint::class}}
     * }})
     * @var \App\DTO\AssetReeferResponseReeferStatsSetPoint[]
     */
    public $set_point;
    /**
     * Return air temperature of the reefer
     * @DTA\Data(field="returnAirTemp", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetReeferResponseReeferStatsReturnAirTemp::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetReeferResponseReeferStatsReturnAirTemp::class}}
     * }})
     * @var \App\DTO\AssetReeferResponseReeferStatsReturnAirTemp[]
     */
    public $return_air_temp;
    /**
     * Reefer alarms
     * @DTA\Data(field="alarms", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetReeferResponseReeferStatsAlarms1::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetReeferResponseReeferStatsAlarms1::class}}
     * }})
     * @var \App\DTO\AssetReeferResponseReeferStatsAlarms1[]
     */
    public $alarms;
}
