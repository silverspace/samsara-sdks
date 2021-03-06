# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # ListFleetResponse Model.
  class ListFleetResponse < BaseModel
    # Group ID to query.
    # @return [Long]
    attr_accessor :group_id

    # Group ID to query.
    # @return [Pagination]
    attr_accessor :pagination

    # Group ID to query.
    # @return [List of Vehicle]
    attr_accessor :vehicles

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['group_id'] = 'groupId'
      @_hash['pagination'] = 'pagination'
      @_hash['vehicles'] = 'vehicles'
      @_hash
    end

    def initialize(group_id = nil,
                   pagination = nil,
                   vehicles = nil)
      @group_id = group_id
      @pagination = pagination
      @vehicles = vehicles
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      group_id = hash['groupId']
      pagination = Pagination.from_hash(hash['pagination']) if
        hash['pagination']
      # Parameter is an array, so we need to iterate through it
      vehicles = nil
      unless hash['vehicles'].nil?
        vehicles = []
        hash['vehicles'].each do |structure|
          vehicles << (Vehicle.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      ListFleetResponse.new(group_id,
                            pagination,
                            vehicles)
    end
  end
end
