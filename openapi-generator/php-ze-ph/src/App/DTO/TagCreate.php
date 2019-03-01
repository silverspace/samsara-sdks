<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TagCreate
{
    /**
     * The assets that belong to this tag.
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
     * The drivers that belong to this tag.
     * @DTA\Data(field="drivers", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedDriverBase::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedDriverBase::class}}
     * }})
     * @var \App\DTO\TaggedDriverBase[]
     */
    public $drivers;
    /**
     * The machines that belong to this tag.
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
     * Name of this tag.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
     * @DTA\Data(field="parentTagId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $parent_tag_id;
    /**
     * The sensors that belong to this tag.
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
     * The vehicles that belong to this tag.
     * @DTA\Data(field="vehicles", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedVehicleBase::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedVehicleBase::class}}
     * }})
     * @var \App\DTO\TaggedVehicleBase[]
     */
    public $vehicles;
}
