<?php
/**
 * DispatchJob
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
 * Class representing the DispatchJob model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class DispatchJob 
{
        /**
     * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     *
     * @var string|null
     * @SerializedName("destination_address")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $destinationAddress;

    /**
     * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     *
     * @var int|null
     * @SerializedName("destination_address_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $destinationAddressId;

    /**
     * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     *
     * @var double|null
     * @SerializedName("destination_lat")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $destinationLat;

    /**
     * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     *
     * @var double|null
     * @SerializedName("destination_lng")
     * @Assert\Type("double")
     * @Type("double")
     */
    protected $destinationLng;

    /**
     * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     *
     * @var string|null
     * @SerializedName("destination_name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $destinationName;

    /**
     * Notes regarding the details of this job.
     *
     * @var string|null
     * @SerializedName("notes")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $notes;

    /**
     * The time at which the assigned driver is scheduled to arrive at the job destination.
     *
     * @var int
     * @SerializedName("scheduled_arrival_time_ms")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $scheduledArrivalTimeMs;

    /**
     * The time at which the assigned driver is scheduled to depart from the job destination.
     *
     * @var int|null
     * @SerializedName("scheduled_departure_time_ms")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $scheduledDepartureTimeMs;

    /**
     * The time at which the driver arrived at the job destination.
     *
     * @var int|null
     * @SerializedName("arrived_at_ms")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $arrivedAtMs;

    /**
     * The time at which the job was marked complete (e.g. started driving to the next destination).
     *
     * @var int|null
     * @SerializedName("completed_at_ms")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $completedAtMs;

    /**
     * ID of the route that this job belongs to.
     *
     * @var int
     * @SerializedName("dispatch_route_id")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $dispatchRouteId;

    /**
     * ID of the driver assigned to the dispatch job.
     *
     * @var int|null
     * @SerializedName("driver_id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $driverId;

    /**
     * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     *
     * @var int|null
     * @SerializedName("en_route_at_ms")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $enRouteAtMs;

    /**
     * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     *
     * @var int|null
     * @SerializedName("estimated_arrival_ms")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $estimatedArrivalMs;

    /**
     * Fleet viewer url of the dispatch job.
     *
     * @var string|null
     * @SerializedName("fleet_viewer_url")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $fleetViewerUrl;

    /**
     * @var int
     * @SerializedName("group_id")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $groupId;

    /**
     * ID of the Samsara dispatch job.
     *
     * @var int
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $id;

    /**
     * @var OpenAPI\Server\Model\JobStatus
     * @SerializedName("job_state")
     * @Assert\NotNull()
     * @Assert\Type("OpenAPI\Server\Model\JobStatus")
     * @Type("OpenAPI\Server\Model\JobStatus")
     */
    protected $jobState;

    /**
     * The time at which the job was marked skipped.
     *
     * @var int|null
     * @SerializedName("skipped_at_ms")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $skippedAtMs;

    /**
     * ID of the vehicle used for the dispatch job.
     *
     * @var int|null
     * @SerializedName("vehicle_id")
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
        $this->destinationAddress = isset($data['destinationAddress']) ? $data['destinationAddress'] : null;
        $this->destinationAddressId = isset($data['destinationAddressId']) ? $data['destinationAddressId'] : null;
        $this->destinationLat = isset($data['destinationLat']) ? $data['destinationLat'] : null;
        $this->destinationLng = isset($data['destinationLng']) ? $data['destinationLng'] : null;
        $this->destinationName = isset($data['destinationName']) ? $data['destinationName'] : null;
        $this->notes = isset($data['notes']) ? $data['notes'] : null;
        $this->scheduledArrivalTimeMs = isset($data['scheduledArrivalTimeMs']) ? $data['scheduledArrivalTimeMs'] : null;
        $this->scheduledDepartureTimeMs = isset($data['scheduledDepartureTimeMs']) ? $data['scheduledDepartureTimeMs'] : null;
        $this->arrivedAtMs = isset($data['arrivedAtMs']) ? $data['arrivedAtMs'] : null;
        $this->completedAtMs = isset($data['completedAtMs']) ? $data['completedAtMs'] : null;
        $this->dispatchRouteId = isset($data['dispatchRouteId']) ? $data['dispatchRouteId'] : null;
        $this->driverId = isset($data['driverId']) ? $data['driverId'] : null;
        $this->enRouteAtMs = isset($data['enRouteAtMs']) ? $data['enRouteAtMs'] : null;
        $this->estimatedArrivalMs = isset($data['estimatedArrivalMs']) ? $data['estimatedArrivalMs'] : null;
        $this->fleetViewerUrl = isset($data['fleetViewerUrl']) ? $data['fleetViewerUrl'] : null;
        $this->groupId = isset($data['groupId']) ? $data['groupId'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->jobState = isset($data['jobState']) ? $data['jobState'] : null;
        $this->skippedAtMs = isset($data['skippedAtMs']) ? $data['skippedAtMs'] : null;
        $this->vehicleId = isset($data['vehicleId']) ? $data['vehicleId'] : null;
    }

    /**
     * Gets destinationAddress.
     *
     * @return string|null
     */
    public function getDestinationAddress()
    {
        return $this->destinationAddress;
    }

    /**
     * Sets destinationAddress.
     *
     * @param string|null $destinationAddress  The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     *
     * @return $this
     */
    public function setDestinationAddress($destinationAddress = null)
    {
        $this->destinationAddress = $destinationAddress;

        return $this;
    }

    /**
     * Gets destinationAddressId.
     *
     * @return int|null
     */
    public function getDestinationAddressId()
    {
        return $this->destinationAddressId;
    }

    /**
     * Sets destinationAddressId.
     *
     * @param int|null $destinationAddressId  ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     *
     * @return $this
     */
    public function setDestinationAddressId($destinationAddressId = null)
    {
        $this->destinationAddressId = $destinationAddressId;

        return $this;
    }

    /**
     * Gets destinationLat.
     *
     * @return double|null
     */
    public function getDestinationLat()
    {
        return $this->destinationLat;
    }

    /**
     * Sets destinationLat.
     *
     * @param double|null $destinationLat  Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     *
     * @return $this
     */
    public function setDestinationLat($destinationLat = null)
    {
        $this->destinationLat = $destinationLat;

        return $this;
    }

    /**
     * Gets destinationLng.
     *
     * @return double|null
     */
    public function getDestinationLng()
    {
        return $this->destinationLng;
    }

    /**
     * Sets destinationLng.
     *
     * @param double|null $destinationLng  Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     *
     * @return $this
     */
    public function setDestinationLng($destinationLng = null)
    {
        $this->destinationLng = $destinationLng;

        return $this;
    }

    /**
     * Gets destinationName.
     *
     * @return string|null
     */
    public function getDestinationName()
    {
        return $this->destinationName;
    }

    /**
     * Sets destinationName.
     *
     * @param string|null $destinationName  The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     *
     * @return $this
     */
    public function setDestinationName($destinationName = null)
    {
        $this->destinationName = $destinationName;

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
     * @param string|null $notes  Notes regarding the details of this job.
     *
     * @return $this
     */
    public function setNotes($notes = null)
    {
        $this->notes = $notes;

        return $this;
    }

    /**
     * Gets scheduledArrivalTimeMs.
     *
     * @return int
     */
    public function getScheduledArrivalTimeMs()
    {
        return $this->scheduledArrivalTimeMs;
    }

    /**
     * Sets scheduledArrivalTimeMs.
     *
     * @param int $scheduledArrivalTimeMs  The time at which the assigned driver is scheduled to arrive at the job destination.
     *
     * @return $this
     */
    public function setScheduledArrivalTimeMs($scheduledArrivalTimeMs)
    {
        $this->scheduledArrivalTimeMs = $scheduledArrivalTimeMs;

        return $this;
    }

    /**
     * Gets scheduledDepartureTimeMs.
     *
     * @return int|null
     */
    public function getScheduledDepartureTimeMs()
    {
        return $this->scheduledDepartureTimeMs;
    }

    /**
     * Sets scheduledDepartureTimeMs.
     *
     * @param int|null $scheduledDepartureTimeMs  The time at which the assigned driver is scheduled to depart from the job destination.
     *
     * @return $this
     */
    public function setScheduledDepartureTimeMs($scheduledDepartureTimeMs = null)
    {
        $this->scheduledDepartureTimeMs = $scheduledDepartureTimeMs;

        return $this;
    }

    /**
     * Gets arrivedAtMs.
     *
     * @return int|null
     */
    public function getArrivedAtMs()
    {
        return $this->arrivedAtMs;
    }

    /**
     * Sets arrivedAtMs.
     *
     * @param int|null $arrivedAtMs  The time at which the driver arrived at the job destination.
     *
     * @return $this
     */
    public function setArrivedAtMs($arrivedAtMs = null)
    {
        $this->arrivedAtMs = $arrivedAtMs;

        return $this;
    }

    /**
     * Gets completedAtMs.
     *
     * @return int|null
     */
    public function getCompletedAtMs()
    {
        return $this->completedAtMs;
    }

    /**
     * Sets completedAtMs.
     *
     * @param int|null $completedAtMs  The time at which the job was marked complete (e.g. started driving to the next destination).
     *
     * @return $this
     */
    public function setCompletedAtMs($completedAtMs = null)
    {
        $this->completedAtMs = $completedAtMs;

        return $this;
    }

    /**
     * Gets dispatchRouteId.
     *
     * @return int
     */
    public function getDispatchRouteId()
    {
        return $this->dispatchRouteId;
    }

    /**
     * Sets dispatchRouteId.
     *
     * @param int $dispatchRouteId  ID of the route that this job belongs to.
     *
     * @return $this
     */
    public function setDispatchRouteId($dispatchRouteId)
    {
        $this->dispatchRouteId = $dispatchRouteId;

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
     * @param int|null $driverId  ID of the driver assigned to the dispatch job.
     *
     * @return $this
     */
    public function setDriverId($driverId = null)
    {
        $this->driverId = $driverId;

        return $this;
    }

    /**
     * Gets enRouteAtMs.
     *
     * @return int|null
     */
    public function getEnRouteAtMs()
    {
        return $this->enRouteAtMs;
    }

    /**
     * Sets enRouteAtMs.
     *
     * @param int|null $enRouteAtMs  The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     *
     * @return $this
     */
    public function setEnRouteAtMs($enRouteAtMs = null)
    {
        $this->enRouteAtMs = $enRouteAtMs;

        return $this;
    }

    /**
     * Gets estimatedArrivalMs.
     *
     * @return int|null
     */
    public function getEstimatedArrivalMs()
    {
        return $this->estimatedArrivalMs;
    }

    /**
     * Sets estimatedArrivalMs.
     *
     * @param int|null $estimatedArrivalMs  The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     *
     * @return $this
     */
    public function setEstimatedArrivalMs($estimatedArrivalMs = null)
    {
        $this->estimatedArrivalMs = $estimatedArrivalMs;

        return $this;
    }

    /**
     * Gets fleetViewerUrl.
     *
     * @return string|null
     */
    public function getFleetViewerUrl()
    {
        return $this->fleetViewerUrl;
    }

    /**
     * Sets fleetViewerUrl.
     *
     * @param string|null $fleetViewerUrl  Fleet viewer url of the dispatch job.
     *
     * @return $this
     */
    public function setFleetViewerUrl($fleetViewerUrl = null)
    {
        $this->fleetViewerUrl = $fleetViewerUrl;

        return $this;
    }

    /**
     * Gets groupId.
     *
     * @return int
     */
    public function getGroupId()
    {
        return $this->groupId;
    }

    /**
     * Sets groupId.
     *
     * @param int $groupId
     *
     * @return $this
     */
    public function setGroupId($groupId)
    {
        $this->groupId = $groupId;

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
     * @param int $id  ID of the Samsara dispatch job.
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets jobState.
     *
     * @return OpenAPI\Server\Model\JobStatus
     */
    public function getJobState()
    {
        return $this->jobState;
    }

    /**
     * Sets jobState.
     *
     * @param OpenAPI\Server\Model\JobStatus $jobState
     *
     * @return $this
     */
    public function setJobState(JobStatus $jobState)
    {
        $this->jobState = $jobState;

        return $this;
    }

    /**
     * Gets skippedAtMs.
     *
     * @return int|null
     */
    public function getSkippedAtMs()
    {
        return $this->skippedAtMs;
    }

    /**
     * Sets skippedAtMs.
     *
     * @param int|null $skippedAtMs  The time at which the job was marked skipped.
     *
     * @return $this
     */
    public function setSkippedAtMs($skippedAtMs = null)
    {
        $this->skippedAtMs = $skippedAtMs;

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
     * @param int|null $vehicleId  ID of the vehicle used for the dispatch job.
     *
     * @return $this
     */
    public function setVehicleId($vehicleId = null)
    {
        $this->vehicleId = $vehicleId;

        return $this;
    }
}


