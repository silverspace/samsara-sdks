# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DocumentFieldType Model.
  class DocumentFieldType < BaseModel
    # Descriptive name of this field type.
    # @return [String]
    attr_accessor :label

    # Additional metadata information for a number field type. Only defined when
    # a field type has valueType: ValueType_Number.
    # @return [NumberValueTypeMetadata]
    attr_accessor :number_value_type_metadata

    # The kind of value that can be submitted for this fieldType. It should be
    # either ValueType_Number, ValueType_String, or ValueType_Photo.
    # @return [String]
    attr_accessor :value_type

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['label'] = 'label'
      @_hash['number_value_type_metadata'] = 'numberValueTypeMetadata'
      @_hash['value_type'] = 'valueType'
      @_hash
    end

    def initialize(label = nil,
                   value_type = nil,
                   number_value_type_metadata = nil)
      @label = label
      @number_value_type_metadata = number_value_type_metadata
      @value_type = value_type
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      label = hash['label']
      value_type = hash['valueType']
      if hash['numberValueTypeMetadata']
        number_value_type_metadata = NumberValueTypeMetadata.from_hash(hash['numberValueTypeMetadata'])
      end

      # Create object from extracted values.
      DocumentFieldType.new(label,
                            value_type,
                            number_value_type_metadata)
    end
  end
end
