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
    class Pagination
      # @return [String] Cursor identifier representing the last element in the
      # response. This value should be used in conjunction with a subsequent
      # request's 'starting_after' query parameter.
      attr_accessor :end_cursor

      # @return [Boolean] True if there are more pages of results after this
      # response.
      attr_accessor :has_next_page

      # @return [Boolean] True if there are more pages of results before this
      # response.
      attr_accessor :has_prev_page

      # @return [String] Cursor identifier representing the first element in
      # the response. This value should be used in conjunction with a
      # subsequent request's 'ending_before' query parameter.
      attr_accessor :start_cursor


      #
      # Mapper for Pagination class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'Pagination',
          type: {
            name: 'Composite',
            class_name: 'Pagination',
            model_properties: {
              end_cursor: {
                client_side_validation: true,
                required: true,
                serialized_name: 'endCursor',
                type: {
                  name: 'String'
                }
              },
              has_next_page: {
                client_side_validation: true,
                required: true,
                serialized_name: 'hasNextPage',
                type: {
                  name: 'Boolean'
                }
              },
              has_prev_page: {
                client_side_validation: true,
                required: true,
                serialized_name: 'hasPrevPage',
                type: {
                  name: 'Boolean'
                }
              },
              start_cursor: {
                client_side_validation: true,
                required: true,
                serialized_name: 'startCursor',
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
