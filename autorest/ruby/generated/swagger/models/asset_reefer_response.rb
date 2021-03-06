# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Reefer-specific asset details
    #
    class AssetReeferResponse
      # @return [String] Asset type
      attr_accessor :asset_type

      # @return [Integer] Asset ID
      attr_accessor :id

      # @return [String] Asset name
      attr_accessor :name

      # @return [AssetReeferResponseReeferStats]
      attr_accessor :reefer_stats


      #
      # Mapper for AssetReeferResponse class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'AssetReeferResponse',
          type: {
            name: 'Composite',
            class_name: 'AssetReeferResponse',
            model_properties: {
              asset_type: {
                client_side_validation: true,
                required: false,
                serialized_name: 'assetType',
                type: {
                  name: 'String'
                }
              },
              id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'id',
                type: {
                  name: 'Number'
                }
              },
              name: {
                client_side_validation: true,
                required: false,
                serialized_name: 'name',
                type: {
                  name: 'String'
                }
              },
              reefer_stats: {
                client_side_validation: true,
                required: false,
                serialized_name: 'reeferStats',
                type: {
                  name: 'Composite',
                  class_name: 'AssetReeferResponseReeferStats'
                }
              }
            }
          }
        }
      end
    end
  end
end
