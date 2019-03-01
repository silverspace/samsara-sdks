/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * The next driver signature for the DVIR.
 *
 */
class DvirBaseNextDriverSignature {
  /**
   * Create a DvirBaseNextDriverSignature.
   * @property {number} [driverId] ID of the driver who signed the DVIR
   * @property {string} [email] Email of the  driver who signed the next DVIR
   * on this vehicle.
   * @property {string} [name] The name of the driver who signed the next DVIR
   * on this vehicle.
   * @property {number} [signedAt] The time in millis when the next driver
   * signed the DVIR on this vehicle.
   * @property {string} [type] Type corresponds to driver.
   * @property {string} [username] Username of the  driver who signed the next
   * DVIR on this vehicle.
   */
  constructor() {
  }

  /**
   * Defines the metadata of DvirBaseNextDriverSignature
   *
   * @returns {object} metadata of DvirBaseNextDriverSignature
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DvirBase_nextDriverSignature',
      type: {
        name: 'Composite',
        className: 'DvirBaseNextDriverSignature',
        modelProperties: {
          driverId: {
            required: false,
            serializedName: 'driverId',
            type: {
              name: 'Number'
            }
          },
          email: {
            required: false,
            serializedName: 'email',
            type: {
              name: 'String'
            }
          },
          name: {
            required: false,
            serializedName: 'name',
            type: {
              name: 'String'
            }
          },
          signedAt: {
            required: false,
            serializedName: 'signedAt',
            type: {
              name: 'Number'
            }
          },
          type: {
            required: false,
            serializedName: 'type',
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
          }
        }
      }
    };
  }
}

module.exports = DvirBaseNextDriverSignature;
