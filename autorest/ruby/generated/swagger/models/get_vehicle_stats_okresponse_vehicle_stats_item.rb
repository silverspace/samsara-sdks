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
    class GetVehicleStatsOKResponseVehicleStatsItem
      # @return [AuxInputSeries]
      attr_accessor :aux_input1

      # @return [AuxInputSeries]
      attr_accessor :aux_input2

      # @return [Array<EngineState>]
      attr_accessor :engine_state

      # @return [Integer] ID of the vehicle.
      attr_accessor :vehicle_id


      #
      # Mapper for GetVehicleStatsOKResponseVehicleStatsItem class as Ruby
      # Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'GetVehicleStatsOKResponse_vehicleStatsItem',
          type: {
            name: 'Composite',
            class_name: 'GetVehicleStatsOKResponseVehicleStatsItem',
            model_properties: {
              aux_input1: {
                client_side_validation: true,
                required: false,
                serialized_name: 'auxInput1',
                type: {
                  name: 'Composite',
                  class_name: 'AuxInputSeries'
                }
              },
              aux_input2: {
                client_side_validation: true,
                required: false,
                serialized_name: 'auxInput2',
                type: {
                  name: 'Composite',
                  class_name: 'AuxInputSeries'
                }
              },
              engine_state: {
                client_side_validation: true,
                required: false,
                serialized_name: 'engineState',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'EngineStateElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'EngineState'
                      }
                  }
                }
              },
              vehicle_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'vehicleId',
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
