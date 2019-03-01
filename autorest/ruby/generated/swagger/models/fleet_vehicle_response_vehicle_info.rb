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
    class FleetVehicleResponseVehicleInfo
      # @return [String] Make of the vehicle.
      attr_accessor :make

      # @return [String] Model of the Vehicle.
      attr_accessor :model

      # @return [String] Vehicle Identification Number.
      attr_accessor :vin

      # @return [Integer] Year of the vehicle.
      attr_accessor :year


      #
      # Mapper for FleetVehicleResponseVehicleInfo class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'FleetVehicleResponse_vehicleInfo',
          type: {
            name: 'Composite',
            class_name: 'FleetVehicleResponseVehicleInfo',
            model_properties: {
              make: {
                client_side_validation: true,
                required: false,
                serialized_name: 'make',
                type: {
                  name: 'String'
                }
              },
              model: {
                client_side_validation: true,
                required: false,
                serialized_name: 'model',
                type: {
                  name: 'String'
                }
              },
              vin: {
                client_side_validation: true,
                required: false,
                serialized_name: 'vin',
                type: {
                  name: 'String'
                }
              },
              year: {
                client_side_validation: true,
                required: false,
                serialized_name: 'year',
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
