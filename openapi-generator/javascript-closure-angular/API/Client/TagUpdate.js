goog.provide('API.Client.TagUpdate');

/**
 * @record
 */
API.Client.TagUpdate = function() {}

/**
 * The assets that belong to this tag.
 * @type {!Array<!API.Client.TaggedAssetBase>}
 * @export
 */
API.Client.TagUpdate.prototype.assets;

/**
 * The drivers that belong to this tag.
 * @type {!Array<!API.Client.TaggedDriverBase>}
 * @export
 */
API.Client.TagUpdate.prototype.drivers;

/**
 * The machines that belong to this tag.
 * @type {!Array<!API.Client.TaggedMachineBase>}
 * @export
 */
API.Client.TagUpdate.prototype.machines;

/**
 * Updated name of this tag.
 * @type {!string}
 * @export
 */
API.Client.TagUpdate.prototype.name;

/**
 * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 * @type {!number}
 * @export
 */
API.Client.TagUpdate.prototype.parentTagId;

/**
 * The sensors that belong to this tag.
 * @type {!Array<!API.Client.TaggedSensorBase>}
 * @export
 */
API.Client.TagUpdate.prototype.sensors;

/**
 * The vehicles that belong to this tag.
 * @type {!Array<!API.Client.TaggedVehicleBase>}
 * @export
 */
API.Client.TagUpdate.prototype.vehicles;

