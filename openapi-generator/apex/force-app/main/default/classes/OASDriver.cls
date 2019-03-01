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
 * OASDriver
 */
public class OASDriver implements OASDriverBase {
    /**
     * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     * @return eldAdverseWeatherExemptionEnabled
     */
    public Boolean eldAdverseWeatherExemptionEnabled { get; set; }

    /**
     * Flag indicating this driver may use Big Day excemptions in ELD logs.
     * @return eldBigDayExemptionEnabled
     */
    public Boolean eldBigDayExemptionEnabled { get; set; }

    /**
     * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     * @return eldDayStartHour
     */
    public Integer eldDayStartHour { get; set; }

    /**
     * Flag indicating this driver is exempt from the Electronic Logging Mandate.
     * @return eldExempt
     */
    public Boolean eldExempt { get; set; }

    /**
     * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     * @return eldExemptReason
     */
    public String eldExemptReason { get; set; }

    /**
     * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     * @return eldPcEnabled
     */
    public Boolean eldPcEnabled { get; set; }

    /**
     * Flag indicating this driver may select the Yard Move duty status in ELD logs.
     * @return eldYmEnabled
     */
    public Boolean eldYmEnabled { get; set; }

    /**
     * Dictionary of external IDs (string key-value pairs)
     * @return externalIds
     */
    public Map<String, String> externalIds { get; set; }

    /**
     * ID of the group if the organization has multiple groups (uncommon).
     * @return groupId
     */
    public Long groupId { get; set; }

    /**
     * Driver\'s state issued license number.
     * @return licenseNumber
     */
    public String licenseNumber { get; set; }

    /**
     * Abbreviation of state that issued driver\'s license.
     * @return licenseState
     */
    public String licenseState { get; set; }

    /**
     * Driver\'s name.
     * @return name
     */
    public String name { get; set; }

    /**
     * Notes about the driver.
     * @return notes
     */
    public String notes { get; set; }

    /**
     * Driver\'s phone number. Please include only digits, ex. 4157771234
     * @return phone
     */
    public String phone { get; set; }

    /**
     * Driver\'s login username into the driver app.
     * @return username
     */
    public String username { get; set; }

    /**
     * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     * @return vehicleId
     */
    public Long vehicleId { get; set; }

    /**
     * ID of the driver.
     * @return id
     */
    public Long id { get; set; }

    /**
     * True if the driver account has been deactivated.
     * @return isDeactivated
     */
    public Boolean isDeactivated { get; set; }

    /**
     * Get tags
     * @return tags
     */
    public List<OASTagMetadata> tags { get; set; }

    public OASDriver() {
        eldPcEnabled = false;
        eldYmEnabled = false;
        externalIds = new Map<String, String>();
        tags = new List<OASTagMetadata>();
    }

    public static OASDriver getExample() {
        OASDriver driver = new OASDriver();
          driver.eldAdverseWeatherExemptionEnabled = true;
          driver.eldBigDayExemptionEnabled = true;
          driver.eldDayStartHour = 0;
          driver.eldExempt = true;
          driver.eldExemptReason = '';
          driver.eldPcEnabled = true;
          driver.eldYmEnabled = true;
          driver.externalIds = new Map<String, String>{'key'=>''};
          driver.groupId = 101L;
          driver.licenseNumber = 'E1234567';
          driver.licenseState = 'CA';
          driver.name = 'Susan Jones';
          driver.notes = 'Also goes by the nickname \'Furious Fred\'.';
          driver.phone = '5558234327';
          driver.username = 'Susan Jones';
          driver.vehicleId = 444L;
          driver.id = 556L;
          driver.isDeactivated = true;
          driver.tags = new List<OASTagMetadata>{OASTagMetadata.getExample()};
        return driver;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDriver) {           
            OASDriver driver = (OASDriver) obj;
            return this.eldAdverseWeatherExemptionEnabled == driver.eldAdverseWeatherExemptionEnabled
                && this.eldBigDayExemptionEnabled == driver.eldBigDayExemptionEnabled
                && this.eldDayStartHour == driver.eldDayStartHour
                && this.eldExempt == driver.eldExempt
                && this.eldExemptReason == driver.eldExemptReason
                && this.eldPcEnabled == driver.eldPcEnabled
                && this.eldYmEnabled == driver.eldYmEnabled
                && this.externalIds == driver.externalIds
                && this.groupId == driver.groupId
                && this.licenseNumber == driver.licenseNumber
                && this.licenseState == driver.licenseState
                && this.name == driver.name
                && this.notes == driver.notes
                && this.phone == driver.phone
                && this.username == driver.username
                && this.vehicleId == driver.vehicleId
                && this.id == driver.id
                && this.isDeactivated == driver.isDeactivated
                && this.tags == driver.tags;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (eldAdverseWeatherExemptionEnabled == null ? 0 : System.hashCode(eldAdverseWeatherExemptionEnabled));
        hashCode = (17 * hashCode) + (eldBigDayExemptionEnabled == null ? 0 : System.hashCode(eldBigDayExemptionEnabled));
        hashCode = (17 * hashCode) + (eldDayStartHour == null ? 0 : System.hashCode(eldDayStartHour));
        hashCode = (17 * hashCode) + (eldExempt == null ? 0 : System.hashCode(eldExempt));
        hashCode = (17 * hashCode) + (eldExemptReason == null ? 0 : System.hashCode(eldExemptReason));
        hashCode = (17 * hashCode) + (eldPcEnabled == null ? 0 : System.hashCode(eldPcEnabled));
        hashCode = (17 * hashCode) + (eldYmEnabled == null ? 0 : System.hashCode(eldYmEnabled));
        hashCode = (17 * hashCode) + (externalIds == null ? 0 : System.hashCode(externalIds));
        hashCode = (17 * hashCode) + (groupId == null ? 0 : System.hashCode(groupId));
        hashCode = (17 * hashCode) + (licenseNumber == null ? 0 : System.hashCode(licenseNumber));
        hashCode = (17 * hashCode) + (licenseState == null ? 0 : System.hashCode(licenseState));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (notes == null ? 0 : System.hashCode(notes));
        hashCode = (17 * hashCode) + (phone == null ? 0 : System.hashCode(phone));
        hashCode = (17 * hashCode) + (username == null ? 0 : System.hashCode(username));
        hashCode = (17 * hashCode) + (vehicleId == null ? 0 : System.hashCode(vehicleId));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (isDeactivated == null ? 0 : System.hashCode(isDeactivated));
        hashCode = (17 * hashCode) + (tags == null ? 0 : System.hashCode(tags));
        return hashCode;
    }
}

