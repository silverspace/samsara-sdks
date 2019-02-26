# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # TaggedDriver Model.
  class TaggedDriver < BaseModel
    # The ID of the Driver being tagged.
    # @return [Long]
    attr_accessor :id

    # Name of the Driver being tagged.
    # @return [String]
    attr_accessor :name

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['id'] = 'id'
      @_hash['name'] = 'name'
      @_hash
    end

    def initialize(id = nil,
                   name = nil)
      @id = id
      @name = name
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      id = hash['id']
      name = hash['name']

      # Create object from extracted values.
      TaggedDriver.new(id,
                       name)
    end
  end
end
