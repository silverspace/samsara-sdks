/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a VehicleMaintenanceJ1939DiagnosticTroubleCodesItem.
 */
class VehicleMaintenanceJ1939DiagnosticTroubleCodesItem {
  /**
   * Create a VehicleMaintenanceJ1939DiagnosticTroubleCodesItem.
   * @property {number} [fmiId]
   * @property {string} [fmiText]
   * @property {number} [occurrenceCount]
   * @property {string} [spnDescription]
   * @property {number} [spnId]
   * @property {number} [txId]
   */
  constructor() {
  }

  /**
   * Defines the metadata of VehicleMaintenanceJ1939DiagnosticTroubleCodesItem
   *
   * @returns {object} metadata of VehicleMaintenanceJ1939DiagnosticTroubleCodesItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'VehicleMaintenance_j1939_diagnosticTroubleCodesItem',
      type: {
        name: 'Composite',
        className: 'VehicleMaintenanceJ1939DiagnosticTroubleCodesItem',
        modelProperties: {
          fmiId: {
            required: false,
            serializedName: 'fmiId',
            type: {
              name: 'Number'
            }
          },
          fmiText: {
            required: false,
            serializedName: 'fmiText',
            type: {
              name: 'String'
            }
          },
          occurrenceCount: {
            required: false,
            serializedName: 'occurrenceCount',
            type: {
              name: 'Number'
            }
          },
          spnDescription: {
            required: false,
            serializedName: 'spnDescription',
            type: {
              name: 'String'
            }
          },
          spnId: {
            required: false,
            serializedName: 'spnId',
            type: {
              name: 'Number'
            }
          },
          txId: {
            required: false,
            serializedName: 'txId',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = VehicleMaintenanceJ1939DiagnosticTroubleCodesItem;
