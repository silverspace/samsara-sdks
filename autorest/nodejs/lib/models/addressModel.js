/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a AddressModel.
 */
class AddressModel {
  /**
   * Create a AddressModel.
   * @property {array} [contactIds]
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
   * @property {string} [name] The name of this address/geofence
   * @property {string} [notes]
   * @property {array} [tagIds]
   */
  constructor() {
  }

  /**
   * Defines the metadata of AddressModel
   *
   * @returns {object} metadata of AddressModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'address',
      type: {
        name: 'Composite',
        className: 'AddressModel',
        modelProperties: {
          contactIds: {
            required: false,
            serializedName: 'contactIds',
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
          tagIds: {
            required: false,
            serializedName: 'tagIds',
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

module.exports = AddressModel;
