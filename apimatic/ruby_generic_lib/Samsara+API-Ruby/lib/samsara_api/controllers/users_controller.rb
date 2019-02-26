# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # UsersController
  class UsersController < BaseController
    @instance = UsersController.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Remove a user from the organization.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [Long] user_id Required parameter: ID of the user.
    # @return void response from the API call
    def delete_user_by_id(access_token,
                          user_id)
      # Prepare query url.
      _path_url = '/users/{userId}'
      _path_url = APIHelper.append_url_with_template_parameters(
        _path_url,
        'userId' => user_id
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

    # Get a user.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [Long] user_id Required parameter: ID of the user.
    # @return User response from the API call
    def get_user_by_id(access_token,
                       user_id)
      # Prepare query url.
      _path_url = '/users/{userId}'
      _path_url = APIHelper.append_url_with_template_parameters(
        _path_url,
        'userId' => user_id
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
      User.from_hash(decoded)
    end

    # List all users in the organization.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @return List of User response from the API call
    def list_users(access_token)
      # Prepare query url.
      _path_url = '/users'
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
      decoded.map { |element| User.from_hash(element) }
    end

    # Get all roles in the organization.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @return List of UserRole response from the API call
    def list_user_roles(access_token)
      # Prepare query url.
      _path_url = '/user_roles'
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
      decoded.map { |element| UserRole.from_hash(element) }
    end
  end
end
