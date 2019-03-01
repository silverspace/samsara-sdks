<?php
/**
 * HosLogsResponseLogs
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the HosLogsResponseLogs model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class HosLogsResponseLogs 
{
        /**
     * Longitude at which the log was recorded.
     *
     * @var double|null
     * @SerializedName("locLng")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $locLng;

    /**
     * The time at which the log/HOS status started in UNIX milliseconds.
     *
     * @var int|null
     * @SerializedName("logStartMs")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $logStartMs;

    /**
     * ID of the driver.
     *
     * @var int|null
     * @SerializedName("driverId")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $driverId;

    /**
     * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
     *
     * @var string|null
     * @SerializedName("statusType")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $statusType;

    /**
     * City in which the log was recorded.
     *
     * @var string|null
     * @SerializedName("locCity")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $locCity;

    /**
     * ID of the group.
     *
     * @var int|null
     * @SerializedName("groupId")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $groupId;

    /**
     * Name of location at which the log was recorded.
     *
     * @var string|null
     * @SerializedName("locName")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $locName;

    /**
     * Latitude at which the log was recorded.
     *
     * @var double|null
     * @SerializedName("locLat")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $locLat;

    /**
     * Remark associated with the log entry.
     *
     * @var string|null
     * @SerializedName("remark")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $remark;

    /**
     * State in which the log was recorded.
     *
     * @var string|null
     * @SerializedName("locState")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $locState;

    /**
     * ID of the vehicle.
     *
     * @var int|null
     * @SerializedName("vehicleId")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $vehicleId;

    /**
     * @var int[]|null
     * @SerializedName("codriverIds")
     * @Assert\All({
     *   @Assert\Type("int")
     * })
     * @Type("array<int>")
     */
    protected $codriverIds;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->locLng = isset($data['locLng']) ? $data['locLng'] : null;
        $this->logStartMs = isset($data['logStartMs']) ? $data['logStartMs'] : null;
        $this->driverId = isset($data['driverId']) ? $data['driverId'] : null;
        $this->statusType = isset($data['statusType']) ? $data['statusType'] : null;
        $this->locCity = isset($data['locCity']) ? $data['locCity'] : null;
        $this->groupId = isset($data['groupId']) ? $data['groupId'] : null;
        $this->locName = isset($data['locName']) ? $data['locName'] : null;
        $this->locLat = isset($data['locLat']) ? $data['locLat'] : null;
        $this->remark = isset($data['remark']) ? $data['remark'] : null;
        $this->locState = isset($data['locState']) ? $data['locState'] : null;
        $this->vehicleId = isset($data['vehicleId']) ? $data['vehicleId'] : null;
        $this->codriverIds = isset($data['codriverIds']) ? $data['codriverIds'] : null;
    }

    /**
     * Gets locLng.
     *
     * @return double|null
     */
    public function getLocLng()
    {
        return $this->locLng;
    }

    /**
     * Sets locLng.
     *
     * @param double|null $locLng  Longitude at which the log was recorded.
     *
     * @return $this
     */
    public function setLocLng($locLng = null)
    {
        $this->locLng = $locLng;

        return $this;
    }

    /**
     * Gets logStartMs.
     *
     * @return int|null
     */
    public function getLogStartMs()
    {
        return $this->logStartMs;
    }

    /**
     * Sets logStartMs.
     *
     * @param int|null $logStartMs  The time at which the log/HOS status started in UNIX milliseconds.
     *
     * @return $this
     */
    public function setLogStartMs($logStartMs = null)
    {
        $this->logStartMs = $logStartMs;

        return $this;
    }

    /**
     * Gets driverId.
     *
     * @return int|null
     */
    public function getDriverId()
    {
        return $this->driverId;
    }

    /**
     * Sets driverId.
     *
     * @param int|null $driverId  ID of the driver.
     *
     * @return $this
     */
    public function setDriverId($driverId = null)
    {
        $this->driverId = $driverId;

        return $this;
    }

    /**
     * Gets statusType.
     *
     * @return string|null
     */
    public function getStatusType()
    {
        return $this->statusType;
    }

    /**
     * Sets statusType.
     *
     * @param string|null $statusType  The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     *
     * @return $this
     */
    public function setStatusType($statusType = null)
    {
        $this->statusType = $statusType;

        return $this;
    }

    /**
     * Gets locCity.
     *
     * @return string|null
     */
    public function getLocCity()
    {
        return $this->locCity;
    }

    /**
     * Sets locCity.
     *
     * @param string|null $locCity  City in which the log was recorded.
     *
     * @return $this
     */
    public function setLocCity($locCity = null)
    {
        $this->locCity = $locCity;

        return $this;
    }

    /**
     * Gets groupId.
     *
     * @return int|null
     */
    public function getGroupId()
    {
        return $this->groupId;
    }

    /**
     * Sets groupId.
     *
     * @param int|null $groupId  ID of the group.
     *
     * @return $this
     */
    public function setGroupId($groupId = null)
    {
        $this->groupId = $groupId;

        return $this;
    }

    /**
     * Gets locName.
     *
     * @return string|null
     */
    public function getLocName()
    {
        return $this->locName;
    }

    /**
     * Sets locName.
     *
     * @param string|null $locName  Name of location at which the log was recorded.
     *
     * @return $this
     */
    public function setLocName($locName = null)
    {
        $this->locName = $locName;

        return $this;
    }

    /**
     * Gets locLat.
     *
     * @return double|null
     */
    public function getLocLat()
    {
        return $this->locLat;
    }

    /**
     * Sets locLat.
     *
     * @param double|null $locLat  Latitude at which the log was recorded.
     *
     * @return $this
     */
    public function setLocLat($locLat = null)
    {
        $this->locLat = $locLat;

        return $this;
    }

    /**
     * Gets remark.
     *
     * @return string|null
     */
    public function getRemark()
    {
        return $this->remark;
    }

    /**
     * Sets remark.
     *
     * @param string|null $remark  Remark associated with the log entry.
     *
     * @return $this
     */
    public function setRemark($remark = null)
    {
        $this->remark = $remark;

        return $this;
    }

    /**
     * Gets locState.
     *
     * @return string|null
     */
    public function getLocState()
    {
        return $this->locState;
    }

    /**
     * Sets locState.
     *
     * @param string|null $locState  State in which the log was recorded.
     *
     * @return $this
     */
    public function setLocState($locState = null)
    {
        $this->locState = $locState;

        return $this;
    }

    /**
     * Gets vehicleId.
     *
     * @return int|null
     */
    public function getVehicleId()
    {
        return $this->vehicleId;
    }

    /**
     * Sets vehicleId.
     *
     * @param int|null $vehicleId  ID of the vehicle.
     *
     * @return $this
     */
    public function setVehicleId($vehicleId = null)
    {
        $this->vehicleId = $vehicleId;

        return $this;
    }

    /**
     * Gets codriverIds.
     *
     * @return int[]|null
     */
    public function getCodriverIds()
    {
        return $this->codriverIds;
    }

    /**
     * Sets codriverIds.
     *
     * @param int[]|null $codriverIds
     *
     * @return $this
     */
    public function setCodriverIds(array $codriverIds = null)
    {
        $this->codriverIds = $codriverIds;

        return $this;
    }
}


