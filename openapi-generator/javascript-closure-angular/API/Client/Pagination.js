goog.provide('API.Client.Pagination');

/**
 * @record
 */
API.Client.Pagination = function() {}

/**
 * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
 * @type {!string}
 * @export
 */
API.Client.Pagination.prototype.endCursor;

/**
 * True if there are more pages of results after this response.
 * @type {!boolean}
 * @export
 */
API.Client.Pagination.prototype.hasNextPage;

/**
 * True if there are more pages of results before this response.
 * @type {!boolean}
 * @export
 */
API.Client.Pagination.prototype.hasPrevPage;

/**
 * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
 * @type {!string}
 * @export
 */
API.Client.Pagination.prototype.startCursor;

