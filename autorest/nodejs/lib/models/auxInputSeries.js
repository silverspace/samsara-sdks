/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * A list of aux input values over a timerange.
 *
 */
class AuxInputSeries {
  /**
   * Create a AuxInputSeries.
   * @property {string} name The name of the aux input. Possible values
   * include: 'Emergency Lights', 'Emergency Alarm', 'Stop Paddle', 'Power
   * Take-Off', 'Plow', 'Sweeper', 'Salter', 'Boom'
   * @property {array} values
   */
  constructor() {
  }

  /**
   * Defines the metadata of AuxInputSeries
   *
   * @returns {object} metadata of AuxInputSeries
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'AuxInputSeries',
      type: {
        name: 'Composite',
        className: 'AuxInputSeries',
        modelProperties: {
          name: {
            required: true,
            serializedName: 'name',
            type: {
              name: 'String'
            }
          },
          values: {
            required: true,
            serializedName: 'values',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'AuxInputElementType',
                  type: {
                    name: 'Composite',
                    className: 'AuxInput'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = AuxInputSeries;
