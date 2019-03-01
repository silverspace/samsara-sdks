<?php
/**
 * TripResponseTrips
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
 * TripResponseTrips Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class TripResponseTrips implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'TripResponse_trips';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'distance_meters' => 'int',
        'driver_id' => 'int',
        'end_address' => 'string',
        'end_coordinates' => '\Swagger\Client\Model\TripResponseEndCoordinates',
        'end_location' => 'string',
        'end_ms' => 'int',
        'end_odometer' => 'int',
        'fuel_consumed_ml' => 'int',
        'start_address' => 'string',
        'start_coordinates' => '\Swagger\Client\Model\TripResponseStartCoordinates',
        'start_location' => 'string',
        'start_ms' => 'int',
        'start_odometer' => 'int',
        'toll_meters' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'distance_meters' => null,
        'driver_id' => null,
        'end_address' => null,
        'end_coordinates' => null,
        'end_location' => null,
        'end_ms' => null,
        'end_odometer' => null,
        'fuel_consumed_ml' => null,
        'start_address' => null,
        'start_coordinates' => null,
        'start_location' => null,
        'start_ms' => null,
        'start_odometer' => null,
        'toll_meters' => null
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
        'distance_meters' => 'distanceMeters',
        'driver_id' => 'driverId',
        'end_address' => 'endAddress',
        'end_coordinates' => 'endCoordinates',
        'end_location' => 'endLocation',
        'end_ms' => 'endMs',
        'end_odometer' => 'endOdometer',
        'fuel_consumed_ml' => 'fuelConsumedMl',
        'start_address' => 'startAddress',
        'start_coordinates' => 'startCoordinates',
        'start_location' => 'startLocation',
        'start_ms' => 'startMs',
        'start_odometer' => 'startOdometer',
        'toll_meters' => 'tollMeters'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'distance_meters' => 'setDistanceMeters',
        'driver_id' => 'setDriverId',
        'end_address' => 'setEndAddress',
        'end_coordinates' => 'setEndCoordinates',
        'end_location' => 'setEndLocation',
        'end_ms' => 'setEndMs',
        'end_odometer' => 'setEndOdometer',
        'fuel_consumed_ml' => 'setFuelConsumedMl',
        'start_address' => 'setStartAddress',
        'start_coordinates' => 'setStartCoordinates',
        'start_location' => 'setStartLocation',
        'start_ms' => 'setStartMs',
        'start_odometer' => 'setStartOdometer',
        'toll_meters' => 'setTollMeters'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'distance_meters' => 'getDistanceMeters',
        'driver_id' => 'getDriverId',
        'end_address' => 'getEndAddress',
        'end_coordinates' => 'getEndCoordinates',
        'end_location' => 'getEndLocation',
        'end_ms' => 'getEndMs',
        'end_odometer' => 'getEndOdometer',
        'fuel_consumed_ml' => 'getFuelConsumedMl',
        'start_address' => 'getStartAddress',
        'start_coordinates' => 'getStartCoordinates',
        'start_location' => 'getStartLocation',
        'start_ms' => 'getStartMs',
        'start_odometer' => 'getStartOdometer',
        'toll_meters' => 'getTollMeters'
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
        $this->container['distance_meters'] = isset($data['distance_meters']) ? $data['distance_meters'] : null;
        $this->container['driver_id'] = isset($data['driver_id']) ? $data['driver_id'] : null;
        $this->container['end_address'] = isset($data['end_address']) ? $data['end_address'] : null;
        $this->container['end_coordinates'] = isset($data['end_coordinates']) ? $data['end_coordinates'] : null;
        $this->container['end_location'] = isset($data['end_location']) ? $data['end_location'] : null;
        $this->container['end_ms'] = isset($data['end_ms']) ? $data['end_ms'] : null;
        $this->container['end_odometer'] = isset($data['end_odometer']) ? $data['end_odometer'] : null;
        $this->container['fuel_consumed_ml'] = isset($data['fuel_consumed_ml']) ? $data['fuel_consumed_ml'] : null;
        $this->container['start_address'] = isset($data['start_address']) ? $data['start_address'] : null;
        $this->container['start_coordinates'] = isset($data['start_coordinates']) ? $data['start_coordinates'] : null;
        $this->container['start_location'] = isset($data['start_location']) ? $data['start_location'] : null;
        $this->container['start_ms'] = isset($data['start_ms']) ? $data['start_ms'] : null;
        $this->container['start_odometer'] = isset($data['start_odometer']) ? $data['start_odometer'] : null;
        $this->container['toll_meters'] = isset($data['toll_meters']) ? $data['toll_meters'] : null;
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
     * Gets distance_meters
     *
     * @return int
     */
    public function getDistanceMeters()
    {
        return $this->container['distance_meters'];
    }

    /**
     * Sets distance_meters
     *
     * @param int $distance_meters Length of the trip in meters.
     *
     * @return $this
     */
    public function setDistanceMeters($distance_meters)
    {
        $this->container['distance_meters'] = $distance_meters;

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
     * Gets end_address
     *
     * @return string
     */
    public function getEndAddress()
    {
        return $this->container['end_address'];
    }

    /**
     * Sets end_address
     *
     * @param string $end_address Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setEndAddress($end_address)
    {
        $this->container['end_address'] = $end_address;

        return $this;
    }

    /**
     * Gets end_coordinates
     *
     * @return \Swagger\Client\Model\TripResponseEndCoordinates
     */
    public function getEndCoordinates()
    {
        return $this->container['end_coordinates'];
    }

    /**
     * Sets end_coordinates
     *
     * @param \Swagger\Client\Model\TripResponseEndCoordinates $end_coordinates end_coordinates
     *
     * @return $this
     */
    public function setEndCoordinates($end_coordinates)
    {
        $this->container['end_coordinates'] = $end_coordinates;

        return $this;
    }

    /**
     * Gets end_location
     *
     * @return string
     */
    public function getEndLocation()
    {
        return $this->container['end_location'];
    }

    /**
     * Sets end_location
     *
     * @param string $end_location Geocoded street address of start (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setEndLocation($end_location)
    {
        $this->container['end_location'] = $end_location;

        return $this;
    }

    /**
     * Gets end_ms
     *
     * @return int
     */
    public function getEndMs()
    {
        return $this->container['end_ms'];
    }

    /**
     * Sets end_ms
     *
     * @param int $end_ms End of the trip in UNIX milliseconds.
     *
     * @return $this
     */
    public function setEndMs($end_ms)
    {
        $this->container['end_ms'] = $end_ms;

        return $this;
    }

    /**
     * Gets end_odometer
     *
     * @return int
     */
    public function getEndOdometer()
    {
        return $this->container['end_odometer'];
    }

    /**
     * Sets end_odometer
     *
     * @param int $end_odometer Odometer reading at the end of the trip.
     *
     * @return $this
     */
    public function setEndOdometer($end_odometer)
    {
        $this->container['end_odometer'] = $end_odometer;

        return $this;
    }

    /**
     * Gets fuel_consumed_ml
     *
     * @return int
     */
    public function getFuelConsumedMl()
    {
        return $this->container['fuel_consumed_ml'];
    }

    /**
     * Sets fuel_consumed_ml
     *
     * @param int $fuel_consumed_ml Amount in milliliters of fuel consumed on this trip.
     *
     * @return $this
     */
    public function setFuelConsumedMl($fuel_consumed_ml)
    {
        $this->container['fuel_consumed_ml'] = $fuel_consumed_ml;

        return $this;
    }

    /**
     * Gets start_address
     *
     * @return string
     */
    public function getStartAddress()
    {
        return $this->container['start_address'];
    }

    /**
     * Sets start_address
     *
     * @param string $start_address Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setStartAddress($start_address)
    {
        $this->container['start_address'] = $start_address;

        return $this;
    }

    /**
     * Gets start_coordinates
     *
     * @return \Swagger\Client\Model\TripResponseStartCoordinates
     */
    public function getStartCoordinates()
    {
        return $this->container['start_coordinates'];
    }

    /**
     * Sets start_coordinates
     *
     * @param \Swagger\Client\Model\TripResponseStartCoordinates $start_coordinates start_coordinates
     *
     * @return $this
     */
    public function setStartCoordinates($start_coordinates)
    {
        $this->container['start_coordinates'] = $start_coordinates;

        return $this;
    }

    /**
     * Gets start_location
     *
     * @return string
     */
    public function getStartLocation()
    {
        return $this->container['start_location'];
    }

    /**
     * Sets start_location
     *
     * @param string $start_location Geocoded street address of start (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setStartLocation($start_location)
    {
        $this->container['start_location'] = $start_location;

        return $this;
    }

    /**
     * Gets start_ms
     *
     * @return int
     */
    public function getStartMs()
    {
        return $this->container['start_ms'];
    }

    /**
     * Sets start_ms
     *
     * @param int $start_ms Beginning of the trip in UNIX milliseconds.
     *
     * @return $this
     */
    public function setStartMs($start_ms)
    {
        $this->container['start_ms'] = $start_ms;

        return $this;
    }

    /**
     * Gets start_odometer
     *
     * @return int
     */
    public function getStartOdometer()
    {
        return $this->container['start_odometer'];
    }

    /**
     * Sets start_odometer
     *
     * @param int $start_odometer Odometer reading at the beginning of the trip.
     *
     * @return $this
     */
    public function setStartOdometer($start_odometer)
    {
        $this->container['start_odometer'] = $start_odometer;

        return $this;
    }

    /**
     * Gets toll_meters
     *
     * @return int
     */
    public function getTollMeters()
    {
        return $this->container['toll_meters'];
    }

    /**
     * Sets toll_meters
     *
     * @param int $toll_meters Length in meters trip spent on toll roads.
     *
     * @return $this
     */
    public function setTollMeters($toll_meters)
    {
        $this->container['toll_meters'] = $toll_meters;

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


