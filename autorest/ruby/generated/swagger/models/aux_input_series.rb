# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # A list of aux input values over a timerange.
    #
    class AuxInputSeries
      # @return [Enum] The name of the aux input. Possible values include:
      # 'Emergency Lights', 'Emergency Alarm', 'Stop Paddle', 'Power Take-Off',
      # 'Plow', 'Sweeper', 'Salter', 'Boom'
      attr_accessor :name

      # @return [Array<AuxInput>]
      attr_accessor :values


      #
      # Mapper for AuxInputSeries class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'AuxInputSeries',
          type: {
            name: 'Composite',
            class_name: 'AuxInputSeries',
            model_properties: {
              name: {
                client_side_validation: true,
                required: true,
                serialized_name: 'name',
                type: {
                  name: 'String'
                }
              },
              values: {
                client_side_validation: true,
                required: true,
                serialized_name: 'values',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AuxInputElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AuxInput'
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