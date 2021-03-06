# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # TaggedAddressBase Model.
  class TaggedAddressBase < BaseModel
    # The ID of the address being tagged.
    # @return [Long]
    attr_accessor :id

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['id'] = 'id'
      @_hash
    end

    def initialize(id = nil)
      @id = id
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash['id']

      # Create object from extracted values.
      TaggedAddressBase.new(id)
    end
  end
end
