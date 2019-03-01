goog.provide('API.Client.SensorHistoryResponse');

/**
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 * @record
 */
API.Client.SensorHistoryResponse = function() {}

/**
 * @type {!Array<!API.Client.SensorHistoryResponse_results>}
 * @export
 */
API.Client.SensorHistoryResponse.prototype.results;

