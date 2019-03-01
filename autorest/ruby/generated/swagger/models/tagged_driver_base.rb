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
    class TaggedDriverBase
      # @return [Integer] The ID of the Driver being tagged.
      attr_accessor :id


      #
      # Mapper for TaggedDriverBase class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'TaggedDriverBase',
          type: {
            name: 'Composite',
            class_name: 'TaggedDriverBase',
            model_properties: {
              id: {
                client_side_validation: true,
                required: true,
                serialized_name: 'id',
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