/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a AssetReeferResponseReeferStatsSetPointItem.
 */
class AssetReeferResponseReeferStatsSetPointItem {
  /**
   * Create a AssetReeferResponseReeferStatsSetPointItem.
   * @property {number} [changedAtMs] Timestamp in Unix milliseconds since
   * epoch.
   * @property {number} [tempInMilliC] Set point temperature in millidegree
   * Celsius.
   */
  constructor() {
  }

  /**
   * Defines the metadata of AssetReeferResponseReeferStatsSetPointItem
   *
   * @returns {object} metadata of AssetReeferResponseReeferStatsSetPointItem
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'AssetReeferResponse_reeferStats_setPointItem',
      type: {
        name: 'Composite',
        className: 'AssetReeferResponseReeferStatsSetPointItem',
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

module.exports = AssetReeferResponseReeferStatsSetPointItem;
