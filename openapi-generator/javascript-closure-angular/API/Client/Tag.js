goog.provide('API.Client.Tag');

/**
 * @record
 */
API.Client.Tag = function() {}

/**
 * The addresses that belong to this tag.
 * @type {!Array<!API.Client.TaggedAddress>}
 * @export
 */
API.Client.Tag.prototype.addresses;

/**
 * The assets that belong to this tag.
 * @type {!Array<!API.Client.TaggedAsset>}
 * @export
 */
API.Client.Tag.prototype.assets;

/**
 * The drivers that belong to this tag.
 * @type {!Array<!API.Client.TaggedDriver>}
 * @export
 */
API.Client.Tag.prototype.drivers;

/**
 * The GroupID that this tag belongs to.
 * @type {!number}
 * @export
 */
API.Client.Tag.prototype.groupId;

/**
 * The ID of this tag.
 * @type {!number}
 * @export
 */
API.Client.Tag.prototype.id;

/**
 * The machines that belong to this tag.
 * @type {!Array<!API.Client.TaggedMachine>}
 * @export
 */
API.Client.Tag.prototype.machines;

/**
 * Name of this tag.
 * @type {!string}
 * @export
 */
API.Client.Tag.prototype.name;

/**
 * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 * @type {!number}
 * @export
 */
API.Client.Tag.prototype.parentTagId;

/**
 * The sensors that belong to this tag.
 * @type {!Array<!API.Client.TaggedSensor>}
 * @export
 */
API.Client.Tag.prototype.sensors;

/**
 * The vehicles that belong to this tag.
 * @type {!Array<!API.Client.TaggedVehicle>}
 * @export
 */
API.Client.Tag.prototype.vehicles;

