# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DispatchJobCreate Model.
  class DispatchJobCreate < BaseModel
    # The address of the job destination, as it would be recognized if provided
    # to maps.google.com. Optional if a valid destination address ID is
    # provided.
    # @return [String]
    attr_accessor :destination_address

    # ID of the job destination associated with an address book entry. Optional
    # if valid values are provided for destination address or
    # latitude/longitude. If a valid destination address ID is provided,
    # address/latitude/longitude will be used from the address book entry. Name
    # of the address book entry will only be used if the destination name is not
    # provided.
    # @return [Long]
    attr_accessor :destination_address_id

    # Latitude of the destination in decimal degrees. Optional if a valid
    # destination address ID is provided.
    # @return [Float]
    attr_accessor :destination_lat

    # Longitude of the destination in decimal degrees. Optional if a valid
    # destination address ID is provided.
    # @return [Float]
    attr_accessor :destination_lng

    # The name of the job destination. If provided, it will take precedence over
    # the name of the address book entry.
    # @return [String]
    attr_accessor :destination_name

    # Notes regarding the details of this job.
    # @return [String]
    attr_accessor :notes

    # The time at which the assigned driver is scheduled to arrive at the job
    # destination.
    # @return [Long]
    attr_accessor :scheduled_arrival_time_ms

    # The time at which the assigned driver is scheduled to depart from the job
    # destination.
    # @return [Long]
    attr_accessor :scheduled_departure_time_ms

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['destination_address'] = 'destination_address'
      @_hash['destination_address_id'] = 'destination_address_id'
      @_hash['destination_lat'] = 'destination_lat'
      @_hash['destination_lng'] = 'destination_lng'
      @_hash['destination_name'] = 'destination_name'
      @_hash['notes'] = 'notes'
      @_hash['scheduled_arrival_time_ms'] = 'scheduled_arrival_time_ms'
      @_hash['scheduled_departure_time_ms'] = 'scheduled_departure_time_ms'
      @_hash
    end

    def initialize(scheduled_arrival_time_ms = nil,
                   destination_address = nil,
                   destination_address_id = nil,
                   destination_lat = nil,
                   destination_lng = nil,
                   destination_name = nil,
                   notes = nil,
                   scheduled_departure_time_ms = nil)
      @destination_address = destination_address
      @destination_address_id = destination_address_id
      @destination_lat = destination_lat
      @destination_lng = destination_lng
      @destination_name = destination_name
      @notes = notes
      @scheduled_arrival_time_ms = scheduled_arrival_time_ms
      @scheduled_departure_time_ms = scheduled_departure_time_ms
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      scheduled_arrival_time_ms = hash['scheduled_arrival_time_ms']
      destination_address = hash['destination_address']
      destination_address_id = hash['destination_address_id']
      destination_lat = hash['destination_lat']
      destination_lng = hash['destination_lng']
      destination_name = hash['destination_name']
      notes = hash['notes']
      scheduled_departure_time_ms = hash['scheduled_departure_time_ms']

      # Create object from extracted values.
      DispatchJobCreate.new(scheduled_arrival_time_ms,
                            destination_address,
                            destination_address_id,
                            destination_lat,
                            destination_lng,
                            destination_name,
                            notes,
                            scheduled_departure_time_ms)
    end
  end
end