goog.provide('API.Client.DocumentType');

/**
 * @record
 */
API.Client.DocumentType = function() {}

/**
 * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
 * @type {!Array<!API.Client.Array>}
 * @export
 */
API.Client.DocumentType.prototype.fieldTypes;

/**
 * Name of the document type.
 * @type {!string}
 * @export
 */
API.Client.DocumentType.prototype.name;

/**
 * ID for the organization this document belongs to.
 * @type {!number}
 * @export
 */
API.Client.DocumentType.prototype.orgId;

/**
 * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
 * @type {!string}
 * @export
 */
API.Client.DocumentType.prototype.uuid;

