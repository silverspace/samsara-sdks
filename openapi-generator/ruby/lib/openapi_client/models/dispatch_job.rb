=begin
#Samsara API

## Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.0-SNAPSHOT

=end

require 'date'

module OpenapiClient
  class DispatchJob
    # The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
    attr_accessor :destination_address

    # ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
    attr_accessor :destination_address_id

    # Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    attr_accessor :destination_lat

    # Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    attr_accessor :destination_lng

    # The name of the job destination. If provided, it will take precedence over the name of the address book entry.
    attr_accessor :destination_name

    # Notes regarding the details of this job.
    attr_accessor :notes

    # The time at which the assigned driver is scheduled to arrive at the job destination.
    attr_accessor :scheduled_arrival_time_ms

    # The time at which the assigned driver is scheduled to depart from the job destination.
    attr_accessor :scheduled_departure_time_ms

    # The time at which the driver arrived at the job destination.
    attr_accessor :arrived_at_ms

    # The time at which the job was marked complete (e.g. started driving to the next destination).
    attr_accessor :completed_at_ms

    # ID of the route that this job belongs to.
    attr_accessor :dispatch_route_id

    # ID of the driver assigned to the dispatch job.
    attr_accessor :driver_id

    # The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
    attr_accessor :en_route_at_ms

    # The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
    attr_accessor :estimated_arrival_ms

    # Fleet viewer url of the dispatch job.
    attr_accessor :fleet_viewer_url

    attr_accessor :group_id

    # ID of the Samsara dispatch job.
    attr_accessor :id

    attr_accessor :job_state

    # The time at which the job was marked skipped.
    attr_accessor :skipped_at_ms

    # ID of the vehicle used for the dispatch job.
    attr_accessor :vehicle_id

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'destination_address' => :'destination_address',
        :'destination_address_id' => :'destination_address_id',
        :'destination_lat' => :'destination_lat',
        :'destination_lng' => :'destination_lng',
        :'destination_name' => :'destination_name',
        :'notes' => :'notes',
        :'scheduled_arrival_time_ms' => :'scheduled_arrival_time_ms',
        :'scheduled_departure_time_ms' => :'scheduled_departure_time_ms',
        :'arrived_at_ms' => :'arrived_at_ms',
        :'completed_at_ms' => :'completed_at_ms',
        :'dispatch_route_id' => :'dispatch_route_id',
        :'driver_id' => :'driver_id',
        :'en_route_at_ms' => :'en_route_at_ms',
        :'estimated_arrival_ms' => :'estimated_arrival_ms',
        :'fleet_viewer_url' => :'fleet_viewer_url',
        :'group_id' => :'group_id',
        :'id' => :'id',
        :'job_state' => :'job_state',
        :'skipped_at_ms' => :'skipped_at_ms',
        :'vehicle_id' => :'vehicle_id'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'destination_address' => :'String',
        :'destination_address_id' => :'Integer',
        :'destination_lat' => :'Float',
        :'destination_lng' => :'Float',
        :'destination_name' => :'String',
        :'notes' => :'String',
        :'scheduled_arrival_time_ms' => :'Integer',
        :'scheduled_departure_time_ms' => :'Integer',
        :'arrived_at_ms' => :'Integer',
        :'completed_at_ms' => :'Integer',
        :'dispatch_route_id' => :'Integer',
        :'driver_id' => :'Integer',
        :'en_route_at_ms' => :'Integer',
        :'estimated_arrival_ms' => :'Integer',
        :'fleet_viewer_url' => :'String',
        :'group_id' => :'Integer',
        :'id' => :'Integer',
        :'job_state' => :'JobStatus',
        :'skipped_at_ms' => :'Integer',
        :'vehicle_id' => :'Integer'
      }
    end

    # List of class defined in allOf (OpenAPI v3)
    def self.openapi_all_of
      [
      :'DispatchJobCreate'
      ]
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::DispatchJob` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::DispatchJob`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'destination_address')
        self.destination_address = attributes[:'destination_address']
      end

      if attributes.key?(:'destination_address_id')
        self.destination_address_id = attributes[:'destination_address_id']
      end

      if attributes.key?(:'destination_lat')
        self.destination_lat = attributes[:'destination_lat']
      end

      if attributes.key?(:'destination_lng')
        self.destination_lng = attributes[:'destination_lng']
      end

      if attributes.key?(:'destination_name')
        self.destination_name = attributes[:'destination_name']
      end

      if attributes.key?(:'notes')
        self.notes = attributes[:'notes']
      end

      if attributes.key?(:'scheduled_arrival_time_ms')
        self.scheduled_arrival_time_ms = attributes[:'scheduled_arrival_time_ms']
      end

      if attributes.key?(:'scheduled_departure_time_ms')
        self.scheduled_departure_time_ms = attributes[:'scheduled_departure_time_ms']
      end

      if attributes.key?(:'arrived_at_ms')
        self.arrived_at_ms = attributes[:'arrived_at_ms']
      end

      if attributes.key?(:'completed_at_ms')
        self.completed_at_ms = attributes[:'completed_at_ms']
      end

      if attributes.key?(:'dispatch_route_id')
        self.dispatch_route_id = attributes[:'dispatch_route_id']
      end

      if attributes.key?(:'driver_id')
        self.driver_id = attributes[:'driver_id']
      end

      if attributes.key?(:'en_route_at_ms')
        self.en_route_at_ms = attributes[:'en_route_at_ms']
      end

      if attributes.key?(:'estimated_arrival_ms')
        self.estimated_arrival_ms = attributes[:'estimated_arrival_ms']
      end

      if attributes.key?(:'fleet_viewer_url')
        self.fleet_viewer_url = attributes[:'fleet_viewer_url']
      end

      if attributes.key?(:'group_id')
        self.group_id = attributes[:'group_id']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'job_state')
        self.job_state = attributes[:'job_state']
      end

      if attributes.key?(:'skipped_at_ms')
        self.skipped_at_ms = attributes[:'skipped_at_ms']
      end

      if attributes.key?(:'vehicle_id')
        self.vehicle_id = attributes[:'vehicle_id']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @scheduled_arrival_time_ms.nil?
        invalid_properties.push('invalid value for "scheduled_arrival_time_ms", scheduled_arrival_time_ms cannot be nil.')
      end

      if @dispatch_route_id.nil?
        invalid_properties.push('invalid value for "dispatch_route_id", dispatch_route_id cannot be nil.')
      end

      if @group_id.nil?
        invalid_properties.push('invalid value for "group_id", group_id cannot be nil.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      if @job_state.nil?
        invalid_properties.push('invalid value for "job_state", job_state cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @scheduled_arrival_time_ms.nil?
      return false if @dispatch_route_id.nil?
      return false if @group_id.nil?
      return false if @id.nil?
      return false if @job_state.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          destination_address == o.destination_address &&
          destination_address_id == o.destination_address_id &&
          destination_lat == o.destination_lat &&
          destination_lng == o.destination_lng &&
          destination_name == o.destination_name &&
          notes == o.notes &&
          scheduled_arrival_time_ms == o.scheduled_arrival_time_ms &&
          scheduled_departure_time_ms == o.scheduled_departure_time_ms &&
          arrived_at_ms == o.arrived_at_ms &&
          completed_at_ms == o.completed_at_ms &&
          dispatch_route_id == o.dispatch_route_id &&
          driver_id == o.driver_id &&
          en_route_at_ms == o.en_route_at_ms &&
          estimated_arrival_ms == o.estimated_arrival_ms &&
          fleet_viewer_url == o.fleet_viewer_url &&
          group_id == o.group_id &&
          id == o.id &&
          job_state == o.job_state &&
          skipped_at_ms == o.skipped_at_ms &&
          vehicle_id == o.vehicle_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [destination_address, destination_address_id, destination_lat, destination_lng, destination_name, notes, scheduled_arrival_time_ms, scheduled_departure_time_ms, arrived_at_ms, completed_at_ms, dispatch_route_id, driver_id, en_route_at_ms, estimated_arrival_ms, fleet_viewer_url, group_id, id, job_state, skipped_at_ms, vehicle_id].hash
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
