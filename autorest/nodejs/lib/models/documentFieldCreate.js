/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DocumentFieldCreate.
 */
class DocumentFieldCreate {
  /**
   * Create a DocumentFieldCreate.
   * @property {number} [numberValue] Value of this field if this document
   * field has valueType: ValueType_Number.
   * @property {array} [photoValue] Value of this field if this document field
   * has valueType: ValueType_Photo. Array of photo objects where each object
   * contains a URL for a photo.
   * @property {string} [stringValue] Value of this field if this document
   * field has valueType: ValueType_String.
   * @property {string} valueType Determines the type of this field and what
   * type of value this field has. It should be either ValueType_Number,
   * ValueType_String, or ValueType_Photo.
   */
  constructor() {
  }

  /**
   * Defines the metadata of DocumentFieldCreate
   *
   * @returns {object} metadata of DocumentFieldCreate
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DocumentFieldCreate',
      type: {
        name: 'Composite',
        className: 'DocumentFieldCreate',
        modelProperties: {
          numberValue: {
            required: false,
            serializedName: 'numberValue',
            type: {
              name: 'Number'
            }
          },
          photoValue: {
            required: false,
            serializedName: 'photoValue',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'DocumentFieldCreatePhotoValueItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'DocumentFieldCreatePhotoValueItem'
                  }
              }
            }
          },
          stringValue: {
            required: false,
            serializedName: 'stringValue',
            type: {
              name: 'String'
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

module.exports = DocumentFieldCreate;