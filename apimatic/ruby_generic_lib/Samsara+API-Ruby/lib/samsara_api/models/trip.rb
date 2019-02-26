# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Trip Model.
  class Trip < BaseModel
    # Length of the trip in meters.
    # @return [Integer]
    attr_accessor :distance_meters

    # ID of the driver.
    # @return [Integer]
    attr_accessor :driver_id

    # Text representation of nearest identifiable location to the end (latitude,
    # longitude) coordinates.
    # @return [String]
    attr_accessor :end_address

    # End (latitude, longitude) in decimal degrees.
    # @return [EndCoordinates]
    attr_accessor :end_coordinates

    # Geocoded street address of start (latitude, longitude) coordinates.
    # @return [String]
    attr_accessor :end_location

    # End of the trip in UNIX milliseconds.
    # @return [Long]
    attr_accessor :end_ms

    # Odometer reading at the end of the trip.
    # @return [Integer]
    attr_accessor :end_odometer

    # Amount in milliliters of fuel consumed on this trip.
    # @return [Integer]
    attr_accessor :fuel_consumed_ml

    # Text representation of nearest identifiable location to the start
    # (latitude, longitude) coordinates.
    # @return [String]
    attr_accessor :start_address

    # Start (latitude, longitude) in decimal degrees.
    # @return [StartCoordinates]
    attr_accessor :start_coordinates

    # Geocoded street address of start (latitude, longitude) coordinates.
    # @return [String]
    attr_accessor :start_location

    # Beginning of the trip in UNIX milliseconds.
    # @return [Long]
    attr_accessor :start_ms

    # Odometer reading at the beginning of the trip.
    # @return [Integer]
    attr_accessor :start_odometer

    # Length in meters trip spent on toll roads.
    # @return [Integer]
    attr_accessor :toll_meters

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['distance_meters'] = 'distanceMeters'
      @_hash['driver_id'] = 'driverId'
      @_hash['end_address'] = 'endAddress'
      @_hash['end_coordinates'] = 'endCoordinates'
      @_hash['end_location'] = 'endLocation'
      @_hash['end_ms'] = 'endMs'
      @_hash['end_odometer'] = 'endOdometer'
      @_hash['fuel_consumed_ml'] = 'fuelConsumedMl'
      @_hash['start_address'] = 'startAddress'
      @_hash['start_coordinates'] = 'startCoordinates'
      @_hash['start_location'] = 'startLocation'
      @_hash['start_ms'] = 'startMs'
      @_hash['start_odometer'] = 'startOdometer'
      @_hash['toll_meters'] = 'tollMeters'
      @_hash
    end

    def initialize(distance_meters = nil,
                   driver_id = nil,
                   end_address = nil,
                   end_coordinates = nil,
                   end_location = nil,
                   end_ms = nil,
                   end_odometer = nil,
                   fuel_consumed_ml = nil,
                   start_address = nil,
                   start_coordinates = nil,
                   start_location = nil,
                   start_ms = nil,
                   start_odometer = nil,
                   toll_meters = nil)
      @distance_meters = distance_meters
      @driver_id = driver_id
      @end_address = end_address
      @end_coordinates = end_coordinates
      @end_location = end_location
      @end_ms = end_ms
      @end_odometer = end_odometer
      @fuel_consumed_ml = fuel_consumed_ml
      @start_address = start_address
      @start_coordinates = start_coordinates
      @start_location = start_location
      @start_ms = start_ms
      @start_odometer = start_odometer
      @toll_meters = toll_meters
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      distance_meters = hash['distanceMeters']
      driver_id = hash['driverId']
      end_address = hash['endAddress']
      end_coordinates = EndCoordinates.from_hash(hash['endCoordinates']) if
        hash['endCoordinates']
      end_location = hash['endLocation']
      end_ms = hash['endMs']
      end_odometer = hash['endOdometer']
      fuel_consumed_ml = hash['fuelConsumedMl']
      start_address = hash['startAddress']
      if hash['startCoordinates']
        start_coordinates = StartCoordinates.from_hash(hash['startCoordinates'])
      end
      start_location = hash['startLocation']
      start_ms = hash['startMs']
      start_odometer = hash['startOdometer']
      toll_meters = hash['tollMeters']

      # Create object from extracted values.
      Trip.new(distance_meters,
               driver_id,
               end_address,
               end_coordinates,
               end_location,
               end_ms,
               end_odometer,
               fuel_consumed_ml,
               start_address,
               start_coordinates,
               start_location,
               start_ms,
               start_odometer,
               toll_meters)
    end
  end
end