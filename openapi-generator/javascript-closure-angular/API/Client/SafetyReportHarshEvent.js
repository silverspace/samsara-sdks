goog.provide('API.Client.SafetyReportHarshEvent');

/**
 * List of harsh events
 * @record
 */
API.Client.SafetyReportHarshEvent = function() {}

/**
 * Type of the harsh event
 * @type {!string}
 * @export
 */
API.Client.SafetyReportHarshEvent.prototype.harshEventType;

/**
 * Timestamp that the harsh event occurred in Unix milliseconds since epoch
 * @type {!number}
 * @export
 */
API.Client.SafetyReportHarshEvent.prototype.timestampMs;

/**
 * Vehicle associated with the harsh event
 * @type {!number}
 * @export
 */
API.Client.SafetyReportHarshEvent.prototype.vehicleId;

