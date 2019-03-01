goog.provide('API.Client.VehicleMaintenance_j1939');

/**
 * J1939 based data. Null if no data is available.
 * @record
 */
API.Client.VehicleMaintenanceJ1939 = function() {}

/**
 * @type {!API.Client.VehicleMaintenance_j1939_checkEngineLight}
 * @export
 */
API.Client.VehicleMaintenanceJ1939.prototype.checkEngineLight;

/**
 * J1939 DTCs.
 * @type {!Array<!API.Client.VehicleMaintenance_j1939_diagnosticTroubleCodes>}
 * @export
 */
API.Client.VehicleMaintenanceJ1939.prototype.diagnosticTroubleCodes;

