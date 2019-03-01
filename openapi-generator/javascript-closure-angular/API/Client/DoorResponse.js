goog.provide('API.Client.DoorResponse');

/**
 * Contains the current door status of a sensor.
 * @record
 */
API.Client.DoorResponse = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.DoorResponse.prototype.groupId;

/**
 * @type {!Array<!API.Client.DoorResponse_sensors>}
 * @export
 */
API.Client.DoorResponse.prototype.sensors;

