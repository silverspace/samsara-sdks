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
 * Safety score details for a vehicle
 */
public class OASVehicleSafetyScoreResponse {
    /**
     * Crash event count
     * @return crashCount
     */
    public Integer crashCount { get; set; }

    /**
     * Harsh acceleration event count
     * @return harshAccelCount
     */
    public Integer harshAccelCount { get; set; }

    /**
     * Harsh braking event count
     * @return harshBrakingCount
     */
    public Integer harshBrakingCount { get; set; }

    /**
     * Get harshEvents
     * @return harshEvents
     */
    public List<OASSafetyReportHarshEvent> harshEvents { get; set; }

    /**
     * Harsh turning event count
     * @return harshTurningCount
     */
    public Integer harshTurningCount { get; set; }

    /**
     * Safety Score
     * @return safetyScore
     */
    public Integer safetyScore { get; set; }

    /**
     * Safety Score Rank
     * @return safetyScoreRank
     */
    public String safetyScoreRank { get; set; }

    /**
     * Amount of time driven over the speed limit in milliseconds
     * @return timeOverSpeedLimitMs
     */
    public Integer timeOverSpeedLimitMs { get; set; }

    /**
     * Total distance driven in meters
     * @return totalDistanceDrivenMeters
     */
    public Integer totalDistanceDrivenMeters { get; set; }

    /**
     * Total harsh event count
     * @return totalHarshEventCount
     */
    public Integer totalHarshEventCount { get; set; }

    /**
     * Amount of time driven in milliseconds
     * @return totalTimeDrivenMs
     */
    public Integer totalTimeDrivenMs { get; set; }

    /**
     * Vehicle ID
     * @return vehicleId
     */
    public Integer vehicleId { get; set; }

    public OASVehicleSafetyScoreResponse() {
        harshEvents = new List<OASSafetyReportHarshEvent>();
    }

    public static OASVehicleSafetyScoreResponse getExample() {
        OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse = new OASVehicleSafetyScoreResponse();
          vehicleSafetyScoreResponse.crashCount = 0;
          vehicleSafetyScoreResponse.harshAccelCount = 1;
          vehicleSafetyScoreResponse.harshBrakingCount = 2;
          vehicleSafetyScoreResponse.harshEvents = new List<OASSafetyReportHarshEvent>{OASSafetyReportHarshEvent.getExample()};
          vehicleSafetyScoreResponse.harshTurningCount = 0;
          vehicleSafetyScoreResponse.safetyScore = 97;
          vehicleSafetyScoreResponse.safetyScoreRank = '26';
          vehicleSafetyScoreResponse.timeOverSpeedLimitMs = 3769;
          vehicleSafetyScoreResponse.totalDistanceDrivenMeters = 291836;
          vehicleSafetyScoreResponse.totalHarshEventCount = 3;
          vehicleSafetyScoreResponse.totalTimeDrivenMs = 19708293;
          vehicleSafetyScoreResponse.vehicleId = 4321;
        return vehicleSafetyScoreResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASVehicleSafetyScoreResponse) {           
            OASVehicleSafetyScoreResponse vehicleSafetyScoreResponse = (OASVehicleSafetyScoreResponse) obj;
            return this.crashCount == vehicleSafetyScoreResponse.crashCount
                && this.harshAccelCount == vehicleSafetyScoreResponse.harshAccelCount
                && this.harshBrakingCount == vehicleSafetyScoreResponse.harshBrakingCount
                && this.harshEvents == vehicleSafetyScoreResponse.harshEvents
                && this.harshTurningCount == vehicleSafetyScoreResponse.harshTurningCount
                && this.safetyScore == vehicleSafetyScoreResponse.safetyScore
                && this.safetyScoreRank == vehicleSafetyScoreResponse.safetyScoreRank
                && this.timeOverSpeedLimitMs == vehicleSafetyScoreResponse.timeOverSpeedLimitMs
                && this.totalDistanceDrivenMeters == vehicleSafetyScoreResponse.totalDistanceDrivenMeters
                && this.totalHarshEventCount == vehicleSafetyScoreResponse.totalHarshEventCount
                && this.totalTimeDrivenMs == vehicleSafetyScoreResponse.totalTimeDrivenMs
                && this.vehicleId == vehicleSafetyScoreResponse.vehicleId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (crashCount == null ? 0 : System.hashCode(crashCount));
        hashCode = (17 * hashCode) + (harshAccelCount == null ? 0 : System.hashCode(harshAccelCount));
        hashCode = (17 * hashCode) + (harshBrakingCount == null ? 0 : System.hashCode(harshBrakingCount));
        hashCode = (17 * hashCode) + (harshEvents == null ? 0 : System.hashCode(harshEvents));
        hashCode = (17 * hashCode) + (harshTurningCount == null ? 0 : System.hashCode(harshTurningCount));
        hashCode = (17 * hashCode) + (safetyScore == null ? 0 : System.hashCode(safetyScore));
        hashCode = (17 * hashCode) + (safetyScoreRank == null ? 0 : System.hashCode(safetyScoreRank));
        hashCode = (17 * hashCode) + (timeOverSpeedLimitMs == null ? 0 : System.hashCode(timeOverSpeedLimitMs));
        hashCode = (17 * hashCode) + (totalDistanceDrivenMeters == null ? 0 : System.hashCode(totalDistanceDrivenMeters));
        hashCode = (17 * hashCode) + (totalHarshEventCount == null ? 0 : System.hashCode(totalHarshEventCount));
        hashCode = (17 * hashCode) + (totalTimeDrivenMs == null ? 0 : System.hashCode(totalTimeDrivenMs));
        hashCode = (17 * hashCode) + (vehicleId == null ? 0 : System.hashCode(vehicleId));
        return hashCode;
    }
}

