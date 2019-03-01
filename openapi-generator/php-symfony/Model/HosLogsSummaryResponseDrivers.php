<?php
/**
 * HosLogsSummaryResponseDrivers
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
 * Class representing the HosLogsSummaryResponseDrivers model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class HosLogsSummaryResponseDrivers 
{
        /**
     * The amount of time (in ms) remaining until the driver cannot drive without a rest break.
     *
     * @var int|null
     * @SerializedName("timeUntilBreak")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $timeUntilBreak;

    /**
     * Name of the vehicle.
     *
     * @var string|null
     * @SerializedName("vehicleName")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $vehicleName;

    /**
     * The amount of driving time in violation today (in ms).
     *
     * @var int|null
     * @SerializedName("drivingInViolationToday")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $drivingInViolationToday;

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
     * The amount of remaining cycle time (in ms).
     *
     * @var int|null
     * @SerializedName("cycleRemaining")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $cycleRemaining;

    /**
     * Name of the driver.
     *
     * @var string|null
     * @SerializedName("driverName")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $driverName;

    /**
     * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
     *
     * @var string|null
     * @SerializedName("dutyStatus")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $dutyStatus;

    /**
     * The amount of cycle time (in ms) available tomorrow.
     *
     * @var int|null
     * @SerializedName("cycleTomorrow")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $cycleTomorrow;

    /**
     * The amount of remaining shift drive time (in ms).
     *
     * @var int|null
     * @SerializedName("shiftDriveRemaining")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $shiftDriveRemaining;

    /**
     * The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
     *
     * @var int|null
     * @SerializedName("timeInCurrentStatus")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $timeInCurrentStatus;

    /**
     * The amount of driving time in violation in this cycle (in ms).
     *
     * @var int|null
     * @SerializedName("drivingInViolationCycle")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $drivingInViolationCycle;

    /**
     * The amount of remaining shift time (in ms).
     *
     * @var int|null
     * @SerializedName("shiftRemaining")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $shiftRemaining;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->timeUntilBreak = isset($data['timeUntilBreak']) ? $data['timeUntilBreak'] : null;
        $this->vehicleName = isset($data['vehicleName']) ? $data['vehicleName'] : null;
        $this->drivingInViolationToday = isset($data['drivingInViolationToday']) ? $data['drivingInViolationToday'] : null;
        $this->driverId = isset($data['driverId']) ? $data['driverId'] : null;
        $this->cycleRemaining = isset($data['cycleRemaining']) ? $data['cycleRemaining'] : null;
        $this->driverName = isset($data['driverName']) ? $data['driverName'] : null;
        $this->dutyStatus = isset($data['dutyStatus']) ? $data['dutyStatus'] : null;
        $this->cycleTomorrow = isset($data['cycleTomorrow']) ? $data['cycleTomorrow'] : null;
        $this->shiftDriveRemaining = isset($data['shiftDriveRemaining']) ? $data['shiftDriveRemaining'] : null;
        $this->timeInCurrentStatus = isset($data['timeInCurrentStatus']) ? $data['timeInCurrentStatus'] : null;
        $this->drivingInViolationCycle = isset($data['drivingInViolationCycle']) ? $data['drivingInViolationCycle'] : null;
        $this->shiftRemaining = isset($data['shiftRemaining']) ? $data['shiftRemaining'] : null;
    }

    /**
     * Gets timeUntilBreak.
     *
     * @return int|null
     */
    public function getTimeUntilBreak()
    {
        return $this->timeUntilBreak;
    }

    /**
     * Sets timeUntilBreak.
     *
     * @param int|null $timeUntilBreak  The amount of time (in ms) remaining until the driver cannot drive without a rest break.
     *
     * @return $this
     */
    public function setTimeUntilBreak($timeUntilBreak = null)
    {
        $this->timeUntilBreak = $timeUntilBreak;

        return $this;
    }

    /**
     * Gets vehicleName.
     *
     * @return string|null
     */
    public function getVehicleName()
    {
        return $this->vehicleName;
    }

    /**
     * Sets vehicleName.
     *
     * @param string|null $vehicleName  Name of the vehicle.
     *
     * @return $this
     */
    public function setVehicleName($vehicleName = null)
    {
        $this->vehicleName = $vehicleName;

        return $this;
    }

    /**
     * Gets drivingInViolationToday.
     *
     * @return int|null
     */
    public function getDrivingInViolationToday()
    {
        return $this->drivingInViolationToday;
    }

    /**
     * Sets drivingInViolationToday.
     *
     * @param int|null $drivingInViolationToday  The amount of driving time in violation today (in ms).
     *
     * @return $this
     */
    public function setDrivingInViolationToday($drivingInViolationToday = null)
    {
        $this->drivingInViolationToday = $drivingInViolationToday;

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
     * Gets cycleRemaining.
     *
     * @return int|null
     */
    public function getCycleRemaining()
    {
        return $this->cycleRemaining;
    }

    /**
     * Sets cycleRemaining.
     *
     * @param int|null $cycleRemaining  The amount of remaining cycle time (in ms).
     *
     * @return $this
     */
    public function setCycleRemaining($cycleRemaining = null)
    {
        $this->cycleRemaining = $cycleRemaining;

        return $this;
    }

    /**
     * Gets driverName.
     *
     * @return string|null
     */
    public function getDriverName()
    {
        return $this->driverName;
    }

    /**
     * Sets driverName.
     *
     * @param string|null $driverName  Name of the driver.
     *
     * @return $this
     */
    public function setDriverName($driverName = null)
    {
        $this->driverName = $driverName;

        return $this;
    }

    /**
     * Gets dutyStatus.
     *
     * @return string|null
     */
    public function getDutyStatus()
    {
        return $this->dutyStatus;
    }

    /**
     * Sets dutyStatus.
     *
     * @param string|null $dutyStatus  The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     *
     * @return $this
     */
    public function setDutyStatus($dutyStatus = null)
    {
        $this->dutyStatus = $dutyStatus;

        return $this;
    }

    /**
     * Gets cycleTomorrow.
     *
     * @return int|null
     */
    public function getCycleTomorrow()
    {
        return $this->cycleTomorrow;
    }

    /**
     * Sets cycleTomorrow.
     *
     * @param int|null $cycleTomorrow  The amount of cycle time (in ms) available tomorrow.
     *
     * @return $this
     */
    public function setCycleTomorrow($cycleTomorrow = null)
    {
        $this->cycleTomorrow = $cycleTomorrow;

        return $this;
    }

    /**
     * Gets shiftDriveRemaining.
     *
     * @return int|null
     */
    public function getShiftDriveRemaining()
    {
        return $this->shiftDriveRemaining;
    }

    /**
     * Sets shiftDriveRemaining.
     *
     * @param int|null $shiftDriveRemaining  The amount of remaining shift drive time (in ms).
     *
     * @return $this
     */
    public function setShiftDriveRemaining($shiftDriveRemaining = null)
    {
        $this->shiftDriveRemaining = $shiftDriveRemaining;

        return $this;
    }

    /**
     * Gets timeInCurrentStatus.
     *
     * @return int|null
     */
    public function getTimeInCurrentStatus()
    {
        return $this->timeInCurrentStatus;
    }

    /**
     * Sets timeInCurrentStatus.
     *
     * @param int|null $timeInCurrentStatus  The amount of time (in ms) that the driver has been in the current `dutyStatus`.
     *
     * @return $this
     */
    public function setTimeInCurrentStatus($timeInCurrentStatus = null)
    {
        $this->timeInCurrentStatus = $timeInCurrentStatus;

        return $this;
    }

    /**
     * Gets drivingInViolationCycle.
     *
     * @return int|null
     */
    public function getDrivingInViolationCycle()
    {
        return $this->drivingInViolationCycle;
    }

    /**
     * Sets drivingInViolationCycle.
     *
     * @param int|null $drivingInViolationCycle  The amount of driving time in violation in this cycle (in ms).
     *
     * @return $this
     */
    public function setDrivingInViolationCycle($drivingInViolationCycle = null)
    {
        $this->drivingInViolationCycle = $drivingInViolationCycle;

        return $this;
    }

    /**
     * Gets shiftRemaining.
     *
     * @return int|null
     */
    public function getShiftRemaining()
    {
        return $this->shiftRemaining;
    }

    /**
     * Sets shiftRemaining.
     *
     * @param int|null $shiftRemaining  The amount of remaining shift time (in ms).
     *
     * @return $this
     */
    public function setShiftRemaining($shiftRemaining = null)
    {
        $this->shiftRemaining = $shiftRemaining;

        return $this;
    }
}


