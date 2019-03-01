/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a SensorHistoryResponseResultsItem.
 */
class SensorHistoryResponseResultsItem {
  /**
   * Create a SensorHistoryResponseResultsItem.
   * @property {array} [series] List of datapoints, one for each requested
   * (sensor, field) pair.
   * @property {number} [timeMs] Timestamp in UNIX milliseconds.
   */
  constructor() {
  }

  /**
   * Defines the metadata of SensorHistoryResponseResultsItem
   *
   * @returns {object} metadata of SensorHistoryResponseResultsItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'SensorHistoryResponse_resultsItem',
      type: {
        name: 'Composite',
        className: 'SensorHistoryResponseResultsItem',
        modelProperties: {
          series: {
            required: false,
            serializedName: 'series',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'NumberElementType',
                  type: {
                    name: 'Number'
                  }
              }
            }
          },
          timeMs: {
            required: false,
            serializedName: 'timeMs',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = SensorHistoryResponseResultsItem;
