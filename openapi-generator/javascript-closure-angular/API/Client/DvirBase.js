goog.provide('API.Client.DvirBase');

/**
 * @record
 */
API.Client.DvirBase = function() {}

/**
 * @type {!API.Client.DvirBase_authorSignature}
 * @export
 */
API.Client.DvirBase.prototype.authorSignature;

/**
 * Signifies if the defects on the vehicle corrected after the DVIR is done.
 * @type {!boolean}
 * @export
 */
API.Client.DvirBase.prototype.defectsCorrected;

/**
 * Signifies if the defects on this vehicle can be ignored.
 * @type {!boolean}
 * @export
 */
API.Client.DvirBase.prototype.defectsNeedNotBeCorrected;

/**
 * The id of this DVIR record.
 * @type {!number}
 * @export
 */
API.Client.DvirBase.prototype.id;

/**
 * Inspection type of the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBase.prototype.inspectionType;

/**
 * The mechanics notes on the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBase.prototype.mechanicNotes;

/**
 * @type {!API.Client.DvirBase_mechanicOrAgentSignature}
 * @export
 */
API.Client.DvirBase.prototype.mechanicOrAgentSignature;

/**
 * @type {!API.Client.DvirBase_nextDriverSignature}
 * @export
 */
API.Client.DvirBase.prototype.nextDriverSignature;

/**
 * The odometer reading in miles for the vehicle when the DVIR was done.
 * @type {!number}
 * @export
 */
API.Client.DvirBase.prototype.odometerMiles;

/**
 * Timestamp of this DVIR in UNIX milliseconds.
 * @type {!number}
 * @export
 */
API.Client.DvirBase.prototype.timeMs;

/**
 * Defects registered for the trailer which was part of the DVIR.
 * @type {!Array<!API.Client.DvirBase_trailerDefects>}
 * @export
 */
API.Client.DvirBase.prototype.trailerDefects;

/**
 * The id of the trailer which was part of the DVIR.
 * @type {!number}
 * @export
 */
API.Client.DvirBase.prototype.trailerId;

/**
 * The name of the trailer which was part of the DVIR.
 * @type {!string}
 * @export
 */
API.Client.DvirBase.prototype.trailerName;

/**
 * @type {!API.Client.DvirBase_vehicle}
 * @export
 */
API.Client.DvirBase.prototype.vehicle;

/**
 * The condition of vechile on which DVIR was done.
 * @type {!string}
 * @export
 */
API.Client.DvirBase.prototype.vehicleCondition;

/**
 * Defects registered for the vehicle which was part of the DVIR.
 * @type {!Array<!API.Client.DvirBase_trailerDefects>}
 * @export
 */
API.Client.DvirBase.prototype.vehicleDefects;

