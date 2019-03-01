goog.provide('API.Client.AssetReeferResponse');

/**
 * Reefer-specific asset details
 * @record
 */
API.Client.AssetReeferResponse = function() {}

/**
 * Asset type
 * @type {!string}
 * @export
 */
API.Client.AssetReeferResponse.prototype.assetType;

/**
 * Asset ID
 * @type {!number}
 * @export
 */
API.Client.AssetReeferResponse.prototype.id;

/**
 * Asset name
 * @type {!string}
 * @export
 */
API.Client.AssetReeferResponse.prototype.name;

/**
 * @type {!API.Client.AssetReeferResponse_reeferStats}
 * @export
 */
API.Client.AssetReeferResponse.prototype.reeferStats;

