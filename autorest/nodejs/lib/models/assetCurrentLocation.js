/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Current location of an asset
 *
 */
class AssetCurrentLocation {
  /**
   * Create a AssetCurrentLocation.
   * @property {number} [latitude] The latitude of the location in degrees.
   * @property {string} [location] The best effort (street,city,state) for the
   * latitude and longitude.
   * @property {number} [longitude] The longitude of the location in degrees.
   * @property {number} [speedMilesPerHour] The speed calculated from GPS that
   * the asset was traveling at in miles per hour.
   * @property {number} [timeMs] Time in Unix milliseconds since epoch when the
   * asset was at the location.
   */
  constructor() {
  }

  /**
   * Defines the metadata of AssetCurrentLocation
   *
   * @returns {object} metadata of AssetCurrentLocation
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'AssetCurrentLocation',
      type: {
        name: 'Composite',
        className: 'AssetCurrentLocation',
        modelProperties: {
          latitude: {
            required: false,
            serializedName: 'latitude',
            type: {
              name: 'Number'
            }
          },
          location: {
            required: false,
            serializedName: 'location',
            type: {
              name: 'String'
            }
          },
          longitude: {
            required: false,
            serializedName: 'longitude',
            type: {
              name: 'Number'
            }
          },
          speedMilesPerHour: {
            required: false,
            serializedName: 'speedMilesPerHour',
            type: {
              name: 'Number'
            }
          },
          timeMs: {
            required: false,
            serializedName: 'timeMs',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = AssetCurrentLocation;