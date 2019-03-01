goog.provide('API.Client.DriverSafetyScoreResponse');

/**
 * Safety score details for a driver
 * @record
 */
API.Client.DriverSafetyScoreResponse = function() {}

/**
 * Crash event count
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.crashCount;

/**
 * Driver ID
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.driverId;

/**
 * Harsh acceleration event count
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.harshAccelCount;

/**
 * Harsh braking event count
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.harshBrakingCount;

/**
 * @type {!Array<!API.Client.SafetyReportHarshEvent>}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.harshEvents;

/**
 * Harsh turning event count
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.harshTurningCount;

/**
 * Safety Score
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.safetyScore;

/**
 * Safety Score Rank
 * @type {!string}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.safetyScoreRank;

/**
 * Amount of time driven over the speed limit in milliseconds
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.timeOverSpeedLimitMs;

/**
 * Total distance driven in meters
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.totalDistanceDrivenMeters;

/**
 * Total harsh event count
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.totalHarshEventCount;

/**
 * Amount of time driven in milliseconds
 * @type {!number}
 * @export
 */
API.Client.DriverSafetyScoreResponse.prototype.totalTimeDrivenMs;

