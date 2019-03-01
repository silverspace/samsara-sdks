goog.provide('API.Client.inline_object_21');

/**
 * @record
 */
API.Client.InlineObject21 = function() {}

/**
 * End of the time range, specified in milliseconds UNIX time.
 * @type {!number}
 * @export
 */
API.Client.InlineObject21.prototype.endMs;

/**
 * @type {!string}
 * @export
 */
API.Client.InlineObject21.prototype.fillMissing;

/**
 * Group ID to query.
 * @type {!number}
 * @export
 */
API.Client.InlineObject21.prototype.groupId;

/**
 * @type {!Array<!API.Client._sensors_history_series>}
 * @export
 */
API.Client.InlineObject21.prototype.series;

/**
 * Beginning of the time range, specified in milliseconds UNIX time.
 * @type {!number}
 * @export
 */
API.Client.InlineObject21.prototype.startMs;

/**
 * Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
 * @type {!number}
 * @export
 */
API.Client.InlineObject21.prototype.stepMs;

/** @enum {string} */
API.Client.InlineObject21.FillMissingEnum = { 
  withNull: 'withNull',
  withPrevious: 'withPrevious',
}
