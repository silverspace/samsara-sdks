goog.provide('API.Client._addresses_addresses');

/**
 * @record
 */
API.Client.AddressesAddresses = function() {}

/**
 * Notes associated with an address.
 * @type {!string}
 * @export
 */
API.Client.AddressesAddresses.prototype.notes;

/**
 * The full address associated with this address/geofence, as it might be recognized by maps.google.com
 * @type {!string}
 * @export
 */
API.Client.AddressesAddresses.prototype.formattedAddress;

/**
 * @type {!API.Client.AddressGeofence}
 * @export
 */
API.Client.AddressesAddresses.prototype.geofence;

/**
 * A list of tag IDs.
 * @type {!Array<!number>}
 * @export
 */
API.Client.AddressesAddresses.prototype.tagIds;

/**
 * The name of this address/geofence
 * @type {!string}
 * @export
 */
API.Client.AddressesAddresses.prototype.name;

/**
 * A list of IDs for contact book entries.
 * @type {!Array<!number>}
 * @export
 */
API.Client.AddressesAddresses.prototype.contactIds;

