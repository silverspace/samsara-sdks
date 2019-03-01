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
import SafetyReportHarshEvent from './SafetyReportHarshEvent';

/**
 * The DriverSafetyScoreResponse model module.
 * @module model/DriverSafetyScoreResponse
 * @version 1.0.0
 */
class DriverSafetyScoreResponse {
    /**
     * Constructs a new <code>DriverSafetyScoreResponse</code>.
     * Safety score details for a driver
     * @alias module:model/DriverSafetyScoreResponse
     */
    constructor() { 
        
        DriverSafetyScoreResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DriverSafetyScoreResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DriverSafetyScoreResponse} obj Optional instance to populate.
     * @return {module:model/DriverSafetyScoreResponse} The populated <code>DriverSafetyScoreResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DriverSafetyScoreResponse();

            if (data.hasOwnProperty('crashCount')) {
                obj['crashCount'] = ApiClient.convertToType(data['crashCount'], 'Number');
            }
            if (data.hasOwnProperty('driverId')) {
                obj['driverId'] = ApiClient.convertToType(data['driverId'], 'Number');
            }
            if (data.hasOwnProperty('harshAccelCount')) {
                obj['harshAccelCount'] = ApiClient.convertToType(data['harshAccelCount'], 'Number');
            }
            if (data.hasOwnProperty('harshBrakingCount')) {
                obj['harshBrakingCount'] = ApiClient.convertToType(data['harshBrakingCount'], 'Number');
            }
            if (data.hasOwnProperty('harshEvents')) {
                obj['harshEvents'] = ApiClient.convertToType(data['harshEvents'], [SafetyReportHarshEvent]);
            }
            if (data.hasOwnProperty('harshTurningCount')) {
                obj['harshTurningCount'] = ApiClient.convertToType(data['harshTurningCount'], 'Number');
            }
            if (data.hasOwnProperty('safetyScore')) {
                obj['safetyScore'] = ApiClient.convertToType(data['safetyScore'], 'Number');
            }
            if (data.hasOwnProperty('safetyScoreRank')) {
                obj['safetyScoreRank'] = ApiClient.convertToType(data['safetyScoreRank'], 'String');
            }
            if (data.hasOwnProperty('timeOverSpeedLimitMs')) {
                obj['timeOverSpeedLimitMs'] = ApiClient.convertToType(data['timeOverSpeedLimitMs'], 'Number');
            }
            if (data.hasOwnProperty('totalDistanceDrivenMeters')) {
                obj['totalDistanceDrivenMeters'] = ApiClient.convertToType(data['totalDistanceDrivenMeters'], 'Number');
            }
            if (data.hasOwnProperty('totalHarshEventCount')) {
                obj['totalHarshEventCount'] = ApiClient.convertToType(data['totalHarshEventCount'], 'Number');
            }
            if (data.hasOwnProperty('totalTimeDrivenMs')) {
                obj['totalTimeDrivenMs'] = ApiClient.convertToType(data['totalTimeDrivenMs'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Crash event count
 * @member {Number} crashCount
 */
DriverSafetyScoreResponse.prototype['crashCount'] = undefined;

/**
 * Driver ID
 * @member {Number} driverId
 */
DriverSafetyScoreResponse.prototype['driverId'] = undefined;

/**
 * Harsh acceleration event count
 * @member {Number} harshAccelCount
 */
DriverSafetyScoreResponse.prototype['harshAccelCount'] = undefined;

/**
 * Harsh braking event count
 * @member {Number} harshBrakingCount
 */
DriverSafetyScoreResponse.prototype['harshBrakingCount'] = undefined;

/**
 * @member {Array.<module:model/SafetyReportHarshEvent>} harshEvents
 */
DriverSafetyScoreResponse.prototype['harshEvents'] = undefined;

/**
 * Harsh turning event count
 * @member {Number} harshTurningCount
 */
DriverSafetyScoreResponse.prototype['harshTurningCount'] = undefined;

/**
 * Safety Score
 * @member {Number} safetyScore
 */
DriverSafetyScoreResponse.prototype['safetyScore'] = undefined;

/**
 * Safety Score Rank
 * @member {String} safetyScoreRank
 */
DriverSafetyScoreResponse.prototype['safetyScoreRank'] = undefined;

/**
 * Amount of time driven over the speed limit in milliseconds
 * @member {Number} timeOverSpeedLimitMs
 */
DriverSafetyScoreResponse.prototype['timeOverSpeedLimitMs'] = undefined;

/**
 * Total distance driven in meters
 * @member {Number} totalDistanceDrivenMeters
 */
DriverSafetyScoreResponse.prototype['totalDistanceDrivenMeters'] = undefined;

/**
 * Total harsh event count
 * @member {Number} totalHarshEventCount
 */
DriverSafetyScoreResponse.prototype['totalHarshEventCount'] = undefined;

/**
 * Amount of time driven in milliseconds
 * @member {Number} totalTimeDrivenMs
 */
DriverSafetyScoreResponse.prototype['totalTimeDrivenMs'] = undefined;






export default DriverSafetyScoreResponse;

