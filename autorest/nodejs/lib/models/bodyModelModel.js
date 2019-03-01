/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a BodyModelModel.
 */
class BodyModelModel {
  /**
   * Create a BodyModelModel.
   * @property {number} groupId Group ID to query.
   * @property {array} sensors List of sensor IDs to query.
   */
  constructor() {
  }

  /**
   * Defines the metadata of BodyModelModel
   *
   * @returns {object} metadata of BodyModelModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'body',
      type: {
        name: 'Composite',
        className: 'BodyModelModel',
        modelProperties: {
          groupId: {
            required: true,
            serializedName: 'groupId',
            type: {
              name: 'Number'
            }
          },
          sensors: {
            required: true,
            serializedName: 'sensors',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'NumberElementType',
                  type: {
                    name: 'Number'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = BodyModelModel;
