/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a GetAllAssetCurrentLocationsOKResponse.
 */
class GetAllAssetCurrentLocationsOKResponse {
  /**
   * Create a GetAllAssetCurrentLocationsOKResponse.
   * @property {array} [assets]
   */
  constructor() {
  }

  /**
   * Defines the metadata of GetAllAssetCurrentLocationsOKResponse
   *
   * @returns {object} metadata of GetAllAssetCurrentLocationsOKResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'GetAllAssetCurrentLocationsOKResponse',
      type: {
        name: 'Composite',
        className: 'GetAllAssetCurrentLocationsOKResponse',
        modelProperties: {
          assets: {
            required: false,
            serializedName: 'assets',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'AssetCurrentLocationsResponseElementType',
                  type: {
                    name: 'Composite',
                    className: 'AssetCurrentLocationsResponse'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = GetAllAssetCurrentLocationsOKResponse;
