/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a AssetReeferResponseReeferStatsReturnAirTempItem.
 */
class AssetReeferResponseReeferStatsReturnAirTempItem {
  /**
   * Create a AssetReeferResponseReeferStatsReturnAirTempItem.
   * @property {number} [changedAtMs] Timestamp in Unix milliseconds since
   * epoch.
   * @property {number} [tempInMilliC] Return air temperature in millidegree
   * Celsius.
   */
  constructor() {
  }

  /**
   * Defines the metadata of AssetReeferResponseReeferStatsReturnAirTempItem
   *
   * @returns {object} metadata of AssetReeferResponseReeferStatsReturnAirTempItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'AssetReeferResponse_reeferStats_returnAirTempItem',
      type: {
        name: 'Composite',
        className: 'AssetReeferResponseReeferStatsReturnAirTempItem',
        modelProperties: {
          changedAtMs: {
            required: false,
            serializedName: 'changedAtMs',
            type: {
              name: 'Number'
            }
          },
          tempInMilliC: {
            required: false,
            serializedName: 'tempInMilliC',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = AssetReeferResponseReeferStatsReturnAirTempItem;
