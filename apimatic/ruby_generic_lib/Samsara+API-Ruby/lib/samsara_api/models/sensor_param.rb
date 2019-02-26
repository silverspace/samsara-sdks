# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # SensorParam Model.
  class SensorParam < BaseModel
    # Group ID to query.
    # @return [Long]
    attr_accessor :group_id

    # List of sensor IDs to query.
    # @return [List of Long]
    attr_accessor :sensors

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['group_id'] = 'groupId'
      @_hash['sensors'] = 'sensors'
      @_hash
    end

    def initialize(group_id = nil,
                   sensors = nil)
      @group_id = group_id
      @sensors = sensors
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      group_id = hash['groupId']
      sensors = hash['sensors']

      # Create object from extracted values.
      SensorParam.new(group_id,
                      sensors)
    end
  end
end
