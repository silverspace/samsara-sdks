# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Driver1 Model.
  class Driver1 < BaseModel
    # The amount of remaining cycle time (in ms).
    # @return [Long]
    attr_accessor :cycle_remaining

    # The amount of cycle time (in ms) available tomorrow.
    # @return [Long]
    attr_accessor :cycle_tomorrow

    # ID of the driver.
    # @return [Long]
    attr_accessor :driver_id

    # Name of the driver.
    # @return [String]
    attr_accessor :driver_name

    # The amount of driving time in violation in this cycle (in ms).
    # @return [Long]
    attr_accessor :driving_in_violation_cycle

    # The amount of driving time in violation today (in ms).
    # @return [Long]
    attr_accessor :driving_in_violation_today

    # The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`,
    # `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    # @return [String]
    attr_accessor :duty_status

    # The amount of remaining shift drive time (in ms).
    # @return [Long]
    attr_accessor :shift_drive_remaining

    # The amount of remaining shift time (in ms).
    # @return [Long]
    attr_accessor :shift_remaining

    # The amount of time (in ms) that the driver has been in the current
    # `dutyStatus`.
    # @return [Long]
    attr_accessor :time_in_current_status

    # The amount of time (in ms) remaining until the driver cannot drive without
    # a rest break.
    # @return [Long]
    attr_accessor :time_until_break

    # Name of the vehicle.
    # @return [String]
    attr_accessor :vehicle_name

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['cycle_remaining'] = 'cycleRemaining'
      @_hash['cycle_tomorrow'] = 'cycleTomorrow'
      @_hash['driver_id'] = 'driverId'
      @_hash['driver_name'] = 'driverName'
      @_hash['driving_in_violation_cycle'] = 'drivingInViolationCycle'
      @_hash['driving_in_violation_today'] = 'drivingInViolationToday'
      @_hash['duty_status'] = 'dutyStatus'
      @_hash['shift_drive_remaining'] = 'shiftDriveRemaining'
      @_hash['shift_remaining'] = 'shiftRemaining'
      @_hash['time_in_current_status'] = 'timeInCurrentStatus'
      @_hash['time_until_break'] = 'timeUntilBreak'
      @_hash['vehicle_name'] = 'vehicleName'
      @_hash
    end

    def initialize(cycle_remaining = nil,
                   cycle_tomorrow = nil,
                   driver_id = nil,
                   driver_name = nil,
                   driving_in_violation_cycle = nil,
                   driving_in_violation_today = nil,
                   duty_status = nil,
                   shift_drive_remaining = nil,
                   shift_remaining = nil,
                   time_in_current_status = nil,
                   time_until_break = nil,
                   vehicle_name = nil)
      @cycle_remaining = cycle_remaining
      @cycle_tomorrow = cycle_tomorrow
      @driver_id = driver_id
      @driver_name = driver_name
      @driving_in_violation_cycle = driving_in_violation_cycle
      @driving_in_violation_today = driving_in_violation_today
      @duty_status = duty_status
      @shift_drive_remaining = shift_drive_remaining
      @shift_remaining = shift_remaining
      @time_in_current_status = time_in_current_status
      @time_until_break = time_until_break
      @vehicle_name = vehicle_name
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      cycle_remaining = hash['cycleRemaining']
      cycle_tomorrow = hash['cycleTomorrow']
      driver_id = hash['driverId']
      driver_name = hash['driverName']
      driving_in_violation_cycle = hash['drivingInViolationCycle']
      driving_in_violation_today = hash['drivingInViolationToday']
      duty_status = hash['dutyStatus']
      shift_drive_remaining = hash['shiftDriveRemaining']
      shift_remaining = hash['shiftRemaining']
      time_in_current_status = hash['timeInCurrentStatus']
      time_until_break = hash['timeUntilBreak']
      vehicle_name = hash['vehicleName']

      # Create object from extracted values.
      Driver1.new(cycle_remaining,
                  cycle_tomorrow,
                  driver_id,
                  driver_name,
                  driving_in_violation_cycle,
                  driving_in_violation_today,
                  duty_status,
                  shift_drive_remaining,
                  shift_remaining,
                  time_in_current_status,
                  time_until_break,
                  vehicle_name)
    end
  end
end
