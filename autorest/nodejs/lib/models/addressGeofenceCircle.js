/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Information about a circular geofence. This field is only populated if the
 * geofence is a circle.
 *
 */
class AddressGeofenceCircle {
  /**
   * Create a AddressGeofenceCircle.
   * @property {number} [latitude] The latitude of the center of the circular
   * geofence
   * @property {number} [longitude] The longitude of the center of the circular
   * geofence
   * @property {number} [radiusMeters] The radius of the circular geofence
   */
  constructor() {
  }

  /**
   * Defines the metadata of AddressGeofenceCircle
   *
   * @returns {object} metadata of AddressGeofenceCircle
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'AddressGeofence_circle',
      type: {
        name: 'Composite',
        className: 'AddressGeofenceCircle',
        modelProperties: {
          latitude: {
            required: false,
            serializedName: 'latitude',
            type: {
              name: 'Number'
            }
          },
          longitude: {
            required: false,
            serializedName: 'longitude',
            type: {
              name: 'Number'
            }
          },
          radiusMeters: {
            required: false,
            serializedName: 'radiusMeters',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = AddressGeofenceCircle;
