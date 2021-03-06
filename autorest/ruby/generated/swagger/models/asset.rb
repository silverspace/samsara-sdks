# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Basic information of an asset
    #
    class Asset
      # @return [String] Serial number of the host asset
      attr_accessor :asset_serial_number

      # @return [Array<AssetCableItem>] The cable connected to the asset
      attr_accessor :cable

      # @return [Integer] Engine hours
      attr_accessor :engine_hours

      # @return [Integer] Asset ID
      attr_accessor :id

      # @return [String] Asset name
      attr_accessor :name


      #
      # Mapper for Asset class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'Asset',
          type: {
            name: 'Composite',
            class_name: 'Asset',
            model_properties: {
              asset_serial_number: {
                client_side_validation: true,
                required: false,
                serialized_name: 'assetSerialNumber',
                type: {
                  name: 'String'
                }
              },
              cable: {
                client_side_validation: true,
                required: false,
                serialized_name: 'cable',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'AssetCableItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'AssetCableItem'
                      }
                  }
                }
              },
              engine_hours: {
                client_side_validation: true,
                required: false,
                serialized_name: 'engineHours',
                type: {
                  name: 'Number'
                }
              },
              id: {
                client_side_validation: true,
                required: true,
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
              }
            }
          }
        }
      end
    end
  end
end
