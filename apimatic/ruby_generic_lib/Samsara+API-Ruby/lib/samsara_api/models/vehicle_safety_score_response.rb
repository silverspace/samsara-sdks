# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Safety score details for a vehicle
  class VehicleSafetyScoreResponse < BaseModel
    # Crash event count
    # @return [Integer]
    attr_accessor :crash_count

    # Harsh acceleration event count
    # @return [Integer]
    attr_accessor :harsh_accel_count

    # Harsh braking event count
    # @return [Integer]
    attr_accessor :harsh_braking_count

    # Harsh braking event count
    # @return [List of SafetyReportHarshEvent]
    attr_accessor :harsh_events

    # Harsh turning event count
    # @return [Integer]
    attr_accessor :harsh_turning_count

    # Safety Score
    # @return [Integer]
    attr_accessor :safety_score

    # Safety Score Rank
    # @return [String]
    attr_accessor :safety_score_rank

    # Amount of time driven over the speed limit in milliseconds
    # @return [Integer]
    attr_accessor :time_over_speed_limit_ms

    # Total distance driven in meters
    # @return [Integer]
    attr_accessor :total_distance_driven_meters

    # Total harsh event count
    # @return [Integer]
    attr_accessor :total_harsh_event_count

    # Amount of time driven in milliseconds
    # @return [Integer]
    attr_accessor :total_time_driven_ms

    # Vehicle ID
    # @return [Integer]
    attr_accessor :vehicle_id

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['crash_count'] = 'crashCount'
      @_hash['harsh_accel_count'] = 'harshAccelCount'
      @_hash['harsh_braking_count'] = 'harshBrakingCount'
      @_hash['harsh_events'] = 'harshEvents'
      @_hash['harsh_turning_count'] = 'harshTurningCount'
      @_hash['safety_score'] = 'safetyScore'
      @_hash['safety_score_rank'] = 'safetyScoreRank'
      @_hash['time_over_speed_limit_ms'] = 'timeOverSpeedLimitMs'
      @_hash['total_distance_driven_meters'] = 'totalDistanceDrivenMeters'
      @_hash['total_harsh_event_count'] = 'totalHarshEventCount'
      @_hash['total_time_driven_ms'] = 'totalTimeDrivenMs'
      @_hash['vehicle_id'] = 'vehicleId'
      @_hash
    end

    def initialize(crash_count = nil,
                   harsh_accel_count = nil,
                   harsh_braking_count = nil,
                   harsh_events = nil,
                   harsh_turning_count = nil,
                   safety_score = nil,
                   safety_score_rank = nil,
                   time_over_speed_limit_ms = nil,
                   total_distance_driven_meters = nil,
                   total_harsh_event_count = nil,
                   total_time_driven_ms = nil,
                   vehicle_id = nil)
      @crash_count = crash_count
      @harsh_accel_count = harsh_accel_count
      @harsh_braking_count = harsh_braking_count
      @harsh_events = harsh_events
      @harsh_turning_count = harsh_turning_count
      @safety_score = safety_score
      @safety_score_rank = safety_score_rank
      @time_over_speed_limit_ms = time_over_speed_limit_ms
      @total_distance_driven_meters = total_distance_driven_meters
      @total_harsh_event_count = total_harsh_event_count
      @total_time_driven_ms = total_time_driven_ms
      @vehicle_id = vehicle_id
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      crash_count = hash['crashCount']
      harsh_accel_count = hash['harshAccelCount']
      harsh_braking_count = hash['harshBrakingCount']
      # Parameter is an array, so we need to iterate through it
      harsh_events = nil
      unless hash['harshEvents'].nil?
        harsh_events = []
        hash['harshEvents'].each do |structure|
          harsh_events << (SafetyReportHarshEvent.from_hash(structure) if structure)
        end
      end
      harsh_turning_count = hash['harshTurningCount']
      safety_score = hash['safetyScore']
      safety_score_rank = hash['safetyScoreRank']
      time_over_speed_limit_ms = hash['timeOverSpeedLimitMs']
      total_distance_driven_meters = hash['totalDistanceDrivenMeters']
      total_harsh_event_count = hash['totalHarshEventCount']
      total_time_driven_ms = hash['totalTimeDrivenMs']
      vehicle_id = hash['vehicleId']

      # Create object from extracted values.
      VehicleSafetyScoreResponse.new(crash_count,
                                     harsh_accel_count,
                                     harsh_braking_count,
                                     harsh_events,
                                     harsh_turning_count,
                                     safety_score,
                                     safety_score_rank,
                                     time_over_speed_limit_ms,
                                     total_distance_driven_meters,
                                     total_harsh_event_count,
                                     total_time_driven_ms,
                                     vehicle_id)
    end
  end
end