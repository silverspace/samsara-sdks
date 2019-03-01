<?php
/**
 * VehicleSafetyScoreResponse
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
 * Class representing the VehicleSafetyScoreResponse model.
 *
 * Safety score details for a vehicle
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class VehicleSafetyScoreResponse 
{
        /**
     * Crash event count
     *
     * @var int|null
     * @SerializedName("crashCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $crashCount;

    /**
     * Harsh acceleration event count
     *
     * @var int|null
     * @SerializedName("harshAccelCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $harshAccelCount;

    /**
     * Harsh braking event count
     *
     * @var int|null
     * @SerializedName("harshBrakingCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $harshBrakingCount;

    /**
     * @var OpenAPI\Server\Model\SafetyReportHarshEvent[]|null
     * @SerializedName("harshEvents")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\SafetyReportHarshEvent")
     * })
     * @Type("array<OpenAPI\Server\Model\SafetyReportHarshEvent>")
     */
    protected $harshEvents;

    /**
     * Harsh turning event count
     *
     * @var int|null
     * @SerializedName("harshTurningCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $harshTurningCount;

    /**
     * Safety Score
     *
     * @var int|null
     * @SerializedName("safetyScore")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $safetyScore;

    /**
     * Safety Score Rank
     *
     * @var string|null
     * @SerializedName("safetyScoreRank")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $safetyScoreRank;

    /**
     * Amount of time driven over the speed limit in milliseconds
     *
     * @var int|null
     * @SerializedName("timeOverSpeedLimitMs")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $timeOverSpeedLimitMs;

    /**
     * Total distance driven in meters
     *
     * @var int|null
     * @SerializedName("totalDistanceDrivenMeters")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $totalDistanceDrivenMeters;

    /**
     * Total harsh event count
     *
     * @var int|null
     * @SerializedName("totalHarshEventCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $totalHarshEventCount;

    /**
     * Amount of time driven in milliseconds
     *
     * @var int|null
     * @SerializedName("totalTimeDrivenMs")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $totalTimeDrivenMs;

    /**
     * Vehicle ID
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
        $this->crashCount = isset($data['crashCount']) ? $data['crashCount'] : null;
        $this->harshAccelCount = isset($data['harshAccelCount']) ? $data['harshAccelCount'] : null;
        $this->harshBrakingCount = isset($data['harshBrakingCount']) ? $data['harshBrakingCount'] : null;
        $this->harshEvents = isset($data['harshEvents']) ? $data['harshEvents'] : null;
        $this->harshTurningCount = isset($data['harshTurningCount']) ? $data['harshTurningCount'] : null;
        $this->safetyScore = isset($data['safetyScore']) ? $data['safetyScore'] : null;
        $this->safetyScoreRank = isset($data['safetyScoreRank']) ? $data['safetyScoreRank'] : null;
        $this->timeOverSpeedLimitMs = isset($data['timeOverSpeedLimitMs']) ? $data['timeOverSpeedLimitMs'] : null;
        $this->totalDistanceDrivenMeters = isset($data['totalDistanceDrivenMeters']) ? $data['totalDistanceDrivenMeters'] : null;
        $this->totalHarshEventCount = isset($data['totalHarshEventCount']) ? $data['totalHarshEventCount'] : null;
        $this->totalTimeDrivenMs = isset($data['totalTimeDrivenMs']) ? $data['totalTimeDrivenMs'] : null;
        $this->vehicleId = isset($data['vehicleId']) ? $data['vehicleId'] : null;
    }

    /**
     * Gets crashCount.
     *
     * @return int|null
     */
    public function getCrashCount()
    {
        return $this->crashCount;
    }

    /**
     * Sets crashCount.
     *
     * @param int|null $crashCount  Crash event count
     *
     * @return $this
     */
    public function setCrashCount($crashCount = null)
    {
        $this->crashCount = $crashCount;

        return $this;
    }

    /**
     * Gets harshAccelCount.
     *
     * @return int|null
     */
    public function getHarshAccelCount()
    {
        return $this->harshAccelCount;
    }

    /**
     * Sets harshAccelCount.
     *
     * @param int|null $harshAccelCount  Harsh acceleration event count
     *
     * @return $this
     */
    public function setHarshAccelCount($harshAccelCount = null)
    {
        $this->harshAccelCount = $harshAccelCount;

        return $this;
    }

    /**
     * Gets harshBrakingCount.
     *
     * @return int|null
     */
    public function getHarshBrakingCount()
    {
        return $this->harshBrakingCount;
    }

    /**
     * Sets harshBrakingCount.
     *
     * @param int|null $harshBrakingCount  Harsh braking event count
     *
     * @return $this
     */
    public function setHarshBrakingCount($harshBrakingCount = null)
    {
        $this->harshBrakingCount = $harshBrakingCount;

        return $this;
    }

    /**
     * Gets harshEvents.
     *
     * @return OpenAPI\Server\Model\SafetyReportHarshEvent[]|null
     */
    public function getHarshEvents()
    {
        return $this->harshEvents;
    }

    /**
     * Sets harshEvents.
     *
     * @param OpenAPI\Server\Model\SafetyReportHarshEvent[]|null $harshEvents
     *
     * @return $this
     */
    public function setHarshEvents(array $harshEvents = null)
    {
        $this->harshEvents = $harshEvents;

        return $this;
    }

    /**
     * Gets harshTurningCount.
     *
     * @return int|null
     */
    public function getHarshTurningCount()
    {
        return $this->harshTurningCount;
    }

    /**
     * Sets harshTurningCount.
     *
     * @param int|null $harshTurningCount  Harsh turning event count
     *
     * @return $this
     */
    public function setHarshTurningCount($harshTurningCount = null)
    {
        $this->harshTurningCount = $harshTurningCount;

        return $this;
    }

    /**
     * Gets safetyScore.
     *
     * @return int|null
     */
    public function getSafetyScore()
    {
        return $this->safetyScore;
    }

    /**
     * Sets safetyScore.
     *
     * @param int|null $safetyScore  Safety Score
     *
     * @return $this
     */
    public function setSafetyScore($safetyScore = null)
    {
        $this->safetyScore = $safetyScore;

        return $this;
    }

    /**
     * Gets safetyScoreRank.
     *
     * @return string|null
     */
    public function getSafetyScoreRank()
    {
        return $this->safetyScoreRank;
    }

    /**
     * Sets safetyScoreRank.
     *
     * @param string|null $safetyScoreRank  Safety Score Rank
     *
     * @return $this
     */
    public function setSafetyScoreRank($safetyScoreRank = null)
    {
        $this->safetyScoreRank = $safetyScoreRank;

        return $this;
    }

    /**
     * Gets timeOverSpeedLimitMs.
     *
     * @return int|null
     */
    public function getTimeOverSpeedLimitMs()
    {
        return $this->timeOverSpeedLimitMs;
    }

    /**
     * Sets timeOverSpeedLimitMs.
     *
     * @param int|null $timeOverSpeedLimitMs  Amount of time driven over the speed limit in milliseconds
     *
     * @return $this
     */
    public function setTimeOverSpeedLimitMs($timeOverSpeedLimitMs = null)
    {
        $this->timeOverSpeedLimitMs = $timeOverSpeedLimitMs;

        return $this;
    }

    /**
     * Gets totalDistanceDrivenMeters.
     *
     * @return int|null
     */
    public function getTotalDistanceDrivenMeters()
    {
        return $this->totalDistanceDrivenMeters;
    }

    /**
     * Sets totalDistanceDrivenMeters.
     *
     * @param int|null $totalDistanceDrivenMeters  Total distance driven in meters
     *
     * @return $this
     */
    public function setTotalDistanceDrivenMeters($totalDistanceDrivenMeters = null)
    {
        $this->totalDistanceDrivenMeters = $totalDistanceDrivenMeters;

        return $this;
    }

    /**
     * Gets totalHarshEventCount.
     *
     * @return int|null
     */
    public function getTotalHarshEventCount()
    {
        return $this->totalHarshEventCount;
    }

    /**
     * Sets totalHarshEventCount.
     *
     * @param int|null $totalHarshEventCount  Total harsh event count
     *
     * @return $this
     */
    public function setTotalHarshEventCount($totalHarshEventCount = null)
    {
        $this->totalHarshEventCount = $totalHarshEventCount;

        return $this;
    }

    /**
     * Gets totalTimeDrivenMs.
     *
     * @return int|null
     */
    public function getTotalTimeDrivenMs()
    {
        return $this->totalTimeDrivenMs;
    }

    /**
     * Sets totalTimeDrivenMs.
     *
     * @param int|null $totalTimeDrivenMs  Amount of time driven in milliseconds
     *
     * @return $this
     */
    public function setTotalTimeDrivenMs($totalTimeDrivenMs = null)
    {
        $this->totalTimeDrivenMs = $totalTimeDrivenMs;

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
     * @param int|null $vehicleId  Vehicle ID
     *
     * @return $this
     */
    public function setVehicleId($vehicleId = null)
    {
        $this->vehicleId = $vehicleId;

        return $this;
    }
}


