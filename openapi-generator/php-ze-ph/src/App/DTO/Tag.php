<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Tag
{
    /**
     * The addresses that belong to this tag.
     * @DTA\Data(field="addresses", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedAddress::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedAddress::class}}
     * }})
     * @var \App\DTO\TaggedAddress[]
     */
    public $addresses;
    /**
     * The assets that belong to this tag.
     * @DTA\Data(field="assets", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedAsset::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedAsset::class}}
     * }})
     * @var \App\DTO\TaggedAsset[]
     */
    public $assets;
    /**
     * The drivers that belong to this tag.
     * @DTA\Data(field="drivers", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedDriver::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedDriver::class}}
     * }})
     * @var \App\DTO\TaggedDriver[]
     */
    public $drivers;
    /**
     * The GroupID that this tag belongs to.
     * @DTA\Data(field="groupId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * The ID of this tag.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * The machines that belong to this tag.
     * @DTA\Data(field="machines", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedMachine::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedMachine::class}}
     * }})
     * @var \App\DTO\TaggedMachine[]
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
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedSensor::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedSensor::class}}
     * }})
     * @var \App\DTO\TaggedSensor[]
     */
    public $sensors;
    /**
     * The vehicles that belong to this tag.
     * @DTA\Data(field="vehicles", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TaggedVehicle::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TaggedVehicle::class}}
     * }})
     * @var \App\DTO\TaggedVehicle[]
     */
    public $vehicles;
}
