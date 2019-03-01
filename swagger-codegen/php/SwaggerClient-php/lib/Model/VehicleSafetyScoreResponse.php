<?php
/**
 * VehicleSafetyScoreResponse
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
 * VehicleSafetyScoreResponse Class Doc Comment
 *
 * @category Class
 * @description Safety score details for a vehicle
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class VehicleSafetyScoreResponse implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'VehicleSafetyScoreResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'crash_count' => 'int',
        'harsh_accel_count' => 'int',
        'harsh_braking_count' => 'int',
        'harsh_events' => '\Swagger\Client\Model\SafetyReportHarshEvent[]',
        'harsh_turning_count' => 'int',
        'safety_score' => 'int',
        'safety_score_rank' => 'string',
        'time_over_speed_limit_ms' => 'int',
        'total_distance_driven_meters' => 'int',
        'total_harsh_event_count' => 'int',
        'total_time_driven_ms' => 'int',
        'vehicle_id' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'crash_count' => null,
        'harsh_accel_count' => null,
        'harsh_braking_count' => null,
        'harsh_events' => null,
        'harsh_turning_count' => null,
        'safety_score' => null,
        'safety_score_rank' => null,
        'time_over_speed_limit_ms' => null,
        'total_distance_driven_meters' => null,
        'total_harsh_event_count' => null,
        'total_time_driven_ms' => null,
        'vehicle_id' => null
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
        'crash_count' => 'crashCount',
        'harsh_accel_count' => 'harshAccelCount',
        'harsh_braking_count' => 'harshBrakingCount',
        'harsh_events' => 'harshEvents',
        'harsh_turning_count' => 'harshTurningCount',
        'safety_score' => 'safetyScore',
        'safety_score_rank' => 'safetyScoreRank',
        'time_over_speed_limit_ms' => 'timeOverSpeedLimitMs',
        'total_distance_driven_meters' => 'totalDistanceDrivenMeters',
        'total_harsh_event_count' => 'totalHarshEventCount',
        'total_time_driven_ms' => 'totalTimeDrivenMs',
        'vehicle_id' => 'vehicleId'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'crash_count' => 'setCrashCount',
        'harsh_accel_count' => 'setHarshAccelCount',
        'harsh_braking_count' => 'setHarshBrakingCount',
        'harsh_events' => 'setHarshEvents',
        'harsh_turning_count' => 'setHarshTurningCount',
        'safety_score' => 'setSafetyScore',
        'safety_score_rank' => 'setSafetyScoreRank',
        'time_over_speed_limit_ms' => 'setTimeOverSpeedLimitMs',
        'total_distance_driven_meters' => 'setTotalDistanceDrivenMeters',
        'total_harsh_event_count' => 'setTotalHarshEventCount',
        'total_time_driven_ms' => 'setTotalTimeDrivenMs',
        'vehicle_id' => 'setVehicleId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'crash_count' => 'getCrashCount',
        'harsh_accel_count' => 'getHarshAccelCount',
        'harsh_braking_count' => 'getHarshBrakingCount',
        'harsh_events' => 'getHarshEvents',
        'harsh_turning_count' => 'getHarshTurningCount',
        'safety_score' => 'getSafetyScore',
        'safety_score_rank' => 'getSafetyScoreRank',
        'time_over_speed_limit_ms' => 'getTimeOverSpeedLimitMs',
        'total_distance_driven_meters' => 'getTotalDistanceDrivenMeters',
        'total_harsh_event_count' => 'getTotalHarshEventCount',
        'total_time_driven_ms' => 'getTotalTimeDrivenMs',
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
        $this->container['crash_count'] = isset($data['crash_count']) ? $data['crash_count'] : null;
        $this->container['harsh_accel_count'] = isset($data['harsh_accel_count']) ? $data['harsh_accel_count'] : null;
        $this->container['harsh_braking_count'] = isset($data['harsh_braking_count']) ? $data['harsh_braking_count'] : null;
        $this->container['harsh_events'] = isset($data['harsh_events']) ? $data['harsh_events'] : null;
        $this->container['harsh_turning_count'] = isset($data['harsh_turning_count']) ? $data['harsh_turning_count'] : null;
        $this->container['safety_score'] = isset($data['safety_score']) ? $data['safety_score'] : null;
        $this->container['safety_score_rank'] = isset($data['safety_score_rank']) ? $data['safety_score_rank'] : null;
        $this->container['time_over_speed_limit_ms'] = isset($data['time_over_speed_limit_ms']) ? $data['time_over_speed_limit_ms'] : null;
        $this->container['total_distance_driven_meters'] = isset($data['total_distance_driven_meters']) ? $data['total_distance_driven_meters'] : null;
        $this->container['total_harsh_event_count'] = isset($data['total_harsh_event_count']) ? $data['total_harsh_event_count'] : null;
        $this->container['total_time_driven_ms'] = isset($data['total_time_driven_ms']) ? $data['total_time_driven_ms'] : null;
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
     * Gets crash_count
     *
     * @return int
     */
    public function getCrashCount()
    {
        return $this->container['crash_count'];
    }

    /**
     * Sets crash_count
     *
     * @param int $crash_count Crash event count
     *
     * @return $this
     */
    public function setCrashCount($crash_count)
    {
        $this->container['crash_count'] = $crash_count;

        return $this;
    }

    /**
     * Gets harsh_accel_count
     *
     * @return int
     */
    public function getHarshAccelCount()
    {
        return $this->container['harsh_accel_count'];
    }

    /**
     * Sets harsh_accel_count
     *
     * @param int $harsh_accel_count Harsh acceleration event count
     *
     * @return $this
     */
    public function setHarshAccelCount($harsh_accel_count)
    {
        $this->container['harsh_accel_count'] = $harsh_accel_count;

        return $this;
    }

    /**
     * Gets harsh_braking_count
     *
     * @return int
     */
    public function getHarshBrakingCount()
    {
        return $this->container['harsh_braking_count'];
    }

    /**
     * Sets harsh_braking_count
     *
     * @param int $harsh_braking_count Harsh braking event count
     *
     * @return $this
     */
    public function setHarshBrakingCount($harsh_braking_count)
    {
        $this->container['harsh_braking_count'] = $harsh_braking_count;

        return $this;
    }

    /**
     * Gets harsh_events
     *
     * @return \Swagger\Client\Model\SafetyReportHarshEvent[]
     */
    public function getHarshEvents()
    {
        return $this->container['harsh_events'];
    }

    /**
     * Sets harsh_events
     *
     * @param \Swagger\Client\Model\SafetyReportHarshEvent[] $harsh_events harsh_events
     *
     * @return $this
     */
    public function setHarshEvents($harsh_events)
    {
        $this->container['harsh_events'] = $harsh_events;

        return $this;
    }

    /**
     * Gets harsh_turning_count
     *
     * @return int
     */
    public function getHarshTurningCount()
    {
        return $this->container['harsh_turning_count'];
    }

    /**
     * Sets harsh_turning_count
     *
     * @param int $harsh_turning_count Harsh turning event count
     *
     * @return $this
     */
    public function setHarshTurningCount($harsh_turning_count)
    {
        $this->container['harsh_turning_count'] = $harsh_turning_count;

        return $this;
    }

    /**
     * Gets safety_score
     *
     * @return int
     */
    public function getSafetyScore()
    {
        return $this->container['safety_score'];
    }

    /**
     * Sets safety_score
     *
     * @param int $safety_score Safety Score
     *
     * @return $this
     */
    public function setSafetyScore($safety_score)
    {
        $this->container['safety_score'] = $safety_score;

        return $this;
    }

    /**
     * Gets safety_score_rank
     *
     * @return string
     */
    public function getSafetyScoreRank()
    {
        return $this->container['safety_score_rank'];
    }

    /**
     * Sets safety_score_rank
     *
     * @param string $safety_score_rank Safety Score Rank
     *
     * @return $this
     */
    public function setSafetyScoreRank($safety_score_rank)
    {
        $this->container['safety_score_rank'] = $safety_score_rank;

        return $this;
    }

    /**
     * Gets time_over_speed_limit_ms
     *
     * @return int
     */
    public function getTimeOverSpeedLimitMs()
    {
        return $this->container['time_over_speed_limit_ms'];
    }

    /**
     * Sets time_over_speed_limit_ms
     *
     * @param int $time_over_speed_limit_ms Amount of time driven over the speed limit in milliseconds
     *
     * @return $this
     */
    public function setTimeOverSpeedLimitMs($time_over_speed_limit_ms)
    {
        $this->container['time_over_speed_limit_ms'] = $time_over_speed_limit_ms;

        return $this;
    }

    /**
     * Gets total_distance_driven_meters
     *
     * @return int
     */
    public function getTotalDistanceDrivenMeters()
    {
        return $this->container['total_distance_driven_meters'];
    }

    /**
     * Sets total_distance_driven_meters
     *
     * @param int $total_distance_driven_meters Total distance driven in meters
     *
     * @return $this
     */
    public function setTotalDistanceDrivenMeters($total_distance_driven_meters)
    {
        $this->container['total_distance_driven_meters'] = $total_distance_driven_meters;

        return $this;
    }

    /**
     * Gets total_harsh_event_count
     *
     * @return int
     */
    public function getTotalHarshEventCount()
    {
        return $this->container['total_harsh_event_count'];
    }

    /**
     * Sets total_harsh_event_count
     *
     * @param int $total_harsh_event_count Total harsh event count
     *
     * @return $this
     */
    public function setTotalHarshEventCount($total_harsh_event_count)
    {
        $this->container['total_harsh_event_count'] = $total_harsh_event_count;

        return $this;
    }

    /**
     * Gets total_time_driven_ms
     *
     * @return int
     */
    public function getTotalTimeDrivenMs()
    {
        return $this->container['total_time_driven_ms'];
    }

    /**
     * Sets total_time_driven_ms
     *
     * @param int $total_time_driven_ms Amount of time driven in milliseconds
     *
     * @return $this
     */
    public function setTotalTimeDrivenMs($total_time_driven_ms)
    {
        $this->container['total_time_driven_ms'] = $total_time_driven_ms;

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
     * @param int $vehicle_id Vehicle ID
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


