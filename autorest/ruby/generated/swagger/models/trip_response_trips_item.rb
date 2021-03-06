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
    class TripResponseTripsItem
      # @return [Integer] Length of the trip in meters.
      attr_accessor :distance_meters

      # @return [Integer] ID of the driver.
      attr_accessor :driver_id

      # @return [String] Text representation of nearest identifiable location
      # to the end (latitude, longitude) coordinates.
      attr_accessor :end_address

      # @return [TripResponseTripsItemEndCoordinates] End (latitude, longitude)
      # in decimal degrees.
      attr_accessor :end_coordinates

      # @return [String] Geocoded street address of start (latitude, longitude)
      # coordinates.
      attr_accessor :end_location

      # @return [Integer] End of the trip in UNIX milliseconds.
      attr_accessor :end_ms

      # @return [Integer] Odometer reading at the end of the trip.
      attr_accessor :end_odometer

      # @return [Integer] Amount in milliliters of fuel consumed on this trip.
      attr_accessor :fuel_consumed_ml

      # @return [String] Text representation of nearest identifiable location
      # to the start (latitude, longitude) coordinates.
      attr_accessor :start_address

      # @return [TripResponseTripsItemStartCoordinates] Start (latitude,
      # longitude) in decimal degrees.
      attr_accessor :start_coordinates

      # @return [String] Geocoded street address of start (latitude, longitude)
      # coordinates.
      attr_accessor :start_location

      # @return [Integer] Beginning of the trip in UNIX milliseconds.
      attr_accessor :start_ms

      # @return [Integer] Odometer reading at the beginning of the trip.
      attr_accessor :start_odometer

      # @return [Integer] Length in meters trip spent on toll roads.
      attr_accessor :toll_meters


      #
      # Mapper for TripResponseTripsItem class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          client_side_validation: true,
          required: false,
          serialized_name: 'TripResponse_tripsItem',
          type: {
            name: 'Composite',
            class_name: 'TripResponseTripsItem',
            model_properties: {
              distance_meters: {
                client_side_validation: true,
                required: false,
                serialized_name: 'distanceMeters',
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
              end_address: {
                client_side_validation: true,
                required: false,
                serialized_name: 'endAddress',
                type: {
                  name: 'String'
                }
              },
              end_coordinates: {
                client_side_validation: true,
                required: false,
                serialized_name: 'endCoordinates',
                type: {
                  name: 'Composite',
                  class_name: 'TripResponseTripsItemEndCoordinates'
                }
              },
              end_location: {
                client_side_validation: true,
                required: false,
                serialized_name: 'endLocation',
                type: {
                  name: 'String'
                }
              },
              end_ms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'endMs',
                type: {
                  name: 'Number'
                }
              },
              end_odometer: {
                client_side_validation: true,
                required: false,
                serialized_name: 'endOdometer',
                type: {
                  name: 'Number'
                }
              },
              fuel_consumed_ml: {
                client_side_validation: true,
                required: false,
                serialized_name: 'fuelConsumedMl',
                type: {
                  name: 'Number'
                }
              },
              start_address: {
                client_side_validation: true,
                required: false,
                serialized_name: 'startAddress',
                type: {
                  name: 'String'
                }
              },
              start_coordinates: {
                client_side_validation: true,
                required: false,
                serialized_name: 'startCoordinates',
                type: {
                  name: 'Composite',
                  class_name: 'TripResponseTripsItemStartCoordinates'
                }
              },
              start_location: {
                client_side_validation: true,
                required: false,
                serialized_name: 'startLocation',
                type: {
                  name: 'String'
                }
              },
              start_ms: {
                client_side_validation: true,
                required: false,
                serialized_name: 'startMs',
                type: {
                  name: 'Number'
                }
              },
              start_odometer: {
                client_side_validation: true,
                required: false,
                serialized_name: 'startOdometer',
                type: {
                  name: 'Number'
                }
              },
              toll_meters: {
                client_side_validation: true,
                required: false,
                serialized_name: 'tollMeters',
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
