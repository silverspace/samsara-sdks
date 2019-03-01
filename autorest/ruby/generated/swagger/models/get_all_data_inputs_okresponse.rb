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
    class GetAllDataInputsOKResponse
      # @return [Array<DataInputHistoryResponse>]
      attr_accessor :data_inputs


      #
      # Mapper for GetAllDataInputsOKResponse class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'GetAllDataInputsOKResponse',
          type: {
            name: 'Composite',
            class_name: 'GetAllDataInputsOKResponse',
            model_properties: {
              data_inputs: {
                client_side_validation: true,
                required: false,
                serialized_name: 'dataInputs',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'DataInputHistoryResponseElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'DataInputHistoryResponse'
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