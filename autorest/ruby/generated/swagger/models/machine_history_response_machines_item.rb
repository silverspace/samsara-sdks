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
    class MachineHistoryResponseMachinesItem
      # @return [Integer] Machine ID
      attr_accessor :id

      # @return [String] Machine name
      attr_accessor :name

      # @return [Array<MachineHistoryResponseMachinesItemVibrationsItem>] List
      # of vibration datapoints, with timestamp and vibration measurement for
      # x/y/z axis in mm/s
      attr_accessor :vibrations


      #
      # Mapper for MachineHistoryResponseMachinesItem class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'MachineHistoryResponse_machinesItem',
          type: {
            name: 'Composite',
            class_name: 'MachineHistoryResponseMachinesItem',
            model_properties: {
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
              vibrations: {
                client_side_validation: true,
                required: false,
                serialized_name: 'vibrations',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'MachineHistoryResponseMachinesItemVibrationsItemElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'MachineHistoryResponseMachinesItemVibrationsItem'
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
