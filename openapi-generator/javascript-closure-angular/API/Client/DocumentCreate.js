goog.provide('API.Client.DocumentCreate');

/**
 * @record
 */
API.Client.DocumentCreate = function() {}

/**
 * ID of the Samsara dispatch job for which the document is submitted
 * @type {!number}
 * @export
 */
API.Client.DocumentCreate.prototype.dispatchJobId;

/**
 * Notes submitted with this document.
 * @type {!string}
 * @export
 */
API.Client.DocumentCreate.prototype.notes;

/**
 * Universally unique identifier for the document type this document is being created for.
 * @type {!string}
 * @export
 */
API.Client.DocumentCreate.prototype.documentTypeUuid;

/**
 * List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
 * @type {!Array<!API.Client.DocumentField>}
 * @export
 */
API.Client.DocumentCreate.prototype.fields;

