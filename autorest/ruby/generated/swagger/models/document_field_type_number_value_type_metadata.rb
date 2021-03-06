# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Additional metadata information for a number field type. Only defined
    # when a field type has valueType: ValueType_Number.
    #
    class DocumentFieldTypeNumberValueTypeMetadata
      # @return [Float] Number of decimal places that values for this field
      # type can have.
      attr_accessor :num_decimal_places


      #
      # Mapper for DocumentFieldTypeNumberValueTypeMetadata class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'DocumentFieldType_numberValueTypeMetadata',
          type: {
            name: 'Composite',
            class_name: 'DocumentFieldTypeNumberValueTypeMetadata',
            model_properties: {
              num_decimal_places: {
                client_side_validation: true,
                required: false,
                serialized_name: 'numDecimalPlaces',
                type: {
                  name: 'Double'
                }
              }
            }
          }
        }
      end
    end
  end
end
