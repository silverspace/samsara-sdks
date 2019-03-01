goog.provide('API.Client.AssetCurrentLocationsResponse');

/**
 * Basic information of an asset
 * @record
 */
API.Client.AssetCurrentLocationsResponse = function() {}

/**
 * The cable connected to the asset
 * @type {!Array<!API.Client.Asset_cable>}
 * @export
 */
API.Client.AssetCurrentLocationsResponse.prototype.cable;

/**
 * Engine hours
 * @type {!number}
 * @export
 */
API.Client.AssetCurrentLocationsResponse.prototype.engineHours;

/**
 * Asset ID
 * @type {!number}
 * @export
 */
API.Client.AssetCurrentLocationsResponse.prototype.id;

/**
 * Current location of an asset
 * @type {!Array<!API.Client.AssetCurrentLocation>}
 * @export
 */
API.Client.AssetCurrentLocationsResponse.prototype.location;

/**
 * Asset name
 * @type {!string}
 * @export
 */
API.Client.AssetCurrentLocationsResponse.prototype.name;

