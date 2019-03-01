/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFleetApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// /fleet/add_address
        /// </summary>
        /// <remarks>
        /// This method adds an address book entry to the specified group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns></returns>
        void AddFleetAddress (string accessToken, InlineObject2 addressParam);

        /// <summary>
        /// /fleet/add_address
        /// </summary>
        /// <remarks>
        /// This method adds an address book entry to the specified group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> AddFleetAddressWithHttpInfo (string accessToken, InlineObject2 addressParam);
        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>
        /// Add one or more addresses to the organization
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>List&lt;Address&gt;</returns>
        List<Address> AddOrganizationAddresses (string accessToken, InlineObject addresses);

        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>
        /// Add one or more addresses to the organization
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>ApiResponse of List&lt;Address&gt;</returns>
        ApiResponse<List<Address>> AddOrganizationAddressesWithHttpInfo (string accessToken, InlineObject addresses);
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> CreateDispatchRouteWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>
        /// Create a new driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Driver</returns>
        Driver CreateDriver (string accessToken, DriverForCreate createDriverParam);

        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>
        /// Create a new driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>ApiResponse of Driver</returns>
        ApiResponse<Driver> CreateDriverWithHttpInfo (string accessToken, DriverForCreate createDriverParam);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the driver with driver_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDriverDispatchRoute (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the driver with driver_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> CreateDriverDispatchRouteWithHttpInfo (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents
        /// </summary>
        /// <remarks>
        /// Create a driver document for the given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Document</returns>
        Document CreateDriverDocument (string accessToken, long? driverId, DocumentCreate createDocumentParams);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents
        /// </summary>
        /// <remarks>
        /// Create a driver document for the given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>ApiResponse of Document</returns>
        ApiResponse<Document> CreateDriverDocumentWithHttpInfo (string accessToken, long? driverId, DocumentCreate createDocumentParams);
        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>
        /// Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>DvirBase</returns>
        DvirBase CreateDvir (string accessToken, InlineObject12 createDvirParam);

        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>
        /// Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>ApiResponse of DvirBase</returns>
        ApiResponse<DvirBase> CreateDvirWithHttpInfo (string accessToken, InlineObject12 createDvirParam);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateVehicleDispatchRoute (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> CreateVehicleDispatchRouteWithHttpInfo (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Deactivate a driver with the given id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns></returns>
        void DeactivateDriver (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Deactivate a driver with the given id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeactivateDriverWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Delete a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        void DeleteDispatchRouteById (string accessToken, long? routeId);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Delete a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId);
        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Delete an address.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns></returns>
        void DeleteOrganizationAddress (string accessToken, long? addressId);

        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Delete an address.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteOrganizationAddressWithHttpInfo (string accessToken, long? addressId);
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> FetchAllDispatchRoutes (string accessToken, long? groupId = null, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        ApiResponse<List<DispatchRoute>> FetchAllDispatchRoutesWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>AllRouteJobUpdates</returns>
        AllRouteJobUpdates FetchAllRouteJobUpdates (string accessToken, long? groupId = null, string sequenceId = null, string include = null);

        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>ApiResponse of AllRouteJobUpdates</returns>
        ApiResponse<AllRouteJobUpdates> FetchAllRouteJobUpdatesWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null);
        /// <summary>
        /// /fleet/assets/locations
        /// </summary>
        /// <remarks>
        /// Fetch current locations of all assets for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse2001</returns>
        InlineResponse2001 GetAllAssetCurrentLocations (string accessToken, long? groupId = null);

        /// <summary>
        /// /fleet/assets/locations
        /// </summary>
        /// <remarks>
        /// Fetch current locations of all assets for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse2001</returns>
        ApiResponse<InlineResponse2001> GetAllAssetCurrentLocationsWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /fleet/assets
        /// </summary>
        /// <remarks>
        /// Fetch all of the assets for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 GetAllAssets (string accessToken, long? groupId = null);

        /// <summary>
        /// /fleet/assets
        /// </summary>
        /// <remarks>
        /// Fetch all of the assets for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse200</returns>
        ApiResponse<InlineResponse200> GetAllAssetsWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>
        /// Fetch all deactivated drivers for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>List&lt;Driver&gt;</returns>
        List<Driver> GetAllDeactivatedDrivers (string accessToken, long? groupId = null);

        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>
        /// Fetch all deactivated drivers for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of List&lt;Driver&gt;</returns>
        ApiResponse<List<Driver>> GetAllDeactivatedDriversWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations
        /// </summary>
        /// <remarks>
        /// Fetch the historical locations for the asset.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>List&lt;Object&gt;</returns>
        List<Object> GetAssetLocation (string accessToken, long? assetId, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations
        /// </summary>
        /// <remarks>
        /// Fetch the historical locations for the asset.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of List&lt;Object&gt;</returns>
        ApiResponse<List<Object>> GetAssetLocationWithHttpInfo (string accessToken, long? assetId, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer
        /// </summary>
        /// <remarks>
        /// Fetch the reefer-specific stats of an asset.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>AssetReeferResponse</returns>
        AssetReeferResponse GetAssetReefer (string accessToken, long? assetId, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer
        /// </summary>
        /// <remarks>
        /// Fetch the reefer-specific stats of an asset.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of AssetReeferResponse</returns>
        ApiResponse<AssetReeferResponse> GetAssetReeferWithHttpInfo (string accessToken, long? assetId, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch deactivated driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        Driver GetDeactivatedDriverById (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch deactivated driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        ApiResponse<Driver> GetDeactivatedDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a dispatch route by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute GetDispatchRouteById (string accessToken, long? routeId);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a dispatch route by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> GetDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>
        /// Fetch the history of a dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>DispatchRouteHistory</returns>
        DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long? routeId, long? startTime = null, long? endTime = null);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>
        /// Fetch the history of a dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of DispatchRouteHistory</returns>
        ApiResponse<DispatchRouteHistory> GetDispatchRouteHistoryWithHttpInfo (string accessToken, long? routeId, long? startTime = null, long? endTime = null);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long? driverId, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        ApiResponse<List<DispatchRoute>> GetDispatchRoutesByDriverIdWithHttpInfo (string accessToken, long? driverId, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long? vehicleId, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        ApiResponse<List<DispatchRoute>> GetDispatchRoutesByVehicleIdWithHttpInfo (string accessToken, long? vehicleId, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        Driver GetDriverById (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        ApiResponse<Driver> GetDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/drivers/document_types
        /// </summary>
        /// <remarks>
        /// Fetch all of the document types.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;DocumentType&gt;</returns>
        List<DocumentType> GetDriverDocumentTypesByOrgId ();

        /// <summary>
        /// /fleet/drivers/document_types
        /// </summary>
        /// <remarks>
        /// Fetch all of the document types.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;DocumentType&gt;</returns>
        ApiResponse<List<DocumentType>> GetDriverDocumentTypesByOrgIdWithHttpInfo ();
        /// <summary>
        /// /fleet/drivers/documents
        /// </summary>
        /// <remarks>
        /// Fetch all of the documents.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;Document&gt;</returns>
        List<Document> GetDriverDocumentsByOrgId (string accessToken, long? endMs = null, long? durationMs = null);

        /// <summary>
        /// /fleet/drivers/documents
        /// </summary>
        /// <remarks>
        /// Fetch all of the documents.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;Document&gt;</returns>
        ApiResponse<List<Document>> GetDriverDocumentsByOrgIdWithHttpInfo (string accessToken, long? endMs = null, long? durationMs = null);
        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>DriverSafetyScoreResponse</returns>
        DriverSafetyScoreResponse GetDriverSafetyScore (long? driverId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of DriverSafetyScoreResponse</returns>
        ApiResponse<DriverSafetyScoreResponse> GetDriverSafetyScoreWithHttpInfo (long? driverId, string accessToken, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>
        /// Get DVIRs for the org within provided time constraints
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>DvirListResponse</returns>
        DvirListResponse GetDvirs (string accessToken, int? endMs, int? durationMs, int? groupId = null);

        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>
        /// Get DVIRs for the org within provided time constraints
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>ApiResponse of DvirListResponse</returns>
        ApiResponse<DvirListResponse> GetDvirsWithHttpInfo (string accessToken, int? endMs, int? durationMs, int? groupId = null);
        /// <summary>
        /// /fleet/drivers
        /// </summary>
        /// <remarks>
        /// Get all the drivers for the specified group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>DriversResponse</returns>
        DriversResponse GetFleetDrivers (string accessToken, InlineObject3 groupDriversParam);

        /// <summary>
        /// /fleet/drivers
        /// </summary>
        /// <remarks>
        /// Get all the drivers for the specified group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>ApiResponse of DriversResponse</returns>
        ApiResponse<DriversResponse> GetFleetDriversWithHttpInfo (string accessToken, InlineObject3 groupDriversParam);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
        /// </summary>
        /// <remarks>
        /// Get summarized daily HOS charts for a specified driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>DriverDailyLogResponse</returns>
        DriverDailyLogResponse GetFleetDriversHosDailyLogs (string accessToken, long? driverId, InlineObject6 hosLogsParam);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
        /// </summary>
        /// <remarks>
        /// Get summarized daily HOS charts for a specified driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>ApiResponse of DriverDailyLogResponse</returns>
        ApiResponse<DriverDailyLogResponse> GetFleetDriversHosDailyLogsWithHttpInfo (string accessToken, long? driverId, InlineObject6 hosLogsParam);
        /// <summary>
        /// /fleet/drivers/summary
        /// </summary>
        /// <remarks>
        /// Get the distance and time each driver in an organization has driven in a given time period.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>DriversSummaryResponse</returns>
        DriversSummaryResponse GetFleetDriversSummary (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null);

        /// <summary>
        /// /fleet/drivers/summary
        /// </summary>
        /// <remarks>
        /// Get the distance and time each driver in an organization has driven in a given time period.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>ApiResponse of DriversSummaryResponse</returns>
        ApiResponse<DriversSummaryResponse> GetFleetDriversSummaryWithHttpInfo (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null);
        /// <summary>
        /// /fleet/hos_authentication_logs
        /// </summary>
        /// <remarks>
        /// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>HosAuthenticationLogsResponse</returns>
        HosAuthenticationLogsResponse GetFleetHosAuthenticationLogs (string accessToken, InlineObject7 hosAuthenticationLogsParam);

        /// <summary>
        /// /fleet/hos_authentication_logs
        /// </summary>
        /// <remarks>
        /// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>ApiResponse of HosAuthenticationLogsResponse</returns>
        ApiResponse<HosAuthenticationLogsResponse> GetFleetHosAuthenticationLogsWithHttpInfo (string accessToken, InlineObject7 hosAuthenticationLogsParam);
        /// <summary>
        /// /fleet/hos_logs
        /// </summary>
        /// <remarks>
        /// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>HosLogsResponse</returns>
        HosLogsResponse GetFleetHosLogs (string accessToken, InlineObject8 hosLogsParam);

        /// <summary>
        /// /fleet/hos_logs
        /// </summary>
        /// <remarks>
        /// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>ApiResponse of HosLogsResponse</returns>
        ApiResponse<HosLogsResponse> GetFleetHosLogsWithHttpInfo (string accessToken, InlineObject8 hosLogsParam);
        /// <summary>
        /// /fleet/hos_logs_summary
        /// </summary>
        /// <remarks>
        /// Get the current HOS status for all drivers in the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>HosLogsSummaryResponse</returns>
        HosLogsSummaryResponse GetFleetHosLogsSummary (string accessToken, InlineObject9 hosLogsParam);

        /// <summary>
        /// /fleet/hos_logs_summary
        /// </summary>
        /// <remarks>
        /// Get the current HOS status for all drivers in the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>ApiResponse of HosLogsSummaryResponse</returns>
        ApiResponse<HosLogsSummaryResponse> GetFleetHosLogsSummaryWithHttpInfo (string accessToken, InlineObject9 hosLogsParam);
        /// <summary>
        /// /fleet/locations
        /// </summary>
        /// <remarks>
        /// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2003</returns>
        InlineResponse2003 GetFleetLocations (string accessToken, InlineObject11 groupParam);

        /// <summary>
        /// /fleet/locations
        /// </summary>
        /// <remarks>
        /// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2003</returns>
        ApiResponse<InlineResponse2003> GetFleetLocationsWithHttpInfo (string accessToken, InlineObject11 groupParam);
        /// <summary>
        /// /fleet/maintenance/list
        /// </summary>
        /// <remarks>
        /// Get list of the vehicles with any engine faults or check light data.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2004</returns>
        InlineResponse2004 GetFleetMaintenanceList (string accessToken, InlineObject13 groupParam);

        /// <summary>
        /// /fleet/maintenance/list
        /// </summary>
        /// <remarks>
        /// Get list of the vehicles with any engine faults or check light data.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2004</returns>
        ApiResponse<InlineResponse2004> GetFleetMaintenanceListWithHttpInfo (string accessToken, InlineObject13 groupParam);
        /// <summary>
        /// /fleet/trips
        /// </summary>
        /// <remarks>
        /// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>TripResponse</returns>
        TripResponse GetFleetTrips (string accessToken, InlineObject15 tripsParam);

        /// <summary>
        /// /fleet/trips
        /// </summary>
        /// <remarks>
        /// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>ApiResponse of TripResponse</returns>
        ApiResponse<TripResponse> GetFleetTripsWithHttpInfo (string accessToken, InlineObject15 tripsParam);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Gets a specific vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>FleetVehicleResponse</returns>
        FleetVehicleResponse GetFleetVehicle (string accessToken, string vehicleIdOrExternalId);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Gets a specific vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of FleetVehicleResponse</returns>
        ApiResponse<FleetVehicleResponse> GetFleetVehicleWithHttpInfo (string accessToken, string vehicleIdOrExternalId);
        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Fetch an address by its id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Address</returns>
        Address GetOrganizationAddress (string accessToken, long? addressId);

        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Fetch an address by its id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>ApiResponse of Address</returns>
        ApiResponse<Address> GetOrganizationAddressWithHttpInfo (string accessToken, long? addressId);
        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>
        /// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;Address&gt;</returns>
        List<Address> GetOrganizationAddresses (string accessToken);

        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>
        /// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>ApiResponse of List&lt;Address&gt;</returns>
        ApiResponse<List<Address>> GetOrganizationAddressesWithHttpInfo (string accessToken);
        /// <summary>
        /// /contacts/{contact_id}
        /// </summary>
        /// <remarks>
        /// Fetch a contact by its id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Contact</returns>
        Contact GetOrganizationContact (string accessToken, long? contactId);

        /// <summary>
        /// /contacts/{contact_id}
        /// </summary>
        /// <remarks>
        /// Fetch a contact by its id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>ApiResponse of Contact</returns>
        ApiResponse<Contact> GetOrganizationContactWithHttpInfo (string accessToken, long? contactId);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>
        /// Fetch harsh event details for a vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>VehicleHarshEventResponse</returns>
        VehicleHarshEventResponse GetVehicleHarshEvent (long? vehicleId, string accessToken, long? timestamp);

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>
        /// Fetch harsh event details for a vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>ApiResponse of VehicleHarshEventResponse</returns>
        ApiResponse<VehicleHarshEventResponse> GetVehicleHarshEventWithHttpInfo (long? vehicleId, string accessToken, long? timestamp);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
        /// </summary>
        /// <remarks>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>List&lt;FleetVehicleLocation&gt;</returns>
        List<FleetVehicleLocation> GetVehicleLocations (string accessToken, long? vehicleId, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
        /// </summary>
        /// <remarks>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>ApiResponse of List&lt;FleetVehicleLocation&gt;</returns>
        ApiResponse<List<FleetVehicleLocation>> GetVehicleLocationsWithHttpInfo (string accessToken, long? vehicleId, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>VehicleSafetyScoreResponse</returns>
        VehicleSafetyScoreResponse GetVehicleSafetyScore (long? vehicleId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of VehicleSafetyScoreResponse</returns>
        ApiResponse<VehicleSafetyScoreResponse> GetVehicleSafetyScoreWithHttpInfo (long? vehicleId, string accessToken, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/vehicles/stats
        /// </summary>
        /// <remarks>
        /// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>InlineResponse2005</returns>
        InlineResponse2005 GetVehicleStats (string accessToken, int? startMs, int? endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null);

        /// <summary>
        /// /fleet/vehicles/stats
        /// </summary>
        /// <remarks>
        /// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>ApiResponse of InlineResponse2005</returns>
        ApiResponse<InlineResponse2005> GetVehicleStatsWithHttpInfo (string accessToken, int? startMs, int? endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null);
        /// <summary>
        /// /fleet/vehicles/locations
        /// </summary>
        /// <remarks>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>List&lt;Object&gt;</returns>
        List<Object> GetVehiclesLocations (string accessToken, int? startMs, int? endMs);

        /// <summary>
        /// /fleet/vehicles/locations
        /// </summary>
        /// <remarks>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>ApiResponse of List&lt;Object&gt;</returns>
        ApiResponse<List<Object>> GetVehiclesLocationsWithHttpInfo (string accessToken, int? startMs, int? endMs);
        /// <summary>
        /// /contacts
        /// </summary>
        /// <remarks>
        /// Fetch all contacts for the organization.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;Contact&gt;</returns>
        List<Contact> ListContacts (string accessToken);

        /// <summary>
        /// /contacts
        /// </summary>
        /// <remarks>
        /// Fetch all contacts for the organization.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>ApiResponse of List&lt;Contact&gt;</returns>
        ApiResponse<List<Contact>> ListContactsWithHttpInfo (string accessToken);
        /// <summary>
        /// /fleet/list
        /// </summary>
        /// <remarks>
        /// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>InlineResponse2002</returns>
        InlineResponse2002 ListFleet (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null);

        /// <summary>
        /// /fleet/list
        /// </summary>
        /// <remarks>
        /// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>ApiResponse of InlineResponse2002</returns>
        ApiResponse<InlineResponse2002> ListFleetWithHttpInfo (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>FleetVehicleResponse</returns>
        FleetVehicleResponse PatchFleetVehicle (string accessToken, string vehicleIdOrExternalId, InlineObject16 data);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>ApiResponse of FleetVehicleResponse</returns>
        ApiResponse<FleetVehicleResponse> PatchFleetVehicleWithHttpInfo (string accessToken, string vehicleIdOrExternalId, InlineObject16 data);
        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Reactivate the inactive driver having id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Driver</returns>
        Driver ReactivateDriverById (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Reactivate the inactive driver having id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>ApiResponse of Driver</returns>
        ApiResponse<Driver> ReactivateDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Update a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute UpdateDispatchRouteById (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Update a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> UpdateDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);
        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns></returns>
        void UpdateOrganizationAddress (string accessToken, long? addressId, InlineObject1 address);

        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> UpdateOrganizationAddressWithHttpInfo (string accessToken, long? addressId, InlineObject1 address);
        /// <summary>
        /// /fleet/set_data
        /// </summary>
        /// <remarks>
        /// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns></returns>
        void UpdateVehicles (string accessToken, InlineObject14 vehicleUpdateParam);

        /// <summary>
        /// /fleet/set_data
        /// </summary>
        /// <remarks>
        /// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> UpdateVehiclesWithHttpInfo (string accessToken, InlineObject14 vehicleUpdateParam);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// /fleet/add_address
        /// </summary>
        /// <remarks>
        /// This method adds an address book entry to the specified group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task AddFleetAddressAsync (string accessToken, InlineObject2 addressParam);

        /// <summary>
        /// /fleet/add_address
        /// </summary>
        /// <remarks>
        /// This method adds an address book entry to the specified group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> AddFleetAddressAsyncWithHttpInfo (string accessToken, InlineObject2 addressParam);
        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>
        /// Add one or more addresses to the organization
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>Task of List&lt;Address&gt;</returns>
        System.Threading.Tasks.Task<List<Address>> AddOrganizationAddressesAsync (string accessToken, InlineObject addresses);

        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>
        /// Add one or more addresses to the organization
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>Task of ApiResponse (List&lt;Address&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Address>>> AddOrganizationAddressesAsyncWithHttpInfo (string accessToken, InlineObject addresses);
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> CreateDispatchRouteAsync (string accessToken, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDispatchRouteAsyncWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>
        /// Create a new driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of Driver</returns>
        System.Threading.Tasks.Task<Driver> CreateDriverAsync (string accessToken, DriverForCreate createDriverParam);

        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>
        /// Create a new driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        System.Threading.Tasks.Task<ApiResponse<Driver>> CreateDriverAsyncWithHttpInfo (string accessToken, DriverForCreate createDriverParam);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the driver with driver_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> CreateDriverDispatchRouteAsync (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the driver with driver_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDriverDispatchRouteAsyncWithHttpInfo (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents
        /// </summary>
        /// <remarks>
        /// Create a driver document for the given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Task of Document</returns>
        System.Threading.Tasks.Task<Document> CreateDriverDocumentAsync (string accessToken, long? driverId, DocumentCreate createDocumentParams);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents
        /// </summary>
        /// <remarks>
        /// Create a driver document for the given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Task of ApiResponse (Document)</returns>
        System.Threading.Tasks.Task<ApiResponse<Document>> CreateDriverDocumentAsyncWithHttpInfo (string accessToken, long? driverId, DocumentCreate createDocumentParams);
        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>
        /// Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>Task of DvirBase</returns>
        System.Threading.Tasks.Task<DvirBase> CreateDvirAsync (string accessToken, InlineObject12 createDvirParam);

        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>
        /// Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>Task of ApiResponse (DvirBase)</returns>
        System.Threading.Tasks.Task<ApiResponse<DvirBase>> CreateDvirAsyncWithHttpInfo (string accessToken, InlineObject12 createDvirParam);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> CreateVehicleDispatchRouteAsync (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateVehicleDispatchRouteAsyncWithHttpInfo (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Deactivate a driver with the given id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeactivateDriverAsync (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Deactivate a driver with the given id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeactivateDriverAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Delete a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteDispatchRouteByIdAsync (string accessToken, long? routeId);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Delete a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId);
        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Delete an address.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteOrganizationAddressAsync (string accessToken, long? addressId);

        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Delete an address.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteOrganizationAddressAsyncWithHttpInfo (string accessToken, long? addressId);
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        System.Threading.Tasks.Task<List<DispatchRoute>> FetchAllDispatchRoutesAsync (string accessToken, long? groupId = null, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> FetchAllDispatchRoutesAsyncWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>Task of AllRouteJobUpdates</returns>
        System.Threading.Tasks.Task<AllRouteJobUpdates> FetchAllRouteJobUpdatesAsync (string accessToken, long? groupId = null, string sequenceId = null, string include = null);

        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>Task of ApiResponse (AllRouteJobUpdates)</returns>
        System.Threading.Tasks.Task<ApiResponse<AllRouteJobUpdates>> FetchAllRouteJobUpdatesAsyncWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null);
        /// <summary>
        /// /fleet/assets/locations
        /// </summary>
        /// <remarks>
        /// Fetch current locations of all assets for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of InlineResponse2001</returns>
        System.Threading.Tasks.Task<InlineResponse2001> GetAllAssetCurrentLocationsAsync (string accessToken, long? groupId = null);

        /// <summary>
        /// /fleet/assets/locations
        /// </summary>
        /// <remarks>
        /// Fetch current locations of all assets for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2001)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2001>> GetAllAssetCurrentLocationsAsyncWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /fleet/assets
        /// </summary>
        /// <remarks>
        /// Fetch all of the assets for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of InlineResponse200</returns>
        System.Threading.Tasks.Task<InlineResponse200> GetAllAssetsAsync (string accessToken, long? groupId = null);

        /// <summary>
        /// /fleet/assets
        /// </summary>
        /// <remarks>
        /// Fetch all of the assets for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse200)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse200>> GetAllAssetsAsyncWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>
        /// Fetch all deactivated drivers for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of List&lt;Driver&gt;</returns>
        System.Threading.Tasks.Task<List<Driver>> GetAllDeactivatedDriversAsync (string accessToken, long? groupId = null);

        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>
        /// Fetch all deactivated drivers for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Driver&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Driver>>> GetAllDeactivatedDriversAsyncWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations
        /// </summary>
        /// <remarks>
        /// Fetch the historical locations for the asset.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of List&lt;Object&gt;</returns>
        System.Threading.Tasks.Task<List<Object>> GetAssetLocationAsync (string accessToken, long? assetId, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations
        /// </summary>
        /// <remarks>
        /// Fetch the historical locations for the asset.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (List&lt;Object&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Object>>> GetAssetLocationAsyncWithHttpInfo (string accessToken, long? assetId, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer
        /// </summary>
        /// <remarks>
        /// Fetch the reefer-specific stats of an asset.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of AssetReeferResponse</returns>
        System.Threading.Tasks.Task<AssetReeferResponse> GetAssetReeferAsync (string accessToken, long? assetId, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer
        /// </summary>
        /// <remarks>
        /// Fetch the reefer-specific stats of an asset.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (AssetReeferResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<AssetReeferResponse>> GetAssetReeferAsyncWithHttpInfo (string accessToken, long? assetId, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch deactivated driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of Driver</returns>
        System.Threading.Tasks.Task<Driver> GetDeactivatedDriverByIdAsync (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch deactivated driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        System.Threading.Tasks.Task<ApiResponse<Driver>> GetDeactivatedDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a dispatch route by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> GetDispatchRouteByIdAsync (string accessToken, long? routeId);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a dispatch route by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> GetDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>
        /// Fetch the history of a dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>Task of DispatchRouteHistory</returns>
        System.Threading.Tasks.Task<DispatchRouteHistory> GetDispatchRouteHistoryAsync (string accessToken, long? routeId, long? startTime = null, long? endTime = null);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>
        /// Fetch the history of a dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (DispatchRouteHistory)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRouteHistory>> GetDispatchRouteHistoryAsyncWithHttpInfo (string accessToken, long? routeId, long? startTime = null, long? endTime = null);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByDriverIdAsync (string accessToken, long? driverId, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByDriverIdAsyncWithHttpInfo (string accessToken, long? driverId, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByVehicleIdAsync (string accessToken, long? vehicleId, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByVehicleIdAsyncWithHttpInfo (string accessToken, long? vehicleId, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of Driver</returns>
        System.Threading.Tasks.Task<Driver> GetDriverByIdAsync (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        System.Threading.Tasks.Task<ApiResponse<Driver>> GetDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/drivers/document_types
        /// </summary>
        /// <remarks>
        /// Fetch all of the document types.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;DocumentType&gt;</returns>
        System.Threading.Tasks.Task<List<DocumentType>> GetDriverDocumentTypesByOrgIdAsync ();

        /// <summary>
        /// /fleet/drivers/document_types
        /// </summary>
        /// <remarks>
        /// Fetch all of the document types.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;DocumentType&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<DocumentType>>> GetDriverDocumentTypesByOrgIdAsyncWithHttpInfo ();
        /// <summary>
        /// /fleet/drivers/documents
        /// </summary>
        /// <remarks>
        /// Fetch all of the documents.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;Document&gt;</returns>
        System.Threading.Tasks.Task<List<Document>> GetDriverDocumentsByOrgIdAsync (string accessToken, long? endMs = null, long? durationMs = null);

        /// <summary>
        /// /fleet/drivers/documents
        /// </summary>
        /// <remarks>
        /// Fetch all of the documents.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Document&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Document>>> GetDriverDocumentsByOrgIdAsyncWithHttpInfo (string accessToken, long? endMs = null, long? durationMs = null);
        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of DriverSafetyScoreResponse</returns>
        System.Threading.Tasks.Task<DriverSafetyScoreResponse> GetDriverSafetyScoreAsync (long? driverId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (DriverSafetyScoreResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DriverSafetyScoreResponse>> GetDriverSafetyScoreAsyncWithHttpInfo (long? driverId, string accessToken, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>
        /// Get DVIRs for the org within provided time constraints
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>Task of DvirListResponse</returns>
        System.Threading.Tasks.Task<DvirListResponse> GetDvirsAsync (string accessToken, int? endMs, int? durationMs, int? groupId = null);

        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>
        /// Get DVIRs for the org within provided time constraints
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>Task of ApiResponse (DvirListResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DvirListResponse>> GetDvirsAsyncWithHttpInfo (string accessToken, int? endMs, int? durationMs, int? groupId = null);
        /// <summary>
        /// /fleet/drivers
        /// </summary>
        /// <remarks>
        /// Get all the drivers for the specified group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>Task of DriversResponse</returns>
        System.Threading.Tasks.Task<DriversResponse> GetFleetDriversAsync (string accessToken, InlineObject3 groupDriversParam);

        /// <summary>
        /// /fleet/drivers
        /// </summary>
        /// <remarks>
        /// Get all the drivers for the specified group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>Task of ApiResponse (DriversResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DriversResponse>> GetFleetDriversAsyncWithHttpInfo (string accessToken, InlineObject3 groupDriversParam);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
        /// </summary>
        /// <remarks>
        /// Get summarized daily HOS charts for a specified driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of DriverDailyLogResponse</returns>
        System.Threading.Tasks.Task<DriverDailyLogResponse> GetFleetDriversHosDailyLogsAsync (string accessToken, long? driverId, InlineObject6 hosLogsParam);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
        /// </summary>
        /// <remarks>
        /// Get summarized daily HOS charts for a specified driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of ApiResponse (DriverDailyLogResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DriverDailyLogResponse>> GetFleetDriversHosDailyLogsAsyncWithHttpInfo (string accessToken, long? driverId, InlineObject6 hosLogsParam);
        /// <summary>
        /// /fleet/drivers/summary
        /// </summary>
        /// <remarks>
        /// Get the distance and time each driver in an organization has driven in a given time period.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>Task of DriversSummaryResponse</returns>
        System.Threading.Tasks.Task<DriversSummaryResponse> GetFleetDriversSummaryAsync (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null);

        /// <summary>
        /// /fleet/drivers/summary
        /// </summary>
        /// <remarks>
        /// Get the distance and time each driver in an organization has driven in a given time period.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>Task of ApiResponse (DriversSummaryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DriversSummaryResponse>> GetFleetDriversSummaryAsyncWithHttpInfo (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null);
        /// <summary>
        /// /fleet/hos_authentication_logs
        /// </summary>
        /// <remarks>
        /// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>Task of HosAuthenticationLogsResponse</returns>
        System.Threading.Tasks.Task<HosAuthenticationLogsResponse> GetFleetHosAuthenticationLogsAsync (string accessToken, InlineObject7 hosAuthenticationLogsParam);

        /// <summary>
        /// /fleet/hos_authentication_logs
        /// </summary>
        /// <remarks>
        /// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>Task of ApiResponse (HosAuthenticationLogsResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<HosAuthenticationLogsResponse>> GetFleetHosAuthenticationLogsAsyncWithHttpInfo (string accessToken, InlineObject7 hosAuthenticationLogsParam);
        /// <summary>
        /// /fleet/hos_logs
        /// </summary>
        /// <remarks>
        /// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of HosLogsResponse</returns>
        System.Threading.Tasks.Task<HosLogsResponse> GetFleetHosLogsAsync (string accessToken, InlineObject8 hosLogsParam);

        /// <summary>
        /// /fleet/hos_logs
        /// </summary>
        /// <remarks>
        /// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of ApiResponse (HosLogsResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<HosLogsResponse>> GetFleetHosLogsAsyncWithHttpInfo (string accessToken, InlineObject8 hosLogsParam);
        /// <summary>
        /// /fleet/hos_logs_summary
        /// </summary>
        /// <remarks>
        /// Get the current HOS status for all drivers in the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of HosLogsSummaryResponse</returns>
        System.Threading.Tasks.Task<HosLogsSummaryResponse> GetFleetHosLogsSummaryAsync (string accessToken, InlineObject9 hosLogsParam);

        /// <summary>
        /// /fleet/hos_logs_summary
        /// </summary>
        /// <remarks>
        /// Get the current HOS status for all drivers in the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of ApiResponse (HosLogsSummaryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<HosLogsSummaryResponse>> GetFleetHosLogsSummaryAsyncWithHttpInfo (string accessToken, InlineObject9 hosLogsParam);
        /// <summary>
        /// /fleet/locations
        /// </summary>
        /// <remarks>
        /// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of InlineResponse2003</returns>
        System.Threading.Tasks.Task<InlineResponse2003> GetFleetLocationsAsync (string accessToken, InlineObject11 groupParam);

        /// <summary>
        /// /fleet/locations
        /// </summary>
        /// <remarks>
        /// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2003)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2003>> GetFleetLocationsAsyncWithHttpInfo (string accessToken, InlineObject11 groupParam);
        /// <summary>
        /// /fleet/maintenance/list
        /// </summary>
        /// <remarks>
        /// Get list of the vehicles with any engine faults or check light data.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of InlineResponse2004</returns>
        System.Threading.Tasks.Task<InlineResponse2004> GetFleetMaintenanceListAsync (string accessToken, InlineObject13 groupParam);

        /// <summary>
        /// /fleet/maintenance/list
        /// </summary>
        /// <remarks>
        /// Get list of the vehicles with any engine faults or check light data.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2004)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2004>> GetFleetMaintenanceListAsyncWithHttpInfo (string accessToken, InlineObject13 groupParam);
        /// <summary>
        /// /fleet/trips
        /// </summary>
        /// <remarks>
        /// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>Task of TripResponse</returns>
        System.Threading.Tasks.Task<TripResponse> GetFleetTripsAsync (string accessToken, InlineObject15 tripsParam);

        /// <summary>
        /// /fleet/trips
        /// </summary>
        /// <remarks>
        /// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>Task of ApiResponse (TripResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<TripResponse>> GetFleetTripsAsyncWithHttpInfo (string accessToken, InlineObject15 tripsParam);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Gets a specific vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of FleetVehicleResponse</returns>
        System.Threading.Tasks.Task<FleetVehicleResponse> GetFleetVehicleAsync (string accessToken, string vehicleIdOrExternalId);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Gets a specific vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (FleetVehicleResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<FleetVehicleResponse>> GetFleetVehicleAsyncWithHttpInfo (string accessToken, string vehicleIdOrExternalId);
        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Fetch an address by its id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of Address</returns>
        System.Threading.Tasks.Task<Address> GetOrganizationAddressAsync (string accessToken, long? addressId);

        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Fetch an address by its id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of ApiResponse (Address)</returns>
        System.Threading.Tasks.Task<ApiResponse<Address>> GetOrganizationAddressAsyncWithHttpInfo (string accessToken, long? addressId);
        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>
        /// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of List&lt;Address&gt;</returns>
        System.Threading.Tasks.Task<List<Address>> GetOrganizationAddressesAsync (string accessToken);

        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>
        /// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of ApiResponse (List&lt;Address&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Address>>> GetOrganizationAddressesAsyncWithHttpInfo (string accessToken);
        /// <summary>
        /// /contacts/{contact_id}
        /// </summary>
        /// <remarks>
        /// Fetch a contact by its id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Task of Contact</returns>
        System.Threading.Tasks.Task<Contact> GetOrganizationContactAsync (string accessToken, long? contactId);

        /// <summary>
        /// /contacts/{contact_id}
        /// </summary>
        /// <remarks>
        /// Fetch a contact by its id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Task of ApiResponse (Contact)</returns>
        System.Threading.Tasks.Task<ApiResponse<Contact>> GetOrganizationContactAsyncWithHttpInfo (string accessToken, long? contactId);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>
        /// Fetch harsh event details for a vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of VehicleHarshEventResponse</returns>
        System.Threading.Tasks.Task<VehicleHarshEventResponse> GetVehicleHarshEventAsync (long? vehicleId, string accessToken, long? timestamp);

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>
        /// Fetch harsh event details for a vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of ApiResponse (VehicleHarshEventResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<VehicleHarshEventResponse>> GetVehicleHarshEventAsyncWithHttpInfo (long? vehicleId, string accessToken, long? timestamp);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
        /// </summary>
        /// <remarks>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>Task of List&lt;FleetVehicleLocation&gt;</returns>
        System.Threading.Tasks.Task<List<FleetVehicleLocation>> GetVehicleLocationsAsync (string accessToken, long? vehicleId, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
        /// </summary>
        /// <remarks>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>Task of ApiResponse (List&lt;FleetVehicleLocation&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<FleetVehicleLocation>>> GetVehicleLocationsAsyncWithHttpInfo (string accessToken, long? vehicleId, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of VehicleSafetyScoreResponse</returns>
        System.Threading.Tasks.Task<VehicleSafetyScoreResponse> GetVehicleSafetyScoreAsync (long? vehicleId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (VehicleSafetyScoreResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<VehicleSafetyScoreResponse>> GetVehicleSafetyScoreAsyncWithHttpInfo (long? vehicleId, string accessToken, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/vehicles/stats
        /// </summary>
        /// <remarks>
        /// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>Task of InlineResponse2005</returns>
        System.Threading.Tasks.Task<InlineResponse2005> GetVehicleStatsAsync (string accessToken, int? startMs, int? endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null);

        /// <summary>
        /// /fleet/vehicles/stats
        /// </summary>
        /// <remarks>
        /// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2005)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2005>> GetVehicleStatsAsyncWithHttpInfo (string accessToken, int? startMs, int? endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null);
        /// <summary>
        /// /fleet/vehicles/locations
        /// </summary>
        /// <remarks>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>Task of List&lt;Object&gt;</returns>
        System.Threading.Tasks.Task<List<Object>> GetVehiclesLocationsAsync (string accessToken, int? startMs, int? endMs);

        /// <summary>
        /// /fleet/vehicles/locations
        /// </summary>
        /// <remarks>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>Task of ApiResponse (List&lt;Object&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Object>>> GetVehiclesLocationsAsyncWithHttpInfo (string accessToken, int? startMs, int? endMs);
        /// <summary>
        /// /contacts
        /// </summary>
        /// <remarks>
        /// Fetch all contacts for the organization.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of List&lt;Contact&gt;</returns>
        System.Threading.Tasks.Task<List<Contact>> ListContactsAsync (string accessToken);

        /// <summary>
        /// /contacts
        /// </summary>
        /// <remarks>
        /// Fetch all contacts for the organization.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of ApiResponse (List&lt;Contact&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Contact>>> ListContactsAsyncWithHttpInfo (string accessToken);
        /// <summary>
        /// /fleet/list
        /// </summary>
        /// <remarks>
        /// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>Task of InlineResponse2002</returns>
        System.Threading.Tasks.Task<InlineResponse2002> ListFleetAsync (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null);

        /// <summary>
        /// /fleet/list
        /// </summary>
        /// <remarks>
        /// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2002)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2002>> ListFleetAsyncWithHttpInfo (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>Task of FleetVehicleResponse</returns>
        System.Threading.Tasks.Task<FleetVehicleResponse> PatchFleetVehicleAsync (string accessToken, string vehicleIdOrExternalId, InlineObject16 data);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>Task of ApiResponse (FleetVehicleResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<FleetVehicleResponse>> PatchFleetVehicleAsyncWithHttpInfo (string accessToken, string vehicleIdOrExternalId, InlineObject16 data);
        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Reactivate the inactive driver having id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Task of Driver</returns>
        System.Threading.Tasks.Task<Driver> ReactivateDriverByIdAsync (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Reactivate the inactive driver having id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        System.Threading.Tasks.Task<ApiResponse<Driver>> ReactivateDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Update a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> UpdateDispatchRouteByIdAsync (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Update a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> UpdateDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);
        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task UpdateOrganizationAddressAsync (string accessToken, long? addressId, InlineObject1 address);

        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>
        /// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> UpdateOrganizationAddressAsyncWithHttpInfo (string accessToken, long? addressId, InlineObject1 address);
        /// <summary>
        /// /fleet/set_data
        /// </summary>
        /// <remarks>
        /// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task UpdateVehiclesAsync (string accessToken, InlineObject14 vehicleUpdateParam);

        /// <summary>
        /// /fleet/set_data
        /// </summary>
        /// <remarks>
        /// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> UpdateVehiclesAsyncWithHttpInfo (string accessToken, InlineObject14 vehicleUpdateParam);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class FleetApi : IFleetApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="FleetApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FleetApi(String basePath)
        {
            this.Configuration = new Org.OpenAPITools.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FleetApi"/> class
        /// </summary>
        /// <returns></returns>
        public FleetApi()
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.Default;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FleetApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public FleetApi(Org.OpenAPITools.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Org.OpenAPITools.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Org.OpenAPITools.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// /fleet/add_address This method adds an address book entry to the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns></returns>
        public void AddFleetAddress (string accessToken, InlineObject2 addressParam)
        {
             AddFleetAddressWithHttpInfo(accessToken, addressParam);
        }

        /// <summary>
        /// /fleet/add_address This method adds an address book entry to the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> AddFleetAddressWithHttpInfo (string accessToken, InlineObject2 addressParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->AddFleetAddress");
            // verify the required parameter 'addressParam' is set
            if (addressParam == null)
                throw new ApiException(400, "Missing required parameter 'addressParam' when calling FleetApi->AddFleetAddress");

            var localVarPath = "/fleet/add_address";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (addressParam != null && addressParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(addressParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = addressParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AddFleetAddress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/add_address This method adds an address book entry to the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task AddFleetAddressAsync (string accessToken, InlineObject2 addressParam)
        {
             await AddFleetAddressAsyncWithHttpInfo(accessToken, addressParam);

        }

        /// <summary>
        /// /fleet/add_address This method adds an address book entry to the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> AddFleetAddressAsyncWithHttpInfo (string accessToken, InlineObject2 addressParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->AddFleetAddress");
            // verify the required parameter 'addressParam' is set
            if (addressParam == null)
                throw new ApiException(400, "Missing required parameter 'addressParam' when calling FleetApi->AddFleetAddress");

            var localVarPath = "/fleet/add_address";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (addressParam != null && addressParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(addressParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = addressParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AddFleetAddress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /addresses Add one or more addresses to the organization
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>List&lt;Address&gt;</returns>
        public List<Address> AddOrganizationAddresses (string accessToken, InlineObject addresses)
        {
             ApiResponse<List<Address>> localVarResponse = AddOrganizationAddressesWithHttpInfo(accessToken, addresses);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /addresses Add one or more addresses to the organization
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>ApiResponse of List&lt;Address&gt;</returns>
        public ApiResponse< List<Address> > AddOrganizationAddressesWithHttpInfo (string accessToken, InlineObject addresses)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->AddOrganizationAddresses");
            // verify the required parameter 'addresses' is set
            if (addresses == null)
                throw new ApiException(400, "Missing required parameter 'addresses' when calling FleetApi->AddOrganizationAddresses");

            var localVarPath = "/addresses";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (addresses != null && addresses.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(addresses); // http body (model) parameter
            }
            else
            {
                localVarPostBody = addresses; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AddOrganizationAddresses", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Address>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Address>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Address>)));
        }

        /// <summary>
        /// /addresses Add one or more addresses to the organization
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>Task of List&lt;Address&gt;</returns>
        public async System.Threading.Tasks.Task<List<Address>> AddOrganizationAddressesAsync (string accessToken, InlineObject addresses)
        {
             ApiResponse<List<Address>> localVarResponse = await AddOrganizationAddressesAsyncWithHttpInfo(accessToken, addresses);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /addresses Add one or more addresses to the organization
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>Task of ApiResponse (List&lt;Address&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Address>>> AddOrganizationAddressesAsyncWithHttpInfo (string accessToken, InlineObject addresses)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->AddOrganizationAddresses");
            // verify the required parameter 'addresses' is set
            if (addresses == null)
                throw new ApiException(400, "Missing required parameter 'addresses' when calling FleetApi->AddOrganizationAddresses");

            var localVarPath = "/addresses";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (addresses != null && addresses.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(addresses); // http body (model) parameter
            }
            else
            {
                localVarPostBody = addresses; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AddOrganizationAddresses", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Address>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Address>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Address>)));
        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = CreateDispatchRouteWithHttpInfo(accessToken, createDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > CreateDispatchRouteWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateDispatchRoute");

            var localVarPath = "/fleet/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateDispatchRouteAsync (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = await CreateDispatchRouteAsyncWithHttpInfo(accessToken, createDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDispatchRouteAsyncWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateDispatchRoute");

            var localVarPath = "/fleet/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Driver</returns>
        public Driver CreateDriver (string accessToken, DriverForCreate createDriverParam)
        {
             ApiResponse<Driver> localVarResponse = CreateDriverWithHttpInfo(accessToken, createDriverParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>ApiResponse of Driver</returns>
        public ApiResponse< Driver > CreateDriverWithHttpInfo (string accessToken, DriverForCreate createDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriver");
            // verify the required parameter 'createDriverParam' is set
            if (createDriverParam == null)
                throw new ApiException(400, "Missing required parameter 'createDriverParam' when calling FleetApi->CreateDriver");

            var localVarPath = "/fleet/drivers/create";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDriverParam != null && createDriverParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDriverParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDriverParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriver", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of Driver</returns>
        public async System.Threading.Tasks.Task<Driver> CreateDriverAsync (string accessToken, DriverForCreate createDriverParam)
        {
             ApiResponse<Driver> localVarResponse = await CreateDriverAsyncWithHttpInfo(accessToken, createDriverParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Driver>> CreateDriverAsyncWithHttpInfo (string accessToken, DriverForCreate createDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriver");
            // verify the required parameter 'createDriverParam' is set
            if (createDriverParam == null)
                throw new ApiException(400, "Missing required parameter 'createDriverParam' when calling FleetApi->CreateDriver");

            var localVarPath = "/fleet/drivers/create";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDriverParam != null && createDriverParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDriverParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDriverParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriver", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateDriverDispatchRoute (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = CreateDriverDispatchRouteWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > CreateDriverDispatchRouteWithHttpInfo (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriverDispatchRoute");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->CreateDriverDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateDriverDispatchRoute");

            var localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriverDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateDriverDispatchRouteAsync (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = await CreateDriverDispatchRouteAsyncWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDriverDispatchRouteAsyncWithHttpInfo (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriverDispatchRoute");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->CreateDriverDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateDriverDispatchRoute");

            var localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriverDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents Create a driver document for the given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Document</returns>
        public Document CreateDriverDocument (string accessToken, long? driverId, DocumentCreate createDocumentParams)
        {
             ApiResponse<Document> localVarResponse = CreateDriverDocumentWithHttpInfo(accessToken, driverId, createDocumentParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents Create a driver document for the given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>ApiResponse of Document</returns>
        public ApiResponse< Document > CreateDriverDocumentWithHttpInfo (string accessToken, long? driverId, DocumentCreate createDocumentParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriverDocument");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->CreateDriverDocument");
            // verify the required parameter 'createDocumentParams' is set
            if (createDocumentParams == null)
                throw new ApiException(400, "Missing required parameter 'createDocumentParams' when calling FleetApi->CreateDriverDocument");

            var localVarPath = "/fleet/drivers/{driver_id}/documents";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDocumentParams != null && createDocumentParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDocumentParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDocumentParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriverDocument", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Document>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Document) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Document)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents Create a driver document for the given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Task of Document</returns>
        public async System.Threading.Tasks.Task<Document> CreateDriverDocumentAsync (string accessToken, long? driverId, DocumentCreate createDocumentParams)
        {
             ApiResponse<Document> localVarResponse = await CreateDriverDocumentAsyncWithHttpInfo(accessToken, driverId, createDocumentParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents Create a driver document for the given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Task of ApiResponse (Document)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Document>> CreateDriverDocumentAsyncWithHttpInfo (string accessToken, long? driverId, DocumentCreate createDocumentParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriverDocument");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->CreateDriverDocument");
            // verify the required parameter 'createDocumentParams' is set
            if (createDocumentParams == null)
                throw new ApiException(400, "Missing required parameter 'createDocumentParams' when calling FleetApi->CreateDriverDocument");

            var localVarPath = "/fleet/drivers/{driver_id}/documents";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDocumentParams != null && createDocumentParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDocumentParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDocumentParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriverDocument", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Document>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Document) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Document)));
        }

        /// <summary>
        /// /fleet/maintenance/dvirs Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>DvirBase</returns>
        public DvirBase CreateDvir (string accessToken, InlineObject12 createDvirParam)
        {
             ApiResponse<DvirBase> localVarResponse = CreateDvirWithHttpInfo(accessToken, createDvirParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/maintenance/dvirs Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>ApiResponse of DvirBase</returns>
        public ApiResponse< DvirBase > CreateDvirWithHttpInfo (string accessToken, InlineObject12 createDvirParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDvir");
            // verify the required parameter 'createDvirParam' is set
            if (createDvirParam == null)
                throw new ApiException(400, "Missing required parameter 'createDvirParam' when calling FleetApi->CreateDvir");

            var localVarPath = "/fleet/maintenance/dvirs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDvirParam != null && createDvirParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDvirParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDvirParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDvir", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DvirBase>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DvirBase) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DvirBase)));
        }

        /// <summary>
        /// /fleet/maintenance/dvirs Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>Task of DvirBase</returns>
        public async System.Threading.Tasks.Task<DvirBase> CreateDvirAsync (string accessToken, InlineObject12 createDvirParam)
        {
             ApiResponse<DvirBase> localVarResponse = await CreateDvirAsyncWithHttpInfo(accessToken, createDvirParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/maintenance/dvirs Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>Task of ApiResponse (DvirBase)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DvirBase>> CreateDvirAsyncWithHttpInfo (string accessToken, InlineObject12 createDvirParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDvir");
            // verify the required parameter 'createDvirParam' is set
            if (createDvirParam == null)
                throw new ApiException(400, "Missing required parameter 'createDvirParam' when calling FleetApi->CreateDvir");

            var localVarPath = "/fleet/maintenance/dvirs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDvirParam != null && createDvirParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDvirParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDvirParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDvir", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DvirBase>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DvirBase) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DvirBase)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateVehicleDispatchRoute (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = CreateVehicleDispatchRouteWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > CreateVehicleDispatchRouteWithHttpInfo (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateVehicleDispatchRoute");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->CreateVehicleDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateVehicleDispatchRoute");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateVehicleDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateVehicleDispatchRouteAsync (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = await CreateVehicleDispatchRouteAsyncWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateVehicleDispatchRouteAsyncWithHttpInfo (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateVehicleDispatchRoute");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->CreateVehicleDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateVehicleDispatchRoute");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateVehicleDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Deactivate a driver with the given id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns></returns>
        public void DeactivateDriver (string accessToken, string driverIdOrExternalId)
        {
             DeactivateDriverWithHttpInfo(accessToken, driverIdOrExternalId);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Deactivate a driver with the given id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeactivateDriverWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeactivateDriver");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->DeactivateDriver");

            var localVarPath = "/fleet/drivers/{driver_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeactivateDriver", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Deactivate a driver with the given id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeactivateDriverAsync (string accessToken, string driverIdOrExternalId)
        {
             await DeactivateDriverAsyncWithHttpInfo(accessToken, driverIdOrExternalId);

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Deactivate a driver with the given id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeactivateDriverAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeactivateDriver");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->DeactivateDriver");

            var localVarPath = "/fleet/drivers/{driver_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeactivateDriver", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        public void DeleteDispatchRouteById (string accessToken, long? routeId)
        {
             DeleteDispatchRouteByIdWithHttpInfo(accessToken, routeId);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeleteDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->DeleteDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteDispatchRouteByIdAsync (string accessToken, long? routeId)
        {
             await DeleteDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId);

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeleteDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->DeleteDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /addresses/{addressId} Delete an address.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns></returns>
        public void DeleteOrganizationAddress (string accessToken, long? addressId)
        {
             DeleteOrganizationAddressWithHttpInfo(accessToken, addressId);
        }

        /// <summary>
        /// /addresses/{addressId} Delete an address.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteOrganizationAddressWithHttpInfo (string accessToken, long? addressId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeleteOrganizationAddress");
            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->DeleteOrganizationAddress");

            var localVarPath = "/addresses/{addressId}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (addressId != null) localVarPathParams.Add("addressId", this.Configuration.ApiClient.ParameterToString(addressId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteOrganizationAddress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /addresses/{addressId} Delete an address.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteOrganizationAddressAsync (string accessToken, long? addressId)
        {
             await DeleteOrganizationAddressAsyncWithHttpInfo(accessToken, addressId);

        }

        /// <summary>
        /// /addresses/{addressId} Delete an address.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteOrganizationAddressAsyncWithHttpInfo (string accessToken, long? addressId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeleteOrganizationAddress");
            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->DeleteOrganizationAddress");

            var localVarPath = "/addresses/{addressId}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (addressId != null) localVarPathParams.Add("addressId", this.Configuration.ApiClient.ParameterToString(addressId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteOrganizationAddress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        public List<DispatchRoute> FetchAllDispatchRoutes (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = FetchAllDispatchRoutesWithHttpInfo(accessToken, groupId, endTime, duration);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        public ApiResponse< List<DispatchRoute> > FetchAllDispatchRoutesWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->FetchAllDispatchRoutes");

            var localVarPath = "/fleet/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FetchAllDispatchRoutes", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        public async System.Threading.Tasks.Task<List<DispatchRoute>> FetchAllDispatchRoutesAsync (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = await FetchAllDispatchRoutesAsyncWithHttpInfo(accessToken, groupId, endTime, duration);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> FetchAllDispatchRoutesAsyncWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->FetchAllDispatchRoutes");

            var localVarPath = "/fleet/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FetchAllDispatchRoutes", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>AllRouteJobUpdates</returns>
        public AllRouteJobUpdates FetchAllRouteJobUpdates (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
             ApiResponse<AllRouteJobUpdates> localVarResponse = FetchAllRouteJobUpdatesWithHttpInfo(accessToken, groupId, sequenceId, include);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>ApiResponse of AllRouteJobUpdates</returns>
        public ApiResponse< AllRouteJobUpdates > FetchAllRouteJobUpdatesWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->FetchAllRouteJobUpdates");

            var localVarPath = "/fleet/dispatch/routes/job_updates";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (sequenceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "sequence_id", sequenceId)); // query parameter
            if (include != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "include", include)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FetchAllRouteJobUpdates", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AllRouteJobUpdates>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AllRouteJobUpdates) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AllRouteJobUpdates)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>Task of AllRouteJobUpdates</returns>
        public async System.Threading.Tasks.Task<AllRouteJobUpdates> FetchAllRouteJobUpdatesAsync (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
             ApiResponse<AllRouteJobUpdates> localVarResponse = await FetchAllRouteJobUpdatesAsyncWithHttpInfo(accessToken, groupId, sequenceId, include);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>Task of ApiResponse (AllRouteJobUpdates)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<AllRouteJobUpdates>> FetchAllRouteJobUpdatesAsyncWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->FetchAllRouteJobUpdates");

            var localVarPath = "/fleet/dispatch/routes/job_updates";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (sequenceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "sequence_id", sequenceId)); // query parameter
            if (include != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "include", include)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FetchAllRouteJobUpdates", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AllRouteJobUpdates>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AllRouteJobUpdates) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AllRouteJobUpdates)));
        }

        /// <summary>
        /// /fleet/assets/locations Fetch current locations of all assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse2001</returns>
        public InlineResponse2001 GetAllAssetCurrentLocations (string accessToken, long? groupId = null)
        {
             ApiResponse<InlineResponse2001> localVarResponse = GetAllAssetCurrentLocationsWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/assets/locations Fetch current locations of all assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse2001</returns>
        public ApiResponse< InlineResponse2001 > GetAllAssetCurrentLocationsWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllAssetCurrentLocations");

            var localVarPath = "/fleet/assets/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllAssetCurrentLocations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2001>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2001) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2001)));
        }

        /// <summary>
        /// /fleet/assets/locations Fetch current locations of all assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of InlineResponse2001</returns>
        public async System.Threading.Tasks.Task<InlineResponse2001> GetAllAssetCurrentLocationsAsync (string accessToken, long? groupId = null)
        {
             ApiResponse<InlineResponse2001> localVarResponse = await GetAllAssetCurrentLocationsAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/assets/locations Fetch current locations of all assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2001)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2001>> GetAllAssetCurrentLocationsAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllAssetCurrentLocations");

            var localVarPath = "/fleet/assets/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllAssetCurrentLocations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2001>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2001) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2001)));
        }

        /// <summary>
        /// /fleet/assets Fetch all of the assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse200</returns>
        public InlineResponse200 GetAllAssets (string accessToken, long? groupId = null)
        {
             ApiResponse<InlineResponse200> localVarResponse = GetAllAssetsWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/assets Fetch all of the assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse200</returns>
        public ApiResponse< InlineResponse200 > GetAllAssetsWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllAssets");

            var localVarPath = "/fleet/assets";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllAssets", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse200>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse200) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse200)));
        }

        /// <summary>
        /// /fleet/assets Fetch all of the assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of InlineResponse200</returns>
        public async System.Threading.Tasks.Task<InlineResponse200> GetAllAssetsAsync (string accessToken, long? groupId = null)
        {
             ApiResponse<InlineResponse200> localVarResponse = await GetAllAssetsAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/assets Fetch all of the assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse200)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse200>> GetAllAssetsAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllAssets");

            var localVarPath = "/fleet/assets";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllAssets", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse200>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse200) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse200)));
        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>List&lt;Driver&gt;</returns>
        public List<Driver> GetAllDeactivatedDrivers (string accessToken, long? groupId = null)
        {
             ApiResponse<List<Driver>> localVarResponse = GetAllDeactivatedDriversWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of List&lt;Driver&gt;</returns>
        public ApiResponse< List<Driver> > GetAllDeactivatedDriversWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllDeactivatedDrivers");

            var localVarPath = "/fleet/drivers/inactive";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllDeactivatedDrivers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Driver>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Driver>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Driver>)));
        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of List&lt;Driver&gt;</returns>
        public async System.Threading.Tasks.Task<List<Driver>> GetAllDeactivatedDriversAsync (string accessToken, long? groupId = null)
        {
             ApiResponse<List<Driver>> localVarResponse = await GetAllDeactivatedDriversAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Driver&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Driver>>> GetAllDeactivatedDriversAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllDeactivatedDrivers");

            var localVarPath = "/fleet/drivers/inactive";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllDeactivatedDrivers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Driver>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Driver>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Driver>)));
        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations Fetch the historical locations for the asset.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>List&lt;Object&gt;</returns>
        public List<Object> GetAssetLocation (string accessToken, long? assetId, long? startMs, long? endMs)
        {
             ApiResponse<List<Object>> localVarResponse = GetAssetLocationWithHttpInfo(accessToken, assetId, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations Fetch the historical locations for the asset.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of List&lt;Object&gt;</returns>
        public ApiResponse< List<Object> > GetAssetLocationWithHttpInfo (string accessToken, long? assetId, long? startMs, long? endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAssetLocation");
            // verify the required parameter 'assetId' is set
            if (assetId == null)
                throw new ApiException(400, "Missing required parameter 'assetId' when calling FleetApi->GetAssetLocation");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetAssetLocation");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetAssetLocation");

            var localVarPath = "/fleet/assets/{asset_id}/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (assetId != null) localVarPathParams.Add("asset_id", this.Configuration.ApiClient.ParameterToString(assetId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAssetLocation", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Object>)));
        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations Fetch the historical locations for the asset.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of List&lt;Object&gt;</returns>
        public async System.Threading.Tasks.Task<List<Object>> GetAssetLocationAsync (string accessToken, long? assetId, long? startMs, long? endMs)
        {
             ApiResponse<List<Object>> localVarResponse = await GetAssetLocationAsyncWithHttpInfo(accessToken, assetId, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations Fetch the historical locations for the asset.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (List&lt;Object&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Object>>> GetAssetLocationAsyncWithHttpInfo (string accessToken, long? assetId, long? startMs, long? endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAssetLocation");
            // verify the required parameter 'assetId' is set
            if (assetId == null)
                throw new ApiException(400, "Missing required parameter 'assetId' when calling FleetApi->GetAssetLocation");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetAssetLocation");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetAssetLocation");

            var localVarPath = "/fleet/assets/{asset_id}/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (assetId != null) localVarPathParams.Add("asset_id", this.Configuration.ApiClient.ParameterToString(assetId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAssetLocation", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Object>)));
        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer Fetch the reefer-specific stats of an asset.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>AssetReeferResponse</returns>
        public AssetReeferResponse GetAssetReefer (string accessToken, long? assetId, long? startMs, long? endMs)
        {
             ApiResponse<AssetReeferResponse> localVarResponse = GetAssetReeferWithHttpInfo(accessToken, assetId, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer Fetch the reefer-specific stats of an asset.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of AssetReeferResponse</returns>
        public ApiResponse< AssetReeferResponse > GetAssetReeferWithHttpInfo (string accessToken, long? assetId, long? startMs, long? endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAssetReefer");
            // verify the required parameter 'assetId' is set
            if (assetId == null)
                throw new ApiException(400, "Missing required parameter 'assetId' when calling FleetApi->GetAssetReefer");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetAssetReefer");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetAssetReefer");

            var localVarPath = "/fleet/assets/{asset_id}/reefer";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (assetId != null) localVarPathParams.Add("asset_id", this.Configuration.ApiClient.ParameterToString(assetId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAssetReefer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AssetReeferResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AssetReeferResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AssetReeferResponse)));
        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer Fetch the reefer-specific stats of an asset.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of AssetReeferResponse</returns>
        public async System.Threading.Tasks.Task<AssetReeferResponse> GetAssetReeferAsync (string accessToken, long? assetId, long? startMs, long? endMs)
        {
             ApiResponse<AssetReeferResponse> localVarResponse = await GetAssetReeferAsyncWithHttpInfo(accessToken, assetId, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer Fetch the reefer-specific stats of an asset.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (AssetReeferResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<AssetReeferResponse>> GetAssetReeferAsyncWithHttpInfo (string accessToken, long? assetId, long? startMs, long? endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAssetReefer");
            // verify the required parameter 'assetId' is set
            if (assetId == null)
                throw new ApiException(400, "Missing required parameter 'assetId' when calling FleetApi->GetAssetReefer");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetAssetReefer");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetAssetReefer");

            var localVarPath = "/fleet/assets/{asset_id}/reefer";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (assetId != null) localVarPathParams.Add("asset_id", this.Configuration.ApiClient.ParameterToString(assetId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAssetReefer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AssetReeferResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AssetReeferResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AssetReeferResponse)));
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        public Driver GetDeactivatedDriverById (string accessToken, string driverIdOrExternalId)
        {
             ApiResponse<Driver> localVarResponse = GetDeactivatedDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        public ApiResponse< Driver > GetDeactivatedDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDeactivatedDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->GetDeactivatedDriverById");

            var localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDeactivatedDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of Driver</returns>
        public async System.Threading.Tasks.Task<Driver> GetDeactivatedDriverByIdAsync (string accessToken, string driverIdOrExternalId)
        {
             ApiResponse<Driver> localVarResponse = await GetDeactivatedDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Driver>> GetDeactivatedDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDeactivatedDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->GetDeactivatedDriverById");

            var localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDeactivatedDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute GetDispatchRouteById (string accessToken, long? routeId)
        {
             ApiResponse<DispatchRoute> localVarResponse = GetDispatchRouteByIdWithHttpInfo(accessToken, routeId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > GetDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->GetDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> GetDispatchRouteByIdAsync (string accessToken, long? routeId)
        {
             ApiResponse<DispatchRoute> localVarResponse = await GetDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> GetDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->GetDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>DispatchRouteHistory</returns>
        public DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long? routeId, long? startTime = null, long? endTime = null)
        {
             ApiResponse<DispatchRouteHistory> localVarResponse = GetDispatchRouteHistoryWithHttpInfo(accessToken, routeId, startTime, endTime);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of DispatchRouteHistory</returns>
        public ApiResponse< DispatchRouteHistory > GetDispatchRouteHistoryWithHttpInfo (string accessToken, long? routeId, long? startTime = null, long? endTime = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRouteHistory");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->GetDispatchRouteHistory");

            var localVarPath = "/fleet/dispatch/routes/{route_id}/history";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "start_time", startTime)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRouteHistory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRouteHistory>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRouteHistory) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRouteHistory)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>Task of DispatchRouteHistory</returns>
        public async System.Threading.Tasks.Task<DispatchRouteHistory> GetDispatchRouteHistoryAsync (string accessToken, long? routeId, long? startTime = null, long? endTime = null)
        {
             ApiResponse<DispatchRouteHistory> localVarResponse = await GetDispatchRouteHistoryAsyncWithHttpInfo(accessToken, routeId, startTime, endTime);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (DispatchRouteHistory)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRouteHistory>> GetDispatchRouteHistoryAsyncWithHttpInfo (string accessToken, long? routeId, long? startTime = null, long? endTime = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRouteHistory");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->GetDispatchRouteHistory");

            var localVarPath = "/fleet/dispatch/routes/{route_id}/history";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "start_time", startTime)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRouteHistory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRouteHistory>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRouteHistory) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRouteHistory)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        public List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long? driverId, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = GetDispatchRoutesByDriverIdWithHttpInfo(accessToken, driverId, endTime, duration);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        public ApiResponse< List<DispatchRoute> > GetDispatchRoutesByDriverIdWithHttpInfo (string accessToken, long? driverId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRoutesByDriverId");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetDispatchRoutesByDriverId");

            var localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRoutesByDriverId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        public async System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByDriverIdAsync (string accessToken, long? driverId, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = await GetDispatchRoutesByDriverIdAsyncWithHttpInfo(accessToken, driverId, endTime, duration);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByDriverIdAsyncWithHttpInfo (string accessToken, long? driverId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRoutesByDriverId");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetDispatchRoutesByDriverId");

            var localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRoutesByDriverId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        public List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long? vehicleId, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = GetDispatchRoutesByVehicleIdWithHttpInfo(accessToken, vehicleId, endTime, duration);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        public ApiResponse< List<DispatchRoute> > GetDispatchRoutesByVehicleIdWithHttpInfo (string accessToken, long? vehicleId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRoutesByVehicleId");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetDispatchRoutesByVehicleId");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRoutesByVehicleId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        public async System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByVehicleIdAsync (string accessToken, long? vehicleId, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = await GetDispatchRoutesByVehicleIdAsyncWithHttpInfo(accessToken, vehicleId, endTime, duration);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByVehicleIdAsyncWithHttpInfo (string accessToken, long? vehicleId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRoutesByVehicleId");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetDispatchRoutesByVehicleId");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRoutesByVehicleId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        public Driver GetDriverById (string accessToken, string driverIdOrExternalId)
        {
             ApiResponse<Driver> localVarResponse = GetDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        public ApiResponse< Driver > GetDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->GetDriverById");

            var localVarPath = "/fleet/drivers/{driver_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of Driver</returns>
        public async System.Threading.Tasks.Task<Driver> GetDriverByIdAsync (string accessToken, string driverIdOrExternalId)
        {
             ApiResponse<Driver> localVarResponse = await GetDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Driver>> GetDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->GetDriverById");

            var localVarPath = "/fleet/drivers/{driver_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/document_types Fetch all of the document types.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;DocumentType&gt;</returns>
        public List<DocumentType> GetDriverDocumentTypesByOrgId ()
        {
             ApiResponse<List<DocumentType>> localVarResponse = GetDriverDocumentTypesByOrgIdWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/document_types Fetch all of the document types.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;DocumentType&gt;</returns>
        public ApiResponse< List<DocumentType> > GetDriverDocumentTypesByOrgIdWithHttpInfo ()
        {

            var localVarPath = "/fleet/drivers/document_types";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);



            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverDocumentTypesByOrgId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DocumentType>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DocumentType>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DocumentType>)));
        }

        /// <summary>
        /// /fleet/drivers/document_types Fetch all of the document types.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;DocumentType&gt;</returns>
        public async System.Threading.Tasks.Task<List<DocumentType>> GetDriverDocumentTypesByOrgIdAsync ()
        {
             ApiResponse<List<DocumentType>> localVarResponse = await GetDriverDocumentTypesByOrgIdAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/document_types Fetch all of the document types.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;DocumentType&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<DocumentType>>> GetDriverDocumentTypesByOrgIdAsyncWithHttpInfo ()
        {

            var localVarPath = "/fleet/drivers/document_types";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);



            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverDocumentTypesByOrgId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DocumentType>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DocumentType>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DocumentType>)));
        }

        /// <summary>
        /// /fleet/drivers/documents Fetch all of the documents.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;Document&gt;</returns>
        public List<Document> GetDriverDocumentsByOrgId (string accessToken, long? endMs = null, long? durationMs = null)
        {
             ApiResponse<List<Document>> localVarResponse = GetDriverDocumentsByOrgIdWithHttpInfo(accessToken, endMs, durationMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/documents Fetch all of the documents.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;Document&gt;</returns>
        public ApiResponse< List<Document> > GetDriverDocumentsByOrgIdWithHttpInfo (string accessToken, long? endMs = null, long? durationMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverDocumentsByOrgId");

            var localVarPath = "/fleet/drivers/documents";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter
            if (durationMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "durationMs", durationMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverDocumentsByOrgId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Document>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Document>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Document>)));
        }

        /// <summary>
        /// /fleet/drivers/documents Fetch all of the documents.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;Document&gt;</returns>
        public async System.Threading.Tasks.Task<List<Document>> GetDriverDocumentsByOrgIdAsync (string accessToken, long? endMs = null, long? durationMs = null)
        {
             ApiResponse<List<Document>> localVarResponse = await GetDriverDocumentsByOrgIdAsyncWithHttpInfo(accessToken, endMs, durationMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/documents Fetch all of the documents.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Document&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Document>>> GetDriverDocumentsByOrgIdAsyncWithHttpInfo (string accessToken, long? endMs = null, long? durationMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverDocumentsByOrgId");

            var localVarPath = "/fleet/drivers/documents";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter
            if (durationMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "durationMs", durationMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverDocumentsByOrgId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Document>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Document>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Document>)));
        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>DriverSafetyScoreResponse</returns>
        public DriverSafetyScoreResponse GetDriverSafetyScore (long? driverId, string accessToken, long? startMs, long? endMs)
        {
             ApiResponse<DriverSafetyScoreResponse> localVarResponse = GetDriverSafetyScoreWithHttpInfo(driverId, accessToken, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of DriverSafetyScoreResponse</returns>
        public ApiResponse< DriverSafetyScoreResponse > GetDriverSafetyScoreWithHttpInfo (long? driverId, string accessToken, long? startMs, long? endMs)
        {
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetDriverSafetyScore");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverSafetyScore");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetDriverSafetyScore");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetDriverSafetyScore");

            var localVarPath = "/fleet/drivers/{driverId}/safety/score";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driverId", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverSafetyScore", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriverSafetyScoreResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriverSafetyScoreResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriverSafetyScoreResponse)));
        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of DriverSafetyScoreResponse</returns>
        public async System.Threading.Tasks.Task<DriverSafetyScoreResponse> GetDriverSafetyScoreAsync (long? driverId, string accessToken, long? startMs, long? endMs)
        {
             ApiResponse<DriverSafetyScoreResponse> localVarResponse = await GetDriverSafetyScoreAsyncWithHttpInfo(driverId, accessToken, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (DriverSafetyScoreResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DriverSafetyScoreResponse>> GetDriverSafetyScoreAsyncWithHttpInfo (long? driverId, string accessToken, long? startMs, long? endMs)
        {
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetDriverSafetyScore");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverSafetyScore");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetDriverSafetyScore");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetDriverSafetyScore");

            var localVarPath = "/fleet/drivers/{driverId}/safety/score";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driverId", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverSafetyScore", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriverSafetyScoreResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriverSafetyScoreResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriverSafetyScoreResponse)));
        }

        /// <summary>
        /// /fleet/maintenance/dvirs Get DVIRs for the org within provided time constraints
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>DvirListResponse</returns>
        public DvirListResponse GetDvirs (string accessToken, int? endMs, int? durationMs, int? groupId = null)
        {
             ApiResponse<DvirListResponse> localVarResponse = GetDvirsWithHttpInfo(accessToken, endMs, durationMs, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/maintenance/dvirs Get DVIRs for the org within provided time constraints
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>ApiResponse of DvirListResponse</returns>
        public ApiResponse< DvirListResponse > GetDvirsWithHttpInfo (string accessToken, int? endMs, int? durationMs, int? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDvirs");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetDvirs");
            // verify the required parameter 'durationMs' is set
            if (durationMs == null)
                throw new ApiException(400, "Missing required parameter 'durationMs' when calling FleetApi->GetDvirs");

            var localVarPath = "/fleet/maintenance/dvirs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_ms", endMs)); // query parameter
            if (durationMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration_ms", durationMs)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDvirs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DvirListResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DvirListResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DvirListResponse)));
        }

        /// <summary>
        /// /fleet/maintenance/dvirs Get DVIRs for the org within provided time constraints
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>Task of DvirListResponse</returns>
        public async System.Threading.Tasks.Task<DvirListResponse> GetDvirsAsync (string accessToken, int? endMs, int? durationMs, int? groupId = null)
        {
             ApiResponse<DvirListResponse> localVarResponse = await GetDvirsAsyncWithHttpInfo(accessToken, endMs, durationMs, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/maintenance/dvirs Get DVIRs for the org within provided time constraints
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>Task of ApiResponse (DvirListResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DvirListResponse>> GetDvirsAsyncWithHttpInfo (string accessToken, int? endMs, int? durationMs, int? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDvirs");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetDvirs");
            // verify the required parameter 'durationMs' is set
            if (durationMs == null)
                throw new ApiException(400, "Missing required parameter 'durationMs' when calling FleetApi->GetDvirs");

            var localVarPath = "/fleet/maintenance/dvirs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_ms", endMs)); // query parameter
            if (durationMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration_ms", durationMs)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDvirs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DvirListResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DvirListResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DvirListResponse)));
        }

        /// <summary>
        /// /fleet/drivers Get all the drivers for the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>DriversResponse</returns>
        public DriversResponse GetFleetDrivers (string accessToken, InlineObject3 groupDriversParam)
        {
             ApiResponse<DriversResponse> localVarResponse = GetFleetDriversWithHttpInfo(accessToken, groupDriversParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers Get all the drivers for the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>ApiResponse of DriversResponse</returns>
        public ApiResponse< DriversResponse > GetFleetDriversWithHttpInfo (string accessToken, InlineObject3 groupDriversParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDrivers");
            // verify the required parameter 'groupDriversParam' is set
            if (groupDriversParam == null)
                throw new ApiException(400, "Missing required parameter 'groupDriversParam' when calling FleetApi->GetFleetDrivers");

            var localVarPath = "/fleet/drivers";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupDriversParam != null && groupDriversParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupDriversParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupDriversParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetDrivers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriversResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriversResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriversResponse)));
        }

        /// <summary>
        /// /fleet/drivers Get all the drivers for the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>Task of DriversResponse</returns>
        public async System.Threading.Tasks.Task<DriversResponse> GetFleetDriversAsync (string accessToken, InlineObject3 groupDriversParam)
        {
             ApiResponse<DriversResponse> localVarResponse = await GetFleetDriversAsyncWithHttpInfo(accessToken, groupDriversParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers Get all the drivers for the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>Task of ApiResponse (DriversResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DriversResponse>> GetFleetDriversAsyncWithHttpInfo (string accessToken, InlineObject3 groupDriversParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDrivers");
            // verify the required parameter 'groupDriversParam' is set
            if (groupDriversParam == null)
                throw new ApiException(400, "Missing required parameter 'groupDriversParam' when calling FleetApi->GetFleetDrivers");

            var localVarPath = "/fleet/drivers";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupDriversParam != null && groupDriversParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupDriversParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupDriversParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetDrivers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriversResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriversResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriversResponse)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs Get summarized daily HOS charts for a specified driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>DriverDailyLogResponse</returns>
        public DriverDailyLogResponse GetFleetDriversHosDailyLogs (string accessToken, long? driverId, InlineObject6 hosLogsParam)
        {
             ApiResponse<DriverDailyLogResponse> localVarResponse = GetFleetDriversHosDailyLogsWithHttpInfo(accessToken, driverId, hosLogsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs Get summarized daily HOS charts for a specified driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>ApiResponse of DriverDailyLogResponse</returns>
        public ApiResponse< DriverDailyLogResponse > GetFleetDriversHosDailyLogsWithHttpInfo (string accessToken, long? driverId, InlineObject6 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDriversHosDailyLogs");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetFleetDriversHosDailyLogs");
            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetDriversHosDailyLogs");

            var localVarPath = "/fleet/drivers/{driver_id}/hos_daily_logs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (hosLogsParam != null && hosLogsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(hosLogsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = hosLogsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetDriversHosDailyLogs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriverDailyLogResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriverDailyLogResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriverDailyLogResponse)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs Get summarized daily HOS charts for a specified driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of DriverDailyLogResponse</returns>
        public async System.Threading.Tasks.Task<DriverDailyLogResponse> GetFleetDriversHosDailyLogsAsync (string accessToken, long? driverId, InlineObject6 hosLogsParam)
        {
             ApiResponse<DriverDailyLogResponse> localVarResponse = await GetFleetDriversHosDailyLogsAsyncWithHttpInfo(accessToken, driverId, hosLogsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs Get summarized daily HOS charts for a specified driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of ApiResponse (DriverDailyLogResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DriverDailyLogResponse>> GetFleetDriversHosDailyLogsAsyncWithHttpInfo (string accessToken, long? driverId, InlineObject6 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDriversHosDailyLogs");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetFleetDriversHosDailyLogs");
            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetDriversHosDailyLogs");

            var localVarPath = "/fleet/drivers/{driver_id}/hos_daily_logs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (hosLogsParam != null && hosLogsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(hosLogsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = hosLogsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetDriversHosDailyLogs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriverDailyLogResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriverDailyLogResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriverDailyLogResponse)));
        }

        /// <summary>
        /// /fleet/drivers/summary Get the distance and time each driver in an organization has driven in a given time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>DriversSummaryResponse</returns>
        public DriversSummaryResponse GetFleetDriversSummary (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null)
        {
             ApiResponse<DriversSummaryResponse> localVarResponse = GetFleetDriversSummaryWithHttpInfo(accessToken, driversSummaryParam, snapToDayBounds);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/summary Get the distance and time each driver in an organization has driven in a given time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>ApiResponse of DriversSummaryResponse</returns>
        public ApiResponse< DriversSummaryResponse > GetFleetDriversSummaryWithHttpInfo (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDriversSummary");
            // verify the required parameter 'driversSummaryParam' is set
            if (driversSummaryParam == null)
                throw new ApiException(400, "Missing required parameter 'driversSummaryParam' when calling FleetApi->GetFleetDriversSummary");

            var localVarPath = "/fleet/drivers/summary";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (snapToDayBounds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "snap_to_day_bounds", snapToDayBounds)); // query parameter
            if (driversSummaryParam != null && driversSummaryParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(driversSummaryParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = driversSummaryParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetDriversSummary", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriversSummaryResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriversSummaryResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriversSummaryResponse)));
        }

        /// <summary>
        /// /fleet/drivers/summary Get the distance and time each driver in an organization has driven in a given time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>Task of DriversSummaryResponse</returns>
        public async System.Threading.Tasks.Task<DriversSummaryResponse> GetFleetDriversSummaryAsync (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null)
        {
             ApiResponse<DriversSummaryResponse> localVarResponse = await GetFleetDriversSummaryAsyncWithHttpInfo(accessToken, driversSummaryParam, snapToDayBounds);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/summary Get the distance and time each driver in an organization has driven in a given time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>Task of ApiResponse (DriversSummaryResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DriversSummaryResponse>> GetFleetDriversSummaryAsyncWithHttpInfo (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDriversSummary");
            // verify the required parameter 'driversSummaryParam' is set
            if (driversSummaryParam == null)
                throw new ApiException(400, "Missing required parameter 'driversSummaryParam' when calling FleetApi->GetFleetDriversSummary");

            var localVarPath = "/fleet/drivers/summary";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (snapToDayBounds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "snap_to_day_bounds", snapToDayBounds)); // query parameter
            if (driversSummaryParam != null && driversSummaryParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(driversSummaryParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = driversSummaryParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetDriversSummary", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriversSummaryResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriversSummaryResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriversSummaryResponse)));
        }

        /// <summary>
        /// /fleet/hos_authentication_logs Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>HosAuthenticationLogsResponse</returns>
        public HosAuthenticationLogsResponse GetFleetHosAuthenticationLogs (string accessToken, InlineObject7 hosAuthenticationLogsParam)
        {
             ApiResponse<HosAuthenticationLogsResponse> localVarResponse = GetFleetHosAuthenticationLogsWithHttpInfo(accessToken, hosAuthenticationLogsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/hos_authentication_logs Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>ApiResponse of HosAuthenticationLogsResponse</returns>
        public ApiResponse< HosAuthenticationLogsResponse > GetFleetHosAuthenticationLogsWithHttpInfo (string accessToken, InlineObject7 hosAuthenticationLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosAuthenticationLogs");
            // verify the required parameter 'hosAuthenticationLogsParam' is set
            if (hosAuthenticationLogsParam == null)
                throw new ApiException(400, "Missing required parameter 'hosAuthenticationLogsParam' when calling FleetApi->GetFleetHosAuthenticationLogs");

            var localVarPath = "/fleet/hos_authentication_logs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (hosAuthenticationLogsParam != null && hosAuthenticationLogsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(hosAuthenticationLogsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = hosAuthenticationLogsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetHosAuthenticationLogs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<HosAuthenticationLogsResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (HosAuthenticationLogsResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(HosAuthenticationLogsResponse)));
        }

        /// <summary>
        /// /fleet/hos_authentication_logs Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>Task of HosAuthenticationLogsResponse</returns>
        public async System.Threading.Tasks.Task<HosAuthenticationLogsResponse> GetFleetHosAuthenticationLogsAsync (string accessToken, InlineObject7 hosAuthenticationLogsParam)
        {
             ApiResponse<HosAuthenticationLogsResponse> localVarResponse = await GetFleetHosAuthenticationLogsAsyncWithHttpInfo(accessToken, hosAuthenticationLogsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/hos_authentication_logs Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>Task of ApiResponse (HosAuthenticationLogsResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<HosAuthenticationLogsResponse>> GetFleetHosAuthenticationLogsAsyncWithHttpInfo (string accessToken, InlineObject7 hosAuthenticationLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosAuthenticationLogs");
            // verify the required parameter 'hosAuthenticationLogsParam' is set
            if (hosAuthenticationLogsParam == null)
                throw new ApiException(400, "Missing required parameter 'hosAuthenticationLogsParam' when calling FleetApi->GetFleetHosAuthenticationLogs");

            var localVarPath = "/fleet/hos_authentication_logs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (hosAuthenticationLogsParam != null && hosAuthenticationLogsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(hosAuthenticationLogsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = hosAuthenticationLogsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetHosAuthenticationLogs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<HosAuthenticationLogsResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (HosAuthenticationLogsResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(HosAuthenticationLogsResponse)));
        }

        /// <summary>
        /// /fleet/hos_logs Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>HosLogsResponse</returns>
        public HosLogsResponse GetFleetHosLogs (string accessToken, InlineObject8 hosLogsParam)
        {
             ApiResponse<HosLogsResponse> localVarResponse = GetFleetHosLogsWithHttpInfo(accessToken, hosLogsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/hos_logs Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>ApiResponse of HosLogsResponse</returns>
        public ApiResponse< HosLogsResponse > GetFleetHosLogsWithHttpInfo (string accessToken, InlineObject8 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosLogs");
            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetHosLogs");

            var localVarPath = "/fleet/hos_logs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (hosLogsParam != null && hosLogsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(hosLogsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = hosLogsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetHosLogs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<HosLogsResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (HosLogsResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(HosLogsResponse)));
        }

        /// <summary>
        /// /fleet/hos_logs Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of HosLogsResponse</returns>
        public async System.Threading.Tasks.Task<HosLogsResponse> GetFleetHosLogsAsync (string accessToken, InlineObject8 hosLogsParam)
        {
             ApiResponse<HosLogsResponse> localVarResponse = await GetFleetHosLogsAsyncWithHttpInfo(accessToken, hosLogsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/hos_logs Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of ApiResponse (HosLogsResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<HosLogsResponse>> GetFleetHosLogsAsyncWithHttpInfo (string accessToken, InlineObject8 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosLogs");
            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetHosLogs");

            var localVarPath = "/fleet/hos_logs";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (hosLogsParam != null && hosLogsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(hosLogsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = hosLogsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetHosLogs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<HosLogsResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (HosLogsResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(HosLogsResponse)));
        }

        /// <summary>
        /// /fleet/hos_logs_summary Get the current HOS status for all drivers in the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>HosLogsSummaryResponse</returns>
        public HosLogsSummaryResponse GetFleetHosLogsSummary (string accessToken, InlineObject9 hosLogsParam)
        {
             ApiResponse<HosLogsSummaryResponse> localVarResponse = GetFleetHosLogsSummaryWithHttpInfo(accessToken, hosLogsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/hos_logs_summary Get the current HOS status for all drivers in the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>ApiResponse of HosLogsSummaryResponse</returns>
        public ApiResponse< HosLogsSummaryResponse > GetFleetHosLogsSummaryWithHttpInfo (string accessToken, InlineObject9 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosLogsSummary");
            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetHosLogsSummary");

            var localVarPath = "/fleet/hos_logs_summary";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (hosLogsParam != null && hosLogsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(hosLogsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = hosLogsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetHosLogsSummary", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<HosLogsSummaryResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (HosLogsSummaryResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(HosLogsSummaryResponse)));
        }

        /// <summary>
        /// /fleet/hos_logs_summary Get the current HOS status for all drivers in the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of HosLogsSummaryResponse</returns>
        public async System.Threading.Tasks.Task<HosLogsSummaryResponse> GetFleetHosLogsSummaryAsync (string accessToken, InlineObject9 hosLogsParam)
        {
             ApiResponse<HosLogsSummaryResponse> localVarResponse = await GetFleetHosLogsSummaryAsyncWithHttpInfo(accessToken, hosLogsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/hos_logs_summary Get the current HOS status for all drivers in the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of ApiResponse (HosLogsSummaryResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<HosLogsSummaryResponse>> GetFleetHosLogsSummaryAsyncWithHttpInfo (string accessToken, InlineObject9 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosLogsSummary");
            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetHosLogsSummary");

            var localVarPath = "/fleet/hos_logs_summary";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (hosLogsParam != null && hosLogsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(hosLogsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = hosLogsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetHosLogsSummary", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<HosLogsSummaryResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (HosLogsSummaryResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(HosLogsSummaryResponse)));
        }

        /// <summary>
        /// /fleet/locations Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2003</returns>
        public InlineResponse2003 GetFleetLocations (string accessToken, InlineObject11 groupParam)
        {
             ApiResponse<InlineResponse2003> localVarResponse = GetFleetLocationsWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/locations Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2003</returns>
        public ApiResponse< InlineResponse2003 > GetFleetLocationsWithHttpInfo (string accessToken, InlineObject11 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetLocations");
            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->GetFleetLocations");

            var localVarPath = "/fleet/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupParam != null && groupParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetLocations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2003>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2003) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2003)));
        }

        /// <summary>
        /// /fleet/locations Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of InlineResponse2003</returns>
        public async System.Threading.Tasks.Task<InlineResponse2003> GetFleetLocationsAsync (string accessToken, InlineObject11 groupParam)
        {
             ApiResponse<InlineResponse2003> localVarResponse = await GetFleetLocationsAsyncWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/locations Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2003)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2003>> GetFleetLocationsAsyncWithHttpInfo (string accessToken, InlineObject11 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetLocations");
            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->GetFleetLocations");

            var localVarPath = "/fleet/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupParam != null && groupParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetLocations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2003>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2003) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2003)));
        }

        /// <summary>
        /// /fleet/maintenance/list Get list of the vehicles with any engine faults or check light data.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2004</returns>
        public InlineResponse2004 GetFleetMaintenanceList (string accessToken, InlineObject13 groupParam)
        {
             ApiResponse<InlineResponse2004> localVarResponse = GetFleetMaintenanceListWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/maintenance/list Get list of the vehicles with any engine faults or check light data.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2004</returns>
        public ApiResponse< InlineResponse2004 > GetFleetMaintenanceListWithHttpInfo (string accessToken, InlineObject13 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetMaintenanceList");
            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->GetFleetMaintenanceList");

            var localVarPath = "/fleet/maintenance/list";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupParam != null && groupParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetMaintenanceList", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2004>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2004) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2004)));
        }

        /// <summary>
        /// /fleet/maintenance/list Get list of the vehicles with any engine faults or check light data.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of InlineResponse2004</returns>
        public async System.Threading.Tasks.Task<InlineResponse2004> GetFleetMaintenanceListAsync (string accessToken, InlineObject13 groupParam)
        {
             ApiResponse<InlineResponse2004> localVarResponse = await GetFleetMaintenanceListAsyncWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/maintenance/list Get list of the vehicles with any engine faults or check light data.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2004)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2004>> GetFleetMaintenanceListAsyncWithHttpInfo (string accessToken, InlineObject13 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetMaintenanceList");
            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->GetFleetMaintenanceList");

            var localVarPath = "/fleet/maintenance/list";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupParam != null && groupParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetMaintenanceList", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2004>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2004) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2004)));
        }

        /// <summary>
        /// /fleet/trips Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>TripResponse</returns>
        public TripResponse GetFleetTrips (string accessToken, InlineObject15 tripsParam)
        {
             ApiResponse<TripResponse> localVarResponse = GetFleetTripsWithHttpInfo(accessToken, tripsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/trips Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>ApiResponse of TripResponse</returns>
        public ApiResponse< TripResponse > GetFleetTripsWithHttpInfo (string accessToken, InlineObject15 tripsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetTrips");
            // verify the required parameter 'tripsParam' is set
            if (tripsParam == null)
                throw new ApiException(400, "Missing required parameter 'tripsParam' when calling FleetApi->GetFleetTrips");

            var localVarPath = "/fleet/trips";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (tripsParam != null && tripsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(tripsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = tripsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetTrips", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<TripResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (TripResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(TripResponse)));
        }

        /// <summary>
        /// /fleet/trips Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>Task of TripResponse</returns>
        public async System.Threading.Tasks.Task<TripResponse> GetFleetTripsAsync (string accessToken, InlineObject15 tripsParam)
        {
             ApiResponse<TripResponse> localVarResponse = await GetFleetTripsAsyncWithHttpInfo(accessToken, tripsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/trips Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>Task of ApiResponse (TripResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<TripResponse>> GetFleetTripsAsyncWithHttpInfo (string accessToken, InlineObject15 tripsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetTrips");
            // verify the required parameter 'tripsParam' is set
            if (tripsParam == null)
                throw new ApiException(400, "Missing required parameter 'tripsParam' when calling FleetApi->GetFleetTrips");

            var localVarPath = "/fleet/trips";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (tripsParam != null && tripsParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(tripsParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = tripsParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetTrips", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<TripResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (TripResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(TripResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Gets a specific vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>FleetVehicleResponse</returns>
        public FleetVehicleResponse GetFleetVehicle (string accessToken, string vehicleIdOrExternalId)
        {
             ApiResponse<FleetVehicleResponse> localVarResponse = GetFleetVehicleWithHttpInfo(accessToken, vehicleIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Gets a specific vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of FleetVehicleResponse</returns>
        public ApiResponse< FleetVehicleResponse > GetFleetVehicleWithHttpInfo (string accessToken, string vehicleIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetVehicle");
            // verify the required parameter 'vehicleIdOrExternalId' is set
            if (vehicleIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->GetFleetVehicle");

            var localVarPath = "/fleet/vehicles/{vehicle_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleIdOrExternalId != null) localVarPathParams.Add("vehicle_id_or_external_id", this.Configuration.ApiClient.ParameterToString(vehicleIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetVehicle", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<FleetVehicleResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (FleetVehicleResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(FleetVehicleResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Gets a specific vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of FleetVehicleResponse</returns>
        public async System.Threading.Tasks.Task<FleetVehicleResponse> GetFleetVehicleAsync (string accessToken, string vehicleIdOrExternalId)
        {
             ApiResponse<FleetVehicleResponse> localVarResponse = await GetFleetVehicleAsyncWithHttpInfo(accessToken, vehicleIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Gets a specific vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (FleetVehicleResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<FleetVehicleResponse>> GetFleetVehicleAsyncWithHttpInfo (string accessToken, string vehicleIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetVehicle");
            // verify the required parameter 'vehicleIdOrExternalId' is set
            if (vehicleIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->GetFleetVehicle");

            var localVarPath = "/fleet/vehicles/{vehicle_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleIdOrExternalId != null) localVarPathParams.Add("vehicle_id_or_external_id", this.Configuration.ApiClient.ParameterToString(vehicleIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetFleetVehicle", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<FleetVehicleResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (FleetVehicleResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(FleetVehicleResponse)));
        }

        /// <summary>
        /// /addresses/{addressId} Fetch an address by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Address</returns>
        public Address GetOrganizationAddress (string accessToken, long? addressId)
        {
             ApiResponse<Address> localVarResponse = GetOrganizationAddressWithHttpInfo(accessToken, addressId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /addresses/{addressId} Fetch an address by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>ApiResponse of Address</returns>
        public ApiResponse< Address > GetOrganizationAddressWithHttpInfo (string accessToken, long? addressId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationAddress");
            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->GetOrganizationAddress");

            var localVarPath = "/addresses/{addressId}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (addressId != null) localVarPathParams.Add("addressId", this.Configuration.ApiClient.ParameterToString(addressId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetOrganizationAddress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Address>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Address) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Address)));
        }

        /// <summary>
        /// /addresses/{addressId} Fetch an address by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of Address</returns>
        public async System.Threading.Tasks.Task<Address> GetOrganizationAddressAsync (string accessToken, long? addressId)
        {
             ApiResponse<Address> localVarResponse = await GetOrganizationAddressAsyncWithHttpInfo(accessToken, addressId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /addresses/{addressId} Fetch an address by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of ApiResponse (Address)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Address>> GetOrganizationAddressAsyncWithHttpInfo (string accessToken, long? addressId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationAddress");
            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->GetOrganizationAddress");

            var localVarPath = "/addresses/{addressId}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (addressId != null) localVarPathParams.Add("addressId", this.Configuration.ApiClient.ParameterToString(addressId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetOrganizationAddress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Address>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Address) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Address)));
        }

        /// <summary>
        /// /addresses Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;Address&gt;</returns>
        public List<Address> GetOrganizationAddresses (string accessToken)
        {
             ApiResponse<List<Address>> localVarResponse = GetOrganizationAddressesWithHttpInfo(accessToken);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /addresses Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>ApiResponse of List&lt;Address&gt;</returns>
        public ApiResponse< List<Address> > GetOrganizationAddressesWithHttpInfo (string accessToken)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationAddresses");

            var localVarPath = "/addresses";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetOrganizationAddresses", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Address>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Address>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Address>)));
        }

        /// <summary>
        /// /addresses Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of List&lt;Address&gt;</returns>
        public async System.Threading.Tasks.Task<List<Address>> GetOrganizationAddressesAsync (string accessToken)
        {
             ApiResponse<List<Address>> localVarResponse = await GetOrganizationAddressesAsyncWithHttpInfo(accessToken);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /addresses Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of ApiResponse (List&lt;Address&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Address>>> GetOrganizationAddressesAsyncWithHttpInfo (string accessToken)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationAddresses");

            var localVarPath = "/addresses";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetOrganizationAddresses", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Address>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Address>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Address>)));
        }

        /// <summary>
        /// /contacts/{contact_id} Fetch a contact by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Contact</returns>
        public Contact GetOrganizationContact (string accessToken, long? contactId)
        {
             ApiResponse<Contact> localVarResponse = GetOrganizationContactWithHttpInfo(accessToken, contactId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /contacts/{contact_id} Fetch a contact by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>ApiResponse of Contact</returns>
        public ApiResponse< Contact > GetOrganizationContactWithHttpInfo (string accessToken, long? contactId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationContact");
            // verify the required parameter 'contactId' is set
            if (contactId == null)
                throw new ApiException(400, "Missing required parameter 'contactId' when calling FleetApi->GetOrganizationContact");

            var localVarPath = "/contacts/{contact_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (contactId != null) localVarPathParams.Add("contact_id", this.Configuration.ApiClient.ParameterToString(contactId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetOrganizationContact", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Contact>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Contact) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Contact)));
        }

        /// <summary>
        /// /contacts/{contact_id} Fetch a contact by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Task of Contact</returns>
        public async System.Threading.Tasks.Task<Contact> GetOrganizationContactAsync (string accessToken, long? contactId)
        {
             ApiResponse<Contact> localVarResponse = await GetOrganizationContactAsyncWithHttpInfo(accessToken, contactId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /contacts/{contact_id} Fetch a contact by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Task of ApiResponse (Contact)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Contact>> GetOrganizationContactAsyncWithHttpInfo (string accessToken, long? contactId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationContact");
            // verify the required parameter 'contactId' is set
            if (contactId == null)
                throw new ApiException(400, "Missing required parameter 'contactId' when calling FleetApi->GetOrganizationContact");

            var localVarPath = "/contacts/{contact_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (contactId != null) localVarPathParams.Add("contact_id", this.Configuration.ApiClient.ParameterToString(contactId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetOrganizationContact", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Contact>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Contact) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Contact)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>VehicleHarshEventResponse</returns>
        public VehicleHarshEventResponse GetVehicleHarshEvent (long? vehicleId, string accessToken, long? timestamp)
        {
             ApiResponse<VehicleHarshEventResponse> localVarResponse = GetVehicleHarshEventWithHttpInfo(vehicleId, accessToken, timestamp);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>ApiResponse of VehicleHarshEventResponse</returns>
        public ApiResponse< VehicleHarshEventResponse > GetVehicleHarshEventWithHttpInfo (long? vehicleId, string accessToken, long? timestamp)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleHarshEvent");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleHarshEvent");
            // verify the required parameter 'timestamp' is set
            if (timestamp == null)
                throw new ApiException(400, "Missing required parameter 'timestamp' when calling FleetApi->GetVehicleHarshEvent");

            var localVarPath = "/fleet/vehicles/{vehicleId}/safety/harsh_event";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicleId", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (timestamp != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "timestamp", timestamp)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleHarshEvent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<VehicleHarshEventResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (VehicleHarshEventResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(VehicleHarshEventResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of VehicleHarshEventResponse</returns>
        public async System.Threading.Tasks.Task<VehicleHarshEventResponse> GetVehicleHarshEventAsync (long? vehicleId, string accessToken, long? timestamp)
        {
             ApiResponse<VehicleHarshEventResponse> localVarResponse = await GetVehicleHarshEventAsyncWithHttpInfo(vehicleId, accessToken, timestamp);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of ApiResponse (VehicleHarshEventResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<VehicleHarshEventResponse>> GetVehicleHarshEventAsyncWithHttpInfo (long? vehicleId, string accessToken, long? timestamp)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleHarshEvent");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleHarshEvent");
            // verify the required parameter 'timestamp' is set
            if (timestamp == null)
                throw new ApiException(400, "Missing required parameter 'timestamp' when calling FleetApi->GetVehicleHarshEvent");

            var localVarPath = "/fleet/vehicles/{vehicleId}/safety/harsh_event";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicleId", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (timestamp != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "timestamp", timestamp)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleHarshEvent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<VehicleHarshEventResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (VehicleHarshEventResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(VehicleHarshEventResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>List&lt;FleetVehicleLocation&gt;</returns>
        public List<FleetVehicleLocation> GetVehicleLocations (string accessToken, long? vehicleId, long? startMs, long? endMs)
        {
             ApiResponse<List<FleetVehicleLocation>> localVarResponse = GetVehicleLocationsWithHttpInfo(accessToken, vehicleId, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>ApiResponse of List&lt;FleetVehicleLocation&gt;</returns>
        public ApiResponse< List<FleetVehicleLocation> > GetVehicleLocationsWithHttpInfo (string accessToken, long? vehicleId, long? startMs, long? endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleLocations");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleLocations");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleLocations");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleLocations");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleLocations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<FleetVehicleLocation>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<FleetVehicleLocation>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<FleetVehicleLocation>)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>Task of List&lt;FleetVehicleLocation&gt;</returns>
        public async System.Threading.Tasks.Task<List<FleetVehicleLocation>> GetVehicleLocationsAsync (string accessToken, long? vehicleId, long? startMs, long? endMs)
        {
             ApiResponse<List<FleetVehicleLocation>> localVarResponse = await GetVehicleLocationsAsyncWithHttpInfo(accessToken, vehicleId, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>Task of ApiResponse (List&lt;FleetVehicleLocation&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<FleetVehicleLocation>>> GetVehicleLocationsAsyncWithHttpInfo (string accessToken, long? vehicleId, long? startMs, long? endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleLocations");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleLocations");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleLocations");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleLocations");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleLocations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<FleetVehicleLocation>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<FleetVehicleLocation>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<FleetVehicleLocation>)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>VehicleSafetyScoreResponse</returns>
        public VehicleSafetyScoreResponse GetVehicleSafetyScore (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
             ApiResponse<VehicleSafetyScoreResponse> localVarResponse = GetVehicleSafetyScoreWithHttpInfo(vehicleId, accessToken, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of VehicleSafetyScoreResponse</returns>
        public ApiResponse< VehicleSafetyScoreResponse > GetVehicleSafetyScoreWithHttpInfo (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleSafetyScore");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleSafetyScore");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleSafetyScore");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleSafetyScore");

            var localVarPath = "/fleet/vehicles/{vehicleId}/safety/score";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicleId", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleSafetyScore", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<VehicleSafetyScoreResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (VehicleSafetyScoreResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(VehicleSafetyScoreResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of VehicleSafetyScoreResponse</returns>
        public async System.Threading.Tasks.Task<VehicleSafetyScoreResponse> GetVehicleSafetyScoreAsync (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
             ApiResponse<VehicleSafetyScoreResponse> localVarResponse = await GetVehicleSafetyScoreAsyncWithHttpInfo(vehicleId, accessToken, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (VehicleSafetyScoreResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<VehicleSafetyScoreResponse>> GetVehicleSafetyScoreAsyncWithHttpInfo (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleSafetyScore");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleSafetyScore");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleSafetyScore");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleSafetyScore");

            var localVarPath = "/fleet/vehicles/{vehicleId}/safety/score";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicleId", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleSafetyScore", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<VehicleSafetyScoreResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (VehicleSafetyScoreResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(VehicleSafetyScoreResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/stats Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>InlineResponse2005</returns>
        public InlineResponse2005 GetVehicleStats (string accessToken, int? startMs, int? endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
             ApiResponse<InlineResponse2005> localVarResponse = GetVehicleStatsWithHttpInfo(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/stats Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>ApiResponse of InlineResponse2005</returns>
        public ApiResponse< InlineResponse2005 > GetVehicleStatsWithHttpInfo (string accessToken, int? startMs, int? endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleStats");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleStats");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleStats");

            var localVarPath = "/fleet/vehicles/stats";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter
            if (series != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "series", series)); // query parameter
            if (tagIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "tagIds", tagIds)); // query parameter
            if (startingAfter != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startingAfter", startingAfter)); // query parameter
            if (endingBefore != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endingBefore", endingBefore)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "limit", limit)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleStats", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2005>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2005) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2005)));
        }

        /// <summary>
        /// /fleet/vehicles/stats Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>Task of InlineResponse2005</returns>
        public async System.Threading.Tasks.Task<InlineResponse2005> GetVehicleStatsAsync (string accessToken, int? startMs, int? endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
             ApiResponse<InlineResponse2005> localVarResponse = await GetVehicleStatsAsyncWithHttpInfo(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/stats Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2005)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2005>> GetVehicleStatsAsyncWithHttpInfo (string accessToken, int? startMs, int? endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleStats");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleStats");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleStats");

            var localVarPath = "/fleet/vehicles/stats";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter
            if (series != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "series", series)); // query parameter
            if (tagIds != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "tagIds", tagIds)); // query parameter
            if (startingAfter != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startingAfter", startingAfter)); // query parameter
            if (endingBefore != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endingBefore", endingBefore)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "limit", limit)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleStats", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2005>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2005) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2005)));
        }

        /// <summary>
        /// /fleet/vehicles/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>List&lt;Object&gt;</returns>
        public List<Object> GetVehiclesLocations (string accessToken, int? startMs, int? endMs)
        {
             ApiResponse<List<Object>> localVarResponse = GetVehiclesLocationsWithHttpInfo(accessToken, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>ApiResponse of List&lt;Object&gt;</returns>
        public ApiResponse< List<Object> > GetVehiclesLocationsWithHttpInfo (string accessToken, int? startMs, int? endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehiclesLocations");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehiclesLocations");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehiclesLocations");

            var localVarPath = "/fleet/vehicles/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehiclesLocations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Object>)));
        }

        /// <summary>
        /// /fleet/vehicles/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>Task of List&lt;Object&gt;</returns>
        public async System.Threading.Tasks.Task<List<Object>> GetVehiclesLocationsAsync (string accessToken, int? startMs, int? endMs)
        {
             ApiResponse<List<Object>> localVarResponse = await GetVehiclesLocationsAsyncWithHttpInfo(accessToken, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>Task of ApiResponse (List&lt;Object&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Object>>> GetVehiclesLocationsAsyncWithHttpInfo (string accessToken, int? startMs, int? endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehiclesLocations");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehiclesLocations");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehiclesLocations");

            var localVarPath = "/fleet/vehicles/locations";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehiclesLocations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Object>)));
        }

        /// <summary>
        /// /contacts Fetch all contacts for the organization.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;Contact&gt;</returns>
        public List<Contact> ListContacts (string accessToken)
        {
             ApiResponse<List<Contact>> localVarResponse = ListContactsWithHttpInfo(accessToken);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /contacts Fetch all contacts for the organization.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>ApiResponse of List&lt;Contact&gt;</returns>
        public ApiResponse< List<Contact> > ListContactsWithHttpInfo (string accessToken)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ListContacts");

            var localVarPath = "/contacts";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ListContacts", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Contact>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Contact>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Contact>)));
        }

        /// <summary>
        /// /contacts Fetch all contacts for the organization.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of List&lt;Contact&gt;</returns>
        public async System.Threading.Tasks.Task<List<Contact>> ListContactsAsync (string accessToken)
        {
             ApiResponse<List<Contact>> localVarResponse = await ListContactsAsyncWithHttpInfo(accessToken);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /contacts Fetch all contacts for the organization.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of ApiResponse (List&lt;Contact&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Contact>>> ListContactsAsyncWithHttpInfo (string accessToken)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ListContacts");

            var localVarPath = "/contacts";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ListContacts", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Contact>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Contact>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Contact>)));
        }

        /// <summary>
        /// /fleet/list Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>InlineResponse2002</returns>
        public InlineResponse2002 ListFleet (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
             ApiResponse<InlineResponse2002> localVarResponse = ListFleetWithHttpInfo(accessToken, groupParam, startingAfter, endingBefore, limit);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/list Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>ApiResponse of InlineResponse2002</returns>
        public ApiResponse< InlineResponse2002 > ListFleetWithHttpInfo (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ListFleet");
            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->ListFleet");

            var localVarPath = "/fleet/list";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startingAfter != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startingAfter", startingAfter)); // query parameter
            if (endingBefore != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endingBefore", endingBefore)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "limit", limit)); // query parameter
            if (groupParam != null && groupParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ListFleet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2002>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2002) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2002)));
        }

        /// <summary>
        /// /fleet/list Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>Task of InlineResponse2002</returns>
        public async System.Threading.Tasks.Task<InlineResponse2002> ListFleetAsync (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
             ApiResponse<InlineResponse2002> localVarResponse = await ListFleetAsyncWithHttpInfo(accessToken, groupParam, startingAfter, endingBefore, limit);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/list Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2002)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2002>> ListFleetAsyncWithHttpInfo (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ListFleet");
            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->ListFleet");

            var localVarPath = "/fleet/list";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startingAfter != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startingAfter", startingAfter)); // query parameter
            if (endingBefore != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endingBefore", endingBefore)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "limit", limit)); // query parameter
            if (groupParam != null && groupParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ListFleet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2002>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2002) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2002)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>FleetVehicleResponse</returns>
        public FleetVehicleResponse PatchFleetVehicle (string accessToken, string vehicleIdOrExternalId, InlineObject16 data)
        {
             ApiResponse<FleetVehicleResponse> localVarResponse = PatchFleetVehicleWithHttpInfo(accessToken, vehicleIdOrExternalId, data);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>ApiResponse of FleetVehicleResponse</returns>
        public ApiResponse< FleetVehicleResponse > PatchFleetVehicleWithHttpInfo (string accessToken, string vehicleIdOrExternalId, InlineObject16 data)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->PatchFleetVehicle");
            // verify the required parameter 'vehicleIdOrExternalId' is set
            if (vehicleIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->PatchFleetVehicle");
            // verify the required parameter 'data' is set
            if (data == null)
                throw new ApiException(400, "Missing required parameter 'data' when calling FleetApi->PatchFleetVehicle");

            var localVarPath = "/fleet/vehicles/{vehicle_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/merge-patch+json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleIdOrExternalId != null) localVarPathParams.Add("vehicle_id_or_external_id", this.Configuration.ApiClient.ParameterToString(vehicleIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (data != null && data.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(data); // http body (model) parameter
            }
            else
            {
                localVarPostBody = data; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PatchFleetVehicle", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<FleetVehicleResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (FleetVehicleResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(FleetVehicleResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>Task of FleetVehicleResponse</returns>
        public async System.Threading.Tasks.Task<FleetVehicleResponse> PatchFleetVehicleAsync (string accessToken, string vehicleIdOrExternalId, InlineObject16 data)
        {
             ApiResponse<FleetVehicleResponse> localVarResponse = await PatchFleetVehicleAsyncWithHttpInfo(accessToken, vehicleIdOrExternalId, data);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>Task of ApiResponse (FleetVehicleResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<FleetVehicleResponse>> PatchFleetVehicleAsyncWithHttpInfo (string accessToken, string vehicleIdOrExternalId, InlineObject16 data)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->PatchFleetVehicle");
            // verify the required parameter 'vehicleIdOrExternalId' is set
            if (vehicleIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->PatchFleetVehicle");
            // verify the required parameter 'data' is set
            if (data == null)
                throw new ApiException(400, "Missing required parameter 'data' when calling FleetApi->PatchFleetVehicle");

            var localVarPath = "/fleet/vehicles/{vehicle_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/merge-patch+json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleIdOrExternalId != null) localVarPathParams.Add("vehicle_id_or_external_id", this.Configuration.ApiClient.ParameterToString(vehicleIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (data != null && data.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(data); // http body (model) parameter
            }
            else
            {
                localVarPostBody = data; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PatchFleetVehicle", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<FleetVehicleResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (FleetVehicleResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(FleetVehicleResponse)));
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Reactivate the inactive driver having id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Driver</returns>
        public Driver ReactivateDriverById (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
             ApiResponse<Driver> localVarResponse = ReactivateDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Reactivate the inactive driver having id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>ApiResponse of Driver</returns>
        public ApiResponse< Driver > ReactivateDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ReactivateDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->ReactivateDriverById");
            // verify the required parameter 'reactivateDriverParam' is set
            if (reactivateDriverParam == null)
                throw new ApiException(400, "Missing required parameter 'reactivateDriverParam' when calling FleetApi->ReactivateDriverById");

            var localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (reactivateDriverParam != null && reactivateDriverParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(reactivateDriverParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = reactivateDriverParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ReactivateDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Reactivate the inactive driver having id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Task of Driver</returns>
        public async System.Threading.Tasks.Task<Driver> ReactivateDriverByIdAsync (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
             ApiResponse<Driver> localVarResponse = await ReactivateDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Reactivate the inactive driver having id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Driver>> ReactivateDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ReactivateDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->ReactivateDriverById");
            // verify the required parameter 'reactivateDriverParam' is set
            if (reactivateDriverParam == null)
                throw new ApiException(400, "Missing required parameter 'reactivateDriverParam' when calling FleetApi->ReactivateDriverById");

            var localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (reactivateDriverParam != null && reactivateDriverParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(reactivateDriverParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = reactivateDriverParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ReactivateDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute UpdateDispatchRouteById (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = UpdateDispatchRouteByIdWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > UpdateDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->UpdateDispatchRouteById");
            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling FleetApi->UpdateDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (updateDispatchRouteParams != null && updateDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(updateDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = updateDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> UpdateDispatchRouteByIdAsync (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = await UpdateDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> UpdateDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->UpdateDispatchRouteById");
            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling FleetApi->UpdateDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (updateDispatchRouteParams != null && updateDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(updateDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = updateDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /addresses/{addressId} Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns></returns>
        public void UpdateOrganizationAddress (string accessToken, long? addressId, InlineObject1 address)
        {
             UpdateOrganizationAddressWithHttpInfo(accessToken, addressId, address);
        }

        /// <summary>
        /// /addresses/{addressId} Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> UpdateOrganizationAddressWithHttpInfo (string accessToken, long? addressId, InlineObject1 address)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateOrganizationAddress");
            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->UpdateOrganizationAddress");
            // verify the required parameter 'address' is set
            if (address == null)
                throw new ApiException(400, "Missing required parameter 'address' when calling FleetApi->UpdateOrganizationAddress");

            var localVarPath = "/addresses/{addressId}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (addressId != null) localVarPathParams.Add("addressId", this.Configuration.ApiClient.ParameterToString(addressId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (address != null && address.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(address); // http body (model) parameter
            }
            else
            {
                localVarPostBody = address; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateOrganizationAddress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /addresses/{addressId} Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task UpdateOrganizationAddressAsync (string accessToken, long? addressId, InlineObject1 address)
        {
             await UpdateOrganizationAddressAsyncWithHttpInfo(accessToken, addressId, address);

        }

        /// <summary>
        /// /addresses/{addressId} Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> UpdateOrganizationAddressAsyncWithHttpInfo (string accessToken, long? addressId, InlineObject1 address)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateOrganizationAddress");
            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->UpdateOrganizationAddress");
            // verify the required parameter 'address' is set
            if (address == null)
                throw new ApiException(400, "Missing required parameter 'address' when calling FleetApi->UpdateOrganizationAddress");

            var localVarPath = "/addresses/{addressId}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (addressId != null) localVarPathParams.Add("addressId", this.Configuration.ApiClient.ParameterToString(addressId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (address != null && address.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(address); // http body (model) parameter
            }
            else
            {
                localVarPostBody = address; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateOrganizationAddress", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/set_data This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns></returns>
        public void UpdateVehicles (string accessToken, InlineObject14 vehicleUpdateParam)
        {
             UpdateVehiclesWithHttpInfo(accessToken, vehicleUpdateParam);
        }

        /// <summary>
        /// /fleet/set_data This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> UpdateVehiclesWithHttpInfo (string accessToken, InlineObject14 vehicleUpdateParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateVehicles");
            // verify the required parameter 'vehicleUpdateParam' is set
            if (vehicleUpdateParam == null)
                throw new ApiException(400, "Missing required parameter 'vehicleUpdateParam' when calling FleetApi->UpdateVehicles");

            var localVarPath = "/fleet/set_data";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (vehicleUpdateParam != null && vehicleUpdateParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(vehicleUpdateParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = vehicleUpdateParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateVehicles", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/set_data This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task UpdateVehiclesAsync (string accessToken, InlineObject14 vehicleUpdateParam)
        {
             await UpdateVehiclesAsyncWithHttpInfo(accessToken, vehicleUpdateParam);

        }

        /// <summary>
        /// /fleet/set_data This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> UpdateVehiclesAsyncWithHttpInfo (string accessToken, InlineObject14 vehicleUpdateParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateVehicles");
            // verify the required parameter 'vehicleUpdateParam' is set
            if (vehicleUpdateParam == null)
                throw new ApiException(400, "Missing required parameter 'vehicleUpdateParam' when calling FleetApi->UpdateVehicles");

            var localVarPath = "/fleet/set_data";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (vehicleUpdateParam != null && vehicleUpdateParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(vehicleUpdateParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = vehicleUpdateParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateVehicles", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
