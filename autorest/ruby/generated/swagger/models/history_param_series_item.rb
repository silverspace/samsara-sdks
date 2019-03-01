# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Sensor ID and field to query.
    #
    class HistoryParamSeriesItem
      # @return [Enum] Field to query. Possible values include:
      # 'ambientTemperature', 'probeTemperature', 'currentLoop1Raw',
      # 'currentLoop1Mapped', 'currentLoop2Raw', 'currentLoop2Mapped',
      # 'pmPowerTotal', 'pmPhase1Power', 'pmPhase2Power', 'pmPhase3Power',
      # 'pmPhase1PowerFactor', 'pmPhase2PowerFactor', 'pmPhase3PowerFactor'
      attr_accessor :field

      # @return [Integer] Sensor ID to query.
      attr_accessor :widget_id


      #
      # Mapper for HistoryParamSeriesItem class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'historyParam_seriesItem',
          type: {
            name: 'Composite',
            class_name: 'HistoryParamSeriesItem',
            model_properties: {
              field: {
                client_side_validation: true,
                required: false,
                serialized_name: 'field',
                type: {
                  name: 'String'
                }
              },
              widget_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'widgetId',
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