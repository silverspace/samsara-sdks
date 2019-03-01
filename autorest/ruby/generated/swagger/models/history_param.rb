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
    class HistoryParam
      # @return [Integer] End of the time range, specified in milliseconds UNIX
      # time.
      attr_accessor :end_ms

      # @return [Integer] Group ID to query.
      attr_accessor :group_id

      # @return [Integer] Beginning of the time range, specified in
      # milliseconds UNIX time.
      attr_accessor :start_ms


      #
      # Mapper for HistoryParam class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'historyParam',
          type: {
            name: 'Composite',
            class_name: 'HistoryParam',
            model_properties: {
              end_ms: {
                client_side_validation: true,
                required: true,
                serialized_name: 'endMs',
                type: {
                  name: 'Number'
                }
              },
              group_id: {
                client_side_validation: true,
                required: true,
                serialized_name: 'groupId',
                type: {
                  name: 'Number'
                }
              },
              start_ms: {
                client_side_validation: true,
                required: true,
                serialized_name: 'startMs',
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