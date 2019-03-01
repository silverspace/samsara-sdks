# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Contains information about a sensor.
    #
    class Sensor
      # @return [Integer] ID of the sensor.
      attr_accessor :id

      # @return [String] MAC address of the sensor.
      attr_accessor :mac_address

      # @return [String] Name of the sensor.
      attr_accessor :name


      #
      # Mapper for Sensor class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'Sensor',
          type: {
            name: 'Composite',
            class_name: 'Sensor',
            model_properties: {
              id: {
                client_side_validation: true,
                required: true,
                serialized_name: 'id',
                type: {
                  name: 'Number'
                }
              },
              mac_address: {
                client_side_validation: true,
                required: false,
                serialized_name: 'macAddress',
                type: {
                  name: 'String'
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