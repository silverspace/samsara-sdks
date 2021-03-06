/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DriversResponse.
 */
class DriversResponse {
  /**
   * Create a DriversResponse.
   * @property {array} [drivers]
   */
  constructor() {
  }

  /**
   * Defines the metadata of DriversResponse
   *
   * @returns {object} metadata of DriversResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DriversResponse',
      type: {
        name: 'Composite',
        className: 'DriversResponse',
        modelProperties: {
          drivers: {
            required: false,
            serializedName: 'drivers',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'CurrentDriverElementType',
                  type: {
                    name: 'Composite',
                    className: 'CurrentDriver'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = DriversResponse;
