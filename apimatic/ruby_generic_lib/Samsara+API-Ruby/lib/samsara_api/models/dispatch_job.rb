# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DispatchJob Model.
  class DispatchJob < BaseModel
    # The time at which the driver arrived at the job destination.
    # @return [Long]
    attr_accessor :arrived_at_ms

    # The time at which the job was marked complete (e.g. started driving to the
    # next destination).
    # @return [Long]
    attr_accessor :completed_at_ms

    # ID of the route that this job belongs to.
    # @return [Long]
    attr_accessor :dispatch_route_id

    # ID of the driver assigned to the dispatch job.
    # @return [Long]
    attr_accessor :driver_id

    # The time at which the assigned driver started fulfilling the job (e.g.
    # started driving to the destination).
    # @return [Long]
    attr_accessor :en_route_at_ms

    # The time at which the assigned driver is estimated to arrive at the job
    # destination. Only valid for en-route jobs.
    # @return [Long]
    attr_accessor :estimated_arrival_ms

    # Fleet viewer url of the dispatch job.
    # @return [String]
    attr_accessor :fleet_viewer_url

    # Fleet viewer url of the dispatch job.
    # @return [Long]
    attr_accessor :group_id

    # ID of the Samsara dispatch job.
    # @return [Long]
    attr_accessor :id

    # The current state of the dispatch job.
    # @return [JobStatusEnum]
    attr_accessor :job_state

    # The time at which the job was marked skipped.
    # @return [Long]
    attr_accessor :skipped_at_ms

    # ID of the vehicle used for the dispatch job.
    # @return [Long]
    attr_accessor :vehicle_id

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
      @_hash['arrived_at_ms'] = 'arrived_at_ms'
      @_hash['completed_at_ms'] = 'completed_at_ms'
      @_hash['dispatch_route_id'] = 'dispatch_route_id'
      @_hash['driver_id'] = 'driver_id'
      @_hash['en_route_at_ms'] = 'en_route_at_ms'
      @_hash['estimated_arrival_ms'] = 'estimated_arrival_ms'
      @_hash['fleet_viewer_url'] = 'fleet_viewer_url'
      @_hash['group_id'] = 'group_id'
      @_hash['id'] = 'id'
      @_hash['job_state'] = 'job_state'
      @_hash['skipped_at_ms'] = 'skipped_at_ms'
      @_hash['vehicle_id'] = 'vehicle_id'
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

    def initialize(dispatch_route_id = nil,
                   group_id = nil,
                   id = nil,
                   job_state = nil,
                   scheduled_arrival_time_ms = nil,
                   arrived_at_ms = nil,
                   completed_at_ms = nil,
                   driver_id = nil,
                   en_route_at_ms = nil,
                   estimated_arrival_ms = nil,
                   fleet_viewer_url = nil,
                   skipped_at_ms = nil,
                   vehicle_id = nil,
                   destination_address = nil,
                   destination_address_id = nil,
                   destination_lat = nil,
                   destination_lng = nil,
                   destination_name = nil,
                   notes = nil,
                   scheduled_departure_time_ms = nil)
      @arrived_at_ms = arrived_at_ms
      @completed_at_ms = completed_at_ms
      @dispatch_route_id = dispatch_route_id
      @driver_id = driver_id
      @en_route_at_ms = en_route_at_ms
      @estimated_arrival_ms = estimated_arrival_ms
      @fleet_viewer_url = fleet_viewer_url
      @group_id = group_id
      @id = id
      @job_state = job_state
      @skipped_at_ms = skipped_at_ms
      @vehicle_id = vehicle_id
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
      dispatch_route_id = hash['dispatch_route_id']
      group_id = hash['group_id']
      id = hash['id']
      job_state = hash['job_state']
      scheduled_arrival_time_ms = hash['scheduled_arrival_time_ms']
      arrived_at_ms = hash['arrived_at_ms']
      completed_at_ms = hash['completed_at_ms']
      driver_id = hash['driver_id']
      en_route_at_ms = hash['en_route_at_ms']
      estimated_arrival_ms = hash['estimated_arrival_ms']
      fleet_viewer_url = hash['fleet_viewer_url']
      skipped_at_ms = hash['skipped_at_ms']
      vehicle_id = hash['vehicle_id']
      destination_address = hash['destination_address']
      destination_address_id = hash['destination_address_id']
      destination_lat = hash['destination_lat']
      destination_lng = hash['destination_lng']
      destination_name = hash['destination_name']
      notes = hash['notes']
      scheduled_departure_time_ms = hash['scheduled_departure_time_ms']

      # Create object from extracted values.
      DispatchJob.new(dispatch_route_id,
                      group_id,
                      id,
                      job_state,
                      scheduled_arrival_time_ms,
                      arrived_at_ms,
                      completed_at_ms,
                      driver_id,
                      en_route_at_ms,
                      estimated_arrival_ms,
                      fleet_viewer_url,
                      skipped_at_ms,
                      vehicle_id,
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
