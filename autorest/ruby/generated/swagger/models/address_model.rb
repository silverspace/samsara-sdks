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
    class AddressModel
      # @return [Array<Float>]
      attr_accessor :contact_ids

      # @return [String] The full address associated with this
      # address/geofence, as it might be recognized by maps.google.com
      attr_accessor :formatted_address

      # @return [AddressGeofence]
      attr_accessor :geofence

      # @return [String] The name of this address/geofence
      attr_accessor :name

      # @return [String]
      attr_accessor :notes

      # @return [Array<Float>]
      attr_accessor :tag_ids


      #
      # Mapper for AddressModel class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'address',
          type: {
            name: 'Composite',
            class_name: 'AddressModel',
            model_properties: {
              contact_ids: {
                client_side_validation: true,
                required: false,
                serialized_name: 'contactIds',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'FloatElementType',
                      type: {
                        name: 'Double'
                      }
                  }
                }
              },
              formatted_address: {
                client_side_validation: true,
                required: false,
                serialized_name: 'formattedAddress',
                type: {
                  name: 'String'
                }
              },
              geofence: {
                client_side_validation: true,
                required: false,
                serialized_name: 'geofence',
                type: {
                  name: 'Composite',
                  class_name: 'AddressGeofence'
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
              notes: {
                client_side_validation: true,
                required: false,
                serialized_name: 'notes',
                type: {
                  name: 'String'
                }
              },
              tag_ids: {
                client_side_validation: true,
                required: false,
                serialized_name: 'tagIds',
                type: {
                  name: 'Sequence',
                  element: {
                      client_side_validation: true,
                      required: false,
                      serialized_name: 'FloatElementType',
                      type: {
                        name: 'Double'
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
