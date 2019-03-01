/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DataInputHistoryResponsePointsItem.
 */
class DataInputHistoryResponsePointsItem {
  /**
   * Create a DataInputHistoryResponsePointsItem.
   * @property {number} [timeMs]
   * @property {number} [value]
   */
  constructor() {
  }

  /**
   * Defines the metadata of DataInputHistoryResponsePointsItem
   *
   * @returns {object} metadata of DataInputHistoryResponsePointsItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DataInputHistoryResponse_pointsItem',
      type: {
        name: 'Composite',
        className: 'DataInputHistoryResponsePointsItem',
        modelProperties: {
          timeMs: {
            required: false,
            serializedName: 'timeMs',
            type: {
              name: 'Number'
            }
          },
          value: {
            required: false,
            serializedName: 'value',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = DataInputHistoryResponsePointsItem;