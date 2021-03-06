# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # FleetVehiclesLocation Model.
  class FleetVehiclesLocation < BaseModel
    # ID of the vehicle.
    # @return [Long]
    attr_accessor :id

    # ID of the vehicle.
    # @return [List of FleetVehicleLocation]
    attr_accessor :locations

    # Name of the vehicle.
    # @return [String]
    attr_accessor :name

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['id'] = 'id'
      @_hash['locations'] = 'locations'
      @_hash['name'] = 'name'
      @_hash
    end

    def initialize(id = nil,
                   locations = nil,
                   name = nil)
      @id = id
      @locations = locations
      @name = name
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash['id']
      # Parameter is an array, so we need to iterate through it
      locations = nil
      unless hash['locations'].nil?
        locations = []
        hash['locations'].each do |structure|
          locations << (FleetVehicleLocation.from_hash(structure) if structure)
        end
      end
      name = hash['name']

      # Create object from extracted values.
      FleetVehiclesLocation.new(id,
                                locations,
                                name)
    end
  end
end
