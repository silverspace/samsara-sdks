# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Vertex Model.
  class Vertex < BaseModel
    # The longitude of a geofence vertex
    # @return [Float]
    attr_accessor :latitude

    # The longitude of a geofence vertex
    # @return [Float]
    attr_accessor :longitude

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['latitude'] = 'latitude'
      @_hash['longitude'] = 'longitude'
      @_hash
    end

    def initialize(latitude = nil,
                   longitude = nil)
      @latitude = latitude
      @longitude = longitude
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      latitude = hash['latitude']
      longitude = hash['longitude']

      # Create object from extracted values.
      Vertex.new(latitude,
                 longitude)
    end
  end
end
