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
 * OASDispatchRoute
 */
public class OASDispatchRoute implements OASDispatchRouteBase, OAS.MappedProperties {
    /**
     * The time in Unix epoch milliseconds that the route actually ended.
     * @return actualEndMs
     */
    public Long actualEndMs { get; set; }

    /**
     * The time in Unix epoch milliseconds that the route actually started.
     * @return actualStartMs
     */
    public Long actualStartMs { get; set; }

    /**
     * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @return driverId
     */
    public Long driverId { get; set; }

    /**
     * ID of the group if the organization has multiple groups (optional).
     * @return groupId
     */
    public Long groupId { get; set; }

    /**
     * Descriptive name of this route.
     * @return name
     */
    public String name { get; set; }

    /**
     * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     * @return scheduledEndMs
     */
    public Long scheduledEndMs { get; set; }

    /**
     * The distance expected to be traveled for this route in meters.
     * @return scheduledMeters
     */
    public Long scheduledMeters { get; set; }

    /**
     * The time in Unix epoch milliseconds that the route is scheduled to start.
     * @return scheduledStartMs
     */
    public Long scheduledStartMs { get; set; }

    /**
     * The address of the route\'s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     * @return startLocationAddress
     */
    public String startLocationAddress { get; set; }

    /**
     * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     * @return startLocationAddressId
     */
    public Long startLocationAddressId { get; set; }

    /**
     * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @return startLocationLat
     */
    public Double startLocationLat { get; set; }

    /**
     * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @return startLocationLng
     */
    public Double startLocationLng { get; set; }

    /**
     * The name of the route\'s starting location. If provided, it will take precedence over the name of the address book entry.
     * @return startLocationName
     */
    public String startLocationName { get; set; }

    /**
     * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     * @return trailerId
     */
    public Long trailerId { get; set; }

    /**
     * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @return vehicleId
     */
    public Long vehicleId { get; set; }

    /**
     * The dispatch jobs associated with this route.
     * @return dispatchJobs
     */
    public List<OASDispatchJob> dispatchJobs { get; set; }

    /**
     * ID of the Samsara dispatch route.
     * @return id
     */
    public Long id { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'dispatch_jobs' => 'dispatchJobs'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASDispatchRoute() {
        dispatchJobs = new List<OASDispatchJob>();
    }

    public static OASDispatchRoute getExample() {
        OASDispatchRoute dispatchRoute = new OASDispatchRoute();
          dispatchRoute.actualEndMs = 1462882101000L;
          dispatchRoute.actualStartMs = 1462882098000L;
          dispatchRoute.driverId = 555L;
          dispatchRoute.groupId = 101L;
          dispatchRoute.name = 'Bid #123';
          dispatchRoute.scheduledEndMs = 1462881998034L;
          dispatchRoute.scheduledMeters = 10000L;
          dispatchRoute.scheduledStartMs = 1462881998034L;
          dispatchRoute.startLocationAddress = '123 Main St, Philadelphia, PA 19106';
          dispatchRoute.startLocationAddressId = 67890L;
          dispatchRoute.startLocationLat = 123.456;
          dispatchRoute.startLocationLng = 37.459;
          dispatchRoute.startLocationName = 'ACME Inc. Philadelphia HQ';
          dispatchRoute.trailerId = 666L;
          dispatchRoute.vehicleId = 444L;
          dispatchRoute.dispatchJobs = new List<OASDispatchJob>{OASDispatchJob.getExample()};
          dispatchRoute.id = 556L;
        return dispatchRoute;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDispatchRoute) {           
            OASDispatchRoute dispatchRoute = (OASDispatchRoute) obj;
            return this.actualEndMs == dispatchRoute.actualEndMs
                && this.actualStartMs == dispatchRoute.actualStartMs
                && this.driverId == dispatchRoute.driverId
                && this.groupId == dispatchRoute.groupId
                && this.name == dispatchRoute.name
                && this.scheduledEndMs == dispatchRoute.scheduledEndMs
                && this.scheduledMeters == dispatchRoute.scheduledMeters
                && this.scheduledStartMs == dispatchRoute.scheduledStartMs
                && this.startLocationAddress == dispatchRoute.startLocationAddress
                && this.startLocationAddressId == dispatchRoute.startLocationAddressId
                && this.startLocationLat == dispatchRoute.startLocationLat
                && this.startLocationLng == dispatchRoute.startLocationLng
                && this.startLocationName == dispatchRoute.startLocationName
                && this.trailerId == dispatchRoute.trailerId
                && this.vehicleId == dispatchRoute.vehicleId
                && this.dispatchJobs == dispatchRoute.dispatchJobs
                && this.id == dispatchRoute.id;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (actualEndMs == null ? 0 : System.hashCode(actualEndMs));
        hashCode = (17 * hashCode) + (actualStartMs == null ? 0 : System.hashCode(actualStartMs));
        hashCode = (17 * hashCode) + (driverId == null ? 0 : System.hashCode(driverId));
        hashCode = (17 * hashCode) + (groupId == null ? 0 : System.hashCode(groupId));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (scheduledEndMs == null ? 0 : System.hashCode(scheduledEndMs));
        hashCode = (17 * hashCode) + (scheduledMeters == null ? 0 : System.hashCode(scheduledMeters));
        hashCode = (17 * hashCode) + (scheduledStartMs == null ? 0 : System.hashCode(scheduledStartMs));
        hashCode = (17 * hashCode) + (startLocationAddress == null ? 0 : System.hashCode(startLocationAddress));
        hashCode = (17 * hashCode) + (startLocationAddressId == null ? 0 : System.hashCode(startLocationAddressId));
        hashCode = (17 * hashCode) + (startLocationLat == null ? 0 : System.hashCode(startLocationLat));
        hashCode = (17 * hashCode) + (startLocationLng == null ? 0 : System.hashCode(startLocationLng));
        hashCode = (17 * hashCode) + (startLocationName == null ? 0 : System.hashCode(startLocationName));
        hashCode = (17 * hashCode) + (trailerId == null ? 0 : System.hashCode(trailerId));
        hashCode = (17 * hashCode) + (vehicleId == null ? 0 : System.hashCode(vehicleId));
        hashCode = (17 * hashCode) + (dispatchJobs == null ? 0 : System.hashCode(dispatchJobs));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        return hashCode;
    }
}

