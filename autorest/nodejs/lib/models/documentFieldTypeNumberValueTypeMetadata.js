/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Additional metadata information for a number field type. Only defined when a
 * field type has valueType: ValueType_Number.
 *
 */
class DocumentFieldTypeNumberValueTypeMetadata {
  /**
   * Create a DocumentFieldTypeNumberValueTypeMetadata.
   * @property {number} [numDecimalPlaces] Number of decimal places that values
   * for this field type can have.
   */
  constructor() {
  }

  /**
   * Defines the metadata of DocumentFieldTypeNumberValueTypeMetadata
   *
   * @returns {object} metadata of DocumentFieldTypeNumberValueTypeMetadata
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DocumentFieldType_numberValueTypeMetadata',
      type: {
        name: 'Composite',
        className: 'DocumentFieldTypeNumberValueTypeMetadata',
        modelProperties: {
          numDecimalPlaces: {
            required: false,
            serializedName: 'numDecimalPlaces',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = DocumentFieldTypeNumberValueTypeMetadata;