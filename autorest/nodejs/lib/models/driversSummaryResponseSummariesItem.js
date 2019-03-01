/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DriversSummaryResponseSummariesItem.
 */
class DriversSummaryResponseSummariesItem {
  /**
   * Create a DriversSummaryResponseSummariesItem.
   * @property {number} [activeMs] Duration in milliseconds that driver was on
   * duty or driving during the requested time range
   * @property {number} [distanceMiles] Distance driven in miles, rounded to
   * two decimal places.
   * @property {number} [driveMs] Duration in milliseconds that driver was
   * driving during the requested time range
   * @property {number} [driverId] ID of the driver.
   * @property {string} [driverName] Name of the driver.
   * @property {string} [driverUsername] Username of the driver.
   * @property {number} [groupId] Group of the driver.
   * @property {number} [onDutyMs] Duration in milliseconds that driver was on
   * duty during the requested time range
   */
  constructor() {
  }

  /**
   * Defines the metadata of DriversSummaryResponseSummariesItem
   *
   * @returns {object} metadata of DriversSummaryResponseSummariesItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DriversSummaryResponse_SummariesItem',
      type: {
        name: 'Composite',
        className: 'DriversSummaryResponseSummariesItem',
        modelProperties: {
          activeMs: {
            required: false,
            serializedName: 'activeMs',
            type: {
              name: 'Number'
            }
          },
          distanceMiles: {
            required: false,
            serializedName: 'distanceMiles',
            type: {
              name: 'Number'
            }
          },
          driveMs: {
            required: false,
            serializedName: 'driveMs',
            type: {
              name: 'Number'
            }
          },
          driverId: {
            required: false,
            serializedName: 'driverId',
            type: {
              name: 'Number'
            }
          },
          driverName: {
            required: false,
            serializedName: 'driverName',
            type: {
              name: 'String'
            }
          },
          driverUsername: {
            required: false,
            serializedName: 'driverUsername',
            type: {
              name: 'String'
            }
          },
          groupId: {
            required: false,
            serializedName: 'groupId',
            type: {
              name: 'Number'
            }
          },
          onDutyMs: {
            required: false,
            serializedName: 'onDutyMs',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = DriversSummaryResponseSummariesItem;
