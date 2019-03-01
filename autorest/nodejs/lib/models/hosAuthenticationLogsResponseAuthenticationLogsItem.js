/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a HosAuthenticationLogsResponseAuthenticationLogsItem.
 */
class HosAuthenticationLogsResponseAuthenticationLogsItem {
  /**
   * Create a HosAuthenticationLogsResponseAuthenticationLogsItem.
   * @property {string} [actionType] The log type - one of 'signin' or
   * 'signout'
   * @property {string} [address] Address at which the log was recorded, if
   * applicable.
   * @property {string} [addressName] Address name from the group address book
   * at which the log was recorded, if applicable.
   * @property {string} [city] City in which the log was recorded, if
   * applicable.
   * @property {number} [happenedAtMs] The time at which the event was recorded
   * in UNIX milliseconds.
   * @property {string} [state] State in which the log was recorded, if
   * applicable.
   */
  constructor() {
  }

  /**
   * Defines the metadata of HosAuthenticationLogsResponseAuthenticationLogsItem
   *
   * @returns {object} metadata of HosAuthenticationLogsResponseAuthenticationLogsItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'HosAuthenticationLogsResponse_authenticationLogsItem',
      type: {
        name: 'Composite',
        className: 'HosAuthenticationLogsResponseAuthenticationLogsItem',
        modelProperties: {
          actionType: {
            required: false,
            serializedName: 'actionType',
            type: {
              name: 'String'
            }
          },
          address: {
            required: false,
            serializedName: 'address',
            type: {
              name: 'String'
            }
          },
          addressName: {
            required: false,
            serializedName: 'addressName',
            type: {
              name: 'String'
            }
          },
          city: {
            required: false,
            serializedName: 'city',
            type: {
              name: 'String'
            }
          },
          happenedAtMs: {
            required: false,
            serializedName: 'happenedAtMs',
            type: {
              name: 'Number'
            }
          },
          state: {
            required: false,
            serializedName: 'state',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = HosAuthenticationLogsResponseAuthenticationLogsItem;