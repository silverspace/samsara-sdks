/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a AssetReeferResponseReeferStatsFuelPercentageItem.
 */
class AssetReeferResponseReeferStatsFuelPercentageItem {
  /**
   * Create a AssetReeferResponseReeferStatsFuelPercentageItem.
   * @property {number} [changedAtMs] Timestamp in Unix milliseconds since
   * epoch.
   * @property {number} [fuelPercentage] Fuel percentage of the reefer.
   */
  constructor() {
  }

  /**
   * Defines the metadata of AssetReeferResponseReeferStatsFuelPercentageItem
   *
   * @returns {object} metadata of AssetReeferResponseReeferStatsFuelPercentageItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'AssetReeferResponse_reeferStats_fuelPercentageItem',
      type: {
        name: 'Composite',
        className: 'AssetReeferResponseReeferStatsFuelPercentageItem',
        modelProperties: {
          changedAtMs: {
            required: false,
            serializedName: 'changedAtMs',
            type: {
              name: 'Number'
            }
          },
          fuelPercentage: {
            required: false,
            serializedName: 'fuelPercentage',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = AssetReeferResponseReeferStatsFuelPercentageItem;
