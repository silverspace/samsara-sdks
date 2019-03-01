goog.provide('API.Client.TagCreate');

/**
 * @record
 */
API.Client.TagCreate = function() {}

/**
 * The assets that belong to this tag.
 * @type {!Array<!API.Client.TaggedAssetBase>}
 * @export
 */
API.Client.TagCreate.prototype.assets;

/**
 * The drivers that belong to this tag.
 * @type {!Array<!API.Client.TaggedDriverBase>}
 * @export
 */
API.Client.TagCreate.prototype.drivers;

/**
 * The machines that belong to this tag.
 * @type {!Array<!API.Client.TaggedMachineBase>}
 * @export
 */
API.Client.TagCreate.prototype.machines;

/**
 * Name of this tag.
 * @type {!string}
 * @export
 */
API.Client.TagCreate.prototype.name;

/**
 * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 * @type {!number}
 * @export
 */
API.Client.TagCreate.prototype.parentTagId;

/**
 * The sensors that belong to this tag.
 * @type {!Array<!API.Client.TaggedSensorBase>}
 * @export
 */
API.Client.TagCreate.prototype.sensors;

/**
 * The vehicles that belong to this tag.
 * @type {!Array<!API.Client.TaggedVehicleBase>}
 * @export
 */
API.Client.TagCreate.prototype.vehicles;

