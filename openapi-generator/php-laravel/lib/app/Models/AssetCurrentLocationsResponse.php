<?php
/**
 * AssetCurrentLocationsResponse
 */
namespace app\Models;

/**
 * AssetCurrentLocationsResponse
 */
class AssetCurrentLocationsResponse {

    /** @var \app\Models\AssetCable[] $cable The cable connected to the asset*/
    private $cable;

    /** @var int $engineHours Engine hours*/
    private $engineHours;

    /** @var int $id Asset ID*/
    private $id;

    /** @var \app\Models\AssetCurrentLocation[] $location Current location of an asset*/
    private $location;

    /** @var string $name Asset name*/
    private $name;

}
