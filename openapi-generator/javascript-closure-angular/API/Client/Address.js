goog.provide('API.Client.Address');

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 * @record
 */
API.Client.Address = function() {}

/**
 * @type {!Array<!API.Client.Contact>}
 * @export
 */
API.Client.Address.prototype.contacts;

/**
 * The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.formattedAddress;

/**
 * @type {!API.Client.AddressGeofence}
 * @export
 */
API.Client.Address.prototype.geofence;

/**
 * ID of the address
 * @type {!number}
 * @export
 */
API.Client.Address.prototype.id;

/**
 * Name of the address or geofence
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.name;

/**
 * Notes associated with an address.
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.notes;

/**
 * @type {!Array<!API.Client.TagMetadata>}
 * @export
 */
API.Client.Address.prototype.tags;

