goog.provide('API.Client.SensorHistoryResponse_results');

/**
 * @record
 */
API.Client.SensorHistoryResponseResults = function() {}

/**
 * List of datapoints, one for each requested (sensor, field) pair.
 * @type {!Array<!number>}
 * @export
 */
API.Client.SensorHistoryResponseResults.prototype.series;

/**
 * Timestamp in UNIX milliseconds.
 * @type {!number}
 * @export
 */
API.Client.SensorHistoryResponseResults.prototype.timeMs;

