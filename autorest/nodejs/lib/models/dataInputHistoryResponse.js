/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DataInputHistoryResponse.
 */
class DataInputHistoryResponse {
  /**
   * Create a DataInputHistoryResponse.
   * @property {number} [id] The ID of this data input
   * @property {string} name Name of this data input
   * @property {array} [points] Data points from this data input
   */
  constructor() {
  }

  /**
   * Defines the metadata of DataInputHistoryResponse
   *
   * @returns {object} metadata of DataInputHistoryResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DataInputHistoryResponse',
      type: {
        name: 'Composite',
        className: 'DataInputHistoryResponse',
        modelProperties: {
          id: {
            required: false,
            serializedName: 'id',
            type: {
              name: 'Number'
            }
          },
          name: {
            required: true,
            serializedName: 'name',
            type: {
              name: 'String'
            }
          },
          points: {
            required: false,
            serializedName: 'points',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'DataInputHistoryResponsePointsItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'DataInputHistoryResponsePointsItem'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = DataInputHistoryResponse;