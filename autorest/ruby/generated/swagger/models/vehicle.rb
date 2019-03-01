# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # A vehicle object.
    #
    class Vehicle
      # @return [Integer] Total engine hours for the vehicle.
      attr_accessor :engine_hours

      # @return [Float] The fuel level of the vehicle as a percentage. (0.0 to
      # 1.0)
      attr_accessor :fuel_level_percent

      # @return [Integer] ID of the vehicle.
      attr_accessor :id

      # @return [String] Name of the vehicle.
      attr_accessor :name

      # @return [String]
      attr_accessor :note

      # @return [Integer] The number of meters reported by the odometer.
      attr_accessor :odometer_meters

      # @return [String] Vehicle Identification Number.
      attr_accessor :vin


      #
      # Mapper for Vehicle class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'Vehicle',
          type: {
            name: 'Composite',
            class_name: 'Vehicle',
            model_properties: {
              engine_hours: {
                client_side_validation: true,
                required: false,
                serialized_name: 'engineHours',
                type: {
                  name: 'Number'
                }
              },
              fuel_level_percent: {
                client_side_validation: true,
                required: false,
                serialized_name: 'fuelLevelPercent',
                type: {
                  name: 'Double'
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
              },
              note: {
                client_side_validation: true,
                required: false,
                serialized_name: 'note',
                type: {
                  name: 'String'
                }
              },
              odometer_meters: {
                client_side_validation: true,
                required: false,
                serialized_name: 'odometerMeters',
                type: {
                  name: 'Number'
                }
              },
              vin: {
                client_side_validation: true,
                required: false,
                serialized_name: 'vin',
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
