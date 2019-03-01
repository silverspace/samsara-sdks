goog.provide('API.Client.DvirBase_authorSignature');

/**
 * The authors signature for the DVIR.
 * @record
 */
API.Client.DvirBaseAuthorSignature = function() {}

/**
 * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
 * @type {!number}
 * @export
 */
API.Client.DvirBaseAuthorSignature.prototype.mechanicUserId;

/**
 * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
 * @type {!number}
 * @export
 */
API.Client.DvirBaseAuthorSignature.prototype.driverId;

/**
 * The name of the driver or mechanic who signed the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseAuthorSignature.prototype.name;

/**
 * The time in millis when the DVIR was signed
 * @type {!number}
 * @export
 */
API.Client.DvirBaseAuthorSignature.prototype.signedAt;

/**
 * Type corresponds to whether the signature corresponds to driver|mechanic.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseAuthorSignature.prototype.type;

/**
 * Email of the  driver|mechanic who signed the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseAuthorSignature.prototype.email;

/**
 * Username of the  driver|mechanic who signed the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseAuthorSignature.prototype.username;

