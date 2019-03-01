<?php
/**
 * DispatchJob
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.0.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * DispatchJob Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class DispatchJob implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'DispatchJob';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'destination_address' => 'string',
        'destination_address_id' => 'int',
        'destination_lat' => 'double',
        'destination_lng' => 'double',
        'destination_name' => 'string',
        'notes' => 'string',
        'scheduled_arrival_time_ms' => 'int',
        'scheduled_departure_time_ms' => 'int',
        'arrived_at_ms' => 'int',
        'completed_at_ms' => 'int',
        'dispatch_route_id' => 'int',
        'driver_id' => 'int',
        'en_route_at_ms' => 'int',
        'estimated_arrival_ms' => 'int',
        'fleet_viewer_url' => 'string',
        'group_id' => 'int',
        'id' => 'int',
        'job_state' => '\OpenAPI\Client\Model\JobStatus',
        'skipped_at_ms' => 'int',
        'vehicle_id' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'destination_address' => null,
        'destination_address_id' => 'int64',
        'destination_lat' => 'double',
        'destination_lng' => 'double',
        'destination_name' => null,
        'notes' => null,
        'scheduled_arrival_time_ms' => 'int64',
        'scheduled_departure_time_ms' => 'int64',
        'arrived_at_ms' => 'int64',
        'completed_at_ms' => 'int64',
        'dispatch_route_id' => 'int64',
        'driver_id' => 'int64',
        'en_route_at_ms' => 'int64',
        'estimated_arrival_ms' => 'int64',
        'fleet_viewer_url' => null,
        'group_id' => 'int64',
        'id' => 'int64',
        'job_state' => null,
        'skipped_at_ms' => 'int64',
        'vehicle_id' => 'int64'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'destination_address' => 'destination_address',
        'destination_address_id' => 'destination_address_id',
        'destination_lat' => 'destination_lat',
        'destination_lng' => 'destination_lng',
        'destination_name' => 'destination_name',
        'notes' => 'notes',
        'scheduled_arrival_time_ms' => 'scheduled_arrival_time_ms',
        'scheduled_departure_time_ms' => 'scheduled_departure_time_ms',
        'arrived_at_ms' => 'arrived_at_ms',
        'completed_at_ms' => 'completed_at_ms',
        'dispatch_route_id' => 'dispatch_route_id',
        'driver_id' => 'driver_id',
        'en_route_at_ms' => 'en_route_at_ms',
        'estimated_arrival_ms' => 'estimated_arrival_ms',
        'fleet_viewer_url' => 'fleet_viewer_url',
        'group_id' => 'group_id',
        'id' => 'id',
        'job_state' => 'job_state',
        'skipped_at_ms' => 'skipped_at_ms',
        'vehicle_id' => 'vehicle_id'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'destination_address' => 'setDestinationAddress',
        'destination_address_id' => 'setDestinationAddressId',
        'destination_lat' => 'setDestinationLat',
        'destination_lng' => 'setDestinationLng',
        'destination_name' => 'setDestinationName',
        'notes' => 'setNotes',
        'scheduled_arrival_time_ms' => 'setScheduledArrivalTimeMs',
        'scheduled_departure_time_ms' => 'setScheduledDepartureTimeMs',
        'arrived_at_ms' => 'setArrivedAtMs',
        'completed_at_ms' => 'setCompletedAtMs',
        'dispatch_route_id' => 'setDispatchRouteId',
        'driver_id' => 'setDriverId',
        'en_route_at_ms' => 'setEnRouteAtMs',
        'estimated_arrival_ms' => 'setEstimatedArrivalMs',
        'fleet_viewer_url' => 'setFleetViewerUrl',
        'group_id' => 'setGroupId',
        'id' => 'setId',
        'job_state' => 'setJobState',
        'skipped_at_ms' => 'setSkippedAtMs',
        'vehicle_id' => 'setVehicleId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'destination_address' => 'getDestinationAddress',
        'destination_address_id' => 'getDestinationAddressId',
        'destination_lat' => 'getDestinationLat',
        'destination_lng' => 'getDestinationLng',
        'destination_name' => 'getDestinationName',
        'notes' => 'getNotes',
        'scheduled_arrival_time_ms' => 'getScheduledArrivalTimeMs',
        'scheduled_departure_time_ms' => 'getScheduledDepartureTimeMs',
        'arrived_at_ms' => 'getArrivedAtMs',
        'completed_at_ms' => 'getCompletedAtMs',
        'dispatch_route_id' => 'getDispatchRouteId',
        'driver_id' => 'getDriverId',
        'en_route_at_ms' => 'getEnRouteAtMs',
        'estimated_arrival_ms' => 'getEstimatedArrivalMs',
        'fleet_viewer_url' => 'getFleetViewerUrl',
        'group_id' => 'getGroupId',
        'id' => 'getId',
        'job_state' => 'getJobState',
        'skipped_at_ms' => 'getSkippedAtMs',
        'vehicle_id' => 'getVehicleId'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['destination_address'] = isset($data['destination_address']) ? $data['destination_address'] : null;
        $this->container['destination_address_id'] = isset($data['destination_address_id']) ? $data['destination_address_id'] : null;
        $this->container['destination_lat'] = isset($data['destination_lat']) ? $data['destination_lat'] : null;
        $this->container['destination_lng'] = isset($data['destination_lng']) ? $data['destination_lng'] : null;
        $this->container['destination_name'] = isset($data['destination_name']) ? $data['destination_name'] : null;
        $this->container['notes'] = isset($data['notes']) ? $data['notes'] : null;
        $this->container['scheduled_arrival_time_ms'] = isset($data['scheduled_arrival_time_ms']) ? $data['scheduled_arrival_time_ms'] : null;
        $this->container['scheduled_departure_time_ms'] = isset($data['scheduled_departure_time_ms']) ? $data['scheduled_departure_time_ms'] : null;
        $this->container['arrived_at_ms'] = isset($data['arrived_at_ms']) ? $data['arrived_at_ms'] : null;
        $this->container['completed_at_ms'] = isset($data['completed_at_ms']) ? $data['completed_at_ms'] : null;
        $this->container['dispatch_route_id'] = isset($data['dispatch_route_id']) ? $data['dispatch_route_id'] : null;
        $this->container['driver_id'] = isset($data['driver_id']) ? $data['driver_id'] : null;
        $this->container['en_route_at_ms'] = isset($data['en_route_at_ms']) ? $data['en_route_at_ms'] : null;
        $this->container['estimated_arrival_ms'] = isset($data['estimated_arrival_ms']) ? $data['estimated_arrival_ms'] : null;
        $this->container['fleet_viewer_url'] = isset($data['fleet_viewer_url']) ? $data['fleet_viewer_url'] : null;
        $this->container['group_id'] = isset($data['group_id']) ? $data['group_id'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['job_state'] = isset($data['job_state']) ? $data['job_state'] : null;
        $this->container['skipped_at_ms'] = isset($data['skipped_at_ms']) ? $data['skipped_at_ms'] : null;
        $this->container['vehicle_id'] = isset($data['vehicle_id']) ? $data['vehicle_id'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['scheduled_arrival_time_ms'] === null) {
            $invalidProperties[] = "'scheduled_arrival_time_ms' can't be null";
        }
        if ($this->container['dispatch_route_id'] === null) {
            $invalidProperties[] = "'dispatch_route_id' can't be null";
        }
        if ($this->container['group_id'] === null) {
            $invalidProperties[] = "'group_id' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['job_state'] === null) {
            $invalidProperties[] = "'job_state' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets destination_address
     *
     * @return string|null
     */
    public function getDestinationAddress()
    {
        return $this->container['destination_address'];
    }

    /**
     * Sets destination_address
     *
     * @param string|null $destination_address The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     *
     * @return $this
     */
    public function setDestinationAddress($destination_address)
    {
        $this->container['destination_address'] = $destination_address;

        return $this;
    }

    /**
     * Gets destination_address_id
     *
     * @return int|null
     */
    public function getDestinationAddressId()
    {
        return $this->container['destination_address_id'];
    }

    /**
     * Sets destination_address_id
     *
     * @param int|null $destination_address_id ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     *
     * @return $this
     */
    public function setDestinationAddressId($destination_address_id)
    {
        $this->container['destination_address_id'] = $destination_address_id;

        return $this;
    }

    /**
     * Gets destination_lat
     *
     * @return double|null
     */
    public function getDestinationLat()
    {
        return $this->container['destination_lat'];
    }

    /**
     * Sets destination_lat
     *
     * @param double|null $destination_lat Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     *
     * @return $this
     */
    public function setDestinationLat($destination_lat)
    {
        $this->container['destination_lat'] = $destination_lat;

        return $this;
    }

    /**
     * Gets destination_lng
     *
     * @return double|null
     */
    public function getDestinationLng()
    {
        return $this->container['destination_lng'];
    }

    /**
     * Sets destination_lng
     *
     * @param double|null $destination_lng Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     *
     * @return $this
     */
    public function setDestinationLng($destination_lng)
    {
        $this->container['destination_lng'] = $destination_lng;

        return $this;
    }

    /**
     * Gets destination_name
     *
     * @return string|null
     */
    public function getDestinationName()
    {
        return $this->container['destination_name'];
    }

    /**
     * Sets destination_name
     *
     * @param string|null $destination_name The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     *
     * @return $this
     */
    public function setDestinationName($destination_name)
    {
        $this->container['destination_name'] = $destination_name;

        return $this;
    }

    /**
     * Gets notes
     *
     * @return string|null
     */
    public function getNotes()
    {
        return $this->container['notes'];
    }

    /**
     * Sets notes
     *
     * @param string|null $notes Notes regarding the details of this job.
     *
     * @return $this
     */
    public function setNotes($notes)
    {
        $this->container['notes'] = $notes;

        return $this;
    }

    /**
     * Gets scheduled_arrival_time_ms
     *
     * @return int
     */
    public function getScheduledArrivalTimeMs()
    {
        return $this->container['scheduled_arrival_time_ms'];
    }

    /**
     * Sets scheduled_arrival_time_ms
     *
     * @param int $scheduled_arrival_time_ms The time at which the assigned driver is scheduled to arrive at the job destination.
     *
     * @return $this
     */
    public function setScheduledArrivalTimeMs($scheduled_arrival_time_ms)
    {
        $this->container['scheduled_arrival_time_ms'] = $scheduled_arrival_time_ms;

        return $this;
    }

    /**
     * Gets scheduled_departure_time_ms
     *
     * @return int|null
     */
    public function getScheduledDepartureTimeMs()
    {
        return $this->container['scheduled_departure_time_ms'];
    }

    /**
     * Sets scheduled_departure_time_ms
     *
     * @param int|null $scheduled_departure_time_ms The time at which the assigned driver is scheduled to depart from the job destination.
     *
     * @return $this
     */
    public function setScheduledDepartureTimeMs($scheduled_departure_time_ms)
    {
        $this->container['scheduled_departure_time_ms'] = $scheduled_departure_time_ms;

        return $this;
    }

    /**
     * Gets arrived_at_ms
     *
     * @return int|null
     */
    public function getArrivedAtMs()
    {
        return $this->container['arrived_at_ms'];
    }

    /**
     * Sets arrived_at_ms
     *
     * @param int|null $arrived_at_ms The time at which the driver arrived at the job destination.
     *
     * @return $this
     */
    public function setArrivedAtMs($arrived_at_ms)
    {
        $this->container['arrived_at_ms'] = $arrived_at_ms;

        return $this;
    }

    /**
     * Gets completed_at_ms
     *
     * @return int|null
     */
    public function getCompletedAtMs()
    {
        return $this->container['completed_at_ms'];
    }

    /**
     * Sets completed_at_ms
     *
     * @param int|null $completed_at_ms The time at which the job was marked complete (e.g. started driving to the next destination).
     *
     * @return $this
     */
    public function setCompletedAtMs($completed_at_ms)
    {
        $this->container['completed_at_ms'] = $completed_at_ms;

        return $this;
    }

    /**
     * Gets dispatch_route_id
     *
     * @return int
     */
    public function getDispatchRouteId()
    {
        return $this->container['dispatch_route_id'];
    }

    /**
     * Sets dispatch_route_id
     *
     * @param int $dispatch_route_id ID of the route that this job belongs to.
     *
     * @return $this
     */
    public function setDispatchRouteId($dispatch_route_id)
    {
        $this->container['dispatch_route_id'] = $dispatch_route_id;

        return $this;
    }

    /**
     * Gets driver_id
     *
     * @return int|null
     */
    public function getDriverId()
    {
        return $this->container['driver_id'];
    }

    /**
     * Sets driver_id
     *
     * @param int|null $driver_id ID of the driver assigned to the dispatch job.
     *
     * @return $this
     */
    public function setDriverId($driver_id)
    {
        $this->container['driver_id'] = $driver_id;

        return $this;
    }

    /**
     * Gets en_route_at_ms
     *
     * @return int|null
     */
    public function getEnRouteAtMs()
    {
        return $this->container['en_route_at_ms'];
    }

    /**
     * Sets en_route_at_ms
     *
     * @param int|null $en_route_at_ms The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     *
     * @return $this
     */
    public function setEnRouteAtMs($en_route_at_ms)
    {
        $this->container['en_route_at_ms'] = $en_route_at_ms;

        return $this;
    }

    /**
     * Gets estimated_arrival_ms
     *
     * @return int|null
     */
    public function getEstimatedArrivalMs()
    {
        return $this->container['estimated_arrival_ms'];
    }

    /**
     * Sets estimated_arrival_ms
     *
     * @param int|null $estimated_arrival_ms The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     *
     * @return $this
     */
    public function setEstimatedArrivalMs($estimated_arrival_ms)
    {
        $this->container['estimated_arrival_ms'] = $estimated_arrival_ms;

        return $this;
    }

    /**
     * Gets fleet_viewer_url
     *
     * @return string|null
     */
    public function getFleetViewerUrl()
    {
        return $this->container['fleet_viewer_url'];
    }

    /**
     * Sets fleet_viewer_url
     *
     * @param string|null $fleet_viewer_url Fleet viewer url of the dispatch job.
     *
     * @return $this
     */
    public function setFleetViewerUrl($fleet_viewer_url)
    {
        $this->container['fleet_viewer_url'] = $fleet_viewer_url;

        return $this;
    }

    /**
     * Gets group_id
     *
     * @return int
     */
    public function getGroupId()
    {
        return $this->container['group_id'];
    }

    /**
     * Sets group_id
     *
     * @param int $group_id group_id
     *
     * @return $this
     */
    public function setGroupId($group_id)
    {
        $this->container['group_id'] = $group_id;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int $id ID of the Samsara dispatch job.
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets job_state
     *
     * @return \OpenAPI\Client\Model\JobStatus
     */
    public function getJobState()
    {
        return $this->container['job_state'];
    }

    /**
     * Sets job_state
     *
     * @param \OpenAPI\Client\Model\JobStatus $job_state job_state
     *
     * @return $this
     */
    public function setJobState($job_state)
    {
        $this->container['job_state'] = $job_state;

        return $this;
    }

    /**
     * Gets skipped_at_ms
     *
     * @return int|null
     */
    public function getSkippedAtMs()
    {
        return $this->container['skipped_at_ms'];
    }

    /**
     * Sets skipped_at_ms
     *
     * @param int|null $skipped_at_ms The time at which the job was marked skipped.
     *
     * @return $this
     */
    public function setSkippedAtMs($skipped_at_ms)
    {
        $this->container['skipped_at_ms'] = $skipped_at_ms;

        return $this;
    }

    /**
     * Gets vehicle_id
     *
     * @return int|null
     */
    public function getVehicleId()
    {
        return $this->container['vehicle_id'];
    }

    /**
     * Sets vehicle_id
     *
     * @param int|null $vehicle_id ID of the vehicle used for the dispatch job.
     *
     * @return $this
     */
    public function setVehicleId($vehicle_id)
    {
        $this->container['vehicle_id'] = $vehicle_id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }
}


