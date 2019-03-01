goog.provide('API.Client.DocumentField');

/**
 * @record
 */
API.Client.DocumentField = function() {}

/**
 * Value of this field if this document field has valueType: ValueType_Number.
 * @type {!number}
 * @export
 */
API.Client.DocumentField.prototype.numberValue;

/**
 * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
 * @type {!Array<!API.Client.DocumentFieldCreate_photoValue>}
 * @export
 */
API.Client.DocumentField.prototype.photoValue;

/**
 * Value of this field if this document field has valueType: ValueType_String.
 * @type {!string}
 * @export
 */
API.Client.DocumentField.prototype.stringValue;

/**
 * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
 * @type {!string}
 * @export
 */
API.Client.DocumentField.prototype.valueType;

/**
 * Descriptive name of this field.
 * @type {!string}
 * @export
 */
API.Client.DocumentField.prototype.label;

/**
 * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.DocumentField.prototype.value;

