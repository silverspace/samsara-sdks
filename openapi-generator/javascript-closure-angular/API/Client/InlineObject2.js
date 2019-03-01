goog.provide('API.Client.inline_object_2');

/**
 * @record
 */
API.Client.InlineObject2 = function() {}

/**
 * The address of the entry to add, as it would be recognized if provided to maps.google.com.
 * @type {!string}
 * @export
 */
API.Client.InlineObject2.prototype.address;

/**
 * Group ID to query.
 * @type {!number}
 * @export
 */
API.Client.InlineObject2.prototype.groupId;

/**
 * Name of the location to add to the address book.
 * @type {!string}
 * @export
 */
API.Client.InlineObject2.prototype.name;

/**
 * Radius in meters of the address (used for matching vehicle trip stops to this location).
 * @type {!number}
 * @export
 */
API.Client.InlineObject2.prototype.radius;

