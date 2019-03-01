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
    class ReactivateDriverParam
      # @return [Boolean] True indicates that this driver should be
      # reactivated.
      attr_accessor :reactivate


      #
      # Mapper for ReactivateDriverParam class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'reactivateDriverParam',
          type: {
            name: 'Composite',
            class_name: 'ReactivateDriverParam',
            model_properties: {
              reactivate: {
                client_side_validation: true,
                required: true,
                serialized_name: 'reactivate',
                type: {
                  name: 'Boolean'
                }
              }
            }
          }
        }
      end
    end
  end
end
