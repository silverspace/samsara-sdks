# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # HosLogsParam Model.
  class HosLogsParam < BaseModel
    # Driver ID to query.
    # @return [Long]
    attr_accessor :driver_id

    # End of the time range, specified in milliseconds UNIX time.
    # @return [Long]
    attr_accessor :end_ms

    # Group ID to query.
    # @return [Long]
    attr_accessor :group_id

    # Beginning of the time range, specified in milliseconds UNIX time.
    # @return [Long]
    attr_accessor :start_ms

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['driver_id'] = 'driverId'
      @_hash['end_ms'] = 'endMs'
      @_hash['group_id'] = 'groupId'
      @_hash['start_ms'] = 'startMs'
      @_hash
    end

    def initialize(driver_id = nil,
                   end_ms = nil,
                   group_id = nil,
                   start_ms = nil)
      @driver_id = driver_id
      @end_ms = end_ms
      @group_id = group_id
      @start_ms = start_ms
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      driver_id = hash['driverId']
      end_ms = hash['endMs']
      group_id = hash['groupId']
      start_ms = hash['startMs']

      # Create object from extracted values.
      HosLogsParam.new(driver_id,
                       end_ms,
                       group_id,
                       start_ms)
    end
  end
end
