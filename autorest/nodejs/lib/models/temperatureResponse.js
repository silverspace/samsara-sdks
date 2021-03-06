/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Contains the current temperatures of a sensor.
 *
 */
class TemperatureResponse {
  /**
   * Create a TemperatureResponse.
   * @property {number} [groupId]
   * @property {array} [sensors]
   */
  constructor() {
  }

  /**
   * Defines the metadata of TemperatureResponse
   *
   * @returns {object} metadata of TemperatureResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'TemperatureResponse',
      type: {
        name: 'Composite',
        className: 'TemperatureResponse',
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
                  serializedName: 'TemperatureResponseSensorsItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'TemperatureResponseSensorsItem'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = TemperatureResponse;
