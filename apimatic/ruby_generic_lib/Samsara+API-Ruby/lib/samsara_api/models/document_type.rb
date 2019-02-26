# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DocumentType Model.
  class DocumentType < BaseModel
    # The field types determine the names of fields for this document type. They
    # also determine the types of values a document submitted for this document
    # type can have.
    # @return [List of DocumentFieldType]
    attr_accessor :field_types

    # Name of the document type.
    # @return [String]
    attr_accessor :name

    # ID for the organization this document belongs to.
    # @return [Long]
    attr_accessor :org_id

    # Universally unique identifier for the document type. Can be passed in as a
    # documentTypeUuid when creating a document for this document type.
    # @return [String]
    attr_accessor :uuid

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['field_types'] = 'fieldTypes'
      @_hash['name'] = 'name'
      @_hash['org_id'] = 'orgId'
      @_hash['uuid'] = 'uuid'
      @_hash
    end

    def initialize(name = nil,
                   org_id = nil,
                   uuid = nil,
                   field_types = nil)
      @field_types = field_types
      @name = name
      @org_id = org_id
      @uuid = uuid
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      name = hash['name']
      org_id = hash['orgId']
      uuid = hash['uuid']
      # Parameter is an array, so we need to iterate through it
      field_types = nil
      unless hash['fieldTypes'].nil?
        field_types = []
        hash['fieldTypes'].each do |structure|
          field_types << (DocumentFieldType.from_hash(structure) if structure)
        end
      end

      # Create object from extracted values.
      DocumentType.new(name,
                       org_id,
                       uuid,
                       field_types)
    end
  end
end