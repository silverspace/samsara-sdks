goog.provide('API.Client.VehicleMaintenance_passenger');

/**
 * Passenger vehicle data. Null if no data is available.
 * @record
 */
API.Client.VehicleMaintenancePassenger = function() {}

/**
 * @type {!API.Client.VehicleMaintenance_passenger_checkEngineLight}
 * @export
 */
API.Client.VehicleMaintenancePassenger.prototype.checkEngineLight;

/**
 * Passenger vehicle DTCs.
 * @type {!Array<!API.Client.VehicleMaintenance_passenger_diagnosticTroubleCodes>}
 * @export
 */
API.Client.VehicleMaintenancePassenger.prototype.diagnosticTroubleCodes;

