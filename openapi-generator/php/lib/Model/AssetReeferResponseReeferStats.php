<?php
/**
 * AssetReeferResponseReeferStats
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
 * AssetReeferResponseReeferStats Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class AssetReeferResponseReeferStats implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'AssetReeferResponse_reeferStats';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'fuel_percentage' => '\OpenAPI\Client\Model\AssetReeferResponseReeferStatsFuelPercentage[]',
        'power_status' => '\OpenAPI\Client\Model\AssetReeferResponseReeferStatsPowerStatus[]',
        'engine_hours' => '\OpenAPI\Client\Model\AssetReeferResponseReeferStatsEngineHours[]',
        'set_point' => '\OpenAPI\Client\Model\AssetReeferResponseReeferStatsSetPoint[]',
        'return_air_temp' => '\OpenAPI\Client\Model\AssetReeferResponseReeferStatsReturnAirTemp[]',
        'alarms' => '\OpenAPI\Client\Model\AssetReeferResponseReeferStatsAlarms1[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'fuel_percentage' => null,
        'power_status' => null,
        'engine_hours' => null,
        'set_point' => null,
        'return_air_temp' => null,
        'alarms' => null
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
        'fuel_percentage' => 'fuelPercentage',
        'power_status' => 'powerStatus',
        'engine_hours' => 'engineHours',
        'set_point' => 'setPoint',
        'return_air_temp' => 'returnAirTemp',
        'alarms' => 'alarms'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'fuel_percentage' => 'setFuelPercentage',
        'power_status' => 'setPowerStatus',
        'engine_hours' => 'setEngineHours',
        'set_point' => 'setSetPoint',
        'return_air_temp' => 'setReturnAirTemp',
        'alarms' => 'setAlarms'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'fuel_percentage' => 'getFuelPercentage',
        'power_status' => 'getPowerStatus',
        'engine_hours' => 'getEngineHours',
        'set_point' => 'getSetPoint',
        'return_air_temp' => 'getReturnAirTemp',
        'alarms' => 'getAlarms'
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
        $this->container['fuel_percentage'] = isset($data['fuel_percentage']) ? $data['fuel_percentage'] : null;
        $this->container['power_status'] = isset($data['power_status']) ? $data['power_status'] : null;
        $this->container['engine_hours'] = isset($data['engine_hours']) ? $data['engine_hours'] : null;
        $this->container['set_point'] = isset($data['set_point']) ? $data['set_point'] : null;
        $this->container['return_air_temp'] = isset($data['return_air_temp']) ? $data['return_air_temp'] : null;
        $this->container['alarms'] = isset($data['alarms']) ? $data['alarms'] : null;
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
     * Gets fuel_percentage
     *
     * @return \OpenAPI\Client\Model\AssetReeferResponseReeferStatsFuelPercentage[]|null
     */
    public function getFuelPercentage()
    {
        return $this->container['fuel_percentage'];
    }

    /**
     * Sets fuel_percentage
     *
     * @param \OpenAPI\Client\Model\AssetReeferResponseReeferStatsFuelPercentage[]|null $fuel_percentage Fuel percentage of the reefer
     *
     * @return $this
     */
    public function setFuelPercentage($fuel_percentage)
    {
        $this->container['fuel_percentage'] = $fuel_percentage;

        return $this;
    }

    /**
     * Gets power_status
     *
     * @return \OpenAPI\Client\Model\AssetReeferResponseReeferStatsPowerStatus[]|null
     */
    public function getPowerStatus()
    {
        return $this->container['power_status'];
    }

    /**
     * Sets power_status
     *
     * @param \OpenAPI\Client\Model\AssetReeferResponseReeferStatsPowerStatus[]|null $power_status Power status of the reefer
     *
     * @return $this
     */
    public function setPowerStatus($power_status)
    {
        $this->container['power_status'] = $power_status;

        return $this;
    }

    /**
     * Gets engine_hours
     *
     * @return \OpenAPI\Client\Model\AssetReeferResponseReeferStatsEngineHours[]|null
     */
    public function getEngineHours()
    {
        return $this->container['engine_hours'];
    }

    /**
     * Sets engine_hours
     *
     * @param \OpenAPI\Client\Model\AssetReeferResponseReeferStatsEngineHours[]|null $engine_hours Engine hours of the reefer
     *
     * @return $this
     */
    public function setEngineHours($engine_hours)
    {
        $this->container['engine_hours'] = $engine_hours;

        return $this;
    }

    /**
     * Gets set_point
     *
     * @return \OpenAPI\Client\Model\AssetReeferResponseReeferStatsSetPoint[]|null
     */
    public function getSetPoint()
    {
        return $this->container['set_point'];
    }

    /**
     * Sets set_point
     *
     * @param \OpenAPI\Client\Model\AssetReeferResponseReeferStatsSetPoint[]|null $set_point Set point temperature of the reefer
     *
     * @return $this
     */
    public function setSetPoint($set_point)
    {
        $this->container['set_point'] = $set_point;

        return $this;
    }

    /**
     * Gets return_air_temp
     *
     * @return \OpenAPI\Client\Model\AssetReeferResponseReeferStatsReturnAirTemp[]|null
     */
    public function getReturnAirTemp()
    {
        return $this->container['return_air_temp'];
    }

    /**
     * Sets return_air_temp
     *
     * @param \OpenAPI\Client\Model\AssetReeferResponseReeferStatsReturnAirTemp[]|null $return_air_temp Return air temperature of the reefer
     *
     * @return $this
     */
    public function setReturnAirTemp($return_air_temp)
    {
        $this->container['return_air_temp'] = $return_air_temp;

        return $this;
    }

    /**
     * Gets alarms
     *
     * @return \OpenAPI\Client\Model\AssetReeferResponseReeferStatsAlarms1[]|null
     */
    public function getAlarms()
    {
        return $this->container['alarms'];
    }

    /**
     * Sets alarms
     *
     * @param \OpenAPI\Client\Model\AssetReeferResponseReeferStatsAlarms1[]|null $alarms Reefer alarms
     *
     * @return $this
     */
    public function setAlarms($alarms)
    {
        $this->container['alarms'] = $alarms;

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


