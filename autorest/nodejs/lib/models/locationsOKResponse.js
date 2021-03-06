/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a LocationsOKResponse.
 */
class LocationsOKResponse {
  /**
   * Create a LocationsOKResponse.
   * @property {number} [groupId] Group ID to query.
   * @property {array} [vehicles]
   */
  constructor() {
  }

  /**
   * Defines the metadata of LocationsOKResponse
   *
   * @returns {object} metadata of LocationsOKResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'LocationsOKResponse',
      type: {
        name: 'Composite',
        className: 'LocationsOKResponse',
        modelProperties: {
          groupId: {
            required: false,
            serializedName: 'groupId',
            type: {
              name: 'Number'
            }
          },
          vehicles: {
            required: false,
            serializedName: 'vehicles',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'VehicleLocationElementType',
                  type: {
                    name: 'Composite',
                    className: 'VehicleLocation'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = LocationsOKResponse;
