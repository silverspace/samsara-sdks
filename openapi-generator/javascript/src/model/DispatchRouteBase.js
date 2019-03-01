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

/**
 * The DispatchRouteBase model module.
 * @module model/DispatchRouteBase
 * @version 1.0.0
 */
class DispatchRouteBase {
    /**
     * Constructs a new <code>DispatchRouteBase</code>.
     * @alias module:model/DispatchRouteBase
     * @param name {String} Descriptive name of this route.
     * @param scheduledEndMs {Number} The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     * @param scheduledStartMs {Number} The time in Unix epoch milliseconds that the route is scheduled to start.
     */
    constructor(name, scheduledEndMs, scheduledStartMs) { 
        
        DispatchRouteBase.initialize(this, name, scheduledEndMs, scheduledStartMs);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, scheduledEndMs, scheduledStartMs) { 
        obj['name'] = name;
        obj['scheduled_end_ms'] = scheduledEndMs;
        obj['scheduled_start_ms'] = scheduledStartMs;
    }

    /**
     * Constructs a <code>DispatchRouteBase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DispatchRouteBase} obj Optional instance to populate.
     * @return {module:model/DispatchRouteBase} The populated <code>DispatchRouteBase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DispatchRouteBase();

            if (data.hasOwnProperty('actual_end_ms')) {
                obj['actual_end_ms'] = ApiClient.convertToType(data['actual_end_ms'], 'Number');
            }
            if (data.hasOwnProperty('actual_start_ms')) {
                obj['actual_start_ms'] = ApiClient.convertToType(data['actual_start_ms'], 'Number');
            }
            if (data.hasOwnProperty('driver_id')) {
                obj['driver_id'] = ApiClient.convertToType(data['driver_id'], 'Number');
            }
            if (data.hasOwnProperty('group_id')) {
                obj['group_id'] = ApiClient.convertToType(data['group_id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('scheduled_end_ms')) {
                obj['scheduled_end_ms'] = ApiClient.convertToType(data['scheduled_end_ms'], 'Number');
            }
            if (data.hasOwnProperty('scheduled_meters')) {
                obj['scheduled_meters'] = ApiClient.convertToType(data['scheduled_meters'], 'Number');
            }
            if (data.hasOwnProperty('scheduled_start_ms')) {
                obj['scheduled_start_ms'] = ApiClient.convertToType(data['scheduled_start_ms'], 'Number');
            }
            if (data.hasOwnProperty('start_location_address')) {
                obj['start_location_address'] = ApiClient.convertToType(data['start_location_address'], 'String');
            }
            if (data.hasOwnProperty('start_location_address_id')) {
                obj['start_location_address_id'] = ApiClient.convertToType(data['start_location_address_id'], 'Number');
            }
            if (data.hasOwnProperty('start_location_lat')) {
                obj['start_location_lat'] = ApiClient.convertToType(data['start_location_lat'], 'Number');
            }
            if (data.hasOwnProperty('start_location_lng')) {
                obj['start_location_lng'] = ApiClient.convertToType(data['start_location_lng'], 'Number');
            }
            if (data.hasOwnProperty('start_location_name')) {
                obj['start_location_name'] = ApiClient.convertToType(data['start_location_name'], 'String');
            }
            if (data.hasOwnProperty('trailer_id')) {
                obj['trailer_id'] = ApiClient.convertToType(data['trailer_id'], 'Number');
            }
            if (data.hasOwnProperty('vehicle_id')) {
                obj['vehicle_id'] = ApiClient.convertToType(data['vehicle_id'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * The time in Unix epoch milliseconds that the route actually ended.
 * @member {Number} actual_end_ms
 */
DispatchRouteBase.prototype['actual_end_ms'] = undefined;

/**
 * The time in Unix epoch milliseconds that the route actually started.
 * @member {Number} actual_start_ms
 */
DispatchRouteBase.prototype['actual_start_ms'] = undefined;

/**
 * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
 * @member {Number} driver_id
 */
DispatchRouteBase.prototype['driver_id'] = undefined;

/**
 * ID of the group if the organization has multiple groups (optional).
 * @member {Number} group_id
 */
DispatchRouteBase.prototype['group_id'] = undefined;

/**
 * Descriptive name of this route.
 * @member {String} name
 */
DispatchRouteBase.prototype['name'] = undefined;

/**
 * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
 * @member {Number} scheduled_end_ms
 */
DispatchRouteBase.prototype['scheduled_end_ms'] = undefined;

/**
 * The distance expected to be traveled for this route in meters.
 * @member {Number} scheduled_meters
 */
DispatchRouteBase.prototype['scheduled_meters'] = undefined;

/**
 * The time in Unix epoch milliseconds that the route is scheduled to start.
 * @member {Number} scheduled_start_ms
 */
DispatchRouteBase.prototype['scheduled_start_ms'] = undefined;

/**
 * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
 * @member {String} start_location_address
 */
DispatchRouteBase.prototype['start_location_address'] = undefined;

/**
 * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
 * @member {Number} start_location_address_id
 */
DispatchRouteBase.prototype['start_location_address_id'] = undefined;

/**
 * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
 * @member {Number} start_location_lat
 */
DispatchRouteBase.prototype['start_location_lat'] = undefined;

/**
 * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
 * @member {Number} start_location_lng
 */
DispatchRouteBase.prototype['start_location_lng'] = undefined;

/**
 * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
 * @member {String} start_location_name
 */
DispatchRouteBase.prototype['start_location_name'] = undefined;

/**
 * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
 * @member {Number} trailer_id
 */
DispatchRouteBase.prototype['trailer_id'] = undefined;

/**
 * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
 * @member {Number} vehicle_id
 */
DispatchRouteBase.prototype['vehicle_id'] = undefined;






export default DispatchRouteBase;

