# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Reefer-specific asset details
  class AssetReeferResponse < BaseModel
    # Asset type
    # @return [String]
    attr_accessor :asset_type

    # Asset ID
    # @return [Integer]
    attr_accessor :id

    # Asset name
    # @return [String]
    attr_accessor :name

    # Asset name
    # @return [ReeferStats]
    attr_accessor :reefer_stats

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['asset_type'] = 'assetType'
      @_hash['id'] = 'id'
      @_hash['name'] = 'name'
      @_hash['reefer_stats'] = 'reeferStats'
      @_hash
    end

    def initialize(asset_type = nil,
                   id = nil,
                   name = nil,
                   reefer_stats = nil)
      @asset_type = asset_type
      @id = id
      @name = name
      @reefer_stats = reefer_stats
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      asset_type = hash['assetType']
      id = hash['id']
      name = hash['name']
      reefer_stats = ReeferStats.from_hash(hash['reeferStats']) if
        hash['reeferStats']

      # Create object from extracted values.
      AssetReeferResponse.new(asset_type,
                              id,
                              name,
                              reefer_stats)
    end
  end
end
