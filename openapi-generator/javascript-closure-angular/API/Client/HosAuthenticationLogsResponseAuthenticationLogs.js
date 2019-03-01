goog.provide('API.Client.HosAuthenticationLogsResponse_authenticationLogs');

/**
 * @record
 */
API.Client.HosAuthenticationLogsResponseAuthenticationLogs = function() {}

/**
 * The log type - one of 'signin' or 'signout'
 * @type {!string}
 * @export
 */
API.Client.HosAuthenticationLogsResponseAuthenticationLogs.prototype.actionType;

/**
 * Address at which the log was recorded, if applicable.
 * @type {!string}
 * @export
 */
API.Client.HosAuthenticationLogsResponseAuthenticationLogs.prototype.address;

/**
 * City in which the log was recorded, if applicable.
 * @type {!string}
 * @export
 */
API.Client.HosAuthenticationLogsResponseAuthenticationLogs.prototype.city;

/**
 * The time at which the event was recorded in UNIX milliseconds.
 * @type {!number}
 * @export
 */
API.Client.HosAuthenticationLogsResponseAuthenticationLogs.prototype.happenedAtMs;

/**
 * Address name from the group address book at which the log was recorded, if applicable.
 * @type {!string}
 * @export
 */
API.Client.HosAuthenticationLogsResponseAuthenticationLogs.prototype.addressName;

/**
 * State in which the log was recorded, if applicable.
 * @type {!string}
 * @export
 */
API.Client.HosAuthenticationLogsResponseAuthenticationLogs.prototype.state;

