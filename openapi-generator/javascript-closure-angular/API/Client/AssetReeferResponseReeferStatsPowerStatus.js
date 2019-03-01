goog.provide('API.Client.AssetReeferResponse_reeferStats_powerStatus');

/**
 * @record
 */
API.Client.AssetReeferResponseReeferStatsPowerStatus = function() {}

/**
 * Timestamp in Unix milliseconds since epoch.
 * @type {!number}
 * @export
 */
API.Client.AssetReeferResponseReeferStatsPowerStatus.prototype.changedAtMs;

/**
 * Power status of the reefer.
 * @type {!string}
 * @export
 */
API.Client.AssetReeferResponseReeferStatsPowerStatus.prototype.status;

