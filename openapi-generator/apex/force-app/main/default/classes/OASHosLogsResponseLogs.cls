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
 * OASHosLogsResponseLogs
 */
public class OASHosLogsResponseLogs {
    /**
     * Longitude at which the log was recorded.
     * @return locLng
     */
    public Double locLng { get; set; }

    /**
     * The time at which the log/HOS status started in UNIX milliseconds.
     * @return logStartMs
     */
    public Long logStartMs { get; set; }

    /**
     * ID of the driver.
     * @return driverId
     */
    public Long driverId { get; set; }

    /**
     * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
     * @return statusType
     */
    public String statusType { get; set; }

    /**
     * City in which the log was recorded.
     * @return locCity
     */
    public String locCity { get; set; }

    /**
     * ID of the group.
     * @return groupId
     */
    public Long groupId { get; set; }

    /**
     * Name of location at which the log was recorded.
     * @return locName
     */
    public String locName { get; set; }

    /**
     * Latitude at which the log was recorded.
     * @return locLat
     */
    public Double locLat { get; set; }

    /**
     * Remark associated with the log entry.
     * @return remark
     */
    public String remark { get; set; }

    /**
     * State in which the log was recorded.
     * @return locState
     */
    public String locState { get; set; }

    /**
     * ID of the vehicle.
     * @return vehicleId
     */
    public Long vehicleId { get; set; }

    /**
     * Get codriverIds
     * @return codriverIds
     */
    public List<Long> codriverIds { get; set; }

    public OASHosLogsResponseLogs() {
        codriverIds = new List<Long>();
    }

    public static OASHosLogsResponseLogs getExample() {
        OASHosLogsResponseLogs hosLogsResponseLogs = new OASHosLogsResponseLogs();
          hosLogsResponseLogs.locLng = -98.502888123;
          hosLogsResponseLogs.logStartMs = 1462881998034L;
          hosLogsResponseLogs.driverId = 444L;
          hosLogsResponseLogs.statusType = 'OFF_DUTY';
          hosLogsResponseLogs.locCity = 'Ahwatukee';
          hosLogsResponseLogs.groupId = 101L;
          hosLogsResponseLogs.locName = 'McLean Site A';
          hosLogsResponseLogs.locLat = 23.413702345;
          hosLogsResponseLogs.remark = 'Lunch Break';
          hosLogsResponseLogs.locState = 'Arizona';
          hosLogsResponseLogs.vehicleId = 112L;
          hosLogsResponseLogs.codriverIds = new List<Long>{445L};
        return hosLogsResponseLogs;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASHosLogsResponseLogs) {           
            OASHosLogsResponseLogs hosLogsResponseLogs = (OASHosLogsResponseLogs) obj;
            return this.locLng == hosLogsResponseLogs.locLng
                && this.logStartMs == hosLogsResponseLogs.logStartMs
                && this.driverId == hosLogsResponseLogs.driverId
                && this.statusType == hosLogsResponseLogs.statusType
                && this.locCity == hosLogsResponseLogs.locCity
                && this.groupId == hosLogsResponseLogs.groupId
                && this.locName == hosLogsResponseLogs.locName
                && this.locLat == hosLogsResponseLogs.locLat
                && this.remark == hosLogsResponseLogs.remark
                && this.locState == hosLogsResponseLogs.locState
                && this.vehicleId == hosLogsResponseLogs.vehicleId
                && this.codriverIds == hosLogsResponseLogs.codriverIds;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (locLng == null ? 0 : System.hashCode(locLng));
        hashCode = (17 * hashCode) + (logStartMs == null ? 0 : System.hashCode(logStartMs));
        hashCode = (17 * hashCode) + (driverId == null ? 0 : System.hashCode(driverId));
        hashCode = (17 * hashCode) + (statusType == null ? 0 : System.hashCode(statusType));
        hashCode = (17 * hashCode) + (locCity == null ? 0 : System.hashCode(locCity));
        hashCode = (17 * hashCode) + (groupId == null ? 0 : System.hashCode(groupId));
        hashCode = (17 * hashCode) + (locName == null ? 0 : System.hashCode(locName));
        hashCode = (17 * hashCode) + (locLat == null ? 0 : System.hashCode(locLat));
        hashCode = (17 * hashCode) + (remark == null ? 0 : System.hashCode(remark));
        hashCode = (17 * hashCode) + (locState == null ? 0 : System.hashCode(locState));
        hashCode = (17 * hashCode) + (vehicleId == null ? 0 : System.hashCode(vehicleId));
        hashCode = (17 * hashCode) + (codriverIds == null ? 0 : System.hashCode(codriverIds));
        return hashCode;
    }
}

