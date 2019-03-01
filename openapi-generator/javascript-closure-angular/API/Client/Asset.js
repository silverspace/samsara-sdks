goog.provide('API.Client.Asset');

/**
 * Basic information of an asset
 * @record
 */
API.Client.Asset = function() {}

/**
 * Serial number of the host asset
 * @type {!string}
 * @export
 */
API.Client.Asset.prototype.assetSerialNumber;

/**
 * The cable connected to the asset
 * @type {!Array<!API.Client.Asset_cable>}
 * @export
 */
API.Client.Asset.prototype.cable;

/**
 * Engine hours
 * @type {!number}
 * @export
 */
API.Client.Asset.prototype.engineHours;

/**
 * Asset ID
 * @type {!number}
 * @export
 */
API.Client.Asset.prototype.id;

/**
 * Asset name
 * @type {!string}
 * @export
 */
API.Client.Asset.prototype.name;

