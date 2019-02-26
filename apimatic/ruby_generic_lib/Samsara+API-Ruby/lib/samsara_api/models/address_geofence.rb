# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # The geofence that defines this address and its bounds. This can either be a
  # circle, or a polygon - only one key should be provided, depending on the
  # geofence type.
  class AddressGeofence < BaseModel
    # Information about a circular geofence. This field is only populated if the
    # geofence is a circle.
    # @return [Circle]
    attr_accessor :circle

    # Information about a polygon geofence. This field is only populated if the
    # geofence is a polygon.
    # @return [Polygon]
    attr_accessor :polygon

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['circle'] = 'circle'
      @_hash['polygon'] = 'polygon'
      @_hash
    end

    def initialize(circle = nil,
                   polygon = nil)
      @circle = circle
      @polygon = polygon
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      circle = Circle.from_hash(hash['circle']) if hash['circle']
      polygon = Polygon.from_hash(hash['polygon']) if hash['polygon']

      # Create object from extracted values.
      AddressGeofence.new(circle,
                          polygon)
    end
  end
end
