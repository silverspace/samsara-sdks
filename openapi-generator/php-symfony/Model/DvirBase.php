<?php
/**
 * DvirBase
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
 * Class representing the DvirBase model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class DvirBase 
{
        /**
     * @var OpenAPI\Server\Model\DvirBaseAuthorSignature|null
     * @SerializedName("authorSignature")
     * @Assert\Type("OpenAPI\Server\Model\DvirBaseAuthorSignature")
     * @Type("OpenAPI\Server\Model\DvirBaseAuthorSignature")
     */
    protected $authorSignature;

    /**
     * Signifies if the defects on the vehicle corrected after the DVIR is done.
     *
     * @var bool|null
     * @SerializedName("defectsCorrected")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $defectsCorrected;

    /**
     * Signifies if the defects on this vehicle can be ignored.
     *
     * @var bool|null
     * @SerializedName("defectsNeedNotBeCorrected")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $defectsNeedNotBeCorrected;

    /**
     * The id of this DVIR record.
     *
     * @var int|null
     * @SerializedName("id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $id;

    /**
     * Inspection type of the DVIR.
     *
     * @var string|null
     * @SerializedName("inspectionType")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $inspectionType;

    /**
     * The mechanics notes on the DVIR.
     *
     * @var string|null
     * @SerializedName("mechanicNotes")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $mechanicNotes;

    /**
     * @var OpenAPI\Server\Model\DvirBaseMechanicOrAgentSignature|null
     * @SerializedName("mechanicOrAgentSignature")
     * @Assert\Type("OpenAPI\Server\Model\DvirBaseMechanicOrAgentSignature")
     * @Type("OpenAPI\Server\Model\DvirBaseMechanicOrAgentSignature")
     */
    protected $mechanicOrAgentSignature;

    /**
     * @var OpenAPI\Server\Model\DvirBaseNextDriverSignature|null
     * @SerializedName("nextDriverSignature")
     * @Assert\Type("OpenAPI\Server\Model\DvirBaseNextDriverSignature")
     * @Type("OpenAPI\Server\Model\DvirBaseNextDriverSignature")
     */
    protected $nextDriverSignature;

    /**
     * The odometer reading in miles for the vehicle when the DVIR was done.
     *
     * @var int|null
     * @SerializedName("odometerMiles")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $odometerMiles;

    /**
     * Timestamp of this DVIR in UNIX milliseconds.
     *
     * @var int|null
     * @SerializedName("timeMs")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $timeMs;

    /**
     * Defects registered for the trailer which was part of the DVIR.
     *
     * @var OpenAPI\Server\Model\DvirBaseTrailerDefects[]|null
     * @SerializedName("trailerDefects")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\DvirBaseTrailerDefects")
     * })
     * @Type("array<OpenAPI\Server\Model\DvirBaseTrailerDefects>")
     */
    protected $trailerDefects;

    /**
     * The id of the trailer which was part of the DVIR.
     *
     * @var int|null
     * @SerializedName("trailerId")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $trailerId;

    /**
     * The name of the trailer which was part of the DVIR.
     *
     * @var string|null
     * @SerializedName("trailerName")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $trailerName;

    /**
     * @var OpenAPI\Server\Model\DvirBaseVehicle|null
     * @SerializedName("vehicle")
     * @Assert\Type("OpenAPI\Server\Model\DvirBaseVehicle")
     * @Type("OpenAPI\Server\Model\DvirBaseVehicle")
     */
    protected $vehicle;

    /**
     * The condition of vechile on which DVIR was done.
     *
     * @var string|null
     * @SerializedName("vehicleCondition")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $vehicleCondition;

    /**
     * Defects registered for the vehicle which was part of the DVIR.
     *
     * @var OpenAPI\Server\Model\DvirBaseTrailerDefects[]|null
     * @SerializedName("vehicleDefects")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\DvirBaseTrailerDefects")
     * })
     * @Type("array<OpenAPI\Server\Model\DvirBaseTrailerDefects>")
     */
    protected $vehicleDefects;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->authorSignature = isset($data['authorSignature']) ? $data['authorSignature'] : null;
        $this->defectsCorrected = isset($data['defectsCorrected']) ? $data['defectsCorrected'] : null;
        $this->defectsNeedNotBeCorrected = isset($data['defectsNeedNotBeCorrected']) ? $data['defectsNeedNotBeCorrected'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->inspectionType = isset($data['inspectionType']) ? $data['inspectionType'] : null;
        $this->mechanicNotes = isset($data['mechanicNotes']) ? $data['mechanicNotes'] : null;
        $this->mechanicOrAgentSignature = isset($data['mechanicOrAgentSignature']) ? $data['mechanicOrAgentSignature'] : null;
        $this->nextDriverSignature = isset($data['nextDriverSignature']) ? $data['nextDriverSignature'] : null;
        $this->odometerMiles = isset($data['odometerMiles']) ? $data['odometerMiles'] : null;
        $this->timeMs = isset($data['timeMs']) ? $data['timeMs'] : null;
        $this->trailerDefects = isset($data['trailerDefects']) ? $data['trailerDefects'] : null;
        $this->trailerId = isset($data['trailerId']) ? $data['trailerId'] : null;
        $this->trailerName = isset($data['trailerName']) ? $data['trailerName'] : null;
        $this->vehicle = isset($data['vehicle']) ? $data['vehicle'] : null;
        $this->vehicleCondition = isset($data['vehicleCondition']) ? $data['vehicleCondition'] : null;
        $this->vehicleDefects = isset($data['vehicleDefects']) ? $data['vehicleDefects'] : null;
    }

    /**
     * Gets authorSignature.
     *
     * @return OpenAPI\Server\Model\DvirBaseAuthorSignature|null
     */
    public function getAuthorSignature()
    {
        return $this->authorSignature;
    }

    /**
     * Sets authorSignature.
     *
     * @param OpenAPI\Server\Model\DvirBaseAuthorSignature|null $authorSignature
     *
     * @return $this
     */
    public function setAuthorSignature(DvirBaseAuthorSignature $authorSignature = null)
    {
        $this->authorSignature = $authorSignature;

        return $this;
    }

    /**
     * Gets defectsCorrected.
     *
     * @return bool|null
     */
    public function isDefectsCorrected()
    {
        return $this->defectsCorrected;
    }

    /**
     * Sets defectsCorrected.
     *
     * @param bool|null $defectsCorrected  Signifies if the defects on the vehicle corrected after the DVIR is done.
     *
     * @return $this
     */
    public function setDefectsCorrected($defectsCorrected = null)
    {
        $this->defectsCorrected = $defectsCorrected;

        return $this;
    }

    /**
     * Gets defectsNeedNotBeCorrected.
     *
     * @return bool|null
     */
    public function isDefectsNeedNotBeCorrected()
    {
        return $this->defectsNeedNotBeCorrected;
    }

    /**
     * Sets defectsNeedNotBeCorrected.
     *
     * @param bool|null $defectsNeedNotBeCorrected  Signifies if the defects on this vehicle can be ignored.
     *
     * @return $this
     */
    public function setDefectsNeedNotBeCorrected($defectsNeedNotBeCorrected = null)
    {
        $this->defectsNeedNotBeCorrected = $defectsNeedNotBeCorrected;

        return $this;
    }

    /**
     * Gets id.
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Sets id.
     *
     * @param int|null $id  The id of this DVIR record.
     *
     * @return $this
     */
    public function setId($id = null)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets inspectionType.
     *
     * @return string|null
     */
    public function getInspectionType()
    {
        return $this->inspectionType;
    }

    /**
     * Sets inspectionType.
     *
     * @param string|null $inspectionType  Inspection type of the DVIR.
     *
     * @return $this
     */
    public function setInspectionType($inspectionType = null)
    {
        $this->inspectionType = $inspectionType;

        return $this;
    }

    /**
     * Gets mechanicNotes.
     *
     * @return string|null
     */
    public function getMechanicNotes()
    {
        return $this->mechanicNotes;
    }

    /**
     * Sets mechanicNotes.
     *
     * @param string|null $mechanicNotes  The mechanics notes on the DVIR.
     *
     * @return $this
     */
    public function setMechanicNotes($mechanicNotes = null)
    {
        $this->mechanicNotes = $mechanicNotes;

        return $this;
    }

    /**
     * Gets mechanicOrAgentSignature.
     *
     * @return OpenAPI\Server\Model\DvirBaseMechanicOrAgentSignature|null
     */
    public function getMechanicOrAgentSignature()
    {
        return $this->mechanicOrAgentSignature;
    }

    /**
     * Sets mechanicOrAgentSignature.
     *
     * @param OpenAPI\Server\Model\DvirBaseMechanicOrAgentSignature|null $mechanicOrAgentSignature
     *
     * @return $this
     */
    public function setMechanicOrAgentSignature(DvirBaseMechanicOrAgentSignature $mechanicOrAgentSignature = null)
    {
        $this->mechanicOrAgentSignature = $mechanicOrAgentSignature;

        return $this;
    }

    /**
     * Gets nextDriverSignature.
     *
     * @return OpenAPI\Server\Model\DvirBaseNextDriverSignature|null
     */
    public function getNextDriverSignature()
    {
        return $this->nextDriverSignature;
    }

    /**
     * Sets nextDriverSignature.
     *
     * @param OpenAPI\Server\Model\DvirBaseNextDriverSignature|null $nextDriverSignature
     *
     * @return $this
     */
    public function setNextDriverSignature(DvirBaseNextDriverSignature $nextDriverSignature = null)
    {
        $this->nextDriverSignature = $nextDriverSignature;

        return $this;
    }

    /**
     * Gets odometerMiles.
     *
     * @return int|null
     */
    public function getOdometerMiles()
    {
        return $this->odometerMiles;
    }

    /**
     * Sets odometerMiles.
     *
     * @param int|null $odometerMiles  The odometer reading in miles for the vehicle when the DVIR was done.
     *
     * @return $this
     */
    public function setOdometerMiles($odometerMiles = null)
    {
        $this->odometerMiles = $odometerMiles;

        return $this;
    }

    /**
     * Gets timeMs.
     *
     * @return int|null
     */
    public function getTimeMs()
    {
        return $this->timeMs;
    }

    /**
     * Sets timeMs.
     *
     * @param int|null $timeMs  Timestamp of this DVIR in UNIX milliseconds.
     *
     * @return $this
     */
    public function setTimeMs($timeMs = null)
    {
        $this->timeMs = $timeMs;

        return $this;
    }

    /**
     * Gets trailerDefects.
     *
     * @return OpenAPI\Server\Model\DvirBaseTrailerDefects[]|null
     */
    public function getTrailerDefects()
    {
        return $this->trailerDefects;
    }

    /**
     * Sets trailerDefects.
     *
     * @param OpenAPI\Server\Model\DvirBaseTrailerDefects[]|null $trailerDefects  Defects registered for the trailer which was part of the DVIR.
     *
     * @return $this
     */
    public function setTrailerDefects(array $trailerDefects = null)
    {
        $this->trailerDefects = $trailerDefects;

        return $this;
    }

    /**
     * Gets trailerId.
     *
     * @return int|null
     */
    public function getTrailerId()
    {
        return $this->trailerId;
    }

    /**
     * Sets trailerId.
     *
     * @param int|null $trailerId  The id of the trailer which was part of the DVIR.
     *
     * @return $this
     */
    public function setTrailerId($trailerId = null)
    {
        $this->trailerId = $trailerId;

        return $this;
    }

    /**
     * Gets trailerName.
     *
     * @return string|null
     */
    public function getTrailerName()
    {
        return $this->trailerName;
    }

    /**
     * Sets trailerName.
     *
     * @param string|null $trailerName  The name of the trailer which was part of the DVIR.
     *
     * @return $this
     */
    public function setTrailerName($trailerName = null)
    {
        $this->trailerName = $trailerName;

        return $this;
    }

    /**
     * Gets vehicle.
     *
     * @return OpenAPI\Server\Model\DvirBaseVehicle|null
     */
    public function getVehicle()
    {
        return $this->vehicle;
    }

    /**
     * Sets vehicle.
     *
     * @param OpenAPI\Server\Model\DvirBaseVehicle|null $vehicle
     *
     * @return $this
     */
    public function setVehicle(DvirBaseVehicle $vehicle = null)
    {
        $this->vehicle = $vehicle;

        return $this;
    }

    /**
     * Gets vehicleCondition.
     *
     * @return string|null
     */
    public function getVehicleCondition()
    {
        return $this->vehicleCondition;
    }

    /**
     * Sets vehicleCondition.
     *
     * @param string|null $vehicleCondition  The condition of vechile on which DVIR was done.
     *
     * @return $this
     */
    public function setVehicleCondition($vehicleCondition = null)
    {
        $this->vehicleCondition = $vehicleCondition;

        return $this;
    }

    /**
     * Gets vehicleDefects.
     *
     * @return OpenAPI\Server\Model\DvirBaseTrailerDefects[]|null
     */
    public function getVehicleDefects()
    {
        return $this->vehicleDefects;
    }

    /**
     * Sets vehicleDefects.
     *
     * @param OpenAPI\Server\Model\DvirBaseTrailerDefects[]|null $vehicleDefects  Defects registered for the vehicle which was part of the DVIR.
     *
     * @return $this
     */
    public function setVehicleDefects(array $vehicleDefects = null)
    {
        $this->vehicleDefects = $vehicleDefects;

        return $this;
    }
}


