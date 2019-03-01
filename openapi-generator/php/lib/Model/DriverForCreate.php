<?php
/**
 * DriverForCreate
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
 * DriverForCreate Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class DriverForCreate implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'DriverForCreate';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'eld_adverse_weather_exemption_enabled' => 'bool',
        'eld_big_day_exemption_enabled' => 'bool',
        'eld_day_start_hour' => 'int',
        'eld_exempt' => 'bool',
        'eld_exempt_reason' => 'string',
        'eld_pc_enabled' => 'bool',
        'eld_ym_enabled' => 'bool',
        'external_ids' => 'map[string,string]',
        'group_id' => 'int',
        'license_number' => 'string',
        'license_state' => 'string',
        'name' => 'string',
        'notes' => 'string',
        'phone' => 'string',
        'username' => 'string',
        'vehicle_id' => 'int',
        'password' => 'string',
        'tag_ids' => 'int[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'eld_adverse_weather_exemption_enabled' => null,
        'eld_big_day_exemption_enabled' => null,
        'eld_day_start_hour' => null,
        'eld_exempt' => null,
        'eld_exempt_reason' => null,
        'eld_pc_enabled' => null,
        'eld_ym_enabled' => null,
        'external_ids' => null,
        'group_id' => 'int64',
        'license_number' => null,
        'license_state' => null,
        'name' => null,
        'notes' => null,
        'phone' => null,
        'username' => null,
        'vehicle_id' => 'int64',
        'password' => null,
        'tag_ids' => 'int64'
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
        'eld_adverse_weather_exemption_enabled' => 'eldAdverseWeatherExemptionEnabled',
        'eld_big_day_exemption_enabled' => 'eldBigDayExemptionEnabled',
        'eld_day_start_hour' => 'eldDayStartHour',
        'eld_exempt' => 'eldExempt',
        'eld_exempt_reason' => 'eldExemptReason',
        'eld_pc_enabled' => 'eldPcEnabled',
        'eld_ym_enabled' => 'eldYmEnabled',
        'external_ids' => 'externalIds',
        'group_id' => 'groupId',
        'license_number' => 'licenseNumber',
        'license_state' => 'licenseState',
        'name' => 'name',
        'notes' => 'notes',
        'phone' => 'phone',
        'username' => 'username',
        'vehicle_id' => 'vehicleId',
        'password' => 'password',
        'tag_ids' => 'tagIds'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'eld_adverse_weather_exemption_enabled' => 'setEldAdverseWeatherExemptionEnabled',
        'eld_big_day_exemption_enabled' => 'setEldBigDayExemptionEnabled',
        'eld_day_start_hour' => 'setEldDayStartHour',
        'eld_exempt' => 'setEldExempt',
        'eld_exempt_reason' => 'setEldExemptReason',
        'eld_pc_enabled' => 'setEldPcEnabled',
        'eld_ym_enabled' => 'setEldYmEnabled',
        'external_ids' => 'setExternalIds',
        'group_id' => 'setGroupId',
        'license_number' => 'setLicenseNumber',
        'license_state' => 'setLicenseState',
        'name' => 'setName',
        'notes' => 'setNotes',
        'phone' => 'setPhone',
        'username' => 'setUsername',
        'vehicle_id' => 'setVehicleId',
        'password' => 'setPassword',
        'tag_ids' => 'setTagIds'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'eld_adverse_weather_exemption_enabled' => 'getEldAdverseWeatherExemptionEnabled',
        'eld_big_day_exemption_enabled' => 'getEldBigDayExemptionEnabled',
        'eld_day_start_hour' => 'getEldDayStartHour',
        'eld_exempt' => 'getEldExempt',
        'eld_exempt_reason' => 'getEldExemptReason',
        'eld_pc_enabled' => 'getEldPcEnabled',
        'eld_ym_enabled' => 'getEldYmEnabled',
        'external_ids' => 'getExternalIds',
        'group_id' => 'getGroupId',
        'license_number' => 'getLicenseNumber',
        'license_state' => 'getLicenseState',
        'name' => 'getName',
        'notes' => 'getNotes',
        'phone' => 'getPhone',
        'username' => 'getUsername',
        'vehicle_id' => 'getVehicleId',
        'password' => 'getPassword',
        'tag_ids' => 'getTagIds'
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
        $this->container['eld_adverse_weather_exemption_enabled'] = isset($data['eld_adverse_weather_exemption_enabled']) ? $data['eld_adverse_weather_exemption_enabled'] : null;
        $this->container['eld_big_day_exemption_enabled'] = isset($data['eld_big_day_exemption_enabled']) ? $data['eld_big_day_exemption_enabled'] : null;
        $this->container['eld_day_start_hour'] = isset($data['eld_day_start_hour']) ? $data['eld_day_start_hour'] : null;
        $this->container['eld_exempt'] = isset($data['eld_exempt']) ? $data['eld_exempt'] : null;
        $this->container['eld_exempt_reason'] = isset($data['eld_exempt_reason']) ? $data['eld_exempt_reason'] : null;
        $this->container['eld_pc_enabled'] = isset($data['eld_pc_enabled']) ? $data['eld_pc_enabled'] : false;
        $this->container['eld_ym_enabled'] = isset($data['eld_ym_enabled']) ? $data['eld_ym_enabled'] : false;
        $this->container['external_ids'] = isset($data['external_ids']) ? $data['external_ids'] : null;
        $this->container['group_id'] = isset($data['group_id']) ? $data['group_id'] : null;
        $this->container['license_number'] = isset($data['license_number']) ? $data['license_number'] : null;
        $this->container['license_state'] = isset($data['license_state']) ? $data['license_state'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['notes'] = isset($data['notes']) ? $data['notes'] : null;
        $this->container['phone'] = isset($data['phone']) ? $data['phone'] : null;
        $this->container['username'] = isset($data['username']) ? $data['username'] : null;
        $this->container['vehicle_id'] = isset($data['vehicle_id']) ? $data['vehicle_id'] : null;
        $this->container['password'] = isset($data['password']) ? $data['password'] : null;
        $this->container['tag_ids'] = isset($data['tag_ids']) ? $data['tag_ids'] : null;
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
        if ($this->container['password'] === null) {
            $invalidProperties[] = "'password' can't be null";
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
     * Gets eld_adverse_weather_exemption_enabled
     *
     * @return bool|null
     */
    public function getEldAdverseWeatherExemptionEnabled()
    {
        return $this->container['eld_adverse_weather_exemption_enabled'];
    }

    /**
     * Sets eld_adverse_weather_exemption_enabled
     *
     * @param bool|null $eld_adverse_weather_exemption_enabled Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     *
     * @return $this
     */
    public function setEldAdverseWeatherExemptionEnabled($eld_adverse_weather_exemption_enabled)
    {
        $this->container['eld_adverse_weather_exemption_enabled'] = $eld_adverse_weather_exemption_enabled;

        return $this;
    }

    /**
     * Gets eld_big_day_exemption_enabled
     *
     * @return bool|null
     */
    public function getEldBigDayExemptionEnabled()
    {
        return $this->container['eld_big_day_exemption_enabled'];
    }

    /**
     * Sets eld_big_day_exemption_enabled
     *
     * @param bool|null $eld_big_day_exemption_enabled Flag indicating this driver may use Big Day excemptions in ELD logs.
     *
     * @return $this
     */
    public function setEldBigDayExemptionEnabled($eld_big_day_exemption_enabled)
    {
        $this->container['eld_big_day_exemption_enabled'] = $eld_big_day_exemption_enabled;

        return $this;
    }

    /**
     * Gets eld_day_start_hour
     *
     * @return int|null
     */
    public function getEldDayStartHour()
    {
        return $this->container['eld_day_start_hour'];
    }

    /**
     * Sets eld_day_start_hour
     *
     * @param int|null $eld_day_start_hour 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     *
     * @return $this
     */
    public function setEldDayStartHour($eld_day_start_hour)
    {
        $this->container['eld_day_start_hour'] = $eld_day_start_hour;

        return $this;
    }

    /**
     * Gets eld_exempt
     *
     * @return bool|null
     */
    public function getEldExempt()
    {
        return $this->container['eld_exempt'];
    }

    /**
     * Sets eld_exempt
     *
     * @param bool|null $eld_exempt Flag indicating this driver is exempt from the Electronic Logging Mandate.
     *
     * @return $this
     */
    public function setEldExempt($eld_exempt)
    {
        $this->container['eld_exempt'] = $eld_exempt;

        return $this;
    }

    /**
     * Gets eld_exempt_reason
     *
     * @return string|null
     */
    public function getEldExemptReason()
    {
        return $this->container['eld_exempt_reason'];
    }

    /**
     * Sets eld_exempt_reason
     *
     * @param string|null $eld_exempt_reason Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     *
     * @return $this
     */
    public function setEldExemptReason($eld_exempt_reason)
    {
        $this->container['eld_exempt_reason'] = $eld_exempt_reason;

        return $this;
    }

    /**
     * Gets eld_pc_enabled
     *
     * @return bool|null
     */
    public function getEldPcEnabled()
    {
        return $this->container['eld_pc_enabled'];
    }

    /**
     * Sets eld_pc_enabled
     *
     * @param bool|null $eld_pc_enabled Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     *
     * @return $this
     */
    public function setEldPcEnabled($eld_pc_enabled)
    {
        $this->container['eld_pc_enabled'] = $eld_pc_enabled;

        return $this;
    }

    /**
     * Gets eld_ym_enabled
     *
     * @return bool|null
     */
    public function getEldYmEnabled()
    {
        return $this->container['eld_ym_enabled'];
    }

    /**
     * Sets eld_ym_enabled
     *
     * @param bool|null $eld_ym_enabled Flag indicating this driver may select the Yard Move duty status in ELD logs.
     *
     * @return $this
     */
    public function setEldYmEnabled($eld_ym_enabled)
    {
        $this->container['eld_ym_enabled'] = $eld_ym_enabled;

        return $this;
    }

    /**
     * Gets external_ids
     *
     * @return map[string,string]|null
     */
    public function getExternalIds()
    {
        return $this->container['external_ids'];
    }

    /**
     * Sets external_ids
     *
     * @param map[string,string]|null $external_ids Dictionary of external IDs (string key-value pairs)
     *
     * @return $this
     */
    public function setExternalIds($external_ids)
    {
        $this->container['external_ids'] = $external_ids;

        return $this;
    }

    /**
     * Gets group_id
     *
     * @return int|null
     */
    public function getGroupId()
    {
        return $this->container['group_id'];
    }

    /**
     * Sets group_id
     *
     * @param int|null $group_id ID of the group if the organization has multiple groups (uncommon).
     *
     * @return $this
     */
    public function setGroupId($group_id)
    {
        $this->container['group_id'] = $group_id;

        return $this;
    }

    /**
     * Gets license_number
     *
     * @return string|null
     */
    public function getLicenseNumber()
    {
        return $this->container['license_number'];
    }

    /**
     * Sets license_number
     *
     * @param string|null $license_number Driver's state issued license number.
     *
     * @return $this
     */
    public function setLicenseNumber($license_number)
    {
        $this->container['license_number'] = $license_number;

        return $this;
    }

    /**
     * Gets license_state
     *
     * @return string|null
     */
    public function getLicenseState()
    {
        return $this->container['license_state'];
    }

    /**
     * Sets license_state
     *
     * @param string|null $license_state Abbreviation of state that issued driver's license.
     *
     * @return $this
     */
    public function setLicenseState($license_state)
    {
        $this->container['license_state'] = $license_state;

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
     * @param string $name Driver's name.
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

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
     * @param string|null $notes Notes about the driver.
     *
     * @return $this
     */
    public function setNotes($notes)
    {
        $this->container['notes'] = $notes;

        return $this;
    }

    /**
     * Gets phone
     *
     * @return string|null
     */
    public function getPhone()
    {
        return $this->container['phone'];
    }

    /**
     * Sets phone
     *
     * @param string|null $phone Driver's phone number. Please include only digits, ex. 4157771234
     *
     * @return $this
     */
    public function setPhone($phone)
    {
        $this->container['phone'] = $phone;

        return $this;
    }

    /**
     * Gets username
     *
     * @return string|null
     */
    public function getUsername()
    {
        return $this->container['username'];
    }

    /**
     * Sets username
     *
     * @param string|null $username Driver's login username into the driver app.
     *
     * @return $this
     */
    public function setUsername($username)
    {
        $this->container['username'] = $username;

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
     * @param int|null $vehicle_id ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     *
     * @return $this
     */
    public function setVehicleId($vehicle_id)
    {
        $this->container['vehicle_id'] = $vehicle_id;

        return $this;
    }

    /**
     * Gets password
     *
     * @return string
     */
    public function getPassword()
    {
        return $this->container['password'];
    }

    /**
     * Sets password
     *
     * @param string $password Driver's password for the driver app.
     *
     * @return $this
     */
    public function setPassword($password)
    {
        $this->container['password'] = $password;

        return $this;
    }

    /**
     * Gets tag_ids
     *
     * @return int[]|null
     */
    public function getTagIds()
    {
        return $this->container['tag_ids'];
    }

    /**
     * Sets tag_ids
     *
     * @param int[]|null $tag_ids A list of tag IDs.
     *
     * @return $this
     */
    public function setTagIds($tag_ids)
    {
        $this->container['tag_ids'] = $tag_ids;

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


