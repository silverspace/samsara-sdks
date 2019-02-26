# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Cable Model.
  class Cable < BaseModel
    # Asset type
    # @return [String]
    attr_accessor :asset_type

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['asset_type'] = 'assetType'
      @_hash
    end

    def initialize(asset_type = nil)
      @asset_type = asset_type
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      asset_type = hash['assetType']

      # Create object from extracted values.
      Cable.new(asset_type)
    end
  end
end