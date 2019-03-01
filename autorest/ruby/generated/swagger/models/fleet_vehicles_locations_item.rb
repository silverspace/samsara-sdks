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
    class FleetVehiclesLocationsItem
      # @return [Integer] ID of the vehicle.
      attr_accessor :id

      # @return [Array<FleetVehicleLocation>]
      attr_accessor :locations

      # @return [String] Name of the vehicle.
      attr_accessor :name


      #
      # Mapper for FleetVehiclesLocationsItem class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'FleetVehiclesLocationsItem',
          type: {
            name: 'Composite',
            class_name: 'FleetVehiclesLocationsItem',
            model_properties: {
              id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'id',
                type: {
                  name: 'Number'
                }
              },
              locations: {
                client_side_validation: true,
                required: false,
                serialized_name: 'locations',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'FleetVehicleLocationElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'FleetVehicleLocation'
                      }
                  }
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
