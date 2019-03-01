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
    class HistoryParamModel
      # @return [Integer] End of the time range, specified in milliseconds UNIX
      # time.
      attr_accessor :end_ms

      # @return [Enum] Possible values include: 'withNull', 'withPrevious'.
      # Default value: 'withNull' .
      attr_accessor :fill_missing

      # @return [Integer] Group ID to query.
      attr_accessor :group_id

      # @return [Array<HistoryParamSeriesItem>]
      attr_accessor :series

      # @return [Integer] Beginning of the time range, specified in
      # milliseconds UNIX time.
      attr_accessor :start_ms

      # @return [Integer] Time resolution for which data should be returned, in
      # milliseconds. Specifying 3600000 will return data at hour intervals.
      attr_accessor :step_ms


      #
      # Mapper for HistoryParamModel class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'historyParam',
          type: {
            name: 'Composite',
            class_name: 'HistoryParamModel',
            model_properties: {
              end_ms: {
                client_side_validation: true,
                required: true,
                serialized_name: 'endMs',
                type: {
                  name: 'Number'
                }
              },
              fill_missing: {
                client_side_validation: true,
                required: false,
                serialized_name: 'fillMissing',
                default_value: 'withNull',
                type: {
                  name: 'String'
                }
              },
              group_id: {
                client_side_validation: true,
                required: true,
                serialized_name: 'groupId',
                type: {
                  name: 'Number'
                }
              },
              series: {
                client_side_validation: true,
                required: true,
                serialized_name: 'series',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'HistoryParamSeriesItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'HistoryParamSeriesItem'
                      }
                  }
                }
              },
              start_ms: {
                client_side_validation: true,
                required: true,
                serialized_name: 'startMs',
                type: {
                  name: 'Number'
                }
              },
              step_ms: {
                client_side_validation: true,
                required: true,
                serialized_name: 'stepMs',
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
