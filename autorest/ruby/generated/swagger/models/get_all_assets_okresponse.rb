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
    class GetAllAssetsOKResponse
      # @return [Array<Asset>]
      attr_accessor :assets


      #
      # Mapper for GetAllAssetsOKResponse class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'GetAllAssetsOKResponse',
          type: {
            name: 'Composite',
            class_name: 'GetAllAssetsOKResponse',
            model_properties: {
              assets: {
                client_side_validation: true,
                required: false,
                serialized_name: 'assets',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AssetElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'Asset'
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
