<?php
/**
 * DispatchRoute
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
 * Class representing the DispatchRoute model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class DispatchRoute 
{
        /**
     * The time in Unix epoch milliseconds that the route actually ended.
     *
     * @var int|null
     * @SerializedName("actual_end_ms")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $actualEndMs;

    /**
     * The time in Unix epoch milliseconds that the route actually started.
     *
     * @var int|null
     * @SerializedName("actual_start_ms")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $actualStartMs;

    /**
     * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     *
     * @var int|null
     * @SerializedName("driver_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $driverId;

    /**
     * ID of the group if the organization has multiple groups (optional).
     *
     * @var int|null
     * @SerializedName("group_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $groupId;

    /**
     * Descriptive name of this route.
     *
     * @var string
     * @SerializedName("name")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     *
     * @var int
     * @SerializedName("scheduled_end_ms")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $scheduledEndMs;

    /**
     * The distance expected to be traveled for this route in meters.
     *
     * @var int|null
     * @SerializedName("scheduled_meters")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $scheduledMeters;

    /**
     * The time in Unix epoch milliseconds that the route is scheduled to start.
     *
     * @var int
     * @SerializedName("scheduled_start_ms")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $scheduledStartMs;

    /**
     * The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     *
     * @var string|null
     * @SerializedName("start_location_address")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $startLocationAddress;

    /**
     * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     *
     * @var int|null
     * @SerializedName("start_location_address_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $startLocationAddressId;

    /**
     * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     *
     * @var double|null
     * @SerializedName("start_location_lat")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $startLocationLat;

    /**
     * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     *
     * @var double|null
     * @SerializedName("start_location_lng")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $startLocationLng;

    /**
     * The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
     *
     * @var string|null
     * @SerializedName("start_location_name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $startLocationName;

    /**
     * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     *
     * @var int|null
     * @SerializedName("trailer_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $trailerId;

    /**
     * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     *
     * @var int|null
     * @SerializedName("vehicle_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $vehicleId;

    /**
     * The dispatch jobs associated with this route.
     *
     * @var OpenAPI\Server\Model\DispatchJob[]
     * @SerializedName("dispatch_jobs")
     * @Assert\NotNull()
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\DispatchJob")
     * })
     * @Type("array<OpenAPI\Server\Model\DispatchJob>")
     */
    protected $dispatchJobs;

    /**
     * ID of the Samsara dispatch route.
     *
     * @var int
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $id;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->actualEndMs = isset($data['actualEndMs']) ? $data['actualEndMs'] : null;
        $this->actualStartMs = isset($data['actualStartMs']) ? $data['actualStartMs'] : null;
        $this->driverId = isset($data['driverId']) ? $data['driverId'] : null;
        $this->groupId = isset($data['groupId']) ? $data['groupId'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->scheduledEndMs = isset($data['scheduledEndMs']) ? $data['scheduledEndMs'] : null;
        $this->scheduledMeters = isset($data['scheduledMeters']) ? $data['scheduledMeters'] : null;
        $this->scheduledStartMs = isset($data['scheduledStartMs']) ? $data['scheduledStartMs'] : null;
        $this->startLocationAddress = isset($data['startLocationAddress']) ? $data['startLocationAddress'] : null;
        $this->startLocationAddressId = isset($data['startLocationAddressId']) ? $data['startLocationAddressId'] : null;
        $this->startLocationLat = isset($data['startLocationLat']) ? $data['startLocationLat'] : null;
        $this->startLocationLng = isset($data['startLocationLng']) ? $data['startLocationLng'] : null;
        $this->startLocationName = isset($data['startLocationName']) ? $data['startLocationName'] : null;
        $this->trailerId = isset($data['trailerId']) ? $data['trailerId'] : null;
        $this->vehicleId = isset($data['vehicleId']) ? $data['vehicleId'] : null;
        $this->dispatchJobs = isset($data['dispatchJobs']) ? $data['dispatchJobs'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
    }

    /**
     * Gets actualEndMs.
     *
     * @return int|null
     */
    public function getActualEndMs()
    {
        return $this->actualEndMs;
    }

    /**
     * Sets actualEndMs.
     *
     * @param int|null $actualEndMs  The time in Unix epoch milliseconds that the route actually ended.
     *
     * @return $this
     */
    public function setActualEndMs($actualEndMs = null)
    {
        $this->actualEndMs = $actualEndMs;

        return $this;
    }

    /**
     * Gets actualStartMs.
     *
     * @return int|null
     */
    public function getActualStartMs()
    {
        return $this->actualStartMs;
    }

    /**
     * Sets actualStartMs.
     *
     * @param int|null $actualStartMs  The time in Unix epoch milliseconds that the route actually started.
     *
     * @return $this
     */
    public function setActualStartMs($actualStartMs = null)
    {
        $this->actualStartMs = $actualStartMs;

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
     * @param int|null $driverId  ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     *
     * @return $this
     */
    public function setDriverId($driverId = null)
    {
        $this->driverId = $driverId;

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
     * @param int|null $groupId  ID of the group if the organization has multiple groups (optional).
     *
     * @return $this
     */
    public function setGroupId($groupId = null)
    {
        $this->groupId = $groupId;

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
     * @param string $name  Descriptive name of this route.
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets scheduledEndMs.
     *
     * @return int
     */
    public function getScheduledEndMs()
    {
        return $this->scheduledEndMs;
    }

    /**
     * Sets scheduledEndMs.
     *
     * @param int $scheduledEndMs  The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     *
     * @return $this
     */
    public function setScheduledEndMs($scheduledEndMs)
    {
        $this->scheduledEndMs = $scheduledEndMs;

        return $this;
    }

    /**
     * Gets scheduledMeters.
     *
     * @return int|null
     */
    public function getScheduledMeters()
    {
        return $this->scheduledMeters;
    }

    /**
     * Sets scheduledMeters.
     *
     * @param int|null $scheduledMeters  The distance expected to be traveled for this route in meters.
     *
     * @return $this
     */
    public function setScheduledMeters($scheduledMeters = null)
    {
        $this->scheduledMeters = $scheduledMeters;

        return $this;
    }

    /**
     * Gets scheduledStartMs.
     *
     * @return int
     */
    public function getScheduledStartMs()
    {
        return $this->scheduledStartMs;
    }

    /**
     * Sets scheduledStartMs.
     *
     * @param int $scheduledStartMs  The time in Unix epoch milliseconds that the route is scheduled to start.
     *
     * @return $this
     */
    public function setScheduledStartMs($scheduledStartMs)
    {
        $this->scheduledStartMs = $scheduledStartMs;

        return $this;
    }

    /**
     * Gets startLocationAddress.
     *
     * @return string|null
     */
    public function getStartLocationAddress()
    {
        return $this->startLocationAddress;
    }

    /**
     * Sets startLocationAddress.
     *
     * @param string|null $startLocationAddress  The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     *
     * @return $this
     */
    public function setStartLocationAddress($startLocationAddress = null)
    {
        $this->startLocationAddress = $startLocationAddress;

        return $this;
    }

    /**
     * Gets startLocationAddressId.
     *
     * @return int|null
     */
    public function getStartLocationAddressId()
    {
        return $this->startLocationAddressId;
    }

    /**
     * Sets startLocationAddressId.
     *
     * @param int|null $startLocationAddressId  ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     *
     * @return $this
     */
    public function setStartLocationAddressId($startLocationAddressId = null)
    {
        $this->startLocationAddressId = $startLocationAddressId;

        return $this;
    }

    /**
     * Gets startLocationLat.
     *
     * @return double|null
     */
    public function getStartLocationLat()
    {
        return $this->startLocationLat;
    }

    /**
     * Sets startLocationLat.
     *
     * @param double|null $startLocationLat  Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     *
     * @return $this
     */
    public function setStartLocationLat($startLocationLat = null)
    {
        $this->startLocationLat = $startLocationLat;

        return $this;
    }

    /**
     * Gets startLocationLng.
     *
     * @return double|null
     */
    public function getStartLocationLng()
    {
        return $this->startLocationLng;
    }

    /**
     * Sets startLocationLng.
     *
     * @param double|null $startLocationLng  Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     *
     * @return $this
     */
    public function setStartLocationLng($startLocationLng = null)
    {
        $this->startLocationLng = $startLocationLng;

        return $this;
    }

    /**
     * Gets startLocationName.
     *
     * @return string|null
     */
    public function getStartLocationName()
    {
        return $this->startLocationName;
    }

    /**
     * Sets startLocationName.
     *
     * @param string|null $startLocationName  The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
     *
     * @return $this
     */
    public function setStartLocationName($startLocationName = null)
    {
        $this->startLocationName = $startLocationName;

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
     * @param int|null $trailerId  ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     *
     * @return $this
     */
    public function setTrailerId($trailerId = null)
    {
        $this->trailerId = $trailerId;

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
     * @param int|null $vehicleId  ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     *
     * @return $this
     */
    public function setVehicleId($vehicleId = null)
    {
        $this->vehicleId = $vehicleId;

        return $this;
    }

    /**
     * Gets dispatchJobs.
     *
     * @return OpenAPI\Server\Model\DispatchJob[]
     */
    public function getDispatchJobs()
    {
        return $this->dispatchJobs;
    }

    /**
     * Sets dispatchJobs.
     *
     * @param OpenAPI\Server\Model\DispatchJob[] $dispatchJobs  The dispatch jobs associated with this route.
     *
     * @return $this
     */
    public function setDispatchJobs(array $dispatchJobs)
    {
        $this->dispatchJobs = $dispatchJobs;

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
     * @param int $id  ID of the Samsara dispatch route.
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }
}


