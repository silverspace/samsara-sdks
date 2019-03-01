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
 * OASDvirBase
 */
public class OASDvirBase {
    /**
     * Get authorSignature
     * @return authorSignature
     */
    public OASDvirBaseAuthorSignature authorSignature { get; set; }

    /**
     * Signifies if the defects on the vehicle corrected after the DVIR is done.
     * @return defectsCorrected
     */
    public Boolean defectsCorrected { get; set; }

    /**
     * Signifies if the defects on this vehicle can be ignored.
     * @return defectsNeedNotBeCorrected
     */
    public Boolean defectsNeedNotBeCorrected { get; set; }

    /**
     * The id of this DVIR record.
     * @return id
     */
    public Long id { get; set; }

    /**
     * Inspection type of the DVIR.
     * @return inspectionType
     */
    public String inspectionType { get; set; }

    /**
     * The mechanics notes on the DVIR.
     * @return mechanicNotes
     */
    public String mechanicNotes { get; set; }

    /**
     * Get mechanicOrAgentSignature
     * @return mechanicOrAgentSignature
     */
    public OASDvirBaseMechanicOrAgentSignature mechanicOrAgentSignature { get; set; }

    /**
     * Get nextDriverSignature
     * @return nextDriverSignature
     */
    public OASDvirBaseNextDriverSignature nextDriverSignature { get; set; }

    /**
     * The odometer reading in miles for the vehicle when the DVIR was done.
     * @return odometerMiles
     */
    public Long odometerMiles { get; set; }

    /**
     * Timestamp of this DVIR in UNIX milliseconds.
     * @return timeMs
     */
    public Long timeMs { get; set; }

    /**
     * Defects registered for the trailer which was part of the DVIR.
     * @return trailerDefects
     */
    public List<OASDvirBaseTrailerDefects> trailerDefects { get; set; }

    /**
     * The id of the trailer which was part of the DVIR.
     * @return trailerId
     */
    public Integer trailerId { get; set; }

    /**
     * The name of the trailer which was part of the DVIR.
     * @return trailerName
     */
    public String trailerName { get; set; }

    /**
     * Get vehicle
     * @return vehicle
     */
    public OASDvirBaseVehicle vehicle { get; set; }

    /**
     * The condition of vechile on which DVIR was done.
     * @return vehicleCondition
     */
    public String vehicleCondition { get; set; }

    /**
     * Defects registered for the vehicle which was part of the DVIR.
     * @return vehicleDefects
     */
    public List<OASDvirBaseTrailerDefects> vehicleDefects { get; set; }

    public OASDvirBase() {
        trailerDefects = new List<OASDvirBaseTrailerDefects>();
        vehicleDefects = new List<OASDvirBaseTrailerDefects>();
    }

    public static OASDvirBase getExample() {
        OASDvirBase dvirBase = new OASDvirBase();
          dvirBase.authorSignature = OASDvirBaseAuthorSignature.getExample();
          dvirBase.defectsCorrected = true;
          dvirBase.defectsNeedNotBeCorrected = false;
          dvirBase.id = 19L;
          dvirBase.inspectionType = 'pre trip';
          dvirBase.mechanicNotes = 'The vehicle is now safe.';
          dvirBase.mechanicOrAgentSignature = OASDvirBaseMechanicOrAgentSignature.getExample();
          dvirBase.nextDriverSignature = OASDvirBaseNextDriverSignature.getExample();
          dvirBase.odometerMiles = 49912L;
          dvirBase.timeMs = 1453449599999L;
          dvirBase.trailerDefects = new List<OASDvirBaseTrailerDefects>{OASDvirBaseTrailerDefects.getExample()};
          dvirBase.trailerId = 19;
          dvirBase.trailerName = 'Storer\'s Trailer 19';
          dvirBase.vehicle = OASDvirBaseVehicle.getExample();
          dvirBase.vehicleCondition = 'SATISFACTORY';
          dvirBase.vehicleDefects = new List<OASDvirBaseTrailerDefects>{OASDvirBaseTrailerDefects.getExample()};
        return dvirBase;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDvirBase) {           
            OASDvirBase dvirBase = (OASDvirBase) obj;
            return this.authorSignature == dvirBase.authorSignature
                && this.defectsCorrected == dvirBase.defectsCorrected
                && this.defectsNeedNotBeCorrected == dvirBase.defectsNeedNotBeCorrected
                && this.id == dvirBase.id
                && this.inspectionType == dvirBase.inspectionType
                && this.mechanicNotes == dvirBase.mechanicNotes
                && this.mechanicOrAgentSignature == dvirBase.mechanicOrAgentSignature
                && this.nextDriverSignature == dvirBase.nextDriverSignature
                && this.odometerMiles == dvirBase.odometerMiles
                && this.timeMs == dvirBase.timeMs
                && this.trailerDefects == dvirBase.trailerDefects
                && this.trailerId == dvirBase.trailerId
                && this.trailerName == dvirBase.trailerName
                && this.vehicle == dvirBase.vehicle
                && this.vehicleCondition == dvirBase.vehicleCondition
                && this.vehicleDefects == dvirBase.vehicleDefects;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (authorSignature == null ? 0 : System.hashCode(authorSignature));
        hashCode = (17 * hashCode) + (defectsCorrected == null ? 0 : System.hashCode(defectsCorrected));
        hashCode = (17 * hashCode) + (defectsNeedNotBeCorrected == null ? 0 : System.hashCode(defectsNeedNotBeCorrected));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (inspectionType == null ? 0 : System.hashCode(inspectionType));
        hashCode = (17 * hashCode) + (mechanicNotes == null ? 0 : System.hashCode(mechanicNotes));
        hashCode = (17 * hashCode) + (mechanicOrAgentSignature == null ? 0 : System.hashCode(mechanicOrAgentSignature));
        hashCode = (17 * hashCode) + (nextDriverSignature == null ? 0 : System.hashCode(nextDriverSignature));
        hashCode = (17 * hashCode) + (odometerMiles == null ? 0 : System.hashCode(odometerMiles));
        hashCode = (17 * hashCode) + (timeMs == null ? 0 : System.hashCode(timeMs));
        hashCode = (17 * hashCode) + (trailerDefects == null ? 0 : System.hashCode(trailerDefects));
        hashCode = (17 * hashCode) + (trailerId == null ? 0 : System.hashCode(trailerId));
        hashCode = (17 * hashCode) + (trailerName == null ? 0 : System.hashCode(trailerName));
        hashCode = (17 * hashCode) + (vehicle == null ? 0 : System.hashCode(vehicle));
        hashCode = (17 * hashCode) + (vehicleCondition == null ? 0 : System.hashCode(vehicleCondition));
        hashCode = (17 * hashCode) + (vehicleDefects == null ? 0 : System.hashCode(vehicleDefects));
        return hashCode;
    }
}

