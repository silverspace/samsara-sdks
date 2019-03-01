goog.provide('API.Client.inline_object_12');

/**
 * @record
 */
API.Client.InlineObject12 = function() {}

/**
 * Only type 'mechanic' is currently accepted.
 * @type {!string}
 * @export
 */
API.Client.InlineObject12.prototype.inspectionType;

/**
 * Any notes from the mechanic.
 * @type {!string}
 * @export
 */
API.Client.InlineObject12.prototype.mechanicNotes;

/**
 * The current odometer of the vehicle.
 * @type {!number}
 * @export
 */
API.Client.InlineObject12.prototype.odometerMiles;

/**
 * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
 * @type {!boolean}
 * @export
 */
API.Client.InlineObject12.prototype.previousDefectsCorrected;

/**
 * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
 * @type {!boolean}
 * @export
 */
API.Client.InlineObject12.prototype.previousDefectsIgnored;

/**
 * Whether or not this vehicle or trailer is safe to drive.
 * @type {!string}
 * @export
 */
API.Client.InlineObject12.prototype.safe;

/**
 * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
 * @type {!number}
 * @export
 */
API.Client.InlineObject12.prototype.trailerId;

/**
 * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
 * @type {!string}
 * @export
 */
API.Client.InlineObject12.prototype.userEmail;

/**
 * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
 * @type {!number}
 * @export
 */
API.Client.InlineObject12.prototype.vehicleId;

/** @enum {string} */
API.Client.InlineObject12.InspectionTypeEnum = { 
  mechanic: 'mechanic',
}
/** @enum {string} */
API.Client.InlineObject12.SafeEnum = { 
  safe: 'safe',
  unsafe: 'unsafe',
}
