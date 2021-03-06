<?php
/**
 * HosLogsSummaryResponseDrivers
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
 * HosLogsSummaryResponseDrivers Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class HosLogsSummaryResponseDrivers implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'HosLogsSummaryResponse_drivers';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'cycle_remaining' => 'int',
        'cycle_tomorrow' => 'int',
        'driver_id' => 'int',
        'driver_name' => 'string',
        'driving_in_violation_cycle' => 'int',
        'driving_in_violation_today' => 'int',
        'duty_status' => 'string',
        'shift_drive_remaining' => 'int',
        'shift_remaining' => 'int',
        'time_in_current_status' => 'int',
        'time_until_break' => 'int',
        'vehicle_name' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'cycle_remaining' => 'int64',
        'cycle_tomorrow' => 'int64',
        'driver_id' => 'int64',
        'driver_name' => null,
        'driving_in_violation_cycle' => 'int64',
        'driving_in_violation_today' => 'int64',
        'duty_status' => null,
        'shift_drive_remaining' => 'int64',
        'shift_remaining' => 'int64',
        'time_in_current_status' => 'int64',
        'time_until_break' => 'int64',
        'vehicle_name' => null
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
        'cycle_remaining' => 'cycleRemaining',
        'cycle_tomorrow' => 'cycleTomorrow',
        'driver_id' => 'driverId',
        'driver_name' => 'driverName',
        'driving_in_violation_cycle' => 'drivingInViolationCycle',
        'driving_in_violation_today' => 'drivingInViolationToday',
        'duty_status' => 'dutyStatus',
        'shift_drive_remaining' => 'shiftDriveRemaining',
        'shift_remaining' => 'shiftRemaining',
        'time_in_current_status' => 'timeInCurrentStatus',
        'time_until_break' => 'timeUntilBreak',
        'vehicle_name' => 'vehicleName'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cycle_remaining' => 'setCycleRemaining',
        'cycle_tomorrow' => 'setCycleTomorrow',
        'driver_id' => 'setDriverId',
        'driver_name' => 'setDriverName',
        'driving_in_violation_cycle' => 'setDrivingInViolationCycle',
        'driving_in_violation_today' => 'setDrivingInViolationToday',
        'duty_status' => 'setDutyStatus',
        'shift_drive_remaining' => 'setShiftDriveRemaining',
        'shift_remaining' => 'setShiftRemaining',
        'time_in_current_status' => 'setTimeInCurrentStatus',
        'time_until_break' => 'setTimeUntilBreak',
        'vehicle_name' => 'setVehicleName'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cycle_remaining' => 'getCycleRemaining',
        'cycle_tomorrow' => 'getCycleTomorrow',
        'driver_id' => 'getDriverId',
        'driver_name' => 'getDriverName',
        'driving_in_violation_cycle' => 'getDrivingInViolationCycle',
        'driving_in_violation_today' => 'getDrivingInViolationToday',
        'duty_status' => 'getDutyStatus',
        'shift_drive_remaining' => 'getShiftDriveRemaining',
        'shift_remaining' => 'getShiftRemaining',
        'time_in_current_status' => 'getTimeInCurrentStatus',
        'time_until_break' => 'getTimeUntilBreak',
        'vehicle_name' => 'getVehicleName'
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
        $this->container['cycle_remaining'] = isset($data['cycle_remaining']) ? $data['cycle_remaining'] : null;
        $this->container['cycle_tomorrow'] = isset($data['cycle_tomorrow']) ? $data['cycle_tomorrow'] : null;
        $this->container['driver_id'] = isset($data['driver_id']) ? $data['driver_id'] : null;
        $this->container['driver_name'] = isset($data['driver_name']) ? $data['driver_name'] : null;
        $this->container['driving_in_violation_cycle'] = isset($data['driving_in_violation_cycle']) ? $data['driving_in_violation_cycle'] : null;
        $this->container['driving_in_violation_today'] = isset($data['driving_in_violation_today']) ? $data['driving_in_violation_today'] : null;
        $this->container['duty_status'] = isset($data['duty_status']) ? $data['duty_status'] : null;
        $this->container['shift_drive_remaining'] = isset($data['shift_drive_remaining']) ? $data['shift_drive_remaining'] : null;
        $this->container['shift_remaining'] = isset($data['shift_remaining']) ? $data['shift_remaining'] : null;
        $this->container['time_in_current_status'] = isset($data['time_in_current_status']) ? $data['time_in_current_status'] : null;
        $this->container['time_until_break'] = isset($data['time_until_break']) ? $data['time_until_break'] : null;
        $this->container['vehicle_name'] = isset($data['vehicle_name']) ? $data['vehicle_name'] : null;
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
     * Gets cycle_remaining
     *
     * @return int
     */
    public function getCycleRemaining()
    {
        return $this->container['cycle_remaining'];
    }

    /**
     * Sets cycle_remaining
     *
     * @param int $cycle_remaining The amount of remaining cycle time (in ms).
     *
     * @return $this
     */
    public function setCycleRemaining($cycle_remaining)
    {
        $this->container['cycle_remaining'] = $cycle_remaining;

        return $this;
    }

    /**
     * Gets cycle_tomorrow
     *
     * @return int
     */
    public function getCycleTomorrow()
    {
        return $this->container['cycle_tomorrow'];
    }

    /**
     * Sets cycle_tomorrow
     *
     * @param int $cycle_tomorrow The amount of cycle time (in ms) available tomorrow.
     *
     * @return $this
     */
    public function setCycleTomorrow($cycle_tomorrow)
    {
        $this->container['cycle_tomorrow'] = $cycle_tomorrow;

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
     * Gets driver_name
     *
     * @return string
     */
    public function getDriverName()
    {
        return $this->container['driver_name'];
    }

    /**
     * Sets driver_name
     *
     * @param string $driver_name Name of the driver.
     *
     * @return $this
     */
    public function setDriverName($driver_name)
    {
        $this->container['driver_name'] = $driver_name;

        return $this;
    }

    /**
     * Gets driving_in_violation_cycle
     *
     * @return int
     */
    public function getDrivingInViolationCycle()
    {
        return $this->container['driving_in_violation_cycle'];
    }

    /**
     * Sets driving_in_violation_cycle
     *
     * @param int $driving_in_violation_cycle The amount of driving time in violation in this cycle (in ms).
     *
     * @return $this
     */
    public function setDrivingInViolationCycle($driving_in_violation_cycle)
    {
        $this->container['driving_in_violation_cycle'] = $driving_in_violation_cycle;

        return $this;
    }

    /**
     * Gets driving_in_violation_today
     *
     * @return int
     */
    public function getDrivingInViolationToday()
    {
        return $this->container['driving_in_violation_today'];
    }

    /**
     * Sets driving_in_violation_today
     *
     * @param int $driving_in_violation_today The amount of driving time in violation today (in ms).
     *
     * @return $this
     */
    public function setDrivingInViolationToday($driving_in_violation_today)
    {
        $this->container['driving_in_violation_today'] = $driving_in_violation_today;

        return $this;
    }

    /**
     * Gets duty_status
     *
     * @return string
     */
    public function getDutyStatus()
    {
        return $this->container['duty_status'];
    }

    /**
     * Sets duty_status
     *
     * @param string $duty_status The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     *
     * @return $this
     */
    public function setDutyStatus($duty_status)
    {
        $this->container['duty_status'] = $duty_status;

        return $this;
    }

    /**
     * Gets shift_drive_remaining
     *
     * @return int
     */
    public function getShiftDriveRemaining()
    {
        return $this->container['shift_drive_remaining'];
    }

    /**
     * Sets shift_drive_remaining
     *
     * @param int $shift_drive_remaining The amount of remaining shift drive time (in ms).
     *
     * @return $this
     */
    public function setShiftDriveRemaining($shift_drive_remaining)
    {
        $this->container['shift_drive_remaining'] = $shift_drive_remaining;

        return $this;
    }

    /**
     * Gets shift_remaining
     *
     * @return int
     */
    public function getShiftRemaining()
    {
        return $this->container['shift_remaining'];
    }

    /**
     * Sets shift_remaining
     *
     * @param int $shift_remaining The amount of remaining shift time (in ms).
     *
     * @return $this
     */
    public function setShiftRemaining($shift_remaining)
    {
        $this->container['shift_remaining'] = $shift_remaining;

        return $this;
    }

    /**
     * Gets time_in_current_status
     *
     * @return int
     */
    public function getTimeInCurrentStatus()
    {
        return $this->container['time_in_current_status'];
    }

    /**
     * Sets time_in_current_status
     *
     * @param int $time_in_current_status The amount of time (in ms) that the driver has been in the current `dutyStatus`.
     *
     * @return $this
     */
    public function setTimeInCurrentStatus($time_in_current_status)
    {
        $this->container['time_in_current_status'] = $time_in_current_status;

        return $this;
    }

    /**
     * Gets time_until_break
     *
     * @return int
     */
    public function getTimeUntilBreak()
    {
        return $this->container['time_until_break'];
    }

    /**
     * Sets time_until_break
     *
     * @param int $time_until_break The amount of time (in ms) remaining until the driver cannot drive without a rest break.
     *
     * @return $this
     */
    public function setTimeUntilBreak($time_until_break)
    {
        $this->container['time_until_break'] = $time_until_break;

        return $this;
    }

    /**
     * Gets vehicle_name
     *
     * @return string
     */
    public function getVehicleName()
    {
        return $this->container['vehicle_name'];
    }

    /**
     * Sets vehicle_name
     *
     * @param string $vehicle_name Name of the vehicle.
     *
     * @return $this
     */
    public function setVehicleName($vehicle_name)
    {
        $this->container['vehicle_name'] = $vehicle_name;

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


