<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Basic information of an asset
 */
class AssetCurrentLocationsResponse
{
    /**
     * The cable connected to the asset
     * @DTA\Data(field="cable", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetCable::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetCable::class}}
     * }})
     * @var \App\DTO\AssetCable[]
     */
    public $cable;
    /**
     * Engine hours
     * @DTA\Data(field="engineHours", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $engine_hours;
    /**
     * Asset ID
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * Current location of an asset
     * @DTA\Data(field="location", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetCurrentLocation::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetCurrentLocation::class}}
     * }})
     * @var \App\DTO\AssetCurrentLocation[]
     */
    public $location;
    /**
     * Asset name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
}
