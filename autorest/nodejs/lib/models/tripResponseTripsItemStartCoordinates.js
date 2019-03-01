/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Start (latitude, longitude) in decimal degrees.
 *
 */
class TripResponseTripsItemStartCoordinates {
  /**
   * Create a TripResponseTripsItemStartCoordinates.
   * @property {number} [latitude]
   * @property {number} [longitude]
   */
  constructor() {
  }

  /**
   * Defines the metadata of TripResponseTripsItemStartCoordinates
   *
   * @returns {object} metadata of TripResponseTripsItemStartCoordinates
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'TripResponse_tripsItem_startCoordinates',
      type: {
        name: 'Composite',
        className: 'TripResponseTripsItemStartCoordinates',
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

module.exports = TripResponseTripsItemStartCoordinates;