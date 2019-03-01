<?php
/**
 * HosLogsResponseLogs
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
 * HosLogsResponseLogs Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class HosLogsResponseLogs implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'HosLogsResponse_logs';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'codriver_ids' => 'int[]',
        'driver_id' => 'int',
        'group_id' => 'int',
        'loc_city' => 'string',
        'loc_lat' => 'double',
        'loc_lng' => 'double',
        'loc_name' => 'string',
        'loc_state' => 'string',
        'log_start_ms' => 'int',
        'remark' => 'string',
        'status_type' => 'string',
        'vehicle_id' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'codriver_ids' => 'int64',
        'driver_id' => 'int64',
        'group_id' => 'int64',
        'loc_city' => null,
        'loc_lat' => 'double',
        'loc_lng' => 'double',
        'loc_name' => null,
        'loc_state' => null,
        'log_start_ms' => 'int64',
        'remark' => null,
        'status_type' => null,
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
        'codriver_ids' => 'codriverIds',
        'driver_id' => 'driverId',
        'group_id' => 'groupId',
        'loc_city' => 'locCity',
        'loc_lat' => 'locLat',
        'loc_lng' => 'locLng',
        'loc_name' => 'locName',
        'loc_state' => 'locState',
        'log_start_ms' => 'logStartMs',
        'remark' => 'remark',
        'status_type' => 'statusType',
        'vehicle_id' => 'vehicleId'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'codriver_ids' => 'setCodriverIds',
        'driver_id' => 'setDriverId',
        'group_id' => 'setGroupId',
        'loc_city' => 'setLocCity',
        'loc_lat' => 'setLocLat',
        'loc_lng' => 'setLocLng',
        'loc_name' => 'setLocName',
        'loc_state' => 'setLocState',
        'log_start_ms' => 'setLogStartMs',
        'remark' => 'setRemark',
        'status_type' => 'setStatusType',
        'vehicle_id' => 'setVehicleId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'codriver_ids' => 'getCodriverIds',
        'driver_id' => 'getDriverId',
        'group_id' => 'getGroupId',
        'loc_city' => 'getLocCity',
        'loc_lat' => 'getLocLat',
        'loc_lng' => 'getLocLng',
        'loc_name' => 'getLocName',
        'loc_state' => 'getLocState',
        'log_start_ms' => 'getLogStartMs',
        'remark' => 'getRemark',
        'status_type' => 'getStatusType',
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
        $this->container['codriver_ids'] = isset($data['codriver_ids']) ? $data['codriver_ids'] : null;
        $this->container['driver_id'] = isset($data['driver_id']) ? $data['driver_id'] : null;
        $this->container['group_id'] = isset($data['group_id']) ? $data['group_id'] : null;
        $this->container['loc_city'] = isset($data['loc_city']) ? $data['loc_city'] : null;
        $this->container['loc_lat'] = isset($data['loc_lat']) ? $data['loc_lat'] : null;
        $this->container['loc_lng'] = isset($data['loc_lng']) ? $data['loc_lng'] : null;
        $this->container['loc_name'] = isset($data['loc_name']) ? $data['loc_name'] : null;
        $this->container['loc_state'] = isset($data['loc_state']) ? $data['loc_state'] : null;
        $this->container['log_start_ms'] = isset($data['log_start_ms']) ? $data['log_start_ms'] : null;
        $this->container['remark'] = isset($data['remark']) ? $data['remark'] : null;
        $this->container['status_type'] = isset($data['status_type']) ? $data['status_type'] : null;
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
     * Gets codriver_ids
     *
     * @return int[]
     */
    public function getCodriverIds()
    {
        return $this->container['codriver_ids'];
    }

    /**
     * Sets codriver_ids
     *
     * @param int[] $codriver_ids codriver_ids
     *
     * @return $this
     */
    public function setCodriverIds($codriver_ids)
    {
        $this->container['codriver_ids'] = $codriver_ids;

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
     * @param int $driver_id ID of the driver.
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
     * @param int $group_id ID of the group.
     *
     * @return $this
     */
    public function setGroupId($group_id)
    {
        $this->container['group_id'] = $group_id;

        return $this;
    }

    /**
     * Gets loc_city
     *
     * @return string
     */
    public function getLocCity()
    {
        return $this->container['loc_city'];
    }

    /**
     * Sets loc_city
     *
     * @param string $loc_city City in which the log was recorded.
     *
     * @return $this
     */
    public function setLocCity($loc_city)
    {
        $this->container['loc_city'] = $loc_city;

        return $this;
    }

    /**
     * Gets loc_lat
     *
     * @return double
     */
    public function getLocLat()
    {
        return $this->container['loc_lat'];
    }

    /**
     * Sets loc_lat
     *
     * @param double $loc_lat Latitude at which the log was recorded.
     *
     * @return $this
     */
    public function setLocLat($loc_lat)
    {
        $this->container['loc_lat'] = $loc_lat;

        return $this;
    }

    /**
     * Gets loc_lng
     *
     * @return double
     */
    public function getLocLng()
    {
        return $this->container['loc_lng'];
    }

    /**
     * Sets loc_lng
     *
     * @param double $loc_lng Longitude at which the log was recorded.
     *
     * @return $this
     */
    public function setLocLng($loc_lng)
    {
        $this->container['loc_lng'] = $loc_lng;

        return $this;
    }

    /**
     * Gets loc_name
     *
     * @return string
     */
    public function getLocName()
    {
        return $this->container['loc_name'];
    }

    /**
     * Sets loc_name
     *
     * @param string $loc_name Name of location at which the log was recorded.
     *
     * @return $this
     */
    public function setLocName($loc_name)
    {
        $this->container['loc_name'] = $loc_name;

        return $this;
    }

    /**
     * Gets loc_state
     *
     * @return string
     */
    public function getLocState()
    {
        return $this->container['loc_state'];
    }

    /**
     * Sets loc_state
     *
     * @param string $loc_state State in which the log was recorded.
     *
     * @return $this
     */
    public function setLocState($loc_state)
    {
        $this->container['loc_state'] = $loc_state;

        return $this;
    }

    /**
     * Gets log_start_ms
     *
     * @return int
     */
    public function getLogStartMs()
    {
        return $this->container['log_start_ms'];
    }

    /**
     * Sets log_start_ms
     *
     * @param int $log_start_ms The time at which the log/HOS status started in UNIX milliseconds.
     *
     * @return $this
     */
    public function setLogStartMs($log_start_ms)
    {
        $this->container['log_start_ms'] = $log_start_ms;

        return $this;
    }

    /**
     * Gets remark
     *
     * @return string
     */
    public function getRemark()
    {
        return $this->container['remark'];
    }

    /**
     * Sets remark
     *
     * @param string $remark Remark associated with the log entry.
     *
     * @return $this
     */
    public function setRemark($remark)
    {
        $this->container['remark'] = $remark;

        return $this;
    }

    /**
     * Gets status_type
     *
     * @return string
     */
    public function getStatusType()
    {
        return $this->container['status_type'];
    }

    /**
     * Sets status_type
     *
     * @param string $status_type The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     *
     * @return $this
     */
    public function setStatusType($status_type)
    {
        $this->container['status_type'] = $status_type;

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
     * @param int $vehicle_id ID of the vehicle.
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


