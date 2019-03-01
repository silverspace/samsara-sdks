goog.provide('API.Client.AssetCurrentLocation');

/**
 * Current location of an asset
 * @record
 */
API.Client.AssetCurrentLocation = function() {}

/**
 * The latitude of the location in degrees.
 * @type {!number}
 * @export
 */
API.Client.AssetCurrentLocation.prototype.latitude;

/**
 * The best effort (street,city,state) for the latitude and longitude.
 * @type {!string}
 * @export
 */
API.Client.AssetCurrentLocation.prototype.location;

/**
 * The longitude of the location in degrees.
 * @type {!number}
 * @export
 */
API.Client.AssetCurrentLocation.prototype.longitude;

/**
 * The speed calculated from GPS that the asset was traveling at in miles per hour.
 * @type {!number}
 * @export
 */
API.Client.AssetCurrentLocation.prototype.speedMilesPerHour;

/**
 * Time in Unix milliseconds since epoch when the asset was at the location.
 * @type {!number}
 * @export
 */
API.Client.AssetCurrentLocation.prototype.timeMs;

