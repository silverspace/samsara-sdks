# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # DocumentField Model.
  class DocumentField < BaseModel
    # Descriptive name of this field.
    # @return [String]
    attr_accessor :label

    # DEPRECATED: Please use stringValue, numberValue, or photoValue instead.
    # Value of this field. Depending on what kind of field it is, this may be
    # one of the following: an array of image urls, a float, an integer, or a
    # string.
    # @return [Object]
    attr_accessor :value

    # Value of this field if this document field has valueType:
    # ValueType_Number.
    # @return [Float]
    attr_accessor :number_value

    # Value of this field if this document field has valueType: ValueType_Photo.
    # Array of photo objects where each object contains a URL for a photo.
    # @return [List of PhotoValue]
    attr_accessor :photo_value

    # Value of this field if this document field has valueType:
    # ValueType_String.
    # @return [String]
    attr_accessor :string_value

    # Determines the type of this field and what type of value this field has.
    # It should be either ValueType_Number, ValueType_String, or
    # ValueType_Photo.
    # @return [String]
    attr_accessor :value_type

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['label'] = 'label'
      @_hash['value'] = 'value'
      @_hash['number_value'] = 'numberValue'
      @_hash['photo_value'] = 'photoValue'
      @_hash['string_value'] = 'stringValue'
      @_hash['value_type'] = 'valueType'
      @_hash
    end

    def initialize(label = nil,
                   value_type = nil,
                   value = nil,
                   number_value = nil,
                   photo_value = nil,
                   string_value = nil)
      @label = label
      @value = value
      @number_value = number_value
      @photo_value = photo_value
      @string_value = string_value
      @value_type = value_type
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      label = hash['label']
      value_type = hash['valueType']
      value = hash['value']
      number_value = hash['numberValue']
      # Parameter is an array, so we need to iterate through it
      photo_value = nil
      unless hash['photoValue'].nil?
        photo_value = []
        hash['photoValue'].each do |structure|
          photo_value << (PhotoValue.from_hash(structure) if structure)
        end
      end
      string_value = hash['stringValue']

      # Create object from extracted values.
      DocumentField.new(label,
                        value_type,
                        value,
                        number_value,
                        photo_value,
                        string_value)
    end
  end
end
