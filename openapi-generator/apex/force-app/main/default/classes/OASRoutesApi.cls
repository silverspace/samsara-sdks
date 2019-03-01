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

public class OASRoutesApi {
    OASClient client;

    public OASRoutesApi(OASClient client) {
        this.client = client;
    }

    public OASRoutesApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
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
}
