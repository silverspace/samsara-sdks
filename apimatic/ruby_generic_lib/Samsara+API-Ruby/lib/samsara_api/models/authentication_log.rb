# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # AuthenticationLog Model.
  class AuthenticationLog < BaseModel
    # The log type - one of 'signin' or 'signout'
    # @return [String]
    attr_accessor :action_type

    # Address at which the log was recorded, if applicable.
    # @return [String]
    attr_accessor :address

    # Address name from the group address book at which the log was recorded, if
    # applicable.
    # @return [String]
    attr_accessor :address_name

    # City in which the log was recorded, if applicable.
    # @return [String]
    attr_accessor :city

    # The time at which the event was recorded in UNIX milliseconds.
    # @return [Long]
    attr_accessor :happened_at_ms

    # State in which the log was recorded, if applicable.
    # @return [String]
    attr_accessor :state

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['action_type'] = 'actionType'
      @_hash['address'] = 'address'
      @_hash['address_name'] = 'addressName'
      @_hash['city'] = 'city'
      @_hash['happened_at_ms'] = 'happenedAtMs'
      @_hash['state'] = 'state'
      @_hash
    end

    def initialize(action_type = nil,
                   address = nil,
                   address_name = nil,
                   city = nil,
                   happened_at_ms = nil,
                   state = nil)
      @action_type = action_type
      @address = address
      @address_name = address_name
      @city = city
      @happened_at_ms = happened_at_ms
      @state = state
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      action_type = hash['actionType']
      address = hash['address']
      address_name = hash['addressName']
      city = hash['city']
      happened_at_ms = hash['happenedAtMs']
      state = hash['state']

      # Create object from extracted values.
      AuthenticationLog.new(action_type,
                            address,
                            address_name,
                            city,
                            happened_at_ms,
                            state)
    end
  end
end
