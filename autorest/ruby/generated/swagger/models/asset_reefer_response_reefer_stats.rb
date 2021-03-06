# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Model object.
    #
    #
    class AssetReeferResponseReeferStats
      # @return [Array<AssetReeferResponseReeferStatsAlarmsItem>] Reefer alarms
      attr_accessor :alarms

      # @return [Array<AssetReeferResponseReeferStatsEngineHoursItem>] Engine
      # hours of the reefer
      attr_accessor :engine_hours

      # @return [Array<AssetReeferResponseReeferStatsFuelPercentageItem>] Fuel
      # percentage of the reefer
      attr_accessor :fuel_percentage

      # @return [Array<AssetReeferResponseReeferStatsPowerStatusItem>] Power
      # status of the reefer
      attr_accessor :power_status

      # @return [Array<AssetReeferResponseReeferStatsReturnAirTempItem>] Return
      # air temperature of the reefer
      attr_accessor :return_air_temp

      # @return [Array<AssetReeferResponseReeferStatsSetPointItem>] Set point
      # temperature of the reefer
      attr_accessor :set_point


      #
      # Mapper for AssetReeferResponseReeferStats class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'AssetReeferResponse_reeferStats',
          type: {
            name: 'Composite',
            class_name: 'AssetReeferResponseReeferStats',
            model_properties: {
              alarms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'alarms',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AssetReeferResponseReeferStatsAlarmsItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AssetReeferResponseReeferStatsAlarmsItem'
                      }
                  }
                }
              },
              engine_hours: {
                client_side_validation: true,
                required: false,
                serialized_name: 'engineHours',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AssetReeferResponseReeferStatsEngineHoursItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AssetReeferResponseReeferStatsEngineHoursItem'
                      }
                  }
                }
              },
              fuel_percentage: {
                client_side_validation: true,
                required: false,
                serialized_name: 'fuelPercentage',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AssetReeferResponseReeferStatsFuelPercentageItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AssetReeferResponseReeferStatsFuelPercentageItem'
                      }
                  }
                }
              },
              power_status: {
                client_side_validation: true,
                required: false,
                serialized_name: 'powerStatus',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AssetReeferResponseReeferStatsPowerStatusItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AssetReeferResponseReeferStatsPowerStatusItem'
                      }
                  }
                }
              },
              return_air_temp: {
                client_side_validation: true,
                required: false,
                serialized_name: 'returnAirTemp',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AssetReeferResponseReeferStatsReturnAirTempItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AssetReeferResponseReeferStatsReturnAirTempItem'
                      }
                  }
                }
              },
              set_point: {
                client_side_validation: true,
                required: false,
                serialized_name: 'setPoint',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AssetReeferResponseReeferStatsSetPointItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AssetReeferResponseReeferStatsSetPointItem'
                      }
                  }
                }
              }
            }
          }
        }
      end
    end
  end
end
