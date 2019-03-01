goog.provide('API.Client.DoorResponse_sensors');

/**
 * @record
 */
API.Client.DoorResponseSensors = function() {}

/**
 * Flag indicating whether the current door is closed or open.
 * @type {!boolean}
 * @export
 */
API.Client.DoorResponseSensors.prototype.doorClosed;

/**
 * Name of the sensor.
 * @type {!string}
 * @export
 */
API.Client.DoorResponseSensors.prototype.name;

/**
 * ID of the sensor.
 * @type {!number}
 * @export
 */
API.Client.DoorResponseSensors.prototype.id;

