# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DispatchRouteCreate Model.
  class DispatchRouteCreate < BaseModel
    # The dispatch jobs to create for this route.
    # @return [List of DispatchJobCreate]
    attr_accessor :dispatch_jobs

    # The time in Unix epoch milliseconds that the route actually ended.
    # @return [Long]
    attr_accessor :actual_end_ms

    # The time in Unix epoch milliseconds that the route actually started.
    # @return [Long]
    attr_accessor :actual_start_ms

    # ID of the driver assigned to the dispatch route. Note that driver_id and
    # vehicle_id are mutually exclusive. If neither is specified, then the route
    # is unassigned.
    # @return [Long]
    attr_accessor :driver_id

    # ID of the group if the organization has multiple groups (optional).
    # @return [Long]
    attr_accessor :group_id

    # Descriptive name of this route.
    # @return [String]
    attr_accessor :name

    # The time in Unix epoch milliseconds that the last job in the route is
    # scheduled to end.
    # @return [Long]
    attr_accessor :scheduled_end_ms

    # The distance expected to be traveled for this route in meters.
    # @return [Long]
    attr_accessor :scheduled_meters

    # The time in Unix epoch milliseconds that the route is scheduled to start.
    # @return [Long]
    attr_accessor :scheduled_start_ms

    # The address of the route's starting location, as it would be recognized if
    # provided to maps.google.com. Optional if a valid start location address ID
    # is provided.
    # @return [String]
    attr_accessor :start_location_address

    # ID of the start location associated with an address book entry. Optional
    # if valid values are provided for start location address or
    # latitude/longitude. If a valid start location address ID is provided,
    # address/latitude/longitude will be used from the address book entry. Name
    # of the address book entry will only be used if the start location name is
    # not provided.
    # @return [Long]
    attr_accessor :start_location_address_id

    # Latitude of the start location in decimal degrees. Optional if a valid
    # start location address ID is provided.
    # @return [Float]
    attr_accessor :start_location_lat

    # Longitude of the start location in decimal degrees. Optional if a valid
    # start location address ID is provided.
    # @return [Float]
    attr_accessor :start_location_lng

    # The name of the route's starting location. If provided, it will take
    # precedence over the name of the address book entry.
    # @return [String]
    attr_accessor :start_location_name

    # ID of the trailer assigned to the dispatch route. Note that trailers can
    # only be assigned to routes that have a Vehicle or Driver assigned to them.
    # @return [Long]
    attr_accessor :trailer_id

    # ID of the vehicle assigned to the dispatch route. Note that vehicle_id and
    # driver_id are mutually exclusive. If neither is specified, then the route
    # is unassigned.
    # @return [Long]
    attr_accessor :vehicle_id

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['dispatch_jobs'] = 'dispatch_jobs'
      @_hash['actual_end_ms'] = 'actual_end_ms'
      @_hash['actual_start_ms'] = 'actual_start_ms'
      @_hash['driver_id'] = 'driver_id'
      @_hash['group_id'] = 'group_id'
      @_hash['name'] = 'name'
      @_hash['scheduled_end_ms'] = 'scheduled_end_ms'
      @_hash['scheduled_meters'] = 'scheduled_meters'
      @_hash['scheduled_start_ms'] = 'scheduled_start_ms'
      @_hash['start_location_address'] = 'start_location_address'
      @_hash['start_location_address_id'] = 'start_location_address_id'
      @_hash['start_location_lat'] = 'start_location_lat'
      @_hash['start_location_lng'] = 'start_location_lng'
      @_hash['start_location_name'] = 'start_location_name'
      @_hash['trailer_id'] = 'trailer_id'
      @_hash['vehicle_id'] = 'vehicle_id'
      @_hash
    end

    def initialize(dispatch_jobs = nil,
                   name = nil,
                   scheduled_end_ms = nil,
                   scheduled_start_ms = nil,
                   actual_end_ms = nil,
                   actual_start_ms = nil,
                   driver_id = nil,
                   group_id = nil,
                   scheduled_meters = nil,
                   start_location_address = nil,
                   start_location_address_id = nil,
                   start_location_lat = nil,
                   start_location_lng = nil,
                   start_location_name = nil,
                   trailer_id = nil,
                   vehicle_id = nil)
      @dispatch_jobs = dispatch_jobs
      @actual_end_ms = actual_end_ms
      @actual_start_ms = actual_start_ms
      @driver_id = driver_id
      @group_id = group_id
      @name = name
      @scheduled_end_ms = scheduled_end_ms
      @scheduled_meters = scheduled_meters
      @scheduled_start_ms = scheduled_start_ms
      @start_location_address = start_location_address
      @start_location_address_id = start_location_address_id
      @start_location_lat = start_location_lat
      @start_location_lng = start_location_lng
      @start_location_name = start_location_name
      @trailer_id = trailer_id
      @vehicle_id = vehicle_id
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      # Parameter is an array, so we need to iterate through it
      dispatch_jobs = nil
      unless hash['dispatch_jobs'].nil?
        dispatch_jobs = []
        hash['dispatch_jobs'].each do |structure|
          dispatch_jobs << (DispatchJobCreate.from_hash(structure) if structure)
        end
      end
      name = hash['name']
      scheduled_end_ms = hash['scheduled_end_ms']
      scheduled_start_ms = hash['scheduled_start_ms']
      actual_end_ms = hash['actual_end_ms']
      actual_start_ms = hash['actual_start_ms']
      driver_id = hash['driver_id']
      group_id = hash['group_id']
      scheduled_meters = hash['scheduled_meters']
      start_location_address = hash['start_location_address']
      start_location_address_id = hash['start_location_address_id']
      start_location_lat = hash['start_location_lat']
      start_location_lng = hash['start_location_lng']
      start_location_name = hash['start_location_name']
      trailer_id = hash['trailer_id']
      vehicle_id = hash['vehicle_id']

      # Create object from extracted values.
      DispatchRouteCreate.new(dispatch_jobs,
                              name,
                              scheduled_end_ms,
                              scheduled_start_ms,
                              actual_end_ms,
                              actual_start_ms,
                              driver_id,
                              group_id,
                              scheduled_meters,
                              start_location_address,
                              start_location_address_id,
                              start_location_lat,
                              start_location_lng,
                              start_location_name,
                              trailer_id,
                              vehicle_id)
    end
  end
end
