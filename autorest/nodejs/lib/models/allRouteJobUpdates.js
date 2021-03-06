/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a AllRouteJobUpdates.
 */
class AllRouteJobUpdates {
  /**
   * Create a AllRouteJobUpdates.
   * @property {array} [jobUpdates]
   * @property {string} [sequenceId] Sequence ID of the last update returned in
   * the response
   */
  constructor() {
  }

  /**
   * Defines the metadata of AllRouteJobUpdates
   *
   * @returns {object} metadata of AllRouteJobUpdates
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'allRouteJobUpdates',
      type: {
        name: 'Composite',
        className: 'AllRouteJobUpdates',
        modelProperties: {
          jobUpdates: {
            required: false,
            serializedName: 'job_updates',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'JobUpdateObjectElementType',
                  type: {
                    name: 'Composite',
                    className: 'JobUpdateObject'
                  }
              }
            }
          },
          sequenceId: {
            required: false,
            serializedName: 'sequence_id',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = AllRouteJobUpdates;
