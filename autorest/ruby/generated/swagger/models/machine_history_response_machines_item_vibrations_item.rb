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
    class MachineHistoryResponseMachinesItemVibrationsItem
      # @return [Float]
      attr_accessor :x

      # @return [Float]
      attr_accessor :y

      # @return [Float]
      attr_accessor :z

      # @return [Integer]
      attr_accessor :time


      #
      # Mapper for MachineHistoryResponseMachinesItemVibrationsItem class as
      # Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'MachineHistoryResponse_machinesItem_vibrationsItem',
          type: {
            name: 'Composite',
            class_name: 'MachineHistoryResponseMachinesItemVibrationsItem',
            model_properties: {
              x: {
                client_side_validation: true,
                required: false,
                serialized_name: 'X',
                type: {
                  name: 'Double'
                }
              },
              y: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Y',
                type: {
                  name: 'Double'
                }
              },
              z: {
                client_side_validation: true,
                required: false,
                serialized_name: 'Z',
                type: {
                  name: 'Double'
                }
              },
              time: {
                client_side_validation: true,
                required: false,
                serialized_name: 'time',
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
