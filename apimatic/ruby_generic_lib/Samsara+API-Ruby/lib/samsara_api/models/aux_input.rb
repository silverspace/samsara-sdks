# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Digital value of an aux input.
  class AuxInput < BaseModel
    # Timestamp in Unix epoch milliseconds.
    # @return [Long]
    attr_accessor :time_ms

    # Boolean representing the digital value of the aux input.
    # @return [Boolean]
    attr_accessor :value

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['time_ms'] = 'timeMs'
      @_hash['value'] = 'value'
      @_hash
    end

    def initialize(time_ms = nil,
                   value = nil)
      @time_ms = time_ms
      @value = value
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      time_ms = hash['timeMs']
      value = hash['value']

      # Create object from extracted values.
      AuxInput.new(time_ms,
                   value)
    end
  end
end
