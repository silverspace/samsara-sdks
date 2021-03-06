# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DocumentBase Model.
  class DocumentBase < BaseModel
    # ID of the Samsara dispatch job for which the document is submitted
    # @return [Long]
    attr_accessor :dispatch_job_id

    # Notes submitted with this document.
    # @return [String]
    attr_accessor :notes

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['dispatch_job_id'] = 'dispatchJobId'
      @_hash['notes'] = 'notes'
      @_hash
    end

    def initialize(dispatch_job_id = nil,
                   notes = nil)
      @dispatch_job_id = dispatch_job_id
      @notes = notes
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      dispatch_job_id = hash['dispatchJobId']
      notes = hash['notes']

      # Create object from extracted values.
      DocumentBase.new(dispatch_job_id,
                       notes)
    end
  end
end
