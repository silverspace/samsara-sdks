goog.provide('API.Client.HosLogsResponse_logs');

/**
 * @record
 */
API.Client.HosLogsResponseLogs = function() {}

/**
 * Longitude at which the log was recorded.
 * @type {!number}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.locLng;

/**
 * The time at which the log/HOS status started in UNIX milliseconds.
 * @type {!number}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.logStartMs;

/**
 * ID of the driver.
 * @type {!number}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.driverId;

/**
 * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
 * @type {!string}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.statusType;

/**
 * City in which the log was recorded.
 * @type {!string}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.locCity;

/**
 * ID of the group.
 * @type {!number}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.groupId;

/**
 * Name of location at which the log was recorded.
 * @type {!string}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.locName;

/**
 * Latitude at which the log was recorded.
 * @type {!number}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.locLat;

/**
 * Remark associated with the log entry.
 * @type {!string}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.remark;

/**
 * State in which the log was recorded.
 * @type {!string}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.locState;

/**
 * ID of the vehicle.
 * @type {!number}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.vehicleId;

/**
 * @type {!Array<!number>}
 * @export
 */
API.Client.HosLogsResponseLogs.prototype.codriverIds;

