<?php
/**
 * TagModifyDelete
 */
namespace app\Models;

/**
 * TagModifyDelete
 */
class TagModifyDelete {

    /** @var \app\Models\TaggedAssetBase[] $assets The assets to be removed from this tag.*/
    private $assets;

    /** @var \app\Models\TaggedSensorBase[] $sensors The sensors to be removed from this tag.*/
    private $sensors;

    /** @var \app\Models\TaggedVehicleBase[] $vehicles The vehicles to be removed from this tag.*/
    private $vehicles;

    /** @var \app\Models\TaggedMachineBase[] $machines The machines to be removed from this tag.*/
    private $machines;

    /** @var \app\Models\TaggedDriverBase[] $drivers The drivers to be removed from this tag.*/
    private $drivers;

}
