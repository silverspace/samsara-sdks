goog.provide('API.Client.DispatchRouteHistoricalEntry');

/**
 * @record
 */
API.Client.DispatchRouteHistoricalEntry = function() {}

/**
 * Timestamp that the route was updated, represented as Unix milliseconds since epoch.
 * @type {!number}
 * @export
 */
API.Client.DispatchRouteHistoricalEntry.prototype.changedAtMs;

/**
 * @type {!API.Client.DispatchRoute}
 * @export
 */
API.Client.DispatchRouteHistoricalEntry.prototype.route;

