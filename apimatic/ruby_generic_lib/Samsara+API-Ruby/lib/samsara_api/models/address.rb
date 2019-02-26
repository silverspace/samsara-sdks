# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Information about an address/geofence. Geofences are either a circle or a
  # polygon.
  class Address < BaseModel
    # TODO: Write general description for this method
    # @return [List of Contact]
    attr_accessor :contacts

    # The full address associated with this address/geofence, as it might be
    # recognized by maps.google.com
    # @return [String]
    attr_accessor :formatted_address

    # The geofence that defines this address and its bounds. This can either be
    # a circle, or a polygon - only one key should be provided, depending on the
    # geofence type.
    # @return [AddressGeofence]
    attr_accessor :geofence

    # ID of the address
    # @return [Long]
    attr_accessor :id

    # Name of the address or geofence
    # @return [String]
    attr_accessor :name

    # Notes associated with an address.
    # @return [String]
    attr_accessor :notes

    # Notes associated with an address.
    # @return [List of TagMetadata]
    attr_accessor :tags

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['contacts'] = 'contacts'
      @_hash['formatted_address'] = 'formattedAddress'
      @_hash['geofence'] = 'geofence'
      @_hash['id'] = 'id'
      @_hash['name'] = 'name'
      @_hash['notes'] = 'notes'
      @_hash['tags'] = 'tags'
      @_hash
    end

    def initialize(contacts = nil,
                   formatted_address = nil,
                   geofence = nil,
                   id = nil,
                   name = nil,
                   notes = nil,
                   tags = nil)
      @contacts = contacts
      @formatted_address = formatted_address
      @geofence = geofence
      @id = id
      @name = name
      @notes = notes
      @tags = tags
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      # Parameter is an array, so we need to iterate through it
      contacts = nil
      unless hash['contacts'].nil?
        contacts = []
        hash['contacts'].each do |structure|
          contacts << (Contact.from_hash(structure) if structure)
        end
      end
      formatted_address = hash['formattedAddress']
      geofence = AddressGeofence.from_hash(hash['geofence']) if
        hash['geofence']
      id = hash['id']
      name = hash['name']
      notes = hash['notes']
      # Parameter is an array, so we need to iterate through it
      tags = nil
      unless hash['tags'].nil?
        tags = []
        hash['tags'].each do |structure|
          tags << (TagMetadata.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      Address.new(contacts,
                  formatted_address,
                  geofence,
                  id,
                  name,
                  notes,
                  tags)
    end
  end
end