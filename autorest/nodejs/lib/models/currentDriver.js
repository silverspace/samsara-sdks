/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

const models = require('./index');

/**
 * Class representing a CurrentDriver.
 * @extends models['DriverBase']
 */
class CurrentDriver extends models['DriverBase'] {
  /**
   * Create a CurrentDriver.
   * @property {number} id ID of the driver.
   * @property {boolean} [isDeactivated] True if the driver account has been
   * deactivated.
   * @property {array} [tags]
   * @property {number} [currentVehicleId] ID of the vehicle that this driver
   * is currently assigned to. Omitted if there is no current vehicle
   * assignment for this driver.
   */
  constructor() {
    super();
  }

  /**
   * Defines the metadata of CurrentDriver
   *
   * @returns {object} metadata of CurrentDriver
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'CurrentDriver',
      type: {
        name: 'Composite',
        className: 'CurrentDriver',
        modelProperties: {
          eldAdverseWeatherExemptionEnabled: {
            required: false,
            serializedName: 'eldAdverseWeatherExemptionEnabled',
            type: {
              name: 'Boolean'
            }
          },
          eldBigDayExemptionEnabled: {
            required: false,
            serializedName: 'eldBigDayExemptionEnabled',
            type: {
              name: 'Boolean'
            }
          },
          eldDayStartHour: {
            required: false,
            serializedName: 'eldDayStartHour',
            type: {
              name: 'Number'
            }
          },
          eldExempt: {
            required: false,
            serializedName: 'eldExempt',
            type: {
              name: 'Boolean'
            }
          },
          eldExemptReason: {
            required: false,
            serializedName: 'eldExemptReason',
            type: {
              name: 'String'
            }
          },
          eldPcEnabled: {
            required: false,
            serializedName: 'eldPcEnabled',
            defaultValue: false,
            type: {
              name: 'Boolean'
            }
          },
          eldYmEnabled: {
            required: false,
            serializedName: 'eldYmEnabled',
            defaultValue: false,
            type: {
              name: 'Boolean'
            }
          },
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
          groupId: {
            required: false,
            serializedName: 'groupId',
            type: {
              name: 'Number'
            }
          },
          licenseNumber: {
            required: false,
            serializedName: 'licenseNumber',
            type: {
              name: 'String'
            }
          },
          licenseState: {
            required: false,
            serializedName: 'licenseState',
            type: {
              name: 'String'
            }
          },
          name: {
            required: true,
            serializedName: 'name',
            type: {
              name: 'String'
            }
          },
          notes: {
            required: false,
            serializedName: 'notes',
            type: {
              name: 'String'
            }
          },
          phone: {
            required: false,
            serializedName: 'phone',
            type: {
              name: 'String'
            }
          },
          username: {
            required: false,
            serializedName: 'username',
            type: {
              name: 'String'
            }
          },
          vehicleId: {
            required: false,
            serializedName: 'vehicleId',
            type: {
              name: 'Number'
            }
          },
          id: {
            required: true,
            serializedName: 'id',
            type: {
              name: 'Number'
            }
          },
          isDeactivated: {
            required: false,
            serializedName: 'isDeactivated',
            type: {
              name: 'Boolean'
            }
          },
          tags: {
            required: false,
            serializedName: 'tags',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'TagMetadataElementType',
                  type: {
                    name: 'Composite',
                    className: 'TagMetadata'
                  }
              }
            }
          },
          currentVehicleId: {
            required: false,
            serializedName: 'currentVehicleId',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = CurrentDriver;