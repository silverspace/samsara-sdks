/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a CargoResponseSensorsItem.
 */
class CargoResponseSensorsItem {
  /**
   * Create a CargoResponseSensorsItem.
   * @property {boolean} [cargoEmpty] Flag indicating whether the current cargo
   * is empty or loaded.
   * @property {number} [id] ID of the sensor.
   * @property {string} [name] Name of the sensor.
   */
  constructor() {
  }

  /**
   * Defines the metadata of CargoResponseSensorsItem
   *
   * @returns {object} metadata of CargoResponseSensorsItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'CargoResponse_sensorsItem',
      type: {
        name: 'Composite',
        className: 'CargoResponseSensorsItem',
        modelProperties: {
          cargoEmpty: {
            required: false,
            serializedName: 'cargoEmpty',
            type: {
              name: 'Boolean'
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
          }
        }
      }
    };
  }
}

module.exports = CargoResponseSensorsItem;
