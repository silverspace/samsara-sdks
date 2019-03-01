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
    class VehicleMaintenancePassengerDiagnosticTroubleCodesItem
      # @return [String]
      attr_accessor :dtc_description

      # @return [Integer]
      attr_accessor :dtc_id

      # @return [String]
      attr_accessor :dtc_short_code


      #
      # Mapper for VehicleMaintenancePassengerDiagnosticTroubleCodesItem class
      # as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'VehicleMaintenance_passenger_diagnosticTroubleCodesItem',
          type: {
            name: 'Composite',
            class_name: 'VehicleMaintenancePassengerDiagnosticTroubleCodesItem',
            model_properties: {
              dtc_description: {
                client_side_validation: true,
                required: false,
                serialized_name: 'dtcDescription',
                type: {
                  name: 'String'
                }
              },
              dtc_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'dtcId',
                type: {
                  name: 'Number'
                }
              },
              dtc_short_code: {
                client_side_validation: true,
                required: false,
                serialized_name: 'dtcShortCode',
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