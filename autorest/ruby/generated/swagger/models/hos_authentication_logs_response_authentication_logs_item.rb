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
    class HosAuthenticationLogsResponseAuthenticationLogsItem
      # @return [String] The log type - one of 'signin' or 'signout'
      attr_accessor :action_type

      # @return [String] Address at which the log was recorded, if applicable.
      attr_accessor :address

      # @return [String] Address name from the group address book at which the
      # log was recorded, if applicable.
      attr_accessor :address_name

      # @return [String] City in which the log was recorded, if applicable.
      attr_accessor :city

      # @return [Integer] The time at which the event was recorded in UNIX
      # milliseconds.
      attr_accessor :happened_at_ms

      # @return [String] State in which the log was recorded, if applicable.
      attr_accessor :state


      #
      # Mapper for HosAuthenticationLogsResponseAuthenticationLogsItem class as
      # Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'HosAuthenticationLogsResponse_authenticationLogsItem',
          type: {
            name: 'Composite',
            class_name: 'HosAuthenticationLogsResponseAuthenticationLogsItem',
            model_properties: {
              action_type: {
                client_side_validation: true,
                required: false,
                serialized_name: 'actionType',
                type: {
                  name: 'String'
                }
              },
              address: {
                client_side_validation: true,
                required: false,
                serialized_name: 'address',
                type: {
                  name: 'String'
                }
              },
              address_name: {
                client_side_validation: true,
                required: false,
                serialized_name: 'addressName',
                type: {
                  name: 'String'
                }
              },
              city: {
                client_side_validation: true,
                required: false,
                serialized_name: 'city',
                type: {
                  name: 'String'
                }
              },
              happened_at_ms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'happenedAtMs',
                type: {
                  name: 'Number'
                }
              },
              state: {
                client_side_validation: true,
                required: false,
                serialized_name: 'state',
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
