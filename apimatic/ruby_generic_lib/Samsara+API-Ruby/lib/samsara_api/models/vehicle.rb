# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # A vehicle object.
  class Vehicle < BaseModel
    # Total engine hours for the vehicle.
    # @return [Long]
    attr_accessor :engine_hours

    # The fuel level of the vehicle as a percentage. (0.0 to 1.0)
    # @return [Float]
    attr_accessor :fuel_level_percent

    # ID of the vehicle.
    # @return [Long]
    attr_accessor :id

    # Name of the vehicle.
    # @return [String]
    attr_accessor :name

    # Name of the vehicle.
    # @return [String]
    attr_accessor :note

    # The number of meters reported by the odometer.
    # @return [Long]
    attr_accessor :odometer_meters

    # Vehicle Identification Number.
    # @return [String]
    attr_accessor :vin

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['engine_hours'] = 'engineHours'
      @_hash['fuel_level_percent'] = 'fuelLevelPercent'
      @_hash['id'] = 'id'
      @_hash['name'] = 'name'
      @_hash['note'] = 'note'
      @_hash['odometer_meters'] = 'odometerMeters'
      @_hash['vin'] = 'vin'
      @_hash
    end

    def initialize(id = nil,
                   engine_hours = nil,
                   fuel_level_percent = nil,
                   name = nil,
                   note = nil,
                   odometer_meters = nil,
                   vin = nil)
      @engine_hours = engine_hours
      @fuel_level_percent = fuel_level_percent
      @id = id
      @name = name
      @note = note
      @odometer_meters = odometer_meters
      @vin = vin
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash['id']
      engine_hours = hash['engineHours']
      fuel_level_percent = hash['fuelLevelPercent']
      name = hash['name']
      note = hash['note']
      odometer_meters = hash['odometerMeters']
      vin = hash['vin']

      # Create object from extracted values.
      Vehicle.new(id,
                  engine_hours,
                  fuel_level_percent,
                  name,
                  note,
                  odometer_meters,
                  vin)
    end
  end
end