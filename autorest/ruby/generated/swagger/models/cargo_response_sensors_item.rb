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
    class CargoResponseSensorsItem
      # @return [Boolean] Flag indicating whether the current cargo is empty or
      # loaded.
      attr_accessor :cargo_empty

      # @return [Integer] ID of the sensor.
      attr_accessor :id

      # @return [String] Name of the sensor.
      attr_accessor :name


      #
      # Mapper for CargoResponseSensorsItem class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'CargoResponse_sensorsItem',
          type: {
            name: 'Composite',
            class_name: 'CargoResponseSensorsItem',
            model_properties: {
              cargo_empty: {
                client_side_validation: true,
                required: false,
                serialized_name: 'cargoEmpty',
                type: {
                  name: 'Boolean'
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
              }
            }
          }
        }
      end
    end
  end
end