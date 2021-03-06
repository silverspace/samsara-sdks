# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DriversSummaryParam Model.
  class DriversSummaryParam < BaseModel
    # End time (ms) of queried time period.
    # @return [Long]
    attr_accessor :end_ms

    # Org ID to query.
    # @return [Long]
    attr_accessor :org_id

    # Start time (ms) of queried time period.
    # @return [Long]
    attr_accessor :start_ms

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['end_ms'] = 'endMs'
      @_hash['org_id'] = 'orgId'
      @_hash['start_ms'] = 'startMs'
      @_hash
    end

    def initialize(end_ms = nil,
                   org_id = nil,
                   start_ms = nil)
      @end_ms = end_ms
      @org_id = org_id
      @start_ms = start_ms
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      end_ms = hash['endMs']
      org_id = hash['orgId']
      start_ms = hash['startMs']

      # Create object from extracted values.
      DriversSummaryParam.new(end_ms,
                              org_id,
                              start_ms)
    end
  end
end
