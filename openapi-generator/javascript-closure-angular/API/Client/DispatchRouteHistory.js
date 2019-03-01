goog.provide('API.Client.DispatchRouteHistory');

/**
 * @record
 */
API.Client.DispatchRouteHistory = function() {}

/**
 * History of the route's state changes.
 * @type {!Array<!API.Client.DispatchRouteHistoricalEntry>}
 * @export
 */
API.Client.DispatchRouteHistory.prototype.history;

