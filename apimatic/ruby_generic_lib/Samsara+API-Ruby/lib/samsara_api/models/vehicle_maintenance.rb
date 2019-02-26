# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Contains any J1939/Passenger engine light warnings and engine faults.
  class VehicleMaintenance < BaseModel
    # ID of the vehicle.
    # @return [Long]
    attr_accessor :id

    # J1939 based data. Null if no data is available.
    # @return [J1939]
    attr_accessor :j1939

    # Passenger vehicle data. Null if no data is available.
    # @return [Passenger]
    attr_accessor :passenger

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['id'] = 'id'
      @_hash['j1939'] = 'j1939'
      @_hash['passenger'] = 'passenger'
      @_hash
    end

    def initialize(id = nil,
                   j1939 = nil,
                   passenger = nil)
      @id = id
      @j1939 = j1939
      @passenger = passenger
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash['id']
      j1939 = J1939.from_hash(hash['j1939']) if hash['j1939']
      passenger = Passenger.from_hash(hash['passenger']) if hash['passenger']

      # Create object from extracted values.
      VehicleMaintenance.new(id,
                             j1939,
                             passenger)
    end
  end
end
