// tslint:disable
/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists } from '../runtime';
import {
    DispatchJobCreate,
    DispatchJobCreateFromJSON,
    DispatchJobCreateToJSON,
    JobStatus,
    JobStatusFromJSON,
    JobStatusToJSON,
} from './';

/**
 * 
 * @export
 * @interface DispatchJob
 */
export interface DispatchJob {
    /**
     * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     * @type {string}
     * @memberof DispatchJob
     */
    destinationAddress?: string;
    /**
     * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     * @type {number}
     * @memberof DispatchJob
     */
    destinationAddressId?: number;
    /**
     * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @type {number}
     * @memberof DispatchJob
     */
    destinationLat?: number;
    /**
     * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @type {number}
     * @memberof DispatchJob
     */
    destinationLng?: number;
    /**
     * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     * @type {string}
     * @memberof DispatchJob
     */
    destinationName?: string;
    /**
     * Notes regarding the details of this job.
     * @type {string}
     * @memberof DispatchJob
     */
    notes?: string;
    /**
     * The time at which the assigned driver is scheduled to arrive at the job destination.
     * @type {number}
     * @memberof DispatchJob
     */
    scheduledArrivalTimeMs: number;
    /**
     * The time at which the assigned driver is scheduled to depart from the job destination.
     * @type {number}
     * @memberof DispatchJob
     */
    scheduledDepartureTimeMs?: number;
    /**
     * The time at which the driver arrived at the job destination.
     * @type {number}
     * @memberof DispatchJob
     */
    arrivedAtMs?: number;
    /**
     * The time at which the job was marked complete (e.g. started driving to the next destination).
     * @type {number}
     * @memberof DispatchJob
     */
    completedAtMs?: number;
    /**
     * ID of the route that this job belongs to.
     * @type {number}
     * @memberof DispatchJob
     */
    dispatchRouteId: number;
    /**
     * ID of the driver assigned to the dispatch job.
     * @type {number}
     * @memberof DispatchJob
     */
    driverId?: number;
    /**
     * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     * @type {number}
     * @memberof DispatchJob
     */
    enRouteAtMs?: number;
    /**
     * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     * @type {number}
     * @memberof DispatchJob
     */
    estimatedArrivalMs?: number;
    /**
     * Fleet viewer url of the dispatch job.
     * @type {string}
     * @memberof DispatchJob
     */
    fleetViewerUrl?: string;
    /**
     * 
     * @type {number}
     * @memberof DispatchJob
     */
    groupId: number;
    /**
     * ID of the Samsara dispatch job.
     * @type {number}
     * @memberof DispatchJob
     */
    id: number;
    /**
     * 
     * @type {JobStatus}
     * @memberof DispatchJob
     */
    jobState: JobStatus;
    /**
     * The time at which the job was marked skipped.
     * @type {number}
     * @memberof DispatchJob
     */
    skippedAtMs?: number;
    /**
     * ID of the vehicle used for the dispatch job.
     * @type {number}
     * @memberof DispatchJob
     */
    vehicleId?: number;
}

export function DispatchJobFromJSON(json: any): DispatchJob {
    return {
        'arrivedAtMs': !exists(json, 'arrived_at_ms') ? undefined : json['arrived_at_ms'],
        'completedAtMs': !exists(json, 'completed_at_ms') ? undefined : json['completed_at_ms'],
        'dispatchRouteId': json['dispatch_route_id'],
        'driverId': !exists(json, 'driver_id') ? undefined : json['driver_id'],
        'enRouteAtMs': !exists(json, 'en_route_at_ms') ? undefined : json['en_route_at_ms'],
        'estimatedArrivalMs': !exists(json, 'estimated_arrival_ms') ? undefined : json['estimated_arrival_ms'],
        'fleetViewerUrl': !exists(json, 'fleet_viewer_url') ? undefined : json['fleet_viewer_url'],
        'groupId': json['group_id'],
        'id': json['id'],
        'jobState': JobStatusFromJSON(json['job_state']),
        'skippedAtMs': !exists(json, 'skipped_at_ms') ? undefined : json['skipped_at_ms'],
        'vehicleId': !exists(json, 'vehicle_id') ? undefined : json['vehicle_id'],
    };
}

export function DispatchJobToJSON(value?: DispatchJob): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'arrived_at_ms': value.arrivedAtMs,
        'completed_at_ms': value.completedAtMs,
        'dispatch_route_id': value.dispatchRouteId,
        'driver_id': value.driverId,
        'en_route_at_ms': value.enRouteAtMs,
        'estimated_arrival_ms': value.estimatedArrivalMs,
        'fleet_viewer_url': value.fleetViewerUrl,
        'group_id': value.groupId,
        'id': value.id,
        'job_state': JobStatusToJSON(value.jobState),
        'skipped_at_ms': value.skippedAtMs,
        'vehicle_id': value.vehicleId,
    };
}


