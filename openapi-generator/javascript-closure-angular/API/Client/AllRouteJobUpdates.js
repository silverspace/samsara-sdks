goog.provide('API.Client.allRouteJobUpdates');

/**
 * @record
 */
API.Client.AllRouteJobUpdates = function() {}

/**
 * @type {!Array<!API.Client.jobUpdateObject>}
 * @export
 */
API.Client.AllRouteJobUpdates.prototype.jobUpdates;

/**
 * Sequence ID of the last update returned in the response
 * @type {!string}
 * @export
 */
API.Client.AllRouteJobUpdates.prototype.sequenceId;

