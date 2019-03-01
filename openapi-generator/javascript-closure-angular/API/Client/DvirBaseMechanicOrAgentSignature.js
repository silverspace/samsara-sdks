goog.provide('API.Client.DvirBase_mechanicOrAgentSignature');

/**
 * The mechanic's or agent's signature for the DVIR.
 * @record
 */
API.Client.DvirBaseMechanicOrAgentSignature = function() {}

/**
 * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
 * @type {!number}
 * @export
 */
API.Client.DvirBaseMechanicOrAgentSignature.prototype.mechanicUserId;

/**
 * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
 * @type {!number}
 * @export
 */
API.Client.DvirBaseMechanicOrAgentSignature.prototype.driverId;

/**
 * The name of the agent or mechanic who signed the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseMechanicOrAgentSignature.prototype.name;

/**
 * The time in millis when the DVIR was signed
 * @type {!number}
 * @export
 */
API.Client.DvirBaseMechanicOrAgentSignature.prototype.signedAt;

/**
 * Type corresponds to whether the signature corresponds to driver|mechanic.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseMechanicOrAgentSignature.prototype.type;

/**
 * Email of the  agent|mechanic who signed the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseMechanicOrAgentSignature.prototype.email;

/**
 * Username of the  agent|mechanic who signed the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBaseMechanicOrAgentSignature.prototype.username;

