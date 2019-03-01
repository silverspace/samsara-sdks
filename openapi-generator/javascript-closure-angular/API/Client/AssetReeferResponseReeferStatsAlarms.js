goog.provide('API.Client.AssetReeferResponse_reeferStats_alarms');

/**
 * @record
 */
API.Client.AssetReeferResponseReeferStatsAlarms = function() {}

/**
 * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
 * @type {!number}
 * @export
 */
API.Client.AssetReeferResponseReeferStatsAlarms.prototype.severity;

/**
 * Recommended operator action
 * @type {!string}
 * @export
 */
API.Client.AssetReeferResponseReeferStatsAlarms.prototype.operatorAction;

/**
 * Description of the alarm
 * @type {!string}
 * @export
 */
API.Client.AssetReeferResponseReeferStatsAlarms.prototype.description;

/**
 * ID of the alarm
 * @type {!number}
 * @export
 */
API.Client.AssetReeferResponseReeferStatsAlarms.prototype.alarmCode;

