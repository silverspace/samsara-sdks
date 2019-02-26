# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Tag Model.
  class Tag < BaseModel
    # The addresses that belong to this tag.
    # @return [List of TaggedAddress]
    attr_accessor :addresses

    # The assets that belong to this tag.
    # @return [List of TaggedAsset]
    attr_accessor :assets

    # The drivers that belong to this tag.
    # @return [List of TaggedDriver]
    attr_accessor :drivers

    # The GroupID that this tag belongs to.
    # @return [Long]
    attr_accessor :group_id

    # The ID of this tag.
    # @return [Long]
    attr_accessor :id

    # The machines that belong to this tag.
    # @return [List of TaggedMachine]
    attr_accessor :machines

    # Name of this tag.
    # @return [String]
    attr_accessor :name

    # If this tag is part a hierarchical tag tree as a child tag, the
    # parentTagId is the ID of this tag's parent tag.
    # @return [Long]
    attr_accessor :parent_tag_id

    # The sensors that belong to this tag.
    # @return [List of TaggedSensor]
    attr_accessor :sensors

    # The vehicles that belong to this tag.
    # @return [List of TaggedVehicle]
    attr_accessor :vehicles

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['addresses'] = 'addresses'
      @_hash['assets'] = 'assets'
      @_hash['drivers'] = 'drivers'
      @_hash['group_id'] = 'groupId'
      @_hash['id'] = 'id'
      @_hash['machines'] = 'machines'
      @_hash['name'] = 'name'
      @_hash['parent_tag_id'] = 'parentTagId'
      @_hash['sensors'] = 'sensors'
      @_hash['vehicles'] = 'vehicles'
      @_hash
    end

    def initialize(id = nil,
                   name = nil,
                   addresses = nil,
                   assets = nil,
                   drivers = nil,
                   group_id = nil,
                   machines = nil,
                   parent_tag_id = nil,
                   sensors = nil,
                   vehicles = nil)
      @addresses = addresses
      @assets = assets
      @drivers = drivers
      @group_id = group_id
      @id = id
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
      id = hash['id']
      name = hash['name']
      # Parameter is an array, so we need to iterate through it
      addresses = nil
      unless hash['addresses'].nil?
        addresses = []
        hash['addresses'].each do |structure|
          addresses << (TaggedAddress.from_hash(structure) if structure)
        end
      end
      # Parameter is an array, so we need to iterate through it
      assets = nil
      unless hash['assets'].nil?
        assets = []
        hash['assets'].each do |structure|
          assets << (TaggedAsset.from_hash(structure) if structure)
        end
      end
      # Parameter is an array, so we need to iterate through it
      drivers = nil
      unless hash['drivers'].nil?
        drivers = []
        hash['drivers'].each do |structure|
          drivers << (TaggedDriver.from_hash(structure) if structure)
        end
      end
      group_id = hash['groupId']
      # Parameter is an array, so we need to iterate through it
      machines = nil
      unless hash['machines'].nil?
        machines = []
        hash['machines'].each do |structure|
          machines << (TaggedMachine.from_hash(structure) if structure)
        end
      end
      parent_tag_id = hash['parentTagId']
      # Parameter is an array, so we need to iterate through it
      sensors = nil
      unless hash['sensors'].nil?
        sensors = []
        hash['sensors'].each do |structure|
          sensors << (TaggedSensor.from_hash(structure) if structure)
        end
      end
      # Parameter is an array, so we need to iterate through it
      vehicles = nil
      unless hash['vehicles'].nil?
        vehicles = []
        hash['vehicles'].each do |structure|
          vehicles << (TaggedVehicle.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      Tag.new(id,
              name,
              addresses,
              assets,
              drivers,
              group_id,
              machines,
              parent_tag_id,
              sensors,
              vehicles)
    end
  end
end