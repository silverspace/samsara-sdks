# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DvirBase Model.
  class DvirBase < BaseModel
    # The authors signature for the DVIR.
    # @return [AuthorSignature]
    attr_accessor :author_signature

    # Signifies if the defects on the vehicle corrected after the DVIR is done.
    # @return [Boolean]
    attr_accessor :defects_corrected

    # Signifies if the defects on this vehicle can be ignored.
    # @return [Boolean]
    attr_accessor :defects_need_not_be_corrected

    # The id of this DVIR record.
    # @return [Long]
    attr_accessor :id

    # Inspection type of the DVIR.
    # @return [String]
    attr_accessor :inspection_type

    # The mechanics notes on the DVIR.
    # @return [String]
    attr_accessor :mechanic_notes

    # The mechanic's or agent's signature for the DVIR.
    # @return [MechanicOrAgentSignature]
    attr_accessor :mechanic_or_agent_signature

    # The next driver signature for the DVIR.
    # @return [NextDriverSignature]
    attr_accessor :next_driver_signature

    # The odometer reading in miles for the vehicle when the DVIR was done.
    # @return [Long]
    attr_accessor :odometer_miles

    # Timestamp of this DVIR in UNIX milliseconds.
    # @return [Long]
    attr_accessor :time_ms

    # Defects registered for the trailer which was part of the DVIR.
    # @return [List of TrailerDefect]
    attr_accessor :trailer_defects

    # The id of the trailer which was part of the DVIR.
    # @return [Integer]
    attr_accessor :trailer_id

    # The name of the trailer which was part of the DVIR.
    # @return [String]
    attr_accessor :trailer_name

    # The vehicle on which DVIR was done.
    # @return [Vehicle2]
    attr_accessor :vehicle

    # The condition of vechile on which DVIR was done.
    # @return [String]
    attr_accessor :vehicle_condition

    # Defects registered for the vehicle which was part of the DVIR.
    # @return [List of VehicleDefect]
    attr_accessor :vehicle_defects

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['author_signature'] = 'authorSignature'
      @_hash['defects_corrected'] = 'defectsCorrected'
      @_hash['defects_need_not_be_corrected'] = 'defectsNeedNotBeCorrected'
      @_hash['id'] = 'id'
      @_hash['inspection_type'] = 'inspectionType'
      @_hash['mechanic_notes'] = 'mechanicNotes'
      @_hash['mechanic_or_agent_signature'] = 'mechanicOrAgentSignature'
      @_hash['next_driver_signature'] = 'nextDriverSignature'
      @_hash['odometer_miles'] = 'odometerMiles'
      @_hash['time_ms'] = 'timeMs'
      @_hash['trailer_defects'] = 'trailerDefects'
      @_hash['trailer_id'] = 'trailerId'
      @_hash['trailer_name'] = 'trailerName'
      @_hash['vehicle'] = 'vehicle'
      @_hash['vehicle_condition'] = 'vehicleCondition'
      @_hash['vehicle_defects'] = 'vehicleDefects'
      @_hash
    end

    def initialize(author_signature = nil,
                   defects_corrected = nil,
                   defects_need_not_be_corrected = nil,
                   id = nil,
                   inspection_type = nil,
                   mechanic_notes = nil,
                   mechanic_or_agent_signature = nil,
                   next_driver_signature = nil,
                   odometer_miles = nil,
                   time_ms = nil,
                   trailer_defects = nil,
                   trailer_id = nil,
                   trailer_name = nil,
                   vehicle = nil,
                   vehicle_condition = nil,
                   vehicle_defects = nil)
      @author_signature = author_signature
      @defects_corrected = defects_corrected
      @defects_need_not_be_corrected = defects_need_not_be_corrected
      @id = id
      @inspection_type = inspection_type
      @mechanic_notes = mechanic_notes
      @mechanic_or_agent_signature = mechanic_or_agent_signature
      @next_driver_signature = next_driver_signature
      @odometer_miles = odometer_miles
      @time_ms = time_ms
      @trailer_defects = trailer_defects
      @trailer_id = trailer_id
      @trailer_name = trailer_name
      @vehicle = vehicle
      @vehicle_condition = vehicle_condition
      @vehicle_defects = vehicle_defects
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      author_signature = AuthorSignature.from_hash(hash['authorSignature']) if
        hash['authorSignature']
      defects_corrected = hash['defectsCorrected']
      defects_need_not_be_corrected = hash['defectsNeedNotBeCorrected']
      id = hash['id']
      inspection_type = hash['inspectionType']
      mechanic_notes = hash['mechanicNotes']
      if hash['mechanicOrAgentSignature']
        mechanic_or_agent_signature = MechanicOrAgentSignature.from_hash(hash['mechanicOrAgentSignature'])
      end
      if hash['nextDriverSignature']
        next_driver_signature = NextDriverSignature.from_hash(hash['nextDriverSignature'])
      end
      odometer_miles = hash['odometerMiles']
      time_ms = hash['timeMs']
      # Parameter is an array, so we need to iterate through it
      trailer_defects = nil
      unless hash['trailerDefects'].nil?
        trailer_defects = []
        hash['trailerDefects'].each do |structure|
          trailer_defects << (TrailerDefect.from_hash(structure) if structure)
        end
      end
      trailer_id = hash['trailerId']
      trailer_name = hash['trailerName']
      vehicle = Vehicle2.from_hash(hash['vehicle']) if hash['vehicle']
      vehicle_condition = hash['vehicleCondition']
      # Parameter is an array, so we need to iterate through it
      vehicle_defects = nil
      unless hash['vehicleDefects'].nil?
        vehicle_defects = []
        hash['vehicleDefects'].each do |structure|
          vehicle_defects << (VehicleDefect.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      DvirBase.new(author_signature,
                   defects_corrected,
                   defects_need_not_be_corrected,
                   id,
                   inspection_type,
                   mechanic_notes,
                   mechanic_or_agent_signature,
                   next_driver_signature,
                   odometer_miles,
                   time_ms,
                   trailer_defects,
                   trailer_id,
                   trailer_name,
                   vehicle,
                   vehicle_condition,
                   vehicle_defects)
    end
  end
end
