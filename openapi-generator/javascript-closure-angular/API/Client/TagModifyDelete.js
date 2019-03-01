goog.provide('API.Client.TagModify_delete');

/**
 * Specify devices, etc. that should be removed from the tag.
 * @record
 */
API.Client.TagModifyDelete = function() {}

/**
 * The assets to be removed from this tag.
 * @type {!Array<!API.Client.TaggedAssetBase>}
 * @export
 */
API.Client.TagModifyDelete.prototype.assets;

/**
 * The sensors to be removed from this tag.
 * @type {!Array<!API.Client.TaggedSensorBase>}
 * @export
 */
API.Client.TagModifyDelete.prototype.sensors;

/**
 * The vehicles to be removed from this tag.
 * @type {!Array<!API.Client.TaggedVehicleBase>}
 * @export
 */
API.Client.TagModifyDelete.prototype.vehicles;

/**
 * The machines to be removed from this tag.
 * @type {!Array<!API.Client.TaggedMachineBase>}
 * @export
 */
API.Client.TagModifyDelete.prototype.machines;

/**
 * The drivers to be removed from this tag.
 * @type {!Array<!API.Client.TaggedDriverBase>}
 * @export
 */
API.Client.TagModifyDelete.prototype.drivers;

