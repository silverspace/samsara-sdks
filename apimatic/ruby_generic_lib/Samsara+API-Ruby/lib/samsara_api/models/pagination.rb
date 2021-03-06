# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # Pagination Model.
  class Pagination < BaseModel
    # Cursor identifier representing the last element in the response. This
    # value should be used in conjunction with a subsequent request's
    # 'starting_after' query parameter.
    # @return [String]
    attr_accessor :end_cursor

    # True if there are more pages of results after this response.
    # @return [Boolean]
    attr_accessor :has_next_page

    # True if there are more pages of results before this response.
    # @return [Boolean]
    attr_accessor :has_prev_page

    # Cursor identifier representing the first element in the response. This
    # value should be used in conjunction with a subsequent request's
    # 'ending_before' query parameter.
    # @return [String]
    attr_accessor :start_cursor

    # A mapping from model property names to API property names.
    def self.names
      @_hash = {} if @_hash.nil?
      @_hash['end_cursor'] = 'endCursor'
      @_hash['has_next_page'] = 'hasNextPage'
      @_hash['has_prev_page'] = 'hasPrevPage'
      @_hash['start_cursor'] = 'startCursor'
      @_hash
    end

    def initialize(end_cursor = nil,
                   has_next_page = nil,
                   has_prev_page = nil,
                   start_cursor = nil)
      @end_cursor = end_cursor
      @has_next_page = has_next_page
      @has_prev_page = has_prev_page
      @start_cursor = start_cursor
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      end_cursor = hash['endCursor']
      has_next_page = hash['hasNextPage']
      has_prev_page = hash['hasPrevPage']
      start_cursor = hash['startCursor']

      # Create object from extracted values.
      Pagination.new(end_cursor,
                     has_next_page,
                     has_prev_page,
                     start_cursor)
    end
  end
end
