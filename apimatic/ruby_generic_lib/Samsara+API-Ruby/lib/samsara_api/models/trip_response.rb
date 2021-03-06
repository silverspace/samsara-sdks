# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Contains the trips for the vehicle in the requested timeframe. A trip is
  # represented as an object that contains startMs, startLocation, startAddress,
  # startCoordinates, endMs, endLocation, endAddress and endCoordinates.
  class TripResponse < BaseModel
    # TODO: Write general description for this method
    # @return [List of Trip]
    attr_accessor :trips

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['trips'] = 'trips'
      @_hash
    end

    def initialize(trips = nil)
      @trips = trips
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      # Parameter is an array, so we need to iterate through it
      trips = nil
      unless hash['trips'].nil?
        trips = []
        hash['trips'].each do |structure|
          trips << (Trip.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      TripResponse.new(trips)
    end
  end
end
