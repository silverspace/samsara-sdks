/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Contains the current cargo status of a sensor.
 *
 */
class CargoResponse {
  /**
   * Create a CargoResponse.
   * @property {number} [groupId]
   * @property {array} [sensors]
   */
  constructor() {
  }

  /**
   * Defines the metadata of CargoResponse
   *
   * @returns {object} metadata of CargoResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'CargoResponse',
      type: {
        name: 'Composite',
        className: 'CargoResponse',
        modelProperties: {
          groupId: {
            required: false,
            serializedName: 'groupId',
            type: {
              name: 'Number'
            }
          },
          sensors: {
            required: false,
            serializedName: 'sensors',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'CargoResponseSensorsItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'CargoResponseSensorsItem'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = CargoResponse;
