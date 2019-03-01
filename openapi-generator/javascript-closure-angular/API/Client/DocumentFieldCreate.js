goog.provide('API.Client.DocumentFieldCreate');

/**
 * @record
 */
API.Client.DocumentFieldCreate = function() {}

/**
 * Value of this field if this document field has valueType: ValueType_Number.
 * @type {!number}
 * @export
 */
API.Client.DocumentFieldCreate.prototype.numberValue;

/**
 * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
 * @type {!Array<!API.Client.DocumentFieldCreate_photoValue>}
 * @export
 */
API.Client.DocumentFieldCreate.prototype.photoValue;

/**
 * Value of this field if this document field has valueType: ValueType_String.
 * @type {!string}
 * @export
 */
API.Client.DocumentFieldCreate.prototype.stringValue;

/**
 * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
 * @type {!string}
 * @export
 */
API.Client.DocumentFieldCreate.prototype.valueType;

