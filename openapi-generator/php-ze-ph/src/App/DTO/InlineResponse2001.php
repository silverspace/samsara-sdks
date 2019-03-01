<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineResponse2001
{
    /**
     * @DTA\Data(field="assets", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AssetCurrentLocationsResponse::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AssetCurrentLocationsResponse::class}}
     * }})
     * @var \App\DTO\AssetCurrentLocationsResponse[]
     */
    public $assets;
}
