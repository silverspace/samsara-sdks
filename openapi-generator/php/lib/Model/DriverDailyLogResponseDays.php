<?php
/**
 * DriverDailyLogResponseDays
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
 * DriverDailyLogResponseDays Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class DriverDailyLogResponseDays implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'DriverDailyLogResponse_days';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'certified_at_ms' => 'int',
        'end_ms' => 'int',
        'start_ms' => 'int',
        'trailer_ids' => 'object',
        'active_hours' => 'double',
        'distance_miles' => 'double',
        'active_ms' => 'int',
        'certified' => 'bool',
        'vehicle_ids' => 'object'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'certified_at_ms' => 'int64',
        'end_ms' => null,
        'start_ms' => null,
        'trailer_ids' => null,
        'active_hours' => 'double',
        'distance_miles' => 'double',
        'active_ms' => 'int64',
        'certified' => null,
        'vehicle_ids' => null
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
        'certified_at_ms' => 'certifiedAtMs',
        'end_ms' => 'endMs',
        'start_ms' => 'startMs',
        'trailer_ids' => 'trailerIds',
        'active_hours' => 'activeHours',
        'distance_miles' => 'distanceMiles',
        'active_ms' => 'activeMs',
        'certified' => 'certified',
        'vehicle_ids' => 'vehicleIds'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'certified_at_ms' => 'setCertifiedAtMs',
        'end_ms' => 'setEndMs',
        'start_ms' => 'setStartMs',
        'trailer_ids' => 'setTrailerIds',
        'active_hours' => 'setActiveHours',
        'distance_miles' => 'setDistanceMiles',
        'active_ms' => 'setActiveMs',
        'certified' => 'setCertified',
        'vehicle_ids' => 'setVehicleIds'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'certified_at_ms' => 'getCertifiedAtMs',
        'end_ms' => 'getEndMs',
        'start_ms' => 'getStartMs',
        'trailer_ids' => 'getTrailerIds',
        'active_hours' => 'getActiveHours',
        'distance_miles' => 'getDistanceMiles',
        'active_ms' => 'getActiveMs',
        'certified' => 'getCertified',
        'vehicle_ids' => 'getVehicleIds'
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
        $this->container['certified_at_ms'] = isset($data['certified_at_ms']) ? $data['certified_at_ms'] : null;
        $this->container['end_ms'] = isset($data['end_ms']) ? $data['end_ms'] : null;
        $this->container['start_ms'] = isset($data['start_ms']) ? $data['start_ms'] : null;
        $this->container['trailer_ids'] = isset($data['trailer_ids']) ? $data['trailer_ids'] : null;
        $this->container['active_hours'] = isset($data['active_hours']) ? $data['active_hours'] : null;
        $this->container['distance_miles'] = isset($data['distance_miles']) ? $data['distance_miles'] : null;
        $this->container['active_ms'] = isset($data['active_ms']) ? $data['active_ms'] : null;
        $this->container['certified'] = isset($data['certified']) ? $data['certified'] : null;
        $this->container['vehicle_ids'] = isset($data['vehicle_ids']) ? $data['vehicle_ids'] : null;
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
     * Gets certified_at_ms
     *
     * @return int|null
     */
    public function getCertifiedAtMs()
    {
        return $this->container['certified_at_ms'];
    }

    /**
     * Sets certified_at_ms
     *
     * @param int|null $certified_at_ms Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
     *
     * @return $this
     */
    public function setCertifiedAtMs($certified_at_ms)
    {
        $this->container['certified_at_ms'] = $certified_at_ms;

        return $this;
    }

    /**
     * Gets end_ms
     *
     * @return int|null
     */
    public function getEndMs()
    {
        return $this->container['end_ms'];
    }

    /**
     * Sets end_ms
     *
     * @param int|null $end_ms End of the HOS day, specified in milliseconds UNIX time.
     *
     * @return $this
     */
    public function setEndMs($end_ms)
    {
        $this->container['end_ms'] = $end_ms;

        return $this;
    }

    /**
     * Gets start_ms
     *
     * @return int|null
     */
    public function getStartMs()
    {
        return $this->container['start_ms'];
    }

    /**
     * Sets start_ms
     *
     * @param int|null $start_ms End of the HOS day, specified in milliseconds UNIX time.
     *
     * @return $this
     */
    public function setStartMs($start_ms)
    {
        $this->container['start_ms'] = $start_ms;

        return $this;
    }

    /**
     * Gets trailer_ids
     *
     * @return object|null
     */
    public function getTrailerIds()
    {
        return $this->container['trailer_ids'];
    }

    /**
     * Sets trailer_ids
     *
     * @param object|null $trailer_ids List of trailer ID's associated with the driver for the day.
     *
     * @return $this
     */
    public function setTrailerIds($trailer_ids)
    {
        $this->container['trailer_ids'] = $trailer_ids;

        return $this;
    }

    /**
     * Gets active_hours
     *
     * @return double|null
     */
    public function getActiveHours()
    {
        return $this->container['active_hours'];
    }

    /**
     * Sets active_hours
     *
     * @param double|null $active_hours Hours spent on duty or driving, rounded to two decimal places.
     *
     * @return $this
     */
    public function setActiveHours($active_hours)
    {
        $this->container['active_hours'] = $active_hours;

        return $this;
    }

    /**
     * Gets distance_miles
     *
     * @return double|null
     */
    public function getDistanceMiles()
    {
        return $this->container['distance_miles'];
    }

    /**
     * Sets distance_miles
     *
     * @param double|null $distance_miles Distance driven in miles, rounded to two decimal places.
     *
     * @return $this
     */
    public function setDistanceMiles($distance_miles)
    {
        $this->container['distance_miles'] = $distance_miles;

        return $this;
    }

    /**
     * Gets active_ms
     *
     * @return int|null
     */
    public function getActiveMs()
    {
        return $this->container['active_ms'];
    }

    /**
     * Sets active_ms
     *
     * @param int|null $active_ms Milliseconds spent on duty or driving.
     *
     * @return $this
     */
    public function setActiveMs($active_ms)
    {
        $this->container['active_ms'] = $active_ms;

        return $this;
    }

    /**
     * Gets certified
     *
     * @return bool|null
     */
    public function getCertified()
    {
        return $this->container['certified'];
    }

    /**
     * Sets certified
     *
     * @param bool|null $certified Whether this HOS day chart was certified by the driver.
     *
     * @return $this
     */
    public function setCertified($certified)
    {
        $this->container['certified'] = $certified;

        return $this;
    }

    /**
     * Gets vehicle_ids
     *
     * @return object|null
     */
    public function getVehicleIds()
    {
        return $this->container['vehicle_ids'];
    }

    /**
     * Sets vehicle_ids
     *
     * @param object|null $vehicle_ids List of vehicle ID's associated with the driver for the day.
     *
     * @return $this
     */
    public function setVehicleIds($vehicle_ids)
    {
        $this->container['vehicle_ids'] = $vehicle_ids;

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


