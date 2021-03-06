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
    class AssetReeferResponseReeferStatsAlarmsItem
      # @return [Array<AssetReeferResponseReeferStatsAlarmsItemAlarmsItem>]
      attr_accessor :alarms

      # @return [Integer] Timestamp when the alarms were reported, in Unix
      # milliseconds since epoch
      attr_accessor :changed_at_ms


      #
      # Mapper for AssetReeferResponseReeferStatsAlarmsItem class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'AssetReeferResponse_reeferStats_alarmsItem',
          type: {
            name: 'Composite',
            class_name: 'AssetReeferResponseReeferStatsAlarmsItem',
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
                      serialized_name: 'AssetReeferResponseReeferStatsAlarmsItemAlarmsItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AssetReeferResponseReeferStatsAlarmsItemAlarmsItem'
                      }
                  }
                }
              },
              changed_at_ms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'changedAtMs',
                type: {
                  name: 'Number'
                }
              }
            }
          }
        }
      end
    end
  end
end
