<?php
/**
 * AssetReeferResponse
 */
namespace app\Models;

/**
 * AssetReeferResponse
 */
class AssetReeferResponse {

    /** @var string $assetType Asset type*/
    private $assetType;

    /** @var int $id Asset ID*/
    private $id;

    /** @var string $name Asset name*/
    private $name;

    /** @var \app\Models\AssetReeferResponseReeferStats $reeferStats */
    private $reeferStats;

}
