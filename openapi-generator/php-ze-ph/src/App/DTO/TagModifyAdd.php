<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Specify devices, etc. that should be added to the tag.
 */
class TagModifyAdd
{
    /**
     * The assets to be added to this tag.
     * @DTA\Data(field="assets", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedAssetBase::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedAssetBase::class}}
     * }})
     * @var \App\DTO\TaggedAssetBase[]
     */
    public $assets;
    /**
     * The sensors to be added to this tag.
     * @DTA\Data(field="sensors", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedSensorBase::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedSensorBase::class}}
     * }})
     * @var \App\DTO\TaggedSensorBase[]
     */
    public $sensors;
    /**
     * The vehicles to be added to this tag.
     * @DTA\Data(field="vehicles", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedVehicleBase::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedVehicleBase::class}}
     * }})
     * @var \App\DTO\TaggedVehicleBase[]
     */
    public $vehicles;
    /**
     * The machines to be added to this tag.
     * @DTA\Data(field="machines", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedMachineBase::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedMachineBase::class}}
     * }})
     * @var \App\DTO\TaggedMachineBase[]
     */
    public $machines;
    /**
     * The drivers to be added to this tag.
     * @DTA\Data(field="drivers", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedDriverBase::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedDriverBase::class}}
     * }})
     * @var \App\DTO\TaggedDriverBase[]
     */
    public $drivers;
}
