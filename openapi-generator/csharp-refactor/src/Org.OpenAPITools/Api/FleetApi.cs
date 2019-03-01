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
using System.Net;
using System.Net.Mime;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFleetApiSync : IApiAccessor
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
        DispatchRoute CreateDriverDispatchRoute (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams);

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
        ApiResponse<DispatchRoute> CreateDriverDispatchRouteWithHttpInfo (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams);
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
        Document CreateDriverDocument (string accessToken, long driverId, DocumentCreate createDocumentParams);

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
        ApiResponse<Document> CreateDriverDocumentWithHttpInfo (string accessToken, long driverId, DocumentCreate createDocumentParams);
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
        DispatchRoute CreateVehicleDispatchRoute (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams);

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
        ApiResponse<DispatchRoute> CreateVehicleDispatchRouteWithHttpInfo (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams);
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
        void DeleteDispatchRouteById (string accessToken, long routeId);

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
        ApiResponse<Object> DeleteDispatchRouteByIdWithHttpInfo (string accessToken, long routeId);
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
        void DeleteOrganizationAddress (string accessToken, long addressId);

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
        ApiResponse<Object> DeleteOrganizationAddressWithHttpInfo (string accessToken, long addressId);
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
        List<Object> GetAssetLocation (string accessToken, long assetId, long startMs, long endMs);

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
        ApiResponse<List<Object>> GetAssetLocationWithHttpInfo (string accessToken, long assetId, long startMs, long endMs);
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
        AssetReeferResponse GetAssetReefer (string accessToken, long assetId, long startMs, long endMs);

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
        ApiResponse<AssetReeferResponse> GetAssetReeferWithHttpInfo (string accessToken, long assetId, long startMs, long endMs);
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
        DispatchRoute GetDispatchRouteById (string accessToken, long routeId);

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
        ApiResponse<DispatchRoute> GetDispatchRouteByIdWithHttpInfo (string accessToken, long routeId);
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
        DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long routeId, long? startTime = null, long? endTime = null);

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
        ApiResponse<DispatchRouteHistory> GetDispatchRouteHistoryWithHttpInfo (string accessToken, long routeId, long? startTime = null, long? endTime = null);
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
        List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long driverId, long? endTime = null, long? duration = null);

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
        ApiResponse<List<DispatchRoute>> GetDispatchRoutesByDriverIdWithHttpInfo (string accessToken, long driverId, long? endTime = null, long? duration = null);
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
        List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long vehicleId, long? endTime = null, long? duration = null);

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
        ApiResponse<List<DispatchRoute>> GetDispatchRoutesByVehicleIdWithHttpInfo (string accessToken, long vehicleId, long? endTime = null, long? duration = null);
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
        DriverSafetyScoreResponse GetDriverSafetyScore (long driverId, string accessToken, long startMs, long endMs);

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
        ApiResponse<DriverSafetyScoreResponse> GetDriverSafetyScoreWithHttpInfo (long driverId, string accessToken, long startMs, long endMs);
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
        DvirListResponse GetDvirs (string accessToken, int endMs, int durationMs, int? groupId = null);

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
        ApiResponse<DvirListResponse> GetDvirsWithHttpInfo (string accessToken, int endMs, int durationMs, int? groupId = null);
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
        DriverDailyLogResponse GetFleetDriversHosDailyLogs (string accessToken, long driverId, InlineObject6 hosLogsParam);

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
        ApiResponse<DriverDailyLogResponse> GetFleetDriversHosDailyLogsWithHttpInfo (string accessToken, long driverId, InlineObject6 hosLogsParam);
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
        Address GetOrganizationAddress (string accessToken, long addressId);

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
        ApiResponse<Address> GetOrganizationAddressWithHttpInfo (string accessToken, long addressId);
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
        Contact GetOrganizationContact (string accessToken, long contactId);

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
        ApiResponse<Contact> GetOrganizationContactWithHttpInfo (string accessToken, long contactId);
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
        VehicleHarshEventResponse GetVehicleHarshEvent (long vehicleId, string accessToken, long timestamp);

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
        ApiResponse<VehicleHarshEventResponse> GetVehicleHarshEventWithHttpInfo (long vehicleId, string accessToken, long timestamp);
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
        List<FleetVehicleLocation> GetVehicleLocations (string accessToken, long vehicleId, long startMs, long endMs);

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
        ApiResponse<List<FleetVehicleLocation>> GetVehicleLocationsWithHttpInfo (string accessToken, long vehicleId, long startMs, long endMs);
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
        VehicleSafetyScoreResponse GetVehicleSafetyScore (long vehicleId, string accessToken, long startMs, long endMs);

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
        ApiResponse<VehicleSafetyScoreResponse> GetVehicleSafetyScoreWithHttpInfo (long vehicleId, string accessToken, long startMs, long endMs);
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
        InlineResponse2005 GetVehicleStats (string accessToken, int startMs, int endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null);

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
        ApiResponse<InlineResponse2005> GetVehicleStatsWithHttpInfo (string accessToken, int startMs, int endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null);
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
        List<Object> GetVehiclesLocations (string accessToken, int startMs, int endMs);

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
        ApiResponse<List<Object>> GetVehiclesLocationsWithHttpInfo (string accessToken, int startMs, int endMs);
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
        DispatchRoute UpdateDispatchRouteById (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams);

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
        ApiResponse<DispatchRoute> UpdateDispatchRouteByIdWithHttpInfo (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams);
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
        void UpdateOrganizationAddress (string accessToken, long addressId, InlineObject1 address);

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
        ApiResponse<Object> UpdateOrganizationAddressWithHttpInfo (string accessToken, long addressId, InlineObject1 address);
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
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFleetApiAsync : IApiAccessor
    {
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
        System.Threading.Tasks.Task<DispatchRoute> CreateDriverDispatchRouteAsync (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDriverDispatchRouteAsyncWithHttpInfo (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams);
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
        System.Threading.Tasks.Task<Document> CreateDriverDocumentAsync (string accessToken, long driverId, DocumentCreate createDocumentParams);

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
        System.Threading.Tasks.Task<ApiResponse<Document>> CreateDriverDocumentAsyncWithHttpInfo (string accessToken, long driverId, DocumentCreate createDocumentParams);
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
        System.Threading.Tasks.Task<DispatchRoute> CreateVehicleDispatchRouteAsync (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateVehicleDispatchRouteAsyncWithHttpInfo (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams);
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
        System.Threading.Tasks.Task DeleteDispatchRouteByIdAsync (string accessToken, long routeId);

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
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId);
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
        System.Threading.Tasks.Task DeleteOrganizationAddressAsync (string accessToken, long addressId);

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
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteOrganizationAddressAsyncWithHttpInfo (string accessToken, long addressId);
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
        System.Threading.Tasks.Task<List<Object>> GetAssetLocationAsync (string accessToken, long assetId, long startMs, long endMs);

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
        System.Threading.Tasks.Task<ApiResponse<List<Object>>> GetAssetLocationAsyncWithHttpInfo (string accessToken, long assetId, long startMs, long endMs);
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
        System.Threading.Tasks.Task<AssetReeferResponse> GetAssetReeferAsync (string accessToken, long assetId, long startMs, long endMs);

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
        System.Threading.Tasks.Task<ApiResponse<AssetReeferResponse>> GetAssetReeferAsyncWithHttpInfo (string accessToken, long assetId, long startMs, long endMs);
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
        System.Threading.Tasks.Task<DispatchRoute> GetDispatchRouteByIdAsync (string accessToken, long routeId);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> GetDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId);
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
        System.Threading.Tasks.Task<DispatchRouteHistory> GetDispatchRouteHistoryAsync (string accessToken, long routeId, long? startTime = null, long? endTime = null);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRouteHistory>> GetDispatchRouteHistoryAsyncWithHttpInfo (string accessToken, long routeId, long? startTime = null, long? endTime = null);
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
        System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByDriverIdAsync (string accessToken, long driverId, long? endTime = null, long? duration = null);

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
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByDriverIdAsyncWithHttpInfo (string accessToken, long driverId, long? endTime = null, long? duration = null);
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
        System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByVehicleIdAsync (string accessToken, long vehicleId, long? endTime = null, long? duration = null);

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
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByVehicleIdAsyncWithHttpInfo (string accessToken, long vehicleId, long? endTime = null, long? duration = null);
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
        System.Threading.Tasks.Task<DriverSafetyScoreResponse> GetDriverSafetyScoreAsync (long driverId, string accessToken, long startMs, long endMs);

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
        System.Threading.Tasks.Task<ApiResponse<DriverSafetyScoreResponse>> GetDriverSafetyScoreAsyncWithHttpInfo (long driverId, string accessToken, long startMs, long endMs);
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
        System.Threading.Tasks.Task<DvirListResponse> GetDvirsAsync (string accessToken, int endMs, int durationMs, int? groupId = null);

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
        System.Threading.Tasks.Task<ApiResponse<DvirListResponse>> GetDvirsAsyncWithHttpInfo (string accessToken, int endMs, int durationMs, int? groupId = null);
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
        System.Threading.Tasks.Task<DriverDailyLogResponse> GetFleetDriversHosDailyLogsAsync (string accessToken, long driverId, InlineObject6 hosLogsParam);

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
        System.Threading.Tasks.Task<ApiResponse<DriverDailyLogResponse>> GetFleetDriversHosDailyLogsAsyncWithHttpInfo (string accessToken, long driverId, InlineObject6 hosLogsParam);
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
        System.Threading.Tasks.Task<Address> GetOrganizationAddressAsync (string accessToken, long addressId);

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
        System.Threading.Tasks.Task<ApiResponse<Address>> GetOrganizationAddressAsyncWithHttpInfo (string accessToken, long addressId);
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
        System.Threading.Tasks.Task<Contact> GetOrganizationContactAsync (string accessToken, long contactId);

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
        System.Threading.Tasks.Task<ApiResponse<Contact>> GetOrganizationContactAsyncWithHttpInfo (string accessToken, long contactId);
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
        System.Threading.Tasks.Task<VehicleHarshEventResponse> GetVehicleHarshEventAsync (long vehicleId, string accessToken, long timestamp);

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
        System.Threading.Tasks.Task<ApiResponse<VehicleHarshEventResponse>> GetVehicleHarshEventAsyncWithHttpInfo (long vehicleId, string accessToken, long timestamp);
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
        System.Threading.Tasks.Task<List<FleetVehicleLocation>> GetVehicleLocationsAsync (string accessToken, long vehicleId, long startMs, long endMs);

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
        System.Threading.Tasks.Task<ApiResponse<List<FleetVehicleLocation>>> GetVehicleLocationsAsyncWithHttpInfo (string accessToken, long vehicleId, long startMs, long endMs);
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
        System.Threading.Tasks.Task<VehicleSafetyScoreResponse> GetVehicleSafetyScoreAsync (long vehicleId, string accessToken, long startMs, long endMs);

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
        System.Threading.Tasks.Task<ApiResponse<VehicleSafetyScoreResponse>> GetVehicleSafetyScoreAsyncWithHttpInfo (long vehicleId, string accessToken, long startMs, long endMs);
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
        System.Threading.Tasks.Task<InlineResponse2005> GetVehicleStatsAsync (string accessToken, int startMs, int endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null);

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
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2005>> GetVehicleStatsAsyncWithHttpInfo (string accessToken, int startMs, int endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null);
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
        System.Threading.Tasks.Task<List<Object>> GetVehiclesLocationsAsync (string accessToken, int startMs, int endMs);

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
        System.Threading.Tasks.Task<ApiResponse<List<Object>>> GetVehiclesLocationsAsyncWithHttpInfo (string accessToken, int startMs, int endMs);
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
        System.Threading.Tasks.Task<DispatchRoute> UpdateDispatchRouteByIdAsync (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> UpdateDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams);
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
        System.Threading.Tasks.Task UpdateOrganizationAddressAsync (string accessToken, long addressId, InlineObject1 address);

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
        System.Threading.Tasks.Task<ApiResponse<Object>> UpdateOrganizationAddressAsyncWithHttpInfo (string accessToken, long addressId, InlineObject1 address);
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
    public interface IFleetApi : IFleetApiSync, IFleetApiAsync
    {

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
        public FleetApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FleetApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FleetApi(String basePath)
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                new Org.OpenAPITools.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FleetApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public FleetApi(Org.OpenAPITools.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PetApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public FleetApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
        {
            if(client == null) throw new ArgumentNullException("client");
            if(asyncClient == null) throw new ArgumentNullException("asyncClient");
            if(configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Org.OpenAPITools.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Org.OpenAPITools.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.IReadableConfiguration Configuration {get; set;}

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
        public Org.OpenAPITools.Client.ApiResponse<Object> AddFleetAddressWithHttpInfo (string accessToken, InlineObject2 addressParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->AddFleetAddress");

            // verify the required parameter 'addressParam' is set
            if (addressParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addressParam' when calling FleetApi->AddFleetAddress");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = addressParam;


            // make the HTTP request

            var response = this.Client.Post<Object>("/fleet/add_address", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("AddFleetAddress", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> AddFleetAddressAsyncWithHttpInfo (string accessToken, InlineObject2 addressParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->AddFleetAddress");

            // verify the required parameter 'addressParam' is set
            if (addressParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addressParam' when calling FleetApi->AddFleetAddress");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = addressParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Object>("/fleet/add_address", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("AddFleetAddress", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<Address>> localVarResponse = AddOrganizationAddressesWithHttpInfo(accessToken, addresses);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /addresses Add one or more addresses to the organization
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>ApiResponse of List&lt;Address&gt;</returns>
        public Org.OpenAPITools.Client.ApiResponse< List<Address> > AddOrganizationAddressesWithHttpInfo (string accessToken, InlineObject addresses)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->AddOrganizationAddresses");

            // verify the required parameter 'addresses' is set
            if (addresses == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addresses' when calling FleetApi->AddOrganizationAddresses");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = addresses;


            // make the HTTP request

            var response = this.Client.Post< List<Address> >("/addresses", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("AddOrganizationAddresses", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<Address>> localVarResponse = await AddOrganizationAddressesAsyncWithHttpInfo(accessToken, addresses);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /addresses Add one or more addresses to the organization
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>Task of ApiResponse (List&lt;Address&gt;)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<Address>>> AddOrganizationAddressesAsyncWithHttpInfo (string accessToken, InlineObject addresses)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->AddOrganizationAddresses");

            // verify the required parameter 'addresses' is set
            if (addresses == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addresses' when calling FleetApi->AddOrganizationAddresses");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = addresses;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<List<Address>>("/addresses", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("AddOrganizationAddresses", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = CreateDispatchRouteWithHttpInfo(accessToken, createDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > CreateDispatchRouteWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateDispatchRoute");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = this.Client.Post< DispatchRoute >("/fleet/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await CreateDispatchRouteAsyncWithHttpInfo(accessToken, createDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> CreateDispatchRouteAsyncWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateDispatchRoute");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DispatchRoute>("/fleet/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = CreateDriverWithHttpInfo(accessToken, createDriverParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>ApiResponse of Driver</returns>
        public Org.OpenAPITools.Client.ApiResponse< Driver > CreateDriverWithHttpInfo (string accessToken, DriverForCreate createDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriver");

            // verify the required parameter 'createDriverParam' is set
            if (createDriverParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDriverParam' when calling FleetApi->CreateDriver");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDriverParam;


            // make the HTTP request

            var response = this.Client.Post< Driver >("/fleet/drivers/create", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriver", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = await CreateDriverAsyncWithHttpInfo(accessToken, createDriverParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Driver>> CreateDriverAsyncWithHttpInfo (string accessToken, DriverForCreate createDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriver");

            // verify the required parameter 'createDriverParam' is set
            if (createDriverParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDriverParam' when calling FleetApi->CreateDriver");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDriverParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Driver>("/fleet/drivers/create", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriver", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateDriverDispatchRoute (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = CreateDriverDispatchRouteWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
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
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > CreateDriverDispatchRouteWithHttpInfo (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriverDispatchRoute");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->CreateDriverDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateDriverDispatchRoute");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = this.Client.Post< DispatchRoute >("/fleet/drivers/{driver_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriverDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateDriverDispatchRouteAsync (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await CreateDriverDispatchRouteAsyncWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> CreateDriverDispatchRouteAsyncWithHttpInfo (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriverDispatchRoute");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->CreateDriverDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateDriverDispatchRoute");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DispatchRoute>("/fleet/drivers/{driver_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriverDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents Create a driver document for the given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Document</returns>
        public Document CreateDriverDocument (string accessToken, long driverId, DocumentCreate createDocumentParams)
        {
             Org.OpenAPITools.Client.ApiResponse<Document> localVarResponse = CreateDriverDocumentWithHttpInfo(accessToken, driverId, createDocumentParams);
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
        public Org.OpenAPITools.Client.ApiResponse< Document > CreateDriverDocumentWithHttpInfo (string accessToken, long driverId, DocumentCreate createDocumentParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriverDocument");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->CreateDriverDocument");

            // verify the required parameter 'createDocumentParams' is set
            if (createDocumentParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDocumentParams' when calling FleetApi->CreateDriverDocument");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDocumentParams;


            // make the HTTP request

            var response = this.Client.Post< Document >("/fleet/drivers/{driver_id}/documents", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriverDocument", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/documents Create a driver document for the given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Task of Document</returns>
        public async System.Threading.Tasks.Task<Document> CreateDriverDocumentAsync (string accessToken, long driverId, DocumentCreate createDocumentParams)
        {
             Org.OpenAPITools.Client.ApiResponse<Document> localVarResponse = await CreateDriverDocumentAsyncWithHttpInfo(accessToken, driverId, createDocumentParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Document>> CreateDriverDocumentAsyncWithHttpInfo (string accessToken, long driverId, DocumentCreate createDocumentParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDriverDocument");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->CreateDriverDocument");

            // verify the required parameter 'createDocumentParams' is set
            if (createDocumentParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDocumentParams' when calling FleetApi->CreateDriverDocument");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDocumentParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Document>("/fleet/drivers/{driver_id}/documents", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriverDocument", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DvirBase> localVarResponse = CreateDvirWithHttpInfo(accessToken, createDvirParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/maintenance/dvirs Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>ApiResponse of DvirBase</returns>
        public Org.OpenAPITools.Client.ApiResponse< DvirBase > CreateDvirWithHttpInfo (string accessToken, InlineObject12 createDvirParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDvir");

            // verify the required parameter 'createDvirParam' is set
            if (createDvirParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDvirParam' when calling FleetApi->CreateDvir");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDvirParam;


            // make the HTTP request

            var response = this.Client.Post< DvirBase >("/fleet/maintenance/dvirs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDvir", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DvirBase> localVarResponse = await CreateDvirAsyncWithHttpInfo(accessToken, createDvirParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/maintenance/dvirs Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>Task of ApiResponse (DvirBase)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DvirBase>> CreateDvirAsyncWithHttpInfo (string accessToken, InlineObject12 createDvirParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateDvir");

            // verify the required parameter 'createDvirParam' is set
            if (createDvirParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDvirParam' when calling FleetApi->CreateDvir");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDvirParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DvirBase>("/fleet/maintenance/dvirs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDvir", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateVehicleDispatchRoute (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = CreateVehicleDispatchRouteWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
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
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > CreateVehicleDispatchRouteWithHttpInfo (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateVehicleDispatchRoute");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->CreateVehicleDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateVehicleDispatchRoute");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = this.Client.Post< DispatchRoute >("/fleet/vehicles/{vehicle_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateVehicleDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateVehicleDispatchRouteAsync (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await CreateVehicleDispatchRouteAsyncWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> CreateVehicleDispatchRouteAsyncWithHttpInfo (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->CreateVehicleDispatchRoute");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->CreateVehicleDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling FleetApi->CreateVehicleDispatchRoute");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DispatchRoute>("/fleet/vehicles/{vehicle_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateVehicleDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public Org.OpenAPITools.Client.ApiResponse<Object> DeactivateDriverWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeactivateDriver");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->DeactivateDriver");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Delete<Object>("/fleet/drivers/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeactivateDriver", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> DeactivateDriverAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeactivateDriver");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->DeactivateDriver");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.DeleteAsync<Object>("/fleet/drivers/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeactivateDriver", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        public void DeleteDispatchRouteById (string accessToken, long routeId)
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
        public Org.OpenAPITools.Client.ApiResponse<Object> DeleteDispatchRouteByIdWithHttpInfo (string accessToken, long routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeleteDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->DeleteDispatchRouteById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Delete<Object>("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeleteDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteDispatchRouteByIdAsync (string accessToken, long routeId)
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> DeleteDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeleteDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->DeleteDispatchRouteById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.DeleteAsync<Object>("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeleteDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /addresses/{addressId} Delete an address.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns></returns>
        public void DeleteOrganizationAddress (string accessToken, long addressId)
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
        public Org.OpenAPITools.Client.ApiResponse<Object> DeleteOrganizationAddressWithHttpInfo (string accessToken, long addressId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeleteOrganizationAddress");

            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->DeleteOrganizationAddress");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (addressId != null)
                requestOptions.PathParameters.Add("addressId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(addressId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Delete<Object>("/addresses/{addressId}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeleteOrganizationAddress", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /addresses/{addressId} Delete an address.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteOrganizationAddressAsync (string accessToken, long addressId)
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> DeleteOrganizationAddressAsyncWithHttpInfo (string accessToken, long addressId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->DeleteOrganizationAddress");

            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->DeleteOrganizationAddress");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (addressId != null)
                requestOptions.PathParameters.Add("addressId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(addressId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.DeleteAsync<Object>("/addresses/{addressId}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeleteOrganizationAddress", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = FetchAllDispatchRoutesWithHttpInfo(accessToken, groupId, endTime, duration);
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
        public Org.OpenAPITools.Client.ApiResponse< List<DispatchRoute> > FetchAllDispatchRoutesWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->FetchAllDispatchRoutes");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<DispatchRoute> >("/fleet/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FetchAllDispatchRoutes", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = await FetchAllDispatchRoutesAsyncWithHttpInfo(accessToken, groupId, endTime, duration);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>>> FetchAllDispatchRoutesAsyncWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->FetchAllDispatchRoutes");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<DispatchRoute>>("/fleet/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FetchAllDispatchRoutes", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<AllRouteJobUpdates> localVarResponse = FetchAllRouteJobUpdatesWithHttpInfo(accessToken, groupId, sequenceId, include);
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
        public Org.OpenAPITools.Client.ApiResponse< AllRouteJobUpdates > FetchAllRouteJobUpdatesWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->FetchAllRouteJobUpdates");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (sequenceId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "sequence_id", sequenceId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (include != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "include", include))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< AllRouteJobUpdates >("/fleet/dispatch/routes/job_updates", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FetchAllRouteJobUpdates", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<AllRouteJobUpdates> localVarResponse = await FetchAllRouteJobUpdatesAsyncWithHttpInfo(accessToken, groupId, sequenceId, include);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<AllRouteJobUpdates>> FetchAllRouteJobUpdatesAsyncWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->FetchAllRouteJobUpdates");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (sequenceId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "sequence_id", sequenceId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (include != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "include", include))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<AllRouteJobUpdates>("/fleet/dispatch/routes/job_updates", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FetchAllRouteJobUpdates", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2001> localVarResponse = GetAllAssetCurrentLocationsWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/assets/locations Fetch current locations of all assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse2001</returns>
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2001 > GetAllAssetCurrentLocationsWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllAssetCurrentLocations");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< InlineResponse2001 >("/fleet/assets/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllAssetCurrentLocations", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2001> localVarResponse = await GetAllAssetCurrentLocationsAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/assets/locations Fetch current locations of all assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2001)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2001>> GetAllAssetCurrentLocationsAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllAssetCurrentLocations");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<InlineResponse2001>("/fleet/assets/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllAssetCurrentLocations", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse200> localVarResponse = GetAllAssetsWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/assets Fetch all of the assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse200</returns>
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse200 > GetAllAssetsWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllAssets");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< InlineResponse200 >("/fleet/assets", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllAssets", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse200> localVarResponse = await GetAllAssetsAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/assets Fetch all of the assets for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse200)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse200>> GetAllAssetsAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllAssets");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<InlineResponse200>("/fleet/assets", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllAssets", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<Driver>> localVarResponse = GetAllDeactivatedDriversWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of List&lt;Driver&gt;</returns>
        public Org.OpenAPITools.Client.ApiResponse< List<Driver> > GetAllDeactivatedDriversWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllDeactivatedDrivers");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<Driver> >("/fleet/drivers/inactive", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllDeactivatedDrivers", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<Driver>> localVarResponse = await GetAllDeactivatedDriversAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Driver&gt;)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<Driver>>> GetAllDeactivatedDriversAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAllDeactivatedDrivers");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<Driver>>("/fleet/drivers/inactive", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllDeactivatedDrivers", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public List<Object> GetAssetLocation (string accessToken, long assetId, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<List<Object>> localVarResponse = GetAssetLocationWithHttpInfo(accessToken, assetId, startMs, endMs);
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
        public Org.OpenAPITools.Client.ApiResponse< List<Object> > GetAssetLocationWithHttpInfo (string accessToken, long assetId, long startMs, long endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAssetLocation");

            // verify the required parameter 'assetId' is set
            if (assetId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'assetId' when calling FleetApi->GetAssetLocation");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetAssetLocation");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetAssetLocation");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (assetId != null)
                requestOptions.PathParameters.Add("asset_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(assetId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<Object> >("/fleet/assets/{asset_id}/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAssetLocation", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<List<Object>> GetAssetLocationAsync (string accessToken, long assetId, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<List<Object>> localVarResponse = await GetAssetLocationAsyncWithHttpInfo(accessToken, assetId, startMs, endMs);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<Object>>> GetAssetLocationAsyncWithHttpInfo (string accessToken, long assetId, long startMs, long endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAssetLocation");

            // verify the required parameter 'assetId' is set
            if (assetId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'assetId' when calling FleetApi->GetAssetLocation");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetAssetLocation");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetAssetLocation");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (assetId != null)
                requestOptions.PathParameters.Add("asset_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(assetId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<Object>>("/fleet/assets/{asset_id}/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAssetLocation", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public AssetReeferResponse GetAssetReefer (string accessToken, long assetId, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<AssetReeferResponse> localVarResponse = GetAssetReeferWithHttpInfo(accessToken, assetId, startMs, endMs);
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
        public Org.OpenAPITools.Client.ApiResponse< AssetReeferResponse > GetAssetReeferWithHttpInfo (string accessToken, long assetId, long startMs, long endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAssetReefer");

            // verify the required parameter 'assetId' is set
            if (assetId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'assetId' when calling FleetApi->GetAssetReefer");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetAssetReefer");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetAssetReefer");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (assetId != null)
                requestOptions.PathParameters.Add("asset_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(assetId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< AssetReeferResponse >("/fleet/assets/{asset_id}/reefer", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAssetReefer", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<AssetReeferResponse> GetAssetReeferAsync (string accessToken, long assetId, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<AssetReeferResponse> localVarResponse = await GetAssetReeferAsyncWithHttpInfo(accessToken, assetId, startMs, endMs);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<AssetReeferResponse>> GetAssetReeferAsyncWithHttpInfo (string accessToken, long assetId, long startMs, long endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetAssetReefer");

            // verify the required parameter 'assetId' is set
            if (assetId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'assetId' when calling FleetApi->GetAssetReefer");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetAssetReefer");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetAssetReefer");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (assetId != null)
                requestOptions.PathParameters.Add("asset_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(assetId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<AssetReeferResponse>("/fleet/assets/{asset_id}/reefer", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAssetReefer", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = GetDeactivatedDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        public Org.OpenAPITools.Client.ApiResponse< Driver > GetDeactivatedDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDeactivatedDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->GetDeactivatedDriverById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< Driver >("/fleet/drivers/inactive/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDeactivatedDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = await GetDeactivatedDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Driver>> GetDeactivatedDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDeactivatedDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->GetDeactivatedDriverById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<Driver>("/fleet/drivers/inactive/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDeactivatedDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute GetDispatchRouteById (string accessToken, long routeId)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = GetDispatchRouteByIdWithHttpInfo(accessToken, routeId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > GetDispatchRouteByIdWithHttpInfo (string accessToken, long routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->GetDispatchRouteById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< DispatchRoute >("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> GetDispatchRouteByIdAsync (string accessToken, long routeId)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await GetDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> GetDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->GetDispatchRouteById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<DispatchRoute>("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long routeId, long? startTime = null, long? endTime = null)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRouteHistory> localVarResponse = GetDispatchRouteHistoryWithHttpInfo(accessToken, routeId, startTime, endTime);
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
        public Org.OpenAPITools.Client.ApiResponse< DispatchRouteHistory > GetDispatchRouteHistoryWithHttpInfo (string accessToken, long routeId, long? startTime = null, long? endTime = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRouteHistory");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->GetDispatchRouteHistory");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "start_time", startTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< DispatchRouteHistory >("/fleet/dispatch/routes/{route_id}/history", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRouteHistory", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<DispatchRouteHistory> GetDispatchRouteHistoryAsync (string accessToken, long routeId, long? startTime = null, long? endTime = null)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRouteHistory> localVarResponse = await GetDispatchRouteHistoryAsyncWithHttpInfo(accessToken, routeId, startTime, endTime);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRouteHistory>> GetDispatchRouteHistoryAsyncWithHttpInfo (string accessToken, long routeId, long? startTime = null, long? endTime = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRouteHistory");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->GetDispatchRouteHistory");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "start_time", startTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<DispatchRouteHistory>("/fleet/dispatch/routes/{route_id}/history", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRouteHistory", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long driverId, long? endTime = null, long? duration = null)
        {
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = GetDispatchRoutesByDriverIdWithHttpInfo(accessToken, driverId, endTime, duration);
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
        public Org.OpenAPITools.Client.ApiResponse< List<DispatchRoute> > GetDispatchRoutesByDriverIdWithHttpInfo (string accessToken, long driverId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRoutesByDriverId");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetDispatchRoutesByDriverId");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<DispatchRoute> >("/fleet/drivers/{driver_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRoutesByDriverId", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByDriverIdAsync (string accessToken, long driverId, long? endTime = null, long? duration = null)
        {
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = await GetDispatchRoutesByDriverIdAsyncWithHttpInfo(accessToken, driverId, endTime, duration);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByDriverIdAsyncWithHttpInfo (string accessToken, long driverId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRoutesByDriverId");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetDispatchRoutesByDriverId");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<DispatchRoute>>("/fleet/drivers/{driver_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRoutesByDriverId", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long vehicleId, long? endTime = null, long? duration = null)
        {
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = GetDispatchRoutesByVehicleIdWithHttpInfo(accessToken, vehicleId, endTime, duration);
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
        public Org.OpenAPITools.Client.ApiResponse< List<DispatchRoute> > GetDispatchRoutesByVehicleIdWithHttpInfo (string accessToken, long vehicleId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRoutesByVehicleId");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetDispatchRoutesByVehicleId");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<DispatchRoute> >("/fleet/vehicles/{vehicle_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRoutesByVehicleId", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByVehicleIdAsync (string accessToken, long vehicleId, long? endTime = null, long? duration = null)
        {
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = await GetDispatchRoutesByVehicleIdAsyncWithHttpInfo(accessToken, vehicleId, endTime, duration);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByVehicleIdAsyncWithHttpInfo (string accessToken, long vehicleId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDispatchRoutesByVehicleId");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetDispatchRoutesByVehicleId");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<DispatchRoute>>("/fleet/vehicles/{vehicle_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRoutesByVehicleId", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = GetDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        public Org.OpenAPITools.Client.ApiResponse< Driver > GetDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->GetDriverById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< Driver >("/fleet/drivers/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = await GetDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Driver>> GetDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->GetDriverById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<Driver>("/fleet/drivers/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/document_types Fetch all of the document types.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;DocumentType&gt;</returns>
        public List<DocumentType> GetDriverDocumentTypesByOrgId ()
        {
             Org.OpenAPITools.Client.ApiResponse<List<DocumentType>> localVarResponse = GetDriverDocumentTypesByOrgIdWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/document_types Fetch all of the document types.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;DocumentType&gt;</returns>
        public Org.OpenAPITools.Client.ApiResponse< List<DocumentType> > GetDriverDocumentTypesByOrgIdWithHttpInfo ()
        {
            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);



            // make the HTTP request

            var response = this.Client.Get< List<DocumentType> >("/fleet/drivers/document_types", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverDocumentTypesByOrgId", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/document_types Fetch all of the document types.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;DocumentType&gt;</returns>
        public async System.Threading.Tasks.Task<List<DocumentType>> GetDriverDocumentTypesByOrgIdAsync ()
        {
             Org.OpenAPITools.Client.ApiResponse<List<DocumentType>> localVarResponse = await GetDriverDocumentTypesByOrgIdAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/document_types Fetch all of the document types.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;DocumentType&gt;)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<DocumentType>>> GetDriverDocumentTypesByOrgIdAsyncWithHttpInfo ()
        {

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<DocumentType>>("/fleet/drivers/document_types", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverDocumentTypesByOrgId", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<Document>> localVarResponse = GetDriverDocumentsByOrgIdWithHttpInfo(accessToken, endMs, durationMs);
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
        public Org.OpenAPITools.Client.ApiResponse< List<Document> > GetDriverDocumentsByOrgIdWithHttpInfo (string accessToken, long? endMs = null, long? durationMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverDocumentsByOrgId");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (durationMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "durationMs", durationMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<Document> >("/fleet/drivers/documents", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverDocumentsByOrgId", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<Document>> localVarResponse = await GetDriverDocumentsByOrgIdAsyncWithHttpInfo(accessToken, endMs, durationMs);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<Document>>> GetDriverDocumentsByOrgIdAsyncWithHttpInfo (string accessToken, long? endMs = null, long? durationMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverDocumentsByOrgId");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (durationMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "durationMs", durationMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<Document>>("/fleet/drivers/documents", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverDocumentsByOrgId", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public DriverSafetyScoreResponse GetDriverSafetyScore (long driverId, string accessToken, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<DriverSafetyScoreResponse> localVarResponse = GetDriverSafetyScoreWithHttpInfo(driverId, accessToken, startMs, endMs);
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
        public Org.OpenAPITools.Client.ApiResponse< DriverSafetyScoreResponse > GetDriverSafetyScoreWithHttpInfo (long driverId, string accessToken, long startMs, long endMs)
        {
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetDriverSafetyScore");

            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverSafetyScore");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetDriverSafetyScore");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetDriverSafetyScore");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverId != null)
                requestOptions.PathParameters.Add("driverId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< DriverSafetyScoreResponse >("/fleet/drivers/{driverId}/safety/score", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverSafetyScore", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<DriverSafetyScoreResponse> GetDriverSafetyScoreAsync (long driverId, string accessToken, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<DriverSafetyScoreResponse> localVarResponse = await GetDriverSafetyScoreAsyncWithHttpInfo(driverId, accessToken, startMs, endMs);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DriverSafetyScoreResponse>> GetDriverSafetyScoreAsyncWithHttpInfo (long driverId, string accessToken, long startMs, long endMs)
        {
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetDriverSafetyScore");

            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDriverSafetyScore");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetDriverSafetyScore");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetDriverSafetyScore");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverId != null)
                requestOptions.PathParameters.Add("driverId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<DriverSafetyScoreResponse>("/fleet/drivers/{driverId}/safety/score", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverSafetyScore", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public DvirListResponse GetDvirs (string accessToken, int endMs, int durationMs, int? groupId = null)
        {
             Org.OpenAPITools.Client.ApiResponse<DvirListResponse> localVarResponse = GetDvirsWithHttpInfo(accessToken, endMs, durationMs, groupId);
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
        public Org.OpenAPITools.Client.ApiResponse< DvirListResponse > GetDvirsWithHttpInfo (string accessToken, int endMs, int durationMs, int? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDvirs");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetDvirs");

            // verify the required parameter 'durationMs' is set
            if (durationMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'durationMs' when calling FleetApi->GetDvirs");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_ms", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (durationMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration_ms", durationMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< DvirListResponse >("/fleet/maintenance/dvirs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDvirs", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<DvirListResponse> GetDvirsAsync (string accessToken, int endMs, int durationMs, int? groupId = null)
        {
             Org.OpenAPITools.Client.ApiResponse<DvirListResponse> localVarResponse = await GetDvirsAsyncWithHttpInfo(accessToken, endMs, durationMs, groupId);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DvirListResponse>> GetDvirsAsyncWithHttpInfo (string accessToken, int endMs, int durationMs, int? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetDvirs");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetDvirs");

            // verify the required parameter 'durationMs' is set
            if (durationMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'durationMs' when calling FleetApi->GetDvirs");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_ms", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (durationMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration_ms", durationMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<DvirListResponse>("/fleet/maintenance/dvirs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDvirs", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DriversResponse> localVarResponse = GetFleetDriversWithHttpInfo(accessToken, groupDriversParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers Get all the drivers for the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>ApiResponse of DriversResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< DriversResponse > GetFleetDriversWithHttpInfo (string accessToken, InlineObject3 groupDriversParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDrivers");

            // verify the required parameter 'groupDriversParam' is set
            if (groupDriversParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupDriversParam' when calling FleetApi->GetFleetDrivers");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupDriversParam;


            // make the HTTP request

            var response = this.Client.Post< DriversResponse >("/fleet/drivers", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetDrivers", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DriversResponse> localVarResponse = await GetFleetDriversAsyncWithHttpInfo(accessToken, groupDriversParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers Get all the drivers for the specified group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>Task of ApiResponse (DriversResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DriversResponse>> GetFleetDriversAsyncWithHttpInfo (string accessToken, InlineObject3 groupDriversParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDrivers");

            // verify the required parameter 'groupDriversParam' is set
            if (groupDriversParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupDriversParam' when calling FleetApi->GetFleetDrivers");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupDriversParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DriversResponse>("/fleet/drivers", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetDrivers", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs Get summarized daily HOS charts for a specified driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>DriverDailyLogResponse</returns>
        public DriverDailyLogResponse GetFleetDriversHosDailyLogs (string accessToken, long driverId, InlineObject6 hosLogsParam)
        {
             Org.OpenAPITools.Client.ApiResponse<DriverDailyLogResponse> localVarResponse = GetFleetDriversHosDailyLogsWithHttpInfo(accessToken, driverId, hosLogsParam);
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
        public Org.OpenAPITools.Client.ApiResponse< DriverDailyLogResponse > GetFleetDriversHosDailyLogsWithHttpInfo (string accessToken, long driverId, InlineObject6 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDriversHosDailyLogs");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetFleetDriversHosDailyLogs");

            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetDriversHosDailyLogs");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = hosLogsParam;


            // make the HTTP request

            var response = this.Client.Post< DriverDailyLogResponse >("/fleet/drivers/{driver_id}/hos_daily_logs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetDriversHosDailyLogs", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs Get summarized daily HOS charts for a specified driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of DriverDailyLogResponse</returns>
        public async System.Threading.Tasks.Task<DriverDailyLogResponse> GetFleetDriversHosDailyLogsAsync (string accessToken, long driverId, InlineObject6 hosLogsParam)
        {
             Org.OpenAPITools.Client.ApiResponse<DriverDailyLogResponse> localVarResponse = await GetFleetDriversHosDailyLogsAsyncWithHttpInfo(accessToken, driverId, hosLogsParam);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DriverDailyLogResponse>> GetFleetDriversHosDailyLogsAsyncWithHttpInfo (string accessToken, long driverId, InlineObject6 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDriversHosDailyLogs");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling FleetApi->GetFleetDriversHosDailyLogs");

            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetDriversHosDailyLogs");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = hosLogsParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DriverDailyLogResponse>("/fleet/drivers/{driver_id}/hos_daily_logs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetDriversHosDailyLogs", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DriversSummaryResponse> localVarResponse = GetFleetDriversSummaryWithHttpInfo(accessToken, driversSummaryParam, snapToDayBounds);
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
        public Org.OpenAPITools.Client.ApiResponse< DriversSummaryResponse > GetFleetDriversSummaryWithHttpInfo (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDriversSummary");

            // verify the required parameter 'driversSummaryParam' is set
            if (driversSummaryParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driversSummaryParam' when calling FleetApi->GetFleetDriversSummary");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (snapToDayBounds != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "snap_to_day_bounds", snapToDayBounds))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = driversSummaryParam;


            // make the HTTP request

            var response = this.Client.Post< DriversSummaryResponse >("/fleet/drivers/summary", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetDriversSummary", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DriversSummaryResponse> localVarResponse = await GetFleetDriversSummaryAsyncWithHttpInfo(accessToken, driversSummaryParam, snapToDayBounds);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DriversSummaryResponse>> GetFleetDriversSummaryAsyncWithHttpInfo (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetDriversSummary");

            // verify the required parameter 'driversSummaryParam' is set
            if (driversSummaryParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driversSummaryParam' when calling FleetApi->GetFleetDriversSummary");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (snapToDayBounds != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "snap_to_day_bounds", snapToDayBounds))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = driversSummaryParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DriversSummaryResponse>("/fleet/drivers/summary", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetDriversSummary", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<HosAuthenticationLogsResponse> localVarResponse = GetFleetHosAuthenticationLogsWithHttpInfo(accessToken, hosAuthenticationLogsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/hos_authentication_logs Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>ApiResponse of HosAuthenticationLogsResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< HosAuthenticationLogsResponse > GetFleetHosAuthenticationLogsWithHttpInfo (string accessToken, InlineObject7 hosAuthenticationLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosAuthenticationLogs");

            // verify the required parameter 'hosAuthenticationLogsParam' is set
            if (hosAuthenticationLogsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'hosAuthenticationLogsParam' when calling FleetApi->GetFleetHosAuthenticationLogs");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = hosAuthenticationLogsParam;


            // make the HTTP request

            var response = this.Client.Post< HosAuthenticationLogsResponse >("/fleet/hos_authentication_logs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetHosAuthenticationLogs", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<HosAuthenticationLogsResponse> localVarResponse = await GetFleetHosAuthenticationLogsAsyncWithHttpInfo(accessToken, hosAuthenticationLogsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/hos_authentication_logs Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>Task of ApiResponse (HosAuthenticationLogsResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<HosAuthenticationLogsResponse>> GetFleetHosAuthenticationLogsAsyncWithHttpInfo (string accessToken, InlineObject7 hosAuthenticationLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosAuthenticationLogs");

            // verify the required parameter 'hosAuthenticationLogsParam' is set
            if (hosAuthenticationLogsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'hosAuthenticationLogsParam' when calling FleetApi->GetFleetHosAuthenticationLogs");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = hosAuthenticationLogsParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<HosAuthenticationLogsResponse>("/fleet/hos_authentication_logs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetHosAuthenticationLogs", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<HosLogsResponse> localVarResponse = GetFleetHosLogsWithHttpInfo(accessToken, hosLogsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/hos_logs Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>ApiResponse of HosLogsResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< HosLogsResponse > GetFleetHosLogsWithHttpInfo (string accessToken, InlineObject8 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosLogs");

            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetHosLogs");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = hosLogsParam;


            // make the HTTP request

            var response = this.Client.Post< HosLogsResponse >("/fleet/hos_logs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetHosLogs", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<HosLogsResponse> localVarResponse = await GetFleetHosLogsAsyncWithHttpInfo(accessToken, hosLogsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/hos_logs Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of ApiResponse (HosLogsResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<HosLogsResponse>> GetFleetHosLogsAsyncWithHttpInfo (string accessToken, InlineObject8 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosLogs");

            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetHosLogs");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = hosLogsParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<HosLogsResponse>("/fleet/hos_logs", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetHosLogs", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<HosLogsSummaryResponse> localVarResponse = GetFleetHosLogsSummaryWithHttpInfo(accessToken, hosLogsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/hos_logs_summary Get the current HOS status for all drivers in the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>ApiResponse of HosLogsSummaryResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< HosLogsSummaryResponse > GetFleetHosLogsSummaryWithHttpInfo (string accessToken, InlineObject9 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosLogsSummary");

            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetHosLogsSummary");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = hosLogsParam;


            // make the HTTP request

            var response = this.Client.Post< HosLogsSummaryResponse >("/fleet/hos_logs_summary", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetHosLogsSummary", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<HosLogsSummaryResponse> localVarResponse = await GetFleetHosLogsSummaryAsyncWithHttpInfo(accessToken, hosLogsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/hos_logs_summary Get the current HOS status for all drivers in the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>Task of ApiResponse (HosLogsSummaryResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<HosLogsSummaryResponse>> GetFleetHosLogsSummaryAsyncWithHttpInfo (string accessToken, InlineObject9 hosLogsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetHosLogsSummary");

            // verify the required parameter 'hosLogsParam' is set
            if (hosLogsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'hosLogsParam' when calling FleetApi->GetFleetHosLogsSummary");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = hosLogsParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<HosLogsSummaryResponse>("/fleet/hos_logs_summary", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetHosLogsSummary", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2003> localVarResponse = GetFleetLocationsWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/locations Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2003</returns>
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2003 > GetFleetLocationsWithHttpInfo (string accessToken, InlineObject11 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetLocations");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->GetFleetLocations");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupParam;


            // make the HTTP request

            var response = this.Client.Post< InlineResponse2003 >("/fleet/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetLocations", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2003> localVarResponse = await GetFleetLocationsAsyncWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/locations Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2003)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2003>> GetFleetLocationsAsyncWithHttpInfo (string accessToken, InlineObject11 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetLocations");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->GetFleetLocations");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<InlineResponse2003>("/fleet/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetLocations", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2004> localVarResponse = GetFleetMaintenanceListWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/maintenance/list Get list of the vehicles with any engine faults or check light data.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2004</returns>
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2004 > GetFleetMaintenanceListWithHttpInfo (string accessToken, InlineObject13 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetMaintenanceList");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->GetFleetMaintenanceList");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupParam;


            // make the HTTP request

            var response = this.Client.Post< InlineResponse2004 >("/fleet/maintenance/list", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetMaintenanceList", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2004> localVarResponse = await GetFleetMaintenanceListAsyncWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/maintenance/list Get list of the vehicles with any engine faults or check light data.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2004)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2004>> GetFleetMaintenanceListAsyncWithHttpInfo (string accessToken, InlineObject13 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetMaintenanceList");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->GetFleetMaintenanceList");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<InlineResponse2004>("/fleet/maintenance/list", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetMaintenanceList", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<TripResponse> localVarResponse = GetFleetTripsWithHttpInfo(accessToken, tripsParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/trips Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>ApiResponse of TripResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< TripResponse > GetFleetTripsWithHttpInfo (string accessToken, InlineObject15 tripsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetTrips");

            // verify the required parameter 'tripsParam' is set
            if (tripsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tripsParam' when calling FleetApi->GetFleetTrips");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = tripsParam;


            // make the HTTP request

            var response = this.Client.Post< TripResponse >("/fleet/trips", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetTrips", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<TripResponse> localVarResponse = await GetFleetTripsAsyncWithHttpInfo(accessToken, tripsParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/trips Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>Task of ApiResponse (TripResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<TripResponse>> GetFleetTripsAsyncWithHttpInfo (string accessToken, InlineObject15 tripsParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetTrips");

            // verify the required parameter 'tripsParam' is set
            if (tripsParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tripsParam' when calling FleetApi->GetFleetTrips");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = tripsParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<TripResponse>("/fleet/trips", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetTrips", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<FleetVehicleResponse> localVarResponse = GetFleetVehicleWithHttpInfo(accessToken, vehicleIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Gets a specific vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of FleetVehicleResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< FleetVehicleResponse > GetFleetVehicleWithHttpInfo (string accessToken, string vehicleIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetVehicle");

            // verify the required parameter 'vehicleIdOrExternalId' is set
            if (vehicleIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->GetFleetVehicle");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleIdOrExternalId != null)
                requestOptions.PathParameters.Add("vehicle_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< FleetVehicleResponse >("/fleet/vehicles/{vehicle_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetVehicle", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<FleetVehicleResponse> localVarResponse = await GetFleetVehicleAsyncWithHttpInfo(accessToken, vehicleIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Gets a specific vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (FleetVehicleResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<FleetVehicleResponse>> GetFleetVehicleAsyncWithHttpInfo (string accessToken, string vehicleIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetFleetVehicle");

            // verify the required parameter 'vehicleIdOrExternalId' is set
            if (vehicleIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->GetFleetVehicle");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleIdOrExternalId != null)
                requestOptions.PathParameters.Add("vehicle_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<FleetVehicleResponse>("/fleet/vehicles/{vehicle_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetFleetVehicle", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /addresses/{addressId} Fetch an address by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Address</returns>
        public Address GetOrganizationAddress (string accessToken, long addressId)
        {
             Org.OpenAPITools.Client.ApiResponse<Address> localVarResponse = GetOrganizationAddressWithHttpInfo(accessToken, addressId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /addresses/{addressId} Fetch an address by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>ApiResponse of Address</returns>
        public Org.OpenAPITools.Client.ApiResponse< Address > GetOrganizationAddressWithHttpInfo (string accessToken, long addressId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationAddress");

            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->GetOrganizationAddress");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (addressId != null)
                requestOptions.PathParameters.Add("addressId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(addressId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< Address >("/addresses/{addressId}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetOrganizationAddress", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /addresses/{addressId} Fetch an address by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of Address</returns>
        public async System.Threading.Tasks.Task<Address> GetOrganizationAddressAsync (string accessToken, long addressId)
        {
             Org.OpenAPITools.Client.ApiResponse<Address> localVarResponse = await GetOrganizationAddressAsyncWithHttpInfo(accessToken, addressId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /addresses/{addressId} Fetch an address by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Task of ApiResponse (Address)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Address>> GetOrganizationAddressAsyncWithHttpInfo (string accessToken, long addressId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationAddress");

            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->GetOrganizationAddress");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (addressId != null)
                requestOptions.PathParameters.Add("addressId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(addressId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<Address>("/addresses/{addressId}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetOrganizationAddress", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /addresses Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;Address&gt;</returns>
        public List<Address> GetOrganizationAddresses (string accessToken)
        {
             Org.OpenAPITools.Client.ApiResponse<List<Address>> localVarResponse = GetOrganizationAddressesWithHttpInfo(accessToken);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /addresses Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>ApiResponse of List&lt;Address&gt;</returns>
        public Org.OpenAPITools.Client.ApiResponse< List<Address> > GetOrganizationAddressesWithHttpInfo (string accessToken)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationAddresses");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<Address> >("/addresses", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetOrganizationAddresses", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /addresses Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of List&lt;Address&gt;</returns>
        public async System.Threading.Tasks.Task<List<Address>> GetOrganizationAddressesAsync (string accessToken)
        {
             Org.OpenAPITools.Client.ApiResponse<List<Address>> localVarResponse = await GetOrganizationAddressesAsyncWithHttpInfo(accessToken);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /addresses Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of ApiResponse (List&lt;Address&gt;)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<Address>>> GetOrganizationAddressesAsyncWithHttpInfo (string accessToken)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationAddresses");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<Address>>("/addresses", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetOrganizationAddresses", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /contacts/{contact_id} Fetch a contact by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Contact</returns>
        public Contact GetOrganizationContact (string accessToken, long contactId)
        {
             Org.OpenAPITools.Client.ApiResponse<Contact> localVarResponse = GetOrganizationContactWithHttpInfo(accessToken, contactId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /contacts/{contact_id} Fetch a contact by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>ApiResponse of Contact</returns>
        public Org.OpenAPITools.Client.ApiResponse< Contact > GetOrganizationContactWithHttpInfo (string accessToken, long contactId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationContact");

            // verify the required parameter 'contactId' is set
            if (contactId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'contactId' when calling FleetApi->GetOrganizationContact");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (contactId != null)
                requestOptions.PathParameters.Add("contact_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(contactId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< Contact >("/contacts/{contact_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetOrganizationContact", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /contacts/{contact_id} Fetch a contact by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Task of Contact</returns>
        public async System.Threading.Tasks.Task<Contact> GetOrganizationContactAsync (string accessToken, long contactId)
        {
             Org.OpenAPITools.Client.ApiResponse<Contact> localVarResponse = await GetOrganizationContactAsyncWithHttpInfo(accessToken, contactId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /contacts/{contact_id} Fetch a contact by its id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Task of ApiResponse (Contact)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Contact>> GetOrganizationContactAsyncWithHttpInfo (string accessToken, long contactId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetOrganizationContact");

            // verify the required parameter 'contactId' is set
            if (contactId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'contactId' when calling FleetApi->GetOrganizationContact");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (contactId != null)
                requestOptions.PathParameters.Add("contact_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(contactId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<Contact>("/contacts/{contact_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetOrganizationContact", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>VehicleHarshEventResponse</returns>
        public VehicleHarshEventResponse GetVehicleHarshEvent (long vehicleId, string accessToken, long timestamp)
        {
             Org.OpenAPITools.Client.ApiResponse<VehicleHarshEventResponse> localVarResponse = GetVehicleHarshEventWithHttpInfo(vehicleId, accessToken, timestamp);
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
        public Org.OpenAPITools.Client.ApiResponse< VehicleHarshEventResponse > GetVehicleHarshEventWithHttpInfo (long vehicleId, string accessToken, long timestamp)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleHarshEvent");

            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleHarshEvent");

            // verify the required parameter 'timestamp' is set
            if (timestamp == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'timestamp' when calling FleetApi->GetVehicleHarshEvent");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicleId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (timestamp != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "timestamp", timestamp))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< VehicleHarshEventResponse >("/fleet/vehicles/{vehicleId}/safety/harsh_event", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehicleHarshEvent", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of VehicleHarshEventResponse</returns>
        public async System.Threading.Tasks.Task<VehicleHarshEventResponse> GetVehicleHarshEventAsync (long vehicleId, string accessToken, long timestamp)
        {
             Org.OpenAPITools.Client.ApiResponse<VehicleHarshEventResponse> localVarResponse = await GetVehicleHarshEventAsyncWithHttpInfo(vehicleId, accessToken, timestamp);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<VehicleHarshEventResponse>> GetVehicleHarshEventAsyncWithHttpInfo (long vehicleId, string accessToken, long timestamp)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleHarshEvent");

            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleHarshEvent");

            // verify the required parameter 'timestamp' is set
            if (timestamp == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'timestamp' when calling FleetApi->GetVehicleHarshEvent");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicleId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (timestamp != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "timestamp", timestamp))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<VehicleHarshEventResponse>("/fleet/vehicles/{vehicleId}/safety/harsh_event", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehicleHarshEvent", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public List<FleetVehicleLocation> GetVehicleLocations (string accessToken, long vehicleId, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<List<FleetVehicleLocation>> localVarResponse = GetVehicleLocationsWithHttpInfo(accessToken, vehicleId, startMs, endMs);
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
        public Org.OpenAPITools.Client.ApiResponse< List<FleetVehicleLocation> > GetVehicleLocationsWithHttpInfo (string accessToken, long vehicleId, long startMs, long endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleLocations");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleLocations");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleLocations");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleLocations");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<FleetVehicleLocation> >("/fleet/vehicles/{vehicle_id}/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehicleLocations", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<List<FleetVehicleLocation>> GetVehicleLocationsAsync (string accessToken, long vehicleId, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<List<FleetVehicleLocation>> localVarResponse = await GetVehicleLocationsAsyncWithHttpInfo(accessToken, vehicleId, startMs, endMs);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<FleetVehicleLocation>>> GetVehicleLocationsAsyncWithHttpInfo (string accessToken, long vehicleId, long startMs, long endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleLocations");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleLocations");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleLocations");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleLocations");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<FleetVehicleLocation>>("/fleet/vehicles/{vehicle_id}/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehicleLocations", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public VehicleSafetyScoreResponse GetVehicleSafetyScore (long vehicleId, string accessToken, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<VehicleSafetyScoreResponse> localVarResponse = GetVehicleSafetyScoreWithHttpInfo(vehicleId, accessToken, startMs, endMs);
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
        public Org.OpenAPITools.Client.ApiResponse< VehicleSafetyScoreResponse > GetVehicleSafetyScoreWithHttpInfo (long vehicleId, string accessToken, long startMs, long endMs)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleSafetyScore");

            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleSafetyScore");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleSafetyScore");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleSafetyScore");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicleId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< VehicleSafetyScoreResponse >("/fleet/vehicles/{vehicleId}/safety/score", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehicleSafetyScore", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<VehicleSafetyScoreResponse> GetVehicleSafetyScoreAsync (long vehicleId, string accessToken, long startMs, long endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<VehicleSafetyScoreResponse> localVarResponse = await GetVehicleSafetyScoreAsyncWithHttpInfo(vehicleId, accessToken, startMs, endMs);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<VehicleSafetyScoreResponse>> GetVehicleSafetyScoreAsyncWithHttpInfo (long vehicleId, string accessToken, long startMs, long endMs)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling FleetApi->GetVehicleSafetyScore");

            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleSafetyScore");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleSafetyScore");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleSafetyScore");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicleId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<VehicleSafetyScoreResponse>("/fleet/vehicles/{vehicleId}/safety/score", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehicleSafetyScore", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public InlineResponse2005 GetVehicleStats (string accessToken, int startMs, int endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2005> localVarResponse = GetVehicleStatsWithHttpInfo(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
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
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2005 > GetVehicleStatsWithHttpInfo (string accessToken, int startMs, int endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleStats");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleStats");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleStats");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (series != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "series", series))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (tagIds != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "tagIds", tagIds))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startingAfter != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startingAfter", startingAfter))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endingBefore != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endingBefore", endingBefore))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (limit != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "limit", limit))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< InlineResponse2005 >("/fleet/vehicles/stats", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehicleStats", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<InlineResponse2005> GetVehicleStatsAsync (string accessToken, int startMs, int endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2005> localVarResponse = await GetVehicleStatsAsyncWithHttpInfo(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2005>> GetVehicleStatsAsyncWithHttpInfo (string accessToken, int startMs, int endMs, string series = null, string tagIds = null, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehicleStats");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehicleStats");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehicleStats");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (series != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "series", series))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (tagIds != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "tagIds", tagIds))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startingAfter != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startingAfter", startingAfter))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endingBefore != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endingBefore", endingBefore))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (limit != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "limit", limit))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<InlineResponse2005>("/fleet/vehicles/stats", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehicleStats", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/vehicles/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>List&lt;Object&gt;</returns>
        public List<Object> GetVehiclesLocations (string accessToken, int startMs, int endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<List<Object>> localVarResponse = GetVehiclesLocationsWithHttpInfo(accessToken, startMs, endMs);
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
        public Org.OpenAPITools.Client.ApiResponse< List<Object> > GetVehiclesLocationsWithHttpInfo (string accessToken, int startMs, int endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehiclesLocations");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehiclesLocations");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehiclesLocations");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<Object> >("/fleet/vehicles/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehiclesLocations", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/vehicles/locations Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>Task of List&lt;Object&gt;</returns>
        public async System.Threading.Tasks.Task<List<Object>> GetVehiclesLocationsAsync (string accessToken, int startMs, int endMs)
        {
             Org.OpenAPITools.Client.ApiResponse<List<Object>> localVarResponse = await GetVehiclesLocationsAsyncWithHttpInfo(accessToken, startMs, endMs);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<Object>>> GetVehiclesLocationsAsyncWithHttpInfo (string accessToken, int startMs, int endMs)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->GetVehiclesLocations");

            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'startMs' when calling FleetApi->GetVehiclesLocations");

            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'endMs' when calling FleetApi->GetVehiclesLocations");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<Object>>("/fleet/vehicles/locations", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetVehiclesLocations", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /contacts Fetch all contacts for the organization.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;Contact&gt;</returns>
        public List<Contact> ListContacts (string accessToken)
        {
             Org.OpenAPITools.Client.ApiResponse<List<Contact>> localVarResponse = ListContactsWithHttpInfo(accessToken);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /contacts Fetch all contacts for the organization.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>ApiResponse of List&lt;Contact&gt;</returns>
        public Org.OpenAPITools.Client.ApiResponse< List<Contact> > ListContactsWithHttpInfo (string accessToken)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ListContacts");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<Contact> >("/contacts", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ListContacts", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /contacts Fetch all contacts for the organization.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of List&lt;Contact&gt;</returns>
        public async System.Threading.Tasks.Task<List<Contact>> ListContactsAsync (string accessToken)
        {
             Org.OpenAPITools.Client.ApiResponse<List<Contact>> localVarResponse = await ListContactsAsyncWithHttpInfo(accessToken);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /contacts Fetch all contacts for the organization.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>Task of ApiResponse (List&lt;Contact&gt;)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<Contact>>> ListContactsAsyncWithHttpInfo (string accessToken)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ListContacts");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<Contact>>("/contacts", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ListContacts", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2002> localVarResponse = ListFleetWithHttpInfo(accessToken, groupParam, startingAfter, endingBefore, limit);
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
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2002 > ListFleetWithHttpInfo (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ListFleet");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->ListFleet");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startingAfter != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startingAfter", startingAfter))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endingBefore != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endingBefore", endingBefore))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (limit != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "limit", limit))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupParam;


            // make the HTTP request

            var response = this.Client.Post< InlineResponse2002 >("/fleet/list", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ListFleet", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2002> localVarResponse = await ListFleetAsyncWithHttpInfo(accessToken, groupParam, startingAfter, endingBefore, limit);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2002>> ListFleetAsyncWithHttpInfo (string accessToken, InlineObject10 groupParam, string startingAfter = null, string endingBefore = null, long? limit = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ListFleet");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling FleetApi->ListFleet");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startingAfter != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startingAfter", startingAfter))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endingBefore != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endingBefore", endingBefore))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (limit != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "limit", limit))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<InlineResponse2002>("/fleet/list", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ListFleet", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<FleetVehicleResponse> localVarResponse = PatchFleetVehicleWithHttpInfo(accessToken, vehicleIdOrExternalId, data);
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
        public Org.OpenAPITools.Client.ApiResponse< FleetVehicleResponse > PatchFleetVehicleWithHttpInfo (string accessToken, string vehicleIdOrExternalId, InlineObject16 data)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->PatchFleetVehicle");

            // verify the required parameter 'vehicleIdOrExternalId' is set
            if (vehicleIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->PatchFleetVehicle");

            // verify the required parameter 'data' is set
            if (data == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'data' when calling FleetApi->PatchFleetVehicle");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json", 
                "application/merge-patch+json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleIdOrExternalId != null)
                requestOptions.PathParameters.Add("vehicle_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = data;


            // make the HTTP request

            var response = this.Client.Patch< FleetVehicleResponse >("/fleet/vehicles/{vehicle_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("PatchFleetVehicle", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<FleetVehicleResponse> localVarResponse = await PatchFleetVehicleAsyncWithHttpInfo(accessToken, vehicleIdOrExternalId, data);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<FleetVehicleResponse>> PatchFleetVehicleAsyncWithHttpInfo (string accessToken, string vehicleIdOrExternalId, InlineObject16 data)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->PatchFleetVehicle");

            // verify the required parameter 'vehicleIdOrExternalId' is set
            if (vehicleIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->PatchFleetVehicle");

            // verify the required parameter 'data' is set
            if (data == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'data' when calling FleetApi->PatchFleetVehicle");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json", 
                "application/merge-patch+json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleIdOrExternalId != null)
                requestOptions.PathParameters.Add("vehicle_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = data;


            // make the HTTP request

            var response = await this.AsynchronousClient.PatchAsync<FleetVehicleResponse>("/fleet/vehicles/{vehicle_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("PatchFleetVehicle", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = ReactivateDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
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
        public Org.OpenAPITools.Client.ApiResponse< Driver > ReactivateDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ReactivateDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->ReactivateDriverById");

            // verify the required parameter 'reactivateDriverParam' is set
            if (reactivateDriverParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'reactivateDriverParam' when calling FleetApi->ReactivateDriverById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = reactivateDriverParam;


            // make the HTTP request

            var response = this.Client.Put< Driver >("/fleet/drivers/inactive/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ReactivateDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = await ReactivateDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Driver>> ReactivateDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->ReactivateDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling FleetApi->ReactivateDriverById");

            // verify the required parameter 'reactivateDriverParam' is set
            if (reactivateDriverParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'reactivateDriverParam' when calling FleetApi->ReactivateDriverById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = reactivateDriverParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PutAsync<Driver>("/fleet/drivers/inactive/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ReactivateDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute UpdateDispatchRouteById (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = UpdateDispatchRouteByIdWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
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
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > UpdateDispatchRouteByIdWithHttpInfo (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->UpdateDispatchRouteById");

            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling FleetApi->UpdateDispatchRouteById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = updateDispatchRouteParams;


            // make the HTTP request

            var response = this.Client.Put< DispatchRoute >("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> UpdateDispatchRouteByIdAsync (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await UpdateDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> UpdateDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling FleetApi->UpdateDispatchRouteById");

            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling FleetApi->UpdateDispatchRouteById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = updateDispatchRouteParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PutAsync<DispatchRoute>("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /addresses/{addressId} Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns></returns>
        public void UpdateOrganizationAddress (string accessToken, long addressId, InlineObject1 address)
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
        public Org.OpenAPITools.Client.ApiResponse<Object> UpdateOrganizationAddressWithHttpInfo (string accessToken, long addressId, InlineObject1 address)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateOrganizationAddress");

            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->UpdateOrganizationAddress");

            // verify the required parameter 'address' is set
            if (address == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'address' when calling FleetApi->UpdateOrganizationAddress");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (addressId != null)
                requestOptions.PathParameters.Add("addressId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(addressId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = address;


            // make the HTTP request

            var response = this.Client.Patch<Object>("/addresses/{addressId}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateOrganizationAddress", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /addresses/{addressId} Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task UpdateOrganizationAddressAsync (string accessToken, long addressId, InlineObject1 address)
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> UpdateOrganizationAddressAsyncWithHttpInfo (string accessToken, long addressId, InlineObject1 address)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateOrganizationAddress");

            // verify the required parameter 'addressId' is set
            if (addressId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'addressId' when calling FleetApi->UpdateOrganizationAddress");

            // verify the required parameter 'address' is set
            if (address == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'address' when calling FleetApi->UpdateOrganizationAddress");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (addressId != null)
                requestOptions.PathParameters.Add("addressId", Org.OpenAPITools.Client.ClientUtils.ParameterToString(addressId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = address;


            // make the HTTP request

            var response = await this.AsynchronousClient.PatchAsync<Object>("/addresses/{addressId}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateOrganizationAddress", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public Org.OpenAPITools.Client.ApiResponse<Object> UpdateVehiclesWithHttpInfo (string accessToken, InlineObject14 vehicleUpdateParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateVehicles");

            // verify the required parameter 'vehicleUpdateParam' is set
            if (vehicleUpdateParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleUpdateParam' when calling FleetApi->UpdateVehicles");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = vehicleUpdateParam;


            // make the HTTP request

            var response = this.Client.Post<Object>("/fleet/set_data", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateVehicles", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> UpdateVehiclesAsyncWithHttpInfo (string accessToken, InlineObject14 vehicleUpdateParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling FleetApi->UpdateVehicles");

            // verify the required parameter 'vehicleUpdateParam' is set
            if (vehicleUpdateParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleUpdateParam' when calling FleetApi->UpdateVehicles");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = vehicleUpdateParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Object>("/fleet/set_data", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateVehicles", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
