/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Digital value of an aux input.
 *
 */
class AuxInput {
  /**
   * Create a AuxInput.
   * @property {number} timeMs Timestamp in Unix epoch milliseconds.
   * @property {boolean} value Boolean representing the digital value of the
   * aux input.
   */
  constructor() {
  }

  /**
   * Defines the metadata of AuxInput
   *
   * @returns {object} metadata of AuxInput
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'AuxInput',
      type: {
        name: 'Composite',
        className: 'AuxInput',
        modelProperties: {
          timeMs: {
            required: true,
            serializedName: 'timeMs',
            type: {
              name: 'Number'
            }
          },
          value: {
            required: true,
            serializedName: 'value',
            type: {
              name: 'Boolean'
            }
          }
        }
      }
    };
  }
}

module.exports = AuxInput;
