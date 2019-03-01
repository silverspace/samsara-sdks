goog.provide('API.Client.inline_object_1');

/**
 * @record
 */
API.Client.InlineObject1 = function() {}

/**
 * A list of IDs for contact book entries.
 * @type {!Array<!number>}
 * @export
 */
API.Client.InlineObject1.prototype.contactIds;

/**
 * The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @type {!string}
 * @export
 */
API.Client.InlineObject1.prototype.formattedAddress;

/**
 * @type {!API.Client.AddressGeofence}
 * @export
 */
API.Client.InlineObject1.prototype.geofence;

/**
 * The name of this address/geofence
 * @type {!string}
 * @export
 */
API.Client.InlineObject1.prototype.name;

/**
 * Notes associated with an address.
 * @type {!string}
 * @export
 */
API.Client.InlineObject1.prototype.notes;

/**
 * A list of tag IDs.
 * @type {!Array<!number>}
 * @export
 */
API.Client.InlineObject1.prototype.tagIds;

