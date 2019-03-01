<?php
/**
 * Tag
 */
namespace app\Models;

/**
 * Tag
 */
class Tag {

    /** @var \app\Models\TaggedAddress[] $addresses The addresses that belong to this tag.*/
    private $addresses;

    /** @var \app\Models\TaggedAsset[] $assets The assets that belong to this tag.*/
    private $assets;

    /** @var \app\Models\TaggedDriver[] $drivers The drivers that belong to this tag.*/
    private $drivers;

    /** @var int $groupId The GroupID that this tag belongs to.*/
    private $groupId;

    /** @var int $id The ID of this tag.*/
    private $id;

    /** @var \app\Models\TaggedMachine[] $machines The machines that belong to this tag.*/
    private $machines;

    /** @var string $name Name of this tag.*/
    private $name;

    /** @var int $parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.*/
    private $parentTagId;

    /** @var \app\Models\TaggedSensor[] $sensors The sensors that belong to this tag.*/
    private $sensors;

    /** @var \app\Models\TaggedVehicle[] $vehicles The vehicles that belong to this tag.*/
    private $vehicles;

}
