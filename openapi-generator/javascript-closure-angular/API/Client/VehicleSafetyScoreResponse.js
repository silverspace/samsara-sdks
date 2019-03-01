goog.provide('API.Client.VehicleSafetyScoreResponse');

/**
 * Safety score details for a vehicle
 * @record
 */
API.Client.VehicleSafetyScoreResponse = function() {}

/**
 * Crash event count
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.crashCount;

/**
 * Harsh acceleration event count
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.harshAccelCount;

/**
 * Harsh braking event count
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.harshBrakingCount;

/**
 * @type {!Array<!API.Client.SafetyReportHarshEvent>}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.harshEvents;

/**
 * Harsh turning event count
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.harshTurningCount;

/**
 * Safety Score
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.safetyScore;

/**
 * Safety Score Rank
 * @type {!string}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.safetyScoreRank;

/**
 * Amount of time driven over the speed limit in milliseconds
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.timeOverSpeedLimitMs;

/**
 * Total distance driven in meters
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.totalDistanceDrivenMeters;

/**
 * Total harsh event count
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.totalHarshEventCount;

/**
 * Amount of time driven in milliseconds
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.totalTimeDrivenMs;

/**
 * Vehicle ID
 * @type {!number}
 * @export
 */
API.Client.VehicleSafetyScoreResponse.prototype.vehicleId;

