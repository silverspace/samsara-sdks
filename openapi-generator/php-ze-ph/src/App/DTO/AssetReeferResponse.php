<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Reefer-specific asset details
 */
class AssetReeferResponse
{
    /**
     * Asset type
     * @DTA\Data(field="assetType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $asset_type;
    /**
     * Asset ID
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * Asset name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * @DTA\Data(field="reeferStats", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssetReeferResponseReeferStats::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\AssetReeferResponseReeferStats::class})
     * @var \App\DTO\AssetReeferResponseReeferStats
     */
    public $reefer_stats;
}
