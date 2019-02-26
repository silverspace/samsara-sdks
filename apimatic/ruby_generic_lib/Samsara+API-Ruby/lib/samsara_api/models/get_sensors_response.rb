# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # GetSensorsResponse Model.
  class GetSensorsResponse < BaseModel
    # TODO: Write general description for this method
    # @return [List of Sensor]
    attr_accessor :sensors

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['sensors'] = 'sensors'
      @_hash
    end

    def initialize(sensors = nil)
      @sensors = sensors
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      # Parameter is an array, so we need to iterate through it
      sensors = nil
      unless hash['sensors'].nil?
        sensors = []
        hash['sensors'].each do |structure|
          sensors << (Sensor.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      GetSensorsResponse.new(sensors)
    end
  end
end
