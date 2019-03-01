goog.provide('API.Client.TagModify_add');

/**
 * Specify devices, etc. that should be added to the tag.
 * @record
 */
API.Client.TagModifyAdd = function() {}

/**
 * The assets to be added to this tag.
 * @type {!Array<!API.Client.TaggedAssetBase>}
 * @export
 */
API.Client.TagModifyAdd.prototype.assets;

/**
 * The sensors to be added to this tag.
 * @type {!Array<!API.Client.TaggedSensorBase>}
 * @export
 */
API.Client.TagModifyAdd.prototype.sensors;

/**
 * The vehicles to be added to this tag.
 * @type {!Array<!API.Client.TaggedVehicleBase>}
 * @export
 */
API.Client.TagModifyAdd.prototype.vehicles;

/**
 * The machines to be added to this tag.
 * @type {!Array<!API.Client.TaggedMachineBase>}
 * @export
 */
API.Client.TagModifyAdd.prototype.machines;

/**
 * The drivers to be added to this tag.
 * @type {!Array<!API.Client.TaggedDriverBase>}
 * @export
 */
API.Client.TagModifyAdd.prototype.drivers;

