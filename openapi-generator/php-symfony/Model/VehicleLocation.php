<?php
/**
 * VehicleLocation
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
 * Class representing the VehicleLocation model.
 *
 * Contains the location, in latitude and longitude, of a vehicle.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class VehicleLocation 
{
        /**
     * Heading in degrees.
     *
     * @var double|null
     * @SerializedName("heading")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $heading;

    /**
     * ID of the vehicle.
     *
     * @var int
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $id;

    /**
     * Latitude in decimal degrees.
     *
     * @var double|null
     * @SerializedName("latitude")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $latitude;

    /**
     * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
     *
     * @var string|null
     * @SerializedName("location")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $location;

    /**
     * Longitude in decimal degrees.
     *
     * @var double|null
     * @SerializedName("longitude")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $longitude;

    /**
     * Name of the vehicle.
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * The number of meters reported by the odometer.
     *
     * @var int|null
     * @SerializedName("odometerMeters")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $odometerMeters;

    /**
     * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
     *
     * @var bool|null
     * @SerializedName("onTrip")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $onTrip;

    /**
     * Speed in miles per hour.
     *
     * @var double|null
     * @SerializedName("speed")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $speed;

    /**
     * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
     *
     * @var int|null
     * @SerializedName("time")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $time;

    /**
     * Vehicle Identification Number (VIN) of the vehicle.
     *
     * @var string|null
     * @SerializedName("vin")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $vin;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->heading = isset($data['heading']) ? $data['heading'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->latitude = isset($data['latitude']) ? $data['latitude'] : null;
        $this->location = isset($data['location']) ? $data['location'] : null;
        $this->longitude = isset($data['longitude']) ? $data['longitude'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->odometerMeters = isset($data['odometerMeters']) ? $data['odometerMeters'] : null;
        $this->onTrip = isset($data['onTrip']) ? $data['onTrip'] : null;
        $this->speed = isset($data['speed']) ? $data['speed'] : null;
        $this->time = isset($data['time']) ? $data['time'] : null;
        $this->vin = isset($data['vin']) ? $data['vin'] : null;
    }

    /**
     * Gets heading.
     *
     * @return double|null
     */
    public function getHeading()
    {
        return $this->heading;
    }

    /**
     * Sets heading.
     *
     * @param double|null $heading  Heading in degrees.
     *
     * @return $this
     */
    public function setHeading($heading = null)
    {
        $this->heading = $heading;

        return $this;
    }

    /**
     * Gets id.
     *
     * @return int
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Sets id.
     *
     * @param int $id  ID of the vehicle.
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets latitude.
     *
     * @return double|null
     */
    public function getLatitude()
    {
        return $this->latitude;
    }

    /**
     * Sets latitude.
     *
     * @param double|null $latitude  Latitude in decimal degrees.
     *
     * @return $this
     */
    public function setLatitude($latitude = null)
    {
        $this->latitude = $latitude;

        return $this;
    }

    /**
     * Gets location.
     *
     * @return string|null
     */
    public function getLocation()
    {
        return $this->location;
    }

    /**
     * Sets location.
     *
     * @param string|null $location  Text representation of nearest identifiable location to (latitude, longitude) coordinates.
     *
     * @return $this
     */
    public function setLocation($location = null)
    {
        $this->location = $location;

        return $this;
    }

    /**
     * Gets longitude.
     *
     * @return double|null
     */
    public function getLongitude()
    {
        return $this->longitude;
    }

    /**
     * Sets longitude.
     *
     * @param double|null $longitude  Longitude in decimal degrees.
     *
     * @return $this
     */
    public function setLongitude($longitude = null)
    {
        $this->longitude = $longitude;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string|null $name  Name of the vehicle.
     *
     * @return $this
     */
    public function setName($name = null)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets odometerMeters.
     *
     * @return int|null
     */
    public function getOdometerMeters()
    {
        return $this->odometerMeters;
    }

    /**
     * Sets odometerMeters.
     *
     * @param int|null $odometerMeters  The number of meters reported by the odometer.
     *
     * @return $this
     */
    public function setOdometerMeters($odometerMeters = null)
    {
        $this->odometerMeters = $odometerMeters;

        return $this;
    }

    /**
     * Gets onTrip.
     *
     * @return bool|null
     */
    public function isOnTrip()
    {
        return $this->onTrip;
    }

    /**
     * Sets onTrip.
     *
     * @param bool|null $onTrip  Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
     *
     * @return $this
     */
    public function setOnTrip($onTrip = null)
    {
        $this->onTrip = $onTrip;

        return $this;
    }

    /**
     * Gets speed.
     *
     * @return double|null
     */
    public function getSpeed()
    {
        return $this->speed;
    }

    /**
     * Sets speed.
     *
     * @param double|null $speed  Speed in miles per hour.
     *
     * @return $this
     */
    public function setSpeed($speed = null)
    {
        $this->speed = $speed;

        return $this;
    }

    /**
     * Gets time.
     *
     * @return int|null
     */
    public function getTime()
    {
        return $this->time;
    }

    /**
     * Sets time.
     *
     * @param int|null $time  The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
     *
     * @return $this
     */
    public function setTime($time = null)
    {
        $this->time = $time;

        return $this;
    }

    /**
     * Gets vin.
     *
     * @return string|null
     */
    public function getVin()
    {
        return $this->vin;
    }

    /**
     * Sets vin.
     *
     * @param string|null $vin  Vehicle Identification Number (VIN) of the vehicle.
     *
     * @return $this
     */
    public function setVin($vin = null)
    {
        $this->vin = $vin;

        return $this;
    }
}


