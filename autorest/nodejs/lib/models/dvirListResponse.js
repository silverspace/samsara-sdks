/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DvirListResponse.
 */
class DvirListResponse {
  /**
   * Create a DvirListResponse.
   * @property {array} [dvirs]
   */
  constructor() {
  }

  /**
   * Defines the metadata of DvirListResponse
   *
   * @returns {object} metadata of DvirListResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DvirListResponse',
      type: {
        name: 'Composite',
        className: 'DvirListResponse',
        modelProperties: {
          dvirs: {
            required: false,
            serializedName: 'dvirs',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'DvirBaseElementType',
                  type: {
                    name: 'Composite',
                    className: 'DvirBase'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = DvirListResponse;
