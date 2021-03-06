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
    class Document < DocumentBase
      # @return [String] Descriptive name of this type of document.
      attr_accessor :document_type

      # @return [Integer] The time in Unix epoch milliseconds that the document
      # is created.
      attr_accessor :driver_created_at_ms

      # @return [Integer] ID of the driver for whom the document is submitted
      attr_accessor :driver_id

      # @return [Array<DocumentField>] The fields associated with this
      # document.
      attr_accessor :fields

      # @return [Integer] VehicleID of the driver at document creation.
      attr_accessor :vehicle_id


      #
      # Mapper for Document class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'Document',
          type: {
            name: 'Composite',
            class_name: 'Document',
            model_properties: {
              dispatch_job_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'dispatchJobId',
                type: {
                  name: 'Number'
                }
              },
              notes: {
                client_side_validation: true,
                required: false,
                serialized_name: 'notes',
                type: {
                  name: 'String'
                }
              },
              document_type: {
                client_side_validation: true,
                required: false,
                serialized_name: 'documentType',
                type: {
                  name: 'String'
                }
              },
              driver_created_at_ms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'driverCreatedAtMs',
                type: {
                  name: 'Number'
                }
              },
              driver_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'driverId',
                type: {
                  name: 'Number'
                }
              },
              fields: {
                client_side_validation: true,
                required: false,
                serialized_name: 'fields',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'DocumentFieldElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'DocumentField'
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
