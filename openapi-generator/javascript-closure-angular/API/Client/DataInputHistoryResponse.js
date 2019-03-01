goog.provide('API.Client.DataInputHistoryResponse');

/**
 * @record
 */
API.Client.DataInputHistoryResponse = function() {}

/**
 * The ID of this data input
 * @type {!number}
 * @export
 */
API.Client.DataInputHistoryResponse.prototype.id;

/**
 * Name of this data input
 * @type {!string}
 * @export
 */
API.Client.DataInputHistoryResponse.prototype.name;

/**
 * Data points from this data input
 * @type {!Array<!API.Client.DataInputHistoryResponse_points>}
 * @export
 */
API.Client.DataInputHistoryResponse.prototype.points;

