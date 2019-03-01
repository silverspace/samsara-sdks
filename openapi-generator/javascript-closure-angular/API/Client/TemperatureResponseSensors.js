goog.provide('API.Client.TemperatureResponse_sensors');

/**
 * @record
 */
API.Client.TemperatureResponseSensors = function() {}

/**
 * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
 * @type {!number}
 * @export
 */
API.Client.TemperatureResponseSensors.prototype.probeTemperature;

/**
 * Name of the sensor.
 * @type {!string}
 * @export
 */
API.Client.TemperatureResponseSensors.prototype.name;

/**
 * ID of the sensor.
 * @type {!number}
 * @export
 */
API.Client.TemperatureResponseSensors.prototype.id;

/**
 * Currently reported ambient temperature in millidegrees celsius.
 * @type {!number}
 * @export
 */
API.Client.TemperatureResponseSensors.prototype.ambientTemperature;

