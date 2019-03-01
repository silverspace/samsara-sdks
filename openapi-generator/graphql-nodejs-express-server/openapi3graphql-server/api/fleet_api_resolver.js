/**
 * 
 * Samsara API
 * 
 * 
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 * 
 * Version: 1.0.0
 * 
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// fleet_api

export default {
    Query: {

        // @return DispatchRoute
        FetchAllDispatchRoutes: ($accessToken, $groupId, $endTime, $duration) => {
            return {
                "accessToken": "accessToken_example",
                "groupId": "789",
                "endTime": "789",
                "duration": "789"
            };
        },

        // @return AllRouteJobUpdates
        FetchAllRouteJobUpdates: ($accessToken, $groupId, $sequenceId, $include) => {
            return {
                "accessToken": "accessToken_example",
                "groupId": "789",
                "sequenceId": "sequenceId_example",
                "include": "include_example"
            };
        },

        // @return InlineResponse2001
        GetAllAssetCurrentLocations: ($accessToken, $groupId) => {
            return {
                "accessToken": "accessToken_example",
                "groupId": "789"
            };
        },

        // @return InlineResponse200
        GetAllAssets: ($accessToken, $groupId) => {
            return {
                "accessToken": "accessToken_example",
                "groupId": "789"
            };
        },

        // @return Driver
        GetAllDeactivatedDrivers: ($accessToken, $groupId) => {
            return {
                "accessToken": "accessToken_example",
                "groupId": "789"
            };
        },

        // @return TodoObjectMapping
        GetAssetLocation: ($accessToken, $assetId, $startMs, $endMs) => {
            return {
                "accessToken": "accessToken_example",
                "assetId": "789",
                "startMs": "789",
                "endMs": "789"
            };
        },

        // @return AssetReeferResponse
        GetAssetReefer: ($accessToken, $assetId, $startMs, $endMs) => {
            return {
                "accessToken": "accessToken_example",
                "assetId": "789",
                "startMs": "789",
                "endMs": "789"
            };
        },

        // @return Driver
        GetDeactivatedDriverById: ($accessToken, $driverIdOrExternalId) => {
            return {
                "accessToken": "accessToken_example",
                "driverIdOrExternalId": "driverIdOrExternalId_example"
            };
        },

        // @return DispatchRoute
        GetDispatchRouteById: ($accessToken, $routeId) => {
            return {
                "accessToken": "accessToken_example",
                "routeId": "789"
            };
        },

        // @return DispatchRouteHistory
        GetDispatchRouteHistory: ($accessToken, $routeId, $startTime, $endTime) => {
            return {
                "accessToken": "accessToken_example",
                "routeId": "789",
                "startTime": "789",
                "endTime": "789"
            };
        },

        // @return DispatchRoute
        GetDispatchRoutesByDriverId: ($accessToken, $driverId, $endTime, $duration) => {
            return {
                "accessToken": "accessToken_example",
                "driverId": "789",
                "endTime": "789",
                "duration": "789"
            };
        },

        // @return DispatchRoute
        GetDispatchRoutesByVehicleId: ($accessToken, $vehicleId, $endTime, $duration) => {
            return {
                "accessToken": "accessToken_example",
                "vehicleId": "789",
                "endTime": "789",
                "duration": "789"
            };
        },

        // @return Driver
        GetDriverById: ($accessToken, $driverIdOrExternalId) => {
            return {
                "accessToken": "accessToken_example",
                "driverIdOrExternalId": "driverIdOrExternalId_example"
            };
        },

        // @return DocumentType
        GetDriverDocumentTypesByOrgId: () => {
            return {
                
            };
        },

        // @return Document
        GetDriverDocumentsByOrgId: ($accessToken, $endMs, $durationMs) => {
            return {
                "accessToken": "accessToken_example",
                "endMs": "789",
                "durationMs": "789"
            };
        },

        // @return DriverSafetyScoreResponse
        GetDriverSafetyScore: ($driverId, $accessToken, $startMs, $endMs) => {
            return {
                "driverId": "789",
                "accessToken": "accessToken_example",
                "startMs": "789",
                "endMs": "789"
            };
        },

        // @return DvirListResponse
        GetDvirs: ($accessToken, $endMs, $durationMs, $groupId) => {
            return {
                "accessToken": "accessToken_example",
                "endMs": "56",
                "durationMs": "56",
                "groupId": "56"
            };
        },

        // @return FleetVehicleResponse
        GetFleetVehicle: ($accessToken, $vehicleIdOrExternalId) => {
            return {
                "accessToken": "accessToken_example",
                "vehicleIdOrExternalId": "vehicleIdOrExternalId_example"
            };
        },

        // @return Address
        GetOrganizationAddress: ($accessToken, $addressId) => {
            return {
                "accessToken": "accessToken_example",
                "addressId": "789"
            };
        },

        // @return Address
        GetOrganizationAddresses: ($accessToken) => {
            return {
                "accessToken": "accessToken_example"
            };
        },

        // @return Contact
        GetOrganizationContact: ($accessToken, $contactId) => {
            return {
                "accessToken": "accessToken_example",
                "contactId": "789"
            };
        },

        // @return VehicleHarshEventResponse
        GetVehicleHarshEvent: ($vehicleId, $accessToken, $timestamp) => {
            return {
                "vehicleId": "789",
                "accessToken": "accessToken_example",
                "timestamp": "789"
            };
        },

        // @return FleetVehicleLocation
        GetVehicleLocations: ($accessToken, $vehicleId, $startMs, $endMs) => {
            return {
                "accessToken": "accessToken_example",
                "vehicleId": "789",
                "startMs": "789",
                "endMs": "789"
            };
        },

        // @return VehicleSafetyScoreResponse
        GetVehicleSafetyScore: ($vehicleId, $accessToken, $startMs, $endMs) => {
            return {
                "vehicleId": "789",
                "accessToken": "accessToken_example",
                "startMs": "789",
                "endMs": "789"
            };
        },

        // @return InlineResponse2005
        GetVehicleStats: ($accessToken, $startMs, $endMs, $series, $tagIds, $startingAfter, $endingBefore, $limit) => {
            return {
                "accessToken": "accessToken_example",
                "startMs": "56",
                "endMs": "56",
                "series": "series_example",
                "tagIds": "tagIds_example",
                "startingAfter": "startingAfter_example",
                "endingBefore": "endingBefore_example",
                "limit": "789"
            };
        },

        // @return TodoObjectMapping
        GetVehiclesLocations: ($accessToken, $startMs, $endMs) => {
            return {
                "accessToken": "accessToken_example",
                "startMs": "56",
                "endMs": "56"
            };
        },

        // @return Contact
        ListContacts: ($accessToken) => {
            return {
                "accessToken": "accessToken_example"
            };
        },

    },

    Mutation: {

        // @return 
        AddFleetAddress: ($accessToken, $addressParam) => {
            return {
                "accessToken": "accessToken_example",
                "addressParam": ""
            };
        },

        // @return Address
        AddOrganizationAddresses: ($accessToken, $addresses) => {
            return {
                "accessToken": "accessToken_example",
                "addresses": ""
            };
        },

        // @return DispatchRoute
        CreateDispatchRoute: ($accessToken, $createDispatchRouteParams) => {
            return {
                "accessToken": "accessToken_example",
                "createDispatchRouteParams": ""
            };
        },

        // @return Driver
        CreateDriver: ($accessToken, $createDriverParam) => {
            return {
                "accessToken": "accessToken_example",
                "createDriverParam": ""
            };
        },

        // @return DispatchRoute
        CreateDriverDispatchRoute: ($accessToken, $driverId, $createDispatchRouteParams) => {
            return {
                "accessToken": "accessToken_example",
                "driverId": "789",
                "createDispatchRouteParams": ""
            };
        },

        // @return Document
        CreateDriverDocument: ($accessToken, $driverId, $createDocumentParams) => {
            return {
                "accessToken": "accessToken_example",
                "driverId": "789",
                "createDocumentParams": ""
            };
        },

        // @return DvirBase
        CreateDvir: ($accessToken, $createDvirParam) => {
            return {
                "accessToken": "accessToken_example",
                "createDvirParam": ""
            };
        },

        // @return DispatchRoute
        CreateVehicleDispatchRoute: ($accessToken, $vehicleId, $createDispatchRouteParams) => {
            return {
                "accessToken": "accessToken_example",
                "vehicleId": "789",
                "createDispatchRouteParams": ""
            };
        },

        // @return 
        DeactivateDriver: ($accessToken, $driverIdOrExternalId) => {
            return {
                "accessToken": "accessToken_example",
                "driverIdOrExternalId": "driverIdOrExternalId_example"
            };
        },

        // @return 
        DeleteDispatchRouteById: ($accessToken, $routeId) => {
            return {
                "accessToken": "accessToken_example",
                "routeId": "789"
            };
        },

        // @return 
        DeleteOrganizationAddress: ($accessToken, $addressId) => {
            return {
                "accessToken": "accessToken_example",
                "addressId": "789"
            };
        },

        // @return DriversResponse
        GetFleetDrivers: ($accessToken, $groupDriversParam) => {
            return {
                "accessToken": "accessToken_example",
                "groupDriversParam": ""
            };
        },

        // @return DriverDailyLogResponse
        GetFleetDriversHosDailyLogs: ($accessToken, $driverId, $hosLogsParam) => {
            return {
                "accessToken": "accessToken_example",
                "driverId": "789",
                "hosLogsParam": ""
            };
        },

        // @return DriversSummaryResponse
        GetFleetDriversSummary: ($accessToken, $driversSummaryParam, $snapToDayBounds) => {
            return {
                "accessToken": "accessToken_example",
                "driversSummaryParam": "",
                "snapToDayBounds": "true"
            };
        },

        // @return HosAuthenticationLogsResponse
        GetFleetHosAuthenticationLogs: ($accessToken, $hosAuthenticationLogsParam) => {
            return {
                "accessToken": "accessToken_example",
                "hosAuthenticationLogsParam": ""
            };
        },

        // @return HosLogsResponse
        GetFleetHosLogs: ($accessToken, $hosLogsParam) => {
            return {
                "accessToken": "accessToken_example",
                "hosLogsParam": ""
            };
        },

        // @return HosLogsSummaryResponse
        GetFleetHosLogsSummary: ($accessToken, $hosLogsParam) => {
            return {
                "accessToken": "accessToken_example",
                "hosLogsParam": ""
            };
        },

        // @return InlineResponse2003
        GetFleetLocations: ($accessToken, $groupParam) => {
            return {
                "accessToken": "accessToken_example",
                "groupParam": ""
            };
        },

        // @return InlineResponse2004
        GetFleetMaintenanceList: ($accessToken, $groupParam) => {
            return {
                "accessToken": "accessToken_example",
                "groupParam": ""
            };
        },

        // @return TripResponse
        GetFleetTrips: ($accessToken, $tripsParam) => {
            return {
                "accessToken": "accessToken_example",
                "tripsParam": ""
            };
        },

        // @return InlineResponse2002
        ListFleet: ($accessToken, $groupParam, $startingAfter, $endingBefore, $limit) => {
            return {
                "accessToken": "accessToken_example",
                "groupParam": "",
                "startingAfter": "startingAfter_example",
                "endingBefore": "endingBefore_example",
                "limit": "789"
            };
        },

        // @return FleetVehicleResponse
        PatchFleetVehicle: ($accessToken, $vehicleIdOrExternalId, $data) => {
            return {
                "accessToken": "accessToken_example",
                "vehicleIdOrExternalId": "vehicleIdOrExternalId_example",
                "data": ""
            };
        },

        // @return Driver
        ReactivateDriverById: ($accessToken, $driverIdOrExternalId, $reactivateDriverParam) => {
            return {
                "accessToken": "accessToken_example",
                "driverIdOrExternalId": "driverIdOrExternalId_example",
                "reactivateDriverParam": ""
            };
        },

        // @return DispatchRoute
        UpdateDispatchRouteById: ($accessToken, $routeId, $updateDispatchRouteParams) => {
            return {
                "accessToken": "accessToken_example",
                "routeId": "789",
                "updateDispatchRouteParams": ""
            };
        },

        // @return 
        UpdateOrganizationAddress: ($accessToken, $addressId, $address) => {
            return {
                "accessToken": "accessToken_example",
                "addressId": "789",
                "address": ""
            };
        },

        // @return 
        UpdateVehicles: ($accessToken, $vehicleUpdateParam) => {
            return {
                "accessToken": "accessToken_example",
                "vehicleUpdateParam": ""
            };
        },

    }
}