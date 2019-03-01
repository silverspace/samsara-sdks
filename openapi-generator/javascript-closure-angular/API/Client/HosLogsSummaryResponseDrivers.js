goog.provide('API.Client.HosLogsSummaryResponse_drivers');

/**
 * @record
 */
API.Client.HosLogsSummaryResponseDrivers = function() {}

/**
 * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.timeUntilBreak;

/**
 * Name of the vehicle.
 * @type {!string}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.vehicleName;

/**
 * The amount of driving time in violation today (in ms).
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.drivingInViolationToday;

/**
 * ID of the driver.
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.driverId;

/**
 * The amount of remaining cycle time (in ms).
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.cycleRemaining;

/**
 * Name of the driver.
 * @type {!string}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.driverName;

/**
 * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
 * @type {!string}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.dutyStatus;

/**
 * The amount of cycle time (in ms) available tomorrow.
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.cycleTomorrow;

/**
 * The amount of remaining shift drive time (in ms).
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.shiftDriveRemaining;

/**
 * The amount of time (in ms) that the driver has been in the current `dutyStatus`.
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.timeInCurrentStatus;

/**
 * The amount of driving time in violation in this cycle (in ms).
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.drivingInViolationCycle;

/**
 * The amount of remaining shift time (in ms).
 * @type {!number}
 * @export
 */
API.Client.HosLogsSummaryResponseDrivers.prototype.shiftRemaining;

