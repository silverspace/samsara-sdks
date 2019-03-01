/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a SensorsOKResponse.
 */
class SensorsOKResponse {
  /**
   * Create a SensorsOKResponse.
   * @property {array} [sensors]
   */
  constructor() {
  }

  /**
   * Defines the metadata of SensorsOKResponse
   *
   * @returns {object} metadata of SensorsOKResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'SensorsOKResponse',
      type: {
        name: 'Composite',
        className: 'SensorsOKResponse',
        modelProperties: {
          sensors: {
            required: false,
            serializedName: 'sensors',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'SensorElementType',
                  type: {
                    name: 'Composite',
                    className: 'Sensor'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = SensorsOKResponse;
