<?php
/**
 * Asset
 */
namespace app\Models;

/**
 * Asset
 */
class Asset {

    /** @var string $assetSerialNumber Serial number of the host asset*/
    private $assetSerialNumber;

    /** @var \app\Models\AssetCable[] $cable The cable connected to the asset*/
    private $cable;

    /** @var int $engineHours Engine hours*/
    private $engineHours;

    /** @var int $id Asset ID*/
    private $id;

    /** @var string $name Asset name*/
    private $name;

}
