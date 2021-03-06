/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a TemperatureResponseSensorsItem.
 */
class TemperatureResponseSensorsItem {
  /**
   * Create a TemperatureResponseSensorsItem.
   * @property {number} [ambientTemperature] Currently reported ambient
   * temperature in millidegrees celsius.
   * @property {number} [id] ID of the sensor.
   * @property {string} [name] Name of the sensor.
   * @property {number} [probeTemperature] Currently reported probe temperature
   * in millidegrees celsius. If no probe is connected, this parameter will not
   * be reported.
   */
  constructor() {
  }

  /**
   * Defines the metadata of TemperatureResponseSensorsItem
   *
   * @returns {object} metadata of TemperatureResponseSensorsItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'TemperatureResponse_sensorsItem',
      type: {
        name: 'Composite',
        className: 'TemperatureResponseSensorsItem',
        modelProperties: {
          ambientTemperature: {
            required: false,
            serializedName: 'ambientTemperature',
            type: {
              name: 'Number'
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
          probeTemperature: {
            required: false,
            serializedName: 'probeTemperature',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = TemperatureResponseSensorsItem;
