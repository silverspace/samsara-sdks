/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Information about an address/geofence. Geofences are either a circle or a
 * polygon.
 *
 */
class Address {
  /**
   * Create a Address.
   * @property {array} [contacts]
   * @property {string} [formattedAddress] The full address associated with
   * this address/geofence, as it might be recognized by maps.google.com
   * @property {object} [geofence]
   * @property {object} [geofence.circle] Information about a circular
   * geofence. This field is only populated if the geofence is a circle.
   * @property {number} [geofence.circle.latitude] The latitude of the center
   * of the circular geofence
   * @property {number} [geofence.circle.longitude] The longitude of the center
   * of the circular geofence
   * @property {number} [geofence.circle.radiusMeters] The radius of the
   * circular geofence
   * @property {object} [geofence.polygon] Information about a polygon
   * geofence. This field is only populated if the geofence is a polygon.
   * @property {array} [geofence.polygon.vertices] The vertices of the polygon
   * geofence. These geofence vertices describe the perimeter of the polygon,
   * and must consist of at least 3 vertices and less than 40.
   * @property {number} [id] ID of the address
   * @property {string} [name] Name of the address or geofence
   * @property {string} [notes]
   * @property {array} [tags]
   */
  constructor() {
  }

  /**
   * Defines the metadata of Address
   *
   * @returns {object} metadata of Address
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'Address',
      type: {
        name: 'Composite',
        className: 'Address',
        modelProperties: {
          contacts: {
            required: false,
            serializedName: 'contacts',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'ContactElementType',
                  type: {
                    name: 'Composite',
                    className: 'Contact'
                  }
              }
            }
          },
          formattedAddress: {
            required: false,
            serializedName: 'formattedAddress',
            type: {
              name: 'String'
            }
          },
          geofence: {
            required: false,
            serializedName: 'geofence',
            type: {
              name: 'Composite',
              className: 'AddressGeofence'
            }
          },
          id: {
            required: false,
            serializedName: 'id',
            type: {
              name: 'Number'
            }
          },
          name: {
            required: false,
            serializedName: 'name',
            type: {
              name: 'String'
            }
          },
          notes: {
            required: false,
            serializedName: 'notes',
            type: {
              name: 'String'
            }
          },
          tags: {
            required: false,
            serializedName: 'tags',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'TagMetadataElementType',
                  type: {
                    name: 'Composite',
                    className: 'TagMetadata'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = Address;
