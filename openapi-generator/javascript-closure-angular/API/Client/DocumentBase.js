goog.provide('API.Client.DocumentBase');

/**
 * @record
 */
API.Client.DocumentBase = function() {}

/**
 * ID of the Samsara dispatch job for which the document is submitted
 * @type {!number}
 * @export
 */
API.Client.DocumentBase.prototype.dispatchJobId;

/**
 * Notes submitted with this document.
 * @type {!string}
 * @export
 */
API.Client.DocumentBase.prototype.notes;

