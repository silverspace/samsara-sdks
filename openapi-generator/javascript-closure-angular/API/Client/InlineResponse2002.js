goog.provide('API.Client.inline_response_200_2');

/**
 * @record
 */
API.Client.InlineResponse2002 = function() {}

/**
 * @type {!API.Client.Pagination}
 * @export
 */
API.Client.InlineResponse2002.prototype.pagination;

/**
 * Group ID to query.
 * @type {!number}
 * @export
 */
API.Client.InlineResponse2002.prototype.groupId;

/**
 * @type {!Array<!API.Client.Vehicle>}
 * @export
 */
API.Client.InlineResponse2002.prototype.vehicles;

