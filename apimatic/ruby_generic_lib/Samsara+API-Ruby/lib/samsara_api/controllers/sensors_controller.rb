# samsara_api
#
# This file was automatically generated by APIMATIC v2.0
# ( https://apimatic.io ).

module SamsaraApi
  # SensorsController
  class SensorsController < BaseController
    @instance = SensorsController.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Get temperature for requested sensors. This method returns the current
    # ambient temperature (and probe temperature if applicable) for the
    # requested sensors.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [SensorParam] sensor_param Required parameter: Group ID and list of
    # sensor IDs to query.
    # @return TemperatureResponse response from the API call
    def create_get_sensors_temperature(access_token,
                                       sensor_param)
      # Prepare query url.
      _path_url = '/sensors/temperature'
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
        parameters: sensor_param.to_json
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
      TemperatureResponse.from_hash(decoded)
    end

    # Get sensor objects. This method returns a list of the sensor objects in
    # the Samsara Cloud and information about them.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [GroupParam] group_param Required parameter: Group ID to query.
    # @return GetSensorsResponse response from the API call
    def create_get_sensors(access_token,
                           group_param)
      # Prepare query url.
      _path_url = '/sensors/list'
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
        parameters: group_param.to_json
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
      GetSensorsResponse.from_hash(decoded)
    end

    # Get humidity for requested sensors. This method returns the current
    # relative humidity for the requested sensors.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [SensorParam] sensor_param Required parameter: Group ID and list of
    # sensor IDs to query.
    # @return HumidityResponse response from the API call
    def create_get_sensors_humidity(access_token,
                                    sensor_param)
      # Prepare query url.
      _path_url = '/sensors/humidity'
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
        parameters: sensor_param.to_json
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
      HumidityResponse.from_hash(decoded)
    end

    # Get historical data for specified sensors. This method returns a set of
    # historical data for the specified sensors in the specified time range and
    # at the specified time resolution.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [HistoryParam1] history_param Required parameter: Group ID, time
    # range and resolution, and list of sensor ID, field pairs to query.
    # @return SensorHistoryResponse response from the API call
    def create_get_sensors_history(access_token,
                                   history_param)
      # Prepare query url.
      _path_url = '/sensors/history'
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
        parameters: history_param.to_json
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
      SensorHistoryResponse.from_hash(decoded)
    end

    # Get door monitor status (closed / open) for requested sensors.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [SensorParam] sensor_param Required parameter: Group ID and list of
    # sensor IDs to query.
    # @return DoorResponse response from the API call
    def create_get_sensors_door(access_token,
                                sensor_param)
      # Prepare query url.
      _path_url = '/sensors/door'
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
        parameters: sensor_param.to_json
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
      DoorResponse.from_hash(decoded)
    end

    # Get cargo monitor status (empty / full) for requested sensors.
    # @param [String] access_token Required parameter: Samsara API access
    # token.
    # @param [SensorParam] sensor_param Required parameter: Group ID and list of
    # sensor IDs to query.
    # @return CargoResponse response from the API call
    def create_get_sensors_cargo(access_token,
                                 sensor_param)
      # Prepare query url.
      _path_url = '/sensors/cargo'
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
        parameters: sensor_param.to_json
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
      CargoResponse.from_hash(decoded)
    end
  end
end