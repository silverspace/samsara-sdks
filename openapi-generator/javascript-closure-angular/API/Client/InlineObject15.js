goog.provide('API.Client.inline_object_15');

/**
 * @record
 */
API.Client.InlineObject15 = function() {}

/**
 * End of the time range, specified in milliseconds UNIX time.
 * @type {!number}
 * @export
 */
API.Client.InlineObject15.prototype.endMs;

/**
 * Group ID to query.
 * @type {!number}
 * @export
 */
API.Client.InlineObject15.prototype.groupId;

/**
 * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
 * @type {!number}
 * @export
 */
API.Client.InlineObject15.prototype.startMs;

/**
 * Vehicle ID to query.
 * @type {!number}
 * @export
 */
API.Client.InlineObject15.prototype.vehicleId;

