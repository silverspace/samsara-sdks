goog.provide('API.Client.AddressGeofence_circle');

/**
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 * @record
 */
API.Client.AddressGeofenceCircle = function() {}

/**
 * The latitude of the center of the circular geofence
 * @type {!number}
 * @export
 */
API.Client.AddressGeofenceCircle.prototype.latitude;

/**
 * The radius of the circular geofence
 * @type {!number}
 * @export
 */
API.Client.AddressGeofenceCircle.prototype.radiusMeters;

/**
 * The longitude of the center of the circular geofence
 * @type {!number}
 * @export
 */
API.Client.AddressGeofenceCircle.prototype.longitude;

