/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a Pagination.
 */
class Pagination {
  /**
   * Create a Pagination.
   * @property {string} endCursor Cursor identifier representing the last
   * element in the response. This value should be used in conjunction with a
   * subsequent request's 'starting_after' query parameter.
   * @property {boolean} hasNextPage True if there are more pages of results
   * after this response.
   * @property {boolean} hasPrevPage True if there are more pages of results
   * before this response.
   * @property {string} startCursor Cursor identifier representing the first
   * element in the response. This value should be used in conjunction with a
   * subsequent request's 'ending_before' query parameter.
   */
  constructor() {
  }

  /**
   * Defines the metadata of Pagination
   *
   * @returns {object} metadata of Pagination
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'Pagination',
      type: {
        name: 'Composite',
        className: 'Pagination',
        modelProperties: {
          endCursor: {
            required: true,
            serializedName: 'endCursor',
            type: {
              name: 'String'
            }
          },
          hasNextPage: {
            required: true,
            serializedName: 'hasNextPage',
            type: {
              name: 'Boolean'
            }
          },
          hasPrevPage: {
            required: true,
            serializedName: 'hasPrevPage',
            type: {
              name: 'Boolean'
            }
          },
          startCursor: {
            required: true,
            serializedName: 'startCursor',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = Pagination;
