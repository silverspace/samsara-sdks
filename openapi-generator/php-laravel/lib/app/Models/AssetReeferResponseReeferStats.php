<?php
/**
 * AssetReeferResponseReeferStats
 */
namespace app\Models;

/**
 * AssetReeferResponseReeferStats
 */
class AssetReeferResponseReeferStats {

    /** @var \app\Models\AssetReeferResponseReeferStatsFuelPercentage[] $fuelPercentage Fuel percentage of the reefer*/
    private $fuelPercentage;

    /** @var \app\Models\AssetReeferResponseReeferStatsPowerStatus[] $powerStatus Power status of the reefer*/
    private $powerStatus;

    /** @var \app\Models\AssetReeferResponseReeferStatsEngineHours[] $engineHours Engine hours of the reefer*/
    private $engineHours;

    /** @var \app\Models\AssetReeferResponseReeferStatsSetPoint[] $setPoint Set point temperature of the reefer*/
    private $setPoint;

    /** @var \app\Models\AssetReeferResponseReeferStatsReturnAirTemp[] $returnAirTemp Return air temperature of the reefer*/
    private $returnAirTemp;

    /** @var \app\Models\AssetReeferResponseReeferStatsAlarms1[] $alarms Reefer alarms*/
    private $alarms;

}
