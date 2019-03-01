<?php
/**
 * DvirBase
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
 * DvirBase Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class DvirBase implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'DvirBase';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'author_signature' => '\OpenAPI\Client\Model\DvirBaseAuthorSignature',
        'defects_corrected' => 'bool',
        'defects_need_not_be_corrected' => 'bool',
        'id' => 'int',
        'inspection_type' => 'string',
        'mechanic_notes' => 'string',
        'mechanic_or_agent_signature' => '\OpenAPI\Client\Model\DvirBaseMechanicOrAgentSignature',
        'next_driver_signature' => '\OpenAPI\Client\Model\DvirBaseNextDriverSignature',
        'odometer_miles' => 'int',
        'time_ms' => 'int',
        'trailer_defects' => '\OpenAPI\Client\Model\DvirBaseTrailerDefects[]',
        'trailer_id' => 'int',
        'trailer_name' => 'string',
        'vehicle' => '\OpenAPI\Client\Model\DvirBaseVehicle',
        'vehicle_condition' => 'string',
        'vehicle_defects' => '\OpenAPI\Client\Model\DvirBaseTrailerDefects[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'author_signature' => null,
        'defects_corrected' => null,
        'defects_need_not_be_corrected' => null,
        'id' => 'int64',
        'inspection_type' => null,
        'mechanic_notes' => null,
        'mechanic_or_agent_signature' => null,
        'next_driver_signature' => null,
        'odometer_miles' => 'int64',
        'time_ms' => 'int64',
        'trailer_defects' => null,
        'trailer_id' => null,
        'trailer_name' => null,
        'vehicle' => null,
        'vehicle_condition' => null,
        'vehicle_defects' => null
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
        'author_signature' => 'authorSignature',
        'defects_corrected' => 'defectsCorrected',
        'defects_need_not_be_corrected' => 'defectsNeedNotBeCorrected',
        'id' => 'id',
        'inspection_type' => 'inspectionType',
        'mechanic_notes' => 'mechanicNotes',
        'mechanic_or_agent_signature' => 'mechanicOrAgentSignature',
        'next_driver_signature' => 'nextDriverSignature',
        'odometer_miles' => 'odometerMiles',
        'time_ms' => 'timeMs',
        'trailer_defects' => 'trailerDefects',
        'trailer_id' => 'trailerId',
        'trailer_name' => 'trailerName',
        'vehicle' => 'vehicle',
        'vehicle_condition' => 'vehicleCondition',
        'vehicle_defects' => 'vehicleDefects'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'author_signature' => 'setAuthorSignature',
        'defects_corrected' => 'setDefectsCorrected',
        'defects_need_not_be_corrected' => 'setDefectsNeedNotBeCorrected',
        'id' => 'setId',
        'inspection_type' => 'setInspectionType',
        'mechanic_notes' => 'setMechanicNotes',
        'mechanic_or_agent_signature' => 'setMechanicOrAgentSignature',
        'next_driver_signature' => 'setNextDriverSignature',
        'odometer_miles' => 'setOdometerMiles',
        'time_ms' => 'setTimeMs',
        'trailer_defects' => 'setTrailerDefects',
        'trailer_id' => 'setTrailerId',
        'trailer_name' => 'setTrailerName',
        'vehicle' => 'setVehicle',
        'vehicle_condition' => 'setVehicleCondition',
        'vehicle_defects' => 'setVehicleDefects'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'author_signature' => 'getAuthorSignature',
        'defects_corrected' => 'getDefectsCorrected',
        'defects_need_not_be_corrected' => 'getDefectsNeedNotBeCorrected',
        'id' => 'getId',
        'inspection_type' => 'getInspectionType',
        'mechanic_notes' => 'getMechanicNotes',
        'mechanic_or_agent_signature' => 'getMechanicOrAgentSignature',
        'next_driver_signature' => 'getNextDriverSignature',
        'odometer_miles' => 'getOdometerMiles',
        'time_ms' => 'getTimeMs',
        'trailer_defects' => 'getTrailerDefects',
        'trailer_id' => 'getTrailerId',
        'trailer_name' => 'getTrailerName',
        'vehicle' => 'getVehicle',
        'vehicle_condition' => 'getVehicleCondition',
        'vehicle_defects' => 'getVehicleDefects'
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
        $this->container['author_signature'] = isset($data['author_signature']) ? $data['author_signature'] : null;
        $this->container['defects_corrected'] = isset($data['defects_corrected']) ? $data['defects_corrected'] : null;
        $this->container['defects_need_not_be_corrected'] = isset($data['defects_need_not_be_corrected']) ? $data['defects_need_not_be_corrected'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['inspection_type'] = isset($data['inspection_type']) ? $data['inspection_type'] : null;
        $this->container['mechanic_notes'] = isset($data['mechanic_notes']) ? $data['mechanic_notes'] : null;
        $this->container['mechanic_or_agent_signature'] = isset($data['mechanic_or_agent_signature']) ? $data['mechanic_or_agent_signature'] : null;
        $this->container['next_driver_signature'] = isset($data['next_driver_signature']) ? $data['next_driver_signature'] : null;
        $this->container['odometer_miles'] = isset($data['odometer_miles']) ? $data['odometer_miles'] : null;
        $this->container['time_ms'] = isset($data['time_ms']) ? $data['time_ms'] : null;
        $this->container['trailer_defects'] = isset($data['trailer_defects']) ? $data['trailer_defects'] : null;
        $this->container['trailer_id'] = isset($data['trailer_id']) ? $data['trailer_id'] : null;
        $this->container['trailer_name'] = isset($data['trailer_name']) ? $data['trailer_name'] : null;
        $this->container['vehicle'] = isset($data['vehicle']) ? $data['vehicle'] : null;
        $this->container['vehicle_condition'] = isset($data['vehicle_condition']) ? $data['vehicle_condition'] : null;
        $this->container['vehicle_defects'] = isset($data['vehicle_defects']) ? $data['vehicle_defects'] : null;
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
     * Gets author_signature
     *
     * @return \OpenAPI\Client\Model\DvirBaseAuthorSignature|null
     */
    public function getAuthorSignature()
    {
        return $this->container['author_signature'];
    }

    /**
     * Sets author_signature
     *
     * @param \OpenAPI\Client\Model\DvirBaseAuthorSignature|null $author_signature author_signature
     *
     * @return $this
     */
    public function setAuthorSignature($author_signature)
    {
        $this->container['author_signature'] = $author_signature;

        return $this;
    }

    /**
     * Gets defects_corrected
     *
     * @return bool|null
     */
    public function getDefectsCorrected()
    {
        return $this->container['defects_corrected'];
    }

    /**
     * Sets defects_corrected
     *
     * @param bool|null $defects_corrected Signifies if the defects on the vehicle corrected after the DVIR is done.
     *
     * @return $this
     */
    public function setDefectsCorrected($defects_corrected)
    {
        $this->container['defects_corrected'] = $defects_corrected;

        return $this;
    }

    /**
     * Gets defects_need_not_be_corrected
     *
     * @return bool|null
     */
    public function getDefectsNeedNotBeCorrected()
    {
        return $this->container['defects_need_not_be_corrected'];
    }

    /**
     * Sets defects_need_not_be_corrected
     *
     * @param bool|null $defects_need_not_be_corrected Signifies if the defects on this vehicle can be ignored.
     *
     * @return $this
     */
    public function setDefectsNeedNotBeCorrected($defects_need_not_be_corrected)
    {
        $this->container['defects_need_not_be_corrected'] = $defects_need_not_be_corrected;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int|null $id The id of this DVIR record.
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets inspection_type
     *
     * @return string|null
     */
    public function getInspectionType()
    {
        return $this->container['inspection_type'];
    }

    /**
     * Sets inspection_type
     *
     * @param string|null $inspection_type Inspection type of the DVIR.
     *
     * @return $this
     */
    public function setInspectionType($inspection_type)
    {
        $this->container['inspection_type'] = $inspection_type;

        return $this;
    }

    /**
     * Gets mechanic_notes
     *
     * @return string|null
     */
    public function getMechanicNotes()
    {
        return $this->container['mechanic_notes'];
    }

    /**
     * Sets mechanic_notes
     *
     * @param string|null $mechanic_notes The mechanics notes on the DVIR.
     *
     * @return $this
     */
    public function setMechanicNotes($mechanic_notes)
    {
        $this->container['mechanic_notes'] = $mechanic_notes;

        return $this;
    }

    /**
     * Gets mechanic_or_agent_signature
     *
     * @return \OpenAPI\Client\Model\DvirBaseMechanicOrAgentSignature|null
     */
    public function getMechanicOrAgentSignature()
    {
        return $this->container['mechanic_or_agent_signature'];
    }

    /**
     * Sets mechanic_or_agent_signature
     *
     * @param \OpenAPI\Client\Model\DvirBaseMechanicOrAgentSignature|null $mechanic_or_agent_signature mechanic_or_agent_signature
     *
     * @return $this
     */
    public function setMechanicOrAgentSignature($mechanic_or_agent_signature)
    {
        $this->container['mechanic_or_agent_signature'] = $mechanic_or_agent_signature;

        return $this;
    }

    /**
     * Gets next_driver_signature
     *
     * @return \OpenAPI\Client\Model\DvirBaseNextDriverSignature|null
     */
    public function getNextDriverSignature()
    {
        return $this->container['next_driver_signature'];
    }

    /**
     * Sets next_driver_signature
     *
     * @param \OpenAPI\Client\Model\DvirBaseNextDriverSignature|null $next_driver_signature next_driver_signature
     *
     * @return $this
     */
    public function setNextDriverSignature($next_driver_signature)
    {
        $this->container['next_driver_signature'] = $next_driver_signature;

        return $this;
    }

    /**
     * Gets odometer_miles
     *
     * @return int|null
     */
    public function getOdometerMiles()
    {
        return $this->container['odometer_miles'];
    }

    /**
     * Sets odometer_miles
     *
     * @param int|null $odometer_miles The odometer reading in miles for the vehicle when the DVIR was done.
     *
     * @return $this
     */
    public function setOdometerMiles($odometer_miles)
    {
        $this->container['odometer_miles'] = $odometer_miles;

        return $this;
    }

    /**
     * Gets time_ms
     *
     * @return int|null
     */
    public function getTimeMs()
    {
        return $this->container['time_ms'];
    }

    /**
     * Sets time_ms
     *
     * @param int|null $time_ms Timestamp of this DVIR in UNIX milliseconds.
     *
     * @return $this
     */
    public function setTimeMs($time_ms)
    {
        $this->container['time_ms'] = $time_ms;

        return $this;
    }

    /**
     * Gets trailer_defects
     *
     * @return \OpenAPI\Client\Model\DvirBaseTrailerDefects[]|null
     */
    public function getTrailerDefects()
    {
        return $this->container['trailer_defects'];
    }

    /**
     * Sets trailer_defects
     *
     * @param \OpenAPI\Client\Model\DvirBaseTrailerDefects[]|null $trailer_defects Defects registered for the trailer which was part of the DVIR.
     *
     * @return $this
     */
    public function setTrailerDefects($trailer_defects)
    {
        $this->container['trailer_defects'] = $trailer_defects;

        return $this;
    }

    /**
     * Gets trailer_id
     *
     * @return int|null
     */
    public function getTrailerId()
    {
        return $this->container['trailer_id'];
    }

    /**
     * Sets trailer_id
     *
     * @param int|null $trailer_id The id of the trailer which was part of the DVIR.
     *
     * @return $this
     */
    public function setTrailerId($trailer_id)
    {
        $this->container['trailer_id'] = $trailer_id;

        return $this;
    }

    /**
     * Gets trailer_name
     *
     * @return string|null
     */
    public function getTrailerName()
    {
        return $this->container['trailer_name'];
    }

    /**
     * Sets trailer_name
     *
     * @param string|null $trailer_name The name of the trailer which was part of the DVIR.
     *
     * @return $this
     */
    public function setTrailerName($trailer_name)
    {
        $this->container['trailer_name'] = $trailer_name;

        return $this;
    }

    /**
     * Gets vehicle
     *
     * @return \OpenAPI\Client\Model\DvirBaseVehicle|null
     */
    public function getVehicle()
    {
        return $this->container['vehicle'];
    }

    /**
     * Sets vehicle
     *
     * @param \OpenAPI\Client\Model\DvirBaseVehicle|null $vehicle vehicle
     *
     * @return $this
     */
    public function setVehicle($vehicle)
    {
        $this->container['vehicle'] = $vehicle;

        return $this;
    }

    /**
     * Gets vehicle_condition
     *
     * @return string|null
     */
    public function getVehicleCondition()
    {
        return $this->container['vehicle_condition'];
    }

    /**
     * Sets vehicle_condition
     *
     * @param string|null $vehicle_condition The condition of vechile on which DVIR was done.
     *
     * @return $this
     */
    public function setVehicleCondition($vehicle_condition)
    {
        $this->container['vehicle_condition'] = $vehicle_condition;

        return $this;
    }

    /**
     * Gets vehicle_defects
     *
     * @return \OpenAPI\Client\Model\DvirBaseTrailerDefects[]|null
     */
    public function getVehicleDefects()
    {
        return $this->container['vehicle_defects'];
    }

    /**
     * Sets vehicle_defects
     *
     * @param \OpenAPI\Client\Model\DvirBaseTrailerDefects[]|null $vehicle_defects Defects registered for the vehicle which was part of the DVIR.
     *
     * @return $this
     */
    public function setVehicleDefects($vehicle_defects)
    {
        $this->container['vehicle_defects'] = $vehicle_defects;

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


