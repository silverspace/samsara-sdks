/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

const models = require('./index');

/**
 * Class representing a TaggedVehicle.
 * @extends models['TaggedVehicleBase']
 */
class TaggedVehicle extends models['TaggedVehicleBase'] {
  /**
   * Create a TaggedVehicle.
   * @property {string} [name] Name of the Vehicle being tagged.
   */
  constructor() {
    super();
  }

  /**
   * Defines the metadata of TaggedVehicle
   *
   * @returns {object} metadata of TaggedVehicle
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'TaggedVehicle',
      type: {
        name: 'Composite',
        className: 'TaggedVehicle',
        modelProperties: {
          id: {
            required: true,
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
          }
        }
      }
    };
  }
}

module.exports = TaggedVehicle;