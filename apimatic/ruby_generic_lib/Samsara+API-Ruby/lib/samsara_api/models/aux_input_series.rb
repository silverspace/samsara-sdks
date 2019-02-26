# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # A list of aux input values over a timerange.
  class AuxInputSeries < BaseModel
    # The name of the aux input.
    # @return [NameEnum]
    attr_accessor :name

    # The name of the aux input.
    # @return [List of AuxInput]
    attr_accessor :values

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['name'] = 'name'
      @_hash['values'] = 'values'
      @_hash
    end

    def initialize(name = nil,
                   values = nil)
      @name = name
      @values = values
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      name = hash['name']
      # Parameter is an array, so we need to iterate through it
      values = nil
      unless hash['values'].nil?
        values = []
        hash['values'].each do |structure|
          values << (AuxInput.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      AuxInputSeries.new(name,
                         values)
    end
  end
end