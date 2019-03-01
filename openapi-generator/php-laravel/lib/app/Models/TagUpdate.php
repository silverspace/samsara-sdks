<?php
/**
 * TagUpdate
 */
namespace app\Models;

/**
 * TagUpdate
 */
class TagUpdate {

    /** @var \app\Models\TaggedAssetBase[] $assets The assets that belong to this tag.*/
    private $assets;

    /** @var \app\Models\TaggedDriverBase[] $drivers The drivers that belong to this tag.*/
    private $drivers;

    /** @var \app\Models\TaggedMachineBase[] $machines The machines that belong to this tag.*/
    private $machines;

    /** @var string $name Updated name of this tag.*/
    private $name;

    /** @var int $parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.*/
    private $parentTagId;

    /** @var \app\Models\TaggedSensorBase[] $sensors The sensors that belong to this tag.*/
    private $sensors;

    /** @var \app\Models\TaggedVehicleBase[] $vehicles The vehicles that belong to this tag.*/
    private $vehicles;

}
