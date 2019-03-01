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
    class DispatchRouteHistory
      # @return [Array<DispatchRouteHistoricalEntry>] History of the route's
      # state changes.
      attr_accessor :history


      #
      # Mapper for DispatchRouteHistory class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'DispatchRouteHistory',
          type: {
            name: 'Composite',
            class_name: 'DispatchRouteHistory',
            model_properties: {
              history: {
                client_side_validation: true,
                required: false,
                serialized_name: 'history',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'DispatchRouteHistoricalEntryElementType',
                      type: {
                        name: 'Composite',
                        class_name: 'DispatchRouteHistoricalEntry'
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