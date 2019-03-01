goog.provide('API.Client.DriversSummaryResponse_Summaries');

/**
 * @record
 */
API.Client.DriversSummaryResponseSummaries = function() {}

/**
 * ID of the driver.
 * @type {!number}
 * @export
 */
API.Client.DriversSummaryResponseSummaries.prototype.driverId;

/**
 * Distance driven in miles, rounded to two decimal places.
 * @type {!number}
 * @export
 */
API.Client.DriversSummaryResponseSummaries.prototype.distanceMiles;

/**
 * Duration in milliseconds that driver was driving during the requested time range
 * @type {!number}
 * @export
 */
API.Client.DriversSummaryResponseSummaries.prototype.driveMs;

/**
 * Duration in milliseconds that driver was on duty or driving during the requested time range
 * @type {!number}
 * @export
 */
API.Client.DriversSummaryResponseSummaries.prototype.activeMs;

/**
 * Username of the driver.
 * @type {!string}
 * @export
 */
API.Client.DriversSummaryResponseSummaries.prototype.driverUsername;

/**
 * Group of the driver.
 * @type {!number}
 * @export
 */
API.Client.DriversSummaryResponseSummaries.prototype.groupId;

/**
 * Name of the driver.
 * @type {!string}
 * @export
 */
API.Client.DriversSummaryResponseSummaries.prototype.driverName;

/**
 * Duration in milliseconds that driver was on duty during the requested time range
 * @type {!number}
 * @export
 */
API.Client.DriversSummaryResponseSummaries.prototype.onDutyMs;

