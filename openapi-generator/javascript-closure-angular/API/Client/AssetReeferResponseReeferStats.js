goog.provide('API.Client.AssetReeferResponse_reeferStats');

/**
 * @record
 */
API.Client.AssetReeferResponseReeferStats = function() {}

/**
 * Fuel percentage of the reefer
 * @type {!Array<!API.Client.AssetReeferResponse_reeferStats_fuelPercentage>}
 * @export
 */
API.Client.AssetReeferResponseReeferStats.prototype.fuelPercentage;

/**
 * Power status of the reefer
 * @type {!Array<!API.Client.AssetReeferResponse_reeferStats_powerStatus>}
 * @export
 */
API.Client.AssetReeferResponseReeferStats.prototype.powerStatus;

/**
 * Engine hours of the reefer
 * @type {!Array<!API.Client.AssetReeferResponse_reeferStats_engineHours>}
 * @export
 */
API.Client.AssetReeferResponseReeferStats.prototype.engineHours;

/**
 * Set point temperature of the reefer
 * @type {!Array<!API.Client.AssetReeferResponse_reeferStats_setPoint>}
 * @export
 */
API.Client.AssetReeferResponseReeferStats.prototype.setPoint;

/**
 * Return air temperature of the reefer
 * @type {!Array<!API.Client.AssetReeferResponse_reeferStats_returnAirTemp>}
 * @export
 */
API.Client.AssetReeferResponseReeferStats.prototype.returnAirTemp;

/**
 * Reefer alarms
 * @type {!Array<!API.Client.AssetReeferResponse_reeferStats_alarms_1>}
 * @export
 */
API.Client.AssetReeferResponseReeferStats.prototype.alarms;

