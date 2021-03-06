/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * End (latitude, longitude) in decimal degrees.
 *
 */
class TripResponseTripsItemEndCoordinates {
  /**
   * Create a TripResponseTripsItemEndCoordinates.
   * @property {number} [latitude]
   * @property {number} [longitude]
   */
  constructor() {
  }

  /**
   * Defines the metadata of TripResponseTripsItemEndCoordinates
   *
   * @returns {object} metadata of TripResponseTripsItemEndCoordinates
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'TripResponse_tripsItem_endCoordinates',
      type: {
        name: 'Composite',
        className: 'TripResponseTripsItemEndCoordinates',
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
          }
        }
      }
    };
  }
}

module.exports = TripResponseTripsItemEndCoordinates;
