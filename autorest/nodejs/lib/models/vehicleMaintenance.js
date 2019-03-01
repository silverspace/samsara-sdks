/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Contains any J1939/Passenger engine light warnings and engine faults.
 *
 */
class VehicleMaintenance {
  /**
   * Create a VehicleMaintenance.
   * @property {number} id ID of the vehicle.
   * @property {object} [j1939] J1939 based data. Null if no data is available.
   * @property {object} [j1939.checkEngineLight] J1939 check engine lights.
   * @property {boolean} [j1939.checkEngineLight.emissionsIsOn]
   * @property {boolean} [j1939.checkEngineLight.protectIsOn]
   * @property {boolean} [j1939.checkEngineLight.stopIsOn]
   * @property {boolean} [j1939.checkEngineLight.warningIsOn]
   * @property {array} [j1939.diagnosticTroubleCodes] J1939 DTCs.
   * @property {object} [passenger] Passenger vehicle data. Null if no data is
   * available.
   * @property {object} [passenger.checkEngineLight] Passenger vehicle check
   * engine light.
   * @property {boolean} [passenger.checkEngineLight.isOn]
   * @property {array} [passenger.diagnosticTroubleCodes] Passenger vehicle
   * DTCs.
   */
  constructor() {
  }

  /**
   * Defines the metadata of VehicleMaintenance
   *
   * @returns {object} metadata of VehicleMaintenance
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'VehicleMaintenance',
      type: {
        name: 'Composite',
        className: 'VehicleMaintenance',
        modelProperties: {
          id: {
            required: true,
            serializedName: 'id',
            type: {
              name: 'Number'
            }
          },
          j1939: {
            required: false,
            serializedName: 'j1939',
            type: {
              name: 'Composite',
              className: 'VehicleMaintenanceJ1939'
            }
          },
          passenger: {
            required: false,
            serializedName: 'passenger',
            type: {
              name: 'Composite',
              className: 'VehicleMaintenancePassenger'
            }
          }
        }
      }
    };
  }
}

module.exports = VehicleMaintenance;