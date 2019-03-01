<?php
/**
 * TripResponseTrips
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
 * Class representing the TripResponseTrips model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class TripResponseTrips 
{
        /**
     * Odometer reading at the end of the trip.
     *
     * @var int|null
     * @SerializedName("endOdometer")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $endOdometer;

    /**
     * Length of the trip in meters.
     *
     * @var int|null
     * @SerializedName("distanceMeters")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $distanceMeters;

    /**
     * End of the trip in UNIX milliseconds.
     *
     * @var int|null
     * @SerializedName("endMs")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $endMs;

    /**
     * Beginning of the trip in UNIX milliseconds.
     *
     * @var int|null
     * @SerializedName("startMs")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $startMs;

    /**
     * Amount in milliliters of fuel consumed on this trip.
     *
     * @var int|null
     * @SerializedName("fuelConsumedMl")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $fuelConsumedMl;

    /**
     * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
     *
     * @var string|null
     * @SerializedName("startAddress")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $startAddress;

    /**
     * @var OpenAPI\Server\Model\TripResponseStartCoordinates|null
     * @SerializedName("startCoordinates")
     * @Assert\Type("OpenAPI\Server\Model\TripResponseStartCoordinates")
     * @Type("OpenAPI\Server\Model\TripResponseStartCoordinates")
     */
    protected $startCoordinates;

    /**
     * @var OpenAPI\Server\Model\TripResponseEndCoordinates|null
     * @SerializedName("endCoordinates")
     * @Assert\Type("OpenAPI\Server\Model\TripResponseEndCoordinates")
     * @Type("OpenAPI\Server\Model\TripResponseEndCoordinates")
     */
    protected $endCoordinates;

    /**
     * Odometer reading at the beginning of the trip.
     *
     * @var int|null
     * @SerializedName("startOdometer")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $startOdometer;

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
     * Geocoded street address of start (latitude, longitude) coordinates.
     *
     * @var string|null
     * @SerializedName("startLocation")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $startLocation;

    /**
     * Length in meters trip spent on toll roads.
     *
     * @var int|null
     * @SerializedName("tollMeters")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $tollMeters;

    /**
     * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
     *
     * @var string|null
     * @SerializedName("endAddress")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $endAddress;

    /**
     * Geocoded street address of start (latitude, longitude) coordinates.
     *
     * @var string|null
     * @SerializedName("endLocation")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $endLocation;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->endOdometer = isset($data['endOdometer']) ? $data['endOdometer'] : null;
        $this->distanceMeters = isset($data['distanceMeters']) ? $data['distanceMeters'] : null;
        $this->endMs = isset($data['endMs']) ? $data['endMs'] : null;
        $this->startMs = isset($data['startMs']) ? $data['startMs'] : null;
        $this->fuelConsumedMl = isset($data['fuelConsumedMl']) ? $data['fuelConsumedMl'] : null;
        $this->startAddress = isset($data['startAddress']) ? $data['startAddress'] : null;
        $this->startCoordinates = isset($data['startCoordinates']) ? $data['startCoordinates'] : null;
        $this->endCoordinates = isset($data['endCoordinates']) ? $data['endCoordinates'] : null;
        $this->startOdometer = isset($data['startOdometer']) ? $data['startOdometer'] : null;
        $this->driverId = isset($data['driverId']) ? $data['driverId'] : null;
        $this->startLocation = isset($data['startLocation']) ? $data['startLocation'] : null;
        $this->tollMeters = isset($data['tollMeters']) ? $data['tollMeters'] : null;
        $this->endAddress = isset($data['endAddress']) ? $data['endAddress'] : null;
        $this->endLocation = isset($data['endLocation']) ? $data['endLocation'] : null;
    }

    /**
     * Gets endOdometer.
     *
     * @return int|null
     */
    public function getEndOdometer()
    {
        return $this->endOdometer;
    }

    /**
     * Sets endOdometer.
     *
     * @param int|null $endOdometer  Odometer reading at the end of the trip.
     *
     * @return $this
     */
    public function setEndOdometer($endOdometer = null)
    {
        $this->endOdometer = $endOdometer;

        return $this;
    }

    /**
     * Gets distanceMeters.
     *
     * @return int|null
     */
    public function getDistanceMeters()
    {
        return $this->distanceMeters;
    }

    /**
     * Sets distanceMeters.
     *
     * @param int|null $distanceMeters  Length of the trip in meters.
     *
     * @return $this
     */
    public function setDistanceMeters($distanceMeters = null)
    {
        $this->distanceMeters = $distanceMeters;

        return $this;
    }

    /**
     * Gets endMs.
     *
     * @return int|null
     */
    public function getEndMs()
    {
        return $this->endMs;
    }

    /**
     * Sets endMs.
     *
     * @param int|null $endMs  End of the trip in UNIX milliseconds.
     *
     * @return $this
     */
    public function setEndMs($endMs = null)
    {
        $this->endMs = $endMs;

        return $this;
    }

    /**
     * Gets startMs.
     *
     * @return int|null
     */
    public function getStartMs()
    {
        return $this->startMs;
    }

    /**
     * Sets startMs.
     *
     * @param int|null $startMs  Beginning of the trip in UNIX milliseconds.
     *
     * @return $this
     */
    public function setStartMs($startMs = null)
    {
        $this->startMs = $startMs;

        return $this;
    }

    /**
     * Gets fuelConsumedMl.
     *
     * @return int|null
     */
    public function getFuelConsumedMl()
    {
        return $this->fuelConsumedMl;
    }

    /**
     * Sets fuelConsumedMl.
     *
     * @param int|null $fuelConsumedMl  Amount in milliliters of fuel consumed on this trip.
     *
     * @return $this
     */
    public function setFuelConsumedMl($fuelConsumedMl = null)
    {
        $this->fuelConsumedMl = $fuelConsumedMl;

        return $this;
    }

    /**
     * Gets startAddress.
     *
     * @return string|null
     */
    public function getStartAddress()
    {
        return $this->startAddress;
    }

    /**
     * Sets startAddress.
     *
     * @param string|null $startAddress  Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setStartAddress($startAddress = null)
    {
        $this->startAddress = $startAddress;

        return $this;
    }

    /**
     * Gets startCoordinates.
     *
     * @return OpenAPI\Server\Model\TripResponseStartCoordinates|null
     */
    public function getStartCoordinates()
    {
        return $this->startCoordinates;
    }

    /**
     * Sets startCoordinates.
     *
     * @param OpenAPI\Server\Model\TripResponseStartCoordinates|null $startCoordinates
     *
     * @return $this
     */
    public function setStartCoordinates(TripResponseStartCoordinates $startCoordinates = null)
    {
        $this->startCoordinates = $startCoordinates;

        return $this;
    }

    /**
     * Gets endCoordinates.
     *
     * @return OpenAPI\Server\Model\TripResponseEndCoordinates|null
     */
    public function getEndCoordinates()
    {
        return $this->endCoordinates;
    }

    /**
     * Sets endCoordinates.
     *
     * @param OpenAPI\Server\Model\TripResponseEndCoordinates|null $endCoordinates
     *
     * @return $this
     */
    public function setEndCoordinates(TripResponseEndCoordinates $endCoordinates = null)
    {
        $this->endCoordinates = $endCoordinates;

        return $this;
    }

    /**
     * Gets startOdometer.
     *
     * @return int|null
     */
    public function getStartOdometer()
    {
        return $this->startOdometer;
    }

    /**
     * Sets startOdometer.
     *
     * @param int|null $startOdometer  Odometer reading at the beginning of the trip.
     *
     * @return $this
     */
    public function setStartOdometer($startOdometer = null)
    {
        $this->startOdometer = $startOdometer;

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
     * Gets startLocation.
     *
     * @return string|null
     */
    public function getStartLocation()
    {
        return $this->startLocation;
    }

    /**
     * Sets startLocation.
     *
     * @param string|null $startLocation  Geocoded street address of start (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setStartLocation($startLocation = null)
    {
        $this->startLocation = $startLocation;

        return $this;
    }

    /**
     * Gets tollMeters.
     *
     * @return int|null
     */
    public function getTollMeters()
    {
        return $this->tollMeters;
    }

    /**
     * Sets tollMeters.
     *
     * @param int|null $tollMeters  Length in meters trip spent on toll roads.
     *
     * @return $this
     */
    public function setTollMeters($tollMeters = null)
    {
        $this->tollMeters = $tollMeters;

        return $this;
    }

    /**
     * Gets endAddress.
     *
     * @return string|null
     */
    public function getEndAddress()
    {
        return $this->endAddress;
    }

    /**
     * Sets endAddress.
     *
     * @param string|null $endAddress  Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setEndAddress($endAddress = null)
    {
        $this->endAddress = $endAddress;

        return $this;
    }

    /**
     * Gets endLocation.
     *
     * @return string|null
     */
    public function getEndLocation()
    {
        return $this->endLocation;
    }

    /**
     * Sets endLocation.
     *
     * @param string|null $endLocation  Geocoded street address of start (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setEndLocation($endLocation = null)
    {
        $this->endLocation = $endLocation;

        return $this;
    }
}


