/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a HistoryParam.
 */
class HistoryParam {
  /**
   * Create a HistoryParam.
   * @property {number} endMs End of the time range, specified in milliseconds
   * UNIX time.
   * @property {number} groupId Group ID to query.
   * @property {number} startMs Beginning of the time range, specified in
   * milliseconds UNIX time.
   */
  constructor() {
  }

  /**
   * Defines the metadata of HistoryParam
   *
   * @returns {object} metadata of HistoryParam
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'historyParam',
      type: {
        name: 'Composite',
        className: 'HistoryParam',
        modelProperties: {
          endMs: {
            required: true,
            serializedName: 'endMs',
            type: {
              name: 'Number'
            }
          },
          groupId: {
            required: true,
            serializedName: 'groupId',
            type: {
              name: 'Number'
            }
          },
          startMs: {
            required: true,
            serializedName: 'startMs',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = HistoryParam;
