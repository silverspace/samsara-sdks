=begin
#Samsara API

## Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.0-SNAPSHOT

=end

require 'date'

module OpenapiClient
  # Safety score details for a driver
  class DriverSafetyScoreResponse
    # Crash event count
    attr_accessor :crash_count

    # Driver ID
    attr_accessor :driver_id

    # Harsh acceleration event count
    attr_accessor :harsh_accel_count

    # Harsh braking event count
    attr_accessor :harsh_braking_count

    attr_accessor :harsh_events

    # Harsh turning event count
    attr_accessor :harsh_turning_count

    # Safety Score
    attr_accessor :safety_score

    # Safety Score Rank
    attr_accessor :safety_score_rank

    # Amount of time driven over the speed limit in milliseconds
    attr_accessor :time_over_speed_limit_ms

    # Total distance driven in meters
    attr_accessor :total_distance_driven_meters

    # Total harsh event count
    attr_accessor :total_harsh_event_count

    # Amount of time driven in milliseconds
    attr_accessor :total_time_driven_ms

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'crash_count' => :'crashCount',
        :'driver_id' => :'driverId',
        :'harsh_accel_count' => :'harshAccelCount',
        :'harsh_braking_count' => :'harshBrakingCount',
        :'harsh_events' => :'harshEvents',
        :'harsh_turning_count' => :'harshTurningCount',
        :'safety_score' => :'safetyScore',
        :'safety_score_rank' => :'safetyScoreRank',
        :'time_over_speed_limit_ms' => :'timeOverSpeedLimitMs',
        :'total_distance_driven_meters' => :'totalDistanceDrivenMeters',
        :'total_harsh_event_count' => :'totalHarshEventCount',
        :'total_time_driven_ms' => :'totalTimeDrivenMs'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'crash_count' => :'Integer',
        :'driver_id' => :'Integer',
        :'harsh_accel_count' => :'Integer',
        :'harsh_braking_count' => :'Integer',
        :'harsh_events' => :'Array<SafetyReportHarshEvent>',
        :'harsh_turning_count' => :'Integer',
        :'safety_score' => :'Integer',
        :'safety_score_rank' => :'String',
        :'time_over_speed_limit_ms' => :'Integer',
        :'total_distance_driven_meters' => :'Integer',
        :'total_harsh_event_count' => :'Integer',
        :'total_time_driven_ms' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::DriverSafetyScoreResponse` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::DriverSafetyScoreResponse`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'crash_count')
        self.crash_count = attributes[:'crash_count']
      end

      if attributes.key?(:'driver_id')
        self.driver_id = attributes[:'driver_id']
      end

      if attributes.key?(:'harsh_accel_count')
        self.harsh_accel_count = attributes[:'harsh_accel_count']
      end

      if attributes.key?(:'harsh_braking_count')
        self.harsh_braking_count = attributes[:'harsh_braking_count']
      end

      if attributes.key?(:'harsh_events')
        if (value = attributes[:'harsh_events']).is_a?(Array)
          self.harsh_events = value
        end
      end

      if attributes.key?(:'harsh_turning_count')
        self.harsh_turning_count = attributes[:'harsh_turning_count']
      end

      if attributes.key?(:'safety_score')
        self.safety_score = attributes[:'safety_score']
      end

      if attributes.key?(:'safety_score_rank')
        self.safety_score_rank = attributes[:'safety_score_rank']
      end

      if attributes.key?(:'time_over_speed_limit_ms')
        self.time_over_speed_limit_ms = attributes[:'time_over_speed_limit_ms']
      end

      if attributes.key?(:'total_distance_driven_meters')
        self.total_distance_driven_meters = attributes[:'total_distance_driven_meters']
      end

      if attributes.key?(:'total_harsh_event_count')
        self.total_harsh_event_count = attributes[:'total_harsh_event_count']
      end

      if attributes.key?(:'total_time_driven_ms')
        self.total_time_driven_ms = attributes[:'total_time_driven_ms']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          crash_count == o.crash_count &&
          driver_id == o.driver_id &&
          harsh_accel_count == o.harsh_accel_count &&
          harsh_braking_count == o.harsh_braking_count &&
          harsh_events == o.harsh_events &&
          harsh_turning_count == o.harsh_turning_count &&
          safety_score == o.safety_score &&
          safety_score_rank == o.safety_score_rank &&
          time_over_speed_limit_ms == o.time_over_speed_limit_ms &&
          total_distance_driven_meters == o.total_distance_driven_meters &&
          total_harsh_event_count == o.total_harsh_event_count &&
          total_time_driven_ms == o.total_time_driven_ms
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [crash_count, driver_id, harsh_accel_count, harsh_braking_count, harsh_events, harsh_turning_count, safety_score, safety_score_rank, time_over_speed_limit_ms, total_distance_driven_meters, total_harsh_event_count, total_time_driven_ms].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        OpenapiClient.const_get(type).build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end
  end
end
