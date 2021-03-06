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
    class DocumentFieldType
      # @return [String] Descriptive name of this field type.
      attr_accessor :label

      # @return [DocumentFieldTypeNumberValueTypeMetadata] Additional metadata
      # information for a number field type. Only defined when a field type has
      # valueType: ValueType_Number.
      attr_accessor :number_value_type_metadata

      # @return [String] The kind of value that can be submitted for this
      # fieldType. It should be either ValueType_Number, ValueType_String, or
      # ValueType_Photo.
      attr_accessor :value_type


      #
      # Mapper for DocumentFieldType class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'DocumentFieldType',
          type: {
            name: 'Composite',
            class_name: 'DocumentFieldType',
            model_properties: {
              label: {
                client_side_validation: true,
                required: true,
                serialized_name: 'label',
                type: {
                  name: 'String'
                }
              },
              number_value_type_metadata: {
                client_side_validation: true,
                required: false,
                serialized_name: 'numberValueTypeMetadata',
                type: {
                  name: 'Composite',
                  class_name: 'DocumentFieldTypeNumberValueTypeMetadata'
                }
              },
              value_type: {
                client_side_validation: true,
                required: true,
                serialized_name: 'valueType',
                type: {
                  name: 'String'
                }
              }
            }
          }
        }
      end
    end
  end
end
