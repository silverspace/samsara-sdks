goog.provide('API.Client.FleetVehicleResponse');

/**
 * A vehicle object as returned for fleet/vehicle
 * @record
 */
API.Client.FleetVehicleResponse = function() {}

/**
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.FleetVehicleResponse.prototype.externalIds;

/**
 * Harsh event detection setting.
 * @type {!string}
 * @export
 */
API.Client.FleetVehicleResponse.prototype.harshAccelSetting;

/**
 * ID of the vehicle.
 * @type {!number}
 * @export
 */
API.Client.FleetVehicleResponse.prototype.id;

/**
 * Name of the vehicle.
 * @type {!string}
 * @export
 */
API.Client.FleetVehicleResponse.prototype.name;

/**
 * @type {!API.Client.FleetVehicleResponse_vehicleInfo}
 * @export
 */
API.Client.FleetVehicleResponse.prototype.vehicleInfo;

