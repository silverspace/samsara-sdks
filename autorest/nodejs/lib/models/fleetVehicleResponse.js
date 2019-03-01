/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * A vehicle object as returned for fleet/vehicle
 *
 */
class FleetVehicleResponse {
  /**
   * Create a FleetVehicleResponse.
   * @property {object} [externalIds]
   * @property {string} [harshAccelSetting] Harsh event detection setting.
   * @property {number} id ID of the vehicle.
   * @property {string} name Name of the vehicle.
   * @property {object} [vehicleInfo]
   * @property {string} [vehicleInfo.make] Make of the vehicle.
   * @property {string} [vehicleInfo.model] Model of the Vehicle.
   * @property {string} [vehicleInfo.vin] Vehicle Identification Number.
   * @property {number} [vehicleInfo.year] Year of the vehicle.
   */
  constructor() {
  }

  /**
   * Defines the metadata of FleetVehicleResponse
   *
   * @returns {object} metadata of FleetVehicleResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'FleetVehicleResponse',
      type: {
        name: 'Composite',
        className: 'FleetVehicleResponse',
        modelProperties: {
          externalIds: {
            required: false,
            serializedName: 'externalIds',
            type: {
              name: 'Dictionary',
              value: {
                  required: false,
                  serializedName: 'StringElementType',
                  type: {
                    name: 'String'
                  }
              }
            }
          },
          harshAccelSetting: {
            required: false,
            serializedName: 'harshAccelSetting',
            type: {
              name: 'String'
            }
          },
          id: {
            required: true,
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
          vehicleInfo: {
            required: false,
            serializedName: 'vehicleInfo',
            type: {
              name: 'Composite',
              className: 'FleetVehicleResponseVehicleInfo'
            }
          }
        }
      }
    };
  }
}

module.exports = FleetVehicleResponse;
