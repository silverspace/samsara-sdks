goog.provide('API.Client.MachineHistoryResponse_machines');

/**
 * @record
 */
API.Client.MachineHistoryResponseMachines = function() {}

/**
 * Machine name
 * @type {!string}
 * @export
 */
API.Client.MachineHistoryResponseMachines.prototype.name;

/**
 * Machine ID
 * @type {!number}
 * @export
 */
API.Client.MachineHistoryResponseMachines.prototype.id;

/**
 * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
 * @type {!Array<!API.Client.MachineHistoryResponse_vibrations>}
 * @export
 */
API.Client.MachineHistoryResponseMachines.prototype.vibrations;

