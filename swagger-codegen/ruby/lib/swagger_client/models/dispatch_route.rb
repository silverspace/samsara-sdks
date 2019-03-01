=begin
#Samsara API

## Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.3-SNAPSHOT

=end

require 'date'

module SwaggerClient
  class DispatchRoute
    # The time in Unix epoch milliseconds that the route actually ended.
    attr_accessor :actual_end_ms

    # The time in Unix epoch milliseconds that the route actually started.
    attr_accessor :actual_start_ms

    # ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    attr_accessor :driver_id

    # ID of the group if the organization has multiple groups (optional).
    attr_accessor :group_id

    # Descriptive name of this route.
    attr_accessor :name

    # The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    attr_accessor :scheduled_end_ms

    # The distance expected to be traveled for this route in meters.
    attr_accessor :scheduled_meters

    # The time in Unix epoch milliseconds that the route is scheduled to start.
    attr_accessor :scheduled_start_ms

    # The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    attr_accessor :start_location_address

    # ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    attr_accessor :start_location_address_id

    # Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    attr_accessor :start_location_lat

    # Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    attr_accessor :start_location_lng

    # The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    attr_accessor :start_location_name

    # ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    attr_accessor :trailer_id

    # ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    attr_accessor :vehicle_id

    # The dispatch jobs associated with this route.
    attr_accessor :dispatch_jobs

    # ID of the Samsara dispatch route.
    attr_accessor :id

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'actual_end_ms' => :'actual_end_ms',
        :'actual_start_ms' => :'actual_start_ms',
        :'driver_id' => :'driver_id',
        :'group_id' => :'group_id',
        :'name' => :'name',
        :'scheduled_end_ms' => :'scheduled_end_ms',
        :'scheduled_meters' => :'scheduled_meters',
        :'scheduled_start_ms' => :'scheduled_start_ms',
        :'start_location_address' => :'start_location_address',
        :'start_location_address_id' => :'start_location_address_id',
        :'start_location_lat' => :'start_location_lat',
        :'start_location_lng' => :'start_location_lng',
        :'start_location_name' => :'start_location_name',
        :'trailer_id' => :'trailer_id',
        :'vehicle_id' => :'vehicle_id',
        :'dispatch_jobs' => :'dispatch_jobs',
        :'id' => :'id'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'actual_end_ms' => :'Integer',
        :'actual_start_ms' => :'Integer',
        :'driver_id' => :'Integer',
        :'group_id' => :'Integer',
        :'name' => :'String',
        :'scheduled_end_ms' => :'Integer',
        :'scheduled_meters' => :'Integer',
        :'scheduled_start_ms' => :'Integer',
        :'start_location_address' => :'String',
        :'start_location_address_id' => :'Integer',
        :'start_location_lat' => :'Float',
        :'start_location_lng' => :'Float',
        :'start_location_name' => :'String',
        :'trailer_id' => :'Integer',
        :'vehicle_id' => :'Integer',
        :'dispatch_jobs' => :'Array<DispatchJob>',
        :'id' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'actual_end_ms')
        self.actual_end_ms = attributes[:'actual_end_ms']
      end

      if attributes.has_key?(:'actual_start_ms')
        self.actual_start_ms = attributes[:'actual_start_ms']
      end

      if attributes.has_key?(:'driver_id')
        self.driver_id = attributes[:'driver_id']
      end

      if attributes.has_key?(:'group_id')
        self.group_id = attributes[:'group_id']
      end

      if attributes.has_key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.has_key?(:'scheduled_end_ms')
        self.scheduled_end_ms = attributes[:'scheduled_end_ms']
      end

      if attributes.has_key?(:'scheduled_meters')
        self.scheduled_meters = attributes[:'scheduled_meters']
      end

      if attributes.has_key?(:'scheduled_start_ms')
        self.scheduled_start_ms = attributes[:'scheduled_start_ms']
      end

      if attributes.has_key?(:'start_location_address')
        self.start_location_address = attributes[:'start_location_address']
      end

      if attributes.has_key?(:'start_location_address_id')
        self.start_location_address_id = attributes[:'start_location_address_id']
      end

      if attributes.has_key?(:'start_location_lat')
        self.start_location_lat = attributes[:'start_location_lat']
      end

      if attributes.has_key?(:'start_location_lng')
        self.start_location_lng = attributes[:'start_location_lng']
      end

      if attributes.has_key?(:'start_location_name')
        self.start_location_name = attributes[:'start_location_name']
      end

      if attributes.has_key?(:'trailer_id')
        self.trailer_id = attributes[:'trailer_id']
      end

      if attributes.has_key?(:'vehicle_id')
        self.vehicle_id = attributes[:'vehicle_id']
      end

      if attributes.has_key?(:'dispatch_jobs')
        if (value = attributes[:'dispatch_jobs']).is_a?(Array)
          self.dispatch_jobs = value
        end
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @name.nil?
        invalid_properties.push('invalid value for "name", name cannot be nil.')
      end

      if @scheduled_end_ms.nil?
        invalid_properties.push('invalid value for "scheduled_end_ms", scheduled_end_ms cannot be nil.')
      end

      if @scheduled_start_ms.nil?
        invalid_properties.push('invalid value for "scheduled_start_ms", scheduled_start_ms cannot be nil.')
      end

      if @dispatch_jobs.nil?
        invalid_properties.push('invalid value for "dispatch_jobs", dispatch_jobs cannot be nil.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @name.nil?
      return false if @scheduled_end_ms.nil?
      return false if @scheduled_start_ms.nil?
      return false if @dispatch_jobs.nil?
      return false if @id.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          actual_end_ms == o.actual_end_ms &&
          actual_start_ms == o.actual_start_ms &&
          driver_id == o.driver_id &&
          group_id == o.group_id &&
          name == o.name &&
          scheduled_end_ms == o.scheduled_end_ms &&
          scheduled_meters == o.scheduled_meters &&
          scheduled_start_ms == o.scheduled_start_ms &&
          start_location_address == o.start_location_address &&
          start_location_address_id == o.start_location_address_id &&
          start_location_lat == o.start_location_lat &&
          start_location_lng == o.start_location_lng &&
          start_location_name == o.start_location_name &&
          trailer_id == o.trailer_id &&
          vehicle_id == o.vehicle_id &&
          dispatch_jobs == o.dispatch_jobs &&
          id == o.id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [actual_end_ms, actual_start_ms, driver_id, group_id, name, scheduled_end_ms, scheduled_meters, scheduled_start_ms, start_location_address, start_location_address_id, start_location_lat, start_location_lng, start_location_name, trailer_id, vehicle_id, dispatch_jobs, id].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
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
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
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
