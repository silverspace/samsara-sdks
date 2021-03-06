# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # J1939 based data. Null if no data is available.
  class J1939 < BaseModel
    # J1939 check engine lights.
    # @return [CheckEngineLight]
    attr_accessor :check_engine_light

    # J1939 DTCs.
    # @return [List of DiagnosticTroubleCode]
    attr_accessor :diagnostic_trouble_codes

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['check_engine_light'] = 'checkEngineLight'
      @_hash['diagnostic_trouble_codes'] = 'diagnosticTroubleCodes'
      @_hash
    end

    def initialize(check_engine_light = nil,
                   diagnostic_trouble_codes = nil)
      @check_engine_light = check_engine_light
      @diagnostic_trouble_codes = diagnostic_trouble_codes
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      if hash['checkEngineLight']
        check_engine_light = CheckEngineLight.from_hash(hash['checkEngineLight'])
      end
      # Parameter is an array, so we need to iterate through it
      diagnostic_trouble_codes = nil
      unless hash['diagnosticTroubleCodes'].nil?
        diagnostic_trouble_codes = []
        hash['diagnosticTroubleCodes'].each do |structure|
          diagnostic_trouble_codes << (DiagnosticTroubleCode.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      J1939.new(check_engine_light,
                diagnostic_trouble_codes)
    end
  end
end
