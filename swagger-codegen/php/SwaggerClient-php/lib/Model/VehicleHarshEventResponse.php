<?php
/**
 * VehicleHarshEventResponse
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
 * VehicleHarshEventResponse Class Doc Comment
 *
 * @category Class
 * @description Harsh event details for a vehicle
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class VehicleHarshEventResponse implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'VehicleHarshEventResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'download_forward_video_url' => 'string',
        'download_inward_video_url' => 'string',
        'download_tracked_inward_video_url' => 'string',
        'harsh_event_type' => 'string',
        'incident_report_url' => 'string',
        'is_distracted' => 'bool',
        'location' => '\Swagger\Client\Model\VehicleHarshEventResponseLocation'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'download_forward_video_url' => null,
        'download_inward_video_url' => null,
        'download_tracked_inward_video_url' => null,
        'harsh_event_type' => null,
        'incident_report_url' => null,
        'is_distracted' => null,
        'location' => null
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
        'download_forward_video_url' => 'downloadForwardVideoUrl',
        'download_inward_video_url' => 'downloadInwardVideoUrl',
        'download_tracked_inward_video_url' => 'downloadTrackedInwardVideoUrl',
        'harsh_event_type' => 'harshEventType',
        'incident_report_url' => 'incidentReportUrl',
        'is_distracted' => 'isDistracted',
        'location' => 'location'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'download_forward_video_url' => 'setDownloadForwardVideoUrl',
        'download_inward_video_url' => 'setDownloadInwardVideoUrl',
        'download_tracked_inward_video_url' => 'setDownloadTrackedInwardVideoUrl',
        'harsh_event_type' => 'setHarshEventType',
        'incident_report_url' => 'setIncidentReportUrl',
        'is_distracted' => 'setIsDistracted',
        'location' => 'setLocation'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'download_forward_video_url' => 'getDownloadForwardVideoUrl',
        'download_inward_video_url' => 'getDownloadInwardVideoUrl',
        'download_tracked_inward_video_url' => 'getDownloadTrackedInwardVideoUrl',
        'harsh_event_type' => 'getHarshEventType',
        'incident_report_url' => 'getIncidentReportUrl',
        'is_distracted' => 'getIsDistracted',
        'location' => 'getLocation'
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
        $this->container['download_forward_video_url'] = isset($data['download_forward_video_url']) ? $data['download_forward_video_url'] : null;
        $this->container['download_inward_video_url'] = isset($data['download_inward_video_url']) ? $data['download_inward_video_url'] : null;
        $this->container['download_tracked_inward_video_url'] = isset($data['download_tracked_inward_video_url']) ? $data['download_tracked_inward_video_url'] : null;
        $this->container['harsh_event_type'] = isset($data['harsh_event_type']) ? $data['harsh_event_type'] : null;
        $this->container['incident_report_url'] = isset($data['incident_report_url']) ? $data['incident_report_url'] : null;
        $this->container['is_distracted'] = isset($data['is_distracted']) ? $data['is_distracted'] : null;
        $this->container['location'] = isset($data['location']) ? $data['location'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['harsh_event_type'] === null) {
            $invalidProperties[] = "'harsh_event_type' can't be null";
        }
        if ($this->container['incident_report_url'] === null) {
            $invalidProperties[] = "'incident_report_url' can't be null";
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
     * Gets download_forward_video_url
     *
     * @return string
     */
    public function getDownloadForwardVideoUrl()
    {
        return $this->container['download_forward_video_url'];
    }

    /**
     * Sets download_forward_video_url
     *
     * @param string $download_forward_video_url URL for downloading the forward facing video
     *
     * @return $this
     */
    public function setDownloadForwardVideoUrl($download_forward_video_url)
    {
        $this->container['download_forward_video_url'] = $download_forward_video_url;

        return $this;
    }

    /**
     * Gets download_inward_video_url
     *
     * @return string
     */
    public function getDownloadInwardVideoUrl()
    {
        return $this->container['download_inward_video_url'];
    }

    /**
     * Sets download_inward_video_url
     *
     * @param string $download_inward_video_url URL for downloading the inward facing video
     *
     * @return $this
     */
    public function setDownloadInwardVideoUrl($download_inward_video_url)
    {
        $this->container['download_inward_video_url'] = $download_inward_video_url;

        return $this;
    }

    /**
     * Gets download_tracked_inward_video_url
     *
     * @return string
     */
    public function getDownloadTrackedInwardVideoUrl()
    {
        return $this->container['download_tracked_inward_video_url'];
    }

    /**
     * Sets download_tracked_inward_video_url
     *
     * @param string $download_tracked_inward_video_url URL for downloading the tracked inward facing video
     *
     * @return $this
     */
    public function setDownloadTrackedInwardVideoUrl($download_tracked_inward_video_url)
    {
        $this->container['download_tracked_inward_video_url'] = $download_tracked_inward_video_url;

        return $this;
    }

    /**
     * Gets harsh_event_type
     *
     * @return string
     */
    public function getHarshEventType()
    {
        return $this->container['harsh_event_type'];
    }

    /**
     * Sets harsh_event_type
     *
     * @param string $harsh_event_type Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
     *
     * @return $this
     */
    public function setHarshEventType($harsh_event_type)
    {
        $this->container['harsh_event_type'] = $harsh_event_type;

        return $this;
    }

    /**
     * Gets incident_report_url
     *
     * @return string
     */
    public function getIncidentReportUrl()
    {
        return $this->container['incident_report_url'];
    }

    /**
     * Sets incident_report_url
     *
     * @param string $incident_report_url URL of the associated incident report page
     *
     * @return $this
     */
    public function setIncidentReportUrl($incident_report_url)
    {
        $this->container['incident_report_url'] = $incident_report_url;

        return $this;
    }

    /**
     * Gets is_distracted
     *
     * @return bool
     */
    public function getIsDistracted()
    {
        return $this->container['is_distracted'];
    }

    /**
     * Sets is_distracted
     *
     * @param bool $is_distracted Whether the driver was deemed distracted during this harsh event
     *
     * @return $this
     */
    public function setIsDistracted($is_distracted)
    {
        $this->container['is_distracted'] = $is_distracted;

        return $this;
    }

    /**
     * Gets location
     *
     * @return \Swagger\Client\Model\VehicleHarshEventResponseLocation
     */
    public function getLocation()
    {
        return $this->container['location'];
    }

    /**
     * Sets location
     *
     * @param \Swagger\Client\Model\VehicleHarshEventResponseLocation $location location
     *
     * @return $this
     */
    public function setLocation($location)
    {
        $this->container['location'] = $location;

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


