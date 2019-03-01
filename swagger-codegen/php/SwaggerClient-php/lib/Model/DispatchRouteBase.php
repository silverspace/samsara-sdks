<?php
/**
 * DispatchRouteBase
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.3-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * DispatchRouteBase Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class DispatchRouteBase implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'DispatchRouteBase';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'actual_end_ms' => 'int',
        'actual_start_ms' => 'int',
        'driver_id' => 'int',
        'group_id' => 'int',
        'name' => 'string',
        'scheduled_end_ms' => 'int',
        'scheduled_meters' => 'int',
        'scheduled_start_ms' => 'int',
        'start_location_address' => 'string',
        'start_location_address_id' => 'int',
        'start_location_lat' => 'double',
        'start_location_lng' => 'double',
        'start_location_name' => 'string',
        'trailer_id' => 'int',
        'vehicle_id' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'actual_end_ms' => 'int64',
        'actual_start_ms' => 'int64',
        'driver_id' => 'int64',
        'group_id' => 'int64',
        'name' => null,
        'scheduled_end_ms' => 'int64',
        'scheduled_meters' => 'int64',
        'scheduled_start_ms' => 'int64',
        'start_location_address' => null,
        'start_location_address_id' => 'int64',
        'start_location_lat' => 'double',
        'start_location_lng' => 'double',
        'start_location_name' => null,
        'trailer_id' => 'int64',
        'vehicle_id' => 'int64'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'actual_end_ms' => 'actual_end_ms',
        'actual_start_ms' => 'actual_start_ms',
        'driver_id' => 'driver_id',
        'group_id' => 'group_id',
        'name' => 'name',
        'scheduled_end_ms' => 'scheduled_end_ms',
        'scheduled_meters' => 'scheduled_meters',
        'scheduled_start_ms' => 'scheduled_start_ms',
        'start_location_address' => 'start_location_address',
        'start_location_address_id' => 'start_location_address_id',
        'start_location_lat' => 'start_location_lat',
        'start_location_lng' => 'start_location_lng',
        'start_location_name' => 'start_location_name',
        'trailer_id' => 'trailer_id',
        'vehicle_id' => 'vehicle_id'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'actual_end_ms' => 'setActualEndMs',
        'actual_start_ms' => 'setActualStartMs',
        'driver_id' => 'setDriverId',
        'group_id' => 'setGroupId',
        'name' => 'setName',
        'scheduled_end_ms' => 'setScheduledEndMs',
        'scheduled_meters' => 'setScheduledMeters',
        'scheduled_start_ms' => 'setScheduledStartMs',
        'start_location_address' => 'setStartLocationAddress',
        'start_location_address_id' => 'setStartLocationAddressId',
        'start_location_lat' => 'setStartLocationLat',
        'start_location_lng' => 'setStartLocationLng',
        'start_location_name' => 'setStartLocationName',
        'trailer_id' => 'setTrailerId',
        'vehicle_id' => 'setVehicleId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'actual_end_ms' => 'getActualEndMs',
        'actual_start_ms' => 'getActualStartMs',
        'driver_id' => 'getDriverId',
        'group_id' => 'getGroupId',
        'name' => 'getName',
        'scheduled_end_ms' => 'getScheduledEndMs',
        'scheduled_meters' => 'getScheduledMeters',
        'scheduled_start_ms' => 'getScheduledStartMs',
        'start_location_address' => 'getStartLocationAddress',
        'start_location_address_id' => 'getStartLocationAddressId',
        'start_location_lat' => 'getStartLocationLat',
        'start_location_lng' => 'getStartLocationLng',
        'start_location_name' => 'getStartLocationName',
        'trailer_id' => 'getTrailerId',
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
        return self::$swaggerModelName;
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
        $this->container['actual_end_ms'] = isset($data['actual_end_ms']) ? $data['actual_end_ms'] : null;
        $this->container['actual_start_ms'] = isset($data['actual_start_ms']) ? $data['actual_start_ms'] : null;
        $this->container['driver_id'] = isset($data['driver_id']) ? $data['driver_id'] : null;
        $this->container['group_id'] = isset($data['group_id']) ? $data['group_id'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['scheduled_end_ms'] = isset($data['scheduled_end_ms']) ? $data['scheduled_end_ms'] : null;
        $this->container['scheduled_meters'] = isset($data['scheduled_meters']) ? $data['scheduled_meters'] : null;
        $this->container['scheduled_start_ms'] = isset($data['scheduled_start_ms']) ? $data['scheduled_start_ms'] : null;
        $this->container['start_location_address'] = isset($data['start_location_address']) ? $data['start_location_address'] : null;
        $this->container['start_location_address_id'] = isset($data['start_location_address_id']) ? $data['start_location_address_id'] : null;
        $this->container['start_location_lat'] = isset($data['start_location_lat']) ? $data['start_location_lat'] : null;
        $this->container['start_location_lng'] = isset($data['start_location_lng']) ? $data['start_location_lng'] : null;
        $this->container['start_location_name'] = isset($data['start_location_name']) ? $data['start_location_name'] : null;
        $this->container['trailer_id'] = isset($data['trailer_id']) ? $data['trailer_id'] : null;
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

        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['scheduled_end_ms'] === null) {
            $invalidProperties[] = "'scheduled_end_ms' can't be null";
        }
        if ($this->container['scheduled_start_ms'] === null) {
            $invalidProperties[] = "'scheduled_start_ms' can't be null";
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
     * Gets actual_end_ms
     *
     * @return int
     */
    public function getActualEndMs()
    {
        return $this->container['actual_end_ms'];
    }

    /**
     * Sets actual_end_ms
     *
     * @param int $actual_end_ms The time in Unix epoch milliseconds that the route actually ended.
     *
     * @return $this
     */
    public function setActualEndMs($actual_end_ms)
    {
        $this->container['actual_end_ms'] = $actual_end_ms;

        return $this;
    }

    /**
     * Gets actual_start_ms
     *
     * @return int
     */
    public function getActualStartMs()
    {
        return $this->container['actual_start_ms'];
    }

    /**
     * Sets actual_start_ms
     *
     * @param int $actual_start_ms The time in Unix epoch milliseconds that the route actually started.
     *
     * @return $this
     */
    public function setActualStartMs($actual_start_ms)
    {
        $this->container['actual_start_ms'] = $actual_start_ms;

        return $this;
    }

    /**
     * Gets driver_id
     *
     * @return int
     */
    public function getDriverId()
    {
        return $this->container['driver_id'];
    }

    /**
     * Sets driver_id
     *
     * @param int $driver_id ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     *
     * @return $this
     */
    public function setDriverId($driver_id)
    {
        $this->container['driver_id'] = $driver_id;

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
     * @param int $group_id ID of the group if the organization has multiple groups (optional).
     *
     * @return $this
     */
    public function setGroupId($group_id)
    {
        $this->container['group_id'] = $group_id;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name Descriptive name of this route.
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets scheduled_end_ms
     *
     * @return int
     */
    public function getScheduledEndMs()
    {
        return $this->container['scheduled_end_ms'];
    }

    /**
     * Sets scheduled_end_ms
     *
     * @param int $scheduled_end_ms The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     *
     * @return $this
     */
    public function setScheduledEndMs($scheduled_end_ms)
    {
        $this->container['scheduled_end_ms'] = $scheduled_end_ms;

        return $this;
    }

    /**
     * Gets scheduled_meters
     *
     * @return int
     */
    public function getScheduledMeters()
    {
        return $this->container['scheduled_meters'];
    }

    /**
     * Sets scheduled_meters
     *
     * @param int $scheduled_meters The distance expected to be traveled for this route in meters.
     *
     * @return $this
     */
    public function setScheduledMeters($scheduled_meters)
    {
        $this->container['scheduled_meters'] = $scheduled_meters;

        return $this;
    }

    /**
     * Gets scheduled_start_ms
     *
     * @return int
     */
    public function getScheduledStartMs()
    {
        return $this->container['scheduled_start_ms'];
    }

    /**
     * Sets scheduled_start_ms
     *
     * @param int $scheduled_start_ms The time in Unix epoch milliseconds that the route is scheduled to start.
     *
     * @return $this
     */
    public function setScheduledStartMs($scheduled_start_ms)
    {
        $this->container['scheduled_start_ms'] = $scheduled_start_ms;

        return $this;
    }

    /**
     * Gets start_location_address
     *
     * @return string
     */
    public function getStartLocationAddress()
    {
        return $this->container['start_location_address'];
    }

    /**
     * Sets start_location_address
     *
     * @param string $start_location_address The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     *
     * @return $this
     */
    public function setStartLocationAddress($start_location_address)
    {
        $this->container['start_location_address'] = $start_location_address;

        return $this;
    }

    /**
     * Gets start_location_address_id
     *
     * @return int
     */
    public function getStartLocationAddressId()
    {
        return $this->container['start_location_address_id'];
    }

    /**
     * Sets start_location_address_id
     *
     * @param int $start_location_address_id ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     *
     * @return $this
     */
    public function setStartLocationAddressId($start_location_address_id)
    {
        $this->container['start_location_address_id'] = $start_location_address_id;

        return $this;
    }

    /**
     * Gets start_location_lat
     *
     * @return double
     */
    public function getStartLocationLat()
    {
        return $this->container['start_location_lat'];
    }

    /**
     * Sets start_location_lat
     *
     * @param double $start_location_lat Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     *
     * @return $this
     */
    public function setStartLocationLat($start_location_lat)
    {
        $this->container['start_location_lat'] = $start_location_lat;

        return $this;
    }

    /**
     * Gets start_location_lng
     *
     * @return double
     */
    public function getStartLocationLng()
    {
        return $this->container['start_location_lng'];
    }

    /**
     * Sets start_location_lng
     *
     * @param double $start_location_lng Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     *
     * @return $this
     */
    public function setStartLocationLng($start_location_lng)
    {
        $this->container['start_location_lng'] = $start_location_lng;

        return $this;
    }

    /**
     * Gets start_location_name
     *
     * @return string
     */
    public function getStartLocationName()
    {
        return $this->container['start_location_name'];
    }

    /**
     * Sets start_location_name
     *
     * @param string $start_location_name The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
     *
     * @return $this
     */
    public function setStartLocationName($start_location_name)
    {
        $this->container['start_location_name'] = $start_location_name;

        return $this;
    }

    /**
     * Gets trailer_id
     *
     * @return int
     */
    public function getTrailerId()
    {
        return $this->container['trailer_id'];
    }

    /**
     * Sets trailer_id
     *
     * @param int $trailer_id ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     *
     * @return $this
     */
    public function setTrailerId($trailer_id)
    {
        $this->container['trailer_id'] = $trailer_id;

        return $this;
    }

    /**
     * Gets vehicle_id
     *
     * @return int
     */
    public function getVehicleId()
    {
        return $this->container['vehicle_id'];
    }

    /**
     * Sets vehicle_id
     *
     * @param int $vehicle_id ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
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
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


