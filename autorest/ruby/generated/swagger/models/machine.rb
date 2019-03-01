# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Contains information about a machine.
    #
    class Machine
      # @return [Integer] ID of the machine.
      attr_accessor :id

      # @return [String] Name of the machine.
      attr_accessor :name

      # @return [String] Notes about the machine
      attr_accessor :notes


      #
      # Mapper for Machine class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'Machine',
          type: {
            name: 'Composite',
            class_name: 'Machine',
            model_properties: {
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
              notes: {
                client_side_validation: true,
                required: false,
                serialized_name: 'notes',
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
