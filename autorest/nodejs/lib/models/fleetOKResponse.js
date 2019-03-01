/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a FleetOKResponse.
 */
class FleetOKResponse {
  /**
   * Create a FleetOKResponse.
   * @property {number} [groupId] Group ID to query.
   * @property {object} [pagination]
   * @property {string} [pagination.endCursor] Cursor identifier representing
   * the last element in the response. This value should be used in conjunction
   * with a subsequent request's 'starting_after' query parameter.
   * @property {boolean} [pagination.hasNextPage] True if there are more pages
   * of results after this response.
   * @property {boolean} [pagination.hasPrevPage] True if there are more pages
   * of results before this response.
   * @property {string} [pagination.startCursor] Cursor identifier representing
   * the first element in the response. This value should be used in
   * conjunction with a subsequent request's 'ending_before' query parameter.
   * @property {array} [vehicles]
   */
  constructor() {
  }

  /**
   * Defines the metadata of FleetOKResponse
   *
   * @returns {object} metadata of FleetOKResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'FleetOKResponse',
      type: {
        name: 'Composite',
        className: 'FleetOKResponse',
        modelProperties: {
          groupId: {
            required: false,
            serializedName: 'groupId',
            type: {
              name: 'Number'
            }
          },
          pagination: {
            required: false,
            serializedName: 'pagination',
            type: {
              name: 'Composite',
              className: 'Pagination'
            }
          },
          vehicles: {
            required: false,
            serializedName: 'vehicles',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'VehicleElementType',
                  type: {
                    name: 'Composite',
                    className: 'Vehicle'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = FleetOKResponse;