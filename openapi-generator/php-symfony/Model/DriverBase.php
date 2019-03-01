<?php
/**
 * DriverBase
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
 * Class representing the DriverBase model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class DriverBase 
{
        /**
     * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     *
     * @var bool|null
     * @SerializedName("eldAdverseWeatherExemptionEnabled")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $eldAdverseWeatherExemptionEnabled;

    /**
     * Flag indicating this driver may use Big Day excemptions in ELD logs.
     *
     * @var bool|null
     * @SerializedName("eldBigDayExemptionEnabled")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $eldBigDayExemptionEnabled;

    /**
     * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     *
     * @var int|null
     * @SerializedName("eldDayStartHour")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $eldDayStartHour;

    /**
     * Flag indicating this driver is exempt from the Electronic Logging Mandate.
     *
     * @var bool|null
     * @SerializedName("eldExempt")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $eldExempt;

    /**
     * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     *
     * @var string|null
     * @SerializedName("eldExemptReason")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $eldExemptReason;

    /**
     * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     *
     * @var bool|null
     * @SerializedName("eldPcEnabled")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $eldPcEnabled;

    /**
     * Flag indicating this driver may select the Yard Move duty status in ELD logs.
     *
     * @var bool|null
     * @SerializedName("eldYmEnabled")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $eldYmEnabled;

    /**
     * Dictionary of external IDs (string key-value pairs)
     *
     * @var string[]|null
     * @SerializedName("externalIds")
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected $externalIds;

    /**
     * ID of the group if the organization has multiple groups (uncommon).
     *
     * @var int|null
     * @SerializedName("groupId")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $groupId;

    /**
     * Driver&#39;s state issued license number.
     *
     * @var string|null
     * @SerializedName("licenseNumber")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $licenseNumber;

    /**
     * Abbreviation of state that issued driver&#39;s license.
     *
     * @var string|null
     * @SerializedName("licenseState")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $licenseState;

    /**
     * Driver&#39;s name.
     *
     * @var string
     * @SerializedName("name")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * Notes about the driver.
     *
     * @var string|null
     * @SerializedName("notes")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $notes;

    /**
     * Driver&#39;s phone number. Please include only digits, ex. 4157771234
     *
     * @var string|null
     * @SerializedName("phone")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $phone;

    /**
     * Driver&#39;s login username into the driver app.
     *
     * @var string|null
     * @SerializedName("username")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $username;

    /**
     * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     *
     * @var int|null
     * @SerializedName("vehicleId")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $vehicleId;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->eldAdverseWeatherExemptionEnabled = isset($data['eldAdverseWeatherExemptionEnabled']) ? $data['eldAdverseWeatherExemptionEnabled'] : null;
        $this->eldBigDayExemptionEnabled = isset($data['eldBigDayExemptionEnabled']) ? $data['eldBigDayExemptionEnabled'] : null;
        $this->eldDayStartHour = isset($data['eldDayStartHour']) ? $data['eldDayStartHour'] : null;
        $this->eldExempt = isset($data['eldExempt']) ? $data['eldExempt'] : null;
        $this->eldExemptReason = isset($data['eldExemptReason']) ? $data['eldExemptReason'] : null;
        $this->eldPcEnabled = isset($data['eldPcEnabled']) ? $data['eldPcEnabled'] : false;
        $this->eldYmEnabled = isset($data['eldYmEnabled']) ? $data['eldYmEnabled'] : false;
        $this->externalIds = isset($data['externalIds']) ? $data['externalIds'] : null;
        $this->groupId = isset($data['groupId']) ? $data['groupId'] : null;
        $this->licenseNumber = isset($data['licenseNumber']) ? $data['licenseNumber'] : null;
        $this->licenseState = isset($data['licenseState']) ? $data['licenseState'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->notes = isset($data['notes']) ? $data['notes'] : null;
        $this->phone = isset($data['phone']) ? $data['phone'] : null;
        $this->username = isset($data['username']) ? $data['username'] : null;
        $this->vehicleId = isset($data['vehicleId']) ? $data['vehicleId'] : null;
    }

    /**
     * Gets eldAdverseWeatherExemptionEnabled.
     *
     * @return bool|null
     */
    public function isEldAdverseWeatherExemptionEnabled()
    {
        return $this->eldAdverseWeatherExemptionEnabled;
    }

    /**
     * Sets eldAdverseWeatherExemptionEnabled.
     *
     * @param bool|null $eldAdverseWeatherExemptionEnabled  Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     *
     * @return $this
     */
    public function setEldAdverseWeatherExemptionEnabled($eldAdverseWeatherExemptionEnabled = null)
    {
        $this->eldAdverseWeatherExemptionEnabled = $eldAdverseWeatherExemptionEnabled;

        return $this;
    }

    /**
     * Gets eldBigDayExemptionEnabled.
     *
     * @return bool|null
     */
    public function isEldBigDayExemptionEnabled()
    {
        return $this->eldBigDayExemptionEnabled;
    }

    /**
     * Sets eldBigDayExemptionEnabled.
     *
     * @param bool|null $eldBigDayExemptionEnabled  Flag indicating this driver may use Big Day excemptions in ELD logs.
     *
     * @return $this
     */
    public function setEldBigDayExemptionEnabled($eldBigDayExemptionEnabled = null)
    {
        $this->eldBigDayExemptionEnabled = $eldBigDayExemptionEnabled;

        return $this;
    }

    /**
     * Gets eldDayStartHour.
     *
     * @return int|null
     */
    public function getEldDayStartHour()
    {
        return $this->eldDayStartHour;
    }

    /**
     * Sets eldDayStartHour.
     *
     * @param int|null $eldDayStartHour  0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     *
     * @return $this
     */
    public function setEldDayStartHour($eldDayStartHour = null)
    {
        $this->eldDayStartHour = $eldDayStartHour;

        return $this;
    }

    /**
     * Gets eldExempt.
     *
     * @return bool|null
     */
    public function isEldExempt()
    {
        return $this->eldExempt;
    }

    /**
     * Sets eldExempt.
     *
     * @param bool|null $eldExempt  Flag indicating this driver is exempt from the Electronic Logging Mandate.
     *
     * @return $this
     */
    public function setEldExempt($eldExempt = null)
    {
        $this->eldExempt = $eldExempt;

        return $this;
    }

    /**
     * Gets eldExemptReason.
     *
     * @return string|null
     */
    public function getEldExemptReason()
    {
        return $this->eldExemptReason;
    }

    /**
     * Sets eldExemptReason.
     *
     * @param string|null $eldExemptReason  Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     *
     * @return $this
     */
    public function setEldExemptReason($eldExemptReason = null)
    {
        $this->eldExemptReason = $eldExemptReason;

        return $this;
    }

    /**
     * Gets eldPcEnabled.
     *
     * @return bool|null
     */
    public function isEldPcEnabled()
    {
        return $this->eldPcEnabled;
    }

    /**
     * Sets eldPcEnabled.
     *
     * @param bool|null $eldPcEnabled  Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     *
     * @return $this
     */
    public function setEldPcEnabled($eldPcEnabled = null)
    {
        $this->eldPcEnabled = $eldPcEnabled;

        return $this;
    }

    /**
     * Gets eldYmEnabled.
     *
     * @return bool|null
     */
    public function isEldYmEnabled()
    {
        return $this->eldYmEnabled;
    }

    /**
     * Sets eldYmEnabled.
     *
     * @param bool|null $eldYmEnabled  Flag indicating this driver may select the Yard Move duty status in ELD logs.
     *
     * @return $this
     */
    public function setEldYmEnabled($eldYmEnabled = null)
    {
        $this->eldYmEnabled = $eldYmEnabled;

        return $this;
    }

    /**
     * Gets externalIds.
     *
     * @return string[]|null
     */
    public function getExternalIds()
    {
        return $this->externalIds;
    }

    /**
     * Sets externalIds.
     *
     * @param string[]|null $externalIds  Dictionary of external IDs (string key-value pairs)
     *
     * @return $this
     */
    public function setExternalIds(array $externalIds = null)
    {
        $this->externalIds = $externalIds;

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
     * @param int|null $groupId  ID of the group if the organization has multiple groups (uncommon).
     *
     * @return $this
     */
    public function setGroupId($groupId = null)
    {
        $this->groupId = $groupId;

        return $this;
    }

    /**
     * Gets licenseNumber.
     *
     * @return string|null
     */
    public function getLicenseNumber()
    {
        return $this->licenseNumber;
    }

    /**
     * Sets licenseNumber.
     *
     * @param string|null $licenseNumber  Driver's state issued license number.
     *
     * @return $this
     */
    public function setLicenseNumber($licenseNumber = null)
    {
        $this->licenseNumber = $licenseNumber;

        return $this;
    }

    /**
     * Gets licenseState.
     *
     * @return string|null
     */
    public function getLicenseState()
    {
        return $this->licenseState;
    }

    /**
     * Sets licenseState.
     *
     * @param string|null $licenseState  Abbreviation of state that issued driver's license.
     *
     * @return $this
     */
    public function setLicenseState($licenseState = null)
    {
        $this->licenseState = $licenseState;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string $name  Driver's name.
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets notes.
     *
     * @return string|null
     */
    public function getNotes()
    {
        return $this->notes;
    }

    /**
     * Sets notes.
     *
     * @param string|null $notes  Notes about the driver.
     *
     * @return $this
     */
    public function setNotes($notes = null)
    {
        $this->notes = $notes;

        return $this;
    }

    /**
     * Gets phone.
     *
     * @return string|null
     */
    public function getPhone()
    {
        return $this->phone;
    }

    /**
     * Sets phone.
     *
     * @param string|null $phone  Driver's phone number. Please include only digits, ex. 4157771234
     *
     * @return $this
     */
    public function setPhone($phone = null)
    {
        $this->phone = $phone;

        return $this;
    }

    /**
     * Gets username.
     *
     * @return string|null
     */
    public function getUsername()
    {
        return $this->username;
    }

    /**
     * Sets username.
     *
     * @param string|null $username  Driver's login username into the driver app.
     *
     * @return $this
     */
    public function setUsername($username = null)
    {
        $this->username = $username;

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
     * @param int|null $vehicleId  ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     *
     * @return $this
     */
    public function setVehicleId($vehicleId = null)
    {
        $this->vehicleId = $vehicleId;

        return $this;
    }
}


