/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a HosLogsParam.
 */
class HosLogsParam {
  /**
   * Create a HosLogsParam.
   * @property {number} groupId Group ID to query.
   */
  constructor() {
  }

  /**
   * Defines the metadata of HosLogsParam
   *
   * @returns {object} metadata of HosLogsParam
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'hosLogsParam',
      type: {
        name: 'Composite',
        className: 'HosLogsParam',
        modelProperties: {
          groupId: {
            required: true,
            serializedName: 'groupId',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = HosLogsParam;
