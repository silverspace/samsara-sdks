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
 *
 */

import ApiClient from '../ApiClient';
import DispatchJobCreate from './DispatchJobCreate';
import JobStatus from './JobStatus';

/**
 * The DispatchJob model module.
 * @module model/DispatchJob
 * @version 1.0.0
 */
class DispatchJob {
    /**
     * Constructs a new <code>DispatchJob</code>.
     * @alias module:model/DispatchJob
     * @implements module:model/DispatchJobCreate
     * @param dispatchRouteId {Number} ID of the route that this job belongs to.
     * @param groupId {Number} 
     * @param id {Number} ID of the Samsara dispatch job.
     * @param jobState {module:model/JobStatus} 
     */
    constructor(dispatchRouteId, groupId, id, jobState) { 
        DispatchJobCreate.initialize(this, scheduledArrivalTimeMs);
        DispatchJob.initialize(this, dispatchRouteId, groupId, id, jobState);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, dispatchRouteId, groupId, id, jobState) { 
        obj['scheduled_arrival_time_ms'] = scheduledArrivalTimeMs;
        obj['dispatch_route_id'] = dispatchRouteId;
        obj['group_id'] = groupId;
        obj['id'] = id;
        obj['job_state'] = jobState;
    }

    /**
     * Constructs a <code>DispatchJob</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DispatchJob} obj Optional instance to populate.
     * @return {module:model/DispatchJob} The populated <code>DispatchJob</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DispatchJob();
            DispatchJobCreate.constructFromObject(data, obj);

            if (data.hasOwnProperty('destination_address')) {
                obj['destination_address'] = ApiClient.convertToType(data['destination_address'], 'String');
            }
            if (data.hasOwnProperty('destination_address_id')) {
                obj['destination_address_id'] = ApiClient.convertToType(data['destination_address_id'], 'Number');
            }
            if (data.hasOwnProperty('destination_lat')) {
                obj['destination_lat'] = ApiClient.convertToType(data['destination_lat'], 'Number');
            }
            if (data.hasOwnProperty('destination_lng')) {
                obj['destination_lng'] = ApiClient.convertToType(data['destination_lng'], 'Number');
            }
            if (data.hasOwnProperty('destination_name')) {
                obj['destination_name'] = ApiClient.convertToType(data['destination_name'], 'String');
            }
            if (data.hasOwnProperty('notes')) {
                obj['notes'] = ApiClient.convertToType(data['notes'], 'String');
            }
            if (data.hasOwnProperty('scheduled_arrival_time_ms')) {
                obj['scheduled_arrival_time_ms'] = ApiClient.convertToType(data['scheduled_arrival_time_ms'], 'Number');
            }
            if (data.hasOwnProperty('scheduled_departure_time_ms')) {
                obj['scheduled_departure_time_ms'] = ApiClient.convertToType(data['scheduled_departure_time_ms'], 'Number');
            }
            if (data.hasOwnProperty('arrived_at_ms')) {
                obj['arrived_at_ms'] = ApiClient.convertToType(data['arrived_at_ms'], 'Number');
            }
            if (data.hasOwnProperty('completed_at_ms')) {
                obj['completed_at_ms'] = ApiClient.convertToType(data['completed_at_ms'], 'Number');
            }
            if (data.hasOwnProperty('dispatch_route_id')) {
                obj['dispatch_route_id'] = ApiClient.convertToType(data['dispatch_route_id'], 'Number');
            }
            if (data.hasOwnProperty('driver_id')) {
                obj['driver_id'] = ApiClient.convertToType(data['driver_id'], 'Number');
            }
            if (data.hasOwnProperty('en_route_at_ms')) {
                obj['en_route_at_ms'] = ApiClient.convertToType(data['en_route_at_ms'], 'Number');
            }
            if (data.hasOwnProperty('estimated_arrival_ms')) {
                obj['estimated_arrival_ms'] = ApiClient.convertToType(data['estimated_arrival_ms'], 'Number');
            }
            if (data.hasOwnProperty('fleet_viewer_url')) {
                obj['fleet_viewer_url'] = ApiClient.convertToType(data['fleet_viewer_url'], 'String');
            }
            if (data.hasOwnProperty('group_id')) {
                obj['group_id'] = ApiClient.convertToType(data['group_id'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('job_state')) {
                obj['job_state'] = JobStatus.constructFromObject(data['job_state']);
            }
            if (data.hasOwnProperty('skipped_at_ms')) {
                obj['skipped_at_ms'] = ApiClient.convertToType(data['skipped_at_ms'], 'Number');
            }
            if (data.hasOwnProperty('vehicle_id')) {
                obj['vehicle_id'] = ApiClient.convertToType(data['vehicle_id'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
 * @member {String} destination_address
 */
DispatchJob.prototype['destination_address'] = undefined;

/**
 * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
 * @member {Number} destination_address_id
 */
DispatchJob.prototype['destination_address_id'] = undefined;

/**
 * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @member {Number} destination_lat
 */
DispatchJob.prototype['destination_lat'] = undefined;

/**
 * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @member {Number} destination_lng
 */
DispatchJob.prototype['destination_lng'] = undefined;

/**
 * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
 * @member {String} destination_name
 */
DispatchJob.prototype['destination_name'] = undefined;

/**
 * Notes regarding the details of this job.
 * @member {String} notes
 */
DispatchJob.prototype['notes'] = undefined;

/**
 * The time at which the assigned driver is scheduled to arrive at the job destination.
 * @member {Number} scheduled_arrival_time_ms
 */
DispatchJob.prototype['scheduled_arrival_time_ms'] = undefined;

/**
 * The time at which the assigned driver is scheduled to depart from the job destination.
 * @member {Number} scheduled_departure_time_ms
 */
DispatchJob.prototype['scheduled_departure_time_ms'] = undefined;

/**
 * The time at which the driver arrived at the job destination.
 * @member {Number} arrived_at_ms
 */
DispatchJob.prototype['arrived_at_ms'] = undefined;

/**
 * The time at which the job was marked complete (e.g. started driving to the next destination).
 * @member {Number} completed_at_ms
 */
DispatchJob.prototype['completed_at_ms'] = undefined;

/**
 * ID of the route that this job belongs to.
 * @member {Number} dispatch_route_id
 */
DispatchJob.prototype['dispatch_route_id'] = undefined;

/**
 * ID of the driver assigned to the dispatch job.
 * @member {Number} driver_id
 */
DispatchJob.prototype['driver_id'] = undefined;

/**
 * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
 * @member {Number} en_route_at_ms
 */
DispatchJob.prototype['en_route_at_ms'] = undefined;

/**
 * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
 * @member {Number} estimated_arrival_ms
 */
DispatchJob.prototype['estimated_arrival_ms'] = undefined;

/**
 * Fleet viewer url of the dispatch job.
 * @member {String} fleet_viewer_url
 */
DispatchJob.prototype['fleet_viewer_url'] = undefined;

/**
 * @member {Number} group_id
 */
DispatchJob.prototype['group_id'] = undefined;

/**
 * ID of the Samsara dispatch job.
 * @member {Number} id
 */
DispatchJob.prototype['id'] = undefined;

/**
 * @member {module:model/JobStatus} job_state
 */
DispatchJob.prototype['job_state'] = undefined;

/**
 * The time at which the job was marked skipped.
 * @member {Number} skipped_at_ms
 */
DispatchJob.prototype['skipped_at_ms'] = undefined;

/**
 * ID of the vehicle used for the dispatch job.
 * @member {Number} vehicle_id
 */
DispatchJob.prototype['vehicle_id'] = undefined;


// Implement DispatchJobCreate interface:
/**
 * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
 * @member {String} destination_address
 */
DispatchJobCreate.prototype['destination_address'] = undefined;
/**
 * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
 * @member {Number} destination_address_id
 */
DispatchJobCreate.prototype['destination_address_id'] = undefined;
/**
 * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @member {Number} destination_lat
 */
DispatchJobCreate.prototype['destination_lat'] = undefined;
/**
 * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @member {Number} destination_lng
 */
DispatchJobCreate.prototype['destination_lng'] = undefined;
/**
 * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
 * @member {String} destination_name
 */
DispatchJobCreate.prototype['destination_name'] = undefined;
/**
 * Notes regarding the details of this job.
 * @member {String} notes
 */
DispatchJobCreate.prototype['notes'] = undefined;
/**
 * The time at which the assigned driver is scheduled to arrive at the job destination.
 * @member {Number} scheduled_arrival_time_ms
 */
DispatchJobCreate.prototype['scheduled_arrival_time_ms'] = undefined;
/**
 * The time at which the assigned driver is scheduled to depart from the job destination.
 * @member {Number} scheduled_departure_time_ms
 */
DispatchJobCreate.prototype['scheduled_departure_time_ms'] = undefined;




export default DispatchJob;

