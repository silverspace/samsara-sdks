goog.provide('API.Client.AddressGeofence');

/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 * @record
 */
API.Client.AddressGeofence = function() {}

/**
 * @type {!API.Client.AddressGeofence_circle}
 * @export
 */
API.Client.AddressGeofence.prototype.circle;

/**
 * @type {!API.Client.AddressGeofence_polygon}
 * @export
 */
API.Client.AddressGeofence.prototype.polygon;

