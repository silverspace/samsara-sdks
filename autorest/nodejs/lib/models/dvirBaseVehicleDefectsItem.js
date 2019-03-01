/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DvirBaseVehicleDefectsItem.
 */
class DvirBaseVehicleDefectsItem {
  /**
   * Create a DvirBaseVehicleDefectsItem.
   * @property {string} [comment] The comment describing the type of DVIR
   * defect
   * @property {string} [defectType] The type of DVIR defect
   */
  constructor() {
  }

  /**
   * Defines the metadata of DvirBaseVehicleDefectsItem
   *
   * @returns {object} metadata of DvirBaseVehicleDefectsItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DvirBase_vehicleDefectsItem',
      type: {
        name: 'Composite',
        className: 'DvirBaseVehicleDefectsItem',
        modelProperties: {
          comment: {
            required: false,
            serializedName: 'comment',
            type: {
              name: 'String'
            }
          },
          defectType: {
            required: false,
            serializedName: 'defectType',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = DvirBaseVehicleDefectsItem;