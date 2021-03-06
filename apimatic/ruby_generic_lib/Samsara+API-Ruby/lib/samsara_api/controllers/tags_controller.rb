# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # TagsController
  class TagsController < BaseController
    @instance = TagsController.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Permanently deletes a tag.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [Long] tag_id Required parameter: ID of the tag.
    # @return void response from the API call
    def delete_tag_by_id(access_token,
                         tag_id)
      # Prepare query url.
      _path_url = '/tags/{tag_id}'
      _path_url = APIHelper.append_url_with_template_parameters(
        _path_url,
        'tag_id' => tag_id
      )
      _query_builder = Configuration.base_uri.dup
      _query_builder << _path_url
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        {
          'access_token' => access_token
        },
        array_serialization: Configuration.array_serialization
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare and execute HttpRequest.
      _request = @http_client.delete(
        _query_url
      )
      CustomQueryAuth.apply(_request)
      _context = execute_request(_request)

      # Validate response against endpoint and global error codes.
      unless _context.response.status_code.between?(200, 208)
        raise APIException.new(
          'Unexpected error.',
          _context
        )
      end
      validate_response(_context)
    end

    # Fetch a tag by id.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [Long] tag_id Required parameter: ID of the tag.
    # @return Tag response from the API call
    def get_tag_by_id(access_token,
                      tag_id)
      # Prepare query url.
      _path_url = '/tags/{tag_id}'
      _path_url = APIHelper.append_url_with_template_parameters(
        _path_url,
        'tag_id' => tag_id
      )
      _query_builder = Configuration.base_uri.dup
      _query_builder << _path_url
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        {
          'access_token' => access_token
        },
        array_serialization: Configuration.array_serialization
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json'
      }

      # Prepare and execute HttpRequest.
      _request = @http_client.get(
        _query_url,
        headers: _headers
      )
      CustomQueryAuth.apply(_request)
      _context = execute_request(_request)

      # Validate response against endpoint and global error codes.
      unless _context.response.status_code.between?(200, 208)
        raise APIException.new(
          'Unexpected error.',
          _context
        )
      end
      validate_response(_context)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_context.response.raw_body)
      Tag.from_hash(decoded)
    end

    # Add or delete specific members from a tag, or modify the name of a tag.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [Long] tag_id Required parameter: ID of the tag.
    # @param [TagModify] tag_modify_params Required parameter: Example:
    # @return Tag response from the API call
    def modify_tag_by_id(access_token,
                         tag_id,
                         tag_modify_params)
      # Prepare query url.
      _path_url = '/tags/{tag_id}'
      _path_url = APIHelper.append_url_with_template_parameters(
        _path_url,
        'tag_id' => tag_id
      )
      _query_builder = Configuration.base_uri.dup
      _query_builder << _path_url
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        {
          'access_token' => access_token
        },
        array_serialization: Configuration.array_serialization
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8'
      }

      # Prepare and execute HttpRequest.
      _request = @http_client.patch(
        _query_url,
        headers: _headers,
        parameters: tag_modify_params.to_json
      )
      CustomQueryAuth.apply(_request)
      _context = execute_request(_request)

      # Validate response against endpoint and global error codes.
      unless _context.response.status_code.between?(200, 208)
        raise APIException.new(
          'Unexpected error.',
          _context
        )
      end
      validate_response(_context)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_context.response.raw_body)
      Tag.from_hash(decoded)
    end

    # Create a new tag for the group.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [TagCreate] tag_create_params Required parameter: Example:
    # @return Tag response from the API call
    def create_tag(access_token,
                   tag_create_params)
      # Prepare query url.
      _path_url = '/tags'
      _query_builder = Configuration.base_uri.dup
      _query_builder << _path_url
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        {
          'access_token' => access_token
        },
        array_serialization: Configuration.array_serialization
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8'
      }

      # Prepare and execute HttpRequest.
      _request = @http_client.post(
        _query_url,
        headers: _headers,
        parameters: tag_create_params.to_json
      )
      CustomQueryAuth.apply(_request)
      _context = execute_request(_request)

      # Validate response against endpoint and global error codes.
      unless _context.response.status_code.between?(200, 208)
        raise APIException.new(
          'Unexpected error.',
          _context
        )
      end
      validate_response(_context)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_context.response.raw_body)
      Tag.from_hash(decoded)
    end

    # Update a tag with a new name and new members. This API call would replace
    # all old members of a tag with new members specified in the request body.
    # To modify only a few devices associated with a tag use the PATCH endpoint.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [Long] tag_id Required parameter: ID of the tag.
    # @param [TagUpdate] update_tag_params Required parameter: Example:
    # @return Tag response from the API call
    def update_tag_by_id(access_token,
                         tag_id,
                         update_tag_params)
      # Prepare query url.
      _path_url = '/tags/{tag_id}'
      _path_url = APIHelper.append_url_with_template_parameters(
        _path_url,
        'tag_id' => tag_id
      )
      _query_builder = Configuration.base_uri.dup
      _query_builder << _path_url
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        {
          'access_token' => access_token
        },
        array_serialization: Configuration.array_serialization
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json',
        'content-type' => 'application/json; charset=utf-8'
      }

      # Prepare and execute HttpRequest.
      _request = @http_client.put(
        _query_url,
        headers: _headers,
        parameters: update_tag_params.to_json
      )
      CustomQueryAuth.apply(_request)
      _context = execute_request(_request)

      # Validate response against endpoint and global error codes.
      unless _context.response.status_code.between?(200, 208)
        raise APIException.new(
          'Unexpected error.',
          _context
        )
      end
      validate_response(_context)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_context.response.raw_body)
      Tag.from_hash(decoded)
    end

    # Fetch all of the tags for a group.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [Long] group_id Optional parameter: Optional group ID if the
    # organization has multiple groups (uncommon).
    # @return GetAllTagsResponse response from the API call
    def get_all_tags(access_token,
                     group_id = nil)
      # Prepare query url.
      _path_url = '/tags'
      _query_builder = Configuration.base_uri.dup
      _query_builder << _path_url
      _query_builder = APIHelper.append_url_with_query_parameters(
        _query_builder,
        {
          'access_token' => access_token,
          'group_id' => group_id
        },
        array_serialization: Configuration.array_serialization
      )
      _query_url = APIHelper.clean_url _query_builder

      # Prepare headers.
      _headers = {
        'accept' => 'application/json'
      }

      # Prepare and execute HttpRequest.
      _request = @http_client.get(
        _query_url,
        headers: _headers
      )
      CustomQueryAuth.apply(_request)
      _context = execute_request(_request)

      # Validate response against endpoint and global error codes.
      unless _context.response.status_code.between?(200, 208)
        raise APIException.new(
          'Unexpected error.',
          _context
        )
      end
      validate_response(_context)

      # Return appropriate response type.
      decoded = APIHelper.json_deserialize(_context.response.raw_body)
      GetAllTagsResponse.from_hash(decoded)
    end
  end
end
