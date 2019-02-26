# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # HosAuthenticationLogsResponse Model.
  class HosAuthenticationLogsResponse < BaseModel
    # TODO: Write general description for this method
    # @return [List of AuthenticationLog]
    attr_accessor :authentication_logs

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['authentication_logs'] = 'authenticationLogs'
      @_hash
    end

    def initialize(authentication_logs = nil)
      @authentication_logs = authentication_logs
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      # Parameter is an array, so we need to iterate through it
      authentication_logs = nil
      unless hash['authenticationLogs'].nil?
        authentication_logs = []
        hash['authenticationLogs'].each do |structure|
          authentication_logs << (AuthenticationLog.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      HosAuthenticationLogsResponse.new(authentication_logs)
    end
  end
end
