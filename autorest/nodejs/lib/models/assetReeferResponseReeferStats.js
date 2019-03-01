/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a AssetReeferResponseReeferStats.
 */
class AssetReeferResponseReeferStats {
  /**
   * Create a AssetReeferResponseReeferStats.
   * @property {array} [alarms] Reefer alarms
   * @property {array} [engineHours] Engine hours of the reefer
   * @property {array} [fuelPercentage] Fuel percentage of the reefer
   * @property {array} [powerStatus] Power status of the reefer
   * @property {array} [returnAirTemp] Return air temperature of the reefer
   * @property {array} [setPoint] Set point temperature of the reefer
   */
  constructor() {
  }

  /**
   * Defines the metadata of AssetReeferResponseReeferStats
   *
   * @returns {object} metadata of AssetReeferResponseReeferStats
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'AssetReeferResponse_reeferStats',
      type: {
        name: 'Composite',
        className: 'AssetReeferResponseReeferStats',
        modelProperties: {
          alarms: {
            required: false,
            serializedName: 'alarms',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'AssetReeferResponseReeferStatsAlarmsItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'AssetReeferResponseReeferStatsAlarmsItem'
                  }
              }
            }
          },
          engineHours: {
            required: false,
            serializedName: 'engineHours',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'AssetReeferResponseReeferStatsEngineHoursItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'AssetReeferResponseReeferStatsEngineHoursItem'
                  }
              }
            }
          },
          fuelPercentage: {
            required: false,
            serializedName: 'fuelPercentage',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'AssetReeferResponseReeferStatsFuelPercentageItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'AssetReeferResponseReeferStatsFuelPercentageItem'
                  }
              }
            }
          },
          powerStatus: {
            required: false,
            serializedName: 'powerStatus',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'AssetReeferResponseReeferStatsPowerStatusItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'AssetReeferResponseReeferStatsPowerStatusItem'
                  }
              }
            }
          },
          returnAirTemp: {
            required: false,
            serializedName: 'returnAirTemp',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'AssetReeferResponseReeferStatsReturnAirTempItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'AssetReeferResponseReeferStatsReturnAirTempItem'
                  }
              }
            }
          },
          setPoint: {
            required: false,
            serializedName: 'setPoint',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'AssetReeferResponseReeferStatsSetPointItemElementType',
                  type: {
                    name: 'Composite',
                    className: 'AssetReeferResponseReeferStatsSetPointItem'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = AssetReeferResponseReeferStats;
