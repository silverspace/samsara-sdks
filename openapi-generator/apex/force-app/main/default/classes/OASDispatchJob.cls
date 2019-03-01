/*
 * Samsara API
 * # Introduction\n\nSamsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.\n\nThe Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.\n\nAPI access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.\n\nIf you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)\n\n# Endpoints\n\nAll our APIs can be accessed through HTTP requests to URLs like:\n\n```curl\nhttps://api.samsara.com/<version>/<endpoint>\n```\n\nAll our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.\n\n# Authentication\n\nTo authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.\n\nYour API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.\n\nAuthentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.\n\n```curl\nhttps://api.samsara.com/<version>/<endpoint>?access_token={access_token}\n```\n\nAll API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.\n\n# Request Methods\n\nOur API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.\n\n## GET\n\nGET requests are typically used for fetching data (like data for a particular driver).\n\n## POST\n\nPOST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).\n\n## PUT\n\nPUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).\n\n## PATCH\n\nPATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).\n\n## DELETE\n\nDELETE requests are used for deleting a record (like deleting a tag from the system).\n\n# Response Codes\n\nAll API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.\n\n## 2XX\n\nThese are successful responses and indicate that the API request returned the expected response.\n\n## 4XX\n\nThese indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.\n\n## 5XX\n\nThese indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.\n\n# Error Responses\n\nIn case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.\n\n| Status Code | Message | Description |\n|-------------|----------------|-------------------------------------------------------------------|\n| 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). |\n| 404 | Page not found | The API endpoint being accessed is invalid. |\n| 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |\n\n# Versioning\n\nAll our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.\n\n# FAQs\n\nCheck out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * OASDispatchJob
 */
public class OASDispatchJob implements OASDispatchJobCreate, OAS.MappedProperties {
    /**
     * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     * @return destinationAddress
     */
    public String destinationAddress { get; set; }

    /**
     * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     * @return destinationAddressId
     */
    public Long destinationAddressId { get; set; }

    /**
     * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @return destinationLat
     */
    public Double destinationLat { get; set; }

    /**
     * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @return destinationLng
     */
    public Double destinationLng { get; set; }

    /**
     * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     * @return destinationName
     */
    public String destinationName { get; set; }

    /**
     * Notes regarding the details of this job.
     * @return notes
     */
    public String notes { get; set; }

    /**
     * The time at which the assigned driver is scheduled to arrive at the job destination.
     * @return scheduledArrivalTimeMs
     */
    public Long scheduledArrivalTimeMs { get; set; }

    /**
     * The time at which the assigned driver is scheduled to depart from the job destination.
     * @return scheduledDepartureTimeMs
     */
    public Long scheduledDepartureTimeMs { get; set; }

    /**
     * The time at which the driver arrived at the job destination.
     * @return arrivedAtMs
     */
    public Long arrivedAtMs { get; set; }

    /**
     * The time at which the job was marked complete (e.g. started driving to the next destination).
     * @return completedAtMs
     */
    public Long completedAtMs { get; set; }

    /**
     * ID of the route that this job belongs to.
     * @return dispatchRouteId
     */
    public Long dispatchRouteId { get; set; }

    /**
     * ID of the driver assigned to the dispatch job.
     * @return driverId
     */
    public Long driverId { get; set; }

    /**
     * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     * @return enRouteAtMs
     */
    public Long enRouteAtMs { get; set; }

    /**
     * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     * @return estimatedArrivalMs
     */
    public Long estimatedArrivalMs { get; set; }

    /**
     * Fleet viewer url of the dispatch job.
     * @return fleetViewerUrl
     */
    public String fleetViewerUrl { get; set; }

    /**
     * Get groupId
     * @return groupId
     */
    public Long groupId { get; set; }

    /**
     * ID of the Samsara dispatch job.
     * @return id
     */
    public Long id { get; set; }

    /**
     * Get jobState
     * @return jobState
     */
    public OASJobStatus jobState { get; set; }

    /**
     * The time at which the job was marked skipped.
     * @return skippedAtMs
     */
    public Long skippedAtMs { get; set; }

    /**
     * ID of the vehicle used for the dispatch job.
     * @return vehicleId
     */
    public Long vehicleId { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'arrived_at_ms' => 'arrivedAtMs',
        'completed_at_ms' => 'completedAtMs',
        'dispatch_route_id' => 'dispatchRouteId',
        'driver_id' => 'driverId',
        'en_route_at_ms' => 'enRouteAtMs',
        'estimated_arrival_ms' => 'estimatedArrivalMs',
        'fleet_viewer_url' => 'fleetViewerUrl',
        'group_id' => 'groupId',
        'job_state' => 'jobState',
        'skipped_at_ms' => 'skippedAtMs',
        'vehicle_id' => 'vehicleId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASDispatchJob getExample() {
        OASDispatchJob dispatchJob = new OASDispatchJob();
          dispatchJob.destinationAddress = '123 Main St, Philadelphia, PA 19106';
          dispatchJob.destinationAddressId = 67890L;
          dispatchJob.destinationLat = 123.456;
          dispatchJob.destinationLng = 37.459;
          dispatchJob.destinationName = 'ACME Inc. Philadelphia HQ';
          dispatchJob.notes = 'Ensure crates are stacked no more than 3 high.';
          dispatchJob.scheduledArrivalTimeMs = 1462881998034L;
          dispatchJob.scheduledDepartureTimeMs = 1462881998034L;
          dispatchJob.arrivedAtMs = 1462881998034L;
          dispatchJob.completedAtMs = 1462881998034L;
          dispatchJob.dispatchRouteId = 55L;
          dispatchJob.driverId = 444L;
          dispatchJob.enRouteAtMs = 1462881998034L;
          dispatchJob.estimatedArrivalMs = 1462881998034L;
          dispatchJob.fleetViewerUrl = 'https://cloud.samsara.com/fleet/viewer/job/fleet_viewer_token';
          dispatchJob.groupId = 101L;
          dispatchJob.id = 773L;
          dispatchJob.jobState = OASJobStatus.getExample();
          dispatchJob.skippedAtMs = 1462881998034L;
          dispatchJob.vehicleId = 112L;
        return dispatchJob;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDispatchJob) {           
            OASDispatchJob dispatchJob = (OASDispatchJob) obj;
            return this.destinationAddress == dispatchJob.destinationAddress
                && this.destinationAddressId == dispatchJob.destinationAddressId
                && this.destinationLat == dispatchJob.destinationLat
                && this.destinationLng == dispatchJob.destinationLng
                && this.destinationName == dispatchJob.destinationName
                && this.notes == dispatchJob.notes
                && this.scheduledArrivalTimeMs == dispatchJob.scheduledArrivalTimeMs
                && this.scheduledDepartureTimeMs == dispatchJob.scheduledDepartureTimeMs
                && this.arrivedAtMs == dispatchJob.arrivedAtMs
                && this.completedAtMs == dispatchJob.completedAtMs
                && this.dispatchRouteId == dispatchJob.dispatchRouteId
                && this.driverId == dispatchJob.driverId
                && this.enRouteAtMs == dispatchJob.enRouteAtMs
                && this.estimatedArrivalMs == dispatchJob.estimatedArrivalMs
                && this.fleetViewerUrl == dispatchJob.fleetViewerUrl
                && this.groupId == dispatchJob.groupId
                && this.id == dispatchJob.id
                && this.jobState == dispatchJob.jobState
                && this.skippedAtMs == dispatchJob.skippedAtMs
                && this.vehicleId == dispatchJob.vehicleId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (destinationAddress == null ? 0 : System.hashCode(destinationAddress));
        hashCode = (17 * hashCode) + (destinationAddressId == null ? 0 : System.hashCode(destinationAddressId));
        hashCode = (17 * hashCode) + (destinationLat == null ? 0 : System.hashCode(destinationLat));
        hashCode = (17 * hashCode) + (destinationLng == null ? 0 : System.hashCode(destinationLng));
        hashCode = (17 * hashCode) + (destinationName == null ? 0 : System.hashCode(destinationName));
        hashCode = (17 * hashCode) + (notes == null ? 0 : System.hashCode(notes));
        hashCode = (17 * hashCode) + (scheduledArrivalTimeMs == null ? 0 : System.hashCode(scheduledArrivalTimeMs));
        hashCode = (17 * hashCode) + (scheduledDepartureTimeMs == null ? 0 : System.hashCode(scheduledDepartureTimeMs));
        hashCode = (17 * hashCode) + (arrivedAtMs == null ? 0 : System.hashCode(arrivedAtMs));
        hashCode = (17 * hashCode) + (completedAtMs == null ? 0 : System.hashCode(completedAtMs));
        hashCode = (17 * hashCode) + (dispatchRouteId == null ? 0 : System.hashCode(dispatchRouteId));
        hashCode = (17 * hashCode) + (driverId == null ? 0 : System.hashCode(driverId));
        hashCode = (17 * hashCode) + (enRouteAtMs == null ? 0 : System.hashCode(enRouteAtMs));
        hashCode = (17 * hashCode) + (estimatedArrivalMs == null ? 0 : System.hashCode(estimatedArrivalMs));
        hashCode = (17 * hashCode) + (fleetViewerUrl == null ? 0 : System.hashCode(fleetViewerUrl));
        hashCode = (17 * hashCode) + (groupId == null ? 0 : System.hashCode(groupId));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (jobState == null ? 0 : System.hashCode(jobState));
        hashCode = (17 * hashCode) + (skippedAtMs == null ? 0 : System.hashCode(skippedAtMs));
        hashCode = (17 * hashCode) + (vehicleId == null ? 0 : System.hashCode(vehicleId));
        return hashCode;
    }
}

