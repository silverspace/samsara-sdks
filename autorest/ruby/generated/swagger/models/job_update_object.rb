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
    class JobUpdateObject
      # @return [Integer] Timestamp that this event was updated, represented as
      # Unix milliseconds since epoch.
      attr_accessor :changed_at_ms

      # @return [Integer] ID of the Samsara job.
      attr_accessor :job_id

      # @return [Enum] Possible values include: 'JobState_Unassigned',
      # 'JobState_Scheduled', 'JobState_EnRoute', 'JobState_Arrived',
      # 'JobState_Completed', 'JobState_Skipped'
      attr_accessor :job_state

      # @return [Enum] Possible values include: 'JobState_Unassigned',
      # 'JobState_Scheduled', 'JobState_EnRoute', 'JobState_Arrived',
      # 'JobState_Completed', 'JobState_Skipped'
      attr_accessor :prev_job_state

      # @return [DispatchRoute]
      attr_accessor :route

      # @return [Integer] ID of the Samsara dispatch route.
      attr_accessor :route_id


      #
      # Mapper for JobUpdateObject class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'jobUpdateObject',
          type: {
            name: 'Composite',
            class_name: 'JobUpdateObject',
            model_properties: {
              changed_at_ms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'changed_at_ms',
                type: {
                  name: 'Number'
                }
              },
              job_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'job_id',
                type: {
                  name: 'Number'
                }
              },
              job_state: {
                client_side_validation: true,
                required: false,
                serialized_name: 'job_state',
                type: {
                  name: 'String'
                }
              },
              prev_job_state: {
                client_side_validation: true,
                required: false,
                serialized_name: 'prev_job_state',
                type: {
                  name: 'String'
                }
              },
              route: {
                client_side_validation: true,
                required: false,
                serialized_name: 'route',
                type: {
                  name: 'Composite',
                  class_name: 'DispatchRoute'
                }
              },
              route_id: {
                client_side_validation: true,
                required: false,
                serialized_name: 'route_id',
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
