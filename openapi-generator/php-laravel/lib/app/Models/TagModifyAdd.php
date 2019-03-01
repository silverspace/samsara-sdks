<?php
/**
 * TagModifyAdd
 */
namespace app\Models;

/**
 * TagModifyAdd
 */
class TagModifyAdd {

    /** @var \app\Models\TaggedAssetBase[] $assets The assets to be added to this tag.*/
    private $assets;

    /** @var \app\Models\TaggedSensorBase[] $sensors The sensors to be added to this tag.*/
    private $sensors;

    /** @var \app\Models\TaggedVehicleBase[] $vehicles The vehicles to be added to this tag.*/
    private $vehicles;

    /** @var \app\Models\TaggedMachineBase[] $machines The machines to be added to this tag.*/
    private $machines;

    /** @var \app\Models\TaggedDriverBase[] $drivers The drivers to be added to this tag.*/
    private $drivers;

}
