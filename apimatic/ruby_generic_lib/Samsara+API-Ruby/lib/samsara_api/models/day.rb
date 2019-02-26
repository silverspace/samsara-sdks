# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Day Model.
  class Day < BaseModel
    # Hours spent on duty or driving, rounded to two decimal places.
    # @return [Float]
    attr_accessor :active_hours

    # Milliseconds spent on duty or driving.
    # @return [Long]
    attr_accessor :active_ms

    # Whether this HOS day chart was certified by the driver.
    # @return [Boolean]
    attr_accessor :certified

    # Unix epoch time (in ms) of time when this chart was certified. If this
    # chart is uncertified, 0.
    # @return [Long]
    attr_accessor :certified_at_ms

    # Distance driven in miles, rounded to two decimal places.
    # @return [Float]
    attr_accessor :distance_miles

    # End of the HOS day, specified in milliseconds UNIX time.
    # @return [Long]
    attr_accessor :end_ms

    # End of the HOS day, specified in milliseconds UNIX time.
    # @return [Long]
    attr_accessor :start_ms

    # List of trailer ID's associated with the driver for the day.
    # @return [Object]
    attr_accessor :trailer_ids

    # List of vehicle ID's associated with the driver for the day.
    # @return [Object]
    attr_accessor :vehicle_ids

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['active_hours'] = 'activeHours'
      @_hash['active_ms'] = 'activeMs'
      @_hash['certified'] = 'certified'
      @_hash['certified_at_ms'] = 'certifiedAtMs'
      @_hash['distance_miles'] = 'distanceMiles'
      @_hash['end_ms'] = 'endMs'
      @_hash['start_ms'] = 'startMs'
      @_hash['trailer_ids'] = 'trailerIds'
      @_hash['vehicle_ids'] = 'vehicleIds'
      @_hash
    end

    def initialize(active_hours = nil,
                   active_ms = nil,
                   certified = nil,
                   certified_at_ms = nil,
                   distance_miles = nil,
                   end_ms = nil,
                   start_ms = nil,
                   trailer_ids = nil,
                   vehicle_ids = nil)
      @active_hours = active_hours
      @active_ms = active_ms
      @certified = certified
      @certified_at_ms = certified_at_ms
      @distance_miles = distance_miles
      @end_ms = end_ms
      @start_ms = start_ms
      @trailer_ids = trailer_ids
      @vehicle_ids = vehicle_ids
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      active_hours = hash['activeHours']
      active_ms = hash['activeMs']
      certified = hash['certified']
      certified_at_ms = hash['certifiedAtMs']
      distance_miles = hash['distanceMiles']
      end_ms = hash['endMs']
      start_ms = hash['startMs']
      trailer_ids = hash['trailerIds']
      vehicle_ids = hash['vehicleIds']

      # Create object from extracted values.
      Day.new(active_hours,
              active_ms,
              certified,
              certified_at_ms,
              distance_miles,
              end_ms,
              start_ms,
              trailer_ids,
              vehicle_ids)
    end
  end
end