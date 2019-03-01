goog.provide('API.Client.Document');

/**
 * @record
 */
API.Client.Document = function() {}

/**
 * ID of the Samsara dispatch job for which the document is submitted
 * @type {!number}
 * @export
 */
API.Client.Document.prototype.dispatchJobId;

/**
 * Notes submitted with this document.
 * @type {!string}
 * @export
 */
API.Client.Document.prototype.notes;

/**
 * Descriptive name of this type of document.
 * @type {!string}
 * @export
 */
API.Client.Document.prototype.documentType;

/**
 * The time in Unix epoch milliseconds that the document is created.
 * @type {!number}
 * @export
 */
API.Client.Document.prototype.driverCreatedAtMs;

/**
 * ID of the driver for whom the document is submitted
 * @type {!number}
 * @export
 */
API.Client.Document.prototype.driverId;

/**
 * The fields associated with this document.
 * @type {!Array<!API.Client.DocumentField>}
 * @export
 */
API.Client.Document.prototype.fields;

/**
 * VehicleID of the driver at document creation.
 * @type {!number}
 * @export
 */
API.Client.Document.prototype.vehicleId;

