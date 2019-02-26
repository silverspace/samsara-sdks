# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # AllRouteJobUpdates Model.
  class AllRouteJobUpdates < BaseModel
    # TODO: Write general description for this method
    # @return [List of JobUpdateObject]
    attr_accessor :job_updates

    # Sequence ID of the last update returned in the response
    # @return [String]
    attr_accessor :sequence_id

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['job_updates'] = 'job_updates'
      @_hash['sequence_id'] = 'sequence_id'
      @_hash
    end

    def initialize(job_updates = nil,
                   sequence_id = nil)
      @job_updates = job_updates
      @sequence_id = sequence_id
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      # Parameter is an array, so we need to iterate through it
      job_updates = nil
      unless hash['job_updates'].nil?
        job_updates = []
        hash['job_updates'].each do |structure|
          job_updates << (JobUpdateObject.from_hash(structure) if structure)
        end
      end
      sequence_id = hash['sequence_id']

      # Create object from extracted values.
      AllRouteJobUpdates.new(job_updates,
                             sequence_id)
    end
  end
end