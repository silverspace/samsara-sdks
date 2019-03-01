goog.provide('API.Client.inline_response_200_5_vehicleStats');

/**
 * @record
 */
API.Client.InlineResponse2005VehicleStats = function() {}

/**
 * @type {!Array<!API.Client.EngineState>}
 * @export
 */
API.Client.InlineResponse2005VehicleStats.prototype.engineState;

/**
 * @type {!API.Client.AuxInputSeries}
 * @export
 */
API.Client.InlineResponse2005VehicleStats.prototype.auxInput2;

/**
 * ID of the vehicle.
 * @type {!number}
 * @export
 */
API.Client.InlineResponse2005VehicleStats.prototype.vehicleId;

/**
 * @type {!API.Client.AuxInputSeries}
 * @export
 */
API.Client.InlineResponse2005VehicleStats.prototype.auxInput1;

