<?php
/**
 * CreateDvirParam
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
 * CreateDvirParam Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CreateDvirParam implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'createDvirParam';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'inspection_type' => 'string',
        'mechanic_notes' => 'string',
        'odometer_miles' => 'int',
        'previous_defects_corrected' => 'bool',
        'previous_defects_ignored' => 'bool',
        'safe' => 'string',
        'trailer_id' => 'int',
        'user_email' => 'string',
        'vehicle_id' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'inspection_type' => null,
        'mechanic_notes' => null,
        'odometer_miles' => null,
        'previous_defects_corrected' => null,
        'previous_defects_ignored' => null,
        'safe' => null,
        'trailer_id' => null,
        'user_email' => null,
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
        'inspection_type' => 'inspectionType',
        'mechanic_notes' => 'mechanicNotes',
        'odometer_miles' => 'odometerMiles',
        'previous_defects_corrected' => 'previousDefectsCorrected',
        'previous_defects_ignored' => 'previousDefectsIgnored',
        'safe' => 'safe',
        'trailer_id' => 'trailerId',
        'user_email' => 'userEmail',
        'vehicle_id' => 'vehicleId'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'inspection_type' => 'setInspectionType',
        'mechanic_notes' => 'setMechanicNotes',
        'odometer_miles' => 'setOdometerMiles',
        'previous_defects_corrected' => 'setPreviousDefectsCorrected',
        'previous_defects_ignored' => 'setPreviousDefectsIgnored',
        'safe' => 'setSafe',
        'trailer_id' => 'setTrailerId',
        'user_email' => 'setUserEmail',
        'vehicle_id' => 'setVehicleId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'inspection_type' => 'getInspectionType',
        'mechanic_notes' => 'getMechanicNotes',
        'odometer_miles' => 'getOdometerMiles',
        'previous_defects_corrected' => 'getPreviousDefectsCorrected',
        'previous_defects_ignored' => 'getPreviousDefectsIgnored',
        'safe' => 'getSafe',
        'trailer_id' => 'getTrailerId',
        'user_email' => 'getUserEmail',
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

    const INSPECTION_TYPE_MECHANIC = 'mechanic';
    const SAFE_SAFE = 'safe';
    const SAFE_UNSAFE = 'unsafe';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getInspectionTypeAllowableValues()
    {
        return [
            self::INSPECTION_TYPE_MECHANIC,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getSafeAllowableValues()
    {
        return [
            self::SAFE_SAFE,
            self::SAFE_UNSAFE,
        ];
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
        $this->container['inspection_type'] = isset($data['inspection_type']) ? $data['inspection_type'] : null;
        $this->container['mechanic_notes'] = isset($data['mechanic_notes']) ? $data['mechanic_notes'] : null;
        $this->container['odometer_miles'] = isset($data['odometer_miles']) ? $data['odometer_miles'] : null;
        $this->container['previous_defects_corrected'] = isset($data['previous_defects_corrected']) ? $data['previous_defects_corrected'] : null;
        $this->container['previous_defects_ignored'] = isset($data['previous_defects_ignored']) ? $data['previous_defects_ignored'] : null;
        $this->container['safe'] = isset($data['safe']) ? $data['safe'] : null;
        $this->container['trailer_id'] = isset($data['trailer_id']) ? $data['trailer_id'] : null;
        $this->container['user_email'] = isset($data['user_email']) ? $data['user_email'] : null;
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

        if ($this->container['inspection_type'] === null) {
            $invalidProperties[] = "'inspection_type' can't be null";
        }
        $allowedValues = $this->getInspectionTypeAllowableValues();
        if (!is_null($this->container['inspection_type']) && !in_array($this->container['inspection_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'inspection_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['safe'] === null) {
            $invalidProperties[] = "'safe' can't be null";
        }
        $allowedValues = $this->getSafeAllowableValues();
        if (!is_null($this->container['safe']) && !in_array($this->container['safe'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'safe', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['user_email'] === null) {
            $invalidProperties[] = "'user_email' can't be null";
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
     * Gets inspection_type
     *
     * @return string
     */
    public function getInspectionType()
    {
        return $this->container['inspection_type'];
    }

    /**
     * Sets inspection_type
     *
     * @param string $inspection_type Only type 'mechanic' is currently accepted.
     *
     * @return $this
     */
    public function setInspectionType($inspection_type)
    {
        $allowedValues = $this->getInspectionTypeAllowableValues();
        if (!in_array($inspection_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'inspection_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['inspection_type'] = $inspection_type;

        return $this;
    }

    /**
     * Gets mechanic_notes
     *
     * @return string
     */
    public function getMechanicNotes()
    {
        return $this->container['mechanic_notes'];
    }

    /**
     * Sets mechanic_notes
     *
     * @param string $mechanic_notes Any notes from the mechanic.
     *
     * @return $this
     */
    public function setMechanicNotes($mechanic_notes)
    {
        $this->container['mechanic_notes'] = $mechanic_notes;

        return $this;
    }

    /**
     * Gets odometer_miles
     *
     * @return int
     */
    public function getOdometerMiles()
    {
        return $this->container['odometer_miles'];
    }

    /**
     * Sets odometer_miles
     *
     * @param int $odometer_miles The current odometer of the vehicle.
     *
     * @return $this
     */
    public function setOdometerMiles($odometer_miles)
    {
        $this->container['odometer_miles'] = $odometer_miles;

        return $this;
    }

    /**
     * Gets previous_defects_corrected
     *
     * @return bool
     */
    public function getPreviousDefectsCorrected()
    {
        return $this->container['previous_defects_corrected'];
    }

    /**
     * Sets previous_defects_corrected
     *
     * @param bool $previous_defects_corrected Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
     *
     * @return $this
     */
    public function setPreviousDefectsCorrected($previous_defects_corrected)
    {
        $this->container['previous_defects_corrected'] = $previous_defects_corrected;

        return $this;
    }

    /**
     * Gets previous_defects_ignored
     *
     * @return bool
     */
    public function getPreviousDefectsIgnored()
    {
        return $this->container['previous_defects_ignored'];
    }

    /**
     * Sets previous_defects_ignored
     *
     * @param bool $previous_defects_ignored Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
     *
     * @return $this
     */
    public function setPreviousDefectsIgnored($previous_defects_ignored)
    {
        $this->container['previous_defects_ignored'] = $previous_defects_ignored;

        return $this;
    }

    /**
     * Gets safe
     *
     * @return string
     */
    public function getSafe()
    {
        return $this->container['safe'];
    }

    /**
     * Sets safe
     *
     * @param string $safe Whether or not this vehicle or trailer is safe to drive.
     *
     * @return $this
     */
    public function setSafe($safe)
    {
        $allowedValues = $this->getSafeAllowableValues();
        if (!in_array($safe, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'safe', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['safe'] = $safe;

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
     * @param int $trailer_id Id of trailer being inspected. Either vehicleId or trailerId must be provided.
     *
     * @return $this
     */
    public function setTrailerId($trailer_id)
    {
        $this->container['trailer_id'] = $trailer_id;

        return $this;
    }

    /**
     * Gets user_email
     *
     * @return string
     */
    public function getUserEmail()
    {
        return $this->container['user_email'];
    }

    /**
     * Sets user_email
     *
     * @param string $user_email The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
     *
     * @return $this
     */
    public function setUserEmail($user_email)
    {
        $this->container['user_email'] = $user_email;

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
     * @param int $vehicle_id Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
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


