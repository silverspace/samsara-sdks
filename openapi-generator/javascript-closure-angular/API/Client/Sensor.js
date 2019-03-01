goog.provide('API.Client.Sensor');

/**
 * Contains information about a sensor.
 * @record
 */
API.Client.Sensor = function() {}

/**
 * ID of the sensor.
 * @type {!number}
 * @export
 */
API.Client.Sensor.prototype.id;

/**
 * MAC address of the sensor.
 * @type {!string}
 * @export
 */
API.Client.Sensor.prototype.macAddress;

/**
 * Name of the sensor.
 * @type {!string}
 * @export
 */
API.Client.Sensor.prototype.name;

