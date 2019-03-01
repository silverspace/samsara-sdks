goog.provide('API.Client.DriverDailyLogResponse_days');

/**
 * @record
 */
API.Client.DriverDailyLogResponseDays = function() {}

/**
 * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
 * @type {!number}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.certifiedAtMs;

/**
 * End of the HOS day, specified in milliseconds UNIX time.
 * @type {!number}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.endMs;

/**
 * End of the HOS day, specified in milliseconds UNIX time.
 * @type {!number}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.startMs;

/**
 * List of trailer ID's associated with the driver for the day.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.trailerIds;

/**
 * Hours spent on duty or driving, rounded to two decimal places.
 * @type {!number}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.activeHours;

/**
 * Distance driven in miles, rounded to two decimal places.
 * @type {!number}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.distanceMiles;

/**
 * Milliseconds spent on duty or driving.
 * @type {!number}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.activeMs;

/**
 * Whether this HOS day chart was certified by the driver.
 * @type {!boolean}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.certified;

/**
 * List of vehicle ID's associated with the driver for the day.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.DriverDailyLogResponseDays.prototype.vehicleIds;

