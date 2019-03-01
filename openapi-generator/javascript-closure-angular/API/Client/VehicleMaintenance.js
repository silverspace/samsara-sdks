goog.provide('API.Client.VehicleMaintenance');

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 * @record
 */
API.Client.VehicleMaintenance = function() {}

/**
 * ID of the vehicle.
 * @type {!number}
 * @export
 */
API.Client.VehicleMaintenance.prototype.id;

/**
 * @type {!API.Client.VehicleMaintenance_j1939}
 * @export
 */
API.Client.VehicleMaintenance.prototype.j1939;

/**
 * @type {!API.Client.VehicleMaintenance_passenger}
 * @export
 */
API.Client.VehicleMaintenance.prototype.passenger;

