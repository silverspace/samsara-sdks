# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Swagger
  module Models
    #
    # Asset location details.
    #
    class AssetLocationResponseItem
      # @return [Float] The latitude of the location in degrees.
      attr_accessor :latitude

      # @return [String] The best effort (street,city,state) for the latitude
      # and longitude.
      attr_accessor :location

      # @return [Float] The longitude of the location in degrees.
      attr_accessor :longitude

      # @return [Float] The speed calculated from GPS that the asset was
      # traveling at in miles per hour.
      attr_accessor :speed_miles_per_hour

      # @return [Float] Time in Unix milliseconds since epoch when the asset
      # was at the location.
      attr_accessor :time


      #
      # Mapper for AssetLocationResponseItem class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'AssetLocationResponseItem',
          type: {
            name: 'Composite',
            class_name: 'AssetLocationResponseItem',
            model_properties: {
              latitude: {
                client_side_validation: true,
                required: false,
                serialized_name: 'latitude',
                type: {
                  name: 'Double'
                }
              },
              location: {
                client_side_validation: true,
                required: false,
                serialized_name: 'location',
                type: {
                  name: 'String'
                }
              },
              longitude: {
                client_side_validation: true,
                required: false,
                serialized_name: 'longitude',
                type: {
                  name: 'Double'
                }
              },
              speed_miles_per_hour: {
                client_side_validation: true,
                required: false,
                serialized_name: 'speedMilesPerHour',
                type: {
                  name: 'Double'
                }
              },
              time: {
                client_side_validation: true,
                required: false,
                serialized_name: 'time',
                type: {
                  name: 'Double'
                }
              }
            }
          }
        }
      end
    end
  end
end
