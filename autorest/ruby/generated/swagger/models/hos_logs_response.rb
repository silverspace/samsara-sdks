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
    class HosLogsResponse
      # @return [Array<HosLogsResponseLogsItem>]
      attr_accessor :logs


      #
      # Mapper for HosLogsResponse class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'HosLogsResponse',
          type: {
            name: 'Composite',
            class_name: 'HosLogsResponse',
            model_properties: {
              logs: {
                client_side_validation: true,
                required: false,
                serialized_name: 'logs',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'HosLogsResponseLogsItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'HosLogsResponseLogsItem'
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
