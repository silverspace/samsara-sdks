/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Passenger vehicle data. Null if no data is available.
 *
 */
class VehicleMaintenancePassenger {
  /**
   * Create a VehicleMaintenancePassenger.
   * @property {object} [checkEngineLight] Passenger vehicle check engine
   * light.
   * @property {boolean} [checkEngineLight.isOn]
   * @property {array} [diagnosticTroubleCodes] Passenger vehicle DTCs.
   */
  constructor() {
  }

  /**
   * Defines the metadata of VehicleMaintenancePassenger
   *
   * @returns {object} metadata of VehicleMaintenancePassenger
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'VehicleMaintenance_passenger',
      type: {
        name: 'Composite',
        className: 'VehicleMaintenancePassenger',
        modelProperties: {
          checkEngineLight: {
            required: false,
            serializedName: 'checkEngineLight',
            type: {
              name: 'Composite',
              className: 'VehicleMaintenancePassengerCheckEngineLight'
            }
          },
          diagnosticTroubleCodes: {
            required: false,
            serializedName: 'diagnosticTroubleCodes',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'VehicleMaintenancePassengerDiagnosticTroubleCodesItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'VehicleMaintenancePassengerDiagnosticTroubleCodesItem'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = VehicleMaintenancePassenger;