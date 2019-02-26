# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Result Model.
  class Result < BaseModel
    # List of datapoints, one for each requested (sensor, field) pair.
    # @return [List of Long]
    attr_accessor :series

    # Timestamp in UNIX milliseconds.
    # @return [Long]
    attr_accessor :time_ms

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['series'] = 'series'
      @_hash['time_ms'] = 'timeMs'
      @_hash
    end

    def initialize(series = nil,
                   time_ms = nil)
      @series = series
      @time_ms = time_ms
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      series = hash['series']
      time_ms = hash['timeMs']

      # Create object from extracted values.
      Result.new(series,
                 time_ms)
    end
  end
end
