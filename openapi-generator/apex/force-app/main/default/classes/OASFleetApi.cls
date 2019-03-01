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

public class OASFleetApi {
    OASClient client;

    public OASFleetApi(OASClient client) {
        this.client = client;
    }

    public OASFleetApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * /fleet/add_address
     * This method adds an address book entry to the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param addressParam  (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void addFleetAddress(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('addressParam'), 'addressParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'POST', '/fleet/add_address',
            (OASInlineObject2) params.get('addressParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
    /**
     * /addresses
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token. (required)
     * @param addresses  (required)
     * @return List<OASAddress>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASAddress> addOrganizationAddresses(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('addresses'), 'addresses');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASAddress>) client.invoke(
            'POST', '/addresses',
            (OASInlineObject) params.get('addresses'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            List<OASAddress>.class
        );
    }
    /**
     * /fleet/dispatch/routes
     * Create a new dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param createDispatchRouteParams  (required)
     * @return OASDispatchRoute
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDispatchRoute createDispatchRoute(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('createDispatchRouteParams'), 'createDispatchRouteParams');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDispatchRoute) client.invoke(
            'POST', '/fleet/dispatch/routes',
            (OASDispatchRouteCreate) params.get('createDispatchRouteParams'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDispatchRoute.class
        );
    }
    /**
     * /fleet/drivers/create
     * Create a new driver.
     * @param accessToken Samsara API access token. (required)
     * @param createDriverParam Driver creation body (required)
     * @return OASDriver
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriver createDriver(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('createDriverParam'), 'createDriverParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriver) client.invoke(
            'POST', '/fleet/drivers/create',
            (OASDriverForCreate) params.get('createDriverParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDriver.class
        );
    }
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the driver with driver_id.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @return OASDispatchRoute
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDispatchRoute createDriverDispatchRoute(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverId'), 'driverId');
        client.assertNotNull(params.get('createDispatchRouteParams'), 'createDispatchRouteParams');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDispatchRoute) client.invoke(
            'POST', '/fleet/drivers/{driver_id}/dispatch/routes',
            (OASDispatchRouteCreate) params.get('createDispatchRouteParams'),
            query, form,
            new Map<String, Object>{
                'driver_id' => (Long) params.get('driverId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDispatchRoute.class
        );
    }
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     * Create a driver document for the given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver for whom the document is created. (required)
     * @param createDocumentParams To create a document for a given document type, the document type\&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field\&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     * @return OASDocument
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDocument createDriverDocument(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverId'), 'driverId');
        client.assertNotNull(params.get('createDocumentParams'), 'createDocumentParams');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDocument) client.invoke(
            'POST', '/fleet/drivers/{driver_id}/documents',
            (OASDocumentCreate) params.get('createDocumentParams'),
            query, form,
            new Map<String, Object>{
                'driver_id' => (Long) params.get('driverId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDocument.class
        );
    }
    /**
     * /fleet/maintenance/dvirs
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam  (required)
     * @return OASDvirBase
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDvirBase createDvir(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('createDvirParam'), 'createDvirParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDvirBase) client.invoke(
            'POST', '/fleet/maintenance/dvirs',
            (OASInlineObject12) params.get('createDvirParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDvirBase.class
        );
    }
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @return OASDispatchRoute
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDispatchRoute createVehicleDispatchRoute(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('vehicleId'), 'vehicleId');
        client.assertNotNull(params.get('createDispatchRouteParams'), 'createDispatchRouteParams');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDispatchRoute) client.invoke(
            'POST', '/fleet/vehicles/{vehicle_id}/dispatch/routes',
            (OASDispatchRouteCreate) params.get('createDispatchRouteParams'),
            query, form,
            new Map<String, Object>{
                'vehicle_id' => (Long) params.get('vehicleId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDispatchRoute.class
        );
    }
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void deactivateDriver(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverIdOrExternalId'), 'driverIdOrExternalId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'DELETE', '/fleet/drivers/{driver_id_or_external_id}', '',
            query, form,
            new Map<String, Object>{
                'driver_id_or_external_id' => (String) params.get('driverIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            null
        );
    }
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void deleteDispatchRouteById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('routeId'), 'routeId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'DELETE', '/fleet/dispatch/routes/{route_id}', '',
            query, form,
            new Map<String, Object>{
                'route_id' => (Long) params.get('routeId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            null
        );
    }
    /**
     * /addresses/{addressId}
     * Delete an address.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void deleteOrganizationAddress(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('addressId'), 'addressId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'DELETE', '/addresses/{addressId}', '',
            query, form,
            new Map<String, Object>{
                'addressId' => (Long) params.get('addressId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            null
        );
    }
    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return List<OASDispatchRoute>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASDispatchRoute> fetchAllDispatchRoutes(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('group_id', (Long) params.get('groupId')));
        query.addAll(client.makeParam('end_time', (Long) params.get('endTime')));
        query.addAll(client.makeParam('duration', (Long) params.get('duration')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASDispatchRoute>) client.invoke(
            'GET', '/fleet/dispatch/routes', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASDispatchRoute>.class
        );
    }
    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
     * @return OASAllRouteJobUpdates
     * @throws OAS.ApiException if fails to make API call
     */
    public OASAllRouteJobUpdates fetchAllRouteJobUpdates(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('group_id', (Long) params.get('groupId')));
        query.addAll(client.makeParam('sequence_id', (String) params.get('sequenceId')));
        query.addAll(client.makeParam('include', (String) params.get('include')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASAllRouteJobUpdates) client.invoke(
            'GET', '/fleet/dispatch/routes/job_updates', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASAllRouteJobUpdates.class
        );
    }
    /**
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return OASInlineResponse2001
     * @throws OAS.ApiException if fails to make API call
     */
    public OASInlineResponse2001 getAllAssetCurrentLocations(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('group_id', (Long) params.get('groupId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASInlineResponse2001) client.invoke(
            'GET', '/fleet/assets/locations', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASInlineResponse2001.class
        );
    }
    /**
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return OASInlineResponse200
     * @throws OAS.ApiException if fails to make API call
     */
    public OASInlineResponse200 getAllAssets(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('group_id', (Long) params.get('groupId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASInlineResponse200) client.invoke(
            'GET', '/fleet/assets', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASInlineResponse200.class
        );
    }
    /**
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return List<OASDriver>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASDriver> getAllDeactivatedDrivers(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('group_id', (Long) params.get('groupId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASDriver>) client.invoke(
            'GET', '/fleet/drivers/inactive', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASDriver>.class
        );
    }
    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return List<Object>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<Object> getAssetLocation(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('assetId'), 'assetId');
        client.assertNotNull(params.get('startMs'), 'startMs');
        client.assertNotNull(params.get('endMs'), 'endMs');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('startMs', (Long) params.get('startMs')));
        query.addAll(client.makeParam('endMs', (Long) params.get('endMs')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<Object>) client.invoke(
            'GET', '/fleet/assets/{asset_id}/locations', '',
            query, form,
            new Map<String, Object>{
                'asset_id' => (Long) params.get('assetId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<Object>.class
        );
    }
    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return OASAssetReeferResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASAssetReeferResponse getAssetReefer(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('assetId'), 'assetId');
        client.assertNotNull(params.get('startMs'), 'startMs');
        client.assertNotNull(params.get('endMs'), 'endMs');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('startMs', (Long) params.get('startMs')));
        query.addAll(client.makeParam('endMs', (Long) params.get('endMs')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASAssetReeferResponse) client.invoke(
            'GET', '/fleet/assets/{asset_id}/reefer', '',
            query, form,
            new Map<String, Object>{
                'asset_id' => (Long) params.get('assetId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASAssetReeferResponse.class
        );
    }
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return OASDriver
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriver getDeactivatedDriverById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverIdOrExternalId'), 'driverIdOrExternalId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriver) client.invoke(
            'GET', '/fleet/drivers/inactive/{driver_id_or_external_id}', '',
            query, form,
            new Map<String, Object>{
                'driver_id_or_external_id' => (String) params.get('driverIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASDriver.class
        );
    }
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @return OASDispatchRoute
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDispatchRoute getDispatchRouteById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('routeId'), 'routeId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDispatchRoute) client.invoke(
            'GET', '/fleet/dispatch/routes/{route_id}', '',
            query, form,
            new Map<String, Object>{
                'route_id' => (Long) params.get('routeId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASDispatchRoute.class
        );
    }
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the route with history. (required)
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     * @return OASDispatchRouteHistory
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDispatchRouteHistory getDispatchRouteHistory(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('routeId'), 'routeId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('start_time', (Long) params.get('startTime')));
        query.addAll(client.makeParam('end_time', (Long) params.get('endTime')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDispatchRouteHistory) client.invoke(
            'GET', '/fleet/dispatch/routes/{route_id}/history', '',
            query, form,
            new Map<String, Object>{
                'route_id' => (Long) params.get('routeId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASDispatchRouteHistory.class
        );
    }
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return List<OASDispatchRoute>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASDispatchRoute> getDispatchRoutesByDriverId(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverId'), 'driverId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('end_time', (Long) params.get('endTime')));
        query.addAll(client.makeParam('duration', (Long) params.get('duration')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASDispatchRoute>) client.invoke(
            'GET', '/fleet/drivers/{driver_id}/dispatch/routes', '',
            query, form,
            new Map<String, Object>{
                'driver_id' => (Long) params.get('driverId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASDispatchRoute>.class
        );
    }
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return List<OASDispatchRoute>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASDispatchRoute> getDispatchRoutesByVehicleId(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('vehicleId'), 'vehicleId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('end_time', (Long) params.get('endTime')));
        query.addAll(client.makeParam('duration', (Long) params.get('duration')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASDispatchRoute>) client.invoke(
            'GET', '/fleet/vehicles/{vehicle_id}/dispatch/routes', '',
            query, form,
            new Map<String, Object>{
                'vehicle_id' => (Long) params.get('vehicleId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASDispatchRoute>.class
        );
    }
    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return OASDriver
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriver getDriverById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverIdOrExternalId'), 'driverIdOrExternalId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriver) client.invoke(
            'GET', '/fleet/drivers/{driver_id_or_external_id}', '',
            query, form,
            new Map<String, Object>{
                'driver_id_or_external_id' => (String) params.get('driverIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASDriver.class
        );
    }
    /**
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     * @return List<OASDocumentType>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASDocumentType> getDriverDocumentTypesByOrgId() {
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASDocumentType>) client.invoke(
            'GET', '/fleet/drivers/document_types', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASDocumentType>.class
        );
    }
    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @return List<OASDocument>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASDocument> getDriverDocumentsByOrgId(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('endMs', (Long) params.get('endMs')));
        query.addAll(client.makeParam('durationMs', (Long) params.get('durationMs')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASDocument>) client.invoke(
            'GET', '/fleet/drivers/documents', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASDocument>.class
        );
    }
    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return OASDriverSafetyScoreResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriverSafetyScoreResponse getDriverSafetyScore(Map<String, Object> params) {
        client.assertNotNull(params.get('driverId'), 'driverId');
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('startMs'), 'startMs');
        client.assertNotNull(params.get('endMs'), 'endMs');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('startMs', (Long) params.get('startMs')));
        query.addAll(client.makeParam('endMs', (Long) params.get('endMs')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriverSafetyScoreResponse) client.invoke(
            'GET', '/fleet/drivers/{driverId}/safety/score', '',
            query, form,
            new Map<String, Object>{
                'driverId' => (Long) params.get('driverId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASDriverSafetyScoreResponse.class
        );
    }
    /**
     * /fleet/maintenance/dvirs
     * Get DVIRs for the org within provided time constraints
     * @param accessToken Samsara API access token. (required)
     * @param endMs time in millis until the last dvir log. (required)
     * @param durationMs time in millis which corresponds to the duration before the end_ms. (required)
     * @param groupId Group ID to query. (optional)
     * @return OASDvirListResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDvirListResponse getDvirs(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('endMs'), 'endMs');
        client.assertNotNull(params.get('durationMs'), 'durationMs');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('end_ms', (Integer) params.get('endMs')));
        query.addAll(client.makeParam('duration_ms', (Integer) params.get('durationMs')));
        query.addAll(client.makeParam('group_id', (Integer) params.get('groupId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDvirListResponse) client.invoke(
            'GET', '/fleet/maintenance/dvirs', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASDvirListResponse.class
        );
    }
    /**
     * /fleet/drivers
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @return OASDriversResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriversResponse getFleetDrivers(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('groupDriversParam'), 'groupDriversParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriversResponse) client.invoke(
            'POST', '/fleet/drivers',
            (OASInlineObject3) params.get('groupDriversParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDriversResponse.class
        );
    }
    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * Get summarized daily HOS charts for a specified driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with HOS logs. (required)
     * @param hosLogsParam  (required)
     * @return OASDriverDailyLogResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriverDailyLogResponse getFleetDriversHosDailyLogs(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverId'), 'driverId');
        client.assertNotNull(params.get('hosLogsParam'), 'hosLogsParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriverDailyLogResponse) client.invoke(
            'POST', '/fleet/drivers/{driver_id}/hos_daily_logs',
            (OASInlineObject6) params.get('hosLogsParam'),
            query, form,
            new Map<String, Object>{
                'driver_id' => (Long) params.get('driverId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDriverDailyLogResponse.class
        );
    }
    /**
     * /fleet/drivers/summary
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam  (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @return OASDriversSummaryResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriversSummaryResponse getFleetDriversSummary(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driversSummaryParam'), 'driversSummaryParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('snap_to_day_bounds', (Boolean) params.get('snapToDayBounds')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriversSummaryResponse) client.invoke(
            'POST', '/fleet/drivers/summary',
            (OASInlineObject5) params.get('driversSummaryParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDriversSummaryResponse.class
        );
    }
    /**
     * /fleet/hos_authentication_logs
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @return OASHosAuthenticationLogsResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASHosAuthenticationLogsResponse getFleetHosAuthenticationLogs(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('hosAuthenticationLogsParam'), 'hosAuthenticationLogsParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASHosAuthenticationLogsResponse) client.invoke(
            'POST', '/fleet/hos_authentication_logs',
            (OASInlineObject7) params.get('hosAuthenticationLogsParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASHosAuthenticationLogsResponse.class
        );
    }
    /**
     * /fleet/hos_logs
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return OASHosLogsResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASHosLogsResponse getFleetHosLogs(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('hosLogsParam'), 'hosLogsParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASHosLogsResponse) client.invoke(
            'POST', '/fleet/hos_logs',
            (OASInlineObject8) params.get('hosLogsParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASHosLogsResponse.class
        );
    }
    /**
     * /fleet/hos_logs_summary
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return OASHosLogsSummaryResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASHosLogsSummaryResponse getFleetHosLogsSummary(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('hosLogsParam'), 'hosLogsParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASHosLogsSummaryResponse) client.invoke(
            'POST', '/fleet/hos_logs_summary',
            (OASInlineObject9) params.get('hosLogsParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASHosLogsSummaryResponse.class
        );
    }
    /**
     * /fleet/locations
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return OASInlineResponse2003
     * @throws OAS.ApiException if fails to make API call
     */
    public OASInlineResponse2003 getFleetLocations(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('groupParam'), 'groupParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASInlineResponse2003) client.invoke(
            'POST', '/fleet/locations',
            (OASInlineObject11) params.get('groupParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASInlineResponse2003.class
        );
    }
    /**
     * /fleet/maintenance/list
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return OASInlineResponse2004
     * @throws OAS.ApiException if fails to make API call
     */
    public OASInlineResponse2004 getFleetMaintenanceList(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('groupParam'), 'groupParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASInlineResponse2004) client.invoke(
            'POST', '/fleet/maintenance/list',
            (OASInlineObject13) params.get('groupParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASInlineResponse2004.class
        );
    }
    /**
     * /fleet/trips
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam  (required)
     * @return OASTripResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASTripResponse getFleetTrips(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('tripsParam'), 'tripsParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASTripResponse) client.invoke(
            'POST', '/fleet/trips',
            (OASInlineObject15) params.get('tripsParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASTripResponse.class
        );
    }
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Gets a specific vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @return OASFleetVehicleResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASFleetVehicleResponse getFleetVehicle(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('vehicleIdOrExternalId'), 'vehicleIdOrExternalId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASFleetVehicleResponse) client.invoke(
            'GET', '/fleet/vehicles/{vehicle_id_or_external_id}', '',
            query, form,
            new Map<String, Object>{
                'vehicle_id_or_external_id' => (String) params.get('vehicleIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASFleetVehicleResponse.class
        );
    }
    /**
     * /addresses/{addressId}
     * Fetch an address by its id.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @return OASAddress
     * @throws OAS.ApiException if fails to make API call
     */
    public OASAddress getOrganizationAddress(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('addressId'), 'addressId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASAddress) client.invoke(
            'GET', '/addresses/{addressId}', '',
            query, form,
            new Map<String, Object>{
                'addressId' => (Long) params.get('addressId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASAddress.class
        );
    }
    /**
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token. (required)
     * @return List<OASAddress>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASAddress> getOrganizationAddresses(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASAddress>) client.invoke(
            'GET', '/addresses', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASAddress>.class
        );
    }
    /**
     * /contacts/{contact_id}
     * Fetch a contact by its id.
     * @param accessToken Samsara API access token. (required)
     * @param contactId ID of the contact (required)
     * @return OASContact
     * @throws OAS.ApiException if fails to make API call
     */
    public OASContact getOrganizationContact(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('contactId'), 'contactId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASContact) client.invoke(
            'GET', '/contacts/{contact_id}', '',
            query, form,
            new Map<String, Object>{
                'contact_id' => (Long) params.get('contactId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASContact.class
        );
    }
    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     * @return OASVehicleHarshEventResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASVehicleHarshEventResponse getVehicleHarshEvent(Map<String, Object> params) {
        client.assertNotNull(params.get('vehicleId'), 'vehicleId');
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('timestamp'), 'timestamp');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('timestamp', (Long) params.get('timestamp')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASVehicleHarshEventResponse) client.invoke(
            'GET', '/fleet/vehicles/{vehicleId}/safety/harsh_event', '',
            query, form,
            new Map<String, Object>{
                'vehicleId' => (Long) params.get('vehicleId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASVehicleHarshEventResponse.class
        );
    }
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @return List<OASFleetVehicleLocation>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASFleetVehicleLocation> getVehicleLocations(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('vehicleId'), 'vehicleId');
        client.assertNotNull(params.get('startMs'), 'startMs');
        client.assertNotNull(params.get('endMs'), 'endMs');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('startMs', (Long) params.get('startMs')));
        query.addAll(client.makeParam('endMs', (Long) params.get('endMs')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASFleetVehicleLocation>) client.invoke(
            'GET', '/fleet/vehicles/{vehicle_id}/locations', '',
            query, form,
            new Map<String, Object>{
                'vehicle_id' => (Long) params.get('vehicleId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASFleetVehicleLocation>.class
        );
    }
    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return OASVehicleSafetyScoreResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASVehicleSafetyScoreResponse getVehicleSafetyScore(Map<String, Object> params) {
        client.assertNotNull(params.get('vehicleId'), 'vehicleId');
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('startMs'), 'startMs');
        client.assertNotNull(params.get('endMs'), 'endMs');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('startMs', (Long) params.get('startMs')));
        query.addAll(client.makeParam('endMs', (Long) params.get('endMs')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASVehicleSafetyScoreResponse) client.invoke(
            'GET', '/fleet/vehicles/{vehicleId}/safety/score', '',
            query, form,
            new Map<String, Object>{
                'vehicleId' => (Long) params.get('vehicleId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASVehicleSafetyScoreResponse.class
        );
    }
    /**
     * /fleet/vehicles/stats
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query. (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query. (required)
     * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the \&#39;limit\&#39; parameter. Mutually exclusive with \&#39;endingBefore\&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the \&#39;limit\&#39; parameter. Mutually exclusive with \&#39;startingAfter\&#39; parameter. (optional)
     * @param r_limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either \&#39;startingAfter\&#39; or \&#39;endingBefore\&#39;. (optional)
     * @return OASInlineResponse2005
     * @throws OAS.ApiException if fails to make API call
     */
    public OASInlineResponse2005 getVehicleStats(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('startMs'), 'startMs');
        client.assertNotNull(params.get('endMs'), 'endMs');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('startMs', (Integer) params.get('startMs')));
        query.addAll(client.makeParam('endMs', (Integer) params.get('endMs')));
        query.addAll(client.makeParam('series', (String) params.get('series')));
        query.addAll(client.makeParam('tagIds', (String) params.get('tagIds')));
        query.addAll(client.makeParam('startingAfter', (String) params.get('startingAfter')));
        query.addAll(client.makeParam('endingBefore', (String) params.get('endingBefore')));
        query.addAll(client.makeParam('limit', (Long) params.get('r_limit')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASInlineResponse2005) client.invoke(
            'GET', '/fleet/vehicles/stats', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASInlineResponse2005.class
        );
    }
    /**
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @return List<Object>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<Object> getVehiclesLocations(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('startMs'), 'startMs');
        client.assertNotNull(params.get('endMs'), 'endMs');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('startMs', (Integer) params.get('startMs')));
        query.addAll(client.makeParam('endMs', (Integer) params.get('endMs')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<Object>) client.invoke(
            'GET', '/fleet/vehicles/locations', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<Object>.class
        );
    }
    /**
     * /contacts
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token. (required)
     * @return List<OASContact>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASContact> listContacts(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASContact>) client.invoke(
            'GET', '/contacts', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASContact>.class
        );
    }
    /**
     * /fleet/list
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the \&#39;limit\&#39; parameter. Mutually exclusive with \&#39;endingBefore\&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the \&#39;limit\&#39; parameter. Mutually exclusive with \&#39;startingAfter\&#39; parameter. (optional)
     * @param r_limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either \&#39;startingAfter\&#39; or \&#39;endingBefore\&#39;. (optional)
     * @return OASInlineResponse2002
     * @throws OAS.ApiException if fails to make API call
     */
    public OASInlineResponse2002 listFleet(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('groupParam'), 'groupParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));
        query.addAll(client.makeParam('startingAfter', (String) params.get('startingAfter')));
        query.addAll(client.makeParam('endingBefore', (String) params.get('endingBefore')));
        query.addAll(client.makeParam('limit', (Long) params.get('r_limit')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASInlineResponse2002) client.invoke(
            'POST', '/fleet/list',
            (OASInlineObject10) params.get('groupParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASInlineResponse2002.class
        );
    }
    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param data  (required)
     * @return OASFleetVehicleResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASFleetVehicleResponse patchFleetVehicle(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('vehicleIdOrExternalId'), 'vehicleIdOrExternalId');
        client.assertNotNull(params.get('data'), 'data');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASFleetVehicleResponse) client.invoke(
            'PATCH', '/fleet/vehicles/{vehicle_id_or_external_id}',
            (OASInlineObject16) params.get('data'),
            query, form,
            new Map<String, Object>{
                'vehicle_id_or_external_id' => (String) params.get('vehicleIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json', 'application/merge-patch+json' },
            new List<String>(),
            OASFleetVehicleResponse.class
        );
    }
    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam  (required)
     * @return OASDriver
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDriver reactivateDriverById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('driverIdOrExternalId'), 'driverIdOrExternalId');
        client.assertNotNull(params.get('reactivateDriverParam'), 'reactivateDriverParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDriver) client.invoke(
            'PUT', '/fleet/drivers/inactive/{driver_id_or_external_id}',
            (OASInlineObject4) params.get('reactivateDriverParam'),
            query, form,
            new Map<String, Object>{
                'driver_id_or_external_id' => (String) params.get('driverIdOrExternalId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDriver.class
        );
    }
    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Update a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param updateDispatchRouteParams  (required)
     * @return OASDispatchRoute
     * @throws OAS.ApiException if fails to make API call
     */
    public OASDispatchRoute updateDispatchRouteById(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('routeId'), 'routeId');
        client.assertNotNull(params.get('updateDispatchRouteParams'), 'updateDispatchRouteParams');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASDispatchRoute) client.invoke(
            'PUT', '/fleet/dispatch/routes/{route_id}',
            (OASDispatchRoute) params.get('updateDispatchRouteParams'),
            query, form,
            new Map<String, Object>{
                'route_id' => (Long) params.get('routeId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASDispatchRoute.class
        );
    }
    /**
     * /addresses/{addressId}
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param address  (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void updateOrganizationAddress(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('addressId'), 'addressId');
        client.assertNotNull(params.get('address'), 'address');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'PATCH', '/addresses/{addressId}',
            (OASInlineObject1) params.get('address'),
            query, form,
            new Map<String, Object>{
                'addressId' => (Long) params.get('addressId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
    /**
     * /fleet/set_data
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleUpdateParam  (required)
     * @throws OAS.ApiException if fails to make API call
     */
    public void updateVehicles(Map<String, Object> params) {
        client.assertNotNull(params.get('accessToken'), 'accessToken');
        client.assertNotNull(params.get('vehicleUpdateParam'), 'vehicleUpdateParam');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('access_token', (String) params.get('accessToken')));

        List<OAS.Param> form = new List<OAS.Param>();

        client.invoke(
            'POST', '/fleet/set_data',
            (OASInlineObject14) params.get('vehicleUpdateParam'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            null
        );
    }
}
