# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Contains the results for a machine history request
  class MachineHistoryResponse < BaseModel
    # TODO: Write general description for this method
    # @return [List of Machine1]
    attr_accessor :machines

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['machines'] = 'machines'
      @_hash
    end

    def initialize(machines = nil)
      @machines = machines
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      # Parameter is an array, so we need to iterate through it
      machines = nil
      unless hash['machines'].nil?
        machines = []
        hash['machines'].each do |structure|
          machines << (Machine1.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      MachineHistoryResponse.new(machines)
    end
  end
end
