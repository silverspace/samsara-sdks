goog.provide('API.Client.DocumentFieldType_numberValueTypeMetadata');

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 * @record
 */
API.Client.DocumentFieldTypeNumberValueTypeMetadata = function() {}

/**
 * Number of decimal places that values for this field type can have.
 * @type {!number}
 * @export
 */
API.Client.DocumentFieldTypeNumberValueTypeMetadata.prototype.numDecimalPlaces;

