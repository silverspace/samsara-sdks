goog.provide('API.Client.DocumentFieldType');

/**
 * @record
 */
API.Client.DocumentFieldType = function() {}

/**
 * Descriptive name of this field type.
 * @type {!string}
 * @export
 */
API.Client.DocumentFieldType.prototype.label;

/**
 * @type {!API.Client.DocumentFieldType_numberValueTypeMetadata}
 * @export
 */
API.Client.DocumentFieldType.prototype.numberValueTypeMetadata;

/**
 * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
 * @type {!string}
 * @export
 */
API.Client.DocumentFieldType.prototype.valueType;

