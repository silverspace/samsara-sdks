goog.provide('API.Client.DvirBase_nextDriverSignature');

/**
 * The next driver signature for the DVIR.
 * @record
 */
API.Client.DvirBaseNextDriverSignature = function() {}

/**
 * ID of the driver who signed the DVIR
 * @type {!number}
 * @export
 */
API.Client.DvirBaseNextDriverSignature.prototype.driverId;

/**
 * The name of the driver who signed the next DVIR on this vehicle.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseNextDriverSignature.prototype.name;

/**
 * The time in millis when the next driver signed the DVIR on this vehicle.
 * @type {!number}
 * @export
 */
API.Client.DvirBaseNextDriverSignature.prototype.signedAt;

/**
 * Type corresponds to driver.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseNextDriverSignature.prototype.type;

/**
 * Email of the  driver who signed the next DVIR on this vehicle.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseNextDriverSignature.prototype.email;

/**
 * Username of the  driver who signed the next DVIR on this vehicle.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseNextDriverSignature.prototype.username;

