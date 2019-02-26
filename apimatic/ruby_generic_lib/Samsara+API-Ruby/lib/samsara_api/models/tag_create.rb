# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # TagCreate Model.
  class TagCreate < BaseModel
    # The assets that belong to this tag.
    # @return [List of TaggedAssetBase]
    attr_accessor :assets

    # The drivers that belong to this tag.
    # @return [List of TaggedDriverBase]
    attr_accessor :drivers

    # The machines that belong to this tag.
    # @return [List of TaggedMachineBase]
    attr_accessor :machines

    # Name of this tag.
    # @return [String]
    attr_accessor :name

    # If this tag is part a hierarchical tag tree as a child tag, the
    # parentTagId is the ID of this tag's parent tag.
    # @return [Long]
    attr_accessor :parent_tag_id

    # The sensors that belong to this tag.
    # @return [List of TaggedSensorBase]
    attr_accessor :sensors

    # The vehicles that belong to this tag.
    # @return [List of TaggedVehicleBase]
    attr_accessor :vehicles

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['assets'] = 'assets'
      @_hash['drivers'] = 'drivers'
      @_hash['machines'] = 'machines'
      @_hash['name'] = 'name'
      @_hash['parent_tag_id'] = 'parentTagId'
      @_hash['sensors'] = 'sensors'
      @_hash['vehicles'] = 'vehicles'
      @_hash
    end

    def initialize(name = nil,
                   assets = nil,
                   drivers = nil,
                   machines = nil,
                   parent_tag_id = nil,
                   sensors = nil,
                   vehicles = nil)
      @assets = assets
      @drivers = drivers
      @machines = machines
      @name = name
      @parent_tag_id = parent_tag_id
      @sensors = sensors
      @vehicles = vehicles
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      name = hash['name']
      # Parameter is an array, so we need to iterate through it
      assets = nil
      unless hash['assets'].nil?
        assets = []
        hash['assets'].each do |structure|
          assets << (TaggedAssetBase.from_hash(structure) if structure)
        end
      end
      # Parameter is an array, so we need to iterate through it
      drivers = nil
      unless hash['drivers'].nil?
        drivers = []
        hash['drivers'].each do |structure|
          drivers << (TaggedDriverBase.from_hash(structure) if structure)
        end
      end
      # Parameter is an array, so we need to iterate through it
      machines = nil
      unless hash['machines'].nil?
        machines = []
        hash['machines'].each do |structure|
          machines << (TaggedMachineBase.from_hash(structure) if structure)
        end
      end
      parent_tag_id = hash['parentTagId']
      # Parameter is an array, so we need to iterate through it
      sensors = nil
      unless hash['sensors'].nil?
        sensors = []
        hash['sensors'].each do |structure|
          sensors << (TaggedSensorBase.from_hash(structure) if structure)
        end
      end
      # Parameter is an array, so we need to iterate through it
      vehicles = nil
      unless hash['vehicles'].nil?
        vehicles = []
        hash['vehicles'].each do |structure|
          vehicles << (TaggedVehicleBase.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      TagCreate.new(name,
                    assets,
                    drivers,
                    machines,
                    parent_tag_id,
                    sensors,
                    vehicles)
    end
  end
end