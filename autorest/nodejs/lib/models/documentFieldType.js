/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DocumentFieldType.
 */
class DocumentFieldType {
  /**
   * Create a DocumentFieldType.
   * @property {string} label Descriptive name of this field type.
   * @property {object} [numberValueTypeMetadata] Additional metadata
   * information for a number field type. Only defined when a field type has
   * valueType: ValueType_Number.
   * @property {number} [numberValueTypeMetadata.numDecimalPlaces] Number of
   * decimal places that values for this field type can have.
   * @property {string} valueType The kind of value that can be submitted for
   * this fieldType. It should be either ValueType_Number, ValueType_String, or
   * ValueType_Photo.
   */
  constructor() {
  }

  /**
   * Defines the metadata of DocumentFieldType
   *
   * @returns {object} metadata of DocumentFieldType
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DocumentFieldType',
      type: {
        name: 'Composite',
        className: 'DocumentFieldType',
        modelProperties: {
          label: {
            required: true,
            serializedName: 'label',
            type: {
              name: 'String'
            }
          },
          numberValueTypeMetadata: {
            required: false,
            serializedName: 'numberValueTypeMetadata',
            type: {
              name: 'Composite',
              className: 'DocumentFieldTypeNumberValueTypeMetadata'
            }
          },
          valueType: {
            required: true,
            serializedName: 'valueType',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = DocumentFieldType;
